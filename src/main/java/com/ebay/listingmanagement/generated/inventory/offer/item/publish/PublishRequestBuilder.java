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

package com.ebay.listingmanagement.generated.inventory.offer.item.publish;

import com.ebay.listingmanagement.generated.inventory.models.Error;
import com.ebay.listingmanagement.generated.inventory.models.PublishResponse;
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
 * Builds and executes requests for operations under /offer/{offerId}/publish
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PublishRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link PublishRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PublishRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer/{offerId}/publish", pathParameters);
    }
    /**
     * Instantiates a new {@link PublishRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PublishRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer/{offerId}/publish", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call is used to convert an unpublished offer into a published offer, or live eBay listing. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling the create or update methods, but become required when publishing the offer to create active listings. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;For those who prefer to publish multiple offers (up to 25 at a time) with one call, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkpublishoffer&quot; target=&quot;_blank&quot;&gt;bulkPublishOffer&lt;/a&gt; method can be used. In the case of a multiple-variation listing, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;publishOfferByInventoryItemGroup&lt;/a&gt; call should be used instead, as this call will convert all unpublished offers associated with an inventory item group into a multiple-variation listing.
     * @return a {@link PublishResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PublishResponse post() {
        return post(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call is used to convert an unpublished offer into a published offer, or live eBay listing. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling the create or update methods, but become required when publishing the offer to create active listings. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;For those who prefer to publish multiple offers (up to 25 at a time) with one call, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkpublishoffer&quot; target=&quot;_blank&quot;&gt;bulkPublishOffer&lt;/a&gt; method can be used. In the case of a multiple-variation listing, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;publishOfferByInventoryItemGroup&lt;/a&gt; call should be used instead, as this call will convert all unpublished offers associated with an inventory item group into a multiple-variation listing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PublishResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PublishResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PublishResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call is used to convert an unpublished offer into a published offer, or live eBay listing. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling the create or update methods, but become required when publishing the offer to create active listings. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;For those who prefer to publish multiple offers (up to 25 at a time) with one call, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkpublishoffer&quot; target=&quot;_blank&quot;&gt;bulkPublishOffer&lt;/a&gt; method can be used. In the case of a multiple-variation listing, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;publishOfferByInventoryItemGroup&lt;/a&gt; call should be used instead, as this call will convert all unpublished offers associated with an inventory item group into a multiple-variation listing.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call is used to convert an unpublished offer into a published offer, or live eBay listing. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling the create or update methods, but become required when publishing the offer to create active listings. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;For those who prefer to publish multiple offers (up to 25 at a time) with one call, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-bulkpublishoffer&quot; target=&quot;_blank&quot;&gt;bulkPublishOffer&lt;/a&gt; method can be used. In the case of a multiple-variation listing, the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;publishOfferByInventoryItemGroup&lt;/a&gt; call should be used instead, as this call will convert all unpublished offers associated with an inventory item group into a multiple-variation listing.
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
     * @return a {@link PublishRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublishRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PublishRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
