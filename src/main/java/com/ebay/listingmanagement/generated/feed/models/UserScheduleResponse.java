package com.ebay.listingmanagement.generated.feed.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The type that defines the fields for a paginated result set of available schedules. The response consists of 0 or more sequenced &lt;em&gt; pages&lt;/em&gt; where each page has 0 or more items.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserScheduleResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The creation date of the schedule in hours based on the 24-hour Coordinated Universal Time (UTC) clock.
     */
    private String creationDate;
    /**
     * The &lt;strong&gt;feedType&lt;/strong&gt; associated with the schedule.
     */
    private String feedType;
    /**
     * The date the schedule was last modified.
     */
    private String lastModifiedDate;
    /**
     * The preferred day of the month to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for monthly schedules. The last day of the month is used for numbers larger than the number of days in the month.
     */
    private Integer preferredTriggerDayOfMonth;
    /**
     * The preferred day of the week to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for weekly schedules. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:DayOfWeekEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String preferredTriggerDayOfWeek;
    /**
     * The preferred two-digit hour of the day to trigger the schedule. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents 11:00 am UTC:&lt;br /&gt;&lt;br /&gt;&lt;code&gt;11Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;
     */
    private String preferredTriggerHour;
    /**
     * The timestamp on which the report generation (subscription) ends. After this date, the schedule status becomes &lt;code&gt;INACTIVE&lt;/code&gt;.
     */
    private String scheduleEndDate;
    /**
     * The ID of the schedule. This ID is generated when the schedule was created by the &lt;strong&gt;createSchedule&lt;/strong&gt; method.
     */
    private String scheduleId;
    /**
     * The schedule name assigned by the user for the created schedule. Users assign this name for their reference.
     */
    private String scheduleName;
    /**
     * The timestamp that indicates the start of the report generation.
     */
    private String scheduleStartDate;
    /**
     * The ID of the template used to create this schedule.
     */
    private String scheduleTemplateId;
    /**
     * The schema version of the feedType for the schedule.
     */
    private String schemaVersion;
    /**
     * The enumeration value that indicates the state of the schedule. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String status;
    /**
     * The reason the schedule is inactive. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String statusReason;
    /**
     * Instantiates a new {@link UserScheduleResponse} and sets the default values.
     */
    public UserScheduleResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserScheduleResponse}
     */
    @jakarta.annotation.Nonnull
    public static UserScheduleResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserScheduleResponse();
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
     * Gets the creationDate property value. The creation date of the schedule in hours based on the 24-hour Coordinated Universal Time (UTC) clock.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Gets the feedType property value. The &lt;strong&gt;feedType&lt;/strong&gt; associated with the schedule.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("feedType", (n) -> { this.setFeedType(n.getStringValue()); });
        deserializerMap.put("lastModifiedDate", (n) -> { this.setLastModifiedDate(n.getStringValue()); });
        deserializerMap.put("preferredTriggerDayOfMonth", (n) -> { this.setPreferredTriggerDayOfMonth(n.getIntegerValue()); });
        deserializerMap.put("preferredTriggerDayOfWeek", (n) -> { this.setPreferredTriggerDayOfWeek(n.getStringValue()); });
        deserializerMap.put("preferredTriggerHour", (n) -> { this.setPreferredTriggerHour(n.getStringValue()); });
        deserializerMap.put("scheduleEndDate", (n) -> { this.setScheduleEndDate(n.getStringValue()); });
        deserializerMap.put("scheduleId", (n) -> { this.setScheduleId(n.getStringValue()); });
        deserializerMap.put("scheduleName", (n) -> { this.setScheduleName(n.getStringValue()); });
        deserializerMap.put("scheduleStartDate", (n) -> { this.setScheduleStartDate(n.getStringValue()); });
        deserializerMap.put("scheduleTemplateId", (n) -> { this.setScheduleTemplateId(n.getStringValue()); });
        deserializerMap.put("schemaVersion", (n) -> { this.setSchemaVersion(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("statusReason", (n) -> { this.setStatusReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDate property value. The date the schedule was last modified.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Gets the preferredTriggerDayOfMonth property value. The preferred day of the month to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for monthly schedules. The last day of the month is used for numbers larger than the number of days in the month.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPreferredTriggerDayOfMonth() {
        return this.preferredTriggerDayOfMonth;
    }
    /**
     * Gets the preferredTriggerDayOfWeek property value. The preferred day of the week to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for weekly schedules. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:DayOfWeekEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredTriggerDayOfWeek() {
        return this.preferredTriggerDayOfWeek;
    }
    /**
     * Gets the preferredTriggerHour property value. The preferred two-digit hour of the day to trigger the schedule. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents 11:00 am UTC:&lt;br /&gt;&lt;br /&gt;&lt;code&gt;11Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredTriggerHour() {
        return this.preferredTriggerHour;
    }
    /**
     * Gets the scheduleEndDate property value. The timestamp on which the report generation (subscription) ends. After this date, the schedule status becomes &lt;code&gt;INACTIVE&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleEndDate() {
        return this.scheduleEndDate;
    }
    /**
     * Gets the scheduleId property value. The ID of the schedule. This ID is generated when the schedule was created by the &lt;strong&gt;createSchedule&lt;/strong&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleId() {
        return this.scheduleId;
    }
    /**
     * Gets the scheduleName property value. The schedule name assigned by the user for the created schedule. Users assign this name for their reference.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleName() {
        return this.scheduleName;
    }
    /**
     * Gets the scheduleStartDate property value. The timestamp that indicates the start of the report generation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleStartDate() {
        return this.scheduleStartDate;
    }
    /**
     * Gets the scheduleTemplateId property value. The ID of the template used to create this schedule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleTemplateId() {
        return this.scheduleTemplateId;
    }
    /**
     * Gets the schemaVersion property value. The schema version of the feedType for the schedule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchemaVersion() {
        return this.schemaVersion;
    }
    /**
     * Gets the status property value. The enumeration value that indicates the state of the schedule. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the statusReason property value. The reason the schedule is inactive. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusReason() {
        return this.statusReason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("creationDate", this.getCreationDate());
        writer.writeStringValue("feedType", this.getFeedType());
        writer.writeStringValue("lastModifiedDate", this.getLastModifiedDate());
        writer.writeIntegerValue("preferredTriggerDayOfMonth", this.getPreferredTriggerDayOfMonth());
        writer.writeStringValue("preferredTriggerDayOfWeek", this.getPreferredTriggerDayOfWeek());
        writer.writeStringValue("preferredTriggerHour", this.getPreferredTriggerHour());
        writer.writeStringValue("scheduleEndDate", this.getScheduleEndDate());
        writer.writeStringValue("scheduleId", this.getScheduleId());
        writer.writeStringValue("scheduleName", this.getScheduleName());
        writer.writeStringValue("scheduleStartDate", this.getScheduleStartDate());
        writer.writeStringValue("scheduleTemplateId", this.getScheduleTemplateId());
        writer.writeStringValue("schemaVersion", this.getSchemaVersion());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("statusReason", this.getStatusReason());
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
     * Sets the creationDate property value. The creation date of the schedule in hours based on the 24-hour Coordinated Universal Time (UTC) clock.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the feedType property value. The &lt;strong&gt;feedType&lt;/strong&gt; associated with the schedule.
     * @param value Value to set for the feedType property.
     */
    public void setFeedType(@jakarta.annotation.Nullable final String value) {
        this.feedType = value;
    }
    /**
     * Sets the lastModifiedDate property value. The date the schedule was last modified.
     * @param value Value to set for the lastModifiedDate property.
     */
    public void setLastModifiedDate(@jakarta.annotation.Nullable final String value) {
        this.lastModifiedDate = value;
    }
    /**
     * Sets the preferredTriggerDayOfMonth property value. The preferred day of the month to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for monthly schedules. The last day of the month is used for numbers larger than the number of days in the month.
     * @param value Value to set for the preferredTriggerDayOfMonth property.
     */
    public void setPreferredTriggerDayOfMonth(@jakarta.annotation.Nullable final Integer value) {
        this.preferredTriggerDayOfMonth = value;
    }
    /**
     * Sets the preferredTriggerDayOfWeek property value. The preferred day of the week to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for weekly schedules. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:DayOfWeekEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the preferredTriggerDayOfWeek property.
     */
    public void setPreferredTriggerDayOfWeek(@jakarta.annotation.Nullable final String value) {
        this.preferredTriggerDayOfWeek = value;
    }
    /**
     * Sets the preferredTriggerHour property value. The preferred two-digit hour of the day to trigger the schedule. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents 11:00 am UTC:&lt;br /&gt;&lt;br /&gt;&lt;code&gt;11Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;
     * @param value Value to set for the preferredTriggerHour property.
     */
    public void setPreferredTriggerHour(@jakarta.annotation.Nullable final String value) {
        this.preferredTriggerHour = value;
    }
    /**
     * Sets the scheduleEndDate property value. The timestamp on which the report generation (subscription) ends. After this date, the schedule status becomes &lt;code&gt;INACTIVE&lt;/code&gt;.
     * @param value Value to set for the scheduleEndDate property.
     */
    public void setScheduleEndDate(@jakarta.annotation.Nullable final String value) {
        this.scheduleEndDate = value;
    }
    /**
     * Sets the scheduleId property value. The ID of the schedule. This ID is generated when the schedule was created by the &lt;strong&gt;createSchedule&lt;/strong&gt; method.
     * @param value Value to set for the scheduleId property.
     */
    public void setScheduleId(@jakarta.annotation.Nullable final String value) {
        this.scheduleId = value;
    }
    /**
     * Sets the scheduleName property value. The schedule name assigned by the user for the created schedule. Users assign this name for their reference.
     * @param value Value to set for the scheduleName property.
     */
    public void setScheduleName(@jakarta.annotation.Nullable final String value) {
        this.scheduleName = value;
    }
    /**
     * Sets the scheduleStartDate property value. The timestamp that indicates the start of the report generation.
     * @param value Value to set for the scheduleStartDate property.
     */
    public void setScheduleStartDate(@jakarta.annotation.Nullable final String value) {
        this.scheduleStartDate = value;
    }
    /**
     * Sets the scheduleTemplateId property value. The ID of the template used to create this schedule.
     * @param value Value to set for the scheduleTemplateId property.
     */
    public void setScheduleTemplateId(@jakarta.annotation.Nullable final String value) {
        this.scheduleTemplateId = value;
    }
    /**
     * Sets the schemaVersion property value. The schema version of the feedType for the schedule.
     * @param value Value to set for the schemaVersion property.
     */
    public void setSchemaVersion(@jakarta.annotation.Nullable final String value) {
        this.schemaVersion = value;
    }
    /**
     * Sets the status property value. The enumeration value that indicates the state of the schedule. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the statusReason property value. The reason the schedule is inactive. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the statusReason property.
     */
    public void setStatusReason(@jakarta.annotation.Nullable final String value) {
        this.statusReason = value;
    }
}
