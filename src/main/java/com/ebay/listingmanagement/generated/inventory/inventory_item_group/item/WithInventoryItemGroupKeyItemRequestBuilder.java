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

package com.ebay.listingmanagement.generated.inventory.inventory_item_group.item;

import com.ebay.listingmanagement.generated.inventory.models.BaseResponse;
import com.ebay.listingmanagement.generated.inventory.models.Error;
import com.ebay.listingmanagement.generated.inventory.models.InventoryItemGroup;
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
 * Builds and executes requests for operations under /inventory_item_group/{inventoryItemGroupKey}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithInventoryItemGroupKeyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithInventoryItemGroupKeyItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInventoryItemGroupKeyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_item_group/{inventoryItemGroupKey}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithInventoryItemGroupKeyItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInventoryItemGroupKeyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_item_group/{inventoryItemGroupKey}", rawUrl);
    }
    /**
     * This call deletes the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * This call deletes the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value.
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
     * This call retrieves the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value is passed in at the end of the call URI.
     * @return a {@link InventoryItemGroup}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InventoryItemGroup get() {
        return get(null);
    }
    /**
     * This call retrieves the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value is passed in at the end of the call URI.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InventoryItemGroup}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InventoryItemGroup get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InventoryItemGroup::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call creates a new inventory item group or updates an existing inventory item group. It is up to sellers whether they want to create a complete inventory item group record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; calls to complete the inventory item group record. Upon first creating an inventory item group record, the only required elements are  the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-createorreplaceinventoryitemgroup.inventoryitemgroup.subtitle&quot; target=&quot;_blank&quot;&gt;inventoryItemGroupKey&lt;/a&gt; identifier in the call URI, and the members of the inventory item group specified through the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-createorreplaceinventoryitemgroup.inventoryitemgroup.variantskus&quot; target=&quot;_blank&quot;&gt;variantSKUs&lt;/a&gt; array in the request payload.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#inventory_item_group&quot; target=&quot;_blank&quot;&gt;Inventory item group fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt;In the case of updating/replacing an existing inventory item group, this call does a complete replacement of the existing inventory item group record, so all fields (including the member SKUs) that make up the inventory item group are required, regardless of whether their values changed. So, when replacing/updating an inventory item group record, it is advised that the seller run a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-getinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;getInventoryItemGroup&lt;/a&gt; call for that inventory item group to see all of its current values/settings/members before attempting to update the record. And if changes are made to an inventory item group that is part of a live, multiple-variation eBay listing, these changes automatically update the eBay listing. For example, if a SKU value is removed from the inventory item group, the corresponding product variation will be removed from the eBay listing as well.&lt;br&gt;&lt;br&gt;In addition to the required inventory item group identifier and member SKUs, other key information that is set with this call include: &lt;ul&gt; &lt;li&gt;Title and description of the inventory item group. The string values provided in these fields will actually become the listing title and listing description of the listing once the first SKU of the inventory item group is published successfully&lt;/li&gt; &lt;li&gt;Common aspects that inventory items in the group share&lt;/li&gt; &lt;li&gt;Product aspects that vary within each product variation&lt;/li&gt; &lt;li&gt;Links to images demonstrating the variations of the product, and these images should correspond to the product aspect that is set with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-listing-bulkmigratelisting&quot; target=&quot;_blank&quot;&gt;variesBy.aspectsImageVariesBy&lt;/a&gt; field&lt;/li&gt; &lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/inventory-item-groups.html&quot; target=&quot;_blank&quot;&gt;Creating and managing inventory item groups&lt;/a&gt;.&lt;/span&gt;
     * @param body Details of the inventory Item Group
     * @return a {@link BaseResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BaseResponse put(@jakarta.annotation.Nonnull final InventoryItemGroup body) {
        return put(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call creates a new inventory item group or updates an existing inventory item group. It is up to sellers whether they want to create a complete inventory item group record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; calls to complete the inventory item group record. Upon first creating an inventory item group record, the only required elements are  the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-createorreplaceinventoryitemgroup.inventoryitemgroup.subtitle&quot; target=&quot;_blank&quot;&gt;inventoryItemGroupKey&lt;/a&gt; identifier in the call URI, and the members of the inventory item group specified through the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-createorreplaceinventoryitemgroup.inventoryitemgroup.variantskus&quot; target=&quot;_blank&quot;&gt;variantSKUs&lt;/a&gt; array in the request payload.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#inventory_item_group&quot; target=&quot;_blank&quot;&gt;Inventory item group fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt;In the case of updating/replacing an existing inventory item group, this call does a complete replacement of the existing inventory item group record, so all fields (including the member SKUs) that make up the inventory item group are required, regardless of whether their values changed. So, when replacing/updating an inventory item group record, it is advised that the seller run a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-getinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;getInventoryItemGroup&lt;/a&gt; call for that inventory item group to see all of its current values/settings/members before attempting to update the record. And if changes are made to an inventory item group that is part of a live, multiple-variation eBay listing, these changes automatically update the eBay listing. For example, if a SKU value is removed from the inventory item group, the corresponding product variation will be removed from the eBay listing as well.&lt;br&gt;&lt;br&gt;In addition to the required inventory item group identifier and member SKUs, other key information that is set with this call include: &lt;ul&gt; &lt;li&gt;Title and description of the inventory item group. The string values provided in these fields will actually become the listing title and listing description of the listing once the first SKU of the inventory item group is published successfully&lt;/li&gt; &lt;li&gt;Common aspects that inventory items in the group share&lt;/li&gt; &lt;li&gt;Product aspects that vary within each product variation&lt;/li&gt; &lt;li&gt;Links to images demonstrating the variations of the product, and these images should correspond to the product aspect that is set with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-listing-bulkmigratelisting&quot; target=&quot;_blank&quot;&gt;variesBy.aspectsImageVariesBy&lt;/a&gt; field&lt;/li&gt; &lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/inventory-item-groups.html&quot; target=&quot;_blank&quot;&gt;Creating and managing inventory item groups&lt;/a&gt;.&lt;/span&gt;
     * @param body Details of the inventory Item Group
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BaseResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BaseResponse put(@jakarta.annotation.Nonnull final InventoryItemGroup body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BaseResponse::createFromDiscriminatorValue);
    }
    /**
     * This call deletes the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This call deletes the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value.
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
     * This call retrieves the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value is passed in at the end of the call URI.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value is passed in at the end of the call URI.
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
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call creates a new inventory item group or updates an existing inventory item group. It is up to sellers whether they want to create a complete inventory item group record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; calls to complete the inventory item group record. Upon first creating an inventory item group record, the only required elements are  the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-createorreplaceinventoryitemgroup.inventoryitemgroup.subtitle&quot; target=&quot;_blank&quot;&gt;inventoryItemGroupKey&lt;/a&gt; identifier in the call URI, and the members of the inventory item group specified through the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-createorreplaceinventoryitemgroup.inventoryitemgroup.variantskus&quot; target=&quot;_blank&quot;&gt;variantSKUs&lt;/a&gt; array in the request payload.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#inventory_item_group&quot; target=&quot;_blank&quot;&gt;Inventory item group fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt;In the case of updating/replacing an existing inventory item group, this call does a complete replacement of the existing inventory item group record, so all fields (including the member SKUs) that make up the inventory item group are required, regardless of whether their values changed. So, when replacing/updating an inventory item group record, it is advised that the seller run a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-getinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;getInventoryItemGroup&lt;/a&gt; call for that inventory item group to see all of its current values/settings/members before attempting to update the record. And if changes are made to an inventory item group that is part of a live, multiple-variation eBay listing, these changes automatically update the eBay listing. For example, if a SKU value is removed from the inventory item group, the corresponding product variation will be removed from the eBay listing as well.&lt;br&gt;&lt;br&gt;In addition to the required inventory item group identifier and member SKUs, other key information that is set with this call include: &lt;ul&gt; &lt;li&gt;Title and description of the inventory item group. The string values provided in these fields will actually become the listing title and listing description of the listing once the first SKU of the inventory item group is published successfully&lt;/li&gt; &lt;li&gt;Common aspects that inventory items in the group share&lt;/li&gt; &lt;li&gt;Product aspects that vary within each product variation&lt;/li&gt; &lt;li&gt;Links to images demonstrating the variations of the product, and these images should correspond to the product aspect that is set with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-listing-bulkmigratelisting&quot; target=&quot;_blank&quot;&gt;variesBy.aspectsImageVariesBy&lt;/a&gt; field&lt;/li&gt; &lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/inventory-item-groups.html&quot; target=&quot;_blank&quot;&gt;Creating and managing inventory item groups&lt;/a&gt;.&lt;/span&gt;
     * @param body Details of the inventory Item Group
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final InventoryItemGroup body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call creates a new inventory item group or updates an existing inventory item group. It is up to sellers whether they want to create a complete inventory item group record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; calls to complete the inventory item group record. Upon first creating an inventory item group record, the only required elements are  the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-createorreplaceinventoryitemgroup.inventoryitemgroup.subtitle&quot; target=&quot;_blank&quot;&gt;inventoryItemGroupKey&lt;/a&gt; identifier in the call URI, and the members of the inventory item group specified through the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-createorreplaceinventoryitemgroup.inventoryitemgroup.variantskus&quot; target=&quot;_blank&quot;&gt;variantSKUs&lt;/a&gt; array in the request payload.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#inventory_item_group&quot; target=&quot;_blank&quot;&gt;Inventory item group fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt;In the case of updating/replacing an existing inventory item group, this call does a complete replacement of the existing inventory item group record, so all fields (including the member SKUs) that make up the inventory item group are required, regardless of whether their values changed. So, when replacing/updating an inventory item group record, it is advised that the seller run a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item_group-getinventoryitemgroup&quot; target=&quot;_blank&quot;&gt;getInventoryItemGroup&lt;/a&gt; call for that inventory item group to see all of its current values/settings/members before attempting to update the record. And if changes are made to an inventory item group that is part of a live, multiple-variation eBay listing, these changes automatically update the eBay listing. For example, if a SKU value is removed from the inventory item group, the corresponding product variation will be removed from the eBay listing as well.&lt;br&gt;&lt;br&gt;In addition to the required inventory item group identifier and member SKUs, other key information that is set with this call include: &lt;ul&gt; &lt;li&gt;Title and description of the inventory item group. The string values provided in these fields will actually become the listing title and listing description of the listing once the first SKU of the inventory item group is published successfully&lt;/li&gt; &lt;li&gt;Common aspects that inventory items in the group share&lt;/li&gt; &lt;li&gt;Product aspects that vary within each product variation&lt;/li&gt; &lt;li&gt;Links to images demonstrating the variations of the product, and these images should correspond to the product aspect that is set with the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-listing-bulkmigratelisting&quot; target=&quot;_blank&quot;&gt;variesBy.aspectsImageVariesBy&lt;/a&gt; field&lt;/li&gt; &lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/inventory-item-groups.html&quot; target=&quot;_blank&quot;&gt;Creating and managing inventory item groups&lt;/a&gt;.&lt;/span&gt;
     * @param body Details of the inventory Item Group
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final InventoryItemGroup body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WithInventoryItemGroupKeyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithInventoryItemGroupKeyItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithInventoryItemGroupKeyItemRequestBuilder(rawUrl, requestAdapter);
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
