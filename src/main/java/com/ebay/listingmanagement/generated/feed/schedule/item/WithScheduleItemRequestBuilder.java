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

package com.ebay.listingmanagement.generated.feed.schedule.item;

import com.ebay.listingmanagement.generated.feed.models.UpdateUserScheduleRequest;
import com.ebay.listingmanagement.generated.feed.models.UserScheduleResponse;
import com.ebay.listingmanagement.generated.feed.schedule.item.download_result_file.DownloadResultFileRequestBuilder;
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
 * Builds and executes requests for operations under /schedule/{schedule_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithScheduleItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The download_result_file property
     * @return a {@link DownloadResultFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DownloadResultFileRequestBuilder downloadResultFile() {
        return new DownloadResultFileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithScheduleItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithScheduleItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/schedule/{schedule_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithScheduleItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithScheduleItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/schedule/{schedule_id}", rawUrl);
    }
    /**
     * This method deletes an existing schedule. Specify the schedule to delete using the &lt;strong&gt;schedule_id&lt;/strong&gt; path parameter.
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method deletes an existing schedule. Specify the schedule to delete using the &lt;strong&gt;schedule_id&lt;/strong&gt; path parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method retrieves schedule details and status of the specified schedule. Specify the schedule to retrieve using the &lt;strong&gt;schedule_id&lt;/strong&gt;. Use the &lt;strong&gt;getSchedules&lt;/strong&gt; method to find a schedule if you do not know the &lt;strong&gt;schedule_id&lt;/strong&gt;.
     * @return a {@link UserScheduleResponse}
     */
    @jakarta.annotation.Nullable
    public UserScheduleResponse get() {
        return get(null);
    }
    /**
     * This method retrieves schedule details and status of the specified schedule. Specify the schedule to retrieve using the &lt;strong&gt;schedule_id&lt;/strong&gt;. Use the &lt;strong&gt;getSchedules&lt;/strong&gt; method to find a schedule if you do not know the &lt;strong&gt;schedule_id&lt;/strong&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserScheduleResponse}
     */
    @jakarta.annotation.Nullable
    public UserScheduleResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserScheduleResponse::createFromDiscriminatorValue);
    }
    /**
     * This method updates an existing schedule. Specify the schedule to update using the &lt;strong&gt;schedule_id&lt;/strong&gt; path parameter. If the schedule template has changed after the schedule was created or updated, the input will be validated using the changed template.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Make sure to include all fields required by the schedule template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). Call the &lt;strong&gt;getScheduleTemplate&lt;/strong&gt; method (or the &lt;strong&gt;getScheduleTemplates&lt;/strong&gt; method), to find out which fields are required or optional. If you do not know the &lt;strong&gt;scheduleTemplateId&lt;/strong&gt;, call the &lt;strong&gt;getSchedule&lt;/strong&gt; method to find out.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for a schedule update to a schedule generated with the Feed API.
     */
    public void put(@jakarta.annotation.Nonnull final UpdateUserScheduleRequest body) {
        put(body, null);
    }
    /**
     * This method updates an existing schedule. Specify the schedule to update using the &lt;strong&gt;schedule_id&lt;/strong&gt; path parameter. If the schedule template has changed after the schedule was created or updated, the input will be validated using the changed template.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Make sure to include all fields required by the schedule template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). Call the &lt;strong&gt;getScheduleTemplate&lt;/strong&gt; method (or the &lt;strong&gt;getScheduleTemplates&lt;/strong&gt; method), to find out which fields are required or optional. If you do not know the &lt;strong&gt;scheduleTemplateId&lt;/strong&gt;, call the &lt;strong&gt;getSchedule&lt;/strong&gt; method to find out.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for a schedule update to a schedule generated with the Feed API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void put(@jakarta.annotation.Nonnull final UpdateUserScheduleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method deletes an existing schedule. Specify the schedule to delete using the &lt;strong&gt;schedule_id&lt;/strong&gt; path parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method deletes an existing schedule. Specify the schedule to delete using the &lt;strong&gt;schedule_id&lt;/strong&gt; path parameter.
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
     * This method retrieves schedule details and status of the specified schedule. Specify the schedule to retrieve using the &lt;strong&gt;schedule_id&lt;/strong&gt;. Use the &lt;strong&gt;getSchedules&lt;/strong&gt; method to find a schedule if you do not know the &lt;strong&gt;schedule_id&lt;/strong&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves schedule details and status of the specified schedule. Specify the schedule to retrieve using the &lt;strong&gt;schedule_id&lt;/strong&gt;. Use the &lt;strong&gt;getSchedules&lt;/strong&gt; method to find a schedule if you do not know the &lt;strong&gt;schedule_id&lt;/strong&gt;.
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
     * This method updates an existing schedule. Specify the schedule to update using the &lt;strong&gt;schedule_id&lt;/strong&gt; path parameter. If the schedule template has changed after the schedule was created or updated, the input will be validated using the changed template.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Make sure to include all fields required by the schedule template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). Call the &lt;strong&gt;getScheduleTemplate&lt;/strong&gt; method (or the &lt;strong&gt;getScheduleTemplates&lt;/strong&gt; method), to find out which fields are required or optional. If you do not know the &lt;strong&gt;scheduleTemplateId&lt;/strong&gt;, call the &lt;strong&gt;getSchedule&lt;/strong&gt; method to find out.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for a schedule update to a schedule generated with the Feed API.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateUserScheduleRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method updates an existing schedule. Specify the schedule to update using the &lt;strong&gt;schedule_id&lt;/strong&gt; path parameter. If the schedule template has changed after the schedule was created or updated, the input will be validated using the changed template.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Make sure to include all fields required by the schedule template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). Call the &lt;strong&gt;getScheduleTemplate&lt;/strong&gt; method (or the &lt;strong&gt;getScheduleTemplates&lt;/strong&gt; method), to find out which fields are required or optional. If you do not know the &lt;strong&gt;scheduleTemplateId&lt;/strong&gt;, call the &lt;strong&gt;getSchedule&lt;/strong&gt; method to find out.&lt;/span&gt;&lt;/p&gt;
     * @param body The type that defines the fields for a schedule update to a schedule generated with the Feed API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateUserScheduleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithScheduleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithScheduleItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithScheduleItemRequestBuilder(rawUrl, requestAdapter);
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
