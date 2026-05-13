package com.ebay.listingmanagement.generated.stores.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base request type of the &lt;b&gt;deleteStoreCategory&lt;/b&gt; method. It is used to provide a new category home for the listings that are currently in the store category to be deleted.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeleteStoreCategoryRequestType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is only needed if the category to be deleted or any of its children categories have one or more active listings. The operation will fail otherwise. All active listings in or under the category to be deleted will be moved to the store category specified in this field.&lt;br&gt;The &lt;a href=&quot;/api-docs/sell/stores/resources/store/methods/getStoreCategories&quot;&gt;&lt;b&gt;getStoreCategories&lt;/b&gt;&lt;/a&gt; method can be used to retrieve store category IDs.&lt;br&gt;&lt;br&gt; &lt;b&gt;Default: OTHER&lt;/b&gt; category ID &lt;b&gt;(1)&lt;/b&gt; if it&apos;s null.
     */
    private String listingDestinationCategoryId;
    /**
     * Instantiates a new {@link DeleteStoreCategoryRequestType} and sets the default values.
     */
    public DeleteStoreCategoryRequestType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeleteStoreCategoryRequestType}
     */
    @jakarta.annotation.Nonnull
    public static DeleteStoreCategoryRequestType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeleteStoreCategoryRequestType();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("listingDestinationCategoryId", (n) -> { this.setListingDestinationCategoryId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingDestinationCategoryId property value. This field is only needed if the category to be deleted or any of its children categories have one or more active listings. The operation will fail otherwise. All active listings in or under the category to be deleted will be moved to the store category specified in this field.&lt;br&gt;The &lt;a href=&quot;/api-docs/sell/stores/resources/store/methods/getStoreCategories&quot;&gt;&lt;b&gt;getStoreCategories&lt;/b&gt;&lt;/a&gt; method can be used to retrieve store category IDs.&lt;br&gt;&lt;br&gt; &lt;b&gt;Default: OTHER&lt;/b&gt; category ID &lt;b&gt;(1)&lt;/b&gt; if it&apos;s null.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingDestinationCategoryId() {
        return this.listingDestinationCategoryId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("listingDestinationCategoryId", this.getListingDestinationCategoryId());
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
     * Sets the listingDestinationCategoryId property value. This field is only needed if the category to be deleted or any of its children categories have one or more active listings. The operation will fail otherwise. All active listings in or under the category to be deleted will be moved to the store category specified in this field.&lt;br&gt;The &lt;a href=&quot;/api-docs/sell/stores/resources/store/methods/getStoreCategories&quot;&gt;&lt;b&gt;getStoreCategories&lt;/b&gt;&lt;/a&gt; method can be used to retrieve store category IDs.&lt;br&gt;&lt;br&gt; &lt;b&gt;Default: OTHER&lt;/b&gt; category ID &lt;b&gt;(1)&lt;/b&gt; if it&apos;s null.
     * @param value Value to set for the listingDestinationCategoryId property.
     */
    public void setListingDestinationCategoryId(@jakarta.annotation.Nullable final String value) {
        this.listingDestinationCategoryId = value;
    }
}
