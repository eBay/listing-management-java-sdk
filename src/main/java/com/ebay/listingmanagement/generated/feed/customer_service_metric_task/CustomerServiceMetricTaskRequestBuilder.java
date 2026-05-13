package com.ebay.listingmanagement.generated.feed.customer_service_metric_task;

import com.ebay.listingmanagement.generated.feed.customer_service_metric_task.item.WithTaskItemRequestBuilder;
import com.ebay.listingmanagement.generated.feed.models.CreateServiceMetricsTaskRequest;
import com.ebay.listingmanagement.generated.feed.models.CustomerServiceMetricTaskCollection;
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
 * Builds and executes requests for operations under /customer_service_metric_task
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerServiceMetricTaskRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.feed.customer_service_metric_task.item collection
     * @param task_id This path parameter is the unique identifier of the customer service metric task being retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/feed/resources/customer_service_metric_task/methods/getCustomerServiceMetricTasks&quot;&gt;getCustomerServiceMetricTasks&lt;/a&gt; method to retrieve task IDs.
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
     * Instantiates a new {@link CustomerServiceMetricTaskRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomerServiceMetricTaskRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/customer_service_metric_task{?date_range*,feed_type*,limit*,look_back_days*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link CustomerServiceMetricTaskRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomerServiceMetricTaskRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/customer_service_metric_task{?date_range*,feed_type*,limit*,look_back_days*,offset*}", rawUrl);
    }
    /**
     * Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days &lt;/code&gt;or&lt;code&gt; date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link CustomerServiceMetricTaskCollection}
     */
    @jakarta.annotation.Nullable
    public CustomerServiceMetricTaskCollection get() {
        return get(null);
    }
    /**
     * Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days &lt;/code&gt;or&lt;code&gt; date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomerServiceMetricTaskCollection}
     */
    @jakarta.annotation.Nullable
    public CustomerServiceMetricTaskCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CustomerServiceMetricTaskCollection::createFromDiscriminatorValue);
    }
    /**
     * &lt;p&gt;Use this method to create a customer service metrics download task with filter criteria for the customer service metrics report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt; and &lt;strong&gt;filterCriteria&lt;/strong&gt; including both &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; and &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; for the report. The method returns the location response header containing the call URI to use with &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; to retrieve status and details on the task.&lt;/p&gt;&lt;p&gt;Only CURRENT Customer Service Metrics reports can be generated with the Sell Feed API. PROJECTED reports are not supported at this time. See the &lt;a href=&quot;/api-docs/sell/analytics/resources/customer_service_metric/methods/getCustomerServiceMetric&quot;&gt;getCustomerServiceMetric&lt;/a&gt; method document in the Analytics API for more information about these two types of reports.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before calling this API, retrieve the summary of the seller&apos;s performance and rating for the customer service metric by calling &lt;strong&gt;getCustomerServiceMetric&lt;/strong&gt; (part of the &lt;a href=&quot;/api-docs/sell/analytics/resources/methods&quot;&gt;Analytics API&lt;/a&gt;). You can then populate the create task request fields with the values from the response. This technique eliminates failed tasks that request a report for a &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; and &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; that are without evaluation.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for the Customer Service Metric reports generated with the Feed API.
     */
    public void post(@jakarta.annotation.Nonnull final CreateServiceMetricsTaskRequest body) {
        post(body, null);
    }
    /**
     * &lt;p&gt;Use this method to create a customer service metrics download task with filter criteria for the customer service metrics report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt; and &lt;strong&gt;filterCriteria&lt;/strong&gt; including both &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; and &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; for the report. The method returns the location response header containing the call URI to use with &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; to retrieve status and details on the task.&lt;/p&gt;&lt;p&gt;Only CURRENT Customer Service Metrics reports can be generated with the Sell Feed API. PROJECTED reports are not supported at this time. See the &lt;a href=&quot;/api-docs/sell/analytics/resources/customer_service_metric/methods/getCustomerServiceMetric&quot;&gt;getCustomerServiceMetric&lt;/a&gt; method document in the Analytics API for more information about these two types of reports.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before calling this API, retrieve the summary of the seller&apos;s performance and rating for the customer service metric by calling &lt;strong&gt;getCustomerServiceMetric&lt;/strong&gt; (part of the &lt;a href=&quot;/api-docs/sell/analytics/resources/methods&quot;&gt;Analytics API&lt;/a&gt;). You can then populate the create task request fields with the values from the response. This technique eliminates failed tasks that request a report for a &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; and &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; that are without evaluation.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for the Customer Service Metric reports generated with the Feed API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final CreateServiceMetricsTaskRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days &lt;/code&gt;or&lt;code&gt; date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days &lt;/code&gt;or&lt;code&gt; date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;
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
     * &lt;p&gt;Use this method to create a customer service metrics download task with filter criteria for the customer service metrics report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt; and &lt;strong&gt;filterCriteria&lt;/strong&gt; including both &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; and &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; for the report. The method returns the location response header containing the call URI to use with &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; to retrieve status and details on the task.&lt;/p&gt;&lt;p&gt;Only CURRENT Customer Service Metrics reports can be generated with the Sell Feed API. PROJECTED reports are not supported at this time. See the &lt;a href=&quot;/api-docs/sell/analytics/resources/customer_service_metric/methods/getCustomerServiceMetric&quot;&gt;getCustomerServiceMetric&lt;/a&gt; method document in the Analytics API for more information about these two types of reports.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before calling this API, retrieve the summary of the seller&apos;s performance and rating for the customer service metric by calling &lt;strong&gt;getCustomerServiceMetric&lt;/strong&gt; (part of the &lt;a href=&quot;/api-docs/sell/analytics/resources/methods&quot;&gt;Analytics API&lt;/a&gt;). You can then populate the create task request fields with the values from the response. This technique eliminates failed tasks that request a report for a &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; and &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; that are without evaluation.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for the Customer Service Metric reports generated with the Feed API.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateServiceMetricsTaskRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;p&gt;Use this method to create a customer service metrics download task with filter criteria for the customer service metrics report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt; and &lt;strong&gt;filterCriteria&lt;/strong&gt; including both &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; and &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; for the report. The method returns the location response header containing the call URI to use with &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; to retrieve status and details on the task.&lt;/p&gt;&lt;p&gt;Only CURRENT Customer Service Metrics reports can be generated with the Sell Feed API. PROJECTED reports are not supported at this time. See the &lt;a href=&quot;/api-docs/sell/analytics/resources/customer_service_metric/methods/getCustomerServiceMetric&quot;&gt;getCustomerServiceMetric&lt;/a&gt; method document in the Analytics API for more information about these two types of reports.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before calling this API, retrieve the summary of the seller&apos;s performance and rating for the customer service metric by calling &lt;strong&gt;getCustomerServiceMetric&lt;/strong&gt; (part of the &lt;a href=&quot;/api-docs/sell/analytics/resources/methods&quot;&gt;Analytics API&lt;/a&gt;). You can then populate the create task request fields with the values from the response. This technique eliminates failed tasks that request a report for a &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; and &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; that are without evaluation.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for the Customer Service Metric reports generated with the Feed API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateServiceMetricsTaskRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CustomerServiceMetricTaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomerServiceMetricTaskRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CustomerServiceMetricTaskRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days &lt;/code&gt;or&lt;code&gt; date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The task creation date range. The results are filtered to include only tasks with a creation date that is equal to the dates specified or is within the specified range. Do not use with the &lt;code&gt;look_back_days&lt;/code&gt; parameter.&lt;p&gt;&lt;strong&gt;Format: &lt;/strong&gt;UTC&lt;/p&gt;&lt;p&gt;For example, tasks within a range: &lt;/p&gt;&lt;p&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt;&lt;/p&gt;&lt;p&gt;Tasks created on March 8, 2020&lt;/p&gt;&lt;p&gt;&lt;code&gt;2020-03-08T00:00.00.000Z..2020-03-09T00:00:00.000Z&lt;/code&gt;&lt;/p&gt;&lt;p&gt;&lt;b&gt;Maximum: &lt;/b&gt;90 days&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String dateRange;
        /**
         * The feed type associated with the tasks being retrieved. The only presently supported value is &lt;code&gt;CUSTOMER_SERVICE_METRICS_REPORT&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String feedType;
        /**
         * The number of customer service metric tasks to return per page of the result set. Use this parameter in conjunction with the offset parameter to control the pagination of the output. &lt;p&gt;For example, if &lt;strong&gt;offset&lt;/strong&gt; is set to 10 and &lt;strong&gt;limit&lt;/strong&gt; is set to 10, the call retrieves tasks 11 thru 20 from the result set.&lt;/p&gt;&lt;p&gt;If this parameter is omitted, the default value is used.&lt;/p&gt;&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 10 &lt;p&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The number of previous days in which to search for tasks. Do not use with the &lt;code&gt;date_range&lt;/code&gt; parameter. If both &lt;code&gt;date_range&lt;/code&gt; and &lt;code&gt;look_back_days&lt;/code&gt; are omitted, this parameter&apos;s default value is used. &lt;p&gt;&lt;b&gt;Default value:&lt;/b&gt; 7&lt;/p&gt;&lt;p&gt;&lt;b&gt;Range:&lt;/b&gt; 1-90 (inclusive)&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String lookBackDays;
        /**
         * The number of customer service metric tasks to skip in the result set before returning the first task in the paginated response. &lt;p&gt;Combine &lt;strong&gt;offset&lt;/strong&gt; with the &lt;strong&gt;limit&lt;/strong&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;strong&gt;offset&lt;/strong&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;strong&gt;offset&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt;0
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
            allQueryParams.put("date_range", dateRange);
            allQueryParams.put("feed_type", feedType);
            allQueryParams.put("limit", limit);
            allQueryParams.put("look_back_days", lookBackDays);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
