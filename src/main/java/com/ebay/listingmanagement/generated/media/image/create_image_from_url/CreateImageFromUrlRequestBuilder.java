package com.ebay.listingmanagement.generated.media.image.create_image_from_url;

import com.ebay.listingmanagement.generated.media.models.CreateImageFromUrlRequest;
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
 * Builds and executes requests for operations under /image/create_image_from_url
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateImageFromUrlRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CreateImageFromUrlRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateImageFromUrlRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/image/create_image_from_url", pathParameters);
    }
    /**
     * Instantiates a new {@link CreateImageFromUrlRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateImageFromUrlRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/image/create_image_from_url", rawUrl);
    }
    /**
     * This method uploads a picture to eBay Picture Services (EPS) from the specified URL. Specify the location of the picture on an external web server through the &lt;b&gt;imageUrl&lt;/b&gt; field. &lt;p&gt;All images must comply with eBays picture requirements, such as dimension and file size restrictions. For more information, see &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot; target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;. The image formats supported are &lt;b&gt;JPG&lt;/b&gt;, &lt;b&gt;GIF&lt;/b&gt;, &lt;b&gt;PNG&lt;/b&gt;, &lt;b&gt;BMP&lt;/b&gt;, &lt;b&gt;TIFF&lt;/b&gt;, &lt;b&gt;AVIF&lt;/b&gt;, &lt;b&gt;HEIC&lt;/b&gt;, and &lt;b&gt;WEBP&lt;/b&gt;. In addition, the provided URL must be secured using HTTPS (HTTP is not permitted). For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Animated GIF, and multi-page PNG/TIFF files, are not supported. Any animation effect of supported formats will be lost upon upload.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;When an EPS image is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created&lt;/code&gt;. The method also returns the getImage URI in the &lt;b&gt;Location&lt;/b&gt; response header.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the image ID URI returned in the response &lt;a href=&quot;/api-docs/commerce/media/resources/image/methods/createImageFromUrl#h2-output&quot;&gt;location header&lt;/a&gt; provided in the following format:&lt;/p&gt;&lt;p&gt;&lt;code&gt;https://apim.ebay.com/commerce/media/v1_beta/image/&lt;em&gt;{image_id}&lt;/em&gt;&lt;/code&gt; &lt;/p&gt;&lt;p&gt;You can capture the entire URI, or just save the &lt;code&gt;{image_id}&lt;/code&gt; only. Pass the &lt;code&gt;{image_id}&lt;/code&gt; as a path parameter in the &lt;b&gt;&lt;a href=&quot;/api-docs/commerce/media/resources/image/methods/getImage&quot; target=&quot;_blank&quot;&gt;getImage&lt;/a&gt;&lt;/b&gt; method to return the value needed to associate an image to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot; target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param body A type that provides the location of the image.
     * @return a {@link ImageResponse}
     */
    @jakarta.annotation.Nullable
    public ImageResponse post(@jakarta.annotation.Nonnull final CreateImageFromUrlRequest body) {
        return post(body, null);
    }
    /**
     * This method uploads a picture to eBay Picture Services (EPS) from the specified URL. Specify the location of the picture on an external web server through the &lt;b&gt;imageUrl&lt;/b&gt; field. &lt;p&gt;All images must comply with eBays picture requirements, such as dimension and file size restrictions. For more information, see &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot; target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;. The image formats supported are &lt;b&gt;JPG&lt;/b&gt;, &lt;b&gt;GIF&lt;/b&gt;, &lt;b&gt;PNG&lt;/b&gt;, &lt;b&gt;BMP&lt;/b&gt;, &lt;b&gt;TIFF&lt;/b&gt;, &lt;b&gt;AVIF&lt;/b&gt;, &lt;b&gt;HEIC&lt;/b&gt;, and &lt;b&gt;WEBP&lt;/b&gt;. In addition, the provided URL must be secured using HTTPS (HTTP is not permitted). For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Animated GIF, and multi-page PNG/TIFF files, are not supported. Any animation effect of supported formats will be lost upon upload.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;When an EPS image is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created&lt;/code&gt;. The method also returns the getImage URI in the &lt;b&gt;Location&lt;/b&gt; response header.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the image ID URI returned in the response &lt;a href=&quot;/api-docs/commerce/media/resources/image/methods/createImageFromUrl#h2-output&quot;&gt;location header&lt;/a&gt; provided in the following format:&lt;/p&gt;&lt;p&gt;&lt;code&gt;https://apim.ebay.com/commerce/media/v1_beta/image/&lt;em&gt;{image_id}&lt;/em&gt;&lt;/code&gt; &lt;/p&gt;&lt;p&gt;You can capture the entire URI, or just save the &lt;code&gt;{image_id}&lt;/code&gt; only. Pass the &lt;code&gt;{image_id}&lt;/code&gt; as a path parameter in the &lt;b&gt;&lt;a href=&quot;/api-docs/commerce/media/resources/image/methods/getImage&quot; target=&quot;_blank&quot;&gt;getImage&lt;/a&gt;&lt;/b&gt; method to return the value needed to associate an image to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot; target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param body A type that provides the location of the image.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ImageResponse}
     */
    @jakarta.annotation.Nullable
    public ImageResponse post(@jakarta.annotation.Nonnull final CreateImageFromUrlRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ImageResponse::createFromDiscriminatorValue);
    }
    /**
     * This method uploads a picture to eBay Picture Services (EPS) from the specified URL. Specify the location of the picture on an external web server through the &lt;b&gt;imageUrl&lt;/b&gt; field. &lt;p&gt;All images must comply with eBays picture requirements, such as dimension and file size restrictions. For more information, see &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot; target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;. The image formats supported are &lt;b&gt;JPG&lt;/b&gt;, &lt;b&gt;GIF&lt;/b&gt;, &lt;b&gt;PNG&lt;/b&gt;, &lt;b&gt;BMP&lt;/b&gt;, &lt;b&gt;TIFF&lt;/b&gt;, &lt;b&gt;AVIF&lt;/b&gt;, &lt;b&gt;HEIC&lt;/b&gt;, and &lt;b&gt;WEBP&lt;/b&gt;. In addition, the provided URL must be secured using HTTPS (HTTP is not permitted). For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Animated GIF, and multi-page PNG/TIFF files, are not supported. Any animation effect of supported formats will be lost upon upload.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;When an EPS image is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created&lt;/code&gt;. The method also returns the getImage URI in the &lt;b&gt;Location&lt;/b&gt; response header.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the image ID URI returned in the response &lt;a href=&quot;/api-docs/commerce/media/resources/image/methods/createImageFromUrl#h2-output&quot;&gt;location header&lt;/a&gt; provided in the following format:&lt;/p&gt;&lt;p&gt;&lt;code&gt;https://apim.ebay.com/commerce/media/v1_beta/image/&lt;em&gt;{image_id}&lt;/em&gt;&lt;/code&gt; &lt;/p&gt;&lt;p&gt;You can capture the entire URI, or just save the &lt;code&gt;{image_id}&lt;/code&gt; only. Pass the &lt;code&gt;{image_id}&lt;/code&gt; as a path parameter in the &lt;b&gt;&lt;a href=&quot;/api-docs/commerce/media/resources/image/methods/getImage&quot; target=&quot;_blank&quot;&gt;getImage&lt;/a&gt;&lt;/b&gt; method to return the value needed to associate an image to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot; target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param body A type that provides the location of the image.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateImageFromUrlRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method uploads a picture to eBay Picture Services (EPS) from the specified URL. Specify the location of the picture on an external web server through the &lt;b&gt;imageUrl&lt;/b&gt; field. &lt;p&gt;All images must comply with eBays picture requirements, such as dimension and file size restrictions. For more information, see &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot; target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;. The image formats supported are &lt;b&gt;JPG&lt;/b&gt;, &lt;b&gt;GIF&lt;/b&gt;, &lt;b&gt;PNG&lt;/b&gt;, &lt;b&gt;BMP&lt;/b&gt;, &lt;b&gt;TIFF&lt;/b&gt;, &lt;b&gt;AVIF&lt;/b&gt;, &lt;b&gt;HEIC&lt;/b&gt;, and &lt;b&gt;WEBP&lt;/b&gt;. In addition, the provided URL must be secured using HTTPS (HTTP is not permitted). For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Animated GIF, and multi-page PNG/TIFF files, are not supported. Any animation effect of supported formats will be lost upon upload.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;When an EPS image is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created&lt;/code&gt;. The method also returns the getImage URI in the &lt;b&gt;Location&lt;/b&gt; response header.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the image ID URI returned in the response &lt;a href=&quot;/api-docs/commerce/media/resources/image/methods/createImageFromUrl#h2-output&quot;&gt;location header&lt;/a&gt; provided in the following format:&lt;/p&gt;&lt;p&gt;&lt;code&gt;https://apim.ebay.com/commerce/media/v1_beta/image/&lt;em&gt;{image_id}&lt;/em&gt;&lt;/code&gt; &lt;/p&gt;&lt;p&gt;You can capture the entire URI, or just save the &lt;code&gt;{image_id}&lt;/code&gt; only. Pass the &lt;code&gt;{image_id}&lt;/code&gt; as a path parameter in the &lt;b&gt;&lt;a href=&quot;/api-docs/commerce/media/resources/image/methods/getImage&quot; target=&quot;_blank&quot;&gt;getImage&lt;/a&gt;&lt;/b&gt; method to return the value needed to associate an image to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot; target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds. &lt;/p&gt;&lt;/div&gt;
     * @param body A type that provides the location of the image.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateImageFromUrlRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CreateImageFromUrlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateImageFromUrlRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreateImageFromUrlRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
