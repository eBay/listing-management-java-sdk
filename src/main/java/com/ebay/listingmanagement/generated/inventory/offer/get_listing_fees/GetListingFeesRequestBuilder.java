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

package com.ebay.listingmanagement.generated.inventory.offer.get_listing_fees;

import com.ebay.listingmanagement.generated.inventory.models.Error;
import com.ebay.listingmanagement.generated.inventory.models.FeesSummaryResponse;
import com.ebay.listingmanagement.generated.inventory.models.OfferKeysWithId;
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
 * Builds and executes requests for operations under /offer/get_listing_fees
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetListingFeesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetListingFeesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetListingFeesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer/get_listing_fees", pathParameters);
    }
    /**
     * Instantiates a new {@link GetListingFeesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetListingFeesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer/get_listing_fees", rawUrl);
    }
    /**
     * This call is used to retrieve the expected listing fees for up to 250 unpublished offers. An array of one or more &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.offerkeywithid.offerid&quot; target=&quot;_blank&quot;&gt;&gt;offerId&lt;/a&gt; values are passed in under the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.offerkeyswithid.offers&quot; target=&quot;_blank&quot;&gt;offers&lt;/a&gt; container.&lt;br&gt;&lt;br&gt;In the response payload, all listing fees are grouped by eBay marketplace, and listing fees per offer are not shown. A &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.feesummary.fees&quot; target=&quot;_blank&quot;&gt;fees&lt;/a&gt; container will be returned for each eBay marketplace where the seller is selling the products associated with the specified offers. &lt;br&gt;&lt;br&gt;Errors will occur if the seller passes in &lt;strong&gt;offerIds&lt;/strong&gt; that represent published offers, so this call should be made before the seller publishes offers with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt;.
     * @param body List of offers that needs fee information
     * @return a {@link FeesSummaryResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public FeesSummaryResponse post(@jakarta.annotation.Nonnull final OfferKeysWithId body) {
        return post(body, null);
    }
    /**
     * This call is used to retrieve the expected listing fees for up to 250 unpublished offers. An array of one or more &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.offerkeywithid.offerid&quot; target=&quot;_blank&quot;&gt;&gt;offerId&lt;/a&gt; values are passed in under the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.offerkeyswithid.offers&quot; target=&quot;_blank&quot;&gt;offers&lt;/a&gt; container.&lt;br&gt;&lt;br&gt;In the response payload, all listing fees are grouped by eBay marketplace, and listing fees per offer are not shown. A &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.feesummary.fees&quot; target=&quot;_blank&quot;&gt;fees&lt;/a&gt; container will be returned for each eBay marketplace where the seller is selling the products associated with the specified offers. &lt;br&gt;&lt;br&gt;Errors will occur if the seller passes in &lt;strong&gt;offerIds&lt;/strong&gt; that represent published offers, so this call should be made before the seller publishes offers with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt;.
     * @param body List of offers that needs fee information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link FeesSummaryResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public FeesSummaryResponse post(@jakarta.annotation.Nonnull final OfferKeysWithId body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, FeesSummaryResponse::createFromDiscriminatorValue);
    }
    /**
     * This call is used to retrieve the expected listing fees for up to 250 unpublished offers. An array of one or more &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.offerkeywithid.offerid&quot; target=&quot;_blank&quot;&gt;&gt;offerId&lt;/a&gt; values are passed in under the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.offerkeyswithid.offers&quot; target=&quot;_blank&quot;&gt;offers&lt;/a&gt; container.&lt;br&gt;&lt;br&gt;In the response payload, all listing fees are grouped by eBay marketplace, and listing fees per offer are not shown. A &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.feesummary.fees&quot; target=&quot;_blank&quot;&gt;fees&lt;/a&gt; container will be returned for each eBay marketplace where the seller is selling the products associated with the specified offers. &lt;br&gt;&lt;br&gt;Errors will occur if the seller passes in &lt;strong&gt;offerIds&lt;/strong&gt; that represent published offers, so this call should be made before the seller publishes offers with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt;.
     * @param body List of offers that needs fee information
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OfferKeysWithId body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This call is used to retrieve the expected listing fees for up to 250 unpublished offers. An array of one or more &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.offerkeywithid.offerid&quot; target=&quot;_blank&quot;&gt;&gt;offerId&lt;/a&gt; values are passed in under the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.offerkeyswithid.offers&quot; target=&quot;_blank&quot;&gt;offers&lt;/a&gt; container.&lt;br&gt;&lt;br&gt;In the response payload, all listing fees are grouped by eBay marketplace, and listing fees per offer are not shown. A &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getlistingfees.feesummary.fees&quot; target=&quot;_blank&quot;&gt;fees&lt;/a&gt; container will be returned for each eBay marketplace where the seller is selling the products associated with the specified offers. &lt;br&gt;&lt;br&gt;Errors will occur if the seller passes in &lt;strong&gt;offerIds&lt;/strong&gt; that represent published offers, so this call should be made before the seller publishes offers with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt;.
     * @param body List of offers that needs fee information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OfferKeysWithId body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link GetListingFeesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetListingFeesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetListingFeesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
