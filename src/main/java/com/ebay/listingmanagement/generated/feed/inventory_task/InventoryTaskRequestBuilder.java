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

package com.ebay.listingmanagement.generated.feed.inventory_task;

import com.ebay.listingmanagement.generated.feed.inventory_task.item.WithTaskItemRequestBuilder;
import com.ebay.listingmanagement.generated.feed.models.CreateInventoryTaskRequest;
import com.ebay.listingmanagement.generated.feed.models.InventoryTaskCollection;
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
 * Builds and executes requests for operations under /inventory_task
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryTaskRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.feed.inventory_task.item collection
     * @param task_id This path parameter is the unique identifier of the inventory task being retrieved.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/api-docs/sell/feed/resources/inventory_task/methods/getInventoryTasks&quot;&gt;getInventoryTasks&lt;/a&gt; method to retrieve inventory task IDs.
     * @return a {@link WithTaskItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTaskItemRequestBuilder byTask_id(@jakarta.annotation.Nonnull final String task_id) {
        Objects.requireNonNull(task_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("task_id", task_id);
        return new WithTaskItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link InventoryTaskRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InventoryTaskRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_task{?date_range*,feed_type*,limit*,look_back_days*,offset*,schedule_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link InventoryTaskRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InventoryTaskRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/inventory_task{?date_range*,feed_type*,limit*,look_back_days*,offset*,schedule_id*}", rawUrl);
    }
    /**
     * This method searches for multiple tasks of a specific feed type, and includes date filters and pagination.
     * @return a {@link InventoryTaskCollection}
     */
    @jakarta.annotation.Nullable
    public InventoryTaskCollection get() {
        return get(null);
    }
    /**
     * This method searches for multiple tasks of a specific feed type, and includes date filters and pagination.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InventoryTaskCollection}
     */
    @jakarta.annotation.Nullable
    public InventoryTaskCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, InventoryTaskCollection::createFromDiscriminatorValue);
    }
    /**
     * This method creates an inventory-related download task for a specified feed type with optional filter criteria. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt;. &lt;br/&gt;&lt;br/&gt;This method returns the location response header containing the &lt;strong&gt;getInventoryTask&lt;/strong&gt; call URI to retrieve the inventory task you just created. The URL includes the eBay-assigned task ID, which you can use to reference the inventory task.&lt;br/&gt;&lt;br/&gt;To retrieve the status of the task, use the &lt;strong&gt;getInventoryTask&lt;/strong&gt; method to retrieve a single task ID or the &lt;strong&gt;getInventoryTasks&lt;/strong&gt; method to retrieve multiple task IDs.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;Presently, this method supports Active Inventory Report. The &lt;strong&gt;ActiveInventoryReport&lt;/strong&gt; returns a report that contains price and quantity information for all of the active listings for a specific seller. A seller can use this information to maintain their inventory on eBay.
     * @param body This type defines inventory-related download task request fields.
     */
    public void post(@jakarta.annotation.Nonnull final CreateInventoryTaskRequest body) {
        post(body, null);
    }
    /**
     * This method creates an inventory-related download task for a specified feed type with optional filter criteria. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt;. &lt;br/&gt;&lt;br/&gt;This method returns the location response header containing the &lt;strong&gt;getInventoryTask&lt;/strong&gt; call URI to retrieve the inventory task you just created. The URL includes the eBay-assigned task ID, which you can use to reference the inventory task.&lt;br/&gt;&lt;br/&gt;To retrieve the status of the task, use the &lt;strong&gt;getInventoryTask&lt;/strong&gt; method to retrieve a single task ID or the &lt;strong&gt;getInventoryTasks&lt;/strong&gt; method to retrieve multiple task IDs.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;Presently, this method supports Active Inventory Report. The &lt;strong&gt;ActiveInventoryReport&lt;/strong&gt; returns a report that contains price and quantity information for all of the active listings for a specific seller. A seller can use this information to maintain their inventory on eBay.
     * @param body This type defines inventory-related download task request fields.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final CreateInventoryTaskRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method searches for multiple tasks of a specific feed type, and includes date filters and pagination.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method searches for multiple tasks of a specific feed type, and includes date filters and pagination.
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
     * This method creates an inventory-related download task for a specified feed type with optional filter criteria. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt;. &lt;br/&gt;&lt;br/&gt;This method returns the location response header containing the &lt;strong&gt;getInventoryTask&lt;/strong&gt; call URI to retrieve the inventory task you just created. The URL includes the eBay-assigned task ID, which you can use to reference the inventory task.&lt;br/&gt;&lt;br/&gt;To retrieve the status of the task, use the &lt;strong&gt;getInventoryTask&lt;/strong&gt; method to retrieve a single task ID or the &lt;strong&gt;getInventoryTasks&lt;/strong&gt; method to retrieve multiple task IDs.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;Presently, this method supports Active Inventory Report. The &lt;strong&gt;ActiveInventoryReport&lt;/strong&gt; returns a report that contains price and quantity information for all of the active listings for a specific seller. A seller can use this information to maintain their inventory on eBay.
     * @param body This type defines inventory-related download task request fields.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateInventoryTaskRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates an inventory-related download task for a specified feed type with optional filter criteria. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt;. &lt;br/&gt;&lt;br/&gt;This method returns the location response header containing the &lt;strong&gt;getInventoryTask&lt;/strong&gt; call URI to retrieve the inventory task you just created. The URL includes the eBay-assigned task ID, which you can use to reference the inventory task.&lt;br/&gt;&lt;br/&gt;To retrieve the status of the task, use the &lt;strong&gt;getInventoryTask&lt;/strong&gt; method to retrieve a single task ID or the &lt;strong&gt;getInventoryTasks&lt;/strong&gt; method to retrieve multiple task IDs.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;Presently, this method supports Active Inventory Report. The &lt;strong&gt;ActiveInventoryReport&lt;/strong&gt; returns a report that contains price and quantity information for all of the active listings for a specific seller. A seller can use this information to maintain their inventory on eBay.
     * @param body This type defines inventory-related download task request fields.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateInventoryTaskRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link InventoryTaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InventoryTaskRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InventoryTaskRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method searches for multiple tasks of a specific feed type, and includes date filters and pagination.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Specifies the range of task creation dates used to filter the results. The results are filtered to include only tasks with a creation date that is equal to this date or is within specified range. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Maximum date range window size is 90 days.&lt;/span&gt;&lt;/p&gt;&lt;br /&gt;&lt;b&gt;Valid Format (UTC): &lt;/b&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example: Tasks created on March 31, 2021&lt;br /&gt; &lt;code&gt;2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;
         */
        @jakarta.annotation.Nullable
        public String dateRange;
        /**
         * The feed type associated with the inventory tasks being retrieved. Presently, only one feed type is available:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;See &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#merchant-data-reports-download-feed-types&quot; target=&quot;_blank&quot;&gt;Report value feed types&lt;/a&gt; for more information.
         */
        @jakarta.annotation.Nullable
        public String feedType;
        /**
         * The maximum number of tasks that can be returned on each page of the paginated response. Use this parameter in conjunction with the &lt;strong&gt;offset&lt;/strong&gt; parameter to control the pagination of the output. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;For example, if &lt;strong&gt;offset&lt;/strong&gt; is set to 10 and &lt;strong&gt;limit&lt;/strong&gt; is set to 10, the call retrieves tasks 11 thru 20 from the result set.&lt;/p&gt;&lt;p&gt;If this parameter is omitted, the default value is used. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt; 10 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt;500
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The number of previous days in which to search for tasks. Do not use with the &lt;code&gt;date_range&lt;/code&gt; parameter. If both &lt;code&gt;date_range&lt;/code&gt; and &lt;code&gt;look_back_days&lt;/code&gt; are omitted, this parameter&apos;s default value is used.  &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt; 7 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Range: &lt;/b&gt; 1-90 (inclusive)
         */
        @jakarta.annotation.Nullable
        public String lookBackDays;
        /**
         * The number of tasks to skip in the result set before returning the first task in the paginated response. &lt;p&gt;Combine &lt;strong&gt;offset&lt;/strong&gt; with the &lt;strong&gt;limit&lt;/strong&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;strong&gt;offset&lt;/strong&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;strong&gt;offset&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set. If this query parameter is not set, the default value is used and the first page of records is returned. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt;0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Schedule functionality for ActiveInventoryReport is currently unavailable, so this field is not usable.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String scheduleId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("date_range", dateRange);
            allQueryParams.put("feed_type", feedType);
            allQueryParams.put("limit", limit);
            allQueryParams.put("look_back_days", lookBackDays);
            allQueryParams.put("offset", offset);
            allQueryParams.put("schedule_id", scheduleId);
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
