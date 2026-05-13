package com.ebay.listingmanagement.generated.feed.task;

import com.ebay.listingmanagement.generated.feed.models.CreateTaskRequest;
import com.ebay.listingmanagement.generated.feed.models.TaskCollection;
import com.ebay.listingmanagement.generated.feed.task.item.WithTaskItemRequestBuilder;
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
 * Builds and executes requests for operations under /task
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.feed.task.item collection
     * @param task_id This path parameter is the unique identifier of the task being retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/feed/resources/task/methods/getTasks&quot; target=&quot;_blank &quot;&gt;getTasks&lt;/a&gt; method to retrieve task IDs.
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
     * Instantiates a new {@link TaskRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/task{?date_range*,feed_type*,limit*,look_back_days*,offset*,schedule_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link TaskRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/task{?date_range*,feed_type*,limit*,look_back_days*,offset*,schedule_id*}", rawUrl);
    }
    /**
     * This method returns the details and status for an array of tasks based on a specified &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;schedule_id&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which tasks are returned by specifying filters, such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. Also, by specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, both on-demand and scheduled reports are returned.&lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;schedule_id&lt;/strong&gt;, the schedule template (that the schedule ID is based on) determines which tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;scheduledId&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;. 
     * @return a {@link TaskCollection}
     */
    @jakarta.annotation.Nullable
    public TaskCollection get() {
        return get(null);
    }
    /**
     * This method returns the details and status for an array of tasks based on a specified &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;schedule_id&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which tasks are returned by specifying filters, such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. Also, by specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, both on-demand and scheduled reports are returned.&lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;schedule_id&lt;/strong&gt;, the schedule template (that the schedule ID is based on) determines which tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;scheduledId&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;. 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TaskCollection}
     */
    @jakarta.annotation.Nullable
    public TaskCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, TaskCollection::createFromDiscriminatorValue);
    }
    /**
     * This method creates an upload task or a download task without filter criteria. When using this method, specify the &lt;b&gt; feedType&lt;/b&gt; and the feed file &lt;b&gt; schemaVersion&lt;/b&gt;. The feed type specified sets the task as a download or an upload task.  &lt;p&gt;For details about the upload and download flows, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide.&lt;/p&gt;&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;The following list contains this method&apos;s authorization scopes and their corresponding feed types:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.inventory: See &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.fulfillment: LMS_ORDER_ACK (specify for upload tasks). Also see &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.marketing: None*&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/commerce.catalog.readonly: None*&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;* Reserved for future release&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;b&gt; createTask&lt;/b&gt; method.
     */
    public void post(@jakarta.annotation.Nonnull final CreateTaskRequest body) {
        post(body, null);
    }
    /**
     * This method creates an upload task or a download task without filter criteria. When using this method, specify the &lt;b&gt; feedType&lt;/b&gt; and the feed file &lt;b&gt; schemaVersion&lt;/b&gt;. The feed type specified sets the task as a download or an upload task.  &lt;p&gt;For details about the upload and download flows, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide.&lt;/p&gt;&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;The following list contains this method&apos;s authorization scopes and their corresponding feed types:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.inventory: See &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.fulfillment: LMS_ORDER_ACK (specify for upload tasks). Also see &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.marketing: None*&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/commerce.catalog.readonly: None*&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;* Reserved for future release&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;b&gt; createTask&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final CreateTaskRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method returns the details and status for an array of tasks based on a specified &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;schedule_id&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which tasks are returned by specifying filters, such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. Also, by specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, both on-demand and scheduled reports are returned.&lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;schedule_id&lt;/strong&gt;, the schedule template (that the schedule ID is based on) determines which tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;scheduledId&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;. 
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns the details and status for an array of tasks based on a specified &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;schedule_id&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which tasks are returned by specifying filters, such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. Also, by specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, both on-demand and scheduled reports are returned.&lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;schedule_id&lt;/strong&gt;, the schedule template (that the schedule ID is based on) determines which tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;scheduledId&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;. 
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
     * This method creates an upload task or a download task without filter criteria. When using this method, specify the &lt;b&gt; feedType&lt;/b&gt; and the feed file &lt;b&gt; schemaVersion&lt;/b&gt;. The feed type specified sets the task as a download or an upload task.  &lt;p&gt;For details about the upload and download flows, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide.&lt;/p&gt;&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;The following list contains this method&apos;s authorization scopes and their corresponding feed types:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.inventory: See &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.fulfillment: LMS_ORDER_ACK (specify for upload tasks). Also see &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.marketing: None*&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/commerce.catalog.readonly: None*&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;* Reserved for future release&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;b&gt; createTask&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateTaskRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates an upload task or a download task without filter criteria. When using this method, specify the &lt;b&gt; feedType&lt;/b&gt; and the feed file &lt;b&gt; schemaVersion&lt;/b&gt;. The feed type specified sets the task as a download or an upload task.  &lt;p&gt;For details about the upload and download flows, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide.&lt;/p&gt;&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;The following list contains this method&apos;s authorization scopes and their corresponding feed types:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.inventory: See &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.fulfillment: LMS_ORDER_ACK (specify for upload tasks). Also see &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.marketing: None*&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/commerce.catalog.readonly: None*&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;* Reserved for future release&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;b&gt; createTask&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateTaskRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link TaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TaskRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TaskRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns the details and status for an array of tasks based on a specified &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;schedule_id&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which tasks are returned by specifying filters, such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. Also, by specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, both on-demand and scheduled reports are returned.&lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;schedule_id&lt;/strong&gt;, the schedule template (that the schedule ID is based on) determines which tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;scheduledId&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;. 
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Specifies the range of task creation dates used to filter the results. The results are filtered to include only tasks with a creation date that is equal to this date or is within specified range. Only tasks that are less than 90 days can be retrieved. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Maximum date range window size is 90 days.&lt;/span&gt;&lt;/p&gt; &lt;br /&gt;&lt;b&gt;Valid Format (UTC):&lt;/b&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example: Tasks created on September 8, 2019&lt;br /&gt; &lt;code&gt;2019-09-08T00:00:00.000Z..2019-09-09T00:00:00.000Z&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String dateRange;
        /**
         * The feed type associated with the tasks to be returned. Only use a &lt;strong&gt;feedType&lt;/strong&gt; that is available for your API: &lt;ul&gt;&lt;li&gt;Order Feeds: &lt;code&gt;LMS_ORDER_ACK, LMS_ORDER_REPORT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;Inventory Upload Feed Types: See &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;Available FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;Do not use with the &lt;strong&gt;schedule_id&lt;/strong&gt; parameter. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.
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
         * The unique identifier associated with the tasks being returned. A schedule periodically generates a report for the feed type specified by the schedule template.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;Do not use with the &lt;strong&gt;feed_type&lt;/strong&gt; parameter.
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
