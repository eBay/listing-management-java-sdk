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

package com.ebay.listingmanagement.generated.media.post_order.document;

import com.ebay.listingmanagement.generated.media.models.Error;
import com.ebay.listingmanagement.generated.media.post_order.document.item.WithDocumentItemRequestBuilder;
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
 * Builds and executes requests for operations under /post_order/document
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DocumentRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.media.post_order.document.item collection
     * @param document_id This path parameter is the unique identifier of the document associated with the file to be downloaded. This ID was returned in the &lt;a href=&quot;/develop/guides-v2/using-ebay-restful-apis#responseheaders&quot; target=&quot;_blank&quot;&gt;Location response header&lt;/a&gt; when calling the &lt;strong&gt;&lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-post_order-uploadpostorderdocument&quot;&gt;uploadPostOrderDocument&lt;/a&gt;&lt;/strong&gt; method to upload the document.
     * @return a {@link WithDocumentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithDocumentItemRequestBuilder byDocument_id(@jakarta.annotation.Nonnull final String document_id) {
        Objects.requireNonNull(document_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("document_id", document_id);
        return new WithDocumentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link DocumentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DocumentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post_order/document", pathParameters);
    }
    /**
     * Instantiates a new {@link DocumentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DocumentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post_order/document", rawUrl);
    }
    /**
     * This method uploads a document for postorder processes (for example, a seller providing a return shipping label).&lt;p&gt; Supported file types include .PDF, .JPEG/.JPG, .BMP, .GIF and .PNG, with a maximum file size of 5&amp;nbsp;MB&amp;nbsp;(5,242,880&amp;nbsp;bytes).&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Animated and multi-page PNG files are not currently supported. For multi-page content, use PDF. The maximum number of pages allowed varies by the &lt;strong&gt;documentUsageType&lt;/strong&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Send a multipart/formdata request with:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;strong&gt;file&lt;/strong&gt;: the document file, set &lt;code&gt;key: file&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;documentUsageType&lt;/strong&gt;: for example, &lt;code&gt;RETURN_SHIPPING_LABEL&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;entityType&lt;/strong&gt;: for example, &lt;code&gt;RETURNS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;entityId&lt;/strong&gt;: the unique identifier for the post-order entity&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;A successful call returns the HTTP Status Code &lt;strong&gt;201 Created&lt;/strong&gt; with the document ID in the &lt;strong&gt;Location header&lt;/strong&gt; (no response body is returned). The documents initial state is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. When its identifier is associated with a post-order entity through an eBay GraphQL mutation, the state changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. &lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;&lt;br&gt;&lt;ul&gt;&lt;li&gt;Capture and retain the &lt;strong&gt;documentId&lt;/strong&gt; in the response&apos;s &lt;a href=&quot;/develop/guides-v2/using-ebay-restful-apis#responseheaders&quot; target=&quot;_blank&quot;&gt;Location header&lt;/a&gt;. It is required to use the other &lt;strong&gt;post_order&lt;/strong&gt; methods and to associate the document with a post-order entity. The location response header contains the URI of the newly created document ID in the format:&lt;br&gt;&lt;code&gt; https://apiz.ebay.com/commerce/media/v1_beta/post_order/document/{documentId}&lt;/code&gt;&lt;/li&gt;&lt;li&gt;All documents (published or submitted) expire and become inaccessible after their expiration date.&lt;/li&gt;&lt;li&gt;All &lt;strong&gt;POST&lt;/strong&gt; methods in the &lt;strong&gt;Media API&lt;/strong&gt;, including this method, are subject to short-duration, user-level rate limits: 50 requests per 5 seconds.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;
     * @return a {@link DocumentPostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public DocumentPostResponse post() {
        return post(null);
    }
    /**
     * This method uploads a document for postorder processes (for example, a seller providing a return shipping label).&lt;p&gt; Supported file types include .PDF, .JPEG/.JPG, .BMP, .GIF and .PNG, with a maximum file size of 5&amp;nbsp;MB&amp;nbsp;(5,242,880&amp;nbsp;bytes).&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Animated and multi-page PNG files are not currently supported. For multi-page content, use PDF. The maximum number of pages allowed varies by the &lt;strong&gt;documentUsageType&lt;/strong&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Send a multipart/formdata request with:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;strong&gt;file&lt;/strong&gt;: the document file, set &lt;code&gt;key: file&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;documentUsageType&lt;/strong&gt;: for example, &lt;code&gt;RETURN_SHIPPING_LABEL&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;entityType&lt;/strong&gt;: for example, &lt;code&gt;RETURNS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;entityId&lt;/strong&gt;: the unique identifier for the post-order entity&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;A successful call returns the HTTP Status Code &lt;strong&gt;201 Created&lt;/strong&gt; with the document ID in the &lt;strong&gt;Location header&lt;/strong&gt; (no response body is returned). The documents initial state is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. When its identifier is associated with a post-order entity through an eBay GraphQL mutation, the state changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. &lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;&lt;br&gt;&lt;ul&gt;&lt;li&gt;Capture and retain the &lt;strong&gt;documentId&lt;/strong&gt; in the response&apos;s &lt;a href=&quot;/develop/guides-v2/using-ebay-restful-apis#responseheaders&quot; target=&quot;_blank&quot;&gt;Location header&lt;/a&gt;. It is required to use the other &lt;strong&gt;post_order&lt;/strong&gt; methods and to associate the document with a post-order entity. The location response header contains the URI of the newly created document ID in the format:&lt;br&gt;&lt;code&gt; https://apiz.ebay.com/commerce/media/v1_beta/post_order/document/{documentId}&lt;/code&gt;&lt;/li&gt;&lt;li&gt;All documents (published or submitted) expire and become inaccessible after their expiration date.&lt;/li&gt;&lt;li&gt;All &lt;strong&gt;POST&lt;/strong&gt; methods in the &lt;strong&gt;Media API&lt;/strong&gt;, including this method, are subject to short-duration, user-level rate limits: 50 requests per 5 seconds.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DocumentPostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public DocumentPostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("401", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DocumentPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method uploads a document for postorder processes (for example, a seller providing a return shipping label).&lt;p&gt; Supported file types include .PDF, .JPEG/.JPG, .BMP, .GIF and .PNG, with a maximum file size of 5&amp;nbsp;MB&amp;nbsp;(5,242,880&amp;nbsp;bytes).&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Animated and multi-page PNG files are not currently supported. For multi-page content, use PDF. The maximum number of pages allowed varies by the &lt;strong&gt;documentUsageType&lt;/strong&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Send a multipart/formdata request with:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;strong&gt;file&lt;/strong&gt;: the document file, set &lt;code&gt;key: file&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;documentUsageType&lt;/strong&gt;: for example, &lt;code&gt;RETURN_SHIPPING_LABEL&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;entityType&lt;/strong&gt;: for example, &lt;code&gt;RETURNS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;entityId&lt;/strong&gt;: the unique identifier for the post-order entity&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;A successful call returns the HTTP Status Code &lt;strong&gt;201 Created&lt;/strong&gt; with the document ID in the &lt;strong&gt;Location header&lt;/strong&gt; (no response body is returned). The documents initial state is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. When its identifier is associated with a post-order entity through an eBay GraphQL mutation, the state changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. &lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;&lt;br&gt;&lt;ul&gt;&lt;li&gt;Capture and retain the &lt;strong&gt;documentId&lt;/strong&gt; in the response&apos;s &lt;a href=&quot;/develop/guides-v2/using-ebay-restful-apis#responseheaders&quot; target=&quot;_blank&quot;&gt;Location header&lt;/a&gt;. It is required to use the other &lt;strong&gt;post_order&lt;/strong&gt; methods and to associate the document with a post-order entity. The location response header contains the URI of the newly created document ID in the format:&lt;br&gt;&lt;code&gt; https://apiz.ebay.com/commerce/media/v1_beta/post_order/document/{documentId}&lt;/code&gt;&lt;/li&gt;&lt;li&gt;All documents (published or submitted) expire and become inaccessible after their expiration date.&lt;/li&gt;&lt;li&gt;All &lt;strong&gt;POST&lt;/strong&gt; methods in the &lt;strong&gt;Media API&lt;/strong&gt;, including this method, are subject to short-duration, user-level rate limits: 50 requests per 5 seconds.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This method uploads a document for postorder processes (for example, a seller providing a return shipping label).&lt;p&gt; Supported file types include .PDF, .JPEG/.JPG, .BMP, .GIF and .PNG, with a maximum file size of 5&amp;nbsp;MB&amp;nbsp;(5,242,880&amp;nbsp;bytes).&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Animated and multi-page PNG files are not currently supported. For multi-page content, use PDF. The maximum number of pages allowed varies by the &lt;strong&gt;documentUsageType&lt;/strong&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Send a multipart/formdata request with:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;strong&gt;file&lt;/strong&gt;: the document file, set &lt;code&gt;key: file&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;documentUsageType&lt;/strong&gt;: for example, &lt;code&gt;RETURN_SHIPPING_LABEL&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;entityType&lt;/strong&gt;: for example, &lt;code&gt;RETURNS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;entityId&lt;/strong&gt;: the unique identifier for the post-order entity&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;A successful call returns the HTTP Status Code &lt;strong&gt;201 Created&lt;/strong&gt; with the document ID in the &lt;strong&gt;Location header&lt;/strong&gt; (no response body is returned). The documents initial state is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. When its identifier is associated with a post-order entity through an eBay GraphQL mutation, the state changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. &lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;&lt;br&gt;&lt;ul&gt;&lt;li&gt;Capture and retain the &lt;strong&gt;documentId&lt;/strong&gt; in the response&apos;s &lt;a href=&quot;/develop/guides-v2/using-ebay-restful-apis#responseheaders&quot; target=&quot;_blank&quot;&gt;Location header&lt;/a&gt;. It is required to use the other &lt;strong&gt;post_order&lt;/strong&gt; methods and to associate the document with a post-order entity. The location response header contains the URI of the newly created document ID in the format:&lt;br&gt;&lt;code&gt; https://apiz.ebay.com/commerce/media/v1_beta/post_order/document/{documentId}&lt;/code&gt;&lt;/li&gt;&lt;li&gt;All documents (published or submitted) expire and become inaccessible after their expiration date.&lt;/li&gt;&lt;li&gt;All &lt;strong&gt;POST&lt;/strong&gt; methods in the &lt;strong&gt;Media API&lt;/strong&gt;, including this method, are subject to short-duration, user-level rate limits: 50 requests per 5 seconds.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;
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
     * @return a {@link DocumentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DocumentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DocumentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
