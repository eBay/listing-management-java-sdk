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

package com.ebay.listingmanagement.generated.feed.order_task.item;

import com.ebay.listingmanagement.generated.feed.models.Error;
import com.ebay.listingmanagement.generated.feed.models.OrderTask;
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
 * Builds and executes requests for operations under /order_task/{task_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTaskItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithTaskItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTaskItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order_task/{task_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithTaskItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTaskItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order_task/{task_id}", rawUrl);
    }
    /**
     * This method retrieves the task details and status of the specified task. The input is &lt;strong&gt;task_id&lt;/strong&gt;. &lt;p&gt;For details about how this method is used, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide.&lt;/p&gt;
     * @return a {@link OrderTask}
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public OrderTask get() {
        return get(null);
    }
    /**
     * This method retrieves the task details and status of the specified task. The input is &lt;strong&gt;task_id&lt;/strong&gt;. &lt;p&gt;For details about how this method is used, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrderTask}
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public OrderTask get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrderTask::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the task details and status of the specified task. The input is &lt;strong&gt;task_id&lt;/strong&gt;. &lt;p&gt;For details about how this method is used, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the task details and status of the specified task. The input is &lt;strong&gt;task_id&lt;/strong&gt;. &lt;p&gt;For details about how this method is used, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide.&lt;/p&gt;
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithTaskItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTaskItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithTaskItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
