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
 * An array that defines the configuration supported by this template. This includes specified properties and usage (whether the property is REQUIRED or OPTIONAL), and an optional default value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SupportedConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The default value for the property. If a value is omitted from the schedule and a default value is supplied, the default value is used.
     */
    private String defaultValue;
    /**
     * Properties supported by the template. Properties can include the following: &lt;ul&gt;&lt;li&gt;&lt;b&gt;scheduleStartDate:&lt;/b&gt; The timestamp that the report generation (subscription) begins. After this timestamp, the schedule status becomes active until either the scheduleEndDate occurs or the scheduleTemplate becomes inactive. Format: UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;scheduleEndDate:&lt;/b&gt; The timestamp that the report generation (subscription) ends. After this date, the schedule status becomes INACTIVE. Format: UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;schemaVersion:&lt;/b&gt; The schema version of the schedule templates feedType. This field is required if the feedType has a schema version.&lt;/li&gt;&lt;li&gt;&lt;b&gt;preferredTriggerDayOfMonth:&lt;/b&gt; The preferred day of the month to trigger the schedule. &lt;/li&gt;&lt;li&gt;&lt;b&gt;preferredTriggerDayOfWeek:&lt;/b&gt; The preferred day of the week to trigger the schedule. &lt;/li&gt;&lt;li&gt;&lt;b&gt;preferredTriggerHour:&lt;/b&gt; The preferred two-digit hour of the day to trigger the schedule. Format: UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;/li&gt;&lt;ul&gt;
     */
    private String property;
    /**
     * Whether the specified property is REQUIRED or OPTIONAL. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:ConfigurationsUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String usage;
    /**
     * Instantiates a new {@link SupportedConfiguration} and sets the default values.
     */
    public SupportedConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SupportedConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static SupportedConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SupportedConfiguration();
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
     * Gets the defaultValue property value. The default value for the property. If a value is omitted from the schedule and a default value is supplied, the default value is used.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("property", (n) -> { this.setProperty(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the property property value. Properties supported by the template. Properties can include the following: &lt;ul&gt;&lt;li&gt;&lt;b&gt;scheduleStartDate:&lt;/b&gt; The timestamp that the report generation (subscription) begins. After this timestamp, the schedule status becomes active until either the scheduleEndDate occurs or the scheduleTemplate becomes inactive. Format: UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;scheduleEndDate:&lt;/b&gt; The timestamp that the report generation (subscription) ends. After this date, the schedule status becomes INACTIVE. Format: UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;schemaVersion:&lt;/b&gt; The schema version of the schedule templates feedType. This field is required if the feedType has a schema version.&lt;/li&gt;&lt;li&gt;&lt;b&gt;preferredTriggerDayOfMonth:&lt;/b&gt; The preferred day of the month to trigger the schedule. &lt;/li&gt;&lt;li&gt;&lt;b&gt;preferredTriggerDayOfWeek:&lt;/b&gt; The preferred day of the week to trigger the schedule. &lt;/li&gt;&lt;li&gt;&lt;b&gt;preferredTriggerHour:&lt;/b&gt; The preferred two-digit hour of the day to trigger the schedule. Format: UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;/li&gt;&lt;ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProperty() {
        return this.property;
    }
    /**
     * Gets the usage property value. Whether the specified property is REQUIRED or OPTIONAL. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:ConfigurationsUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeStringValue("property", this.getProperty());
        writer.writeStringValue("usage", this.getUsage());
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
     * Sets the defaultValue property value. The default value for the property. If a value is omitted from the schedule and a default value is supplied, the default value is used.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final String value) {
        this.defaultValue = value;
    }
    /**
     * Sets the property property value. Properties supported by the template. Properties can include the following: &lt;ul&gt;&lt;li&gt;&lt;b&gt;scheduleStartDate:&lt;/b&gt; The timestamp that the report generation (subscription) begins. After this timestamp, the schedule status becomes active until either the scheduleEndDate occurs or the scheduleTemplate becomes inactive. Format: UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;scheduleEndDate:&lt;/b&gt; The timestamp that the report generation (subscription) ends. After this date, the schedule status becomes INACTIVE. Format: UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;schemaVersion:&lt;/b&gt; The schema version of the schedule templates feedType. This field is required if the feedType has a schema version.&lt;/li&gt;&lt;li&gt;&lt;b&gt;preferredTriggerDayOfMonth:&lt;/b&gt; The preferred day of the month to trigger the schedule. &lt;/li&gt;&lt;li&gt;&lt;b&gt;preferredTriggerDayOfWeek:&lt;/b&gt; The preferred day of the week to trigger the schedule. &lt;/li&gt;&lt;li&gt;&lt;b&gt;preferredTriggerHour:&lt;/b&gt; The preferred two-digit hour of the day to trigger the schedule. Format: UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;/li&gt;&lt;ul&gt;
     * @param value Value to set for the property property.
     */
    public void setProperty(@jakarta.annotation.Nullable final String value) {
        this.property = value;
    }
    /**
     * Sets the usage property value. Whether the specified property is REQUIRED or OPTIONAL. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:ConfigurationsUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final String value) {
        this.usage = value;
    }
}
