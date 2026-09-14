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

package com.ebay.listingmanagement.generated.feed.customer_service_metric_task;

import com.ebay.listingmanagement.generated.feed.customer_service_metric_task.item.WithTaskItemRequestBuilder;
import com.ebay.listingmanagement.generated.feed.models.CreateServiceMetricsTaskRequest;
import com.ebay.listingmanagement.generated.feed.models.CustomerServiceMetricTaskCollection;
import com.ebay.listingmanagement.generated.feed.models.ErrorResponse;
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
     * @param task_id This path parameter is the unique identifier of the customer service metric task being retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/feed_api#sell-feed_api-customer_service_metric_task-getcustomerservicemetrictasks&quot;&gt;getCustomerServiceMetricTasks&lt;/a&gt; method to retrieve task IDs.
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
        super(requestAdapter, "{+baseurl}/customer_service_metric_task{?date_range*,limit*,look_back_days*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link CustomerServiceMetricTaskRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomerServiceMetricTaskRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/customer_service_metric_task{?date_range*,limit*,look_back_days*,offset*}", rawUrl);
    }
    /**
     * Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days&lt;/code&gt; or &lt;code&gt;date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link CustomerServiceMetricTaskCollection}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CustomerServiceMetricTaskCollection get() {
        return get(null);
    }
    /**
     * Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days&lt;/code&gt; or &lt;code&gt;date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomerServiceMetricTaskCollection}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CustomerServiceMetricTaskCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("401", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("403", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CustomerServiceMetricTaskCollection::createFromDiscriminatorValue);
    }
    /**
     * &lt;p&gt;Use this method to create a customer service metrics download task with filter criteria for the customer service metrics report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt; and &lt;strong&gt;filterCriteria&lt;/strong&gt; including both &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; and &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; for the report. The method returns the location response header containing the call URI to use with &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; to retrieve status and details on the task.&lt;/p&gt;&lt;p&gt;Only CURRENT Customer Service Metrics reports can be generated with the Sell Feed API. PROJECTED reports are not supported at this time. See the &lt;a href=&quot;/api-docs/sell/analytics/resources/customer_service_metric/methods/getCustomerServiceMetric&quot;&gt;getCustomerServiceMetric&lt;/a&gt; method document in the Analytics API for more information about these two types of reports.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before calling this API, retrieve the summary of the seller&apos;s performance and rating for the customer service metric by calling &lt;strong&gt;getCustomerServiceMetric&lt;/strong&gt; (part of the &lt;a href=&quot;/develop/api/sell/analytics_api&quot;&gt;Analytics API&lt;/a&gt;). You can then populate the create task request fields with the values from the response. This technique eliminates failed tasks that request a report for a &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; and &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; that are without evaluation.&lt;/span&gt;&lt;/p&gt;
     * @param body Request payload containing version, feedType, and optional filterCriteria.
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 409 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final CreateServiceMetricsTaskRequest body) {
        post(body, null);
    }
    /**
     * &lt;p&gt;Use this method to create a customer service metrics download task with filter criteria for the customer service metrics report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt; and &lt;strong&gt;filterCriteria&lt;/strong&gt; including both &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; and &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; for the report. The method returns the location response header containing the call URI to use with &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; to retrieve status and details on the task.&lt;/p&gt;&lt;p&gt;Only CURRENT Customer Service Metrics reports can be generated with the Sell Feed API. PROJECTED reports are not supported at this time. See the &lt;a href=&quot;/api-docs/sell/analytics/resources/customer_service_metric/methods/getCustomerServiceMetric&quot;&gt;getCustomerServiceMetric&lt;/a&gt; method document in the Analytics API for more information about these two types of reports.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before calling this API, retrieve the summary of the seller&apos;s performance and rating for the customer service metric by calling &lt;strong&gt;getCustomerServiceMetric&lt;/strong&gt; (part of the &lt;a href=&quot;/develop/api/sell/analytics_api&quot;&gt;Analytics API&lt;/a&gt;). You can then populate the create task request fields with the values from the response. This technique eliminates failed tasks that request a report for a &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; and &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; that are without evaluation.&lt;/span&gt;&lt;/p&gt;
     * @param body Request payload containing version, feedType, and optional filterCriteria.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 409 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final CreateServiceMetricsTaskRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("401", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("403", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days&lt;/code&gt; or &lt;code&gt;date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days&lt;/code&gt; or &lt;code&gt;date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, "{+baseurl}/customer_service_metric_task?feed_type={feed_type}{&date_range*,limit*,look_back_days*,offset*}", pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * &lt;p&gt;Use this method to create a customer service metrics download task with filter criteria for the customer service metrics report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt; and &lt;strong&gt;filterCriteria&lt;/strong&gt; including both &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; and &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; for the report. The method returns the location response header containing the call URI to use with &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; to retrieve status and details on the task.&lt;/p&gt;&lt;p&gt;Only CURRENT Customer Service Metrics reports can be generated with the Sell Feed API. PROJECTED reports are not supported at this time. See the &lt;a href=&quot;/api-docs/sell/analytics/resources/customer_service_metric/methods/getCustomerServiceMetric&quot;&gt;getCustomerServiceMetric&lt;/a&gt; method document in the Analytics API for more information about these two types of reports.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before calling this API, retrieve the summary of the seller&apos;s performance and rating for the customer service metric by calling &lt;strong&gt;getCustomerServiceMetric&lt;/strong&gt; (part of the &lt;a href=&quot;/develop/api/sell/analytics_api&quot;&gt;Analytics API&lt;/a&gt;). You can then populate the create task request fields with the values from the response. This technique eliminates failed tasks that request a report for a &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; and &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; that are without evaluation.&lt;/span&gt;&lt;/p&gt;
     * @param body Request payload containing version, feedType, and optional filterCriteria.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateServiceMetricsTaskRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;p&gt;Use this method to create a customer service metrics download task with filter criteria for the customer service metrics report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt; and &lt;strong&gt;filterCriteria&lt;/strong&gt; including both &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; and &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; for the report. The method returns the location response header containing the call URI to use with &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; to retrieve status and details on the task.&lt;/p&gt;&lt;p&gt;Only CURRENT Customer Service Metrics reports can be generated with the Sell Feed API. PROJECTED reports are not supported at this time. See the &lt;a href=&quot;/api-docs/sell/analytics/resources/customer_service_metric/methods/getCustomerServiceMetric&quot;&gt;getCustomerServiceMetric&lt;/a&gt; method document in the Analytics API for more information about these two types of reports.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before calling this API, retrieve the summary of the seller&apos;s performance and rating for the customer service metric by calling &lt;strong&gt;getCustomerServiceMetric&lt;/strong&gt; (part of the &lt;a href=&quot;/develop/api/sell/analytics_api&quot;&gt;Analytics API&lt;/a&gt;). You can then populate the create task request fields with the values from the response. This technique eliminates failed tasks that request a report for a &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; and &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; that are without evaluation.&lt;/span&gt;&lt;/p&gt;
     * @param body Request payload containing version, feedType, and optional filterCriteria.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateServiceMetricsTaskRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CustomerServiceMetricTaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomerServiceMetricTaskRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CustomerServiceMetricTaskRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days&lt;/code&gt; or &lt;code&gt;date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The task creation date range. The results are filtered to include only tasks with a creation date that is equal to the dates specified or is within the specified range. Do not use with the look_back_days parameter. Format: UTC. For example, tasks within a range: yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ. Tasks created on March 8, 2020: 2020-03-08T00:00.00.000Z..2020-03-09T00:00:00.000Z. Maximum: 90 days.
         */
        @jakarta.annotation.Nullable
        public String dateRange;
        /**
         * The feed type associated with the tasks being retrieved. The only presently supported value is CUSTOMER_SERVICE_METRICS_REPORT.
         */
        @jakarta.annotation.Nullable
        public String feedType;
        /**
         * The number of customer service metric tasks to return per page of the result set. Use this parameter in conjunction with the offset parameter to control the pagination of the output. For example, if offset is set to 10 and limit is set to 10, the call retrieves tasks 11 thru 20 from the result set. If this parameter is omitted, the default value is used. Note: This feature employs a zero-based list, where the first item in the list has an offset of 0. Default: 10. Maximum: 500.
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * The number of previous days in which to search for tasks. Do not use with the date_range parameter. If both date_range and look_back_days are omitted, this parameter&apos;s default value is used. Default value: 7. Range: 1-90 (inclusive).
         */
        @jakarta.annotation.Nullable
        public Integer lookBackDays;
        /**
         * The number of customer service metric tasks to skip in the result set before returning the first task in the paginated response. Combine offset with the limit query parameter to control the items returned in the response. For example, if you supply an offset of 0 and a limit of 10, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If offset is 10 and limit is 20, the first page of the response contains items 11-30 from the complete result set. Default: 0.
         */
        @jakarta.annotation.Nullable
        public Integer offset;
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
