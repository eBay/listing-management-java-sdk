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
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

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

    public CompletableFuture<OrderTaskCollection> getOrderTasksAsync(
            String dateRange, String feedType, Integer limit, Integer lookBackDays, Integer offset, String scheduleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
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
        }));
    }

    public CompletableFuture<Void> createOrderTaskAsync(
            CreateOrderTaskRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.orderTask().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<OrderTask> getOrderTaskAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.orderTask().byTask_id(Params.requireValid("taskId", taskId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<InventoryTaskCollection> getInventoryTasksAsync(
            String feedType, String scheduleId, Integer lookBackDays, String dateRange, Integer limit, Integer offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.inventoryTask().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (feedType != null) config.queryParameters.feedType = feedType;
                if (scheduleId != null) config.queryParameters.scheduleId = scheduleId;
                if (lookBackDays != null) config.queryParameters.lookBackDays = lookBackDays;
                if (dateRange != null) config.queryParameters.dateRange = dateRange;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Void> createInventoryTaskAsync(
            CreateInventoryTaskRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.inventoryTask().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<InventoryTask> getInventoryTaskAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.inventoryTask().byTask_id(Params.requireValid("taskId", taskId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<UserScheduleCollection> getSchedulesAsync(
            String feedType, Integer limit, Integer offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.schedule().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (feedType != null) config.queryParameters.feedType = feedType;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Void> createScheduleAsync(
            CreateUserScheduleRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.schedule().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<UserScheduleResponse> getScheduleAsync(
            String scheduleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.schedule().bySchedule_id(Params.requireValid("scheduleId", scheduleId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> updateScheduleAsync(
            String scheduleId, UpdateUserScheduleRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.schedule().bySchedule_id(Params.requireValid("scheduleId", scheduleId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> deleteScheduleAsync(
            String scheduleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.schedule().bySchedule_id(Params.requireValid("scheduleId", scheduleId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> getLatestResultFileAsync(
            String scheduleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.schedule().bySchedule_id(Params.requireValid("scheduleId", scheduleId)).downloadResultFile().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<ScheduleTemplateResponse> getScheduleTemplateAsync(
            String scheduleTemplateId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.scheduleTemplate().bySchedule_template_id(Params.requireValid("scheduleTemplateId", scheduleTemplateId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<ScheduleTemplateCollection> getScheduleTemplatesAsync(
            String feedType, Integer limit, Integer offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.scheduleTemplate().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (feedType != null) config.queryParameters.feedType = feedType;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<TaskCollection> getTasksAsync(
            String dateRange, String feedType, Integer limit, Integer lookBackDays, Integer offset, String scheduleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
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
        }));
    }

    public CompletableFuture<Void> createTaskAsync(
            CreateTaskRequest body, String xEBAYCMARKETPLACEID, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.task().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
            return null;
        }));
    }

    public CompletableFuture<Void> getInputFileAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.task().byTask_id(Params.requireValid("taskId", taskId)).downloadInputFile().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> getResultFileAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.task().byTask_id(Params.requireValid("taskId", taskId)).downloadResultFile().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Task> getTaskAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.task().byTask_id(Params.requireValid("taskId", taskId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> uploadFileAsync(
            String taskId, byte[] body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            com.microsoft.kiota.MultipartBody multipartBody = new com.microsoft.kiota.MultipartBody();
            multipartBody.addOrReplacePart("file", "application/octet-stream", body);
            kiota.task().byTask_id(Params.requireValid("taskId", taskId)).uploadFile().post(multipartBody, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<CustomerServiceMetricTaskCollection> getCustomerServiceMetricTasksAsync(
            String dateRange, String feedType, Integer limit, Integer lookBackDays, Integer offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.customerServiceMetricTask().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (dateRange != null) config.queryParameters.dateRange = dateRange;
                if (feedType != null) config.queryParameters.feedType = feedType;
                if (limit != null) config.queryParameters.limit = limit;
                if (lookBackDays != null) config.queryParameters.lookBackDays = lookBackDays;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Void> createCustomerServiceMetricTaskAsync(
            CreateServiceMetricsTaskRequest body, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.customerServiceMetricTask().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
            return null;
        }));
    }

    public CompletableFuture<ServiceMetricsTask> getCustomerServiceMetricTaskAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.customerServiceMetricTask().byTask_id(Params.requireValid("taskId", taskId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }
}
