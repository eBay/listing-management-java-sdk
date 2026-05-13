package com.ebay.listingmanagement.generated.stores.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base response type of the &lt;b&gt;getStoreCategories&lt;/b&gt; method. This type provides the entire category hierarchy for the store.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetStoreCategoriesResponseType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of top-level categories defined for the eBay store. A childrenCategories array is used for second and third-level categories, if defined for the store.
     */
    private java.util.List<StoreCategoryType> storeCategories;
    /**
     * Instantiates a new {@link GetStoreCategoriesResponseType} and sets the default values.
     */
    public GetStoreCategoriesResponseType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetStoreCategoriesResponseType}
     */
    @jakarta.annotation.Nonnull
    public static GetStoreCategoriesResponseType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetStoreCategoriesResponseType();
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
        deserializerMap.put("storeCategories", (n) -> { this.setStoreCategories(n.getCollectionOfObjectValues(StoreCategoryType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the storeCategories property value. An array of top-level categories defined for the eBay store. A childrenCategories array is used for second and third-level categories, if defined for the store.
     * @return a {@link java.util.List<StoreCategoryType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StoreCategoryType> getStoreCategories() {
        return this.storeCategories;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("storeCategories", this.getStoreCategories());
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
     * Sets the storeCategories property value. An array of top-level categories defined for the eBay store. A childrenCategories array is used for second and third-level categories, if defined for the store.
     * @param value Value to set for the storeCategories property.
     */
    public void setStoreCategories(@jakarta.annotation.Nullable final java.util.List<StoreCategoryType> value) {
        this.storeCategories = value;
    }
}
