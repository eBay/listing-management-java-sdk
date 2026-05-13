package com.ebay.listingmanagement.generated.inventory.offer;

import com.ebay.listingmanagement.generated.inventory.models.EbayOfferDetailsWithKeys;
import com.ebay.listingmanagement.generated.inventory.models.OfferResponse;
import com.ebay.listingmanagement.generated.inventory.models.Offers;
import com.ebay.listingmanagement.generated.inventory.offer.get_listing_fees.GetListingFeesRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.offer.item.WithOfferItemRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.offer.publish_by_inventory_item_group.PublishByInventoryItemGroupRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.offer.withdraw_by_inventory_item_group.WithdrawByInventoryItemGroupRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /offer
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OfferRequestBuilder extends BaseRequestBuilder {
    /**
     * The get_listing_fees property
     * @return a {@link GetListingFeesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetListingFeesRequestBuilder getListingFees() {
        return new GetListingFeesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The publish_by_inventory_item_group property
     * @return a {@link PublishByInventoryItemGroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublishByInventoryItemGroupRequestBuilder publishByInventoryItemGroup() {
        return new PublishByInventoryItemGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The withdraw_by_inventory_item_group property
     * @return a {@link WithdrawByInventoryItemGroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithdrawByInventoryItemGroupRequestBuilder withdrawByInventoryItemGroup() {
        return new WithdrawByInventoryItemGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.inventory.offer.item collection
     * @param offerId This path parameter specifies the unique identifier of the offer that is to be retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot;&gt;getOffers&lt;/a&gt; method to retrieve offer IDs.
     * @return a {@link WithOfferItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithOfferItemRequestBuilder byOfferId(@jakarta.annotation.Nonnull final String offerId) {
        Objects.requireNonNull(offerId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("offerId", offerId);
        return new WithOfferItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link OfferRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OfferRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer{?format*,limit*,marketplace_id*,offset*,sku*}", pathParameters);
    }
    /**
     * Instantiates a new {@link OfferRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OfferRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer{?format*,limit*,marketplace_id*,offset*,sku*}", rawUrl);
    }
    /**
     * This call retrieves all existing offers for the specified SKU value. The seller has the option of limiting the offers that are retrieved to a specific eBay marketplace, or to a listing format.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the same SKU value can not be offered across multiple eBay marketplaces, so the &lt;strong&gt;marketplace_id&lt;/strong&gt; query parameter currently does not have any practical use for this call.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The same SKU can be offered through an auction and a fixed-price listing concurrently. If this is the case, &lt;b&gt;getOffers&lt;/b&gt; will return two offers. Otherwise, only one offer will be returned.&lt;/span&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.
     * @return a {@link Offers}
     */
    @jakarta.annotation.Nullable
    public Offers get() {
        return get(null);
    }
    /**
     * This call retrieves all existing offers for the specified SKU value. The seller has the option of limiting the offers that are retrieved to a specific eBay marketplace, or to a listing format.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the same SKU value can not be offered across multiple eBay marketplaces, so the &lt;strong&gt;marketplace_id&lt;/strong&gt; query parameter currently does not have any practical use for this call.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The same SKU can be offered through an auction and a fixed-price listing concurrently. If this is the case, &lt;b&gt;getOffers&lt;/b&gt; will return two offers. Otherwise, only one offer will be returned.&lt;/span&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Offers}
     */
    @jakarta.annotation.Nullable
    public Offers get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Offers::createFromDiscriminatorValue);
    }
    /**
     * This call creates an offer for a specific inventory item on a specific eBay marketplace. It is up to the sellers whether they want to create a complete offer (with all necessary details) right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOffer&lt;/strong&gt; call, and then make one or more subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; calls to complete the offer and prepare to publish the offer. Upon first creating an offer, the following fields are required in the request payload:  &lt;strong&gt;sku&lt;/strong&gt;, &lt;strong&gt;marketplaceId&lt;/strong&gt;, and (listing) &lt;strong&gt;format&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that will be required before an offer can be published are highlighted below. These settings are either set with &lt;strong&gt;createOffer&lt;/strong&gt;, or they can be set with a subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; call: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/createOffer#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;&lt;p&gt;If the call is successful, a unique &lt;strong&gt;offerId&lt;/strong&gt; value is returned in the response. This value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run the &lt;strong&gt;publishOffer&lt;/strong&gt; call to convert the offer to an active eBay listing.&lt;/p&gt;&lt;p&gt;For those who prefer to create multiple offers (up to 25 at a time) with one call, the &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; method can be used.&lt;/p&gt;
     * @param body This type provides details of an offer, and is used by the base request payload of the &lt;strong&gt;createOffer&lt;/strong&gt; and &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; methods.
     * @return a {@link OfferResponse}
     */
    @jakarta.annotation.Nullable
    public OfferResponse post(@jakarta.annotation.Nonnull final EbayOfferDetailsWithKeys body) {
        return post(body, null);
    }
    /**
     * This call creates an offer for a specific inventory item on a specific eBay marketplace. It is up to the sellers whether they want to create a complete offer (with all necessary details) right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOffer&lt;/strong&gt; call, and then make one or more subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; calls to complete the offer and prepare to publish the offer. Upon first creating an offer, the following fields are required in the request payload:  &lt;strong&gt;sku&lt;/strong&gt;, &lt;strong&gt;marketplaceId&lt;/strong&gt;, and (listing) &lt;strong&gt;format&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that will be required before an offer can be published are highlighted below. These settings are either set with &lt;strong&gt;createOffer&lt;/strong&gt;, or they can be set with a subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; call: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/createOffer#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;&lt;p&gt;If the call is successful, a unique &lt;strong&gt;offerId&lt;/strong&gt; value is returned in the response. This value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run the &lt;strong&gt;publishOffer&lt;/strong&gt; call to convert the offer to an active eBay listing.&lt;/p&gt;&lt;p&gt;For those who prefer to create multiple offers (up to 25 at a time) with one call, the &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; method can be used.&lt;/p&gt;
     * @param body This type provides details of an offer, and is used by the base request payload of the &lt;strong&gt;createOffer&lt;/strong&gt; and &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; methods.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OfferResponse}
     */
    @jakarta.annotation.Nullable
    public OfferResponse post(@jakarta.annotation.Nonnull final EbayOfferDetailsWithKeys body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OfferResponse::createFromDiscriminatorValue);
    }
    /**
     * This call retrieves all existing offers for the specified SKU value. The seller has the option of limiting the offers that are retrieved to a specific eBay marketplace, or to a listing format.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the same SKU value can not be offered across multiple eBay marketplaces, so the &lt;strong&gt;marketplace_id&lt;/strong&gt; query parameter currently does not have any practical use for this call.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The same SKU can be offered through an auction and a fixed-price listing concurrently. If this is the case, &lt;b&gt;getOffers&lt;/b&gt; will return two offers. Otherwise, only one offer will be returned.&lt;/span&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves all existing offers for the specified SKU value. The seller has the option of limiting the offers that are retrieved to a specific eBay marketplace, or to a listing format.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the same SKU value can not be offered across multiple eBay marketplaces, so the &lt;strong&gt;marketplace_id&lt;/strong&gt; query parameter currently does not have any practical use for this call.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The same SKU can be offered through an auction and a fixed-price listing concurrently. If this is the case, &lt;b&gt;getOffers&lt;/b&gt; will return two offers. Otherwise, only one offer will be returned.&lt;/span&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This call creates an offer for a specific inventory item on a specific eBay marketplace. It is up to the sellers whether they want to create a complete offer (with all necessary details) right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOffer&lt;/strong&gt; call, and then make one or more subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; calls to complete the offer and prepare to publish the offer. Upon first creating an offer, the following fields are required in the request payload:  &lt;strong&gt;sku&lt;/strong&gt;, &lt;strong&gt;marketplaceId&lt;/strong&gt;, and (listing) &lt;strong&gt;format&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that will be required before an offer can be published are highlighted below. These settings are either set with &lt;strong&gt;createOffer&lt;/strong&gt;, or they can be set with a subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; call: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/createOffer#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;&lt;p&gt;If the call is successful, a unique &lt;strong&gt;offerId&lt;/strong&gt; value is returned in the response. This value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run the &lt;strong&gt;publishOffer&lt;/strong&gt; call to convert the offer to an active eBay listing.&lt;/p&gt;&lt;p&gt;For those who prefer to create multiple offers (up to 25 at a time) with one call, the &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; method can be used.&lt;/p&gt;
     * @param body This type provides details of an offer, and is used by the base request payload of the &lt;strong&gt;createOffer&lt;/strong&gt; and &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; methods.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EbayOfferDetailsWithKeys body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This call creates an offer for a specific inventory item on a specific eBay marketplace. It is up to the sellers whether they want to create a complete offer (with all necessary details) right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOffer&lt;/strong&gt; call, and then make one or more subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; calls to complete the offer and prepare to publish the offer. Upon first creating an offer, the following fields are required in the request payload:  &lt;strong&gt;sku&lt;/strong&gt;, &lt;strong&gt;marketplaceId&lt;/strong&gt;, and (listing) &lt;strong&gt;format&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;Other information that will be required before an offer can be published are highlighted below. These settings are either set with &lt;strong&gt;createOffer&lt;/strong&gt;, or they can be set with a subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; call: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/createOffer#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;&lt;p&gt;If the call is successful, a unique &lt;strong&gt;offerId&lt;/strong&gt; value is returned in the response. This value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run the &lt;strong&gt;publishOffer&lt;/strong&gt; call to convert the offer to an active eBay listing.&lt;/p&gt;&lt;p&gt;For those who prefer to create multiple offers (up to 25 at a time) with one call, the &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; method can be used.&lt;/p&gt;
     * @param body This type provides details of an offer, and is used by the base request payload of the &lt;strong&gt;createOffer&lt;/strong&gt; and &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; methods.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EbayOfferDetailsWithKeys body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link OfferRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OfferRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OfferRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This call retrieves all existing offers for the specified SKU value. The seller has the option of limiting the offers that are retrieved to a specific eBay marketplace, or to a listing format.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the same SKU value can not be offered across multiple eBay marketplaces, so the &lt;strong&gt;marketplace_id&lt;/strong&gt; query parameter currently does not have any practical use for this call.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The same SKU can be offered through an auction and a fixed-price listing concurrently. If this is the case, &lt;b&gt;getOffers&lt;/b&gt; will return two offers. Otherwise, only one offer will be returned.&lt;/span&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This enumeration value sets the listing format for the offers being retrieved. This query parameter will be passed in if the seller only wants to see offers in a specified listing format, such as &lt;code&gt;FIXED_PRICE&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String format;
        /**
         * The value passed in this query parameter sets the maximum number of records to return per page of data. Although this field is a string, the value passed in this field should be a positive integer value. If this query parameter is not set, up to 100 records will be returned on each page of results.
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The unique identifier of the eBay marketplace. This query parameter will be passed in if the seller only wants to see the product&apos;s offers on a specific eBay marketplace.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the same SKU value can not be offered across multiple eBay marketplaces, so the &lt;strong&gt;marketplace_id&lt;/strong&gt; query parameter currently does not have any practical use for this call.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String marketplaceId;
        /**
         * The value passed in this query parameter sets the page number to retrieve. Although this field is a string, the value passed in this field should be a integer value equal to or greater than &lt;code&gt;0&lt;/code&gt;. The first page of records has a value of &lt;code&gt;0&lt;/code&gt;, the second page of records has a value of &lt;code&gt;1&lt;/code&gt;, and so on. If this query parameter is not set, its value defaults to &lt;code&gt;0&lt;/code&gt;, and the first page of records is returned.
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * The seller-defined SKU value is passed in as a query parameter. All offers associated with this product are returned in the response. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The same SKU can be offered through an auction and a fixed-price listing concurrently. If this is the case, &lt;b&gt;getOffers&lt;/b&gt; will return two offers. Otherwise, only one offer will be returned.&lt;/span&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/getInventoryItems&quot;&gt;getInventoryItems&lt;/a&gt; method to retrieve SKU values.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max length&lt;/strong&gt;: 50.
         */
        @jakarta.annotation.Nullable
        public String sku;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("format", format);
            allQueryParams.put("limit", limit);
            allQueryParams.put("marketplace_id", marketplaceId);
            allQueryParams.put("offset", offset);
            allQueryParams.put("sku", sku);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
