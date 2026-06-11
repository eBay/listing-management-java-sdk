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

package com.ebay.listingmanagement.clients.rest;

import com.ebay.listingmanagement.configuration.ListingManagementConfiguration;
import com.ebay.listingmanagement.configuration.RequestOptions;
import com.ebay.listingmanagement.configuration.TokenContext;
import com.ebay.listingmanagement.generated.inventory.InventoryApiClient;
import com.ebay.listingmanagement.generated.inventory.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Inventory API.
 * Provides methods to manage inventory items, locations, offers, and bulk operations.
 */
public final class InventoryClient {
    private final InventoryApiClient kiota;
    private final ListingManagementConfiguration config;

    public InventoryClient(InventoryApiClient kiota, ListingManagementConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    /**
     * Merges default headers from config with per-call headers.
     * Per-call headers override defaults.
     */
    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    // ── Inventory Items ──────────────────────────────────────────────────────

    /**
     * Get a specific inventory item by SKU.
     */
    public CompletableFuture<InventoryItemWithSkuLocaleGroupid> getInventoryItemAsync(
            String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.inventoryItem().bySku(sku).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Create or replace an inventory item.
     */
    public CompletableFuture<BaseResponse> createOrReplaceInventoryItemAsync(
            String sku, InventoryItem body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.inventoryItem().bySku(sku).put(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Delete an inventory item.
     */
    public CompletableFuture<Void> deleteInventoryItemAsync(
            String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.inventoryItem().bySku(sku).delete(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    /**
     * Get inventory items with pagination.
     */
    public CompletableFuture<InventoryItems> getInventoryItemsAsync(
            String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.inventoryItem().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (limit != null) config.queryParameters.limit = limit;
                    if (offset != null) config.queryParameters.offset = offset;
                });
            })
        );
    }

    /**
     * Bulk get inventory items.
     */
    public CompletableFuture<Object> bulkGetInventoryItemAsync(
            BulkGetInventoryItem body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.bulkGetInventoryItem().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Bulk create or replace inventory items.
     */
    public CompletableFuture<Object> bulkCreateOrReplaceInventoryItemAsync(
            BulkInventoryItem body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.bulkCreateOrReplaceInventoryItem().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    // ── Inventory Item Groups ────────────────────────────────────────────────

    /**
     * Get an inventory item group.
     */
    public CompletableFuture<InventoryItemGroup> getInventoryItemGroupAsync(
            String inventoryItemGroupKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.inventoryItemGroup().byInventoryItemGroupKey(inventoryItemGroupKey).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Create or replace an inventory item group.
     */
    public CompletableFuture<BaseResponse> createOrReplaceInventoryItemGroupAsync(
            String inventoryItemGroupKey, InventoryItemGroup body,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.inventoryItemGroup().byInventoryItemGroupKey(inventoryItemGroupKey).put(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Delete an inventory item group.
     */
    public CompletableFuture<Void> deleteInventoryItemGroupAsync(
            String inventoryItemGroupKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.inventoryItemGroup().byInventoryItemGroupKey(inventoryItemGroupKey).delete(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    // ── Product Compatibility ────────────────────────────────────────────────

    /**
     * Get product compatibility for an inventory item.
     */
    public CompletableFuture<Compatibility> getProductCompatibilityAsync(
            String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.inventoryItem().bySku(sku).productCompatibility().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Create or replace product compatibility.
     */
    public CompletableFuture<BaseResponse> createOrReplaceProductCompatibilityAsync(
            String sku, Compatibility body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.inventoryItem().bySku(sku).productCompatibility().put(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Delete product compatibility.
     */
    public CompletableFuture<Void> deleteProductCompatibilityAsync(
            String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.inventoryItem().bySku(sku).productCompatibility().delete(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    // ── SKU-Location Mapping ─────────────────────────────────────────────────

    /**
     * Get SKU-to-location mapping.
     */
    public CompletableFuture<Object> getSkuLocationMappingAsync(
            String listingId, String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.listing().byListingId(listingId).sku().bySku(sku).locations().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Create or replace SKU-to-location mapping.
     */
    public CompletableFuture<Void> createOrReplaceSkuLocationMappingAsync(
            String listingId, String sku, LocationMapping body,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.runAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.listing().byListingId(listingId).sku().bySku(sku).locations().put(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Delete SKU-to-location mapping.
     */
    public CompletableFuture<Void> deleteSkuLocationMappingAsync(
            String listingId, String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.listing().byListingId(listingId).sku().bySku(sku).locations().delete(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    // ── Inventory Locations ──────────────────────────────────────────────────

    /**
     * Get a specific inventory location.
     */
    public CompletableFuture<InventoryLocationResponse> getInventoryLocationAsync(
            String merchantLocationKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.location().byMerchantLocationKey(merchantLocationKey).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Get inventory locations with pagination.
     */
    public CompletableFuture<LocationResponse> getInventoryLocationsAsync(
            String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.location().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (limit != null) config.queryParameters.limit = limit;
                    if (offset != null) config.queryParameters.offset = offset;
                });
            })
        );
    }

    /**
     * Create an inventory location.
     */
    public CompletableFuture<Void> createInventoryLocationAsync(
            String merchantLocationKey, InventoryLocationFull body,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.location().byMerchantLocationKey(merchantLocationKey).post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    /**
     * Delete an inventory location.
     */
    public CompletableFuture<Void> deleteInventoryLocationAsync(
            String merchantLocationKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.location().byMerchantLocationKey(merchantLocationKey).delete(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    /**
     * Update inventory location details.
     */
    public CompletableFuture<Void> updateInventoryLocationAsync(
            String merchantLocationKey, InventoryLocation body,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.runAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.location().byMerchantLocationKey(merchantLocationKey).updateLocationDetails().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Disable an inventory location.
     */
    public CompletableFuture<Object> disableInventoryLocationAsync(
            String merchantLocationKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.location().byMerchantLocationKey(merchantLocationKey).disable().post(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Enable an inventory location.
     */
    public CompletableFuture<Object> enableInventoryLocationAsync(
            String merchantLocationKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.location().byMerchantLocationKey(merchantLocationKey).enable().post(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    // ── Offers ───────────────────────────────────────────────────────────────

    /**
     * Get a specific offer by ID.
     */
    public CompletableFuture<Object> getOfferAsync(
            String offerId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.offer().byOfferId(offerId).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Get offers with filtering and pagination.
     */
    public CompletableFuture<Offers> getOffersAsync(
            String format, String limit, String marketplaceId, String offset, String sku,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.offer().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (format != null) config.queryParameters.format = format;
                    if (limit != null) config.queryParameters.limit = limit;
                    if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
                    if (offset != null) config.queryParameters.offset = offset;
                    if (sku != null) config.queryParameters.sku = sku;
                });
            })
        );
    }

    /**
     * Create an offer.
     */
    public CompletableFuture<OfferResponse> createOfferAsync(
            EbayOfferDetailsWithKeys body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.offer().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Update an offer.
     */
    public CompletableFuture<Object> updateOfferAsync(
            String offerId, EbayOfferDetailsWithId body,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.offer().byOfferId(offerId).put(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Delete an offer.
     */
    public CompletableFuture<Void> deleteOfferAsync(
            String offerId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.offer().byOfferId(offerId).delete(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    /**
     * Publish an offer.
     */
    public CompletableFuture<PublishResponse> publishOfferAsync(
            String offerId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.offer().byOfferId(offerId).publish().post(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Withdraw an offer.
     */
    public CompletableFuture<WithdrawResponse> withdrawOfferAsync(
            String offerId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.offer().byOfferId(offerId).withdraw().post(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Get listing fees for offers.
     */
    public CompletableFuture<FeesSummaryResponse> getListingFeesAsync(
            OfferKeysWithId body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.offer().getListingFees().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Bulk create offers.
     */
    public CompletableFuture<BulkOfferResponse> bulkCreateOfferAsync(
            BulkEbayOfferDetailsWithKeys body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.bulkCreateOffer().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Bulk publish offers.
     */
    public CompletableFuture<BulkPublishResponse> bulkPublishOfferAsync(
            BulkOffer body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.bulkPublishOffer().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Publish offer by inventory item group.
     */
    public CompletableFuture<PublishResponse> publishOfferByInventoryItemGroupAsync(
            PublishByInventoryItemGroupRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.offer().publishByInventoryItemGroup().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Withdraw offer by inventory item group.
     */
    public CompletableFuture<Void> withdrawOfferByInventoryItemGroupAsync(
            WithdrawByInventoryItemGroupRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.runAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.offer().withdrawByInventoryItemGroup().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    // ── Bulk Operations ──────────────────────────────────────────────────────

    /**
     * Bulk migrate listings.
     */
    public CompletableFuture<Object> bulkMigrateListingAsync(
            BulkMigrateListing body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.bulkMigrateListing().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    /**
     * Bulk update price and quantity.
     */
    public CompletableFuture<Object> bulkUpdatePriceQuantityAsync(
            BulkPriceQuantity body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.bulkUpdatePriceQuantity().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }
}
