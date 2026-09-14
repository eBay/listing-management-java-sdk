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

package com.ebay.listingmanagement.generated.inventory.offer.publish_by_inventory_item_group;

import com.ebay.listingmanagement.generated.inventory.models.Error;
import com.ebay.listingmanagement.generated.inventory.models.PublishByInventoryItemGroupRequest;
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
 * Builds and executes requests for operations under /offer/publish_by_inventory_item_group
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PublishByInventoryItemGroupRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link PublishByInventoryItemGroupRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PublishByInventoryItemGroupRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer/publish_by_inventory_item_group", pathParameters);
    }
    /**
     * Instantiates a new {@link PublishByInventoryItemGroupRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PublishByInventoryItemGroupRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/offer/publish_by_inventory_item_group", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call is used to convert all unpublished offers associated with an inventory item group into an active, multiple-variation listing.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling the create or update methods, but become required when publishing the offer to create active listings. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;The unique identifier of the inventory item group (&lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup.publishbyinventoryitemgrouprequest.inventoryitemgroupkey&quot; target=&quot;_blank&quot;&gt;inventoryItemGroupKey&lt;/a&gt;) is passed in the request payload. All inventory items and their corresponding offers in the inventory item group must be valid (meet all requirements) for the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call to be completely successful. For any inventory items in the group that are missing required data or have no corresponding offers, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; will create a new multiple-variation listing, but any inventory items with missing required data/offers will not be in the newly-created listing. If any inventory items in the group to be published have invalid data, or one or more of the inventory items have conflicting data with one another, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call will fail. Be sure to check for any error or warning messages in the call response for any applicable information about one or more inventory items/offers having issues.
     * @param body The identifier of the inventory item group to publish and the eBay marketplace where the listing will be published is needed in the request payload.
     * @return a {@link PublishResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PublishResponse post(@jakarta.annotation.Nonnull final PublishByInventoryItemGroupRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call is used to convert all unpublished offers associated with an inventory item group into an active, multiple-variation listing.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling the create or update methods, but become required when publishing the offer to create active listings. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;The unique identifier of the inventory item group (&lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup.publishbyinventoryitemgrouprequest.inventoryitemgroupkey&quot; target=&quot;_blank&quot;&gt;inventoryItemGroupKey&lt;/a&gt;) is passed in the request payload. All inventory items and their corresponding offers in the inventory item group must be valid (meet all requirements) for the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call to be completely successful. For any inventory items in the group that are missing required data or have no corresponding offers, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; will create a new multiple-variation listing, but any inventory items with missing required data/offers will not be in the newly-created listing. If any inventory items in the group to be published have invalid data, or one or more of the inventory items have conflicting data with one another, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call will fail. Be sure to check for any error or warning messages in the call response for any applicable information about one or more inventory items/offers having issues.
     * @param body The identifier of the inventory item group to publish and the eBay marketplace where the listing will be published is needed in the request payload.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PublishResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PublishResponse post(@jakarta.annotation.Nonnull final PublishByInventoryItemGroupRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PublishResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call is used to convert all unpublished offers associated with an inventory item group into an active, multiple-variation listing.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling the create or update methods, but become required when publishing the offer to create active listings. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;The unique identifier of the inventory item group (&lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup.publishbyinventoryitemgrouprequest.inventoryitemgroupkey&quot; target=&quot;_blank&quot;&gt;inventoryItemGroupKey&lt;/a&gt;) is passed in the request payload. All inventory items and their corresponding offers in the inventory item group must be valid (meet all requirements) for the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call to be completely successful. For any inventory items in the group that are missing required data or have no corresponding offers, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; will create a new multiple-variation listing, but any inventory items with missing required data/offers will not be in the newly-created listing. If any inventory items in the group to be published have invalid data, or one or more of the inventory items have conflicting data with one another, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call will fail. Be sure to check for any error or warning messages in the call response for any applicable information about one or more inventory items/offers having issues.
     * @param body The identifier of the inventory item group to publish and the eBay marketplace where the listing will be published is needed in the request payload.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PublishByInventoryItemGroupRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call is used to convert all unpublished offers associated with an inventory item group into an active, multiple-variation listing.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling the create or update methods, but become required when publishing the offer to create active listings. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#offer&quot; target=&quot;_blank&quot;&gt;Offer fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;The unique identifier of the inventory item group (&lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-publishofferbyinventoryitemgroup.publishbyinventoryitemgrouprequest.inventoryitemgroupkey&quot; target=&quot;_blank&quot;&gt;inventoryItemGroupKey&lt;/a&gt;) is passed in the request payload. All inventory items and their corresponding offers in the inventory item group must be valid (meet all requirements) for the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call to be completely successful. For any inventory items in the group that are missing required data or have no corresponding offers, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; will create a new multiple-variation listing, but any inventory items with missing required data/offers will not be in the newly-created listing. If any inventory items in the group to be published have invalid data, or one or more of the inventory items have conflicting data with one another, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call will fail. Be sure to check for any error or warning messages in the call response for any applicable information about one or more inventory items/offers having issues.
     * @param body The identifier of the inventory item group to publish and the eBay marketplace where the listing will be published is needed in the request payload.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PublishByInventoryItemGroupRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PublishByInventoryItemGroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublishByInventoryItemGroupRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PublishByInventoryItemGroupRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
