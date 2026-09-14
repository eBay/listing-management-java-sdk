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

package com.ebay.listingmanagement.generated.media.image.create_image_from_file;

import com.ebay.listingmanagement.generated.media.models.Error;
import com.ebay.listingmanagement.generated.media.models.ImageResponse;
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
 * Builds and executes requests for operations under /image/create_image_from_file
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateImageFromFileRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CreateImageFromFileRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateImageFromFileRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/image/create_image_from_file", pathParameters);
    }
    /**
     * Instantiates a new {@link CreateImageFromFileRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateImageFromFileRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/image/create_image_from_file", rawUrl);
    }
    /**
     * This method uploads a picture file to eBay Picture Services (EPS) using multipart/form-data. &lt;p&gt;All images must comply with eBay&apos;s picture requirements, such as dimension and file size restrictions. For more information, see &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot;  target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;. The image formats supported are &lt;strong&gt;JPG&lt;/strong&gt;, &lt;strong&gt;GIF&lt;/strong&gt;, &lt;strong&gt;PNG&lt;/strong&gt;, &lt;strong&gt;BMP&lt;/strong&gt;, &lt;strong&gt;TIFF&lt;/strong&gt;, &lt;strong&gt;AVIF&lt;/strong&gt;, &lt;strong&gt;HEIC&lt;/strong&gt;, and &lt;strong&gt;WEBP&lt;/strong&gt;. For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Animated GIF, and multi-page PNG/TIFF files, are not supported. Any animation effect of supported formats will be lost upon upload.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt; image: &amp;quot;sample_picture.jpg&amp;quot; &lt;/pre&gt;See &lt;strong&gt;Samples&lt;/strong&gt; for information.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &apos;multipart/form-data&apos;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;When an EPS image is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created&lt;/code&gt;. The method also returns the getImage URI in the &lt;strong&gt;Location&lt;/strong&gt; response header.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the image ID URI returned in the response &lt;a href=&quot;/develop/guides-v2/using-ebay-restful-apis#responseheaders&quot; target=&quot;_blank&quot;&gt;Location header&lt;/a&gt; provided in the following format:&lt;/p&gt;&lt;p&gt;&lt;code&gt;https://apim.ebay.com/commerce/media/v1_beta/image/&lt;em&gt;{image_id}&lt;/em&gt;&lt;/code&gt; &lt;/p&gt;&lt;p&gt;You can capture the entire URI, or just save the &lt;code&gt;{image_id}&lt;/code&gt; only. Pass the &lt;code&gt;{image_id}&lt;/code&gt; as a path parameter in the &lt;strong&gt;&lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-image-getimage&quot; &gt;getImage&lt;/a&gt;&lt;/strong&gt; method to return the value needed to associate an image to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot; target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @return a {@link ImageResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ImageResponse post() {
        return post(null);
    }
    /**
     * This method uploads a picture file to eBay Picture Services (EPS) using multipart/form-data. &lt;p&gt;All images must comply with eBay&apos;s picture requirements, such as dimension and file size restrictions. For more information, see &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot;  target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;. The image formats supported are &lt;strong&gt;JPG&lt;/strong&gt;, &lt;strong&gt;GIF&lt;/strong&gt;, &lt;strong&gt;PNG&lt;/strong&gt;, &lt;strong&gt;BMP&lt;/strong&gt;, &lt;strong&gt;TIFF&lt;/strong&gt;, &lt;strong&gt;AVIF&lt;/strong&gt;, &lt;strong&gt;HEIC&lt;/strong&gt;, and &lt;strong&gt;WEBP&lt;/strong&gt;. For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Animated GIF, and multi-page PNG/TIFF files, are not supported. Any animation effect of supported formats will be lost upon upload.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt; image: &amp;quot;sample_picture.jpg&amp;quot; &lt;/pre&gt;See &lt;strong&gt;Samples&lt;/strong&gt; for information.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &apos;multipart/form-data&apos;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;When an EPS image is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created&lt;/code&gt;. The method also returns the getImage URI in the &lt;strong&gt;Location&lt;/strong&gt; response header.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the image ID URI returned in the response &lt;a href=&quot;/develop/guides-v2/using-ebay-restful-apis#responseheaders&quot; target=&quot;_blank&quot;&gt;Location header&lt;/a&gt; provided in the following format:&lt;/p&gt;&lt;p&gt;&lt;code&gt;https://apim.ebay.com/commerce/media/v1_beta/image/&lt;em&gt;{image_id}&lt;/em&gt;&lt;/code&gt; &lt;/p&gt;&lt;p&gt;You can capture the entire URI, or just save the &lt;code&gt;{image_id}&lt;/code&gt; only. Pass the &lt;code&gt;{image_id}&lt;/code&gt; as a path parameter in the &lt;strong&gt;&lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-image-getimage&quot; &gt;getImage&lt;/a&gt;&lt;/strong&gt; method to return the value needed to associate an image to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot; target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ImageResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ImageResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ImageResponse::createFromDiscriminatorValue);
    }
    /**
     * This method uploads a picture file to eBay Picture Services (EPS) using multipart/form-data. &lt;p&gt;All images must comply with eBay&apos;s picture requirements, such as dimension and file size restrictions. For more information, see &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot;  target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;. The image formats supported are &lt;strong&gt;JPG&lt;/strong&gt;, &lt;strong&gt;GIF&lt;/strong&gt;, &lt;strong&gt;PNG&lt;/strong&gt;, &lt;strong&gt;BMP&lt;/strong&gt;, &lt;strong&gt;TIFF&lt;/strong&gt;, &lt;strong&gt;AVIF&lt;/strong&gt;, &lt;strong&gt;HEIC&lt;/strong&gt;, and &lt;strong&gt;WEBP&lt;/strong&gt;. For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Animated GIF, and multi-page PNG/TIFF files, are not supported. Any animation effect of supported formats will be lost upon upload.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt; image: &amp;quot;sample_picture.jpg&amp;quot; &lt;/pre&gt;See &lt;strong&gt;Samples&lt;/strong&gt; for information.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &apos;multipart/form-data&apos;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;When an EPS image is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created&lt;/code&gt;. The method also returns the getImage URI in the &lt;strong&gt;Location&lt;/strong&gt; response header.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the image ID URI returned in the response &lt;a href=&quot;/develop/guides-v2/using-ebay-restful-apis#responseheaders&quot; target=&quot;_blank&quot;&gt;Location header&lt;/a&gt; provided in the following format:&lt;/p&gt;&lt;p&gt;&lt;code&gt;https://apim.ebay.com/commerce/media/v1_beta/image/&lt;em&gt;{image_id}&lt;/em&gt;&lt;/code&gt; &lt;/p&gt;&lt;p&gt;You can capture the entire URI, or just save the &lt;code&gt;{image_id}&lt;/code&gt; only. Pass the &lt;code&gt;{image_id}&lt;/code&gt; as a path parameter in the &lt;strong&gt;&lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-image-getimage&quot; &gt;getImage&lt;/a&gt;&lt;/strong&gt; method to return the value needed to associate an image to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot; target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This method uploads a picture file to eBay Picture Services (EPS) using multipart/form-data. &lt;p&gt;All images must comply with eBay&apos;s picture requirements, such as dimension and file size restrictions. For more information, see &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot;  target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;. The image formats supported are &lt;strong&gt;JPG&lt;/strong&gt;, &lt;strong&gt;GIF&lt;/strong&gt;, &lt;strong&gt;PNG&lt;/strong&gt;, &lt;strong&gt;BMP&lt;/strong&gt;, &lt;strong&gt;TIFF&lt;/strong&gt;, &lt;strong&gt;AVIF&lt;/strong&gt;, &lt;strong&gt;HEIC&lt;/strong&gt;, and &lt;strong&gt;WEBP&lt;/strong&gt;. For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Animated GIF, and multi-page PNG/TIFF files, are not supported. Any animation effect of supported formats will be lost upon upload.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt; image: &amp;quot;sample_picture.jpg&amp;quot; &lt;/pre&gt;See &lt;strong&gt;Samples&lt;/strong&gt; for information.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &apos;multipart/form-data&apos;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;When an EPS image is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created&lt;/code&gt;. The method also returns the getImage URI in the &lt;strong&gt;Location&lt;/strong&gt; response header.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the image ID URI returned in the response &lt;a href=&quot;/develop/guides-v2/using-ebay-restful-apis#responseheaders&quot; target=&quot;_blank&quot;&gt;Location header&lt;/a&gt; provided in the following format:&lt;/p&gt;&lt;p&gt;&lt;code&gt;https://apim.ebay.com/commerce/media/v1_beta/image/&lt;em&gt;{image_id}&lt;/em&gt;&lt;/code&gt; &lt;/p&gt;&lt;p&gt;You can capture the entire URI, or just save the &lt;code&gt;{image_id}&lt;/code&gt; only. Pass the &lt;code&gt;{image_id}&lt;/code&gt; as a path parameter in the &lt;strong&gt;&lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-image-getimage&quot; &gt;getImage&lt;/a&gt;&lt;/strong&gt; method to return the value needed to associate an image to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot; target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CreateImageFromFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateImageFromFileRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreateImageFromFileRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
