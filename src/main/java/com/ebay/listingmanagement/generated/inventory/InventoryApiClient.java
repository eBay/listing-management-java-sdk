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

package com.ebay.listingmanagement.generated.inventory;

import com.ebay.listingmanagement.generated.inventory.bulk_create_offer.BulkCreateOfferRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.bulk_create_or_replace_inventory_item.BulkCreateOrReplaceInventoryItemRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.bulk_get_inventory_item.BulkGetInventoryItemRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.bulk_migrate_listing.BulkMigrateListingRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.bulk_publish_offer.BulkPublishOfferRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.bulk_update_price_quantity.BulkUpdatePriceQuantityRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.inventory_item_group.InventoryItemGroupRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.inventory_item.InventoryItemRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.listing.ListingRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.location.LocationRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.offer.OfferRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryApiClient extends BaseRequestBuilder {
    /**
     * The bulk_create_offer property
     * @return a {@link BulkCreateOfferRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateOfferRequestBuilder bulkCreateOffer() {
        return new BulkCreateOfferRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_create_or_replace_inventory_item property
     * @return a {@link BulkCreateOrReplaceInventoryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateOrReplaceInventoryItemRequestBuilder bulkCreateOrReplaceInventoryItem() {
        return new BulkCreateOrReplaceInventoryItemRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_get_inventory_item property
     * @return a {@link BulkGetInventoryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkGetInventoryItemRequestBuilder bulkGetInventoryItem() {
        return new BulkGetInventoryItemRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_migrate_listing property
     * @return a {@link BulkMigrateListingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkMigrateListingRequestBuilder bulkMigrateListing() {
        return new BulkMigrateListingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_publish_offer property
     * @return a {@link BulkPublishOfferRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkPublishOfferRequestBuilder bulkPublishOffer() {
        return new BulkPublishOfferRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_update_price_quantity property
     * @return a {@link BulkUpdatePriceQuantityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdatePriceQuantityRequestBuilder bulkUpdatePriceQuantity() {
        return new BulkUpdatePriceQuantityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The inventory_item property
     * @return a {@link InventoryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InventoryItemRequestBuilder inventoryItem() {
        return new InventoryItemRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The inventory_item_group property
     * @return a {@link InventoryItemGroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InventoryItemGroupRequestBuilder inventoryItemGroup() {
        return new InventoryItemGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The listing property
     * @return a {@link ListingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ListingRequestBuilder listing() {
        return new ListingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The location property
     * @return a {@link LocationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LocationRequestBuilder location() {
        return new LocationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The offer property
     * @return a {@link OfferRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OfferRequestBuilder offer() {
        return new OfferRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link InventoryApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InventoryApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
