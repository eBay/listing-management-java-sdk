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

package com.ebay.listingmanagement.generated.inventory.bulk_get_inventory_item;

import com.ebay.listingmanagement.generated.inventory.models.BulkGetInventoryItem;
import com.ebay.listingmanagement.generated.inventory.models.BulkGetInventoryItemResponse;
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
 * Builds and executes requests for operations under /bulk_get_inventory_item
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkGetInventoryItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkGetInventoryItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkGetInventoryItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_get_inventory_item", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkGetInventoryItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkGetInventoryItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_get_inventory_item", rawUrl);
    }
    /**
     * This call retrieves up to 25 inventory item records. The SKU value of each inventory item record to retrieve is specified in the request payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; header. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkGetInventoryItem#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;&lt;br&gt;For those who prefer to retrieve only one inventory item record by SKU value, the &lt;strong&gt;getInventoryItem&lt;/strong&gt; method can be used. To retrieve all inventory item records defined on the seller&apos;s account, the &lt;strong&gt;getInventoryItems&lt;/strong&gt; method can be used (with pagination control if desired).
     * @param body This type is used by the base request of the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method.
     * @return a {@link BulkGetInventoryItemResponse}
     */
    @jakarta.annotation.Nullable
    public BulkGetInventoryItemResponse post(@jakarta.annotation.Nonnull final BulkGetInventoryItem body) {
        return post(body, null);
    }
    /**
     * This call retrieves up to 25 inventory item records. The SKU value of each inventory item record to retrieve is specified in the request payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; header. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkGetInventoryItem#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;&lt;br&gt;For those who prefer to retrieve only one inventory item record by SKU value, the &lt;strong&gt;getInventoryItem&lt;/strong&gt; method can be used. To retrieve all inventory item records defined on the seller&apos;s account, the &lt;strong&gt;getInventoryItems&lt;/strong&gt; method can be used (with pagination control if desired).
     * @param body This type is used by the base request of the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkGetInventoryItemResponse}
     */
    @jakarta.annotation.Nullable
    public BulkGetInventoryItemResponse post(@jakarta.annotation.Nonnull final BulkGetInventoryItem body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BulkGetInventoryItemResponse::createFromDiscriminatorValue);
    }
    /**
     * This call retrieves up to 25 inventory item records. The SKU value of each inventory item record to retrieve is specified in the request payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; header. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkGetInventoryItem#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;&lt;br&gt;For those who prefer to retrieve only one inventory item record by SKU value, the &lt;strong&gt;getInventoryItem&lt;/strong&gt; method can be used. To retrieve all inventory item records defined on the seller&apos;s account, the &lt;strong&gt;getInventoryItems&lt;/strong&gt; method can be used (with pagination control if desired).
     * @param body This type is used by the base request of the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkGetInventoryItem body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This call retrieves up to 25 inventory item records. The SKU value of each inventory item record to retrieve is specified in the request payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; header. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkGetInventoryItem#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;&lt;br&gt;For those who prefer to retrieve only one inventory item record by SKU value, the &lt;strong&gt;getInventoryItem&lt;/strong&gt; method can be used. To retrieve all inventory item records defined on the seller&apos;s account, the &lt;strong&gt;getInventoryItems&lt;/strong&gt; method can be used (with pagination control if desired).
     * @param body This type is used by the base request of the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkGetInventoryItem body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BulkGetInventoryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkGetInventoryItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkGetInventoryItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
