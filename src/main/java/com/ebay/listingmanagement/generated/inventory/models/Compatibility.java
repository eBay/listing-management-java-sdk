package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; call to associate compatible vehicles to an inventory item. This type is also the base response of the &lt;strong&gt;getProductCompatibility&lt;/strong&gt; call.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Compatibility implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container consists of an array of motor vehicles (make, model, year, trim, engine) that are compatible with the motor vehicle part or accessory specified by the sku value.
     */
    private java.util.List<CompatibleProduct> compatibleProducts;
    /**
     * The seller-defined SKU value of the inventory item that will be associated with the compatible vehicles.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable to the &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; method, as the SKU value for the inventory item is passed in as part of the call URI and not in the request payload. It is always returned with the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/product_compatibility/methods/getProductCompatibility&quot; target=&quot;_blank &quot;&gt;getProductCompatibility&lt;/a&gt; method.&lt;/span&gt;
     */
    private String sku;
    /**
     * Instantiates a new {@link Compatibility} and sets the default values.
     */
    public Compatibility() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Compatibility}
     */
    @jakarta.annotation.Nonnull
    public static Compatibility createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Compatibility();
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
     * Gets the compatibleProducts property value. This container consists of an array of motor vehicles (make, model, year, trim, engine) that are compatible with the motor vehicle part or accessory specified by the sku value.
     * @return a {@link java.util.List<CompatibleProduct>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CompatibleProduct> getCompatibleProducts() {
        return this.compatibleProducts;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("compatibleProducts", (n) -> { this.setCompatibleProducts(n.getCollectionOfObjectValues(CompatibleProduct::createFromDiscriminatorValue)); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sku property value. The seller-defined SKU value of the inventory item that will be associated with the compatible vehicles.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable to the &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; method, as the SKU value for the inventory item is passed in as part of the call URI and not in the request payload. It is always returned with the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/product_compatibility/methods/getProductCompatibility&quot; target=&quot;_blank &quot;&gt;getProductCompatibility&lt;/a&gt; method.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSku() {
        return this.sku;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("compatibleProducts", this.getCompatibleProducts());
        writer.writeStringValue("sku", this.getSku());
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
     * Sets the compatibleProducts property value. This container consists of an array of motor vehicles (make, model, year, trim, engine) that are compatible with the motor vehicle part or accessory specified by the sku value.
     * @param value Value to set for the compatibleProducts property.
     */
    public void setCompatibleProducts(@jakarta.annotation.Nullable final java.util.List<CompatibleProduct> value) {
        this.compatibleProducts = value;
    }
    /**
     * Sets the sku property value. The seller-defined SKU value of the inventory item that will be associated with the compatible vehicles.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable to the &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; method, as the SKU value for the inventory item is passed in as part of the call URI and not in the request payload. It is always returned with the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/product_compatibility/methods/getProductCompatibility&quot; target=&quot;_blank &quot;&gt;getProductCompatibility&lt;/a&gt; method.&lt;/span&gt;
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final String value) {
        this.sku = value;
    }
}
