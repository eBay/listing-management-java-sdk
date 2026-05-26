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
 * This type is used to indicate the package type, weight, and dimensions of the shipping package. Package weight and dimensions are required when calculated shipping rates are used, and weight alone is required when flat-rate shipping is used, but with a weight surcharge. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PackageWeightAndSize implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to specify the dimensions (and the unit used to measure those dimensions) of a shipping package. The &lt;strong&gt;dimensions&lt;/strong&gt; container is conditionally required if the seller will be offering calculated shipping rates to determine shipping cost. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     */
    private Dimension dimensions;
    /**
     * This enumeration value indicates the type of shipping package used to ship the inventory item. The supported values for this field can be found in the &lt;a href=&quot;/api-docs/sell/inventory/types/slr:PackageTypeEnum&quot; target=&quot;_blank&quot;&gt;PackageTypeEnum&lt;/a&gt; type.&lt;br&gt;&lt;br&gt;This field will be returned if the package type is set for the inventory item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; You can use the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/GeteBayDetails.html#Response.ShippingPackageDetails&quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; Trading API call to retrieve a list of supported package types for a specific marketplace.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:PackageTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String packageType;
    /**
     * A value of &lt;code&gt;true&lt;/code&gt; indicates that the package is irregular and cannot go through the stamping machine at the shipping service office. This field applies to calculated shipping only. Irregular packages require special or fragile handling.
     */
    private Boolean shippingIrregular;
    /**
     * This type is used to specify the weight (and the unit used to measure that weight) of a shipping package. The &lt;strong&gt;weight&lt;/strong&gt; container is conditionally required if the seller will be offering calculated shipping rates to determine shipping cost, or is using flat-rate costs, but charging a weight surcharge. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     */
    private Weight weight;
    /**
     * Instantiates a new {@link PackageWeightAndSize} and sets the default values.
     */
    public PackageWeightAndSize() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PackageWeightAndSize}
     */
    @jakarta.annotation.Nonnull
    public static PackageWeightAndSize createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PackageWeightAndSize();
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
     * Gets the dimensions property value. This type is used to specify the dimensions (and the unit used to measure those dimensions) of a shipping package. The &lt;strong&gt;dimensions&lt;/strong&gt; container is conditionally required if the seller will be offering calculated shipping rates to determine shipping cost. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     * @return a {@link Dimension}
     */
    @jakarta.annotation.Nullable
    public Dimension getDimensions() {
        return this.dimensions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("dimensions", (n) -> { this.setDimensions(n.getObjectValue(Dimension::createFromDiscriminatorValue)); });
        deserializerMap.put("packageType", (n) -> { this.setPackageType(n.getStringValue()); });
        deserializerMap.put("shippingIrregular", (n) -> { this.setShippingIrregular(n.getBooleanValue()); });
        deserializerMap.put("weight", (n) -> { this.setWeight(n.getObjectValue(Weight::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the packageType property value. This enumeration value indicates the type of shipping package used to ship the inventory item. The supported values for this field can be found in the &lt;a href=&quot;/api-docs/sell/inventory/types/slr:PackageTypeEnum&quot; target=&quot;_blank&quot;&gt;PackageTypeEnum&lt;/a&gt; type.&lt;br&gt;&lt;br&gt;This field will be returned if the package type is set for the inventory item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; You can use the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/GeteBayDetails.html#Response.ShippingPackageDetails&quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; Trading API call to retrieve a list of supported package types for a specific marketplace.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:PackageTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageType() {
        return this.packageType;
    }
    /**
     * Gets the shippingIrregular property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that the package is irregular and cannot go through the stamping machine at the shipping service office. This field applies to calculated shipping only. Irregular packages require special or fragile handling.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShippingIrregular() {
        return this.shippingIrregular;
    }
    /**
     * Gets the weight property value. This type is used to specify the weight (and the unit used to measure that weight) of a shipping package. The &lt;strong&gt;weight&lt;/strong&gt; container is conditionally required if the seller will be offering calculated shipping rates to determine shipping cost, or is using flat-rate costs, but charging a weight surcharge. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     * @return a {@link Weight}
     */
    @jakarta.annotation.Nullable
    public Weight getWeight() {
        return this.weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("dimensions", this.getDimensions());
        writer.writeStringValue("packageType", this.getPackageType());
        writer.writeBooleanValue("shippingIrregular", this.getShippingIrregular());
        writer.writeObjectValue("weight", this.getWeight());
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
     * Sets the dimensions property value. This type is used to specify the dimensions (and the unit used to measure those dimensions) of a shipping package. The &lt;strong&gt;dimensions&lt;/strong&gt; container is conditionally required if the seller will be offering calculated shipping rates to determine shipping cost. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     * @param value Value to set for the dimensions property.
     */
    public void setDimensions(@jakarta.annotation.Nullable final Dimension value) {
        this.dimensions = value;
    }
    /**
     * Sets the packageType property value. This enumeration value indicates the type of shipping package used to ship the inventory item. The supported values for this field can be found in the &lt;a href=&quot;/api-docs/sell/inventory/types/slr:PackageTypeEnum&quot; target=&quot;_blank&quot;&gt;PackageTypeEnum&lt;/a&gt; type.&lt;br&gt;&lt;br&gt;This field will be returned if the package type is set for the inventory item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; You can use the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/GeteBayDetails.html#Response.ShippingPackageDetails&quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; Trading API call to retrieve a list of supported package types for a specific marketplace.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:PackageTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the packageType property.
     */
    public void setPackageType(@jakarta.annotation.Nullable final String value) {
        this.packageType = value;
    }
    /**
     * Sets the shippingIrregular property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that the package is irregular and cannot go through the stamping machine at the shipping service office. This field applies to calculated shipping only. Irregular packages require special or fragile handling.
     * @param value Value to set for the shippingIrregular property.
     */
    public void setShippingIrregular(@jakarta.annotation.Nullable final Boolean value) {
        this.shippingIrregular = value;
    }
    /**
     * Sets the weight property value. This type is used to specify the weight (and the unit used to measure that weight) of a shipping package. The &lt;strong&gt;weight&lt;/strong&gt; container is conditionally required if the seller will be offering calculated shipping rates to determine shipping cost, or is using flat-rate costs, but charging a weight surcharge. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     * @param value Value to set for the weight property.
     */
    public void setWeight(@jakarta.annotation.Nullable final Weight value) {
        this.weight = value;
    }
}
