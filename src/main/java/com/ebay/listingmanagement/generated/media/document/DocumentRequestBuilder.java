package com.ebay.listingmanagement.generated.media.document;

import com.ebay.listingmanagement.generated.media.document.create_document_from_url.CreateDocumentFromUrlRequestBuilder;
import com.ebay.listingmanagement.generated.media.document.item.WithDocumentItemRequestBuilder;
import com.ebay.listingmanagement.generated.media.models.CreateDocumentRequest;
import com.ebay.listingmanagement.generated.media.models.CreateDocumentResponse;
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
 * Builds and executes requests for operations under /document
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DocumentRequestBuilder extends BaseRequestBuilder {
    /**
     * The create_document_from_url property
     * @return a {@link CreateDocumentFromUrlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateDocumentFromUrlRequestBuilder createDocumentFromUrl() {
        return new CreateDocumentFromUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.media.document.item collection
     * @param document_id The unique identifier of the document for which status and metadata is being retrieved.&lt;br&gt;&lt;br&gt;This value is returned in the response of the &lt;a href=&quot;/api-docs/commerce/media/resources/document/methods/createDocument&quot; target=&quot;_blank&quot;&gt;createDocument&lt;/a&gt; method.
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
        super(requestAdapter, "{+baseurl}/document", pathParameters);
    }
    /**
     * Instantiates a new {@link DocumentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DocumentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/document", rawUrl);
    }
    /**
     * This method stages a document to be uploaded, and requires the type of document to be uploaded, and the language(s) that the document contains. A successful call returns a &lt;b&gt;documentId&lt;/b&gt; value that is then used as a path parameter in an &lt;a href=&quot; /api-docs/commerce/media/resources/document/methods/uploadDocument&quot; &gt;uploadDocument&lt;/a&gt; call.&lt;p&gt;When a document is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt; The method returns &lt;b&gt;documentId&lt;/b&gt; in the response payload, which you can use to retrieve the document resource. This ID is also returned in the &lt;b&gt;location&lt;/b&gt; header, for convenience.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the document ID value returned in the response payload. This value is required to use the other methods in the &lt;b&gt;document&lt;/b&gt; resource, and also needed to associate a document to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;To upload a created document, use the document ID returned from this method&apos;s response with the &lt;a href=&quot; /api-docs/commerce/media/resources/document/methods/uploadDocument&quot; &gt;uploadDocument&lt;/a&gt; method. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for information on creating, uploading, and adding documents to listings.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt; 
     * @param body This type contains the metadata used to create the document ID.
     * @return a {@link CreateDocumentResponse}
     */
    @jakarta.annotation.Nullable
    public CreateDocumentResponse post(@jakarta.annotation.Nonnull final CreateDocumentRequest body) {
        return post(body, null);
    }
    /**
     * This method stages a document to be uploaded, and requires the type of document to be uploaded, and the language(s) that the document contains. A successful call returns a &lt;b&gt;documentId&lt;/b&gt; value that is then used as a path parameter in an &lt;a href=&quot; /api-docs/commerce/media/resources/document/methods/uploadDocument&quot; &gt;uploadDocument&lt;/a&gt; call.&lt;p&gt;When a document is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt; The method returns &lt;b&gt;documentId&lt;/b&gt; in the response payload, which you can use to retrieve the document resource. This ID is also returned in the &lt;b&gt;location&lt;/b&gt; header, for convenience.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the document ID value returned in the response payload. This value is required to use the other methods in the &lt;b&gt;document&lt;/b&gt; resource, and also needed to associate a document to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;To upload a created document, use the document ID returned from this method&apos;s response with the &lt;a href=&quot; /api-docs/commerce/media/resources/document/methods/uploadDocument&quot; &gt;uploadDocument&lt;/a&gt; method. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for information on creating, uploading, and adding documents to listings.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt; 
     * @param body This type contains the metadata used to create the document ID.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateDocumentResponse}
     */
    @jakarta.annotation.Nullable
    public CreateDocumentResponse post(@jakarta.annotation.Nonnull final CreateDocumentRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CreateDocumentResponse::createFromDiscriminatorValue);
    }
    /**
     * This method stages a document to be uploaded, and requires the type of document to be uploaded, and the language(s) that the document contains. A successful call returns a &lt;b&gt;documentId&lt;/b&gt; value that is then used as a path parameter in an &lt;a href=&quot; /api-docs/commerce/media/resources/document/methods/uploadDocument&quot; &gt;uploadDocument&lt;/a&gt; call.&lt;p&gt;When a document is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt; The method returns &lt;b&gt;documentId&lt;/b&gt; in the response payload, which you can use to retrieve the document resource. This ID is also returned in the &lt;b&gt;location&lt;/b&gt; header, for convenience.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the document ID value returned in the response payload. This value is required to use the other methods in the &lt;b&gt;document&lt;/b&gt; resource, and also needed to associate a document to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;To upload a created document, use the document ID returned from this method&apos;s response with the &lt;a href=&quot; /api-docs/commerce/media/resources/document/methods/uploadDocument&quot; &gt;uploadDocument&lt;/a&gt; method. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for information on creating, uploading, and adding documents to listings.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt; 
     * @param body This type contains the metadata used to create the document ID.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateDocumentRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method stages a document to be uploaded, and requires the type of document to be uploaded, and the language(s) that the document contains. A successful call returns a &lt;b&gt;documentId&lt;/b&gt; value that is then used as a path parameter in an &lt;a href=&quot; /api-docs/commerce/media/resources/document/methods/uploadDocument&quot; &gt;uploadDocument&lt;/a&gt; call.&lt;p&gt;When a document is successfully created, the method returns the HTTP Status Code &lt;code&gt;201 Created.&lt;/code&gt; The method returns &lt;b&gt;documentId&lt;/b&gt; in the response payload, which you can use to retrieve the document resource. This ID is also returned in the &lt;b&gt;location&lt;/b&gt; header, for convenience.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Make sure to capture the document ID value returned in the response payload. This value is required to use the other methods in the &lt;b&gt;document&lt;/b&gt; resource, and also needed to associate a document to a listing using the Trading and Inventory APIs.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;To upload a created document, use the document ID returned from this method&apos;s response with the &lt;a href=&quot; /api-docs/commerce/media/resources/document/methods/uploadDocument&quot; &gt;uploadDocument&lt;/a&gt; method. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html&quot; target=&quot;_blank&quot;&gt;Managing documents&lt;/a&gt; for information on creating, uploading, and adding documents to listings.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;All POST methods in the Media API, including this method, are subject to short-duration rate limits at the user level: 50 requests per 5 seconds.&lt;/p&gt;&lt;/div&gt; 
     * @param body This type contains the metadata used to create the document ID.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateDocumentRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
