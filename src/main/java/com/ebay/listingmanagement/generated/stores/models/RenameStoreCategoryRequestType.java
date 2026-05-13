package com.ebay.listingmanagement.generated.stores.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base request type of the &lt;b&gt;renameStoreCategory&lt;/b&gt; method. It is used to rename a customized eBay Store category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RenameStoreCategoryRequestType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The seller-specified name of the custom category. This is the new name of the category specified through path parameter.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max Length: &lt;/b&gt;35
     */
    private String categoryName;
    /**
     * Instantiates a new {@link RenameStoreCategoryRequestType} and sets the default values.
     */
    public RenameStoreCategoryRequestType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RenameStoreCategoryRequestType}
     */
    @jakarta.annotation.Nonnull
    public static RenameStoreCategoryRequestType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RenameStoreCategoryRequestType();
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
     * Gets the categoryName property value. The seller-specified name of the custom category. This is the new name of the category specified through path parameter.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max Length: &lt;/b&gt;35
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryName() {
        return this.categoryName;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("categoryName", (n) -> { this.setCategoryName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryName", this.getCategoryName());
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
     * Sets the categoryName property value. The seller-specified name of the custom category. This is the new name of the category specified through path parameter.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max Length: &lt;/b&gt;35
     * @param value Value to set for the categoryName property.
     */
    public void setCategoryName(@jakarta.annotation.Nullable final String value) {
        this.categoryName = value;
    }
}
