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

package com.ebay.listingmanagement.generated.feed.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields for a date range.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DateRange implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The beginning date in the range. If the parent type is included, both the &lt;strong&gt;from&lt;/strong&gt; and the &lt;strong&gt;to&lt;/strong&gt; fields become conditionally required.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Format: &lt;/strong&gt;UTC &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;For example: &lt;/strong&gt; Tasks within a range  &lt;br /&gt; &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt; Tasks created on March 31, 2021&lt;br /&gt;&lt;code&gt;2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z&lt;/code&gt;    
     */
    private String from;
    /**
     * The end date for the date range, which is inclusive. If the parent type is included, both the &lt;strong&gt;from&lt;/strong&gt; and the &lt;strong&gt;to&lt;/strong&gt; fields become conditionally required.  &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;For example: &lt;/strong&gt; &lt;br /&gt;&lt;br /&gt;Tasks within a range  &lt;br /&gt; &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt; Tasks created on March 31, 2021&lt;br /&gt; &lt;code&gt;2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z&lt;/code&gt;  
     */
    private String to;
    /**
     * Instantiates a new {@link DateRange} and sets the default values.
     */
    public DateRange() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DateRange}
     */
    @jakarta.annotation.Nonnull
    public static DateRange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DateRange();
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
        deserializerMap.put("from", (n) -> { this.setFrom(n.getStringValue()); });
        deserializerMap.put("to", (n) -> { this.setTo(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from property value. The beginning date in the range. If the parent type is included, both the &lt;strong&gt;from&lt;/strong&gt; and the &lt;strong&gt;to&lt;/strong&gt; fields become conditionally required.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Format: &lt;/strong&gt;UTC &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;For example: &lt;/strong&gt; Tasks within a range  &lt;br /&gt; &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt; Tasks created on March 31, 2021&lt;br /&gt;&lt;code&gt;2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z&lt;/code&gt;    
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFrom() {
        return this.from;
    }
    /**
     * Gets the to property value. The end date for the date range, which is inclusive. If the parent type is included, both the &lt;strong&gt;from&lt;/strong&gt; and the &lt;strong&gt;to&lt;/strong&gt; fields become conditionally required.  &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;For example: &lt;/strong&gt; &lt;br /&gt;&lt;br /&gt;Tasks within a range  &lt;br /&gt; &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt; Tasks created on March 31, 2021&lt;br /&gt; &lt;code&gt;2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z&lt;/code&gt;  
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTo() {
        return this.to;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("from", this.getFrom());
        writer.writeStringValue("to", this.getTo());
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
     * Sets the from property value. The beginning date in the range. If the parent type is included, both the &lt;strong&gt;from&lt;/strong&gt; and the &lt;strong&gt;to&lt;/strong&gt; fields become conditionally required.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Format: &lt;/strong&gt;UTC &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;For example: &lt;/strong&gt; Tasks within a range  &lt;br /&gt; &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt; Tasks created on March 31, 2021&lt;br /&gt;&lt;code&gt;2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z&lt;/code&gt;    
     * @param value Value to set for the from property.
     */
    public void setFrom(@jakarta.annotation.Nullable final String value) {
        this.from = value;
    }
    /**
     * Sets the to property value. The end date for the date range, which is inclusive. If the parent type is included, both the &lt;strong&gt;from&lt;/strong&gt; and the &lt;strong&gt;to&lt;/strong&gt; fields become conditionally required.  &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;For example: &lt;/strong&gt; &lt;br /&gt;&lt;br /&gt;Tasks within a range  &lt;br /&gt; &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt; Tasks created on March 31, 2021&lt;br /&gt; &lt;code&gt;2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z&lt;/code&gt;  
     * @param value Value to set for the to property.
     */
    public void setTo(@jakarta.annotation.Nullable final String value) {
        this.to = value;
    }
}
