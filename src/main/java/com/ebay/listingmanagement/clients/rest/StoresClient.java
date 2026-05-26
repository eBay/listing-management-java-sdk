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
import com.ebay.listingmanagement.generated.stores.StoresApiClient;
import com.ebay.listingmanagement.generated.stores.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Stores API.
 * Provides methods to manage eBay stores, categories, and tasks.
 */
public final class StoresClient {
    private final StoresApiClient kiota;
    private final ListingManagementConfiguration config;

    public StoresClient(StoresApiClient kiota, ListingManagementConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    /**
     * Merges default headers from config with per-call headers.
     * Per-call headers override defaults.
     */
    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    // ── Store ────────────────────────────────────────────────────────────────

    /**
     * Get store details.
     */
    public CompletableFuture<Object> getStoreAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.store().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    // ── Store Categories ─────────────────────────────────────────────────────

    /**
     * Get all store categories.
     */
    public CompletableFuture<Object> getStoreCategoriesAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.store().categories().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Add a store category.
     */
    public CompletableFuture<Void> addStoreCategoryAsync(
            AddStoreCategoryRequestType body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.runAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.store().categories().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Delete a store category.
     */
    public CompletableFuture<Void> deleteStoreCategoryAsync(
            String categoryId, DeleteStoreCategoryRequestType body,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.runAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.store().categories().byCategory_id(categoryId).delete(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Rename a store category.
     */
    public CompletableFuture<Void> renameStoreCategoryAsync(
            String categoryId, RenameStoreCategoryRequestType body,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.runAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.store().categories().byCategory_id(categoryId).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Move a store category.
     */
    public CompletableFuture<Void> moveStoreCategoryAsync(
            MoveStoreCategoryRequestType body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.runAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.store().categories().moveCategory().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    // ── Store Tasks ──────────────────────────────────────────────────────────

    /**
     * Get all store tasks.
     */
    public CompletableFuture<Object> getStoreTasksAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.store().tasks().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get a specific store task.
     */
    public CompletableFuture<Object> getStoreTaskAsync(
            String taskId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.store().tasks().byTask_id(taskId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }
}
