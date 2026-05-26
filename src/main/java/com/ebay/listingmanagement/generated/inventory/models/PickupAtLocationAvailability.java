// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to specify/indicate the quantity of the inventory item that is available for an In-Store Pickup order at the merchant&apos;s physical store (specified by the &lt;strong&gt;merchantLocationKey&lt;/strong&gt; field).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PickupAtLocationAvailability implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The enumeration value in this field indicates the availability status of the inventory item at the merchant&apos;s physical store specified by the &lt;strong&gt;pickupAtLocationAvailability.merchantLocationKey&lt;/strong&gt; field. This field is required if the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container is used, and is always returned with the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container.  &lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/inventory/types/slr:AvailabilityTypeEnum&quot; target=&quot;_blank&quot;&gt;AvailabilityTypeEnum&lt;/a&gt; for more information about how/when you use each enumeration value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:AvailabilityTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String availabilityType;
    /**
     * This type is used to indicate the fulfillment time for an In-Store Pickup order, or for an order than will be shipped to the buyer.
     */
    private TimeDuration fulfillmentTime;
    /**
     * The unique identifier of a merchant&apos;s store where the In-Store Pickup inventory item is currently located, or where inventory will be sent to. If the merchant&apos;s store is currently awaiting for inventory, the &lt;strong&gt;availabilityType&lt;/strong&gt; value should be &lt;code&gt;SHIP_TO_STORE&lt;/code&gt;. This field is required if the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container is used, and is always returned with the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to retrieve merchant location keys.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36
     */
    private String merchantLocationKey;
    /**
     * This integer value indicates the quantity of the inventory item that is available for In-Store Pickup at the store identified by the  &lt;strong&gt;merchantLocationKey&lt;/strong&gt; value.  The value of &lt;strong&gt;quantity&lt;/strong&gt; should be an integer value greater than &lt;code&gt;0&lt;/code&gt;, unless the inventory item is out of stock. This field is required if the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container is used, and is always returned with the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container.
     */
    private Integer quantity;
    /**
     * Instantiates a new {@link PickupAtLocationAvailability} and sets the default values.
     */
    public PickupAtLocationAvailability() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PickupAtLocationAvailability}
     */
    @jakarta.annotation.Nonnull
    public static PickupAtLocationAvailability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PickupAtLocationAvailability();
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
     * Gets the availabilityType property value. The enumeration value in this field indicates the availability status of the inventory item at the merchant&apos;s physical store specified by the &lt;strong&gt;pickupAtLocationAvailability.merchantLocationKey&lt;/strong&gt; field. This field is required if the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container is used, and is always returned with the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container.  &lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/inventory/types/slr:AvailabilityTypeEnum&quot; target=&quot;_blank&quot;&gt;AvailabilityTypeEnum&lt;/a&gt; for more information about how/when you use each enumeration value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:AvailabilityTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAvailabilityType() {
        return this.availabilityType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("availabilityType", (n) -> { this.setAvailabilityType(n.getStringValue()); });
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
     * Gets the merchantLocationKey property value. The unique identifier of a merchant&apos;s store where the In-Store Pickup inventory item is currently located, or where inventory will be sent to. If the merchant&apos;s store is currently awaiting for inventory, the &lt;strong&gt;availabilityType&lt;/strong&gt; value should be &lt;code&gt;SHIP_TO_STORE&lt;/code&gt;. This field is required if the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container is used, and is always returned with the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to retrieve merchant location keys.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMerchantLocationKey() {
        return this.merchantLocationKey;
    }
    /**
     * Gets the quantity property value. This integer value indicates the quantity of the inventory item that is available for In-Store Pickup at the store identified by the  &lt;strong&gt;merchantLocationKey&lt;/strong&gt; value.  The value of &lt;strong&gt;quantity&lt;/strong&gt; should be an integer value greater than &lt;code&gt;0&lt;/code&gt;, unless the inventory item is out of stock. This field is required if the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container is used, and is always returned with the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container.
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
        writer.writeStringValue("availabilityType", this.getAvailabilityType());
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
     * Sets the availabilityType property value. The enumeration value in this field indicates the availability status of the inventory item at the merchant&apos;s physical store specified by the &lt;strong&gt;pickupAtLocationAvailability.merchantLocationKey&lt;/strong&gt; field. This field is required if the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container is used, and is always returned with the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container.  &lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/inventory/types/slr:AvailabilityTypeEnum&quot; target=&quot;_blank&quot;&gt;AvailabilityTypeEnum&lt;/a&gt; for more information about how/when you use each enumeration value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:AvailabilityTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the availabilityType property.
     */
    public void setAvailabilityType(@jakarta.annotation.Nullable final String value) {
        this.availabilityType = value;
    }
    /**
     * Sets the fulfillmentTime property value. This type is used to indicate the fulfillment time for an In-Store Pickup order, or for an order than will be shipped to the buyer.
     * @param value Value to set for the fulfillmentTime property.
     */
    public void setFulfillmentTime(@jakarta.annotation.Nullable final TimeDuration value) {
        this.fulfillmentTime = value;
    }
    /**
     * Sets the merchantLocationKey property value. The unique identifier of a merchant&apos;s store where the In-Store Pickup inventory item is currently located, or where inventory will be sent to. If the merchant&apos;s store is currently awaiting for inventory, the &lt;strong&gt;availabilityType&lt;/strong&gt; value should be &lt;code&gt;SHIP_TO_STORE&lt;/code&gt;. This field is required if the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container is used, and is always returned with the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to retrieve merchant location keys.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36
     * @param value Value to set for the merchantLocationKey property.
     */
    public void setMerchantLocationKey(@jakarta.annotation.Nullable final String value) {
        this.merchantLocationKey = value;
    }
    /**
     * Sets the quantity property value. This integer value indicates the quantity of the inventory item that is available for In-Store Pickup at the store identified by the  &lt;strong&gt;merchantLocationKey&lt;/strong&gt; value.  The value of &lt;strong&gt;quantity&lt;/strong&gt; should be an integer value greater than &lt;code&gt;0&lt;/code&gt;, unless the inventory item is out of stock. This field is required if the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container is used, and is always returned with the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container.
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.quantity = value;
    }
}
