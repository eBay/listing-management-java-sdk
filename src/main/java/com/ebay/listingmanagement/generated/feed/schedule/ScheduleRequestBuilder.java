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

package com.ebay.listingmanagement.generated.feed.schedule;

import com.ebay.listingmanagement.generated.feed.models.CreateUserScheduleRequest;
import com.ebay.listingmanagement.generated.feed.models.UserScheduleCollection;
import com.ebay.listingmanagement.generated.feed.schedule.item.WithScheduleItemRequestBuilder;
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
 * Builds and executes requests for operations under /schedule
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScheduleRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.feed.schedule.item collection
     * @param schedule_id This path parameter is the unique identifier of the schedule for which to retrieve details.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/api-docs/sell/feed/resources/schedule/methods/getSchedules&quot; target=&quot;_blank &quot;&gt;getSchedules&lt;/a&gt; method to retrieve schedule IDs.
     * @return a {@link WithScheduleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithScheduleItemRequestBuilder bySchedule_id(@jakarta.annotation.Nonnull final String schedule_id) {
        Objects.requireNonNull(schedule_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("schedule_id", schedule_id);
        return new WithScheduleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ScheduleRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ScheduleRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/schedule?feed_type={feed_type}{&limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link ScheduleRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ScheduleRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/schedule?feed_type={feed_type}{&limit*,offset*}", rawUrl);
    }
    /**
     * This method retrieves an array containing the details and status of all schedules based on the specified &lt;strong&gt;feed_type&lt;/strong&gt;. Use this method to find a schedule if you do not know the &lt;strong&gt;schedule_id&lt;/strong&gt;.
     * @return a {@link UserScheduleCollection}
     */
    @jakarta.annotation.Nullable
    public UserScheduleCollection get() {
        return get(null);
    }
    /**
     * This method retrieves an array containing the details and status of all schedules based on the specified &lt;strong&gt;feed_type&lt;/strong&gt;. Use this method to find a schedule if you do not know the &lt;strong&gt;schedule_id&lt;/strong&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserScheduleCollection}
     */
    @jakarta.annotation.Nullable
    public UserScheduleCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserScheduleCollection::createFromDiscriminatorValue);
    }
    /**
     * This method creates a schedule, which is a subscription to the specified schedule template. A schedule periodically generates a report for the &lt;strong&gt;feedType&lt;/strong&gt; specified by the template. Specify the same &lt;strong&gt;feedType&lt;/strong&gt; as the &lt;strong&gt;feedType&lt;/strong&gt; of the associated schedule template. When creating the schedule, if available from the template, you can specify a preferred trigger hour, day of the week, or day of the month. These and other fields are conditionally available as specified by the template.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Make sure to include all fields required by the schedule template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). Call the &lt;strong&gt;getScheduleTemplate&lt;/strong&gt; method (or the &lt;strong&gt;getScheduleTemplates&lt;/strong&gt; method), to find out which fields are required or optional. If a field is optional and a default value is provided by the template, the default value will be used if omitted from the payload.&lt;/span&gt;&lt;/p&gt;A successful call returns the location response header containing the &lt;strong&gt;getSchedule&lt;/strong&gt; call URI to retrieve the schedule you just created. The URL includes the eBay-assigned schedule ID, which you can use to reference the schedule task. &lt;br /&gt;&lt;br /&gt;To retrieve the details of the create schedule task, use the &lt;strong&gt;getSchedule&lt;/strong&gt; method for a single schedule ID or the &lt;strong&gt;getSchedules&lt;/strong&gt; method to retrieve all schedule details for the specified &lt;strong&gt;feed_type&lt;/strong&gt;. The number of schedules for each feedType is limited. Error code 160031 is returned when you have reached this maximum.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Except for schedules with a HALF-HOUR frequency, all schedules will ideally run at the start of each hour (&apos;00&apos; minutes). Actual start time may vary time may vary due to load and other factors.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;strong&gt;createSchedule&lt;/strong&gt; method.
     * @return a {@link SchedulePostResponse}
     */
    @jakarta.annotation.Nullable
    public SchedulePostResponse post(@jakarta.annotation.Nonnull final CreateUserScheduleRequest body) {
        return post(body, null);
    }
    /**
     * This method creates a schedule, which is a subscription to the specified schedule template. A schedule periodically generates a report for the &lt;strong&gt;feedType&lt;/strong&gt; specified by the template. Specify the same &lt;strong&gt;feedType&lt;/strong&gt; as the &lt;strong&gt;feedType&lt;/strong&gt; of the associated schedule template. When creating the schedule, if available from the template, you can specify a preferred trigger hour, day of the week, or day of the month. These and other fields are conditionally available as specified by the template.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Make sure to include all fields required by the schedule template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). Call the &lt;strong&gt;getScheduleTemplate&lt;/strong&gt; method (or the &lt;strong&gt;getScheduleTemplates&lt;/strong&gt; method), to find out which fields are required or optional. If a field is optional and a default value is provided by the template, the default value will be used if omitted from the payload.&lt;/span&gt;&lt;/p&gt;A successful call returns the location response header containing the &lt;strong&gt;getSchedule&lt;/strong&gt; call URI to retrieve the schedule you just created. The URL includes the eBay-assigned schedule ID, which you can use to reference the schedule task. &lt;br /&gt;&lt;br /&gt;To retrieve the details of the create schedule task, use the &lt;strong&gt;getSchedule&lt;/strong&gt; method for a single schedule ID or the &lt;strong&gt;getSchedules&lt;/strong&gt; method to retrieve all schedule details for the specified &lt;strong&gt;feed_type&lt;/strong&gt;. The number of schedules for each feedType is limited. Error code 160031 is returned when you have reached this maximum.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Except for schedules with a HALF-HOUR frequency, all schedules will ideally run at the start of each hour (&apos;00&apos; minutes). Actual start time may vary time may vary due to load and other factors.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;strong&gt;createSchedule&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SchedulePostResponse}
     */
    @jakarta.annotation.Nullable
    public SchedulePostResponse post(@jakarta.annotation.Nonnull final CreateUserScheduleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SchedulePostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves an array containing the details and status of all schedules based on the specified &lt;strong&gt;feed_type&lt;/strong&gt;. Use this method to find a schedule if you do not know the &lt;strong&gt;schedule_id&lt;/strong&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves an array containing the details and status of all schedules based on the specified &lt;strong&gt;feed_type&lt;/strong&gt;. Use this method to find a schedule if you do not know the &lt;strong&gt;schedule_id&lt;/strong&gt;.
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
     * This method creates a schedule, which is a subscription to the specified schedule template. A schedule periodically generates a report for the &lt;strong&gt;feedType&lt;/strong&gt; specified by the template. Specify the same &lt;strong&gt;feedType&lt;/strong&gt; as the &lt;strong&gt;feedType&lt;/strong&gt; of the associated schedule template. When creating the schedule, if available from the template, you can specify a preferred trigger hour, day of the week, or day of the month. These and other fields are conditionally available as specified by the template.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Make sure to include all fields required by the schedule template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). Call the &lt;strong&gt;getScheduleTemplate&lt;/strong&gt; method (or the &lt;strong&gt;getScheduleTemplates&lt;/strong&gt; method), to find out which fields are required or optional. If a field is optional and a default value is provided by the template, the default value will be used if omitted from the payload.&lt;/span&gt;&lt;/p&gt;A successful call returns the location response header containing the &lt;strong&gt;getSchedule&lt;/strong&gt; call URI to retrieve the schedule you just created. The URL includes the eBay-assigned schedule ID, which you can use to reference the schedule task. &lt;br /&gt;&lt;br /&gt;To retrieve the details of the create schedule task, use the &lt;strong&gt;getSchedule&lt;/strong&gt; method for a single schedule ID or the &lt;strong&gt;getSchedules&lt;/strong&gt; method to retrieve all schedule details for the specified &lt;strong&gt;feed_type&lt;/strong&gt;. The number of schedules for each feedType is limited. Error code 160031 is returned when you have reached this maximum.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Except for schedules with a HALF-HOUR frequency, all schedules will ideally run at the start of each hour (&apos;00&apos; minutes). Actual start time may vary time may vary due to load and other factors.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;strong&gt;createSchedule&lt;/strong&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateUserScheduleRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates a schedule, which is a subscription to the specified schedule template. A schedule periodically generates a report for the &lt;strong&gt;feedType&lt;/strong&gt; specified by the template. Specify the same &lt;strong&gt;feedType&lt;/strong&gt; as the &lt;strong&gt;feedType&lt;/strong&gt; of the associated schedule template. When creating the schedule, if available from the template, you can specify a preferred trigger hour, day of the week, or day of the month. These and other fields are conditionally available as specified by the template.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Make sure to include all fields required by the schedule template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). Call the &lt;strong&gt;getScheduleTemplate&lt;/strong&gt; method (or the &lt;strong&gt;getScheduleTemplates&lt;/strong&gt; method), to find out which fields are required or optional. If a field is optional and a default value is provided by the template, the default value will be used if omitted from the payload.&lt;/span&gt;&lt;/p&gt;A successful call returns the location response header containing the &lt;strong&gt;getSchedule&lt;/strong&gt; call URI to retrieve the schedule you just created. The URL includes the eBay-assigned schedule ID, which you can use to reference the schedule task. &lt;br /&gt;&lt;br /&gt;To retrieve the details of the create schedule task, use the &lt;strong&gt;getSchedule&lt;/strong&gt; method for a single schedule ID or the &lt;strong&gt;getSchedules&lt;/strong&gt; method to retrieve all schedule details for the specified &lt;strong&gt;feed_type&lt;/strong&gt;. The number of schedules for each feedType is limited. Error code 160031 is returned when you have reached this maximum.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Except for schedules with a HALF-HOUR frequency, all schedules will ideally run at the start of each hour (&apos;00&apos; minutes). Actual start time may vary time may vary due to load and other factors.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;strong&gt;createSchedule&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateUserScheduleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/schedule", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ScheduleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScheduleRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ScheduleRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves an array containing the details and status of all schedules based on the specified &lt;strong&gt;feed_type&lt;/strong&gt;. Use this method to find a schedule if you do not know the &lt;strong&gt;schedule_id&lt;/strong&gt;.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The feed type associated with the schedules being retrieved.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String feedType;
        /**
         * The maximum number of schedules that can be returned on each page of the paginated response. Use this parameter in conjunction with the &lt;strong&gt;offset&lt;/strong&gt; parameter to control the pagination of the output. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;For example, if &lt;strong&gt;offset&lt;/strong&gt; is set to 10 and &lt;strong&gt;limit&lt;/strong&gt; is set to 10, the call retrieves schedules 11 thru 20 from the result set.&lt;/p&gt;&lt;p&gt;If this parameter is omitted, the default value is used. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt; 10 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt;500
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The number of schedules to skip in the result set before returning the first schedule in the paginated response. &lt;p&gt;Combine &lt;strong&gt;offset&lt;/strong&gt; with the &lt;strong&gt;limit&lt;/strong&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;strong&gt;offset&lt;/strong&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;strong&gt;offset&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set. If this query parameter is not set, the default value is used and the first page of records is returned.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt;0
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
            allQueryParams.put("feed_type", feedType);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
