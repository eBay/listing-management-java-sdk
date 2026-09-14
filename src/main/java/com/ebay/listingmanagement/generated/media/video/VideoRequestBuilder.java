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

package com.ebay.listingmanagement.generated.media.video;

import com.ebay.listingmanagement.generated.media.models.CreateVideoRequest;
import com.ebay.listingmanagement.generated.media.models.Error;
import com.ebay.listingmanagement.generated.media.video.item.WithVideoItemRequestBuilder;
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
 * Builds and executes requests for operations under /video
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.media.video.item collection
     * @param video_id The unique identifier of the video to be retrieved.
     * @return a {@link WithVideoItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVideoItemRequestBuilder byVideo_id(@jakarta.annotation.Nonnull final String video_id) {
        Objects.requireNonNull(video_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("video_id", video_id);
        return new WithVideoItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link VideoRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideoRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/video", pathParameters);
    }
    /**
     * Instantiates a new {@link VideoRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideoRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/video", rawUrl);
    }
    /**
     * This method creates a video resource. When using this method, specify the &lt;strong&gt;title&lt;/strong&gt;, &lt;strong&gt;size&lt;/strong&gt;, and &lt;strong&gt;classification&lt;/strong&gt; of the video resource to be created. &lt;strong&gt;Description&lt;/strong&gt; is an optional field for this method.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section3&quot; target=&quot;_blank&quot;&gt;Adding a video to your listing&lt;/a&gt; in the eBay Seller Center for details about video formatting requirements and restrictions, or visit the relevant eBay site help pages for the region in which the listings will be posted.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When a video resource is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt;The method also returns the location response header containing the &lt;strong&gt;video ID&lt;/strong&gt;, which you can use to retrieve the video.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; There is no ability to edit metadata on videos at this time. There is also no method to delete videos.&lt;/span&gt;&lt;br&gt;To upload a created video to a created video resource, use the &lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-video-uploadvideo&quot; &gt;uploadVideo&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param body The request to create a video, which must contain the video&apos;s &lt;strong&gt;title&lt;/strong&gt;, &lt;strong&gt;size&lt;/strong&gt;, and &lt;strong&gt;classification&lt;/strong&gt;. &lt;strong&gt;Description&lt;/strong&gt; is an optional field when creating videos.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final CreateVideoRequest body) {
        post(body, null);
    }
    /**
     * This method creates a video resource. When using this method, specify the &lt;strong&gt;title&lt;/strong&gt;, &lt;strong&gt;size&lt;/strong&gt;, and &lt;strong&gt;classification&lt;/strong&gt; of the video resource to be created. &lt;strong&gt;Description&lt;/strong&gt; is an optional field for this method.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section3&quot; target=&quot;_blank&quot;&gt;Adding a video to your listing&lt;/a&gt; in the eBay Seller Center for details about video formatting requirements and restrictions, or visit the relevant eBay site help pages for the region in which the listings will be posted.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When a video resource is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt;The method also returns the location response header containing the &lt;strong&gt;video ID&lt;/strong&gt;, which you can use to retrieve the video.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; There is no ability to edit metadata on videos at this time. There is also no method to delete videos.&lt;/span&gt;&lt;br&gt;To upload a created video to a created video resource, use the &lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-video-uploadvideo&quot; &gt;uploadVideo&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param body The request to create a video, which must contain the video&apos;s &lt;strong&gt;title&lt;/strong&gt;, &lt;strong&gt;size&lt;/strong&gt;, and &lt;strong&gt;classification&lt;/strong&gt;. &lt;strong&gt;Description&lt;/strong&gt; is an optional field when creating videos.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final CreateVideoRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method creates a video resource. When using this method, specify the &lt;strong&gt;title&lt;/strong&gt;, &lt;strong&gt;size&lt;/strong&gt;, and &lt;strong&gt;classification&lt;/strong&gt; of the video resource to be created. &lt;strong&gt;Description&lt;/strong&gt; is an optional field for this method.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section3&quot; target=&quot;_blank&quot;&gt;Adding a video to your listing&lt;/a&gt; in the eBay Seller Center for details about video formatting requirements and restrictions, or visit the relevant eBay site help pages for the region in which the listings will be posted.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When a video resource is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt;The method also returns the location response header containing the &lt;strong&gt;video ID&lt;/strong&gt;, which you can use to retrieve the video.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; There is no ability to edit metadata on videos at this time. There is also no method to delete videos.&lt;/span&gt;&lt;br&gt;To upload a created video to a created video resource, use the &lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-video-uploadvideo&quot; &gt;uploadVideo&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param body The request to create a video, which must contain the video&apos;s &lt;strong&gt;title&lt;/strong&gt;, &lt;strong&gt;size&lt;/strong&gt;, and &lt;strong&gt;classification&lt;/strong&gt;. &lt;strong&gt;Description&lt;/strong&gt; is an optional field when creating videos.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateVideoRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates a video resource. When using this method, specify the &lt;strong&gt;title&lt;/strong&gt;, &lt;strong&gt;size&lt;/strong&gt;, and &lt;strong&gt;classification&lt;/strong&gt; of the video resource to be created. &lt;strong&gt;Description&lt;/strong&gt; is an optional field for this method.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section3&quot; target=&quot;_blank&quot;&gt;Adding a video to your listing&lt;/a&gt; in the eBay Seller Center for details about video formatting requirements and restrictions, or visit the relevant eBay site help pages for the region in which the listings will be posted.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When a video resource is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt;The method also returns the location response header containing the &lt;strong&gt;video ID&lt;/strong&gt;, which you can use to retrieve the video.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; There is no ability to edit metadata on videos at this time. There is also no method to delete videos.&lt;/span&gt;&lt;br&gt;To upload a created video to a created video resource, use the &lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-video-uploadvideo&quot; &gt;uploadVideo&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param body The request to create a video, which must contain the video&apos;s &lt;strong&gt;title&lt;/strong&gt;, &lt;strong&gt;size&lt;/strong&gt;, and &lt;strong&gt;classification&lt;/strong&gt;. &lt;strong&gt;Description&lt;/strong&gt; is an optional field when creating videos.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateVideoRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link VideoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideoRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VideoRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
