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

package com.ebay.listingmanagement.generated.inventory.inventory_item_group;

import com.ebay.listingmanagement.generated.inventory.inventory_item_group.item.WithInventoryItemGroupKeyItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /inventory_item_group
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryItemGroupRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.inventory.inventory_item_group.item collection
     * @param inventoryItemGroupKey This path parameter specifies the unique identifier of the inventory item group being retrieved. This value is assigned by the seller when an inventory item group is created.
     * @return a {@link WithInventoryItemGroupKeyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithInventoryItemGroupKeyItemRequestBuilder byInventoryItemGroupKey(@jakarta.annotation.Nonnull final String inventoryItemGroupKey) {
        Objects.requireNonNull(inventoryItemGroupKey);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("inventoryItemGroupKey", inventoryItemGroupKey);
        return new WithInventoryItemGroupKeyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link InventoryItemGroupRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InventoryItemGroupRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_item_group", pathParameters);
    }
    /**
     * Instantiates a new {@link InventoryItemGroupRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InventoryItemGroupRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_item_group", rawUrl);
    }
}
