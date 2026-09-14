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

package com.ebay.listingmanagement.generated.media.post_order.document.item;

import com.ebay.listingmanagement.generated.media.models.Error;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /post_order/document/{document_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithDocumentItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithDocumentItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithDocumentItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post_order/document/{document_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithDocumentItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithDocumentItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post_order/document/{document_id}", rawUrl);
    }
    /**
     * This method deletes a previously uploaded document by its document ID. Only documents in &lt;strong&gt;SUBMITTED&lt;/strong&gt; state can be removed; documents in the &lt;strong&gt;PUBLISHED&lt;/strong&gt; state cannot be deleted.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;After a document is uploaded (but not yet published), its status is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. When its identifier is associated with a postorder entity through an eBay GraphQL mutation, the status changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All documents, whether submitted or published, expire and become inaccessible after their expiration date.&lt;/p&gt;&lt;/div&gt; 
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method deletes a previously uploaded document by its document ID. Only documents in &lt;strong&gt;SUBMITTED&lt;/strong&gt; state can be removed; documents in the &lt;strong&gt;PUBLISHED&lt;/strong&gt; state cannot be deleted.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;After a document is uploaded (but not yet published), its status is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. When its identifier is associated with a postorder entity through an eBay GraphQL mutation, the status changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All documents, whether submitted or published, expire and become inaccessible after their expiration date.&lt;/p&gt;&lt;/div&gt; 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("401", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method downloads the  file associated with the specified document ID. Access depends on the documents state:&lt;ul&gt;&lt;li&gt;SUBMITTED: Only the document owner can download it &lt;/li&gt;&lt;li&gt;PUBLISHED: The document is no longer restricted to the owner and can be downloaded by authorized parties involved in the specific postorder flow based on the &lt;strong&gt;documentUsageType&lt;/strong&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;After a document is uploaded (but not yet published), its status is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. Once its identifier is linked to a postorder entity through an eBay GraphQL mutation, the status changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;The document must be in the &lt;strong&gt;SUBMITTED&lt;/strong&gt;  or &lt;strong&gt;PUBLISHED&lt;/strong&gt; state to be downloadable. All documents (published or submitted) expire and become inaccessible after their expiration date.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link InputStream}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * This method downloads the  file associated with the specified document ID. Access depends on the documents state:&lt;ul&gt;&lt;li&gt;SUBMITTED: Only the document owner can download it &lt;/li&gt;&lt;li&gt;PUBLISHED: The document is no longer restricted to the owner and can be downloaded by authorized parties involved in the specific postorder flow based on the &lt;strong&gt;documentUsageType&lt;/strong&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;After a document is uploaded (but not yet published), its status is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. Once its identifier is linked to a postorder entity through an eBay GraphQL mutation, the status changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;The document must be in the &lt;strong&gt;SUBMITTED&lt;/strong&gt;  or &lt;strong&gt;PUBLISHED&lt;/strong&gt; state to be downloadable. All documents (published or submitted) expire and become inaccessible after their expiration date.&lt;/p&gt;&lt;/div&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("401", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * This method deletes a previously uploaded document by its document ID. Only documents in &lt;strong&gt;SUBMITTED&lt;/strong&gt; state can be removed; documents in the &lt;strong&gt;PUBLISHED&lt;/strong&gt; state cannot be deleted.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;After a document is uploaded (but not yet published), its status is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. When its identifier is associated with a postorder entity through an eBay GraphQL mutation, the status changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All documents, whether submitted or published, expire and become inaccessible after their expiration date.&lt;/p&gt;&lt;/div&gt; 
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method deletes a previously uploaded document by its document ID. Only documents in &lt;strong&gt;SUBMITTED&lt;/strong&gt; state can be removed; documents in the &lt;strong&gt;PUBLISHED&lt;/strong&gt; state cannot be deleted.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;After a document is uploaded (but not yet published), its status is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. When its identifier is associated with a postorder entity through an eBay GraphQL mutation, the status changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;All documents, whether submitted or published, expire and become inaccessible after their expiration date.&lt;/p&gt;&lt;/div&gt; 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This method downloads the  file associated with the specified document ID. Access depends on the documents state:&lt;ul&gt;&lt;li&gt;SUBMITTED: Only the document owner can download it &lt;/li&gt;&lt;li&gt;PUBLISHED: The document is no longer restricted to the owner and can be downloaded by authorized parties involved in the specific postorder flow based on the &lt;strong&gt;documentUsageType&lt;/strong&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;After a document is uploaded (but not yet published), its status is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. Once its identifier is linked to a postorder entity through an eBay GraphQL mutation, the status changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;The document must be in the &lt;strong&gt;SUBMITTED&lt;/strong&gt;  or &lt;strong&gt;PUBLISHED&lt;/strong&gt; state to be downloadable. All documents (published or submitted) expire and become inaccessible after their expiration date.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method downloads the  file associated with the specified document ID. Access depends on the documents state:&lt;ul&gt;&lt;li&gt;SUBMITTED: Only the document owner can download it &lt;/li&gt;&lt;li&gt;PUBLISHED: The document is no longer restricted to the owner and can be downloaded by authorized parties involved in the specific postorder flow based on the &lt;strong&gt;documentUsageType&lt;/strong&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This method is currently restricted and requires a special &lt;strong&gt;OAuth scope&lt;/strong&gt; not available to all users.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;After a document is uploaded (but not yet published), its status is &lt;strong&gt;SUBMITTED&lt;/strong&gt;. Once its identifier is linked to a postorder entity through an eBay GraphQL mutation, the status changes to &lt;strong&gt;PUBLISHED&lt;/strong&gt;. A post-order entity is part of eBay&apos;s order management for activities after purchase (such as returns).&lt;/span&gt;&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;The document must be in the &lt;strong&gt;SUBMITTED&lt;/strong&gt;  or &lt;strong&gt;PUBLISHED&lt;/strong&gt; state to be downloadable. All documents (published or submitted) expire and become inaccessible after their expiration date.&lt;/p&gt;&lt;/div&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/pdf, application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithDocumentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithDocumentItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithDocumentItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
