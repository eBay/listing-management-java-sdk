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
 * This type is used to specify the dimensions (and the unit used to measure those dimensions) of a shipping package. The &lt;strong&gt;dimensions&lt;/strong&gt; container is conditionally required if the seller will be offering calculated shipping rates to determine shipping cost. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Dimension implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The actual height (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified. &lt;br&gt;&lt;br&gt;If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height, the &lt;strong&gt;dimensions&lt;/strong&gt; container would look as follows: &lt;br&gt; &lt;pre&gt;&quot;dimensions&quot;: {&lt;br&gt; &quot;length&quot;: 21.5,&lt;br&gt; &quot;width&quot;: 15.0,&lt;br&gt; &quot;height&quot;: 12.0,&lt;br&gt; &quot;unit&quot;: &quot;INCH&quot;&lt;br&gt; } &lt;/pre&gt;
     */
    private Double height;
    /**
     * The actual length (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified. &lt;br&gt;&lt;br&gt;If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height,  the &lt;strong&gt;dimensions&lt;/strong&gt; container would look as follows: &lt;br&gt; &lt;pre&gt;&quot;dimensions&quot;: {&lt;br&gt; &quot;length&quot;: 21.5,&lt;br&gt; &quot;width&quot;: 15.0,&lt;br&gt; &quot;height&quot;: 12.0,&lt;br&gt; &quot;unit&quot;: &quot;INCH&quot;&lt;br&gt; } &lt;/pre&gt;
     */
    private Double length;
    /**
     * The unit of measurement used to specify the dimensions of a shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified. If the English system of measurement is being used, the applicable values for dimension units are &lt;code&gt;FEET&lt;/code&gt; and &lt;code&gt;INCH&lt;/code&gt;. If the metric system of measurement is being used, the applicable values for weight units are &lt;code&gt;METER&lt;/code&gt; and &lt;code&gt;CENTIMETER&lt;/code&gt;. The metric system is used by most countries outside of the US.
     */
    private LengthUnitOfMeasureEnum unit;
    /**
     * The actual width (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified.&lt;br&gt;&lt;br&gt;If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height,  the &lt;strong&gt;dimensions&lt;/strong&gt; container would look as follows: &lt;br&gt; &lt;pre&gt;&quot;dimensions&quot;: {&lt;br&gt; &quot;length&quot;: 21.5,&lt;br&gt; &quot;width&quot;: 15.0,&lt;br&gt; &quot;height&quot;: 12.0,&lt;br&gt; &quot;unit&quot;: &quot;INCH&quot;&lt;br&gt; } &lt;/pre&gt;
     */
    private Double width;
    /**
     * Instantiates a new {@link Dimension} and sets the default values.
     */
    public Dimension() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Dimension}
     */
    @jakarta.annotation.Nonnull
    public static Dimension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Dimension();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("height", (n) -> { this.setHeight(n.getDoubleValue()); });
        deserializerMap.put("length", (n) -> { this.setLength(n.getDoubleValue()); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getEnumValue(LengthUnitOfMeasureEnum::forValue)); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the height property value. The actual height (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified. &lt;br&gt;&lt;br&gt;If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height, the &lt;strong&gt;dimensions&lt;/strong&gt; container would look as follows: &lt;br&gt; &lt;pre&gt;&quot;dimensions&quot;: {&lt;br&gt; &quot;length&quot;: 21.5,&lt;br&gt; &quot;width&quot;: 15.0,&lt;br&gt; &quot;height&quot;: 12.0,&lt;br&gt; &quot;unit&quot;: &quot;INCH&quot;&lt;br&gt; } &lt;/pre&gt;
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getHeight() {
        return this.height;
    }
    /**
     * Gets the length property value. The actual length (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified. &lt;br&gt;&lt;br&gt;If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height,  the &lt;strong&gt;dimensions&lt;/strong&gt; container would look as follows: &lt;br&gt; &lt;pre&gt;&quot;dimensions&quot;: {&lt;br&gt; &quot;length&quot;: 21.5,&lt;br&gt; &quot;width&quot;: 15.0,&lt;br&gt; &quot;height&quot;: 12.0,&lt;br&gt; &quot;unit&quot;: &quot;INCH&quot;&lt;br&gt; } &lt;/pre&gt;
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLength() {
        return this.length;
    }
    /**
     * Gets the unit property value. The unit of measurement used to specify the dimensions of a shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified. If the English system of measurement is being used, the applicable values for dimension units are &lt;code&gt;FEET&lt;/code&gt; and &lt;code&gt;INCH&lt;/code&gt;. If the metric system of measurement is being used, the applicable values for weight units are &lt;code&gt;METER&lt;/code&gt; and &lt;code&gt;CENTIMETER&lt;/code&gt;. The metric system is used by most countries outside of the US.
     * @return a {@link LengthUnitOfMeasureEnum}
     */
    @jakarta.annotation.Nullable
    public LengthUnitOfMeasureEnum getUnit() {
        return this.unit;
    }
    /**
     * Gets the width property value. The actual width (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified.&lt;br&gt;&lt;br&gt;If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height,  the &lt;strong&gt;dimensions&lt;/strong&gt; container would look as follows: &lt;br&gt; &lt;pre&gt;&quot;dimensions&quot;: {&lt;br&gt; &quot;length&quot;: 21.5,&lt;br&gt; &quot;width&quot;: 15.0,&lt;br&gt; &quot;height&quot;: 12.0,&lt;br&gt; &quot;unit&quot;: &quot;INCH&quot;&lt;br&gt; } &lt;/pre&gt;
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("height", this.getHeight());
        writer.writeDoubleValue("length", this.getLength());
        writer.writeEnumValue("unit", this.getUnit());
        writer.writeDoubleValue("width", this.getWidth());
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
     * Sets the height property value. The actual height (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified. &lt;br&gt;&lt;br&gt;If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height, the &lt;strong&gt;dimensions&lt;/strong&gt; container would look as follows: &lt;br&gt; &lt;pre&gt;&quot;dimensions&quot;: {&lt;br&gt; &quot;length&quot;: 21.5,&lt;br&gt; &quot;width&quot;: 15.0,&lt;br&gt; &quot;height&quot;: 12.0,&lt;br&gt; &quot;unit&quot;: &quot;INCH&quot;&lt;br&gt; } &lt;/pre&gt;
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Double value) {
        this.height = value;
    }
    /**
     * Sets the length property value. The actual length (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified. &lt;br&gt;&lt;br&gt;If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height,  the &lt;strong&gt;dimensions&lt;/strong&gt; container would look as follows: &lt;br&gt; &lt;pre&gt;&quot;dimensions&quot;: {&lt;br&gt; &quot;length&quot;: 21.5,&lt;br&gt; &quot;width&quot;: 15.0,&lt;br&gt; &quot;height&quot;: 12.0,&lt;br&gt; &quot;unit&quot;: &quot;INCH&quot;&lt;br&gt; } &lt;/pre&gt;
     * @param value Value to set for the length property.
     */
    public void setLength(@jakarta.annotation.Nullable final Double value) {
        this.length = value;
    }
    /**
     * Sets the unit property value. The unit of measurement used to specify the dimensions of a shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified. If the English system of measurement is being used, the applicable values for dimension units are &lt;code&gt;FEET&lt;/code&gt; and &lt;code&gt;INCH&lt;/code&gt;. If the metric system of measurement is being used, the applicable values for weight units are &lt;code&gt;METER&lt;/code&gt; and &lt;code&gt;CENTIMETER&lt;/code&gt;. The metric system is used by most countries outside of the US.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final LengthUnitOfMeasureEnum value) {
        this.unit = value;
    }
    /**
     * Sets the width property value. The actual width (in the measurement unit specified in the &lt;strong&gt;unit&lt;/strong&gt; field) of the shipping package. All fields of the &lt;strong&gt;dimensions&lt;/strong&gt; container are required if package dimensions are specified.&lt;br&gt;&lt;br&gt;If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height,  the &lt;strong&gt;dimensions&lt;/strong&gt; container would look as follows: &lt;br&gt; &lt;pre&gt;&quot;dimensions&quot;: {&lt;br&gt; &quot;length&quot;: 21.5,&lt;br&gt; &quot;width&quot;: 15.0,&lt;br&gt; &quot;height&quot;: 12.0,&lt;br&gt; &quot;unit&quot;: &quot;INCH&quot;&lt;br&gt; } &lt;/pre&gt;
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Double value) {
        this.width = value;
    }
}
