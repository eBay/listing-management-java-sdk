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

package com.ebay.listingmanagement.generated.stores.store.categories.item;

import com.ebay.listingmanagement.generated.stores.models.DeleteStoreCategoryRequestType;
import com.ebay.listingmanagement.generated.stores.models.RenameStoreCategoryRequestType;
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
 * Builds and executes requests for operations under /store/categories/{category_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCategoryItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithCategoryItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCategoryItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/store/categories/{category_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCategoryItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCategoryItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/store/categories/{category_id}", rawUrl);
    }
    /**
     * This method is used to delete one custom category of a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. Call &lt;b&gt;getStoreTask&lt;/b&gt; (or &lt;b&gt;getStoreTasks&lt;/b&gt;) method to retrieve the status of the delete category operation.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;deleteStoreCategory&lt;/b&gt; method. It is used to provide a new category home for the listings that are currently in the store category to be deleted.
     */
    public void delete(@jakarta.annotation.Nonnull final DeleteStoreCategoryRequestType body) {
        delete(body, null);
    }
    /**
     * This method is used to delete one custom category of a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. Call &lt;b&gt;getStoreTask&lt;/b&gt; (or &lt;b&gt;getStoreTasks&lt;/b&gt;) method to retrieve the status of the delete category operation.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;deleteStoreCategory&lt;/b&gt; method. It is used to provide a new category home for the listings that are currently in the store category to be deleted.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nonnull final DeleteStoreCategoryRequestType body, @jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toDeleteRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method is used to rename the single category of a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. The user calls &lt;b&gt;getStoreTask&lt;/b&gt; to retrieve the status of the rename category operation.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;renameStoreCategory&lt;/b&gt; method. It is used to rename a customized eBay Store category.
     */
    public void put(@jakarta.annotation.Nonnull final RenameStoreCategoryRequestType body) {
        put(body, null);
    }
    /**
     * This method is used to rename the single category of a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. The user calls &lt;b&gt;getStoreTask&lt;/b&gt; to retrieve the status of the rename category operation.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;renameStoreCategory&lt;/b&gt; method. It is used to rename a customized eBay Store category.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void put(@jakarta.annotation.Nonnull final RenameStoreCategoryRequestType body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method is used to delete one custom category of a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. Call &lt;b&gt;getStoreTask&lt;/b&gt; (or &lt;b&gt;getStoreTasks&lt;/b&gt;) method to retrieve the status of the delete category operation.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;deleteStoreCategory&lt;/b&gt; method. It is used to provide a new category home for the listings that are currently in the store category to be deleted.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nonnull final DeleteStoreCategoryRequestType body) {
        return toDeleteRequestInformation(body, null);
    }
    /**
     * This method is used to delete one custom category of a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. Call &lt;b&gt;getStoreTask&lt;/b&gt; (or &lt;b&gt;getStoreTasks&lt;/b&gt;) method to retrieve the status of the delete category operation.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;deleteStoreCategory&lt;/b&gt; method. It is used to provide a new category home for the listings that are currently in the store category to be deleted.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nonnull final DeleteStoreCategoryRequestType body, @jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * This method is used to rename the single category of a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. The user calls &lt;b&gt;getStoreTask&lt;/b&gt; to retrieve the status of the rename category operation.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;renameStoreCategory&lt;/b&gt; method. It is used to rename a customized eBay Store category.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final RenameStoreCategoryRequestType body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method is used to rename the single category of a user&apos;s eBay store through an asynchronous request. A successful call returns the &lt;b&gt;getStoreTask&lt;/b&gt; URI in the Location response header. The user calls &lt;b&gt;getStoreTask&lt;/b&gt; to retrieve the status of the rename category operation.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; If you initiate a category change, you cannot make additional category changes until the previous change request has completed. Use getStoreTask (or getStoreTasks) method to get latest status of your last request.&lt;/p&gt;&lt;/div&gt;
     * @param body The base request type of the &lt;b&gt;renameStoreCategory&lt;/b&gt; method. It is used to rename a customized eBay Store category.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final RenameStoreCategoryRequestType body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithCategoryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCategoryItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithCategoryItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
