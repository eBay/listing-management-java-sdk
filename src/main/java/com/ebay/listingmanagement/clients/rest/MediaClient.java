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
import com.ebay.listingmanagement.generated.media.MediaApiClient;
import com.ebay.listingmanagement.generated.media.models.*;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Media API.
 * Provides methods to manage documents, images, and videos.
 */
public final class MediaClient {
    private final MediaApiClient kiota;
    private final ListingManagementConfiguration config;

    public MediaClient(MediaApiClient kiota, ListingManagementConfiguration config) {
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

    // ── Documents ────────────────────────────────────────────────────────────

    public CompletableFuture<Object> getDocumentAsync(
            String documentId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("documentId", documentId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.document().byDocument_id(documentId).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Object> createDocumentAsync(
            CreateDocumentRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.document().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Object> createDocumentFromUrlAsync(
            CreateDocumentFromUrlRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.document().createDocumentFromUrl().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Object> uploadDocumentAsync(
            String documentId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("documentId", documentId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.document().byDocument_id(documentId).upload().post(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    // ── Images ───────────────────────────────────────────────────────────────

    public CompletableFuture<Object> getImageAsync(
            String imageId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("imageId", imageId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.image().byImage_id(imageId).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Object> createImageFromFileAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.image().createImageFromFile().post(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Object> createImageFromUrlAsync(
            CreateImageFromUrlRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.image().createImageFromUrl().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    // ── Videos ───────────────────────────────────────────────────────────────

    public CompletableFuture<Object> getVideoAsync(
            String videoId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("videoId", videoId);
        return CompletableFuture.supplyAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                return kiota.video().byVideo_id(videoId).get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Void> createVideoAsync(
            CreateVideoRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.runAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.video().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }

    public CompletableFuture<Void> uploadVideoAsync(
            String videoId, InputStream body, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("videoId", videoId);
        return CompletableFuture.runAsync(() ->
            TokenContext.runWith(accessToken, () -> {
                Map<String, String> headers = mergedHeaders(requestOptions);
                kiota.video().byVideo_id(videoId).upload().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
            })
        );
    }
}
