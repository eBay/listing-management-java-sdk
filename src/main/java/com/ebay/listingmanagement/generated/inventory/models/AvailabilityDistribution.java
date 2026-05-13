package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to set the available quantity of the inventory item at one or more warehouse locations.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AvailabilityDistribution implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to indicate the fulfillment time for an In-Store Pickup order, or for an order than will be shipped to the buyer.
     */
    private TimeDuration fulfillmentTime;
    /**
     * The unique identifier of an inventory location where quantity is available for the inventory item. This field is conditionally required to identify the inventory location that has quantity of the inventory item.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to retrieve merchant location keys.
     */
    private String merchantLocationKey;
    /**
     * The integer value passed into this field indicates the quantity of the inventory item that is available at this inventory location. This field is conditionally required.
     */
    private Integer quantity;
    /**
     * Instantiates a new {@link AvailabilityDistribution} and sets the default values.
     */
    public AvailabilityDistribution() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AvailabilityDistribution}
     */
    @jakarta.annotation.Nonnull
    public static AvailabilityDistribution createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AvailabilityDistribution();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("fulfillmentTime", (n) -> { this.setFulfillmentTime(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("merchantLocationKey", (n) -> { this.setMerchantLocationKey(n.getStringValue()); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fulfillmentTime property value. This type is used to indicate the fulfillment time for an In-Store Pickup order, or for an order than will be shipped to the buyer.
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getFulfillmentTime() {
        return this.fulfillmentTime;
    }
    /**
     * Gets the merchantLocationKey property value. The unique identifier of an inventory location where quantity is available for the inventory item. This field is conditionally required to identify the inventory location that has quantity of the inventory item.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to retrieve merchant location keys.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMerchantLocationKey() {
        return this.merchantLocationKey;
    }
    /**
     * Gets the quantity property value. The integer value passed into this field indicates the quantity of the inventory item that is available at this inventory location. This field is conditionally required.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getQuantity() {
        return this.quantity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("fulfillmentTime", this.getFulfillmentTime());
        writer.writeStringValue("merchantLocationKey", this.getMerchantLocationKey());
        writer.writeIntegerValue("quantity", this.getQuantity());
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
     * Sets the fulfillmentTime property value. This type is used to indicate the fulfillment time for an In-Store Pickup order, or for an order than will be shipped to the buyer.
     * @param value Value to set for the fulfillmentTime property.
     */
    public void setFulfillmentTime(@jakarta.annotation.Nullable final TimeDuration value) {
        this.fulfillmentTime = value;
    }
    /**
     * Sets the merchantLocationKey property value. The unique identifier of an inventory location where quantity is available for the inventory item. This field is conditionally required to identify the inventory location that has quantity of the inventory item.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to retrieve merchant location keys.
     * @param value Value to set for the merchantLocationKey property.
     */
    public void setMerchantLocationKey(@jakarta.annotation.Nullable final String value) {
        this.merchantLocationKey = value;
    }
    /**
     * Sets the quantity property value. The integer value passed into this field indicates the quantity of the inventory item that is available at this inventory location. This field is conditionally required.
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.quantity = value;
    }
}
