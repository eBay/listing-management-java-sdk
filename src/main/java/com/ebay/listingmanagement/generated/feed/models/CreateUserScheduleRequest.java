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
 * The type that defines the fields for the &lt;strong&gt;createSchedule&lt;/strong&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateUserScheduleRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the feed type for the created schedule.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/api-docs/sell/feed/resources/schedule/methods/getScheduleTemplates&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the feed type of a schedule template.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     */
    private String feedType;
    /**
     * The preferred day of the month to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for monthly schedules. The last day of the month is used for numbers larger than the actual number of days in the month. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Minimum: &lt;/b&gt;1&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt;31
     */
    private Integer preferredTriggerDayOfMonth;
    /**
     * The preferred day of the week to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for weekly schedules. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:DayOfWeekEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String preferredTriggerDayOfWeek;
    /**
     * The preferred two-digit hour of the day to trigger the schedule. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents 11:00 am UTC:&lt;code&gt; 11Z&lt;/code&gt;
     */
    private String preferredTriggerHour;
    /**
     * The timestamp on which the report generation (subscription) ends. After this date, the schedule status becomes &lt;code&gt;INACTIVE&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt;Use this field, if available, to end the schedule in the future. This value must be later than &lt;strong&gt;scheduleStartDate&lt;/strong&gt; (if supplied). This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents UTC October 10, 2021 at 10:00 AM:&lt;br /&gt;&lt;code&gt;2021-10-10T10Z&lt;/code&gt;
     */
    private String scheduleEndDate;
    /**
     * The schedule name assigned by the user for the created schedule.
     */
    private String scheduleName;
    /**
     * The timestamp to start generating the report. After this timestamp, the schedule status becomes active until either the &lt;strong&gt;scheduleEndDate&lt;/strong&gt; occurs or the &lt;strong&gt;scheduleTemplateId&lt;/strong&gt; becomes inactive. &lt;br /&gt;&lt;br /&gt;Use this field, if available, to start the schedule in the future but before the &lt;strong&gt;scheduleEndDate&lt;/strong&gt; (if supplied). This field is available as specified by the template &lt;strong&gt;(scheduleTemplateId)&lt;/strong&gt;. The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents a schedule start date of UTC October 01, 2020 at 12:00 PM:&lt;br /&gt;&lt;code&gt; 2020-01-01T12Z&lt;/code&gt;
     */
    private String scheduleStartDate;
    /**
     * The unique identifier of the template to be used for this schedule. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/feed/resources/schedule/methods/getScheduleTemplates&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the schedule template ID. This method requires a schedule template ID that is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     */
    private String scheduleTemplateId;
    /**
     * The schema version of a schedule.
     */
    private String schemaVersion;
    /**
     * Instantiates a new {@link CreateUserScheduleRequest} and sets the default values.
     */
    public CreateUserScheduleRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateUserScheduleRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateUserScheduleRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateUserScheduleRequest();
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
     * Gets the feedType property value. The name of the feed type for the created schedule.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/api-docs/sell/feed/resources/schedule/methods/getScheduleTemplates&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the feed type of a schedule template.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeedType() {
        return this.feedType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("feedType", (n) -> { this.setFeedType(n.getStringValue()); });
        deserializerMap.put("preferredTriggerDayOfMonth", (n) -> { this.setPreferredTriggerDayOfMonth(n.getIntegerValue()); });
        deserializerMap.put("preferredTriggerDayOfWeek", (n) -> { this.setPreferredTriggerDayOfWeek(n.getStringValue()); });
        deserializerMap.put("preferredTriggerHour", (n) -> { this.setPreferredTriggerHour(n.getStringValue()); });
        deserializerMap.put("scheduleEndDate", (n) -> { this.setScheduleEndDate(n.getStringValue()); });
        deserializerMap.put("scheduleName", (n) -> { this.setScheduleName(n.getStringValue()); });
        deserializerMap.put("scheduleStartDate", (n) -> { this.setScheduleStartDate(n.getStringValue()); });
        deserializerMap.put("scheduleTemplateId", (n) -> { this.setScheduleTemplateId(n.getStringValue()); });
        deserializerMap.put("schemaVersion", (n) -> { this.setSchemaVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the preferredTriggerDayOfMonth property value. The preferred day of the month to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for monthly schedules. The last day of the month is used for numbers larger than the actual number of days in the month. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Minimum: &lt;/b&gt;1&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt;31
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPreferredTriggerDayOfMonth() {
        return this.preferredTriggerDayOfMonth;
    }
    /**
     * Gets the preferredTriggerDayOfWeek property value. The preferred day of the week to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for weekly schedules. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:DayOfWeekEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredTriggerDayOfWeek() {
        return this.preferredTriggerDayOfWeek;
    }
    /**
     * Gets the preferredTriggerHour property value. The preferred two-digit hour of the day to trigger the schedule. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents 11:00 am UTC:&lt;code&gt; 11Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredTriggerHour() {
        return this.preferredTriggerHour;
    }
    /**
     * Gets the scheduleEndDate property value. The timestamp on which the report generation (subscription) ends. After this date, the schedule status becomes &lt;code&gt;INACTIVE&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt;Use this field, if available, to end the schedule in the future. This value must be later than &lt;strong&gt;scheduleStartDate&lt;/strong&gt; (if supplied). This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents UTC October 10, 2021 at 10:00 AM:&lt;br /&gt;&lt;code&gt;2021-10-10T10Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleEndDate() {
        return this.scheduleEndDate;
    }
    /**
     * Gets the scheduleName property value. The schedule name assigned by the user for the created schedule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleName() {
        return this.scheduleName;
    }
    /**
     * Gets the scheduleStartDate property value. The timestamp to start generating the report. After this timestamp, the schedule status becomes active until either the &lt;strong&gt;scheduleEndDate&lt;/strong&gt; occurs or the &lt;strong&gt;scheduleTemplateId&lt;/strong&gt; becomes inactive. &lt;br /&gt;&lt;br /&gt;Use this field, if available, to start the schedule in the future but before the &lt;strong&gt;scheduleEndDate&lt;/strong&gt; (if supplied). This field is available as specified by the template &lt;strong&gt;(scheduleTemplateId)&lt;/strong&gt;. The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents a schedule start date of UTC October 01, 2020 at 12:00 PM:&lt;br /&gt;&lt;code&gt; 2020-01-01T12Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleStartDate() {
        return this.scheduleStartDate;
    }
    /**
     * Gets the scheduleTemplateId property value. The unique identifier of the template to be used for this schedule. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/feed/resources/schedule/methods/getScheduleTemplates&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the schedule template ID. This method requires a schedule template ID that is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleTemplateId() {
        return this.scheduleTemplateId;
    }
    /**
     * Gets the schemaVersion property value. The schema version of a schedule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchemaVersion() {
        return this.schemaVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("feedType", this.getFeedType());
        writer.writeIntegerValue("preferredTriggerDayOfMonth", this.getPreferredTriggerDayOfMonth());
        writer.writeStringValue("preferredTriggerDayOfWeek", this.getPreferredTriggerDayOfWeek());
        writer.writeStringValue("preferredTriggerHour", this.getPreferredTriggerHour());
        writer.writeStringValue("scheduleEndDate", this.getScheduleEndDate());
        writer.writeStringValue("scheduleName", this.getScheduleName());
        writer.writeStringValue("scheduleStartDate", this.getScheduleStartDate());
        writer.writeStringValue("scheduleTemplateId", this.getScheduleTemplateId());
        writer.writeStringValue("schemaVersion", this.getSchemaVersion());
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
     * Sets the feedType property value. The name of the feed type for the created schedule.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/api-docs/sell/feed/resources/schedule/methods/getScheduleTemplates&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the feed type of a schedule template.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the feedType property.
     */
    public void setFeedType(@jakarta.annotation.Nullable final String value) {
        this.feedType = value;
    }
    /**
     * Sets the preferredTriggerDayOfMonth property value. The preferred day of the month to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for monthly schedules. The last day of the month is used for numbers larger than the actual number of days in the month. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Minimum: &lt;/b&gt;1&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt;31
     * @param value Value to set for the preferredTriggerDayOfMonth property.
     */
    public void setPreferredTriggerDayOfMonth(@jakarta.annotation.Nullable final Integer value) {
        this.preferredTriggerDayOfMonth = value;
    }
    /**
     * Sets the preferredTriggerDayOfWeek property value. The preferred day of the week to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for weekly schedules. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:DayOfWeekEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the preferredTriggerDayOfWeek property.
     */
    public void setPreferredTriggerDayOfWeek(@jakarta.annotation.Nullable final String value) {
        this.preferredTriggerDayOfWeek = value;
    }
    /**
     * Sets the preferredTriggerHour property value. The preferred two-digit hour of the day to trigger the schedule. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents 11:00 am UTC:&lt;code&gt; 11Z&lt;/code&gt;
     * @param value Value to set for the preferredTriggerHour property.
     */
    public void setPreferredTriggerHour(@jakarta.annotation.Nullable final String value) {
        this.preferredTriggerHour = value;
    }
    /**
     * Sets the scheduleEndDate property value. The timestamp on which the report generation (subscription) ends. After this date, the schedule status becomes &lt;code&gt;INACTIVE&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt;Use this field, if available, to end the schedule in the future. This value must be later than &lt;strong&gt;scheduleStartDate&lt;/strong&gt; (if supplied). This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents UTC October 10, 2021 at 10:00 AM:&lt;br /&gt;&lt;code&gt;2021-10-10T10Z&lt;/code&gt;
     * @param value Value to set for the scheduleEndDate property.
     */
    public void setScheduleEndDate(@jakarta.annotation.Nullable final String value) {
        this.scheduleEndDate = value;
    }
    /**
     * Sets the scheduleName property value. The schedule name assigned by the user for the created schedule.
     * @param value Value to set for the scheduleName property.
     */
    public void setScheduleName(@jakarta.annotation.Nullable final String value) {
        this.scheduleName = value;
    }
    /**
     * Sets the scheduleStartDate property value. The timestamp to start generating the report. After this timestamp, the schedule status becomes active until either the &lt;strong&gt;scheduleEndDate&lt;/strong&gt; occurs or the &lt;strong&gt;scheduleTemplateId&lt;/strong&gt; becomes inactive. &lt;br /&gt;&lt;br /&gt;Use this field, if available, to start the schedule in the future but before the &lt;strong&gt;scheduleEndDate&lt;/strong&gt; (if supplied). This field is available as specified by the template &lt;strong&gt;(scheduleTemplateId)&lt;/strong&gt;. The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents a schedule start date of UTC October 01, 2020 at 12:00 PM:&lt;br /&gt;&lt;code&gt; 2020-01-01T12Z&lt;/code&gt;
     * @param value Value to set for the scheduleStartDate property.
     */
    public void setScheduleStartDate(@jakarta.annotation.Nullable final String value) {
        this.scheduleStartDate = value;
    }
    /**
     * Sets the scheduleTemplateId property value. The unique identifier of the template to be used for this schedule. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/feed/resources/schedule/methods/getScheduleTemplates&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the schedule template ID. This method requires a schedule template ID that is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the scheduleTemplateId property.
     */
    public void setScheduleTemplateId(@jakarta.annotation.Nullable final String value) {
        this.scheduleTemplateId = value;
    }
    /**
     * Sets the schemaVersion property value. The schema version of a schedule.
     * @param value Value to set for the schemaVersion property.
     */
    public void setSchemaVersion(@jakarta.annotation.Nullable final String value) {
        this.schemaVersion = value;
    }
}
