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

package com.ebay.listingmanagement.generated.feed.order_task;

import com.ebay.listingmanagement.generated.feed.models.CreateOrderTaskRequest;
import com.ebay.listingmanagement.generated.feed.models.Error;
import com.ebay.listingmanagement.generated.feed.models.OrderTaskCollection;
import com.ebay.listingmanagement.generated.feed.order_task.item.WithTaskItemRequestBuilder;
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
 * Builds and executes requests for operations under /order_task
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderTaskRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.feed.order_task.item collection
     * @param task_id This path parameter is the unique identifier of the order task being retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/feed_api#sell-feed_api-inventory_task-getinventorytasks&quot; target=&quot;_blank&quot;&gt;getOrderTasks&lt;/a&gt; method to retrieve order task IDs.
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
     * Instantiates a new {@link OrderTaskRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrderTaskRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order_task{?date_range*,feed_type*,limit*,look_back_days*,offset*,schedule_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link OrderTaskRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrderTaskRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order_task{?date_range*,feed_type*,limit*,look_back_days*,offset*,schedule_id*}", rawUrl);
    }
    /**
     * This method returns the details and status for an array of order tasks. Rather than using a request payload, it does this through specified input in query parameters, such as &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;schedule_id&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which order tasks are returned by specifying filters such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;schedule_id&lt;/strong&gt;, the schedule template (that the &lt;strong&gt;schedule_id&lt;/strong&gt; is based on) determines which order tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;schedule_id&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;.
     * @return a {@link OrderTaskCollection}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public OrderTaskCollection get() {
        return get(null);
    }
    /**
     * This method returns the details and status for an array of order tasks. Rather than using a request payload, it does this through specified input in query parameters, such as &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;schedule_id&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which order tasks are returned by specifying filters such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;schedule_id&lt;/strong&gt;, the schedule template (that the &lt;strong&gt;schedule_id&lt;/strong&gt; is based on) determines which order tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;schedule_id&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrderTaskCollection}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public OrderTaskCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("401", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrderTaskCollection::createFromDiscriminatorValue);
    }
    /**
     * This method creates an order download task with filter criteria for the order report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt;, &lt;strong&gt;schemaVersion&lt;/strong&gt;, and &lt;strong&gt;filterCriteria&lt;/strong&gt; for the report. The method returns the &lt;strong&gt;location&lt;/strong&gt; response header containing the &lt;strong&gt;getOrderTask&lt;/strong&gt; call URI to retrieve the order task you just created. The URL includes the eBay-assigned task ID, which you can use to reference the order task. &lt;br /&gt;&lt;br /&gt;To retrieve the status of the task, use the &lt;strong&gt;getOrderTask&lt;/strong&gt; method to retrieve a single task ID or the &lt;strong&gt;getOrderTasks&lt;/strong&gt; method to retrieve multiple order task IDs.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;The following contains this method&apos;s authorization scope and its corresponding feed type:&lt;ul&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.fulfillment: LMS_ORDER_REPORT&lt;/li&gt;&lt;/ul&gt; &lt;/p&gt;&lt;p&gt;For details about how this method is used, see &lt;a href=&quot;/api-docs/sell/static/feed/general-feed-tasks.html&quot; target=&quot;_blank&quot;&gt;General feed types&lt;/a&gt; in the Selling Integration Guide. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the &lt;strong&gt;createOrderTask&lt;/strong&gt; method only supports order creation date filters and not modified order date filters. Do not include the &lt;strong&gt;modifiedDateRange&lt;/strong&gt; filter in your request payload.&lt;/span&gt;&lt;/p&gt;
     * @param body description not needed
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final CreateOrderTaskRequest body) {
        post(body, null);
    }
    /**
     * This method creates an order download task with filter criteria for the order report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt;, &lt;strong&gt;schemaVersion&lt;/strong&gt;, and &lt;strong&gt;filterCriteria&lt;/strong&gt; for the report. The method returns the &lt;strong&gt;location&lt;/strong&gt; response header containing the &lt;strong&gt;getOrderTask&lt;/strong&gt; call URI to retrieve the order task you just created. The URL includes the eBay-assigned task ID, which you can use to reference the order task. &lt;br /&gt;&lt;br /&gt;To retrieve the status of the task, use the &lt;strong&gt;getOrderTask&lt;/strong&gt; method to retrieve a single task ID or the &lt;strong&gt;getOrderTasks&lt;/strong&gt; method to retrieve multiple order task IDs.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;The following contains this method&apos;s authorization scope and its corresponding feed type:&lt;ul&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.fulfillment: LMS_ORDER_REPORT&lt;/li&gt;&lt;/ul&gt; &lt;/p&gt;&lt;p&gt;For details about how this method is used, see &lt;a href=&quot;/api-docs/sell/static/feed/general-feed-tasks.html&quot; target=&quot;_blank&quot;&gt;General feed types&lt;/a&gt; in the Selling Integration Guide. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the &lt;strong&gt;createOrderTask&lt;/strong&gt; method only supports order creation date filters and not modified order date filters. Do not include the &lt;strong&gt;modifiedDateRange&lt;/strong&gt; filter in your request payload.&lt;/span&gt;&lt;/p&gt;
     * @param body description not needed
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final CreateOrderTaskRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("401", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method returns the details and status for an array of order tasks. Rather than using a request payload, it does this through specified input in query parameters, such as &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;schedule_id&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which order tasks are returned by specifying filters such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;schedule_id&lt;/strong&gt;, the schedule template (that the &lt;strong&gt;schedule_id&lt;/strong&gt; is based on) determines which order tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;schedule_id&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns the details and status for an array of order tasks. Rather than using a request payload, it does this through specified input in query parameters, such as &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;schedule_id&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which order tasks are returned by specifying filters such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;schedule_id&lt;/strong&gt;, the schedule template (that the &lt;strong&gt;schedule_id&lt;/strong&gt; is based on) determines which order tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;schedule_id&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;.
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
     * This method creates an order download task with filter criteria for the order report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt;, &lt;strong&gt;schemaVersion&lt;/strong&gt;, and &lt;strong&gt;filterCriteria&lt;/strong&gt; for the report. The method returns the &lt;strong&gt;location&lt;/strong&gt; response header containing the &lt;strong&gt;getOrderTask&lt;/strong&gt; call URI to retrieve the order task you just created. The URL includes the eBay-assigned task ID, which you can use to reference the order task. &lt;br /&gt;&lt;br /&gt;To retrieve the status of the task, use the &lt;strong&gt;getOrderTask&lt;/strong&gt; method to retrieve a single task ID or the &lt;strong&gt;getOrderTasks&lt;/strong&gt; method to retrieve multiple order task IDs.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;The following contains this method&apos;s authorization scope and its corresponding feed type:&lt;ul&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.fulfillment: LMS_ORDER_REPORT&lt;/li&gt;&lt;/ul&gt; &lt;/p&gt;&lt;p&gt;For details about how this method is used, see &lt;a href=&quot;/api-docs/sell/static/feed/general-feed-tasks.html&quot; target=&quot;_blank&quot;&gt;General feed types&lt;/a&gt; in the Selling Integration Guide. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the &lt;strong&gt;createOrderTask&lt;/strong&gt; method only supports order creation date filters and not modified order date filters. Do not include the &lt;strong&gt;modifiedDateRange&lt;/strong&gt; filter in your request payload.&lt;/span&gt;&lt;/p&gt;
     * @param body description not needed
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateOrderTaskRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates an order download task with filter criteria for the order report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt;, &lt;strong&gt;schemaVersion&lt;/strong&gt;, and &lt;strong&gt;filterCriteria&lt;/strong&gt; for the report. The method returns the &lt;strong&gt;location&lt;/strong&gt; response header containing the &lt;strong&gt;getOrderTask&lt;/strong&gt; call URI to retrieve the order task you just created. The URL includes the eBay-assigned task ID, which you can use to reference the order task. &lt;br /&gt;&lt;br /&gt;To retrieve the status of the task, use the &lt;strong&gt;getOrderTask&lt;/strong&gt; method to retrieve a single task ID or the &lt;strong&gt;getOrderTasks&lt;/strong&gt; method to retrieve multiple order task IDs.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;The following contains this method&apos;s authorization scope and its corresponding feed type:&lt;ul&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.fulfillment: LMS_ORDER_REPORT&lt;/li&gt;&lt;/ul&gt; &lt;/p&gt;&lt;p&gt;For details about how this method is used, see &lt;a href=&quot;/api-docs/sell/static/feed/general-feed-tasks.html&quot; target=&quot;_blank&quot;&gt;General feed types&lt;/a&gt; in the Selling Integration Guide. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the &lt;strong&gt;createOrderTask&lt;/strong&gt; method only supports order creation date filters and not modified order date filters. Do not include the &lt;strong&gt;modifiedDateRange&lt;/strong&gt; filter in your request payload.&lt;/span&gt;&lt;/p&gt;
     * @param body description not needed
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateOrderTaskRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link OrderTaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderTaskRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OrderTaskRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns the details and status for an array of order tasks. Rather than using a request payload, it does this through specified input in query parameters, such as &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;schedule_id&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which order tasks are returned by specifying filters such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;schedule_id&lt;/strong&gt;, the schedule template (that the &lt;strong&gt;schedule_id&lt;/strong&gt; is based on) determines which order tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;schedule_id&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The order tasks creation date range. This range is used to filter the results. The filtered results include only tasks with a creation date that is equal to this date or is within the specified range. Only orders less than 90 days old can be retrieved. Do not use with the &lt;strong&gt;look_back_days&lt;/strong&gt; parameter. &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Format: &lt;/strong&gt;UTC   &lt;br /&gt;&lt;br /&gt; &lt;strong&gt; For example: &lt;/strong&gt; &lt;br /&gt;&lt;br /&gt;Tasks within a range  &lt;br /&gt; &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt; Tasks created on September 8, 2019&lt;br /&gt; &lt;code&gt;2019-09-08T00:00:00.000Z..2019-09-09T00:00:00.000Z&lt;/code&gt;&lt;br /&gt;
         */
        @jakarta.annotation.Nullable
        public String dateRange;
        /**
         * The feed type associated with the order tasks being retrieved. The only presently supported value is &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#merchant-data-reports-download-feed-types&quot;&gt;Report download feed types&lt;/a&gt; for more information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Do not use with the &lt;strong&gt;schedule_id&lt;/strong&gt; parameter. Doing so will result in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;. This parameter is required if the &lt;strong&gt;schedule_id&lt;/strong&gt; parameter is not specified.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String feedType;
        /**
         * The maximum number of order tasks that can be returned on each page of the paginated response. Use this parameter in conjunction with the &lt;strong&gt;offset&lt;/strong&gt; parameter to control the pagination of the output. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;For example, if &lt;strong&gt;offset&lt;/strong&gt; is set to 10 and &lt;strong&gt;limit&lt;/strong&gt; is set to 10, the call retrieves order tasks 11 thru 20 from the result set.&lt;/p&gt;&lt;p&gt;If this parameter is omitted, the default value is used.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Default:&lt;/strong&gt; 10 &lt;p&gt;&lt;strong&gt;Maximum:&lt;/strong&gt; 500&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * The number of previous days in which to search for tasks. Do not use with the &lt;strong&gt;date_range&lt;/strong&gt; parameter. If both &lt;strong&gt;date_range&lt;/strong&gt; and &lt;strong&gt;look_back_days&lt;/strong&gt; are omitted, this parameter&apos;s default value is used.  &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Default: &lt;/strong&gt; 7 &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Range: &lt;/strong&gt; 1-90 (inclusive)  
         */
        @jakarta.annotation.Nullable
        public Integer lookBackDays;
        /**
         * The number of order tasks to skip in the result set before returning the first order in the paginated response. &lt;p&gt;Combine &lt;strong&gt;offset&lt;/strong&gt; with the &lt;strong&gt;limit&lt;/strong&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;strong&gt;offset&lt;/strong&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;strong&gt;offset&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set. If this query parameter is not set, the default value is used and the first page of records is returned.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Default: &lt;/strong&gt;0
         */
        @jakarta.annotation.Nullable
        public Integer offset;
        /**
         * The schedule ID associated with the order tasks being retrieved. A schedule periodically generates a report, and these schedules can be created with the &lt;a href=&quot;/develop/api/sell/feed_api#method-schedule-createSchedule&quot; target=&quot;_blank&quot;&gt;createSchedule&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Do not use with the &lt;strong&gt;feed_type&lt;/strong&gt; parameter. Doing so will result in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;. This parameter is required if the &lt;strong&gt;feed_type&lt;/strong&gt; parameter is not specified.&lt;/span&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/feed_api#method-schedule-getSchedules&quot; target=&quot;_blank&quot;&gt;getSchedules&lt;/a&gt; method to retrieve schedule IDs.
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
