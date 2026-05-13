package com.ebay.listingmanagement;

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

        // GraphQL client
        this.graphQL = new ListingGraphQLClient(new DynamicGraphQLClient(sharedHttpClient, config));
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
    }
}
