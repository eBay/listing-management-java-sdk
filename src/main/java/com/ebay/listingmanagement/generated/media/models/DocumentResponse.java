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

package com.ebay.listingmanagement.generated.media.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides information returned about a created document ID, which may or may not have been uploaded.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DocumentResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique ID of the document.
     */
    private String documentId;
    /**
     * This type provides information about the &lt;b&gt;documentId&lt;/b&gt;.
     */
    private DocumentMetadata documentMetadata;
    /**
     * The status of the document resource.&lt;br&gt;&lt;br&gt;Once a document has been uploaded using the &lt;b&gt;uploadDocument&lt;/b&gt; method, the &lt;b&gt;documentStatus&lt;/b&gt; will be &lt;code&gt;SUBMITTED&lt;/code&gt;. The document will then either be accepted or rejected. Only documents with the status of &lt;code&gt;ACCEPTED&lt;/code&gt; are available to be added to a listing. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/media/types/api:DocumentStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String documentStatus;
    /**
     * The type of the document uploaded. For example, &lt;code&gt;USER_GUIDE_OR_MANUAL&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/media/types/api:DocumentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String documentType;
    /**
     * This array shows the language(s) used in the document.
     */
    private java.util.List<String> languages;
    /**
     * Instantiates a new {@link DocumentResponse} and sets the default values.
     */
    public DocumentResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DocumentResponse}
     */
    @jakarta.annotation.Nonnull
    public static DocumentResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the documentId property value. The unique ID of the document.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDocumentId() {
        return this.documentId;
    }
    /**
     * Gets the documentMetadata property value. This type provides information about the &lt;b&gt;documentId&lt;/b&gt;.
     * @return a {@link DocumentMetadata}
     */
    @jakarta.annotation.Nullable
    public DocumentMetadata getDocumentMetadata() {
        return this.documentMetadata;
    }
    /**
     * Gets the documentStatus property value. The status of the document resource.&lt;br&gt;&lt;br&gt;Once a document has been uploaded using the &lt;b&gt;uploadDocument&lt;/b&gt; method, the &lt;b&gt;documentStatus&lt;/b&gt; will be &lt;code&gt;SUBMITTED&lt;/code&gt;. The document will then either be accepted or rejected. Only documents with the status of &lt;code&gt;ACCEPTED&lt;/code&gt; are available to be added to a listing. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/media/types/api:DocumentStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDocumentStatus() {
        return this.documentStatus;
    }
    /**
     * Gets the documentType property value. The type of the document uploaded. For example, &lt;code&gt;USER_GUIDE_OR_MANUAL&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/media/types/api:DocumentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDocumentType() {
        return this.documentType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("documentId", (n) -> { this.setDocumentId(n.getStringValue()); });
        deserializerMap.put("documentMetadata", (n) -> { this.setDocumentMetadata(n.getObjectValue(DocumentMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("documentStatus", (n) -> { this.setDocumentStatus(n.getStringValue()); });
        deserializerMap.put("documentType", (n) -> { this.setDocumentType(n.getStringValue()); });
        deserializerMap.put("languages", (n) -> { this.setLanguages(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the languages property value. This array shows the language(s) used in the document.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLanguages() {
        return this.languages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("documentId", this.getDocumentId());
        writer.writeObjectValue("documentMetadata", this.getDocumentMetadata());
        writer.writeStringValue("documentStatus", this.getDocumentStatus());
        writer.writeStringValue("documentType", this.getDocumentType());
        writer.writeCollectionOfPrimitiveValues("languages", this.getLanguages());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the documentId property value. The unique ID of the document.
     * @param value Value to set for the documentId property.
     */
    public void setDocumentId(@jakarta.annotation.Nullable final String value) {
        this.documentId = value;
    }
    /**
     * Sets the documentMetadata property value. This type provides information about the &lt;b&gt;documentId&lt;/b&gt;.
     * @param value Value to set for the documentMetadata property.
     */
    public void setDocumentMetadata(@jakarta.annotation.Nullable final DocumentMetadata value) {
        this.documentMetadata = value;
    }
    /**
     * Sets the documentStatus property value. The status of the document resource.&lt;br&gt;&lt;br&gt;Once a document has been uploaded using the &lt;b&gt;uploadDocument&lt;/b&gt; method, the &lt;b&gt;documentStatus&lt;/b&gt; will be &lt;code&gt;SUBMITTED&lt;/code&gt;. The document will then either be accepted or rejected. Only documents with the status of &lt;code&gt;ACCEPTED&lt;/code&gt; are available to be added to a listing. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/media/types/api:DocumentStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the documentStatus property.
     */
    public void setDocumentStatus(@jakarta.annotation.Nullable final String value) {
        this.documentStatus = value;
    }
    /**
     * Sets the documentType property value. The type of the document uploaded. For example, &lt;code&gt;USER_GUIDE_OR_MANUAL&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/media/types/api:DocumentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the documentType property.
     */
    public void setDocumentType(@jakarta.annotation.Nullable final String value) {
        this.documentType = value;
    }
    /**
     * Sets the languages property value. This array shows the language(s) used in the document.
     * @param value Value to set for the languages property.
     */
    public void setLanguages(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.languages = value;
    }
}
