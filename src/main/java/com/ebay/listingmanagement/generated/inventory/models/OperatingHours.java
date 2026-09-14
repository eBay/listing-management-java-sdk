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
 * This type is used to express the regular operating hours of a merchant&apos;s store or fulfillment center during the days of the week.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperatingHours implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; value is required for each day of the week that the store location has regular operating hours. &lt;br&gt;&lt;br&gt;This field is returned if operating hours are defined for the store location.
     */
    private DayOfWeekEnum dayOfWeekEnum;
    /**
     * This container is used to define the opening and closing times of a store location&apos;s working day (defined in the &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field). An &lt;strong&gt;intervals&lt;/strong&gt; container is needed for each day of the week that the store location is open. If a store location closes for lunch (or any other period during the day) and then reopens, multiple &lt;strong&gt;open&lt;/strong&gt; and &lt;strong&gt;close&lt;/strong&gt; pairs are needed &lt;br&gt;&lt;br&gt;This container is returned if operating hours are defined for the store location.
     */
    private java.util.List<Interval> intervals;
    /**
     * Instantiates a new {@link OperatingHours} and sets the default values.
     */
    public OperatingHours() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OperatingHours}
     */
    @jakarta.annotation.Nonnull
    public static OperatingHours createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperatingHours();
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
     * Gets the dayOfWeekEnum property value. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; value is required for each day of the week that the store location has regular operating hours. &lt;br&gt;&lt;br&gt;This field is returned if operating hours are defined for the store location.
     * @return a {@link DayOfWeekEnum}
     */
    @jakarta.annotation.Nullable
    public DayOfWeekEnum getDayOfWeekEnum() {
        return this.dayOfWeekEnum;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dayOfWeekEnum", (n) -> { this.setDayOfWeekEnum(n.getEnumValue(DayOfWeekEnum::forValue)); });
        deserializerMap.put("intervals", (n) -> { this.setIntervals(n.getCollectionOfObjectValues(Interval::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intervals property value. This container is used to define the opening and closing times of a store location&apos;s working day (defined in the &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field). An &lt;strong&gt;intervals&lt;/strong&gt; container is needed for each day of the week that the store location is open. If a store location closes for lunch (or any other period during the day) and then reopens, multiple &lt;strong&gt;open&lt;/strong&gt; and &lt;strong&gt;close&lt;/strong&gt; pairs are needed &lt;br&gt;&lt;br&gt;This container is returned if operating hours are defined for the store location.
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
        writer.writeEnumValue("dayOfWeekEnum", this.getDayOfWeekEnum());
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
     * Sets the dayOfWeekEnum property value. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; value is required for each day of the week that the store location has regular operating hours. &lt;br&gt;&lt;br&gt;This field is returned if operating hours are defined for the store location.
     * @param value Value to set for the dayOfWeekEnum property.
     */
    public void setDayOfWeekEnum(@jakarta.annotation.Nullable final DayOfWeekEnum value) {
        this.dayOfWeekEnum = value;
    }
    /**
     * Sets the intervals property value. This container is used to define the opening and closing times of a store location&apos;s working day (defined in the &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field). An &lt;strong&gt;intervals&lt;/strong&gt; container is needed for each day of the week that the store location is open. If a store location closes for lunch (or any other period during the day) and then reopens, multiple &lt;strong&gt;open&lt;/strong&gt; and &lt;strong&gt;close&lt;/strong&gt; pairs are needed &lt;br&gt;&lt;br&gt;This container is returned if operating hours are defined for the store location.
     * @param value Value to set for the intervals property.
     */
    public void setIntervals(@jakarta.annotation.Nullable final java.util.List<Interval> value) {
        this.intervals = value;
    }
}
