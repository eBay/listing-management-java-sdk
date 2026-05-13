package com.ebay.listingmanagement.clients.graphql;

import com.ebay.listingmanagement.configuration.RequestOptions;
import com.ebay.listingmanagement.graphql.ListingOperations;
import com.ebay.listingmanagement.graphql.types.*;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Typed GraphQL client for Listing Management API operations.
 * Wraps DynamicGraphQLClient with specific typed methods.
 */
public final class ListingGraphQLClient {
    private final DynamicGraphQLClient dynamic;

    public ListingGraphQLClient(DynamicGraphQLClient dynamic) {
        this.dynamic = dynamic;
    }

    // ── Queries ──────────────────────────────────────────────────────────────

    /**
     * Returns auction and bid information for a specified listing.
     *
     * @param input Filter criteria (typed ItemBiddingActivityInput)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with bidding activity data as JsonNode
     */
    public CompletableFuture<JsonNode> itemBiddingActivityAsync(
            ItemBiddingActivityInput input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input.toMap() : Map.of());

            JsonNode data = dynamic.execute(
                ListingOperations.ITEM_BIDDING_ACTIVITY,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("itemBiddingActivity");
        });
    }

    /**
     * Retrieve details of one or more seller listings by listing ID.
     *
     * @param input Filter criteria (typed SellerListingsInput)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with seller listings data as JsonNode
     */
    public CompletableFuture<JsonNode> sellerListingsAsync(
            SellerListingsInput input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input.toMap() : Map.of());

            JsonNode data = dynamic.execute(
                ListingOperations.SELLER_LISTINGS,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("sellerListings");
        });
    }

    /**
     * Search seller's active, ended, and scheduled listings.
     *
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with seller listing search results as JsonNode
     */
    public CompletableFuture<JsonNode> sellerListingSearchAsync(
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            JsonNode data = dynamic.execute(
                ListingOperations.SELLER_LISTING_SEARCH,
                null,
                accessToken,
                requestOptions
            );
            return data.get("sellerListingSearch");
        });
    }

    // ── Mutations ────────────────────────────────────────────────────────────

    /**
     * Bulk update price and/or quantity for fixed-price listing items.
     *
     * @param input Bulk update input (typed BulkUpdateInventoryInput)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with bulk update results as JsonNode
     */
    public CompletableFuture<JsonNode> bulkUpdateInventoryAsync(
            BulkUpdateInventoryInput input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input.toMap() : Map.of());

            JsonNode data = dynamic.execute(
                ListingOperations.BULK_UPDATE_INVENTORY,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("bulkUpdateInventory");
        });
    }

    /**
     * Create a new eBay listing.
     *
     * @param input Create listing input (typed CreateListingInput with raw Map data)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with create listing result as JsonNode
     */
    public CompletableFuture<JsonNode> createListingAsync(
            CreateListingInput input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input.toMap() : Map.of());

            JsonNode data = dynamic.execute(
                ListingOperations.CREATE_LISTING,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("createListing");
        });
    }

    /**
     * Create a Second Chance Offer listing from a recently ended auction.
     *
     * @param input Create second chance listing input (typed CreateSecondChanceListingInput)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with create second chance listing result as JsonNode
     */
    public CompletableFuture<JsonNode> createSecondChanceListingAsync(
            CreateSecondChanceListingInput input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input.toMap() : Map.of());

            JsonNode data = dynamic.execute(
                ListingOperations.CREATE_SECOND_CHANCE_LISTING,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("createSecondChanceListing");
        });
    }

    /**
     * End an active listing before its scheduled end time.
     *
     * @param input End listing input (typed EndListingInput)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with end listing result as JsonNode
     */
    public CompletableFuture<JsonNode> endListingAsync(
            EndListingInput input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input.toMap() : Map.of());

            JsonNode data = dynamic.execute(
                ListingOperations.END_LISTING,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("endListing");
        });
    }

    /**
     * Relist an ended eBay listing.
     *
     * @param input Relist listing input (typed RelistListingInput)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with relist listing result as JsonNode
     */
    public CompletableFuture<JsonNode> relistListingAsync(
            RelistListingInput input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input.toMap() : Map.of());

            JsonNode data = dynamic.execute(
                ListingOperations.RELIST_LISTING,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("relistListing");
        });
    }

    /**
     * Update one or more fields of an active or scheduled listing.
     *
     * @param input Update listing input (typed UpdateListingInput)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with update listing result as JsonNode
     */
    public CompletableFuture<JsonNode> updateListingAsync(
            UpdateListingInput input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input.toMap() : Map.of());

            JsonNode data = dynamic.execute(
                ListingOperations.UPDATE_LISTING,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("updateListing");
        });
    }

    // ── Escape hatch ─────────────────────────────────────────────────────────

    /**
     * Escape hatch — execute any raw GraphQL query.
     *
     * @param query GraphQL query string
     * @param variables Variables map (can be null)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with raw response data as JsonNode
     */
    public CompletableFuture<JsonNode> executeRawAsync(
            String query,
            Map<String, Object> variables,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            dynamic.execute(query, variables, accessToken, requestOptions)
        );
    }
}
