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

package com.ebay.listingmanagement.clients.rest;

import com.ebay.listingmanagement.configuration.ListingManagementConfiguration;
import com.ebay.listingmanagement.configuration.RequestOptions;
import com.ebay.listingmanagement.configuration.TokenContext;
import com.ebay.listingmanagement.generated.feed.FeedApiClient;
import com.ebay.listingmanagement.generated.feed.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Feed API.
 * Provides methods to manage tasks, schedules, and schedule templates.
 */
public final class FeedClient {
    private final FeedApiClient kiota;
    private final ListingManagementConfiguration config;

    public FeedClient(FeedApiClient kiota, ListingManagementConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    // ── Generic Tasks ────────────────────────────────────────────────────────

    public CompletableFuture<TaskCollection> getTasksAsync(
            String dateRange, String feedType, String limit, String lookBackDays,
            String offset, String scheduleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.task().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (dateRange != null) config.queryParameters.dateRange = dateRange;
                    if (feedType != null) config.queryParameters.feedType = feedType;
                    if (limit != null) config.queryParameters.limit = limit;
                    if (lookBackDays != null) config.queryParameters.lookBackDays = lookBackDays;
                    if (offset != null) config.queryParameters.offset = offset;
                    if (scheduleId != null) config.queryParameters.scheduleId = scheduleId;
                });
            })
        );
    }

    public CompletableFuture<Task> getTaskAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("taskId", taskId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.task().byTask_id(taskId).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Void> createTaskAsync(
            CreateTaskRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.task().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    public CompletableFuture<Object> getInputFileAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("taskId", taskId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.task().byTask_id(taskId).downloadInputFile().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Object> getResultFileAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("taskId", taskId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.task().byTask_id(taskId).downloadResultFile().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Void> uploadFileAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("taskId", taskId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.task().byTask_id(taskId).uploadFile().post(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    // ── Customer Service Metric Tasks ────────────────────────────────────────

    public CompletableFuture<CustomerServiceMetricTaskCollection> getCustomerServiceMetricTasksAsync(
            String dateRange, String feedType, String limit, String lookBackDays,
            String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.customerServiceMetricTask().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (dateRange != null) config.queryParameters.dateRange = dateRange;
                    if (feedType != null) config.queryParameters.feedType = feedType;
                    if (limit != null) config.queryParameters.limit = limit;
                    if (lookBackDays != null) config.queryParameters.lookBackDays = lookBackDays;
                    if (offset != null) config.queryParameters.offset = offset;
                });
            })
        );
    }

    public CompletableFuture<ServiceMetricsTask> getCustomerServiceMetricTaskAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("taskId", taskId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.customerServiceMetricTask().byTask_id(taskId).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Void> createCustomerServiceMetricTaskAsync(
            CreateServiceMetricsTaskRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.customerServiceMetricTask().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    // ── Inventory Tasks ──────────────────────────────────────────────────────

    public CompletableFuture<Object> getInventoryTasksAsync(
            String dateRange, String feedType, String limit, String lookBackDays,
            String offset, String scheduleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.inventoryTask().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (dateRange != null) config.queryParameters.dateRange = dateRange;
                    if (feedType != null) config.queryParameters.feedType = feedType;
                    if (limit != null) config.queryParameters.limit = limit;
                    if (lookBackDays != null) config.queryParameters.lookBackDays = lookBackDays;
                    if (offset != null) config.queryParameters.offset = offset;
                    if (scheduleId != null) config.queryParameters.scheduleId = scheduleId;
                });
            })
        );
    }

    public CompletableFuture<Object> getInventoryTaskAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("taskId", taskId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.inventoryTask().byTask_id(taskId).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Void> createInventoryTaskAsync(
            CreateInventoryTaskRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.inventoryTask().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    // ── Order Tasks ──────────────────────────────────────────────────────────

    public CompletableFuture<Object> getOrderTasksAsync(
            String dateRange, String feedType, String limit, String lookBackDays,
            String offset, String scheduleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.orderTask().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (dateRange != null) config.queryParameters.dateRange = dateRange;
                    if (feedType != null) config.queryParameters.feedType = feedType;
                    if (limit != null) config.queryParameters.limit = limit;
                    if (lookBackDays != null) config.queryParameters.lookBackDays = lookBackDays;
                    if (offset != null) config.queryParameters.offset = offset;
                    if (scheduleId != null) config.queryParameters.scheduleId = scheduleId;
                });
            })
        );
    }

    public CompletableFuture<Object> getOrderTaskAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("taskId", taskId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.orderTask().byTask_id(taskId).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Void> createOrderTaskAsync(
            CreateOrderTaskRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.orderTask().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    // ── Schedules ────────────────────────────────────────────────────────────

    public CompletableFuture<UserScheduleCollection> getSchedulesAsync(
            String feedType, String limit, String offset,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.schedule().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (feedType != null) config.queryParameters.feedType = feedType;
                    if (limit != null) config.queryParameters.limit = limit;
                    if (offset != null) config.queryParameters.offset = offset;
                });
            })
        );
    }

    public CompletableFuture<UserScheduleResponse> getScheduleAsync(
            String scheduleId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("scheduleId", scheduleId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.schedule().bySchedule_id(scheduleId).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Object> createScheduleAsync(
            CreateUserScheduleRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.schedule().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Void> updateScheduleAsync(
            String scheduleId, UpdateUserScheduleRequest body,
            String accessToken, RequestOptions requestOptions) {
        Params.requireValid("scheduleId", scheduleId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.schedule().bySchedule_id(scheduleId).put(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    public CompletableFuture<Void> deleteScheduleAsync(
            String scheduleId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("scheduleId", scheduleId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.schedule().bySchedule_id(scheduleId).delete(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
                return null;
            })
        );
    }

    public CompletableFuture<Object> getLatestResultFileAsync(
            String scheduleId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("scheduleId", scheduleId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.schedule().bySchedule_id(scheduleId).downloadResultFile().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    // ── Schedule Templates ───────────────────────────────────────────────────

    public CompletableFuture<ScheduleTemplateCollection> getScheduleTemplatesAsync(
            String feedType, String limit, String offset,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.scheduleTemplate().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (feedType != null) config.queryParameters.feedType = feedType;
                    if (limit != null) config.queryParameters.limit = limit;
                    if (offset != null) config.queryParameters.offset = offset;
                });
            })
        );
    }

    public CompletableFuture<ScheduleTemplateResponse> getScheduleTemplateAsync(
            String scheduleTemplateId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("scheduleTemplateId", scheduleTemplateId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.scheduleTemplate().bySchedule_template_id(scheduleTemplateId).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }
}
