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

package com.ebay.listingmanagement.generated.inventory.offer.item;

import com.ebay.listingmanagement.generated.inventory.models.EbayOfferDetailsWithAll;
import com.ebay.listingmanagement.generated.inventory.models.EbayOfferDetailsWithId;
import com.ebay.listingmanagement.generated.inventory.models.Error;
import com.ebay.listingmanagement.generated.inventory.models.OfferResponse;
import com.ebay.listingmanagement.generated.inventory.offer.item.publish.PublishRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.offer.item.withdraw.WithdrawRequestBuilder;
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
 * Builds and executes requests for operations under /offer/{offerId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithOfferItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The publish property
     * @return a {@link PublishRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublishRequestBuilder publish() {
        return new PublishRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The withdraw property
     * @return a {@link WithdrawRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithdrawRequestBuilder withdraw() {
        return new WithdrawRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithOfferItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOfferItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer/{offerId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithOfferItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOfferItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer/{offerId}", rawUrl);
    }
    /**
     * If used against an unpublished offer, this call will permanently delete that offer. In the case of a published offer (or live eBay listing), a successful call will either end the single-variation listing associated with the offer, or it will remove that product variation from the eBay listing and also automatically remove that product variation from the inventory item group. In the case of a multiple-variation listing, the &lt;strong&gt;deleteOffer&lt;/strong&gt; will not remove the product variation from the listing if that variation has one or more sales. If that product variation has one or more sales, the seller can alternately just set the available quantity of that product variation to &lt;code&gt;0&lt;/code&gt;, so it is not available in the eBay search or View Item page, and then the seller can remove that product variation from the inventory item group at a later time.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * If used against an unpublished offer, this call will permanently delete that offer. In the case of a published offer (or live eBay listing), a successful call will either end the single-variation listing associated with the offer, or it will remove that product variation from the eBay listing and also automatically remove that product variation from the inventory item group. In the case of a multiple-variation listing, the &lt;strong&gt;deleteOffer&lt;/strong&gt; will not remove the product variation from the listing if that variation has one or more sales. If that product variation has one or more sales, the seller can alternately just set the available quantity of that product variation to &lt;code&gt;0&lt;/code&gt;, so it is not available in the eBay search or View Item page, and then the seller can remove that product variation from the inventory item group at a later time.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This call retrieves a specific published or unpublished offer. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
     * @return a {@link EbayOfferDetailsWithAll}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public EbayOfferDetailsWithAll get() {
        return get(null);
    }
    /**
     * This call retrieves a specific published or unpublished offer. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EbayOfferDetailsWithAll}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public EbayOfferDetailsWithAll get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EbayOfferDetailsWithAll::createFromDiscriminatorValue);
    }
    /**
     * This call updates an existing offer. An existing offer may be in published state (active eBay listing), or in an unpublished state and yet to be published with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt; call. The unique identifier (&lt;strong&gt;offerId&lt;/strong&gt;) for the offer to update is passed in at the end of the call URI. &lt;br&gt;&lt;br&gt;The &lt;strong&gt;updateOffer&lt;/strong&gt; call does a complete replacement of the existing offer object, so all fields that make up the current offer object are required, regardless of whether their values changed. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that is required before an unpublished offer can be published or before a published offer can be revised include: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt;  &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted from both the &lt;strong&gt;updateOffer&lt;/strong&gt; and the &lt;strong&gt;createOffer&lt;/strong&gt; calls. If a value is specified in the &lt;strong&gt;updateOffer&lt;/strong&gt; call, this value will be used.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;For published offers, the &lt;strong&gt;listingDescription&lt;/strong&gt; field is also required to update the offer/eBay listing. For unpublished offers, this field is not necessarily required unless it is already set for the unpublished offer.&lt;/p&gt;
     * @param body Details of the offer for the channel
     * @return a {@link OfferResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public OfferResponse put(@jakarta.annotation.Nonnull final EbayOfferDetailsWithId body) {
        return put(body, null);
    }
    /**
     * This call updates an existing offer. An existing offer may be in published state (active eBay listing), or in an unpublished state and yet to be published with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt; call. The unique identifier (&lt;strong&gt;offerId&lt;/strong&gt;) for the offer to update is passed in at the end of the call URI. &lt;br&gt;&lt;br&gt;The &lt;strong&gt;updateOffer&lt;/strong&gt; call does a complete replacement of the existing offer object, so all fields that make up the current offer object are required, regardless of whether their values changed. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that is required before an unpublished offer can be published or before a published offer can be revised include: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt;  &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted from both the &lt;strong&gt;updateOffer&lt;/strong&gt; and the &lt;strong&gt;createOffer&lt;/strong&gt; calls. If a value is specified in the &lt;strong&gt;updateOffer&lt;/strong&gt; call, this value will be used.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;For published offers, the &lt;strong&gt;listingDescription&lt;/strong&gt; field is also required to update the offer/eBay listing. For unpublished offers, this field is not necessarily required unless it is already set for the unpublished offer.&lt;/p&gt;
     * @param body Details of the offer for the channel
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OfferResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public OfferResponse put(@jakarta.annotation.Nonnull final EbayOfferDetailsWithId body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OfferResponse::createFromDiscriminatorValue);
    }
    /**
     * If used against an unpublished offer, this call will permanently delete that offer. In the case of a published offer (or live eBay listing), a successful call will either end the single-variation listing associated with the offer, or it will remove that product variation from the eBay listing and also automatically remove that product variation from the inventory item group. In the case of a multiple-variation listing, the &lt;strong&gt;deleteOffer&lt;/strong&gt; will not remove the product variation from the listing if that variation has one or more sales. If that product variation has one or more sales, the seller can alternately just set the available quantity of that product variation to &lt;code&gt;0&lt;/code&gt;, so it is not available in the eBay search or View Item page, and then the seller can remove that product variation from the inventory item group at a later time.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * If used against an unpublished offer, this call will permanently delete that offer. In the case of a published offer (or live eBay listing), a successful call will either end the single-variation listing associated with the offer, or it will remove that product variation from the eBay listing and also automatically remove that product variation from the inventory item group. In the case of a multiple-variation listing, the &lt;strong&gt;deleteOffer&lt;/strong&gt; will not remove the product variation from the listing if that variation has one or more sales. If that product variation has one or more sales, the seller can alternately just set the available quantity of that product variation to &lt;code&gt;0&lt;/code&gt;, so it is not available in the eBay search or View Item page, and then the seller can remove that product variation from the inventory item group at a later time.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This call retrieves a specific published or unpublished offer. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves a specific published or unpublished offer. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This call updates an existing offer. An existing offer may be in published state (active eBay listing), or in an unpublished state and yet to be published with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt; call. The unique identifier (&lt;strong&gt;offerId&lt;/strong&gt;) for the offer to update is passed in at the end of the call URI. &lt;br&gt;&lt;br&gt;The &lt;strong&gt;updateOffer&lt;/strong&gt; call does a complete replacement of the existing offer object, so all fields that make up the current offer object are required, regardless of whether their values changed. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that is required before an unpublished offer can be published or before a published offer can be revised include: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt;  &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted from both the &lt;strong&gt;updateOffer&lt;/strong&gt; and the &lt;strong&gt;createOffer&lt;/strong&gt; calls. If a value is specified in the &lt;strong&gt;updateOffer&lt;/strong&gt; call, this value will be used.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;For published offers, the &lt;strong&gt;listingDescription&lt;/strong&gt; field is also required to update the offer/eBay listing. For unpublished offers, this field is not necessarily required unless it is already set for the unpublished offer.&lt;/p&gt;
     * @param body Details of the offer for the channel
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final EbayOfferDetailsWithId body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This call updates an existing offer. An existing offer may be in published state (active eBay listing), or in an unpublished state and yet to be published with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishoffer&quot; target=&quot;_blank&quot;&gt;publishOffer&lt;/a&gt; call. The unique identifier (&lt;strong&gt;offerId&lt;/strong&gt;) for the offer to update is passed in at the end of the call URI. &lt;br&gt;&lt;br&gt;The &lt;strong&gt;updateOffer&lt;/strong&gt; call does a complete replacement of the existing offer object, so all fields that make up the current offer object are required, regardless of whether their values changed. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that is required before an unpublished offer can be published or before a published offer can be revised include: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt;  &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted from both the &lt;strong&gt;updateOffer&lt;/strong&gt; and the &lt;strong&gt;createOffer&lt;/strong&gt; calls. If a value is specified in the &lt;strong&gt;updateOffer&lt;/strong&gt; call, this value will be used.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;For published offers, the &lt;strong&gt;listingDescription&lt;/strong&gt; field is also required to update the offer/eBay listing. For unpublished offers, this field is not necessarily required unless it is already set for the unpublished offer.&lt;/p&gt;
     * @param body Details of the offer for the channel
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final EbayOfferDetailsWithId body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithOfferItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithOfferItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithOfferItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
