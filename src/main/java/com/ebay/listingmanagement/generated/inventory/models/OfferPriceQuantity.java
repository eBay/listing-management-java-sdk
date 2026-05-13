package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the &lt;strong&gt;offers&lt;/strong&gt; container in a &lt;strong&gt;Bulk Update Price and Quantity&lt;/strong&gt; call to update the current price and/or quantity of one or more offers associated with a specific inventory item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OfferPriceQuantity implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is used if the seller wants to modify the current quantity of the inventory item that will be available for purchase in the offer (identified by the corresponding &lt;strong&gt;offerId&lt;/strong&gt; value).&lt;br&gt;&lt;br&gt;This value represents the quantity of the item that is available in the marketplace specified within the offer, not the total quantity available. Because of this, this value should not exceed the value specified in the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkUpdatePriceQuantity#request.requests.shipToLocationAvailability.quantity&quot;&gt;&lt;b&gt;quantity&lt;/b&gt;&lt;/a&gt; field of the &lt;b&gt;shipToLocationAvailability&lt;/b&gt; container (the total available quantity of the item across all marketplaces).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; To ensure that the available quantity allocated to a specific marketplace doesn&apos;t exceed the total available stock, the quantity specified on a listing will be the minimum value between this field and the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkUpdatePriceQuantity#request.requests.shipToLocationAvailability.quantity&quot;&gt;&lt;b&gt;quantity&lt;/b&gt;&lt;/a&gt; field.&lt;/span&gt;&lt;br&gt;Either the &lt;strong&gt;availableQuantity&lt;/strong&gt; field or the &lt;strong&gt;price&lt;/strong&gt; container is required, but not necessarily both.
     */
    private Integer availableQuantity;
    /**
     * This field is the unique identifier of the offer. If an &lt;strong&gt;offers&lt;/strong&gt; container is used to update one or more offers associated to a specific inventory item, the &lt;strong&gt;offerId&lt;/strong&gt; value is required in order to identify the offer to update with a modified price and/or quantity.&lt;br&gt;&lt;br&gt;The seller can use the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank &quot;&gt;getOffers&lt;/a&gt; method (passing in the correct SKU value as a query parameter) to retrieve &lt;strong&gt;offerId&lt;/strong&gt; values for offers associated with the SKU.
     */
    private String offerId;
    /**
     * This type is used to express a dollar value and the applicable currency.
     */
    private Amount price;
    /**
     * Instantiates a new {@link OfferPriceQuantity} and sets the default values.
     */
    public OfferPriceQuantity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OfferPriceQuantity}
     */
    @jakarta.annotation.Nonnull
    public static OfferPriceQuantity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfferPriceQuantity();
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
     * Gets the availableQuantity property value. This field is used if the seller wants to modify the current quantity of the inventory item that will be available for purchase in the offer (identified by the corresponding &lt;strong&gt;offerId&lt;/strong&gt; value).&lt;br&gt;&lt;br&gt;This value represents the quantity of the item that is available in the marketplace specified within the offer, not the total quantity available. Because of this, this value should not exceed the value specified in the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkUpdatePriceQuantity#request.requests.shipToLocationAvailability.quantity&quot;&gt;&lt;b&gt;quantity&lt;/b&gt;&lt;/a&gt; field of the &lt;b&gt;shipToLocationAvailability&lt;/b&gt; container (the total available quantity of the item across all marketplaces).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; To ensure that the available quantity allocated to a specific marketplace doesn&apos;t exceed the total available stock, the quantity specified on a listing will be the minimum value between this field and the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkUpdatePriceQuantity#request.requests.shipToLocationAvailability.quantity&quot;&gt;&lt;b&gt;quantity&lt;/b&gt;&lt;/a&gt; field.&lt;/span&gt;&lt;br&gt;Either the &lt;strong&gt;availableQuantity&lt;/strong&gt; field or the &lt;strong&gt;price&lt;/strong&gt; container is required, but not necessarily both.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAvailableQuantity() {
        return this.availableQuantity;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("availableQuantity", (n) -> { this.setAvailableQuantity(n.getIntegerValue()); });
        deserializerMap.put("offerId", (n) -> { this.setOfferId(n.getStringValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the offerId property value. This field is the unique identifier of the offer. If an &lt;strong&gt;offers&lt;/strong&gt; container is used to update one or more offers associated to a specific inventory item, the &lt;strong&gt;offerId&lt;/strong&gt; value is required in order to identify the offer to update with a modified price and/or quantity.&lt;br&gt;&lt;br&gt;The seller can use the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank &quot;&gt;getOffers&lt;/a&gt; method (passing in the correct SKU value as a query parameter) to retrieve &lt;strong&gt;offerId&lt;/strong&gt; values for offers associated with the SKU.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferId() {
        return this.offerId;
    }
    /**
     * Gets the price property value. This type is used to express a dollar value and the applicable currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPrice() {
        return this.price;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("availableQuantity", this.getAvailableQuantity());
        writer.writeStringValue("offerId", this.getOfferId());
        writer.writeObjectValue("price", this.getPrice());
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
     * Sets the availableQuantity property value. This field is used if the seller wants to modify the current quantity of the inventory item that will be available for purchase in the offer (identified by the corresponding &lt;strong&gt;offerId&lt;/strong&gt; value).&lt;br&gt;&lt;br&gt;This value represents the quantity of the item that is available in the marketplace specified within the offer, not the total quantity available. Because of this, this value should not exceed the value specified in the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkUpdatePriceQuantity#request.requests.shipToLocationAvailability.quantity&quot;&gt;&lt;b&gt;quantity&lt;/b&gt;&lt;/a&gt; field of the &lt;b&gt;shipToLocationAvailability&lt;/b&gt; container (the total available quantity of the item across all marketplaces).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; To ensure that the available quantity allocated to a specific marketplace doesn&apos;t exceed the total available stock, the quantity specified on a listing will be the minimum value between this field and the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkUpdatePriceQuantity#request.requests.shipToLocationAvailability.quantity&quot;&gt;&lt;b&gt;quantity&lt;/b&gt;&lt;/a&gt; field.&lt;/span&gt;&lt;br&gt;Either the &lt;strong&gt;availableQuantity&lt;/strong&gt; field or the &lt;strong&gt;price&lt;/strong&gt; container is required, but not necessarily both.
     * @param value Value to set for the availableQuantity property.
     */
    public void setAvailableQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.availableQuantity = value;
    }
    /**
     * Sets the offerId property value. This field is the unique identifier of the offer. If an &lt;strong&gt;offers&lt;/strong&gt; container is used to update one or more offers associated to a specific inventory item, the &lt;strong&gt;offerId&lt;/strong&gt; value is required in order to identify the offer to update with a modified price and/or quantity.&lt;br&gt;&lt;br&gt;The seller can use the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank &quot;&gt;getOffers&lt;/a&gt; method (passing in the correct SKU value as a query parameter) to retrieve &lt;strong&gt;offerId&lt;/strong&gt; values for offers associated with the SKU.
     * @param value Value to set for the offerId property.
     */
    public void setOfferId(@jakarta.annotation.Nullable final String value) {
        this.offerId = value;
    }
    /**
     * Sets the price property value. This type is used to express a dollar value and the applicable currency.
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final Amount value) {
        this.price = value;
    }
}
