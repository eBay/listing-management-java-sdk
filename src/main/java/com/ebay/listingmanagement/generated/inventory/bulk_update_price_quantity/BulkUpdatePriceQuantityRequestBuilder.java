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

package com.ebay.listingmanagement.generated.inventory.bulk_update_price_quantity;

import com.ebay.listingmanagement.generated.inventory.models.BulkPriceQuantity;
import com.ebay.listingmanagement.generated.inventory.models.BulkPriceQuantityResponse;
import com.ebay.listingmanagement.generated.inventory.models.Error;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /bulk_update_price_quantity
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkUpdatePriceQuantityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkUpdatePriceQuantityRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpdatePriceQuantityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_update_price_quantity", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkUpdatePriceQuantityRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpdatePriceQuantityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_update_price_quantity", rawUrl);
    }
    /**
     * This call is used by the seller to update the total ship-to-home quantity of one inventory item, and/or to update the price and/or quantity of one or more offers associated with one inventory item. Up to 25 offers associated with an inventory item may be updated with one &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call. Only one SKU (one product) can be updated per call.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; header.&lt;/span&gt;&lt;br&gt;The &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; call can be used to retrieve all offers associated with a SKU. The seller will just pass in the correct SKU value through the &lt;strong&gt;sku&lt;/strong&gt; query parameter. To update an offer, the &lt;strong&gt;offerId&lt;/strong&gt; value is required, and this value is returned in the &lt;strong&gt;getOffers&lt;/strong&gt; call response. It is also useful to know which offers are unpublished and which ones are published. To get this status, look for the &lt;strong&gt;status&lt;/strong&gt; value in the &lt;strong&gt;getOffers&lt;/strong&gt; call response. Offers in the published state are live eBay listings, and these listings will be revised with a successful &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;An issue will occur if duplicate &lt;strong&gt;offerId&lt;/strong&gt; values are passed through the same &lt;strong&gt;offers&lt;/strong&gt; container, or if one or more of the specified offers are associated with different products/SKUs.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For multiple-variation listings, it is recommended that the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-bulkupdatepricequantity&quot; target=&quot;_blank&quot;&gt;bulkUpdatePriceQuantity&lt;/a&gt; call be used to update price and quantity information for each SKU within that multiple-variation listing instead of using &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-createorreplaceinventoryitem&quot; target=&quot;_blank&quot;&gt;createOrReplaceInventoryItem&lt;/a&gt; calls to update the price and quantity for each SKU. Just remember that only one SKU (one product variation) can be updated per call.&lt;/span&gt;&lt;/p&gt;
     * @param body Price and allocation details for the given SKU and Marketplace
     * @return a {@link BulkPriceQuantityResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BulkPriceQuantityResponse post(@jakarta.annotation.Nonnull final BulkPriceQuantity body) {
        return post(body, null);
    }
    /**
     * This call is used by the seller to update the total ship-to-home quantity of one inventory item, and/or to update the price and/or quantity of one or more offers associated with one inventory item. Up to 25 offers associated with an inventory item may be updated with one &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call. Only one SKU (one product) can be updated per call.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; header.&lt;/span&gt;&lt;br&gt;The &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; call can be used to retrieve all offers associated with a SKU. The seller will just pass in the correct SKU value through the &lt;strong&gt;sku&lt;/strong&gt; query parameter. To update an offer, the &lt;strong&gt;offerId&lt;/strong&gt; value is required, and this value is returned in the &lt;strong&gt;getOffers&lt;/strong&gt; call response. It is also useful to know which offers are unpublished and which ones are published. To get this status, look for the &lt;strong&gt;status&lt;/strong&gt; value in the &lt;strong&gt;getOffers&lt;/strong&gt; call response. Offers in the published state are live eBay listings, and these listings will be revised with a successful &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;An issue will occur if duplicate &lt;strong&gt;offerId&lt;/strong&gt; values are passed through the same &lt;strong&gt;offers&lt;/strong&gt; container, or if one or more of the specified offers are associated with different products/SKUs.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For multiple-variation listings, it is recommended that the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-bulkupdatepricequantity&quot; target=&quot;_blank&quot;&gt;bulkUpdatePriceQuantity&lt;/a&gt; call be used to update price and quantity information for each SKU within that multiple-variation listing instead of using &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-createorreplaceinventoryitem&quot; target=&quot;_blank&quot;&gt;createOrReplaceInventoryItem&lt;/a&gt; calls to update the price and quantity for each SKU. Just remember that only one SKU (one product variation) can be updated per call.&lt;/span&gt;&lt;/p&gt;
     * @param body Price and allocation details for the given SKU and Marketplace
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkPriceQuantityResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BulkPriceQuantityResponse post(@jakarta.annotation.Nonnull final BulkPriceQuantity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BulkPriceQuantityResponse::createFromDiscriminatorValue);
    }
    /**
     * This call is used by the seller to update the total ship-to-home quantity of one inventory item, and/or to update the price and/or quantity of one or more offers associated with one inventory item. Up to 25 offers associated with an inventory item may be updated with one &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call. Only one SKU (one product) can be updated per call.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; header.&lt;/span&gt;&lt;br&gt;The &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; call can be used to retrieve all offers associated with a SKU. The seller will just pass in the correct SKU value through the &lt;strong&gt;sku&lt;/strong&gt; query parameter. To update an offer, the &lt;strong&gt;offerId&lt;/strong&gt; value is required, and this value is returned in the &lt;strong&gt;getOffers&lt;/strong&gt; call response. It is also useful to know which offers are unpublished and which ones are published. To get this status, look for the &lt;strong&gt;status&lt;/strong&gt; value in the &lt;strong&gt;getOffers&lt;/strong&gt; call response. Offers in the published state are live eBay listings, and these listings will be revised with a successful &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;An issue will occur if duplicate &lt;strong&gt;offerId&lt;/strong&gt; values are passed through the same &lt;strong&gt;offers&lt;/strong&gt; container, or if one or more of the specified offers are associated with different products/SKUs.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For multiple-variation listings, it is recommended that the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-bulkupdatepricequantity&quot; target=&quot;_blank&quot;&gt;bulkUpdatePriceQuantity&lt;/a&gt; call be used to update price and quantity information for each SKU within that multiple-variation listing instead of using &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-createorreplaceinventoryitem&quot; target=&quot;_blank&quot;&gt;createOrReplaceInventoryItem&lt;/a&gt; calls to update the price and quantity for each SKU. Just remember that only one SKU (one product variation) can be updated per call.&lt;/span&gt;&lt;/p&gt;
     * @param body Price and allocation details for the given SKU and Marketplace
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkPriceQuantity body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This call is used by the seller to update the total ship-to-home quantity of one inventory item, and/or to update the price and/or quantity of one or more offers associated with one inventory item. Up to 25 offers associated with an inventory item may be updated with one &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call. Only one SKU (one product) can be updated per call.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; header.&lt;/span&gt;&lt;br&gt;The &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; call can be used to retrieve all offers associated with a SKU. The seller will just pass in the correct SKU value through the &lt;strong&gt;sku&lt;/strong&gt; query parameter. To update an offer, the &lt;strong&gt;offerId&lt;/strong&gt; value is required, and this value is returned in the &lt;strong&gt;getOffers&lt;/strong&gt; call response. It is also useful to know which offers are unpublished and which ones are published. To get this status, look for the &lt;strong&gt;status&lt;/strong&gt; value in the &lt;strong&gt;getOffers&lt;/strong&gt; call response. Offers in the published state are live eBay listings, and these listings will be revised with a successful &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;An issue will occur if duplicate &lt;strong&gt;offerId&lt;/strong&gt; values are passed through the same &lt;strong&gt;offers&lt;/strong&gt; container, or if one or more of the specified offers are associated with different products/SKUs.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For multiple-variation listings, it is recommended that the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-bulkupdatepricequantity&quot; target=&quot;_blank&quot;&gt;bulkUpdatePriceQuantity&lt;/a&gt; call be used to update price and quantity information for each SKU within that multiple-variation listing instead of using &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-createorreplaceinventoryitem&quot; target=&quot;_blank&quot;&gt;createOrReplaceInventoryItem&lt;/a&gt; calls to update the price and quantity for each SKU. Just remember that only one SKU (one product variation) can be updated per call.&lt;/span&gt;&lt;/p&gt;
     * @param body Price and allocation details for the given SKU and Marketplace
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkPriceQuantity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link BulkUpdatePriceQuantityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdatePriceQuantityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkUpdatePriceQuantityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
