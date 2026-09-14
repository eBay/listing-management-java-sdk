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
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class InventoryClient {
    private final InventoryApiClient kiota;
    private final ListingManagementConfiguration config;

    public InventoryClient(InventoryApiClient kiota, ListingManagementConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    public CompletableFuture<BulkInventoryItemResponse> bulkCreateOrReplaceInventoryItemAsync(
            BulkInventoryItem body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkCreateOrReplaceInventoryItem().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkGetInventoryItemResponse> bulkGetInventoryItemAsync(
            BulkGetInventoryItem body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkGetInventoryItem().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkPriceQuantityResponse> bulkUpdatePriceQuantityAsync(
            BulkPriceQuantity body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkUpdatePriceQuantity().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<InventoryItemWithSkuLocaleGroupid> getInventoryItemAsync(
            String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.inventoryItem().bySku(Params.requireValid("sku", sku)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BaseResponse> createOrReplaceInventoryItemAsync(
            String sku, InventoryItem body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.inventoryItem().bySku(Params.requireValid("sku", sku)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteInventoryItemAsync(
            String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.inventoryItem().bySku(Params.requireValid("sku", sku)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<InventoryItems> getInventoryItemsAsync(
            String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.inventoryItem().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Compatibility> getProductCompatibilityAsync(
            String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.inventoryItem().bySku(Params.requireValid("sku", sku)).productCompatibility().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BaseResponse> createOrReplaceProductCompatibilityAsync(
            String sku, Compatibility body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.inventoryItem().bySku(Params.requireValid("sku", sku)).productCompatibility().put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteProductCompatibilityAsync(
            String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.inventoryItem().bySku(Params.requireValid("sku", sku)).productCompatibility().delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<InventoryItemGroup> getInventoryItemGroupAsync(
            String inventoryItemGroupKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.inventoryItemGroup().byInventoryItemGroupKey(Params.requireValid("inventoryItemGroupKey", inventoryItemGroupKey)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BaseResponse> createOrReplaceInventoryItemGroupAsync(
            String inventoryItemGroupKey, InventoryItemGroup body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.inventoryItemGroup().byInventoryItemGroupKey(Params.requireValid("inventoryItemGroupKey", inventoryItemGroupKey)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteInventoryItemGroupAsync(
            String inventoryItemGroupKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.inventoryItemGroup().byInventoryItemGroupKey(Params.requireValid("inventoryItemGroupKey", inventoryItemGroupKey)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<BulkMigrateListingResponse> bulkMigrateListingAsync(
            BulkMigrateListing body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkMigrateListing().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<LocationMapping> getSkuLocationMappingAsync(
            String listingId, String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.listing().byListingId(Params.requireValid("listingId", listingId)).sku().bySku(Params.requireValid("sku", sku)).locations().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> createOrReplaceSkuLocationMappingAsync(
            String listingId, String sku, LocationMapping body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.listing().byListingId(Params.requireValid("listingId", listingId)).sku().bySku(Params.requireValid("sku", sku)).locations().put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> deleteSkuLocationMappingAsync(
            String listingId, String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.listing().byListingId(Params.requireValid("listingId", listingId)).sku().bySku(Params.requireValid("sku", sku)).locations().delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<BulkOfferResponse> bulkCreateOfferAsync(
            BulkEbayOfferDetailsWithKeys body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkCreateOffer().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkPublishResponse> bulkPublishOfferAsync(
            BulkOffer body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkPublishOffer().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Offers> getOffersAsync(
            String format, String limit, String marketplaceId, String offset, String sku, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.offer().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (format != null) config.queryParameters.format = format;
                if (limit != null) config.queryParameters.limit = limit;
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
                if (offset != null) config.queryParameters.offset = offset;
                if (sku != null) config.queryParameters.sku = sku;
            });
        }));
    }

    public CompletableFuture<OfferResponse> createOfferAsync(
            EbayOfferDetailsWithKeys body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.offer().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<EbayOfferDetailsWithAll> getOfferAsync(
            String offerId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.offer().byOfferId(Params.requireValid("offerId", offerId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<OfferResponse> updateOfferAsync(
            String offerId, EbayOfferDetailsWithId body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.offer().byOfferId(Params.requireValid("offerId", offerId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteOfferAsync(
            String offerId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.offer().byOfferId(Params.requireValid("offerId", offerId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<FeesSummaryResponse> getListingFeesAsync(
            OfferKeysWithId body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.offer().getListingFees().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<PublishResponse> publishOfferAsync(
            String offerId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.offer().byOfferId(Params.requireValid("offerId", offerId)).publish().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<PublishResponse> publishOfferByInventoryItemGroupAsync(
            PublishByInventoryItemGroupRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.offer().publishByInventoryItemGroup().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<WithdrawResponse> withdrawOfferAsync(
            String offerId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.offer().byOfferId(Params.requireValid("offerId", offerId)).withdraw().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> withdrawOfferByInventoryItemGroupAsync(
            WithdrawByInventoryItemGroupRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.offer().withdrawByInventoryItemGroup().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<InventoryLocationResponse> getInventoryLocationAsync(
            String merchantLocationKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.location().byMerchantLocationKey(Params.requireValid("merchantLocationKey", merchantLocationKey)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> createInventoryLocationAsync(
            String merchantLocationKey, InventoryLocationFull body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.location().byMerchantLocationKey(Params.requireValid("merchantLocationKey", merchantLocationKey)).post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> deleteInventoryLocationAsync(
            String merchantLocationKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.location().byMerchantLocationKey(Params.requireValid("merchantLocationKey", merchantLocationKey)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> disableInventoryLocationAsync(
            String merchantLocationKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.location().byMerchantLocationKey(Params.requireValid("merchantLocationKey", merchantLocationKey)).disable().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> enableInventoryLocationAsync(
            String merchantLocationKey, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.location().byMerchantLocationKey(Params.requireValid("merchantLocationKey", merchantLocationKey)).enable().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<LocationResponse> getInventoryLocationsAsync(
            String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.location().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Void> updateInventoryLocationAsync(
            String merchantLocationKey, InventoryLocation body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.location().byMerchantLocationKey(Params.requireValid("merchantLocationKey", merchantLocationKey)).updateLocationDetails().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }
}
