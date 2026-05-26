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

package com.ebay.listingmanagement.generated.inventory.listing.item;

import com.ebay.listingmanagement.generated.inventory.listing.item.sku.SkuRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /listing/{listingId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithListingItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The sku property
     * @return a {@link SkuRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SkuRequestBuilder sku() {
        return new SkuRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithListingItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithListingItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/listing/{listingId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithListingItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithListingItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/listing/{listingId}", rawUrl);
    }
}
