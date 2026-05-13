package com.ebay.listingmanagement.generated.media.image.item;

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
 * Builds and executes requests for operations under /image/{image_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithImageItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithImageItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithImageItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/image/{image_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithImageItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithImageItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/image/{image_id}", rawUrl);
    }
    /**
     * This method retrieves an EPS image URL and its expiration details for the unique identifier specified in the path parameter &lt;b&gt;image_id&lt;/b&gt;. Use the retrieved EPS image URL to add the image to a listing through the &lt;b&gt;Inventory API&lt;/b&gt; or the &lt;b&gt;Trading API&lt;/b&gt;. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot;  target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If a user inputs a valid &lt;b&gt;image_id&lt;/b&gt; as a path parameter but the EPS image associated with that ID has expired, the call will fail and a &lt;b&gt;404 Not Found&lt;/b&gt; status code will be returned.&lt;/span&gt;
     * @return a {@link ImageResponse}
     */
    @jakarta.annotation.Nullable
    public ImageResponse get() {
        return get(null);
    }
    /**
     * This method retrieves an EPS image URL and its expiration details for the unique identifier specified in the path parameter &lt;b&gt;image_id&lt;/b&gt;. Use the retrieved EPS image URL to add the image to a listing through the &lt;b&gt;Inventory API&lt;/b&gt; or the &lt;b&gt;Trading API&lt;/b&gt;. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot;  target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If a user inputs a valid &lt;b&gt;image_id&lt;/b&gt; as a path parameter but the EPS image associated with that ID has expired, the call will fail and a &lt;b&gt;404 Not Found&lt;/b&gt; status code will be returned.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ImageResponse}
     */
    @jakarta.annotation.Nullable
    public ImageResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ImageResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves an EPS image URL and its expiration details for the unique identifier specified in the path parameter &lt;b&gt;image_id&lt;/b&gt;. Use the retrieved EPS image URL to add the image to a listing through the &lt;b&gt;Inventory API&lt;/b&gt; or the &lt;b&gt;Trading API&lt;/b&gt;. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot;  target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If a user inputs a valid &lt;b&gt;image_id&lt;/b&gt; as a path parameter but the EPS image associated with that ID has expired, the call will fail and a &lt;b&gt;404 Not Found&lt;/b&gt; status code will be returned.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves an EPS image URL and its expiration details for the unique identifier specified in the path parameter &lt;b&gt;image_id&lt;/b&gt;. Use the retrieved EPS image URL to add the image to a listing through the &lt;b&gt;Inventory API&lt;/b&gt; or the &lt;b&gt;Trading API&lt;/b&gt;. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html&quot;  target=&quot;_blank&quot;&gt;Managing images&lt;/a&gt; for additional details.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If a user inputs a valid &lt;b&gt;image_id&lt;/b&gt; as a path parameter but the EPS image associated with that ID has expired, the call will fail and a &lt;b&gt;404 Not Found&lt;/b&gt; status code will be returned.&lt;/span&gt;
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
     * @return a {@link WithImageItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithImageItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithImageItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
