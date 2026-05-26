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

package com.ebay.listingmanagement.generated.stores.store.categories;

import com.ebay.listingmanagement.generated.stores.models.AddStoreCategoryRequestType;
import com.ebay.listingmanagement.generated.stores.models.GetStoreCategoriesResponseType;
import com.ebay.listingmanagement.generated.stores.store.categories.item.WithCategoryItemRequestBuilder;
import com.ebay.listingmanagement.generated.stores.store.categories.move_category.MoveCategoryRequestBuilder;
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
 * Builds and executes requests for operations under /store/categories
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategoriesRequestBuilder extends BaseRequestBuilder {
    /**
     * The move_category property
     * @return a {@link MoveCategoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MoveCategoryRequestBuilder moveCategory() {
        return new MoveCategoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.stores.store.categories.item collection
     * @param category_id The unique identifier of an eBay Store&apos;s custom category. eBay auto-generates this identifier when a seller establishes a custom store category. This category ID should not be confused with an eBay category ID. This is the category that is to be renamed.
     * @return a {@link WithCategoryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCategoryItemRequestBuilder byCategory_id(@jakarta.annotation.Nonnull final String category_id) {
        Objects.requireNonNull(category_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("category_id", category_id);
        return new WithCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CategoriesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CategoriesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/store/categories", pathParameters);
    }
    /**
     * Instantiates a new {@link CategoriesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CategoriesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/store/categories", rawUrl);
    }
    /**
     * This method is used to retrieve the category hierarchy for an eBay user&apos;s store.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported.&lt;/span&gt;
     * @return a {@link GetStoreCategoriesResponseType}
     */
    @jakarta.annotation.Nullable
    public GetStoreCategoriesResponseType get() {
        return get(null);
    }
    /**
     * This method is used to retrieve the category hierarchy for an eBay user&apos;s store.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetStoreCategoriesResponseType}
     */
    @jakarta.annotation.Nullable
    public GetStoreCategoriesResponseType get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetStoreCategoriesResponseType::createFromDiscriminatorValue);
    }
    /**
     * This method is used to add a single new custom category to a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. Call &lt;b&gt;getStoreTask&lt;/b&gt; (or &lt;b&gt;getStoreTasks&lt;/b&gt;) method to retrieve the status of the add category operation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;addStoreCategory&lt;/b&gt; method. It is used to provide the name and location for the new category.
     */
    public void post(@jakarta.annotation.Nonnull final AddStoreCategoryRequestType body) {
        post(body, null);
    }
    /**
     * This method is used to add a single new custom category to a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. Call &lt;b&gt;getStoreTask&lt;/b&gt; (or &lt;b&gt;getStoreTasks&lt;/b&gt;) method to retrieve the status of the add category operation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;addStoreCategory&lt;/b&gt; method. It is used to provide the name and location for the new category.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final AddStoreCategoryRequestType body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method is used to retrieve the category hierarchy for an eBay user&apos;s store.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method is used to retrieve the category hierarchy for an eBay user&apos;s store.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported.&lt;/span&gt;
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
     * This method is used to add a single new custom category to a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. Call &lt;b&gt;getStoreTask&lt;/b&gt; (or &lt;b&gt;getStoreTasks&lt;/b&gt;) method to retrieve the status of the add category operation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;addStoreCategory&lt;/b&gt; method. It is used to provide the name and location for the new category.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddStoreCategoryRequestType body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used to add a single new custom category to a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. Call &lt;b&gt;getStoreTask&lt;/b&gt; (or &lt;b&gt;getStoreTasks&lt;/b&gt;) method to retrieve the status of the add category operation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;addStoreCategory&lt;/b&gt; method. It is used to provide the name and location for the new category.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddStoreCategoryRequestType body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CategoriesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CategoriesRequestBuilder(rawUrl, requestAdapter);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
