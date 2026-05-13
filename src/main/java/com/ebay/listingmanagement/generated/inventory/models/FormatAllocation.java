package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to indicate the quantities of the inventory items that are reserved for the different listing formats of the SKU offers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FormatAllocation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This integer value indicates the quantity of the inventory item that is reserved for the published auction format offers of the SKU.
     */
    private Integer auction;
    /**
     * This integer value indicates the quantity of the inventory item that is available for the fixed-price offers of the SKU.
     */
    private Integer fixedPrice;
    /**
     * Instantiates a new {@link FormatAllocation} and sets the default values.
     */
    public FormatAllocation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FormatAllocation}
     */
    @jakarta.annotation.Nonnull
    public static FormatAllocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FormatAllocation();
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
     * Gets the auction property value. This integer value indicates the quantity of the inventory item that is reserved for the published auction format offers of the SKU.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAuction() {
        return this.auction;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("auction", (n) -> { this.setAuction(n.getIntegerValue()); });
        deserializerMap.put("fixedPrice", (n) -> { this.setFixedPrice(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fixedPrice property value. This integer value indicates the quantity of the inventory item that is available for the fixed-price offers of the SKU.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFixedPrice() {
        return this.fixedPrice;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("auction", this.getAuction());
        writer.writeIntegerValue("fixedPrice", this.getFixedPrice());
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
     * Sets the auction property value. This integer value indicates the quantity of the inventory item that is reserved for the published auction format offers of the SKU.
     * @param value Value to set for the auction property.
     */
    public void setAuction(@jakarta.annotation.Nullable final Integer value) {
        this.auction = value;
    }
    /**
     * Sets the fixedPrice property value. This integer value indicates the quantity of the inventory item that is available for the fixed-price offers of the SKU.
     * @param value Value to set for the fixedPrice property.
     */
    public void setFixedPrice(@jakarta.annotation.Nullable final Integer value) {
        this.fixedPrice = value;
    }
}
