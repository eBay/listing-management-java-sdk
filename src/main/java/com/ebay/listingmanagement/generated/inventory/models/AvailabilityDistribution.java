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
 * This type is used to set the available quantity of the inventory item at one or more warehouse locations.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AvailabilityDistribution implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is used to indicate the expected fulfillment time if the inventory item is shipped from the warehouse location identified in the corresponding &lt;strong&gt;merchantLocationKey&lt;/strong&gt; field. The fulfillment time is the estimated number of business days after purchase that the buyer can expect the item to be delivered.&lt;br&gt;&lt;br&gt;This field is optional, and is used by eBay to provide the estimated delivery date to buyers. This field is returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitem&quot;&gt;getInventoryItem&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitems&quot;&gt;getInventoryItems&lt;/a&gt; if set for the inventory item.
     */
    private TimeDuration fulfillmentTime;
    /**
     * The unique identifier of an inventory location where quantity is available for the inventory item. This field is conditionally required to identify the inventory location that has quantity of the inventory item.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-location-getinventorylocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to retrieve merchant location keys.
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
     * Gets the fulfillmentTime property value. This container is used to indicate the expected fulfillment time if the inventory item is shipped from the warehouse location identified in the corresponding &lt;strong&gt;merchantLocationKey&lt;/strong&gt; field. The fulfillment time is the estimated number of business days after purchase that the buyer can expect the item to be delivered.&lt;br&gt;&lt;br&gt;This field is optional, and is used by eBay to provide the estimated delivery date to buyers. This field is returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitem&quot;&gt;getInventoryItem&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitems&quot;&gt;getInventoryItems&lt;/a&gt; if set for the inventory item.
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getFulfillmentTime() {
        return this.fulfillmentTime;
    }
    /**
     * Gets the merchantLocationKey property value. The unique identifier of an inventory location where quantity is available for the inventory item. This field is conditionally required to identify the inventory location that has quantity of the inventory item.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-location-getinventorylocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to retrieve merchant location keys.
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
     * Sets the fulfillmentTime property value. This container is used to indicate the expected fulfillment time if the inventory item is shipped from the warehouse location identified in the corresponding &lt;strong&gt;merchantLocationKey&lt;/strong&gt; field. The fulfillment time is the estimated number of business days after purchase that the buyer can expect the item to be delivered.&lt;br&gt;&lt;br&gt;This field is optional, and is used by eBay to provide the estimated delivery date to buyers. This field is returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitem&quot;&gt;getInventoryItem&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitems&quot;&gt;getInventoryItems&lt;/a&gt; if set for the inventory item.
     * @param value Value to set for the fulfillmentTime property.
     */
    public void setFulfillmentTime(@jakarta.annotation.Nullable final TimeDuration value) {
        this.fulfillmentTime = value;
    }
    /**
     * Sets the merchantLocationKey property value. The unique identifier of an inventory location where quantity is available for the inventory item. This field is conditionally required to identify the inventory location that has quantity of the inventory item.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-location-getinventorylocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to retrieve merchant location keys.
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
