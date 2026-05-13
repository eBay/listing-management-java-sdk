package com.ebay.listingmanagement.generated.stores.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to provide details about a customized eBay Store category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StoreCategoryType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unique identifier of an eBay Store&apos;s custom category. eBay auto-generates this identifier when a seller establishes a custom store category. This category ID should not be confused with an eBay category ID.
     */
    private String categoryId;
    /**
     * The seller-specified name of the custom category.
     */
    private String categoryName;
    /**
     * This array is returned to show second and third-level store categories. eBay Stores support up to three category levels.
     */
    private java.util.List<StoreCategoryType> childrenCategories;
    /**
     * The level indicates the category level of the category tree.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported. All categories belonging to the same parent should have the same level.&lt;/span&gt;
     */
    private Integer level;
    /**
     * The order in which the custom store category appears in the list of store categories when the eBay store is visited.
     */
    private Integer order;
    /**
     * Instantiates a new {@link StoreCategoryType} and sets the default values.
     */
    public StoreCategoryType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StoreCategoryType}
     */
    @jakarta.annotation.Nonnull
    public static StoreCategoryType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StoreCategoryType();
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
     * Gets the categoryId property value. Unique identifier of an eBay Store&apos;s custom category. eBay auto-generates this identifier when a seller establishes a custom store category. This category ID should not be confused with an eBay category ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the categoryName property value. The seller-specified name of the custom category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryName() {
        return this.categoryName;
    }
    /**
     * Gets the childrenCategories property value. This array is returned to show second and third-level store categories. eBay Stores support up to three category levels.
     * @return a {@link java.util.List<StoreCategoryType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StoreCategoryType> getChildrenCategories() {
        return this.childrenCategories;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryName", (n) -> { this.setCategoryName(n.getStringValue()); });
        deserializerMap.put("childrenCategories", (n) -> { this.setChildrenCategories(n.getCollectionOfObjectValues(StoreCategoryType::createFromDiscriminatorValue)); });
        deserializerMap.put("level", (n) -> { this.setLevel(n.getIntegerValue()); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the level property value. The level indicates the category level of the category tree.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported. All categories belonging to the same parent should have the same level.&lt;/span&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLevel() {
        return this.level;
    }
    /**
     * Gets the order property value. The order in which the custom store category appears in the list of store categories when the eBay store is visited.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOrder() {
        return this.order;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryName", this.getCategoryName());
        writer.writeCollectionOfObjectValues("childrenCategories", this.getChildrenCategories());
        writer.writeIntegerValue("level", this.getLevel());
        writer.writeIntegerValue("order", this.getOrder());
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
     * Sets the categoryId property value. Unique identifier of an eBay Store&apos;s custom category. eBay auto-generates this identifier when a seller establishes a custom store category. This category ID should not be confused with an eBay category ID.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the categoryName property value. The seller-specified name of the custom category.
     * @param value Value to set for the categoryName property.
     */
    public void setCategoryName(@jakarta.annotation.Nullable final String value) {
        this.categoryName = value;
    }
    /**
     * Sets the childrenCategories property value. This array is returned to show second and third-level store categories. eBay Stores support up to three category levels.
     * @param value Value to set for the childrenCategories property.
     */
    public void setChildrenCategories(@jakarta.annotation.Nullable final java.util.List<StoreCategoryType> value) {
        this.childrenCategories = value;
    }
    /**
     * Sets the level property value. The level indicates the category level of the category tree.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Three levels of store categories are supported. All categories belonging to the same parent should have the same level.&lt;/span&gt;
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final Integer value) {
        this.level = value;
    }
    /**
     * Sets the order property value. The order in which the custom store category appears in the list of store categories when the eBay store is visited.
     * @param value Value to set for the order property.
     */
    public void setOrder(@jakarta.annotation.Nullable final Integer value) {
        this.order = value;
    }
}
