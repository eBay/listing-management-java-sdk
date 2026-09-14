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

package com.ebay.listingmanagement.generated.media.video.item.upload;

import com.ebay.listingmanagement.generated.media.models.Error;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /video/{video_id}/upload
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UploadRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/video/{video_id}/upload", pathParameters);
    }
    /**
     * Instantiates a new {@link UploadRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/video/{video_id}/upload", rawUrl);
    }
    /**
     * This method associates the specified file with the specified &lt;b&gt;video ID&lt;/b&gt; and uploads the input file. After the file has been uploaded the processing of the file begins.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The size of the video to be uploaded must exactly match the size of the video&apos;s input stream that was set in the &lt;a href=&quot;/develop/api/sell/media_api#method-video-createVideo&quot;&gt;createVideo&lt;/a&gt; method. If the sizes do not match, the video will not upload successfully.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When a video is successfully uploaded, it returns the HTTP Status Code &lt;code&gt;200 OK&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;The status flow is &lt;code&gt;PENDING_UPLOAD&lt;/code&gt; &gt; &lt;code&gt;PROCESSING&lt;/code&gt; &gt; &lt;code&gt;LIVE&lt;/code&gt;,  &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;, or &lt;code&gt;BLOCKED&lt;/code&gt;. After a video upload is successfully completed, the status will show as &lt;code&gt;PROCESSING&lt;/code&gt; until the video reaches one of the terminal states of &lt;code&gt;LIVE&lt;/code&gt;, &lt;code&gt;BLOCKED&lt;/code&gt;, or &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;. If the size information (in bytes) provided is incorrect, the API will throw an error.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section3&quot; target=&quot;_blank&quot;&gt;Adding a video to your listing&lt;/a&gt; in the eBay Seller Center for details about video formatting requirements and restrictions, or visit the relevant eBay site help pages for the region in which the listings will be posted.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;To retrieve an uploaded video, use the &lt;a href=&quot;/api-docs/commerce/media/resources/video/methods/getVideo&quot; target=&quot;_blank&quot;&gt;getVideo&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @return a {@link InputStream}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 411 status code
     * @throws Error When receiving a 416 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post() {
        return post(null);
    }
    /**
     * This method associates the specified file with the specified &lt;b&gt;video ID&lt;/b&gt; and uploads the input file. After the file has been uploaded the processing of the file begins.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The size of the video to be uploaded must exactly match the size of the video&apos;s input stream that was set in the &lt;a href=&quot;/develop/api/sell/media_api#method-video-createVideo&quot;&gt;createVideo&lt;/a&gt; method. If the sizes do not match, the video will not upload successfully.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When a video is successfully uploaded, it returns the HTTP Status Code &lt;code&gt;200 OK&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;The status flow is &lt;code&gt;PENDING_UPLOAD&lt;/code&gt; &gt; &lt;code&gt;PROCESSING&lt;/code&gt; &gt; &lt;code&gt;LIVE&lt;/code&gt;,  &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;, or &lt;code&gt;BLOCKED&lt;/code&gt;. After a video upload is successfully completed, the status will show as &lt;code&gt;PROCESSING&lt;/code&gt; until the video reaches one of the terminal states of &lt;code&gt;LIVE&lt;/code&gt;, &lt;code&gt;BLOCKED&lt;/code&gt;, or &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;. If the size information (in bytes) provided is incorrect, the API will throw an error.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section3&quot; target=&quot;_blank&quot;&gt;Adding a video to your listing&lt;/a&gt; in the eBay Seller Center for details about video formatting requirements and restrictions, or visit the relevant eBay site help pages for the region in which the listings will be posted.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;To retrieve an uploaded video, use the &lt;a href=&quot;/api-docs/commerce/media/resources/video/methods/getVideo&quot; target=&quot;_blank&quot;&gt;getVideo&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 411 status code
     * @throws Error When receiving a 416 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("411", Error::createFromDiscriminatorValue);
        errorMapping.put("416", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * This method associates the specified file with the specified &lt;b&gt;video ID&lt;/b&gt; and uploads the input file. After the file has been uploaded the processing of the file begins.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The size of the video to be uploaded must exactly match the size of the video&apos;s input stream that was set in the &lt;a href=&quot;/develop/api/sell/media_api#method-video-createVideo&quot;&gt;createVideo&lt;/a&gt; method. If the sizes do not match, the video will not upload successfully.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When a video is successfully uploaded, it returns the HTTP Status Code &lt;code&gt;200 OK&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;The status flow is &lt;code&gt;PENDING_UPLOAD&lt;/code&gt; &gt; &lt;code&gt;PROCESSING&lt;/code&gt; &gt; &lt;code&gt;LIVE&lt;/code&gt;,  &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;, or &lt;code&gt;BLOCKED&lt;/code&gt;. After a video upload is successfully completed, the status will show as &lt;code&gt;PROCESSING&lt;/code&gt; until the video reaches one of the terminal states of &lt;code&gt;LIVE&lt;/code&gt;, &lt;code&gt;BLOCKED&lt;/code&gt;, or &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;. If the size information (in bytes) provided is incorrect, the API will throw an error.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section3&quot; target=&quot;_blank&quot;&gt;Adding a video to your listing&lt;/a&gt; in the eBay Seller Center for details about video formatting requirements and restrictions, or visit the relevant eBay site help pages for the region in which the listings will be posted.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;To retrieve an uploaded video, use the &lt;a href=&quot;/api-docs/commerce/media/resources/video/methods/getVideo&quot; target=&quot;_blank&quot;&gt;getVideo&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This method associates the specified file with the specified &lt;b&gt;video ID&lt;/b&gt; and uploads the input file. After the file has been uploaded the processing of the file begins.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The size of the video to be uploaded must exactly match the size of the video&apos;s input stream that was set in the &lt;a href=&quot;/develop/api/sell/media_api#method-video-createVideo&quot;&gt;createVideo&lt;/a&gt; method. If the sizes do not match, the video will not upload successfully.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When a video is successfully uploaded, it returns the HTTP Status Code &lt;code&gt;200 OK&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;The status flow is &lt;code&gt;PENDING_UPLOAD&lt;/code&gt; &gt; &lt;code&gt;PROCESSING&lt;/code&gt; &gt; &lt;code&gt;LIVE&lt;/code&gt;,  &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;, or &lt;code&gt;BLOCKED&lt;/code&gt;. After a video upload is successfully completed, the status will show as &lt;code&gt;PROCESSING&lt;/code&gt; until the video reaches one of the terminal states of &lt;code&gt;LIVE&lt;/code&gt;, &lt;code&gt;BLOCKED&lt;/code&gt;, or &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;. If the size information (in bytes) provided is incorrect, the API will throw an error.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section3&quot; target=&quot;_blank&quot;&gt;Adding a video to your listing&lt;/a&gt; in the eBay Seller Center for details about video formatting requirements and restrictions, or visit the relevant eBay site help pages for the region in which the listings will be posted.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;To retrieve an uploaded video, use the &lt;a href=&quot;/api-docs/commerce/media/resources/video/methods/getVideo&quot; target=&quot;_blank&quot;&gt;getVideo&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
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
     * @return a {@link UploadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UploadRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
