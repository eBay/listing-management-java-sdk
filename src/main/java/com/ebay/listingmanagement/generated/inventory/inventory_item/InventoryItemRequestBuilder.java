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

package com.ebay.listingmanagement.generated.inventory.inventory_item;

import com.ebay.listingmanagement.generated.inventory.inventory_item.item.WithSkuItemRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.models.InventoryItems;
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
 * Builds and executes requests for operations under /inventory_item
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.inventory.inventory_item.item collection
     * @param sku This path parameter specifies the seller-defined SKU value of the product whose inventory item record you wish to retrieve.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/getInventoryItems&quot; target=&quot;_blank &quot;&gt;getInventoryItems&lt;/a&gt; method to retrieve SKU values.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max length&lt;/strong&gt;: 50
     * @return a {@link WithSkuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSkuItemRequestBuilder bySku(@jakarta.annotation.Nonnull final String sku) {
        Objects.requireNonNull(sku);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sku", sku);
        return new WithSkuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link InventoryItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InventoryItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_item{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link InventoryItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InventoryItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_item{?limit*,offset*}", rawUrl);
    }
    /**
     * This call retrieves all inventory item records defined for the seller&apos;s account. The &lt;strong&gt;limit&lt;/strong&gt; query parameter allows the seller to control how many records are returned per page, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter is used to retrieve a specific page of records. The seller can make multiple calls to scan through multiple pages of records. There is no request payload for this call.&lt;br&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br&gt;&lt;br&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used.
     * @return a {@link InventoryItems}
     */
    @jakarta.annotation.Nullable
    public InventoryItems get() {
        return get(null);
    }
    /**
     * This call retrieves all inventory item records defined for the seller&apos;s account. The &lt;strong&gt;limit&lt;/strong&gt; query parameter allows the seller to control how many records are returned per page, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter is used to retrieve a specific page of records. The seller can make multiple calls to scan through multiple pages of records. There is no request payload for this call.&lt;br&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br&gt;&lt;br&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InventoryItems}
     */
    @jakarta.annotation.Nullable
    public InventoryItems get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, InventoryItems::createFromDiscriminatorValue);
    }
    /**
     * This call retrieves all inventory item records defined for the seller&apos;s account. The &lt;strong&gt;limit&lt;/strong&gt; query parameter allows the seller to control how many records are returned per page, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter is used to retrieve a specific page of records. The seller can make multiple calls to scan through multiple pages of records. There is no request payload for this call.&lt;br&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br&gt;&lt;br&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves all inventory item records defined for the seller&apos;s account. The &lt;strong&gt;limit&lt;/strong&gt; query parameter allows the seller to control how many records are returned per page, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter is used to retrieve a specific page of records. The seller can make multiple calls to scan through multiple pages of records. There is no request payload for this call.&lt;br&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br&gt;&lt;br&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link InventoryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InventoryItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InventoryItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This call retrieves all inventory item records defined for the seller&apos;s account. The &lt;strong&gt;limit&lt;/strong&gt; query parameter allows the seller to control how many records are returned per page, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter is used to retrieve a specific page of records. The seller can make multiple calls to scan through multiple pages of records. There is no request payload for this call.&lt;br&gt;&lt;br&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br&gt;&lt;br&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The value passed in this query parameter sets the maximum number of records to return per page of data. Although this field is a string, the value passed in this field should be an integer from &lt;code&gt;1&lt;/code&gt; to &lt;code&gt;200&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Min:&lt;/strong&gt; 1&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max:&lt;/strong&gt; 200&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 25
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The value passed in this query parameter sets the page number to retrieve. The first page of records has a value of &lt;code&gt;0&lt;/code&gt;, the second page of records has a value of &lt;code&gt;1&lt;/code&gt;, and so on. If this query parameter is not set, its value defaults to &lt;code&gt;0&lt;/code&gt;, and the first page of records is returned. 
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
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
}
