// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.listingmanagement;

import com.ebay.listingmanagement.clients.graphql.ApolloClientFactory;
import com.ebay.listingmanagement.clients.graphql.BearerTokenInterceptor;
import com.ebay.listingmanagement.clients.graphql.DynamicGraphQLClient;
import com.ebay.listingmanagement.clients.graphql.ListingGraphQLClient;
import com.ebay.listingmanagement.clients.rest.FeedClient;
import com.ebay.listingmanagement.clients.rest.InventoryClient;
import com.ebay.listingmanagement.clients.rest.MediaClient;
import com.ebay.listingmanagement.clients.rest.StoresClient;
import com.ebay.listingmanagement.configuration.KiotaAuthProvider;
import com.ebay.listingmanagement.configuration.ListingManagementConfiguration;
import com.ebay.listingmanagement.generated.feed.FeedApiClient;
import com.ebay.listingmanagement.generated.inventory.InventoryApiClient;
import com.ebay.listingmanagement.generated.media.MediaApiClient;
import com.ebay.listingmanagement.generated.stores.StoresApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/**
 * Main facade for the Listing Management SDK.
 */
public final class ListingManagementClient implements Closeable {
    private final OkHttpClient sharedHttpClient;
    private final OkHttpClient apolloHttpClient;

    public final FeedClient feed;
    public final InventoryClient inventory;
    public final MediaClient media;
    public final StoresClient stores;
    public final ListingGraphQLClient graphQL;

    public ListingManagementClient(ListingManagementConfiguration config) {
        this.sharedHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        var feedAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        feedAdapter.setBaseUrl(config.getFeedBaseUrl());
        this.feed = new FeedClient(new FeedApiClient(feedAdapter), config);

        var inventoryAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        inventoryAdapter.setBaseUrl(config.getInventoryBaseUrl());
        this.inventory = new InventoryClient(new InventoryApiClient(inventoryAdapter), config);

        var mediaAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        mediaAdapter.setBaseUrl(config.getMediaBaseUrl());
        this.media = new MediaClient(new MediaApiClient(mediaAdapter), config);

        var storesAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        storesAdapter.setBaseUrl(config.getStoresBaseUrl());
        this.stores = new StoresClient(new StoresApiClient(storesAdapter), config);

        this.apolloHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(new BearerTokenInterceptor(config))
            .build();
        var apolloClient = ApolloClientFactory.create(
            config.getGraphQLBaseUrl(),
            apolloHttpClient
        );

        this.graphQL = new ListingGraphQLClient(
            apolloClient,
            new DynamicGraphQLClient(sharedHttpClient, config),
            config
        );
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
        apolloHttpClient.dispatcher().executorService().shutdown();
        apolloHttpClient.connectionPool().evictAll();
    }
}
