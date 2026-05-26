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
 * This type is used by the &lt;b&gt;createInventoryLocation&lt;/b&gt; call to specify cut-off time(s) for an inventory location, as well as any overrides for these times.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SameDayShippingCutOffTimes implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container can be used to override the existing cut-off time(s), specified in the &lt;b&gt;weeklySchedule&lt;/b&gt; container, for a specific date or date range.
     */
    private java.util.List<Overrides> overrides;
    /**
     * This container is used to specify the weekly schedule for shipping and handling cut-off times. A cut-off time is required for each business day that the fulfillment center operates. Any orders made after the specified &lt;b&gt;cutOffTime&lt;/b&gt; on the specified day(s) of the week will be handled on the next day.
     */
    private java.util.List<WeeklySchedule> weeklySchedule;
    /**
     * Instantiates a new {@link SameDayShippingCutOffTimes} and sets the default values.
     */
    public SameDayShippingCutOffTimes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SameDayShippingCutOffTimes}
     */
    @jakarta.annotation.Nonnull
    public static SameDayShippingCutOffTimes createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SameDayShippingCutOffTimes();
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
        deserializerMap.put("overrides", (n) -> { this.setOverrides(n.getCollectionOfObjectValues(Overrides::createFromDiscriminatorValue)); });
        deserializerMap.put("weeklySchedule", (n) -> { this.setWeeklySchedule(n.getCollectionOfObjectValues(WeeklySchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the overrides property value. This container can be used to override the existing cut-off time(s), specified in the &lt;b&gt;weeklySchedule&lt;/b&gt; container, for a specific date or date range.
     * @return a {@link java.util.List<Overrides>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Overrides> getOverrides() {
        return this.overrides;
    }
    /**
     * Gets the weeklySchedule property value. This container is used to specify the weekly schedule for shipping and handling cut-off times. A cut-off time is required for each business day that the fulfillment center operates. Any orders made after the specified &lt;b&gt;cutOffTime&lt;/b&gt; on the specified day(s) of the week will be handled on the next day.
     * @return a {@link java.util.List<WeeklySchedule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WeeklySchedule> getWeeklySchedule() {
        return this.weeklySchedule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("overrides", this.getOverrides());
        writer.writeCollectionOfObjectValues("weeklySchedule", this.getWeeklySchedule());
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
     * Sets the overrides property value. This container can be used to override the existing cut-off time(s), specified in the &lt;b&gt;weeklySchedule&lt;/b&gt; container, for a specific date or date range.
     * @param value Value to set for the overrides property.
     */
    public void setOverrides(@jakarta.annotation.Nullable final java.util.List<Overrides> value) {
        this.overrides = value;
    }
    /**
     * Sets the weeklySchedule property value. This container is used to specify the weekly schedule for shipping and handling cut-off times. A cut-off time is required for each business day that the fulfillment center operates. Any orders made after the specified &lt;b&gt;cutOffTime&lt;/b&gt; on the specified day(s) of the week will be handled on the next day.
     * @param value Value to set for the weeklySchedule property.
     */
    public void setWeeklySchedule(@jakarta.annotation.Nullable final java.util.List<WeeklySchedule> value) {
        this.weeklySchedule = value;
    }
}
