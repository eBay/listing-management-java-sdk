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

package com.ebay.listingmanagement.generated.inventory.offer.item.withdraw;

import com.ebay.listingmanagement.generated.inventory.models.Error;
import com.ebay.listingmanagement.generated.inventory.models.WithdrawResponse;
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
 * Builds and executes requests for operations under /offer/{offerId}/withdraw
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithdrawRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithdrawRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithdrawRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer/{offerId}/withdraw", pathParameters);
    }
    /**
     * Instantiates a new {@link WithdrawRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithdrawRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer/{offerId}/withdraw", rawUrl);
    }
    /**
     * This call is used to end a single-variation listing that is associated with the specified offer. This call is used in place of the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-deleteoffer&quot; target=&quot;_blank&quot;&gt;deleteOffer&lt;/a&gt; call if the seller only wants to end the listing associated with the offer but does not want to delete the offer object. With this call, the offer object remains, but it goes into the unpublished state, and will require a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt; call to relist the offer.&lt;br&gt;&lt;br&gt;To end a multiple-variation listing that is associated with an inventory item group, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-withdrawofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;withdrawOfferByInventoryItemGroup&lt;/a&gt; method can be used. This call only ends the multiple-variation listing associated with an inventory item group but does not delete the inventory item group object, nor does it delete any of the offers associated with the inventory item group, but instead all of these offers go into the unpublished state.
     * @return a {@link WithdrawResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public WithdrawResponse post() {
        return post(null);
    }
    /**
     * This call is used to end a single-variation listing that is associated with the specified offer. This call is used in place of the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-deleteoffer&quot; target=&quot;_blank&quot;&gt;deleteOffer&lt;/a&gt; call if the seller only wants to end the listing associated with the offer but does not want to delete the offer object. With this call, the offer object remains, but it goes into the unpublished state, and will require a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt; call to relist the offer.&lt;br&gt;&lt;br&gt;To end a multiple-variation listing that is associated with an inventory item group, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-withdrawofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;withdrawOfferByInventoryItemGroup&lt;/a&gt; method can be used. This call only ends the multiple-variation listing associated with an inventory item group but does not delete the inventory item group object, nor does it delete any of the offers associated with the inventory item group, but instead all of these offers go into the unpublished state.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WithdrawResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public WithdrawResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WithdrawResponse::createFromDiscriminatorValue);
    }
    /**
     * This call is used to end a single-variation listing that is associated with the specified offer. This call is used in place of the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-deleteoffer&quot; target=&quot;_blank&quot;&gt;deleteOffer&lt;/a&gt; call if the seller only wants to end the listing associated with the offer but does not want to delete the offer object. With this call, the offer object remains, but it goes into the unpublished state, and will require a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt; call to relist the offer.&lt;br&gt;&lt;br&gt;To end a multiple-variation listing that is associated with an inventory item group, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-withdrawofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;withdrawOfferByInventoryItemGroup&lt;/a&gt; method can be used. This call only ends the multiple-variation listing associated with an inventory item group but does not delete the inventory item group object, nor does it delete any of the offers associated with the inventory item group, but instead all of these offers go into the unpublished state.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This call is used to end a single-variation listing that is associated with the specified offer. This call is used in place of the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-deleteoffer&quot; target=&quot;_blank&quot;&gt;deleteOffer&lt;/a&gt; call if the seller only wants to end the listing associated with the offer but does not want to delete the offer object. With this call, the offer object remains, but it goes into the unpublished state, and will require a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt; call to relist the offer.&lt;br&gt;&lt;br&gt;To end a multiple-variation listing that is associated with an inventory item group, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-withdrawofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;withdrawOfferByInventoryItemGroup&lt;/a&gt; method can be used. This call only ends the multiple-variation listing associated with an inventory item group but does not delete the inventory item group object, nor does it delete any of the offers associated with the inventory item group, but instead all of these offers go into the unpublished state.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithdrawRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithdrawRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithdrawRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
