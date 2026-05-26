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
 * This type is used to express the special operating hours of a store location on a specific date. A &lt;strong&gt;specialHours&lt;/strong&gt; container is needed when the store&apos;s opening hours on a specific date are different than the normal operating hours on that particular day of the week.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SpecialHours implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A &lt;strong&gt;date&lt;/strong&gt; value is required for each specific date that the store location has special operating hours or is closed for that date.  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2025-08-04T00:00:00.000Z&lt;/code&gt; &lt;br&gt;&lt;br&gt;This field is returned if set for the store location.
     */
    private String date;
    /**
     * This array is used to set the operating hours for the date specified in the corresponding &lt;strong&gt;date&lt;/strong&gt; field. These special operating hours on this specific date will override the normal operating hours for that day of the week that is specified through the &lt;strong&gt;operatingHours&lt;/strong&gt; array. &lt;br&gt;&lt;br&gt;To specify a location as closed on the corresponding &lt;strong&gt;date&lt;/strong&gt;, include the &lt;strong&gt;intervals&lt;/strong&gt; array as empty. &lt;br&gt;&lt;br&gt;If a location closes for lunch (or any other period during the day) and then reopens, multiple &lt;strong&gt;open&lt;/strong&gt; and &lt;strong&gt;close&lt;/strong&gt; pairs are needed to specify each interval where the location is open. &lt;br&gt;&lt;br&gt;This container is returned if set for the store location.
     */
    private java.util.List<Interval> intervals;
    /**
     * Instantiates a new {@link SpecialHours} and sets the default values.
     */
    public SpecialHours() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SpecialHours}
     */
    @jakarta.annotation.Nonnull
    public static SpecialHours createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SpecialHours();
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
     * Gets the date property value. A &lt;strong&gt;date&lt;/strong&gt; value is required for each specific date that the store location has special operating hours or is closed for that date.  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2025-08-04T00:00:00.000Z&lt;/code&gt; &lt;br&gt;&lt;br&gt;This field is returned if set for the store location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDate() {
        return this.date;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("date", (n) -> { this.setDate(n.getStringValue()); });
        deserializerMap.put("intervals", (n) -> { this.setIntervals(n.getCollectionOfObjectValues(Interval::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intervals property value. This array is used to set the operating hours for the date specified in the corresponding &lt;strong&gt;date&lt;/strong&gt; field. These special operating hours on this specific date will override the normal operating hours for that day of the week that is specified through the &lt;strong&gt;operatingHours&lt;/strong&gt; array. &lt;br&gt;&lt;br&gt;To specify a location as closed on the corresponding &lt;strong&gt;date&lt;/strong&gt;, include the &lt;strong&gt;intervals&lt;/strong&gt; array as empty. &lt;br&gt;&lt;br&gt;If a location closes for lunch (or any other period during the day) and then reopens, multiple &lt;strong&gt;open&lt;/strong&gt; and &lt;strong&gt;close&lt;/strong&gt; pairs are needed to specify each interval where the location is open. &lt;br&gt;&lt;br&gt;This container is returned if set for the store location.
     * @return a {@link java.util.List<Interval>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Interval> getIntervals() {
        return this.intervals;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("date", this.getDate());
        writer.writeCollectionOfObjectValues("intervals", this.getIntervals());
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
     * Sets the date property value. A &lt;strong&gt;date&lt;/strong&gt; value is required for each specific date that the store location has special operating hours or is closed for that date.  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2025-08-04T00:00:00.000Z&lt;/code&gt; &lt;br&gt;&lt;br&gt;This field is returned if set for the store location.
     * @param value Value to set for the date property.
     */
    public void setDate(@jakarta.annotation.Nullable final String value) {
        this.date = value;
    }
    /**
     * Sets the intervals property value. This array is used to set the operating hours for the date specified in the corresponding &lt;strong&gt;date&lt;/strong&gt; field. These special operating hours on this specific date will override the normal operating hours for that day of the week that is specified through the &lt;strong&gt;operatingHours&lt;/strong&gt; array. &lt;br&gt;&lt;br&gt;To specify a location as closed on the corresponding &lt;strong&gt;date&lt;/strong&gt;, include the &lt;strong&gt;intervals&lt;/strong&gt; array as empty. &lt;br&gt;&lt;br&gt;If a location closes for lunch (or any other period during the day) and then reopens, multiple &lt;strong&gt;open&lt;/strong&gt; and &lt;strong&gt;close&lt;/strong&gt; pairs are needed to specify each interval where the location is open. &lt;br&gt;&lt;br&gt;This container is returned if set for the store location.
     * @param value Value to set for the intervals property.
     */
    public void setIntervals(@jakarta.annotation.Nullable final java.util.List<Interval> value) {
        this.intervals = value;
    }
}
