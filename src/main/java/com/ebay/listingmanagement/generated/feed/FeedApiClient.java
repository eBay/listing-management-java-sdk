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

package com.ebay.listingmanagement.generated.feed;

import com.ebay.listingmanagement.generated.feed.customer_service_metric_task.CustomerServiceMetricTaskRequestBuilder;
import com.ebay.listingmanagement.generated.feed.inventory_task.InventoryTaskRequestBuilder;
import com.ebay.listingmanagement.generated.feed.order_task.OrderTaskRequestBuilder;
import com.ebay.listingmanagement.generated.feed.schedule_template.ScheduleTemplateRequestBuilder;
import com.ebay.listingmanagement.generated.feed.schedule.ScheduleRequestBuilder;
import com.ebay.listingmanagement.generated.feed.task.TaskRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedApiClient extends BaseRequestBuilder {
    /**
     * The customer_service_metric_task property
     * @return a {@link CustomerServiceMetricTaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomerServiceMetricTaskRequestBuilder customerServiceMetricTask() {
        return new CustomerServiceMetricTaskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The inventory_task property
     * @return a {@link InventoryTaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InventoryTaskRequestBuilder inventoryTask() {
        return new InventoryTaskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The order_task property
     * @return a {@link OrderTaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderTaskRequestBuilder orderTask() {
        return new OrderTaskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The schedule property
     * @return a {@link ScheduleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScheduleRequestBuilder schedule() {
        return new ScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The schedule_template property
     * @return a {@link ScheduleTemplateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScheduleTemplateRequestBuilder scheduleTemplate() {
        return new ScheduleTemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The task property
     * @return a {@link TaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TaskRequestBuilder task() {
        return new TaskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link FeedApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com/sell/feed/v1");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
