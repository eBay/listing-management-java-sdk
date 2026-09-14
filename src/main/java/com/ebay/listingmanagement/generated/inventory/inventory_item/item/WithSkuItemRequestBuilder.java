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

package com.ebay.listingmanagement.generated.inventory.inventory_item.item;

import com.ebay.listingmanagement.generated.inventory.inventory_item.item.product_compatibility.ProductCompatibilityRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.models.BaseResponse;
import com.ebay.listingmanagement.generated.inventory.models.Error;
import com.ebay.listingmanagement.generated.inventory.models.InventoryItem;
import com.ebay.listingmanagement.generated.inventory.models.InventoryItemWithSkuLocaleGroupid;
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
 * Builds and executes requests for operations under /inventory_item/{sku}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSkuItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The product_compatibility property
     * @return a {@link ProductCompatibilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProductCompatibilityRequestBuilder productCompatibility() {
        return new ProductCompatibilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithSkuItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSkuItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_item/{sku}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithSkuItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSkuItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_item/{sku}", rawUrl);
    }
    /**
     * This call is used to delete an inventory item record associated with a specified SKU. A successful call will not only delete that inventory item record, but will also have the following effects:&lt;ul&gt;&lt;li&gt;Delete any and all unpublished offers associated with that SKU;&lt;/li&gt;&lt;li&gt;Delete any and all single-variation eBay listings associated with that SKU;&lt;/li&gt;&lt;li&gt;Automatically remove that SKU from a multiple-variation listing and remove that SKU from any and all inventory item groups in which that SKU was a member.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * This call is used to delete an inventory item record associated with a specified SKU. A successful call will not only delete that inventory item record, but will also have the following effects:&lt;ul&gt;&lt;li&gt;Delete any and all unpublished offers associated with that SKU;&lt;/li&gt;&lt;li&gt;Delete any and all single-variation eBay listings associated with that SKU;&lt;/li&gt;&lt;li&gt;Automatically remove that SKU from a multiple-variation listing and remove that SKU from any and all inventory item groups in which that SKU was a member.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
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
     * This call retrieves the inventory item record for a given SKU. The SKU value is passed in at the end of the call URI. There is no request payload for this call.&lt;br&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br&gt;&lt;br&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used. To retrieve all inventory item records defined on the seller&apos;s account, the &lt;strong&gt;getInventoryItems&lt;/strong&gt; method can be used (with pagination control if desired).
     * @return a {@link InventoryItemWithSkuLocaleGroupid}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InventoryItemWithSkuLocaleGroupid get() {
        return get(null);
    }
    /**
     * This call retrieves the inventory item record for a given SKU. The SKU value is passed in at the end of the call URI. There is no request payload for this call.&lt;br&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br&gt;&lt;br&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used. To retrieve all inventory item records defined on the seller&apos;s account, the &lt;strong&gt;getInventoryItems&lt;/strong&gt; method can be used (with pagination control if desired).
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InventoryItemWithSkuLocaleGroupid}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InventoryItemWithSkuLocaleGroupid get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InventoryItemWithSkuLocaleGroupid::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call creates a new inventory item record or replaces an existing inventory item record. It is up to sellers whether they want to create a complete inventory item record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; calls to complete all required fields for the inventory item record and prepare it for publishing. Upon first creating an inventory item record, only the SKU value in the call path is required.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#inventory_item&quot; target=&quot;_blank&quot;&gt;Inventory item fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt; In the case of replacing an existing inventory item record, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call will do a complete replacement of the existing inventory item record, so all fields that are currently defined for the inventory item record are required in that update action, regardless of whether their values changed. So, when replacing/updating an inventory item record, it is advised that the seller run a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitem&quot; target=&quot;_blank&quot;&gt;getInventoryItem&lt;/a&gt; call to retrieve the full inventory item record and see all of its current values/settings before attempting to update the record. And if changes are made to an inventory item that is part of one or more active eBay listings, a successful call will automatically update these eBay listings. &lt;br&gt;&lt;br&gt;The key information that is set with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call include: &lt;ul&gt; &lt;li&gt;The seller-defined SKU value for the product. Each seller product, including products within an item inventory group, must have their own SKU value. This SKU value is passed in at the end of the call URI.&lt;/li&gt; &lt;li&gt;The condition of the item.&lt;/li&gt; &lt;li&gt;Product details, including any product identifier(s), such as a UPC, ISBN, EAN, or Brand/Manufacturer Part Number pair, a product description, a product title, product/item aspects, and links to images. eBay will use any supplied eBay Product ID (ePID) or a GTIN (UPC, ISBN, or EAN) and attempt to match those identifiers to a product in the eBay Catalog, and if a product match is found, the product details for the inventory item will automatically be populated.&lt;/li&gt; &lt;li&gt;The quantity of the inventory item that is available for purchase.&lt;/li&gt; &lt;li&gt;Package weight and dimensions, which is required if the seller will be offering calculated shipping options. The package weight will also be required if the seller will be providing flat-rate shipping services, but charging a weight surcharge.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href=&quot;/api-docs/static/rest-request-components.html#HTTP&quot; target=&quot;_blank&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;&lt;p&gt;For those who prefer to create or update numerous inventory item records with one call (up to 25 at a time), the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-bulkcreateorreplaceinventoryitem&quot; target=&quot;_blank&quot;&gt;bulkCreateOrReplaceInventoryItem&lt;/a&gt; method can be used.&lt;/p&gt;
     * @param body Details of the inventory item record.
     * @return a {@link BaseResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BaseResponse put(@jakarta.annotation.Nonnull final InventoryItem body) {
        return put(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call creates a new inventory item record or replaces an existing inventory item record. It is up to sellers whether they want to create a complete inventory item record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; calls to complete all required fields for the inventory item record and prepare it for publishing. Upon first creating an inventory item record, only the SKU value in the call path is required.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#inventory_item&quot; target=&quot;_blank&quot;&gt;Inventory item fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt; In the case of replacing an existing inventory item record, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call will do a complete replacement of the existing inventory item record, so all fields that are currently defined for the inventory item record are required in that update action, regardless of whether their values changed. So, when replacing/updating an inventory item record, it is advised that the seller run a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitem&quot; target=&quot;_blank&quot;&gt;getInventoryItem&lt;/a&gt; call to retrieve the full inventory item record and see all of its current values/settings before attempting to update the record. And if changes are made to an inventory item that is part of one or more active eBay listings, a successful call will automatically update these eBay listings. &lt;br&gt;&lt;br&gt;The key information that is set with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call include: &lt;ul&gt; &lt;li&gt;The seller-defined SKU value for the product. Each seller product, including products within an item inventory group, must have their own SKU value. This SKU value is passed in at the end of the call URI.&lt;/li&gt; &lt;li&gt;The condition of the item.&lt;/li&gt; &lt;li&gt;Product details, including any product identifier(s), such as a UPC, ISBN, EAN, or Brand/Manufacturer Part Number pair, a product description, a product title, product/item aspects, and links to images. eBay will use any supplied eBay Product ID (ePID) or a GTIN (UPC, ISBN, or EAN) and attempt to match those identifiers to a product in the eBay Catalog, and if a product match is found, the product details for the inventory item will automatically be populated.&lt;/li&gt; &lt;li&gt;The quantity of the inventory item that is available for purchase.&lt;/li&gt; &lt;li&gt;Package weight and dimensions, which is required if the seller will be offering calculated shipping options. The package weight will also be required if the seller will be providing flat-rate shipping services, but charging a weight surcharge.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href=&quot;/api-docs/static/rest-request-components.html#HTTP&quot; target=&quot;_blank&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;&lt;p&gt;For those who prefer to create or update numerous inventory item records with one call (up to 25 at a time), the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-bulkcreateorreplaceinventoryitem&quot; target=&quot;_blank&quot;&gt;bulkCreateOrReplaceInventoryItem&lt;/a&gt; method can be used.&lt;/p&gt;
     * @param body Details of the inventory item record.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BaseResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BaseResponse put(@jakarta.annotation.Nonnull final InventoryItem body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BaseResponse::createFromDiscriminatorValue);
    }
    /**
     * This call is used to delete an inventory item record associated with a specified SKU. A successful call will not only delete that inventory item record, but will also have the following effects:&lt;ul&gt;&lt;li&gt;Delete any and all unpublished offers associated with that SKU;&lt;/li&gt;&lt;li&gt;Delete any and all single-variation eBay listings associated with that SKU;&lt;/li&gt;&lt;li&gt;Automatically remove that SKU from a multiple-variation listing and remove that SKU from any and all inventory item groups in which that SKU was a member.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This call is used to delete an inventory item record associated with a specified SKU. A successful call will not only delete that inventory item record, but will also have the following effects:&lt;ul&gt;&lt;li&gt;Delete any and all unpublished offers associated with that SKU;&lt;/li&gt;&lt;li&gt;Delete any and all single-variation eBay listings associated with that SKU;&lt;/li&gt;&lt;li&gt;Automatically remove that SKU from a multiple-variation listing and remove that SKU from any and all inventory item groups in which that SKU was a member.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
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
     * This call retrieves the inventory item record for a given SKU. The SKU value is passed in at the end of the call URI. There is no request payload for this call.&lt;br&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br&gt;&lt;br&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used. To retrieve all inventory item records defined on the seller&apos;s account, the &lt;strong&gt;getInventoryItems&lt;/strong&gt; method can be used (with pagination control if desired).
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves the inventory item record for a given SKU. The SKU value is passed in at the end of the call URI. There is no request payload for this call.&lt;br&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br&gt;&lt;br&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used. To retrieve all inventory item records defined on the seller&apos;s account, the &lt;strong&gt;getInventoryItems&lt;/strong&gt; method can be used (with pagination control if desired).
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
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call creates a new inventory item record or replaces an existing inventory item record. It is up to sellers whether they want to create a complete inventory item record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; calls to complete all required fields for the inventory item record and prepare it for publishing. Upon first creating an inventory item record, only the SKU value in the call path is required.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#inventory_item&quot; target=&quot;_blank&quot;&gt;Inventory item fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt; In the case of replacing an existing inventory item record, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call will do a complete replacement of the existing inventory item record, so all fields that are currently defined for the inventory item record are required in that update action, regardless of whether their values changed. So, when replacing/updating an inventory item record, it is advised that the seller run a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitem&quot; target=&quot;_blank&quot;&gt;getInventoryItem&lt;/a&gt; call to retrieve the full inventory item record and see all of its current values/settings before attempting to update the record. And if changes are made to an inventory item that is part of one or more active eBay listings, a successful call will automatically update these eBay listings. &lt;br&gt;&lt;br&gt;The key information that is set with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call include: &lt;ul&gt; &lt;li&gt;The seller-defined SKU value for the product. Each seller product, including products within an item inventory group, must have their own SKU value. This SKU value is passed in at the end of the call URI.&lt;/li&gt; &lt;li&gt;The condition of the item.&lt;/li&gt; &lt;li&gt;Product details, including any product identifier(s), such as a UPC, ISBN, EAN, or Brand/Manufacturer Part Number pair, a product description, a product title, product/item aspects, and links to images. eBay will use any supplied eBay Product ID (ePID) or a GTIN (UPC, ISBN, or EAN) and attempt to match those identifiers to a product in the eBay Catalog, and if a product match is found, the product details for the inventory item will automatically be populated.&lt;/li&gt; &lt;li&gt;The quantity of the inventory item that is available for purchase.&lt;/li&gt; &lt;li&gt;Package weight and dimensions, which is required if the seller will be offering calculated shipping options. The package weight will also be required if the seller will be providing flat-rate shipping services, but charging a weight surcharge.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href=&quot;/api-docs/static/rest-request-components.html#HTTP&quot; target=&quot;_blank&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;&lt;p&gt;For those who prefer to create or update numerous inventory item records with one call (up to 25 at a time), the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-bulkcreateorreplaceinventoryitem&quot; target=&quot;_blank&quot;&gt;bulkCreateOrReplaceInventoryItem&lt;/a&gt; method can be used.&lt;/p&gt;
     * @param body Details of the inventory item record.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final InventoryItem body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br&gt;This call creates a new inventory item record or replaces an existing inventory item record. It is up to sellers whether they want to create a complete inventory item record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; calls to complete all required fields for the inventory item record and prepare it for publishing. Upon first creating an inventory item record, only the SKU value in the call path is required.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#inventory_item&quot; target=&quot;_blank&quot;&gt;Inventory item fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers.&lt;/span&gt;&lt;br&gt; In the case of replacing an existing inventory item record, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call will do a complete replacement of the existing inventory item record, so all fields that are currently defined for the inventory item record are required in that update action, regardless of whether their values changed. So, when replacing/updating an inventory item record, it is advised that the seller run a &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitem&quot; target=&quot;_blank&quot;&gt;getInventoryItem&lt;/a&gt; call to retrieve the full inventory item record and see all of its current values/settings before attempting to update the record. And if changes are made to an inventory item that is part of one or more active eBay listings, a successful call will automatically update these eBay listings. &lt;br&gt;&lt;br&gt;The key information that is set with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call include: &lt;ul&gt; &lt;li&gt;The seller-defined SKU value for the product. Each seller product, including products within an item inventory group, must have their own SKU value. This SKU value is passed in at the end of the call URI.&lt;/li&gt; &lt;li&gt;The condition of the item.&lt;/li&gt; &lt;li&gt;Product details, including any product identifier(s), such as a UPC, ISBN, EAN, or Brand/Manufacturer Part Number pair, a product description, a product title, product/item aspects, and links to images. eBay will use any supplied eBay Product ID (ePID) or a GTIN (UPC, ISBN, or EAN) and attempt to match those identifiers to a product in the eBay Catalog, and if a product match is found, the product details for the inventory item will automatically be populated.&lt;/li&gt; &lt;li&gt;The quantity of the inventory item that is available for purchase.&lt;/li&gt; &lt;li&gt;Package weight and dimensions, which is required if the seller will be offering calculated shipping options. The package weight will also be required if the seller will be providing flat-rate shipping services, but charging a weight surcharge.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href=&quot;/api-docs/static/rest-request-components.html#HTTP&quot; target=&quot;_blank&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;&lt;p&gt;For those who prefer to create or update numerous inventory item records with one call (up to 25 at a time), the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-bulkcreateorreplaceinventoryitem&quot; target=&quot;_blank&quot;&gt;bulkCreateOrReplaceInventoryItem&lt;/a&gt; method can be used.&lt;/p&gt;
     * @param body Details of the inventory item record.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final InventoryItem body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WithSkuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSkuItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithSkuItemRequestBuilder(rawUrl, requestAdapter);
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
