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

package com.ebay.listingmanagement.generated.inventory.bulk_create_offer;

import com.ebay.listingmanagement.generated.inventory.models.BulkEbayOfferDetailsWithKeys;
import com.ebay.listingmanagement.generated.inventory.models.BulkOfferResponse;
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
 * Builds and executes requests for operations under /bulk_create_offer
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkCreateOfferRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkCreateOfferRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkCreateOfferRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_create_offer", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkCreateOfferRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkCreateOfferRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_create_offer", rawUrl);
    }
    /**
     * This call creates multiple offers (up to 25) for specific inventory items on a specific eBay marketplace. Although it is not a requirement for the seller to create complete offers (with all necessary details) right from the start, eBay recommends that the seller provide all necessary details with this call since there is currently no bulk operation available to update multiple offers with one call. The following fields are always required in the request payload:  &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.sku&quot; target=&quot;_blank&quot;&gt;sku&lt;/a&gt;, &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.marketplaceid&quot; target=&quot;_blank&quot;&gt;marketplaceId&lt;/a&gt;, and (listing) &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.format&quot; target=&quot;_blank&quot;&gt;format&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that will be required before a offer can be published are highlighted below: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.includecatalogproductdetails&quot; target=&quot;_blank&quot;&gt;includeCatalogProductDetails&lt;/a&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;If the call is successful, unique &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.offerskuresponse.offerid&quot; target=&quot;_blank&quot;&gt;offerId&lt;/a&gt; values are returned in the response for each successfully created offer. The &lt;strong&gt;offerId&lt;/strong&gt; value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run either the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt;, &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkpublishoffer&quot; target=&quot;_blank&quot;&gt;bulkPublishOffer&lt;/a&gt;, or &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;publishOfferByInventoryItemGroup&lt;/a&gt; call to convert offer(s) into an active single- or multiple-variation listing.&lt;/p&gt;&lt;p&gt;For those who prefer to create a single offer per call, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-createoffer&quot; target=&quot;_blank&quot;&gt;createOffer&lt;/a&gt; method can be used instead.&lt;/p&gt;
     * @param body Details of the offer for the channel
     * @return a {@link BulkOfferResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BulkOfferResponse post(@jakarta.annotation.Nonnull final BulkEbayOfferDetailsWithKeys body) {
        return post(body, null);
    }
    /**
     * This call creates multiple offers (up to 25) for specific inventory items on a specific eBay marketplace. Although it is not a requirement for the seller to create complete offers (with all necessary details) right from the start, eBay recommends that the seller provide all necessary details with this call since there is currently no bulk operation available to update multiple offers with one call. The following fields are always required in the request payload:  &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.sku&quot; target=&quot;_blank&quot;&gt;sku&lt;/a&gt;, &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.marketplaceid&quot; target=&quot;_blank&quot;&gt;marketplaceId&lt;/a&gt;, and (listing) &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.format&quot; target=&quot;_blank&quot;&gt;format&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that will be required before a offer can be published are highlighted below: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.includecatalogproductdetails&quot; target=&quot;_blank&quot;&gt;includeCatalogProductDetails&lt;/a&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;If the call is successful, unique &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.offerskuresponse.offerid&quot; target=&quot;_blank&quot;&gt;offerId&lt;/a&gt; values are returned in the response for each successfully created offer. The &lt;strong&gt;offerId&lt;/strong&gt; value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run either the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt;, &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkpublishoffer&quot; target=&quot;_blank&quot;&gt;bulkPublishOffer&lt;/a&gt;, or &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;publishOfferByInventoryItemGroup&lt;/a&gt; call to convert offer(s) into an active single- or multiple-variation listing.&lt;/p&gt;&lt;p&gt;For those who prefer to create a single offer per call, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-createoffer&quot; target=&quot;_blank&quot;&gt;createOffer&lt;/a&gt; method can be used instead.&lt;/p&gt;
     * @param body Details of the offer for the channel
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkOfferResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BulkOfferResponse post(@jakarta.annotation.Nonnull final BulkEbayOfferDetailsWithKeys body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BulkOfferResponse::createFromDiscriminatorValue);
    }
    /**
     * This call creates multiple offers (up to 25) for specific inventory items on a specific eBay marketplace. Although it is not a requirement for the seller to create complete offers (with all necessary details) right from the start, eBay recommends that the seller provide all necessary details with this call since there is currently no bulk operation available to update multiple offers with one call. The following fields are always required in the request payload:  &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.sku&quot; target=&quot;_blank&quot;&gt;sku&lt;/a&gt;, &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.marketplaceid&quot; target=&quot;_blank&quot;&gt;marketplaceId&lt;/a&gt;, and (listing) &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.format&quot; target=&quot;_blank&quot;&gt;format&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that will be required before a offer can be published are highlighted below: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.includecatalogproductdetails&quot; target=&quot;_blank&quot;&gt;includeCatalogProductDetails&lt;/a&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;If the call is successful, unique &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.offerskuresponse.offerid&quot; target=&quot;_blank&quot;&gt;offerId&lt;/a&gt; values are returned in the response for each successfully created offer. The &lt;strong&gt;offerId&lt;/strong&gt; value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run either the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt;, &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkpublishoffer&quot; target=&quot;_blank&quot;&gt;bulkPublishOffer&lt;/a&gt;, or &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;publishOfferByInventoryItemGroup&lt;/a&gt; call to convert offer(s) into an active single- or multiple-variation listing.&lt;/p&gt;&lt;p&gt;For those who prefer to create a single offer per call, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-createoffer&quot; target=&quot;_blank&quot;&gt;createOffer&lt;/a&gt; method can be used instead.&lt;/p&gt;
     * @param body Details of the offer for the channel
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkEbayOfferDetailsWithKeys body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This call creates multiple offers (up to 25) for specific inventory items on a specific eBay marketplace. Although it is not a requirement for the seller to create complete offers (with all necessary details) right from the start, eBay recommends that the seller provide all necessary details with this call since there is currently no bulk operation available to update multiple offers with one call. The following fields are always required in the request payload:  &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.sku&quot; target=&quot;_blank&quot;&gt;sku&lt;/a&gt;, &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.marketplaceid&quot; target=&quot;_blank&quot;&gt;marketplaceId&lt;/a&gt;, and (listing) &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.format&quot; target=&quot;_blank&quot;&gt;format&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that will be required before a offer can be published are highlighted below: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.ebayofferdetailswithkeys.includecatalogproductdetails&quot; target=&quot;_blank&quot;&gt;includeCatalogProductDetails&lt;/a&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;If the call is successful, unique &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkcreateoffer.offerskuresponse.offerid&quot; target=&quot;_blank&quot;&gt;offerId&lt;/a&gt; values are returned in the response for each successfully created offer. The &lt;strong&gt;offerId&lt;/strong&gt; value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run either the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt;, &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkpublishoffer&quot; target=&quot;_blank&quot;&gt;bulkPublishOffer&lt;/a&gt;, or &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;publishOfferByInventoryItemGroup&lt;/a&gt; call to convert offer(s) into an active single- or multiple-variation listing.&lt;/p&gt;&lt;p&gt;For those who prefer to create a single offer per call, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-createoffer&quot; target=&quot;_blank&quot;&gt;createOffer&lt;/a&gt; method can be used instead.&lt;/p&gt;
     * @param body Details of the offer for the channel
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkEbayOfferDetailsWithKeys body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BulkCreateOfferRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateOfferRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkCreateOfferRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
