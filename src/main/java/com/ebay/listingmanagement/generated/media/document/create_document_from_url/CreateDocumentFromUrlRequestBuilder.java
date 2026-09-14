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

package com.ebay.listingmanagement.generated.media.document.create_document_from_url;

import com.ebay.listingmanagement.generated.media.models.CreateDocumentFromUrlRequest;
import com.ebay.listingmanagement.generated.media.models.CreateDocumentResponse;
import com.ebay.listingmanagement.generated.media.models.Error;
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
 * Builds and executes requests for operations under /document/create_document_from_url
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateDocumentFromUrlRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CreateDocumentFromUrlRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateDocumentFromUrlRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/document/create_document_from_url", pathParameters);
    }
    /**
     * Instantiates a new {@link CreateDocumentFromUrlRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateDocumentFromUrlRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/document/create_document_from_url", rawUrl);
    }
    /**
     * This method downloads a document from the provided URL and adds that document to the user&apos;s account. This method requires the URL of the document, the type of document to be uploaded, and the language(s) that the document contains. &lt;br&gt;&lt;br&gt;When a document is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt; The method returns &lt;strong&gt;documentId&lt;/strong&gt; in the response payload, which you can use to retrieve the document resource. This ID is also returned in the &lt;strong&gt;location&lt;/strong&gt; header, for convenience.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the document ID value returned in the response payload. This value is required to use the other methods in the &lt;strong&gt;document&lt;/strong&gt; resource, and also needed to associate a document to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;After creating a document using this method, a &lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-document-getdocument&quot; &gt;getDocument&lt;/a&gt; call should be made to check for a &lt;strong&gt;documentStatus&lt;/strong&gt; of &lt;code&gt;ACCEPTED&lt;/code&gt;. Only documents with this status can be added to a listing. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for more information on creating, uploading, and adding documents to listings.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt;
     * @param body This type contains the metadata used to create the document ID when creating a document using a URL.
     * @return a {@link CreateDocumentResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CreateDocumentResponse post(@jakarta.annotation.Nonnull final CreateDocumentFromUrlRequest body) {
        return post(body, null);
    }
    /**
     * This method downloads a document from the provided URL and adds that document to the user&apos;s account. This method requires the URL of the document, the type of document to be uploaded, and the language(s) that the document contains. &lt;br&gt;&lt;br&gt;When a document is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt; The method returns &lt;strong&gt;documentId&lt;/strong&gt; in the response payload, which you can use to retrieve the document resource. This ID is also returned in the &lt;strong&gt;location&lt;/strong&gt; header, for convenience.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the document ID value returned in the response payload. This value is required to use the other methods in the &lt;strong&gt;document&lt;/strong&gt; resource, and also needed to associate a document to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;After creating a document using this method, a &lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-document-getdocument&quot; &gt;getDocument&lt;/a&gt; call should be made to check for a &lt;strong&gt;documentStatus&lt;/strong&gt; of &lt;code&gt;ACCEPTED&lt;/code&gt;. Only documents with this status can be added to a listing. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for more information on creating, uploading, and adding documents to listings.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt;
     * @param body This type contains the metadata used to create the document ID when creating a document using a URL.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateDocumentResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CreateDocumentResponse post(@jakarta.annotation.Nonnull final CreateDocumentFromUrlRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CreateDocumentResponse::createFromDiscriminatorValue);
    }
    /**
     * This method downloads a document from the provided URL and adds that document to the user&apos;s account. This method requires the URL of the document, the type of document to be uploaded, and the language(s) that the document contains. &lt;br&gt;&lt;br&gt;When a document is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt; The method returns &lt;strong&gt;documentId&lt;/strong&gt; in the response payload, which you can use to retrieve the document resource. This ID is also returned in the &lt;strong&gt;location&lt;/strong&gt; header, for convenience.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the document ID value returned in the response payload. This value is required to use the other methods in the &lt;strong&gt;document&lt;/strong&gt; resource, and also needed to associate a document to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;After creating a document using this method, a &lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-document-getdocument&quot; &gt;getDocument&lt;/a&gt; call should be made to check for a &lt;strong&gt;documentStatus&lt;/strong&gt; of &lt;code&gt;ACCEPTED&lt;/code&gt;. Only documents with this status can be added to a listing. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for more information on creating, uploading, and adding documents to listings.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt;
     * @param body This type contains the metadata used to create the document ID when creating a document using a URL.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateDocumentFromUrlRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method downloads a document from the provided URL and adds that document to the user&apos;s account. This method requires the URL of the document, the type of document to be uploaded, and the language(s) that the document contains. &lt;br&gt;&lt;br&gt;When a document is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt; The method returns &lt;strong&gt;documentId&lt;/strong&gt; in the response payload, which you can use to retrieve the document resource. This ID is also returned in the &lt;strong&gt;location&lt;/strong&gt; header, for convenience.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the document ID value returned in the response payload. This value is required to use the other methods in the &lt;strong&gt;document&lt;/strong&gt; resource, and also needed to associate a document to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;After creating a document using this method, a &lt;a href=&quot;/develop/api/sell/media_api#sell-media_api-document-getdocument&quot; &gt;getDocument&lt;/a&gt; call should be made to check for a &lt;strong&gt;documentStatus&lt;/strong&gt; of &lt;code&gt;ACCEPTED&lt;/code&gt;. Only documents with this status can be added to a listing. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for more information on creating, uploading, and adding documents to listings.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt;
     * @param body This type contains the metadata used to create the document ID when creating a document using a URL.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateDocumentFromUrlRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CreateDocumentFromUrlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateDocumentFromUrlRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreateDocumentFromUrlRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
