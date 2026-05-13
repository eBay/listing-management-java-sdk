package com.ebay.listingmanagement.generated.media.video.item;

import com.ebay.listingmanagement.generated.media.models.Video;
import com.ebay.listingmanagement.generated.media.video.item.upload.UploadRequestBuilder;
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
 * Builds and executes requests for operations under /video/{video_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithVideoItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The upload property
     * @return a {@link UploadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadRequestBuilder upload() {
        return new UploadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithVideoItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/video/{video_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithVideoItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/video/{video_id}", rawUrl);
    }
    /**
     * This method retrieves a video&apos;s metadata and content given a specified &lt;b&gt;video ID&lt;/b&gt;. The method returns the &lt;b&gt;title&lt;/b&gt;, &lt;b&gt;size&lt;/b&gt;, &lt;b&gt;classification&lt;/b&gt;, &lt;b&gt;description&lt;/b&gt;, &lt;b&gt;video ID&lt;/b&gt;, &lt;b&gt;playList&lt;/b&gt;, &lt;b&gt;status&lt;/b&gt;, &lt;b&gt;status message&lt;/b&gt; (if any), &lt;b&gt;expiration  date&lt;/b&gt;, and &lt;b&gt;thumbnail&lt;/b&gt; image of the retrieved video. &lt;p&gt;The video&apos;s &lt;b&gt;title&lt;/b&gt;, &lt;b&gt;size&lt;/b&gt;, &lt;b&gt;classification&lt;/b&gt;, and &lt;b&gt;description&lt;/b&gt; are set using the &lt;a href=&quot; /api-docs/commerce/media/resources/video/methods/createVideo&quot; target=&quot;_blank&quot;&gt;createVideo&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;The video&apos;s &lt;b&gt;playList&lt;/b&gt; contains two URLs that link to instances of the streaming video based on the supported protocol.&lt;/p&gt;&lt;p&gt;The &lt;b&gt;status&lt;/b&gt; field contains the current status of the video. After a video upload is successfully completed, the video&apos;s &lt;b&gt;status&lt;/b&gt; will show as &lt;code&gt;PROCESSING&lt;/code&gt; until the video reaches one of the terminal states of &lt;code&gt;LIVE&lt;/code&gt;, &lt;code&gt;BLOCKED&lt;/code&gt; or &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;.&lt;p&gt; If a video&apos;s processing fails, it could be because the file is corrupted, is too large, or its size doesn&apos;t match what was provided in the metadata. Refer to the error messages to determine the cause of the video&apos;s failure to upload.&lt;/p&gt; &lt;p&gt; The &lt;b&gt;status message&lt;/b&gt; will indicate why a video was blocked from uploading.&lt;/p&gt;&lt;p&gt;If a video is not being used on an active listing, its &lt;b&gt;expiration date&lt;/b&gt; is automatically set to 30 days after the video&apos;s initial upload.&lt;p&gt;The video&apos;s &lt;b&gt;thumbnail&lt;/b&gt; image is automatically generated when the video is created.
     * @return a {@link Video}
     */
    @jakarta.annotation.Nullable
    public Video get() {
        return get(null);
    }
    /**
     * This method retrieves a video&apos;s metadata and content given a specified &lt;b&gt;video ID&lt;/b&gt;. The method returns the &lt;b&gt;title&lt;/b&gt;, &lt;b&gt;size&lt;/b&gt;, &lt;b&gt;classification&lt;/b&gt;, &lt;b&gt;description&lt;/b&gt;, &lt;b&gt;video ID&lt;/b&gt;, &lt;b&gt;playList&lt;/b&gt;, &lt;b&gt;status&lt;/b&gt;, &lt;b&gt;status message&lt;/b&gt; (if any), &lt;b&gt;expiration  date&lt;/b&gt;, and &lt;b&gt;thumbnail&lt;/b&gt; image of the retrieved video. &lt;p&gt;The video&apos;s &lt;b&gt;title&lt;/b&gt;, &lt;b&gt;size&lt;/b&gt;, &lt;b&gt;classification&lt;/b&gt;, and &lt;b&gt;description&lt;/b&gt; are set using the &lt;a href=&quot; /api-docs/commerce/media/resources/video/methods/createVideo&quot; target=&quot;_blank&quot;&gt;createVideo&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;The video&apos;s &lt;b&gt;playList&lt;/b&gt; contains two URLs that link to instances of the streaming video based on the supported protocol.&lt;/p&gt;&lt;p&gt;The &lt;b&gt;status&lt;/b&gt; field contains the current status of the video. After a video upload is successfully completed, the video&apos;s &lt;b&gt;status&lt;/b&gt; will show as &lt;code&gt;PROCESSING&lt;/code&gt; until the video reaches one of the terminal states of &lt;code&gt;LIVE&lt;/code&gt;, &lt;code&gt;BLOCKED&lt;/code&gt; or &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;.&lt;p&gt; If a video&apos;s processing fails, it could be because the file is corrupted, is too large, or its size doesn&apos;t match what was provided in the metadata. Refer to the error messages to determine the cause of the video&apos;s failure to upload.&lt;/p&gt; &lt;p&gt; The &lt;b&gt;status message&lt;/b&gt; will indicate why a video was blocked from uploading.&lt;/p&gt;&lt;p&gt;If a video is not being used on an active listing, its &lt;b&gt;expiration date&lt;/b&gt; is automatically set to 30 days after the video&apos;s initial upload.&lt;p&gt;The video&apos;s &lt;b&gt;thumbnail&lt;/b&gt; image is automatically generated when the video is created.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Video}
     */
    @jakarta.annotation.Nullable
    public Video get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Video::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves a video&apos;s metadata and content given a specified &lt;b&gt;video ID&lt;/b&gt;. The method returns the &lt;b&gt;title&lt;/b&gt;, &lt;b&gt;size&lt;/b&gt;, &lt;b&gt;classification&lt;/b&gt;, &lt;b&gt;description&lt;/b&gt;, &lt;b&gt;video ID&lt;/b&gt;, &lt;b&gt;playList&lt;/b&gt;, &lt;b&gt;status&lt;/b&gt;, &lt;b&gt;status message&lt;/b&gt; (if any), &lt;b&gt;expiration  date&lt;/b&gt;, and &lt;b&gt;thumbnail&lt;/b&gt; image of the retrieved video. &lt;p&gt;The video&apos;s &lt;b&gt;title&lt;/b&gt;, &lt;b&gt;size&lt;/b&gt;, &lt;b&gt;classification&lt;/b&gt;, and &lt;b&gt;description&lt;/b&gt; are set using the &lt;a href=&quot; /api-docs/commerce/media/resources/video/methods/createVideo&quot; target=&quot;_blank&quot;&gt;createVideo&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;The video&apos;s &lt;b&gt;playList&lt;/b&gt; contains two URLs that link to instances of the streaming video based on the supported protocol.&lt;/p&gt;&lt;p&gt;The &lt;b&gt;status&lt;/b&gt; field contains the current status of the video. After a video upload is successfully completed, the video&apos;s &lt;b&gt;status&lt;/b&gt; will show as &lt;code&gt;PROCESSING&lt;/code&gt; until the video reaches one of the terminal states of &lt;code&gt;LIVE&lt;/code&gt;, &lt;code&gt;BLOCKED&lt;/code&gt; or &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;.&lt;p&gt; If a video&apos;s processing fails, it could be because the file is corrupted, is too large, or its size doesn&apos;t match what was provided in the metadata. Refer to the error messages to determine the cause of the video&apos;s failure to upload.&lt;/p&gt; &lt;p&gt; The &lt;b&gt;status message&lt;/b&gt; will indicate why a video was blocked from uploading.&lt;/p&gt;&lt;p&gt;If a video is not being used on an active listing, its &lt;b&gt;expiration date&lt;/b&gt; is automatically set to 30 days after the video&apos;s initial upload.&lt;p&gt;The video&apos;s &lt;b&gt;thumbnail&lt;/b&gt; image is automatically generated when the video is created.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves a video&apos;s metadata and content given a specified &lt;b&gt;video ID&lt;/b&gt;. The method returns the &lt;b&gt;title&lt;/b&gt;, &lt;b&gt;size&lt;/b&gt;, &lt;b&gt;classification&lt;/b&gt;, &lt;b&gt;description&lt;/b&gt;, &lt;b&gt;video ID&lt;/b&gt;, &lt;b&gt;playList&lt;/b&gt;, &lt;b&gt;status&lt;/b&gt;, &lt;b&gt;status message&lt;/b&gt; (if any), &lt;b&gt;expiration  date&lt;/b&gt;, and &lt;b&gt;thumbnail&lt;/b&gt; image of the retrieved video. &lt;p&gt;The video&apos;s &lt;b&gt;title&lt;/b&gt;, &lt;b&gt;size&lt;/b&gt;, &lt;b&gt;classification&lt;/b&gt;, and &lt;b&gt;description&lt;/b&gt; are set using the &lt;a href=&quot; /api-docs/commerce/media/resources/video/methods/createVideo&quot; target=&quot;_blank&quot;&gt;createVideo&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;The video&apos;s &lt;b&gt;playList&lt;/b&gt; contains two URLs that link to instances of the streaming video based on the supported protocol.&lt;/p&gt;&lt;p&gt;The &lt;b&gt;status&lt;/b&gt; field contains the current status of the video. After a video upload is successfully completed, the video&apos;s &lt;b&gt;status&lt;/b&gt; will show as &lt;code&gt;PROCESSING&lt;/code&gt; until the video reaches one of the terminal states of &lt;code&gt;LIVE&lt;/code&gt;, &lt;code&gt;BLOCKED&lt;/code&gt; or &lt;code&gt;PROCESSING_FAILED&lt;/code&gt;.&lt;p&gt; If a video&apos;s processing fails, it could be because the file is corrupted, is too large, or its size doesn&apos;t match what was provided in the metadata. Refer to the error messages to determine the cause of the video&apos;s failure to upload.&lt;/p&gt; &lt;p&gt; The &lt;b&gt;status message&lt;/b&gt; will indicate why a video was blocked from uploading.&lt;/p&gt;&lt;p&gt;If a video is not being used on an active listing, its &lt;b&gt;expiration date&lt;/b&gt; is automatically set to 30 days after the video&apos;s initial upload.&lt;p&gt;The video&apos;s &lt;b&gt;thumbnail&lt;/b&gt; image is automatically generated when the video is created.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithVideoItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVideoItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithVideoItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
