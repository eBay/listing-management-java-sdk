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

import com.apollographql.apollo.ApolloClient;
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

/**
 * Main facade for the Listing Management SDK.
 * Provides unified access to Feed, Inventory, Media, and Stores APIs.
 *
 * <pre>{@code
 * var config = new ListingManagementConfiguration();
 * config.setAccessToken("your-token");
 *
 * try (var sdk = new ListingManagementClient(config)) {
 *     var items = sdk.inventory.getInventoryItemsAsync("10", "0", null, null).join();
 *     System.out.println(items);
 * }
 * }</pre>
 */
public final class ListingManagementClient implements Closeable {
    private final OkHttpClient sharedHttpClient;

    public final FeedClient feed;
    public final InventoryClient inventory;
    public final MediaClient media;
    public final StoresClient stores;
    public final ListingGraphQLClient graphQL;

    public ListingManagementClient(ListingManagementConfiguration config) {
        // Shared OkHttpClient for all REST clients
        this.sharedHttpClient = new OkHttpClient.Builder()
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        // Feed API client
        var feedAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        feedAdapter.setBaseUrl(config.getFeedBaseUrl());
        this.feed = new FeedClient(new FeedApiClient(feedAdapter), config);

        // Inventory API client
        var inventoryAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        inventoryAdapter.setBaseUrl(config.getInventoryBaseUrl());
        this.inventory = new InventoryClient(new InventoryApiClient(inventoryAdapter), config);

        // Media API client
        var mediaAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        mediaAdapter.setBaseUrl(config.getMediaBaseUrl());
        this.media = new MediaClient(new MediaApiClient(mediaAdapter), config);

        // Stores API client
        var storesAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        storesAdapter.setBaseUrl(config.getStoresBaseUrl());
        this.stores = new StoresClient(new StoresApiClient(storesAdapter), config);

        // Apollo client with token interceptor for GraphQL
        var apolloHttp = new OkHttpClient.Builder()
            .addInterceptor(new BearerTokenInterceptor(config))
            .build();
        var apolloClient = com.ebay.listingmanagement.clients.graphql.ApolloClientFactory.create(
            config.getGraphQLBaseUrl(),
            apolloHttp
        );

        // GraphQL client (Apollo Kotlin with type safety)
        this.graphQL = new com.ebay.listingmanagement.clients.graphql.ListingGraphQLClient(
            apolloClient,
            new DynamicGraphQLClient(sharedHttpClient, config),
            config
        );
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
    }
}
