package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to specify the weight (and the unit used to measure that weight) of a shipping package. The &lt;strong&gt;weight&lt;/strong&gt; container is conditionally required if the seller will be offering calculated shipping rates to determine shipping cost, or is using flat-rate costs, but charging a weight surcharge. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Weight implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unit of measurement used to specify the weight of a shipping package. Both the &lt;strong&gt;unit&lt;/strong&gt; and &lt;strong&gt;value&lt;/strong&gt; fields are required if the &lt;strong&gt;weight&lt;/strong&gt; container is used. If the English system of measurement is being used, the applicable values for weight units are &lt;code&gt;POUND&lt;/code&gt; and &lt;code&gt;OUNCE&lt;/CODE&gt;. If the metric system of measurement is being used, the applicable values for weight units are &lt;code&gt;KILOGRAM&lt;/code&gt; and &lt;code&gt;GRAM&lt;/code&gt;. The metric system is used by most countries outside of the US. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:WeightUnitOfMeasureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String unit;
    /**
     * The actual weight (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. Both the &lt;strong&gt;unit&lt;/strong&gt; and &lt;strong&gt;value&lt;/strong&gt; fields are required if the &lt;strong&gt;weight&lt;/strong&gt; container is used. If a shipping package weighed 20.5 ounces, the container would look as follows: &lt;br&gt;&lt;pre&gt;&quot;weight&quot;: {&lt;br&gt; &quot;value&quot;: 20.5,&lt;br&gt; &quot;unit&quot;: &quot;OUNCE&quot;&lt;br&gt; }&lt;/pre&gt;
     */
    private Double value;
    /**
     * Instantiates a new {@link Weight} and sets the default values.
     */
    public Weight() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Weight}
     */
    @jakarta.annotation.Nonnull
    public static Weight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Weight();
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
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the unit property value. The unit of measurement used to specify the weight of a shipping package. Both the &lt;strong&gt;unit&lt;/strong&gt; and &lt;strong&gt;value&lt;/strong&gt; fields are required if the &lt;strong&gt;weight&lt;/strong&gt; container is used. If the English system of measurement is being used, the applicable values for weight units are &lt;code&gt;POUND&lt;/code&gt; and &lt;code&gt;OUNCE&lt;/CODE&gt;. If the metric system of measurement is being used, the applicable values for weight units are &lt;code&gt;KILOGRAM&lt;/code&gt; and &lt;code&gt;GRAM&lt;/code&gt;. The metric system is used by most countries outside of the US. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:WeightUnitOfMeasureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUnit() {
        return this.unit;
    }
    /**
     * Gets the value property value. The actual weight (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. Both the &lt;strong&gt;unit&lt;/strong&gt; and &lt;strong&gt;value&lt;/strong&gt; fields are required if the &lt;strong&gt;weight&lt;/strong&gt; container is used. If a shipping package weighed 20.5 ounces, the container would look as follows: &lt;br&gt;&lt;pre&gt;&quot;weight&quot;: {&lt;br&gt; &quot;value&quot;: 20.5,&lt;br&gt; &quot;unit&quot;: &quot;OUNCE&quot;&lt;br&gt; }&lt;/pre&gt;
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("unit", this.getUnit());
        writer.writeDoubleValue("value", this.getValue());
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
     * Sets the unit property value. The unit of measurement used to specify the weight of a shipping package. Both the &lt;strong&gt;unit&lt;/strong&gt; and &lt;strong&gt;value&lt;/strong&gt; fields are required if the &lt;strong&gt;weight&lt;/strong&gt; container is used. If the English system of measurement is being used, the applicable values for weight units are &lt;code&gt;POUND&lt;/code&gt; and &lt;code&gt;OUNCE&lt;/CODE&gt;. If the metric system of measurement is being used, the applicable values for weight units are &lt;code&gt;KILOGRAM&lt;/code&gt; and &lt;code&gt;GRAM&lt;/code&gt;. The metric system is used by most countries outside of the US. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:WeightUnitOfMeasureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final String value) {
        this.unit = value;
    }
    /**
     * Sets the value property value. The actual weight (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. Both the &lt;strong&gt;unit&lt;/strong&gt; and &lt;strong&gt;value&lt;/strong&gt; fields are required if the &lt;strong&gt;weight&lt;/strong&gt; container is used. If a shipping package weighed 20.5 ounces, the container would look as follows: &lt;br&gt;&lt;pre&gt;&quot;weight&quot;: {&lt;br&gt; &quot;value&quot;: 20.5,&lt;br&gt; &quot;unit&quot;: &quot;OUNCE&quot;&lt;br&gt; }&lt;/pre&gt;
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Double value) {
        this.value = value;
    }
}
