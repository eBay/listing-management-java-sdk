package com.ebay.listingmanagement.generated.feed.task.item.upload_file;

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
 * Builds and executes requests for operations under /task/{task_id}/upload_file
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadFileRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UploadFileRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadFileRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/task/{task_id}/upload_file", pathParameters);
    }
    /**
     * Instantiates a new {@link UploadFileRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadFileRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/task/{task_id}/upload_file", rawUrl);
    }
    /**
     * This method associates the specified file with the specified task ID and uploads the input file. After the file has been uploaded, the processing of the file begins. &lt;br&gt;&lt;br&gt;Reports often take time to generate and it&apos;s common for this method to return an HTTP status of 202, which indicates the report is being generated. Use the &lt;b&gt; getTask&lt;/b&gt; with the task ID or &lt;b&gt; getTasks&lt;/b&gt; to determine the status of a report. &lt;br&gt;&lt;br&gt;The status flow is &lt;code&gt;QUEUED&lt;/code&gt; &amp;gt; &lt;code&gt;IN_PROCESS&lt;/code&gt; &amp;gt; &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;. When the status is &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;, this indicates the file has been processed and the order report can be downloaded. If there are errors, they will be indicated in the report file. &lt;br /&gt;&lt;br /&gt;For details of how this method is used in the upload flow, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. &lt;br&gt;&lt;br&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt; fileName: &amp;quot;AddFixedPriceItem_Macbook.xml&amp;quot; &lt;br /&gt; name: &amp;quot;file&amp;quot; &lt;br /&gt; type: &amp;quot;form-data&amp;quot; &lt;br /&gt; file: @&amp;quot;/C:/Users/.../AddFixedPriceItem_Macbook.7z&amp;quot;&lt;/pre&gt;See &lt;a href=&quot;/api-docs/sell/feed/resources/task/methods/uploadFile#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This method applies to all &lt;a href=&quot;/api-docs/sell/static/feed/fx-feeds-quick-reference.html#availabl&quot; target=&quot;_blank&quot;&gt;Seller Hub feed types&lt;/a&gt;, and to all &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS feed types&lt;/a&gt; except &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt; and &lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &quot;&lt;strong&gt;multipart/form-data&lt;/strong&gt;&quot;. See &lt;a href=&quot;/api-docs/sell/feed/resources/task/methods/uploadFile#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For LMS feed types, upload a regular XML file or an XML file in zipped format (both formats are allowed).&lt;/span&gt;&lt;/p&gt;
     * @return a {@link UploadFilePostResponse}
     */
    @jakarta.annotation.Nullable
    public UploadFilePostResponse post() {
        return post(null);
    }
    /**
     * This method associates the specified file with the specified task ID and uploads the input file. After the file has been uploaded, the processing of the file begins. &lt;br&gt;&lt;br&gt;Reports often take time to generate and it&apos;s common for this method to return an HTTP status of 202, which indicates the report is being generated. Use the &lt;b&gt; getTask&lt;/b&gt; with the task ID or &lt;b&gt; getTasks&lt;/b&gt; to determine the status of a report. &lt;br&gt;&lt;br&gt;The status flow is &lt;code&gt;QUEUED&lt;/code&gt; &amp;gt; &lt;code&gt;IN_PROCESS&lt;/code&gt; &amp;gt; &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;. When the status is &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;, this indicates the file has been processed and the order report can be downloaded. If there are errors, they will be indicated in the report file. &lt;br /&gt;&lt;br /&gt;For details of how this method is used in the upload flow, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. &lt;br&gt;&lt;br&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt; fileName: &amp;quot;AddFixedPriceItem_Macbook.xml&amp;quot; &lt;br /&gt; name: &amp;quot;file&amp;quot; &lt;br /&gt; type: &amp;quot;form-data&amp;quot; &lt;br /&gt; file: @&amp;quot;/C:/Users/.../AddFixedPriceItem_Macbook.7z&amp;quot;&lt;/pre&gt;See &lt;a href=&quot;/api-docs/sell/feed/resources/task/methods/uploadFile#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This method applies to all &lt;a href=&quot;/api-docs/sell/static/feed/fx-feeds-quick-reference.html#availabl&quot; target=&quot;_blank&quot;&gt;Seller Hub feed types&lt;/a&gt;, and to all &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS feed types&lt;/a&gt; except &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt; and &lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &quot;&lt;strong&gt;multipart/form-data&lt;/strong&gt;&quot;. See &lt;a href=&quot;/api-docs/sell/feed/resources/task/methods/uploadFile#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For LMS feed types, upload a regular XML file or an XML file in zipped format (both formats are allowed).&lt;/span&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UploadFilePostResponse}
     */
    @jakarta.annotation.Nullable
    public UploadFilePostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UploadFilePostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method associates the specified file with the specified task ID and uploads the input file. After the file has been uploaded, the processing of the file begins. &lt;br&gt;&lt;br&gt;Reports often take time to generate and it&apos;s common for this method to return an HTTP status of 202, which indicates the report is being generated. Use the &lt;b&gt; getTask&lt;/b&gt; with the task ID or &lt;b&gt; getTasks&lt;/b&gt; to determine the status of a report. &lt;br&gt;&lt;br&gt;The status flow is &lt;code&gt;QUEUED&lt;/code&gt; &amp;gt; &lt;code&gt;IN_PROCESS&lt;/code&gt; &amp;gt; &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;. When the status is &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;, this indicates the file has been processed and the order report can be downloaded. If there are errors, they will be indicated in the report file. &lt;br /&gt;&lt;br /&gt;For details of how this method is used in the upload flow, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. &lt;br&gt;&lt;br&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt; fileName: &amp;quot;AddFixedPriceItem_Macbook.xml&amp;quot; &lt;br /&gt; name: &amp;quot;file&amp;quot; &lt;br /&gt; type: &amp;quot;form-data&amp;quot; &lt;br /&gt; file: @&amp;quot;/C:/Users/.../AddFixedPriceItem_Macbook.7z&amp;quot;&lt;/pre&gt;See &lt;a href=&quot;/api-docs/sell/feed/resources/task/methods/uploadFile#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This method applies to all &lt;a href=&quot;/api-docs/sell/static/feed/fx-feeds-quick-reference.html#availabl&quot; target=&quot;_blank&quot;&gt;Seller Hub feed types&lt;/a&gt;, and to all &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS feed types&lt;/a&gt; except &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt; and &lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &quot;&lt;strong&gt;multipart/form-data&lt;/strong&gt;&quot;. See &lt;a href=&quot;/api-docs/sell/feed/resources/task/methods/uploadFile#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For LMS feed types, upload a regular XML file or an XML file in zipped format (both formats are allowed).&lt;/span&gt;&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This method associates the specified file with the specified task ID and uploads the input file. After the file has been uploaded, the processing of the file begins. &lt;br&gt;&lt;br&gt;Reports often take time to generate and it&apos;s common for this method to return an HTTP status of 202, which indicates the report is being generated. Use the &lt;b&gt; getTask&lt;/b&gt; with the task ID or &lt;b&gt; getTasks&lt;/b&gt; to determine the status of a report. &lt;br&gt;&lt;br&gt;The status flow is &lt;code&gt;QUEUED&lt;/code&gt; &amp;gt; &lt;code&gt;IN_PROCESS&lt;/code&gt; &amp;gt; &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;. When the status is &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;, this indicates the file has been processed and the order report can be downloaded. If there are errors, they will be indicated in the report file. &lt;br /&gt;&lt;br /&gt;For details of how this method is used in the upload flow, see &lt;a href=&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. &lt;br&gt;&lt;br&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt; fileName: &amp;quot;AddFixedPriceItem_Macbook.xml&amp;quot; &lt;br /&gt; name: &amp;quot;file&amp;quot; &lt;br /&gt; type: &amp;quot;form-data&amp;quot; &lt;br /&gt; file: @&amp;quot;/C:/Users/.../AddFixedPriceItem_Macbook.7z&amp;quot;&lt;/pre&gt;See &lt;a href=&quot;/api-docs/sell/feed/resources/task/methods/uploadFile#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This method applies to all &lt;a href=&quot;/api-docs/sell/static/feed/fx-feeds-quick-reference.html#availabl&quot; target=&quot;_blank&quot;&gt;Seller Hub feed types&lt;/a&gt;, and to all &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl&quot; target=&quot;_blank&quot;&gt;LMS feed types&lt;/a&gt; except &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt; and &lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &quot;&lt;strong&gt;multipart/form-data&lt;/strong&gt;&quot;. See &lt;a href=&quot;/api-docs/sell/feed/resources/task/methods/uploadFile#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For LMS feed types, upload a regular XML file or an XML file in zipped format (both formats are allowed).&lt;/span&gt;&lt;/p&gt;
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
     * @return a {@link UploadFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadFileRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UploadFileRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
