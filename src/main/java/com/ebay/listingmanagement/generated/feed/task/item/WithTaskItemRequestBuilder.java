package com.ebay.listingmanagement.generated.feed.task.item;

import com.ebay.listingmanagement.generated.feed.models.Task;
import com.ebay.listingmanagement.generated.feed.task.item.download_input_file.DownloadInputFileRequestBuilder;
import com.ebay.listingmanagement.generated.feed.task.item.download_result_file.DownloadResultFileRequestBuilder;
import com.ebay.listingmanagement.generated.feed.task.item.upload_file.UploadFileRequestBuilder;
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
 * Builds and executes requests for operations under /task/{task_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTaskItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The download_input_file property
     * @return a {@link DownloadInputFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DownloadInputFileRequestBuilder downloadInputFile() {
        return new DownloadInputFileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The download_result_file property
     * @return a {@link DownloadResultFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DownloadResultFileRequestBuilder downloadResultFile() {
        return new DownloadResultFileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The upload_file property
     * @return a {@link UploadFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadFileRequestBuilder uploadFile() {
        return new UploadFileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithTaskItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTaskItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/task/{task_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithTaskItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTaskItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/task/{task_id}", rawUrl);
    }
    /**
     * This method retrieves the details and status of the specified task. The input is &lt;strong&gt;task_id&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;For details of how this method is used, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. 
     * @return a {@link Task}
     */
    @jakarta.annotation.Nullable
    public Task get() {
        return get(null);
    }
    /**
     * This method retrieves the details and status of the specified task. The input is &lt;strong&gt;task_id&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;For details of how this method is used, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Task}
     */
    @jakarta.annotation.Nullable
    public Task get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Task::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the details and status of the specified task. The input is &lt;strong&gt;task_id&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;For details of how this method is used, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. 
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the details and status of the specified task. The input is &lt;strong&gt;task_id&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;For details of how this method is used, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. 
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
     * @return a {@link WithTaskItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTaskItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithTaskItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
