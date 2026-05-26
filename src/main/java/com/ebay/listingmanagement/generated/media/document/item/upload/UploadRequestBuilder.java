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

package com.ebay.listingmanagement.generated.media.document.item.upload;

import com.ebay.listingmanagement.generated.media.models.DocumentResponse;
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
 * Builds and executes requests for operations under /document/{document_id}/upload
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UploadRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/document/{document_id}/upload", pathParameters);
    }
    /**
     * Instantiates a new {@link UploadRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/document/{document_id}/upload", rawUrl);
    }
    /**
     * This method associates the specified file with the specified document ID and uploads the input file. After the file has been uploaded, the processing of the file begins. Supported file types include .PDF, .JPEG/.JPG, and .PNG, with a maximum file size of 10 MB (10485760 bytes).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Animated and multi-page PNG files are not currently supported.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The document ID value returned in the response of the &lt;a href=&quot;/api-docs/commerce/media/resources/document/methods/createDocument&quot;&gt;createDocument&lt;/a&gt; method is a required input path parameter for this method. This value is also returned in the &lt;b&gt;location&lt;/b&gt; header of the &lt;b&gt;createDocument&lt;/b&gt; response payload.&lt;/span&gt;&lt;br&gt;A successful upload returns the HTTP Status Code &lt;code&gt;200 OK&lt;/code&gt;.&lt;br&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for additional information.&lt;/p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &lt;b&gt;multipart/form-data&lt;/b&gt;.&lt;/p&gt;&lt;/span&gt;&lt;/p&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt;file: @&amp;quot;/C:/Users/.../drone_user_warranty.pdf&amp;quot;&lt;/pre&gt;See &lt;a href=&quot;/api-docs/commerce/media/resources/document/methods/uploadDocument#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link DocumentResponse}
     */
    @jakarta.annotation.Nullable
    public DocumentResponse post() {
        return post(null);
    }
    /**
     * This method associates the specified file with the specified document ID and uploads the input file. After the file has been uploaded, the processing of the file begins. Supported file types include .PDF, .JPEG/.JPG, and .PNG, with a maximum file size of 10 MB (10485760 bytes).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Animated and multi-page PNG files are not currently supported.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The document ID value returned in the response of the &lt;a href=&quot;/api-docs/commerce/media/resources/document/methods/createDocument&quot;&gt;createDocument&lt;/a&gt; method is a required input path parameter for this method. This value is also returned in the &lt;b&gt;location&lt;/b&gt; header of the &lt;b&gt;createDocument&lt;/b&gt; response payload.&lt;/span&gt;&lt;br&gt;A successful upload returns the HTTP Status Code &lt;code&gt;200 OK&lt;/code&gt;.&lt;br&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for additional information.&lt;/p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &lt;b&gt;multipart/form-data&lt;/b&gt;.&lt;/p&gt;&lt;/span&gt;&lt;/p&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt;file: @&amp;quot;/C:/Users/.../drone_user_warranty.pdf&amp;quot;&lt;/pre&gt;See &lt;a href=&quot;/api-docs/commerce/media/resources/document/methods/uploadDocument#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DocumentResponse}
     */
    @jakarta.annotation.Nullable
    public DocumentResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DocumentResponse::createFromDiscriminatorValue);
    }
    /**
     * This method associates the specified file with the specified document ID and uploads the input file. After the file has been uploaded, the processing of the file begins. Supported file types include .PDF, .JPEG/.JPG, and .PNG, with a maximum file size of 10 MB (10485760 bytes).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Animated and multi-page PNG files are not currently supported.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The document ID value returned in the response of the &lt;a href=&quot;/api-docs/commerce/media/resources/document/methods/createDocument&quot;&gt;createDocument&lt;/a&gt; method is a required input path parameter for this method. This value is also returned in the &lt;b&gt;location&lt;/b&gt; header of the &lt;b&gt;createDocument&lt;/b&gt; response payload.&lt;/span&gt;&lt;br&gt;A successful upload returns the HTTP Status Code &lt;code&gt;200 OK&lt;/code&gt;.&lt;br&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for additional information.&lt;/p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &lt;b&gt;multipart/form-data&lt;/b&gt;.&lt;/p&gt;&lt;/span&gt;&lt;/p&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt;file: @&amp;quot;/C:/Users/.../drone_user_warranty.pdf&amp;quot;&lt;/pre&gt;See &lt;a href=&quot;/api-docs/commerce/media/resources/document/methods/uploadDocument#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This method associates the specified file with the specified document ID and uploads the input file. After the file has been uploaded, the processing of the file begins. Supported file types include .PDF, .JPEG/.JPG, and .PNG, with a maximum file size of 10 MB (10485760 bytes).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Animated and multi-page PNG files are not currently supported.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The document ID value returned in the response of the &lt;a href=&quot;/api-docs/commerce/media/resources/document/methods/createDocument&quot;&gt;createDocument&lt;/a&gt; method is a required input path parameter for this method. This value is also returned in the &lt;b&gt;location&lt;/b&gt; header of the &lt;b&gt;createDocument&lt;/b&gt; response payload.&lt;/span&gt;&lt;br&gt;A successful upload returns the HTTP Status Code &lt;code&gt;200 OK&lt;/code&gt;.&lt;br&gt;&lt;p&gt;See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for additional information.&lt;/p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to &lt;b&gt;multipart/form-data&lt;/b&gt;.&lt;/p&gt;&lt;/span&gt;&lt;/p&gt;This call does not have a JSON Request payload but uploads the file as form-data. For example:&lt;br /&gt; &lt;pre&gt;file: @&amp;quot;/C:/Users/.../drone_user_warranty.pdf&amp;quot;&lt;/pre&gt;See &lt;a href=&quot;/api-docs/commerce/media/resources/document/methods/uploadDocument#h2-samples&quot;&gt;Samples&lt;/a&gt; for information.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt;
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
