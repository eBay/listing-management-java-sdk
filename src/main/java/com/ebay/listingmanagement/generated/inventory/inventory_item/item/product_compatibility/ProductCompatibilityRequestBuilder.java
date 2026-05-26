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

package com.ebay.listingmanagement.generated.inventory.inventory_item.item.product_compatibility;

import com.ebay.listingmanagement.generated.inventory.models.BaseResponse;
import com.ebay.listingmanagement.generated.inventory.models.Compatibility;
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
 * Builds and executes requests for operations under /inventory_item/{sku}/product_compatibility
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductCompatibilityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ProductCompatibilityRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProductCompatibilityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_item/{sku}/product_compatibility", pathParameters);
    }
    /**
     * Instantiates a new {@link ProductCompatibilityRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProductCompatibilityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_item/{sku}/product_compatibility", rawUrl);
    }
    /**
     * This call is used by the seller to delete the list of products that are compatible with the inventory item that is associated with the compatible product list. The inventory item is identified with a SKU value in the URI. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.
     */
    public void delete() {
        delete(null);
    }
    /**
     * This call is used by the seller to delete the list of products that are compatible with the inventory item that is associated with the compatible product list. The inventory item is identified with a SKU value in the URI. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This call is used by the seller to retrieve the list of products that are compatible with the inventory item. The SKU value for the inventory item is passed into the call URI, and a successful call with return the compatible vehicle list associated with this inventory item. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.
     * @return a {@link Compatibility}
     */
    @jakarta.annotation.Nullable
    public Compatibility get() {
        return get(null);
    }
    /**
     * This call is used by the seller to retrieve the list of products that are compatible with the inventory item. The SKU value for the inventory item is passed into the call URI, and a successful call with return the compatible vehicle list associated with this inventory item. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Compatibility}
     */
    @jakarta.annotation.Nullable
    public Compatibility get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Compatibility::createFromDiscriminatorValue);
    }
    /**
     * This call is used by the seller to create or replace a list of products that are compatible with the inventory item. The inventory item is identified with a SKU value in the URI. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/product_compatibility/methods/createOrReplaceProductCompatibility#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body This type is used by the &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; call to associate compatible vehicles to an inventory item. This type is also the base response of the &lt;strong&gt;getProductCompatibility&lt;/strong&gt; call.
     * @return a {@link BaseResponse}
     */
    @jakarta.annotation.Nullable
    public BaseResponse put(@jakarta.annotation.Nonnull final Compatibility body) {
        return put(body, null);
    }
    /**
     * This call is used by the seller to create or replace a list of products that are compatible with the inventory item. The inventory item is identified with a SKU value in the URI. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/product_compatibility/methods/createOrReplaceProductCompatibility#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body This type is used by the &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; call to associate compatible vehicles to an inventory item. This type is also the base response of the &lt;strong&gt;getProductCompatibility&lt;/strong&gt; call.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BaseResponse}
     */
    @jakarta.annotation.Nullable
    public BaseResponse put(@jakarta.annotation.Nonnull final Compatibility body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BaseResponse::createFromDiscriminatorValue);
    }
    /**
     * This call is used by the seller to delete the list of products that are compatible with the inventory item that is associated with the compatible product list. The inventory item is identified with a SKU value in the URI. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This call is used by the seller to delete the list of products that are compatible with the inventory item that is associated with the compatible product list. The inventory item is identified with a SKU value in the URI. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * This call is used by the seller to retrieve the list of products that are compatible with the inventory item. The SKU value for the inventory item is passed into the call URI, and a successful call with return the compatible vehicle list associated with this inventory item. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call is used by the seller to retrieve the list of products that are compatible with the inventory item. The SKU value for the inventory item is passed into the call URI, and a successful call with return the compatible vehicle list associated with this inventory item. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.
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
     * This call is used by the seller to create or replace a list of products that are compatible with the inventory item. The inventory item is identified with a SKU value in the URI. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/product_compatibility/methods/createOrReplaceProductCompatibility#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body This type is used by the &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; call to associate compatible vehicles to an inventory item. This type is also the base response of the &lt;strong&gt;getProductCompatibility&lt;/strong&gt; call.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final Compatibility body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This call is used by the seller to create or replace a list of products that are compatible with the inventory item. The inventory item is identified with a SKU value in the URI. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all Inventory API calls, this call also requires the &lt;code&gt;Content-Type&lt;/code&gt; and &lt;code&gt;Content-Language&lt;/code&gt; headers. See the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/product_compatibility/methods/createOrReplaceProductCompatibility#h3-request-headers&quot;&gt;HTTP request headers&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body This type is used by the &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; call to associate compatible vehicles to an inventory item. This type is also the base response of the &lt;strong&gt;getProductCompatibility&lt;/strong&gt; call.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final Compatibility body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ProductCompatibilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProductCompatibilityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ProductCompatibilityRequestBuilder(rawUrl, requestAdapter);
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
