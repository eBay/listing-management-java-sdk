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

package com.ebay.listingmanagement.generated.media.image;

import com.ebay.listingmanagement.generated.media.image.create_image_from_file.CreateImageFromFileRequestBuilder;
import com.ebay.listingmanagement.generated.media.image.create_image_from_url.CreateImageFromUrlRequestBuilder;
import com.ebay.listingmanagement.generated.media.image.item.WithImageItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /image
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImageRequestBuilder extends BaseRequestBuilder {
    /**
     * The create_image_from_file property
     * @return a {@link CreateImageFromFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateImageFromFileRequestBuilder createImageFromFile() {
        return new CreateImageFromFileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The create_image_from_url property
     * @return a {@link CreateImageFromUrlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateImageFromUrlRequestBuilder createImageFromUrl() {
        return new CreateImageFromUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.media.image.item collection
     * @param image_id This path parameter is the unique identifier of a created image. Use the value returned in the location header of the method used to create the image (&lt;strong&gt;createImageFromFile&lt;/strong&gt; or &lt;strong&gt;createImageFromUrl&lt;/strong&gt;, as applicable).
     * @return a {@link WithImageItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithImageItemRequestBuilder byImage_id(@jakarta.annotation.Nonnull final String image_id) {
        Objects.requireNonNull(image_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("image_id", image_id);
        return new WithImageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ImageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/image", pathParameters);
    }
    /**
     * Instantiates a new {@link ImageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/image", rawUrl);
    }
}
