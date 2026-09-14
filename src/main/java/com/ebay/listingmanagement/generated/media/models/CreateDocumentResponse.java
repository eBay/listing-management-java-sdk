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
 * This type provides information about the created document ID.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateDocumentResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the document to be uploaded.&lt;br&gt;&lt;br&gt;This value is returned in the response and &lt;strong&gt;location&lt;/strong&gt; header of the &lt;strong&gt;createDocument&lt;/strong&gt; and &lt;strong&gt;createDocumentFromUrl&lt;/strong&gt; methods. This ID can be used with the &lt;strong&gt;getDocument&lt;/strong&gt; and &lt;strong&gt;uploadDocument&lt;/strong&gt; methods, and to add an uploaded document to a listing. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html#add-documents&quot; target=&quot;_blank&quot;&gt;Adding documents to listings&lt;/a&gt; for more information. 
     */
    private String documentId;
    /**
     * The status of the document resource.&lt;br&gt;&lt;br&gt;For example, the value &lt;code&gt;PENDING_UPLOAD&lt;/code&gt; is the initial state when the reference to the document has been created using the &lt;strong&gt;createDocument&lt;/strong&gt; method. When creating a document using the &lt;strong&gt;createDocumentFromUrl&lt;/strong&gt; method, the initial state will be &lt;code&gt;SUBMITTED&lt;/code&gt;.
     */
    private DocumentStatusEnum documentStatus;
    /**
     * The type of the document uploaded. For example, &lt;code&gt;USER_GUIDE_OR_MANUAL&lt;/code&gt;.
     */
    private DocumentTypeEnum documentType;
    /**
     * This array shows the language(s) used in the document.
     */
    private java.util.List<LanguageEnum> languages;
    /**
     * Instantiates a new {@link CreateDocumentResponse} and sets the default values.
     */
    public CreateDocumentResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateDocumentResponse}
     */
    @jakarta.annotation.Nonnull
    public static CreateDocumentResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateDocumentResponse();
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
     * Gets the documentId property value. The unique identifier of the document to be uploaded.&lt;br&gt;&lt;br&gt;This value is returned in the response and &lt;strong&gt;location&lt;/strong&gt; header of the &lt;strong&gt;createDocument&lt;/strong&gt; and &lt;strong&gt;createDocumentFromUrl&lt;/strong&gt; methods. This ID can be used with the &lt;strong&gt;getDocument&lt;/strong&gt; and &lt;strong&gt;uploadDocument&lt;/strong&gt; methods, and to add an uploaded document to a listing. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html#add-documents&quot; target=&quot;_blank&quot;&gt;Adding documents to listings&lt;/a&gt; for more information. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDocumentId() {
        return this.documentId;
    }
    /**
     * Gets the documentStatus property value. The status of the document resource.&lt;br&gt;&lt;br&gt;For example, the value &lt;code&gt;PENDING_UPLOAD&lt;/code&gt; is the initial state when the reference to the document has been created using the &lt;strong&gt;createDocument&lt;/strong&gt; method. When creating a document using the &lt;strong&gt;createDocumentFromUrl&lt;/strong&gt; method, the initial state will be &lt;code&gt;SUBMITTED&lt;/code&gt;.
     * @return a {@link DocumentStatusEnum}
     */
    @jakarta.annotation.Nullable
    public DocumentStatusEnum getDocumentStatus() {
        return this.documentStatus;
    }
    /**
     * Gets the documentType property value. The type of the document uploaded. For example, &lt;code&gt;USER_GUIDE_OR_MANUAL&lt;/code&gt;.
     * @return a {@link DocumentTypeEnum}
     */
    @jakarta.annotation.Nullable
    public DocumentTypeEnum getDocumentType() {
        return this.documentType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("documentId", (n) -> { this.setDocumentId(n.getStringValue()); });
        deserializerMap.put("documentStatus", (n) -> { this.setDocumentStatus(n.getEnumValue(DocumentStatusEnum::forValue)); });
        deserializerMap.put("documentType", (n) -> { this.setDocumentType(n.getEnumValue(DocumentTypeEnum::forValue)); });
        deserializerMap.put("languages", (n) -> { this.setLanguages(n.getCollectionOfEnumValues(LanguageEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the languages property value. This array shows the language(s) used in the document.
     * @return a {@link java.util.List<LanguageEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LanguageEnum> getLanguages() {
        return this.languages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("documentId", this.getDocumentId());
        writer.writeEnumValue("documentStatus", this.getDocumentStatus());
        writer.writeEnumValue("documentType", this.getDocumentType());
        writer.writeCollectionOfEnumValues("languages", this.getLanguages());
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
     * Sets the documentId property value. The unique identifier of the document to be uploaded.&lt;br&gt;&lt;br&gt;This value is returned in the response and &lt;strong&gt;location&lt;/strong&gt; header of the &lt;strong&gt;createDocument&lt;/strong&gt; and &lt;strong&gt;createDocumentFromUrl&lt;/strong&gt; methods. This ID can be used with the &lt;strong&gt;getDocument&lt;/strong&gt; and &lt;strong&gt;uploadDocument&lt;/strong&gt; methods, and to add an uploaded document to a listing. See &lt;a href=&quot;/api-docs/sell/static/inventory/managing-document-media.html#add-documents&quot; target=&quot;_blank&quot;&gt;Adding documents to listings&lt;/a&gt; for more information. 
     * @param value Value to set for the documentId property.
     */
    public void setDocumentId(@jakarta.annotation.Nullable final String value) {
        this.documentId = value;
    }
    /**
     * Sets the documentStatus property value. The status of the document resource.&lt;br&gt;&lt;br&gt;For example, the value &lt;code&gt;PENDING_UPLOAD&lt;/code&gt; is the initial state when the reference to the document has been created using the &lt;strong&gt;createDocument&lt;/strong&gt; method. When creating a document using the &lt;strong&gt;createDocumentFromUrl&lt;/strong&gt; method, the initial state will be &lt;code&gt;SUBMITTED&lt;/code&gt;.
     * @param value Value to set for the documentStatus property.
     */
    public void setDocumentStatus(@jakarta.annotation.Nullable final DocumentStatusEnum value) {
        this.documentStatus = value;
    }
    /**
     * Sets the documentType property value. The type of the document uploaded. For example, &lt;code&gt;USER_GUIDE_OR_MANUAL&lt;/code&gt;.
     * @param value Value to set for the documentType property.
     */
    public void setDocumentType(@jakarta.annotation.Nullable final DocumentTypeEnum value) {
        this.documentType = value;
    }
    /**
     * Sets the languages property value. This array shows the language(s) used in the document.
     * @param value Value to set for the languages property.
     */
    public void setLanguages(@jakarta.annotation.Nullable final java.util.List<LanguageEnum> value) {
        this.languages = value;
    }
}
