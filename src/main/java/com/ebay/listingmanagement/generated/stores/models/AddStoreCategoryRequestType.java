package com.ebay.listingmanagement.generated.stores.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base request type of the &lt;b&gt;addStoreCategory&lt;/b&gt; method. It is used to provide the name and location for the new category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddStoreCategoryRequestType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The seller-specified name of the custom category.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max Length: &lt;/b&gt;35
     */
    private String categoryName;
    /**
     * This field is used to specify the parent category to which the new category belongs. To specify the new category as a top-level category, set the value of this field to -999, or just omit this field, as the default value is -999.&lt;br&gt;The &lt;a href=&quot;/api-docs/sell/stores/resources/store/methods/getStoreCategories&quot;&gt;&lt;b&gt;getStoreCategories&lt;/b&gt;&lt;/a&gt; method can be used to retrieve store category IDs.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default: ROOT&lt;/b&gt; category ID&lt;b&gt;(-999)&lt;/b&gt; if it&apos;s null.
     */
    private String destinationParentCategoryId;
    /**
     * If the store category specified as the &lt;b&gt;destinationParentCategoryId&lt;/b&gt; is a leaf category with active listings, those listings are moved to the store category identified through this &lt;b&gt;listingDestinationCategoryId&lt;/b&gt;. If this field is omitted, the new store category being added under the parent category inherits those listings.&lt;br&gt;The &lt;a href=&quot;/api-docs/sell/stores/resources/store/methods/getStoreCategories&quot;&gt;&lt;b&gt;getStoreCategories&lt;/b&gt;&lt;/a&gt; method can be used to retrieve store category IDs.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; Newly added category ID if it&apos;s null.
     */
    private String listingDestinationCategoryId;
    /**
     * Instantiates a new {@link AddStoreCategoryRequestType} and sets the default values.
     */
    public AddStoreCategoryRequestType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddStoreCategoryRequestType}
     */
    @jakarta.annotation.Nonnull
    public static AddStoreCategoryRequestType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddStoreCategoryRequestType();
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
     * Gets the categoryName property value. The seller-specified name of the custom category.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max Length: &lt;/b&gt;35
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryName() {
        return this.categoryName;
    }
    /**
     * Gets the destinationParentCategoryId property value. This field is used to specify the parent category to which the new category belongs. To specify the new category as a top-level category, set the value of this field to -999, or just omit this field, as the default value is -999.&lt;br&gt;The &lt;a href=&quot;/api-docs/sell/stores/resources/store/methods/getStoreCategories&quot;&gt;&lt;b&gt;getStoreCategories&lt;/b&gt;&lt;/a&gt; method can be used to retrieve store category IDs.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default: ROOT&lt;/b&gt; category ID&lt;b&gt;(-999)&lt;/b&gt; if it&apos;s null.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationParentCategoryId() {
        return this.destinationParentCategoryId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("categoryName", (n) -> { this.setCategoryName(n.getStringValue()); });
        deserializerMap.put("destinationParentCategoryId", (n) -> { this.setDestinationParentCategoryId(n.getStringValue()); });
        deserializerMap.put("listingDestinationCategoryId", (n) -> { this.setListingDestinationCategoryId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingDestinationCategoryId property value. If the store category specified as the &lt;b&gt;destinationParentCategoryId&lt;/b&gt; is a leaf category with active listings, those listings are moved to the store category identified through this &lt;b&gt;listingDestinationCategoryId&lt;/b&gt;. If this field is omitted, the new store category being added under the parent category inherits those listings.&lt;br&gt;The &lt;a href=&quot;/api-docs/sell/stores/resources/store/methods/getStoreCategories&quot;&gt;&lt;b&gt;getStoreCategories&lt;/b&gt;&lt;/a&gt; method can be used to retrieve store category IDs.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; Newly added category ID if it&apos;s null.
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
        writer.writeStringValue("categoryName", this.getCategoryName());
        writer.writeStringValue("destinationParentCategoryId", this.getDestinationParentCategoryId());
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
     * Sets the categoryName property value. The seller-specified name of the custom category.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max Length: &lt;/b&gt;35
     * @param value Value to set for the categoryName property.
     */
    public void setCategoryName(@jakarta.annotation.Nullable final String value) {
        this.categoryName = value;
    }
    /**
     * Sets the destinationParentCategoryId property value. This field is used to specify the parent category to which the new category belongs. To specify the new category as a top-level category, set the value of this field to -999, or just omit this field, as the default value is -999.&lt;br&gt;The &lt;a href=&quot;/api-docs/sell/stores/resources/store/methods/getStoreCategories&quot;&gt;&lt;b&gt;getStoreCategories&lt;/b&gt;&lt;/a&gt; method can be used to retrieve store category IDs.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default: ROOT&lt;/b&gt; category ID&lt;b&gt;(-999)&lt;/b&gt; if it&apos;s null.
     * @param value Value to set for the destinationParentCategoryId property.
     */
    public void setDestinationParentCategoryId(@jakarta.annotation.Nullable final String value) {
        this.destinationParentCategoryId = value;
    }
    /**
     * Sets the listingDestinationCategoryId property value. If the store category specified as the &lt;b&gt;destinationParentCategoryId&lt;/b&gt; is a leaf category with active listings, those listings are moved to the store category identified through this &lt;b&gt;listingDestinationCategoryId&lt;/b&gt;. If this field is omitted, the new store category being added under the parent category inherits those listings.&lt;br&gt;The &lt;a href=&quot;/api-docs/sell/stores/resources/store/methods/getStoreCategories&quot;&gt;&lt;b&gt;getStoreCategories&lt;/b&gt;&lt;/a&gt; method can be used to retrieve store category IDs.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; Newly added category ID if it&apos;s null.
     * @param value Value to set for the listingDestinationCategoryId property.
     */
    public void setListingDestinationCategoryId(@jakarta.annotation.Nullable final String value) {
        this.listingDestinationCategoryId = value;
    }
}
