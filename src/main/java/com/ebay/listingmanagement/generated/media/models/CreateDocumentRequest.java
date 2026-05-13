package com.ebay.listingmanagement.generated.media.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains the metadata used to create the document ID.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateDocumentRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type of the document being uploaded. For example, a &lt;code&gt;USER_GUIDE_OR_MANUAL&lt;/code&gt; or a &lt;code&gt;SAFETY_DATA_SHEET&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/media/types/api:DocumentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String documentType;
    /**
     * This array shows the language(s) used in the document.
     */
    private java.util.List<String> languages;
    /**
     * Instantiates a new {@link CreateDocumentRequest} and sets the default values.
     */
    public CreateDocumentRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateDocumentRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateDocumentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateDocumentRequest();
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
     * Gets the documentType property value. The type of the document being uploaded. For example, a &lt;code&gt;USER_GUIDE_OR_MANUAL&lt;/code&gt; or a &lt;code&gt;SAFETY_DATA_SHEET&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/media/types/api:DocumentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
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
     * Sets the documentType property value. The type of the document being uploaded. For example, a &lt;code&gt;USER_GUIDE_OR_MANUAL&lt;/code&gt; or a &lt;code&gt;SAFETY_DATA_SHEET&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/media/types/api:DocumentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
