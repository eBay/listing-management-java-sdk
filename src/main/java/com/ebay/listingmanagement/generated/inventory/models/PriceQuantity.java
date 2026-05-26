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
 * This type is used to update the total &quot;ship-to-home&quot;  quantity for one or more inventory items and/or to update the price and/or quantity of one or more specific offers associated with one or more inventory items.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PriceQuantity implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is needed if the seller is updating the price and/or quantity of one or more published offers, and a successful call will actually update the active eBay listing with the revised price and/or available quantity.&lt;br&gt;&lt;br&gt;This call is not designed to work with unpublished offers. For unpublished offers, the seller should use the &lt;strong&gt;updateOffer&lt;/strong&gt; call to update the available quantity and/or price.&lt;br&gt;&lt;br&gt;If the seller is also using the &lt;strong&gt;shipToLocationAvailability&lt;/strong&gt; container and &lt;strong&gt;sku&lt;/strong&gt; field to update the total &apos;ship-to-home&apos; quantity of the inventory item, the SKU value associated with the corresponding &lt;strong&gt;offerId&lt;/strong&gt; value(s) must be the same as the corresponding &lt;strong&gt;sku&lt;/strong&gt; value that is passed in, or an error will occur.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; A separate (&lt;strong&gt;OfferPriceQuantity&lt;/strong&gt;) node is required for each offer being updated.&lt;/p&gt;&lt;/div&gt;
     */
    private java.util.List<OfferPriceQuantity> offers;
    /**
     * This type is used to specify the total &apos;ship-to-home&apos; quantity of the inventory item that will be available for purchase through one or more published offers.
     */
    private ShipToLocationAvailability shipToLocationAvailability;
    /**
     * This is the seller-defined SKU value of the inventory item whose total &apos;ship-to-home&apos; quantity will be updated. This field is only required when the seller is updating the total quantity of an inventory item using the &lt;strong&gt;shipToLocationAvailability&lt;/strong&gt; container. If the seller is updating the price and/or quantity of one or more specific offers, one or more &lt;strong&gt;offerId&lt;/strong&gt; values are used instead, and the &lt;strong&gt;sku&lt;/strong&gt; value is not needed.&lt;br&gt;&lt;br&gt;If the seller wants to update the price and/or quantity of one or more offers, and also wants to update the total &apos;ship-to-home&apos; quantity of the corresponding inventory item, the SKU value associated with the &lt;strong&gt;offerId&lt;/strong&gt; value(s) must be the same as the corresponding &lt;strong&gt;sku&lt;/strong&gt; value that is passed in, or an error will occur.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/getInventoryItems&quot; target=&quot;_blank &quot;&gt;getInventoryItems&lt;/a&gt; method to retrieve SKU values.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br&gt;
     */
    private String sku;
    /**
     * Instantiates a new {@link PriceQuantity} and sets the default values.
     */
    public PriceQuantity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PriceQuantity}
     */
    @jakarta.annotation.Nonnull
    public static PriceQuantity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PriceQuantity();
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
        deserializerMap.put("offers", (n) -> { this.setOffers(n.getCollectionOfObjectValues(OfferPriceQuantity::createFromDiscriminatorValue)); });
        deserializerMap.put("shipToLocationAvailability", (n) -> { this.setShipToLocationAvailability(n.getObjectValue(ShipToLocationAvailability::createFromDiscriminatorValue)); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the offers property value. This container is needed if the seller is updating the price and/or quantity of one or more published offers, and a successful call will actually update the active eBay listing with the revised price and/or available quantity.&lt;br&gt;&lt;br&gt;This call is not designed to work with unpublished offers. For unpublished offers, the seller should use the &lt;strong&gt;updateOffer&lt;/strong&gt; call to update the available quantity and/or price.&lt;br&gt;&lt;br&gt;If the seller is also using the &lt;strong&gt;shipToLocationAvailability&lt;/strong&gt; container and &lt;strong&gt;sku&lt;/strong&gt; field to update the total &apos;ship-to-home&apos; quantity of the inventory item, the SKU value associated with the corresponding &lt;strong&gt;offerId&lt;/strong&gt; value(s) must be the same as the corresponding &lt;strong&gt;sku&lt;/strong&gt; value that is passed in, or an error will occur.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; A separate (&lt;strong&gt;OfferPriceQuantity&lt;/strong&gt;) node is required for each offer being updated.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link java.util.List<OfferPriceQuantity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OfferPriceQuantity> getOffers() {
        return this.offers;
    }
    /**
     * Gets the shipToLocationAvailability property value. This type is used to specify the total &apos;ship-to-home&apos; quantity of the inventory item that will be available for purchase through one or more published offers.
     * @return a {@link ShipToLocationAvailability}
     */
    @jakarta.annotation.Nullable
    public ShipToLocationAvailability getShipToLocationAvailability() {
        return this.shipToLocationAvailability;
    }
    /**
     * Gets the sku property value. This is the seller-defined SKU value of the inventory item whose total &apos;ship-to-home&apos; quantity will be updated. This field is only required when the seller is updating the total quantity of an inventory item using the &lt;strong&gt;shipToLocationAvailability&lt;/strong&gt; container. If the seller is updating the price and/or quantity of one or more specific offers, one or more &lt;strong&gt;offerId&lt;/strong&gt; values are used instead, and the &lt;strong&gt;sku&lt;/strong&gt; value is not needed.&lt;br&gt;&lt;br&gt;If the seller wants to update the price and/or quantity of one or more offers, and also wants to update the total &apos;ship-to-home&apos; quantity of the corresponding inventory item, the SKU value associated with the &lt;strong&gt;offerId&lt;/strong&gt; value(s) must be the same as the corresponding &lt;strong&gt;sku&lt;/strong&gt; value that is passed in, or an error will occur.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/getInventoryItems&quot; target=&quot;_blank &quot;&gt;getInventoryItems&lt;/a&gt; method to retrieve SKU values.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br&gt;
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
        writer.writeCollectionOfObjectValues("offers", this.getOffers());
        writer.writeObjectValue("shipToLocationAvailability", this.getShipToLocationAvailability());
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
     * Sets the offers property value. This container is needed if the seller is updating the price and/or quantity of one or more published offers, and a successful call will actually update the active eBay listing with the revised price and/or available quantity.&lt;br&gt;&lt;br&gt;This call is not designed to work with unpublished offers. For unpublished offers, the seller should use the &lt;strong&gt;updateOffer&lt;/strong&gt; call to update the available quantity and/or price.&lt;br&gt;&lt;br&gt;If the seller is also using the &lt;strong&gt;shipToLocationAvailability&lt;/strong&gt; container and &lt;strong&gt;sku&lt;/strong&gt; field to update the total &apos;ship-to-home&apos; quantity of the inventory item, the SKU value associated with the corresponding &lt;strong&gt;offerId&lt;/strong&gt; value(s) must be the same as the corresponding &lt;strong&gt;sku&lt;/strong&gt; value that is passed in, or an error will occur.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; A separate (&lt;strong&gt;OfferPriceQuantity&lt;/strong&gt;) node is required for each offer being updated.&lt;/p&gt;&lt;/div&gt;
     * @param value Value to set for the offers property.
     */
    public void setOffers(@jakarta.annotation.Nullable final java.util.List<OfferPriceQuantity> value) {
        this.offers = value;
    }
    /**
     * Sets the shipToLocationAvailability property value. This type is used to specify the total &apos;ship-to-home&apos; quantity of the inventory item that will be available for purchase through one or more published offers.
     * @param value Value to set for the shipToLocationAvailability property.
     */
    public void setShipToLocationAvailability(@jakarta.annotation.Nullable final ShipToLocationAvailability value) {
        this.shipToLocationAvailability = value;
    }
    /**
     * Sets the sku property value. This is the seller-defined SKU value of the inventory item whose total &apos;ship-to-home&apos; quantity will be updated. This field is only required when the seller is updating the total quantity of an inventory item using the &lt;strong&gt;shipToLocationAvailability&lt;/strong&gt; container. If the seller is updating the price and/or quantity of one or more specific offers, one or more &lt;strong&gt;offerId&lt;/strong&gt; values are used instead, and the &lt;strong&gt;sku&lt;/strong&gt; value is not needed.&lt;br&gt;&lt;br&gt;If the seller wants to update the price and/or quantity of one or more offers, and also wants to update the total &apos;ship-to-home&apos; quantity of the corresponding inventory item, the SKU value associated with the &lt;strong&gt;offerId&lt;/strong&gt; value(s) must be the same as the corresponding &lt;strong&gt;sku&lt;/strong&gt; value that is passed in, or an error will occur.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/inventory_item/methods/getInventoryItems&quot; target=&quot;_blank &quot;&gt;getInventoryItems&lt;/a&gt; method to retrieve SKU values.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br&gt;
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final String value) {
        this.sku = value;
    }
}
