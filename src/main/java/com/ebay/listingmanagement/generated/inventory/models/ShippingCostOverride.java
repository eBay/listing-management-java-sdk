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
 * This type is used if the seller wants to override the shipping costs or surcharge associated with a specific domestic or international shipping service option defined in the fulfillment listing policy that is being applied toward the offer. The shipping-related costs that can be overridden include the shipping cost to ship one item, the shipping cost to ship each additional item (if multiple quantity are purchased), and the shipping surcharge applied to the shipping service option.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingCostOverride implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The dollar value passed into this field will override the additional shipping cost that is currently set for the applicable shipping service option. The &quot;Additional shipping cost&quot; is the cost to ship each additional identical product to the buyer using the corresponding shipping service. The shipping service option in the fulfillment policy to override is controlled by the &lt;strong&gt;shippingServiceType&lt;/strong&gt; and &lt;strong&gt;priority&lt;/strong&gt; values.&lt;br&gt;&lt;br&gt;If using an &lt;strong&gt;updateOffer&lt;/strong&gt; call, and this field is defined for the offer being updated, this field must be supplied again, even if its value is not changing.&lt;br&gt;&lt;br&gt;This field is returned in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if defined.
     */
    private Amount additionalShippingCost;
    /**
     * The integer value input into this field, along with the &lt;strong&gt;shippingServiceType&lt;/strong&gt; value, sets which domestic or international shipping service option in the fulfillment policy will be modified with updated shipping costs. Specifically, the &lt;strong&gt;shippingCostOverrides.shippingServiceType&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.optionType&lt;/strong&gt; value in a fulfillment listing policy, and the &lt;strong&gt;shippingCostOverrides.priority&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; value in a fulfillment listing policy.&lt;br&gt;&lt;br&gt;This field is always required when overriding the shipping costs of a shipping service option, and will be always be returned for each shipping service option whose costs are being overridden.
     */
    private Integer priority;
    /**
     * The dollar value passed into this field will override the shipping cost that is currently set for the applicable shipping service option. This value will be the cost to ship one item to the buyer using the corresponding shipping service.  The shipping service option in the fulfillment policy to override is controlled by the &lt;strong&gt;shippingServiceType&lt;/strong&gt; and &lt;strong&gt;priority&lt;/strong&gt; values.&lt;br&gt;&lt;br&gt;If using an &lt;strong&gt;updateOffer&lt;/strong&gt; call, and this field is defined for the offer being updated, this field must be supplied again, even if its value is not changing.&lt;br&gt;&lt;br&gt;This field is returned in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if defined.
     */
    private Amount shippingCost;
    /**
     * This enumerated value indicates whether the shipping service specified in the &lt;strong&gt;priority&lt;/strong&gt; field is a domestic or an international shipping service option. To override the shipping costs for a specific domestic shipping service in the fulfillment listing policy, this field should be set to &lt;code&gt;DOMESTIC&lt;/code&gt;, and to override the shipping costs for each international shipping service, this field should be set to &lt;code&gt;INTERNATIONAL&lt;/code&gt;. This value, along with &lt;strong&gt;priority&lt;/strong&gt; value, sets which domestic or international shipping service option in the fulfillment policy that will be modified with updated shipping costs. Specifically, the &lt;strong&gt;shippingCostOverrides.shippingServiceType&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.optionType&lt;/strong&gt; value in a fulfillment listing policy, and the &lt;strong&gt;shippingCostOverrides.priority&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; value in a fulfillment listing policy.&lt;br&gt;&lt;br&gt;This field is always required when overriding the shipping costs of a shipping service option, and will be always be returned for each shipping service option whose costs are being overridden.
     */
    private ShippingServiceTypeEnum shippingServiceType;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; DO NOT USE THIS FIELD. Shipping surcharges for shipping service options can no longer be set with fulfillment business policies. To set a shipping surcharge for a shipping service option, only the &lt;b&gt;Shipping rate tables&lt;/b&gt; tool in My eBay can be used. &lt;/span&gt;&lt;br&gt;The dollar value passed into this field will override the shipping surcharge that is currently set for the applicable shipping service option. The shipping service option in the fulfillment policy to override is controlled by the &lt;strong&gt;shippingServiceType&lt;/strong&gt; and &lt;strong&gt;priority&lt;/strong&gt; values.&lt;br&gt;&lt;br&gt;If using an &lt;strong&gt;updateOffer&lt;/strong&gt; call, and this field is defined for the offer being updated, this field must be supplied again, even if its value is not changing.&lt;br&gt;&lt;br&gt;This field is returned in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if defined.
     */
    private Amount surcharge;
    /**
     * Instantiates a new {@link ShippingCostOverride} and sets the default values.
     */
    public ShippingCostOverride() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingCostOverride}
     */
    @jakarta.annotation.Nonnull
    public static ShippingCostOverride createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingCostOverride();
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
     * Gets the additionalShippingCost property value. The dollar value passed into this field will override the additional shipping cost that is currently set for the applicable shipping service option. The &quot;Additional shipping cost&quot; is the cost to ship each additional identical product to the buyer using the corresponding shipping service. The shipping service option in the fulfillment policy to override is controlled by the &lt;strong&gt;shippingServiceType&lt;/strong&gt; and &lt;strong&gt;priority&lt;/strong&gt; values.&lt;br&gt;&lt;br&gt;If using an &lt;strong&gt;updateOffer&lt;/strong&gt; call, and this field is defined for the offer being updated, this field must be supplied again, even if its value is not changing.&lt;br&gt;&lt;br&gt;This field is returned in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if defined.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAdditionalShippingCost() {
        return this.additionalShippingCost;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("additionalShippingCost", (n) -> { this.setAdditionalShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("shippingCost", (n) -> { this.setShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingServiceType", (n) -> { this.setShippingServiceType(n.getEnumValue(ShippingServiceTypeEnum::forValue)); });
        deserializerMap.put("surcharge", (n) -> { this.setSurcharge(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. The integer value input into this field, along with the &lt;strong&gt;shippingServiceType&lt;/strong&gt; value, sets which domestic or international shipping service option in the fulfillment policy will be modified with updated shipping costs. Specifically, the &lt;strong&gt;shippingCostOverrides.shippingServiceType&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.optionType&lt;/strong&gt; value in a fulfillment listing policy, and the &lt;strong&gt;shippingCostOverrides.priority&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; value in a fulfillment listing policy.&lt;br&gt;&lt;br&gt;This field is always required when overriding the shipping costs of a shipping service option, and will be always be returned for each shipping service option whose costs are being overridden.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the shippingCost property value. The dollar value passed into this field will override the shipping cost that is currently set for the applicable shipping service option. This value will be the cost to ship one item to the buyer using the corresponding shipping service.  The shipping service option in the fulfillment policy to override is controlled by the &lt;strong&gt;shippingServiceType&lt;/strong&gt; and &lt;strong&gt;priority&lt;/strong&gt; values.&lt;br&gt;&lt;br&gt;If using an &lt;strong&gt;updateOffer&lt;/strong&gt; call, and this field is defined for the offer being updated, this field must be supplied again, even if its value is not changing.&lt;br&gt;&lt;br&gt;This field is returned in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if defined.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingCost() {
        return this.shippingCost;
    }
    /**
     * Gets the shippingServiceType property value. This enumerated value indicates whether the shipping service specified in the &lt;strong&gt;priority&lt;/strong&gt; field is a domestic or an international shipping service option. To override the shipping costs for a specific domestic shipping service in the fulfillment listing policy, this field should be set to &lt;code&gt;DOMESTIC&lt;/code&gt;, and to override the shipping costs for each international shipping service, this field should be set to &lt;code&gt;INTERNATIONAL&lt;/code&gt;. This value, along with &lt;strong&gt;priority&lt;/strong&gt; value, sets which domestic or international shipping service option in the fulfillment policy that will be modified with updated shipping costs. Specifically, the &lt;strong&gt;shippingCostOverrides.shippingServiceType&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.optionType&lt;/strong&gt; value in a fulfillment listing policy, and the &lt;strong&gt;shippingCostOverrides.priority&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; value in a fulfillment listing policy.&lt;br&gt;&lt;br&gt;This field is always required when overriding the shipping costs of a shipping service option, and will be always be returned for each shipping service option whose costs are being overridden.
     * @return a {@link ShippingServiceTypeEnum}
     */
    @jakarta.annotation.Nullable
    public ShippingServiceTypeEnum getShippingServiceType() {
        return this.shippingServiceType;
    }
    /**
     * Gets the surcharge property value. &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; DO NOT USE THIS FIELD. Shipping surcharges for shipping service options can no longer be set with fulfillment business policies. To set a shipping surcharge for a shipping service option, only the &lt;b&gt;Shipping rate tables&lt;/b&gt; tool in My eBay can be used. &lt;/span&gt;&lt;br&gt;The dollar value passed into this field will override the shipping surcharge that is currently set for the applicable shipping service option. The shipping service option in the fulfillment policy to override is controlled by the &lt;strong&gt;shippingServiceType&lt;/strong&gt; and &lt;strong&gt;priority&lt;/strong&gt; values.&lt;br&gt;&lt;br&gt;If using an &lt;strong&gt;updateOffer&lt;/strong&gt; call, and this field is defined for the offer being updated, this field must be supplied again, even if its value is not changing.&lt;br&gt;&lt;br&gt;This field is returned in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if defined.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getSurcharge() {
        return this.surcharge;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("additionalShippingCost", this.getAdditionalShippingCost());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeObjectValue("shippingCost", this.getShippingCost());
        writer.writeEnumValue("shippingServiceType", this.getShippingServiceType());
        writer.writeObjectValue("surcharge", this.getSurcharge());
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
     * Sets the additionalShippingCost property value. The dollar value passed into this field will override the additional shipping cost that is currently set for the applicable shipping service option. The &quot;Additional shipping cost&quot; is the cost to ship each additional identical product to the buyer using the corresponding shipping service. The shipping service option in the fulfillment policy to override is controlled by the &lt;strong&gt;shippingServiceType&lt;/strong&gt; and &lt;strong&gt;priority&lt;/strong&gt; values.&lt;br&gt;&lt;br&gt;If using an &lt;strong&gt;updateOffer&lt;/strong&gt; call, and this field is defined for the offer being updated, this field must be supplied again, even if its value is not changing.&lt;br&gt;&lt;br&gt;This field is returned in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if defined.
     * @param value Value to set for the additionalShippingCost property.
     */
    public void setAdditionalShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.additionalShippingCost = value;
    }
    /**
     * Sets the priority property value. The integer value input into this field, along with the &lt;strong&gt;shippingServiceType&lt;/strong&gt; value, sets which domestic or international shipping service option in the fulfillment policy will be modified with updated shipping costs. Specifically, the &lt;strong&gt;shippingCostOverrides.shippingServiceType&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.optionType&lt;/strong&gt; value in a fulfillment listing policy, and the &lt;strong&gt;shippingCostOverrides.priority&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; value in a fulfillment listing policy.&lt;br&gt;&lt;br&gt;This field is always required when overriding the shipping costs of a shipping service option, and will be always be returned for each shipping service option whose costs are being overridden.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the shippingCost property value. The dollar value passed into this field will override the shipping cost that is currently set for the applicable shipping service option. This value will be the cost to ship one item to the buyer using the corresponding shipping service.  The shipping service option in the fulfillment policy to override is controlled by the &lt;strong&gt;shippingServiceType&lt;/strong&gt; and &lt;strong&gt;priority&lt;/strong&gt; values.&lt;br&gt;&lt;br&gt;If using an &lt;strong&gt;updateOffer&lt;/strong&gt; call, and this field is defined for the offer being updated, this field must be supplied again, even if its value is not changing.&lt;br&gt;&lt;br&gt;This field is returned in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if defined.
     * @param value Value to set for the shippingCost property.
     */
    public void setShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.shippingCost = value;
    }
    /**
     * Sets the shippingServiceType property value. This enumerated value indicates whether the shipping service specified in the &lt;strong&gt;priority&lt;/strong&gt; field is a domestic or an international shipping service option. To override the shipping costs for a specific domestic shipping service in the fulfillment listing policy, this field should be set to &lt;code&gt;DOMESTIC&lt;/code&gt;, and to override the shipping costs for each international shipping service, this field should be set to &lt;code&gt;INTERNATIONAL&lt;/code&gt;. This value, along with &lt;strong&gt;priority&lt;/strong&gt; value, sets which domestic or international shipping service option in the fulfillment policy that will be modified with updated shipping costs. Specifically, the &lt;strong&gt;shippingCostOverrides.shippingServiceType&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.optionType&lt;/strong&gt; value in a fulfillment listing policy, and the &lt;strong&gt;shippingCostOverrides.priority&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; value in a fulfillment listing policy.&lt;br&gt;&lt;br&gt;This field is always required when overriding the shipping costs of a shipping service option, and will be always be returned for each shipping service option whose costs are being overridden.
     * @param value Value to set for the shippingServiceType property.
     */
    public void setShippingServiceType(@jakarta.annotation.Nullable final ShippingServiceTypeEnum value) {
        this.shippingServiceType = value;
    }
    /**
     * Sets the surcharge property value. &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; DO NOT USE THIS FIELD. Shipping surcharges for shipping service options can no longer be set with fulfillment business policies. To set a shipping surcharge for a shipping service option, only the &lt;b&gt;Shipping rate tables&lt;/b&gt; tool in My eBay can be used. &lt;/span&gt;&lt;br&gt;The dollar value passed into this field will override the shipping surcharge that is currently set for the applicable shipping service option. The shipping service option in the fulfillment policy to override is controlled by the &lt;strong&gt;shippingServiceType&lt;/strong&gt; and &lt;strong&gt;priority&lt;/strong&gt; values.&lt;br&gt;&lt;br&gt;If using an &lt;strong&gt;updateOffer&lt;/strong&gt; call, and this field is defined for the offer being updated, this field must be supplied again, even if its value is not changing.&lt;br&gt;&lt;br&gt;This field is returned in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if defined.
     * @param value Value to set for the surcharge property.
     */
    public void setSurcharge(@jakarta.annotation.Nullable final Amount value) {
        this.surcharge = value;
    }
}
