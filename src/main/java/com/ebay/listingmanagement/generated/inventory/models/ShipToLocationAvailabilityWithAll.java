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
 * This type is used to specify the total &apos;ship-to-home&apos; quantity of the inventory items that will be available for purchase through one or more published offers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShipToLocationAvailabilityWithAll implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to indicate the quantities of the inventory items that are reserved for the different listing formats of the SKU offers.
     */
    private FormatAllocation allocationByFormat;
    /**
     * This container is used to set the available quantity of the inventory item at one or more warehouse locations.&lt;br&gt;&lt;br&gt;This container will be returned if the available quantity is set for one or more inventory locations.
     */
    private java.util.List<AvailabilityDistribution> availabilityDistributions;
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Publish offer note: Although this field is not required before an offer can be published to create an active listing, out of stock listings will result if this field is omitted or set to &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This field is used to set the total &apos;ship-to-home&apos; quantity of the inventory item that will be available for purchase through one or more published offers. This field is not immediately required, but &apos;ship-to-home&apos; quantity must be set before an offer of the inventory item can be published.&lt;br&gt;&lt;br&gt;If an existing inventory item is being updated, and the &apos;ship-to-home&apos; quantity already exists for the inventory item record, this field should be included again, even if the value is not changing, or the available quantity data will be lost.
     */
    private Integer quantity;
    /**
     * Instantiates a new {@link ShipToLocationAvailabilityWithAll} and sets the default values.
     */
    public ShipToLocationAvailabilityWithAll() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShipToLocationAvailabilityWithAll}
     */
    @jakarta.annotation.Nonnull
    public static ShipToLocationAvailabilityWithAll createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShipToLocationAvailabilityWithAll();
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
     * Gets the allocationByFormat property value. This type is used to indicate the quantities of the inventory items that are reserved for the different listing formats of the SKU offers.
     * @return a {@link FormatAllocation}
     */
    @jakarta.annotation.Nullable
    public FormatAllocation getAllocationByFormat() {
        return this.allocationByFormat;
    }
    /**
     * Gets the availabilityDistributions property value. This container is used to set the available quantity of the inventory item at one or more warehouse locations.&lt;br&gt;&lt;br&gt;This container will be returned if the available quantity is set for one or more inventory locations.
     * @return a {@link java.util.List<AvailabilityDistribution>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AvailabilityDistribution> getAvailabilityDistributions() {
        return this.availabilityDistributions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("allocationByFormat", (n) -> { this.setAllocationByFormat(n.getObjectValue(FormatAllocation::createFromDiscriminatorValue)); });
        deserializerMap.put("availabilityDistributions", (n) -> { this.setAvailabilityDistributions(n.getCollectionOfObjectValues(AvailabilityDistribution::createFromDiscriminatorValue)); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the quantity property value. &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Publish offer note: Although this field is not required before an offer can be published to create an active listing, out of stock listings will result if this field is omitted or set to &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This field is used to set the total &apos;ship-to-home&apos; quantity of the inventory item that will be available for purchase through one or more published offers. This field is not immediately required, but &apos;ship-to-home&apos; quantity must be set before an offer of the inventory item can be published.&lt;br&gt;&lt;br&gt;If an existing inventory item is being updated, and the &apos;ship-to-home&apos; quantity already exists for the inventory item record, this field should be included again, even if the value is not changing, or the available quantity data will be lost.
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
        writer.writeObjectValue("allocationByFormat", this.getAllocationByFormat());
        writer.writeCollectionOfObjectValues("availabilityDistributions", this.getAvailabilityDistributions());
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
     * Sets the allocationByFormat property value. This type is used to indicate the quantities of the inventory items that are reserved for the different listing formats of the SKU offers.
     * @param value Value to set for the allocationByFormat property.
     */
    public void setAllocationByFormat(@jakarta.annotation.Nullable final FormatAllocation value) {
        this.allocationByFormat = value;
    }
    /**
     * Sets the availabilityDistributions property value. This container is used to set the available quantity of the inventory item at one or more warehouse locations.&lt;br&gt;&lt;br&gt;This container will be returned if the available quantity is set for one or more inventory locations.
     * @param value Value to set for the availabilityDistributions property.
     */
    public void setAvailabilityDistributions(@jakarta.annotation.Nullable final java.util.List<AvailabilityDistribution> value) {
        this.availabilityDistributions = value;
    }
    /**
     * Sets the quantity property value. &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Publish offer note: Although this field is not required before an offer can be published to create an active listing, out of stock listings will result if this field is omitted or set to &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This field is used to set the total &apos;ship-to-home&apos; quantity of the inventory item that will be available for purchase through one or more published offers. This field is not immediately required, but &apos;ship-to-home&apos; quantity must be set before an offer of the inventory item can be published.&lt;br&gt;&lt;br&gt;If an existing inventory item is being updated, and the &apos;ship-to-home&apos; quantity already exists for the inventory item record, this field should be included again, even if the value is not changing, or the available quantity data will be lost.
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.quantity = value;
    }
}
