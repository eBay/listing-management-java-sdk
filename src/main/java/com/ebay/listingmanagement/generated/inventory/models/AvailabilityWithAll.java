package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to specify the quantity of the inventory items that are available for purchase if the items will be shipped to the buyer, and the quantity of the inventory items that are available for In-Store Pickup at one or more of the merchant&apos;s physical stores.&lt;br&gt;&lt;br&gt;In-Store Pickup is only available to large merchants selling on the US, UK, Germany, and Australia sites.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AvailabilityWithAll implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container consists of an array of one or more of the merchant&apos;s physical stores where the inventory item is available for in-store pickup.&lt;br&gt;&lt;br&gt;The store ID, the quantity available, and the fulfillment time (how soon the item will be ready for pickup after the order occurs) are all returned in this container.
     */
    private java.util.List<PickupAtLocationAvailability> pickupAtLocationAvailability;
    /**
     * This type is used to specify the total &apos;ship-to-home&apos; quantity of the inventory items that will be available for purchase through one or more published offers.
     */
    private ShipToLocationAvailabilityWithAll shipToLocationAvailability;
    /**
     * Instantiates a new {@link AvailabilityWithAll} and sets the default values.
     */
    public AvailabilityWithAll() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AvailabilityWithAll}
     */
    @jakarta.annotation.Nonnull
    public static AvailabilityWithAll createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AvailabilityWithAll();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("pickupAtLocationAvailability", (n) -> { this.setPickupAtLocationAvailability(n.getCollectionOfObjectValues(PickupAtLocationAvailability::createFromDiscriminatorValue)); });
        deserializerMap.put("shipToLocationAvailability", (n) -> { this.setShipToLocationAvailability(n.getObjectValue(ShipToLocationAvailabilityWithAll::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pickupAtLocationAvailability property value. This container consists of an array of one or more of the merchant&apos;s physical stores where the inventory item is available for in-store pickup.&lt;br&gt;&lt;br&gt;The store ID, the quantity available, and the fulfillment time (how soon the item will be ready for pickup after the order occurs) are all returned in this container.
     * @return a {@link java.util.List<PickupAtLocationAvailability>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PickupAtLocationAvailability> getPickupAtLocationAvailability() {
        return this.pickupAtLocationAvailability;
    }
    /**
     * Gets the shipToLocationAvailability property value. This type is used to specify the total &apos;ship-to-home&apos; quantity of the inventory items that will be available for purchase through one or more published offers.
     * @return a {@link ShipToLocationAvailabilityWithAll}
     */
    @jakarta.annotation.Nullable
    public ShipToLocationAvailabilityWithAll getShipToLocationAvailability() {
        return this.shipToLocationAvailability;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("pickupAtLocationAvailability", this.getPickupAtLocationAvailability());
        writer.writeObjectValue("shipToLocationAvailability", this.getShipToLocationAvailability());
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
     * Sets the pickupAtLocationAvailability property value. This container consists of an array of one or more of the merchant&apos;s physical stores where the inventory item is available for in-store pickup.&lt;br&gt;&lt;br&gt;The store ID, the quantity available, and the fulfillment time (how soon the item will be ready for pickup after the order occurs) are all returned in this container.
     * @param value Value to set for the pickupAtLocationAvailability property.
     */
    public void setPickupAtLocationAvailability(@jakarta.annotation.Nullable final java.util.List<PickupAtLocationAvailability> value) {
        this.pickupAtLocationAvailability = value;
    }
    /**
     * Sets the shipToLocationAvailability property value. This type is used to specify the total &apos;ship-to-home&apos; quantity of the inventory items that will be available for purchase through one or more published offers.
     * @param value Value to set for the shipToLocationAvailability property.
     */
    public void setShipToLocationAvailability(@jakarta.annotation.Nullable final ShipToLocationAvailabilityWithAll value) {
        this.shipToLocationAvailability = value;
    }
}
