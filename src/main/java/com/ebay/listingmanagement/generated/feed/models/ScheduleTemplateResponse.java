package com.ebay.listingmanagement.generated.feed.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The type that defines the fields for a paginated result set of available schedule templates. The response consists of 0 or more sequenced &lt;em&gt; pages&lt;/em&gt; where each page has 0 or more items.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScheduleTemplateResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The feed type of the schedule template. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; When calling &lt;strong&gt;createSchedule&lt;/strong&gt; and &lt;strong&gt;updateSchedule&lt;/strong&gt; methods you must match the feed type specified by the schedule template (this feedType).&lt;/span&gt;&lt;/p&gt;
     */
    private String feedType;
    /**
     * This field specifies how often the schedule is generated. If set to &lt;code&gt;HALF_HOUR&lt;/code&gt; or &lt;code&gt;ONE_HOUR&lt;/code&gt;, you cannot set a &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; using &lt;strong&gt;createSchedule&lt;/strong&gt; or &lt;strong&gt;updateSchedule&lt;/strong&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:FrequencyEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String frequency;
    /**
     * The template name provided by the template.
     */
    private String name;
    /**
     * The ID of the template. Use this ID to create a schedule based on the properties of this schedule template.
     */
    private String scheduleTemplateId;
    /**
     * The present status of the template. You cannot create or modify a schedule using a template with an &lt;code&gt;INACTIVE&lt;/code&gt; status.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String status;
    /**
     * An array of the configuration supported by this template.
     */
    private java.util.List<SupportedConfiguration> supportedConfigurations;
    /**
     * Instantiates a new {@link ScheduleTemplateResponse} and sets the default values.
     */
    public ScheduleTemplateResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ScheduleTemplateResponse}
     */
    @jakarta.annotation.Nonnull
    public static ScheduleTemplateResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScheduleTemplateResponse();
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
     * Gets the feedType property value. The feed type of the schedule template. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; When calling &lt;strong&gt;createSchedule&lt;/strong&gt; and &lt;strong&gt;updateSchedule&lt;/strong&gt; methods you must match the feed type specified by the schedule template (this feedType).&lt;/span&gt;&lt;/p&gt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("feedType", (n) -> { this.setFeedType(n.getStringValue()); });
        deserializerMap.put("frequency", (n) -> { this.setFrequency(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("scheduleTemplateId", (n) -> { this.setScheduleTemplateId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("supportedConfigurations", (n) -> { this.setSupportedConfigurations(n.getCollectionOfObjectValues(SupportedConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the frequency property value. This field specifies how often the schedule is generated. If set to &lt;code&gt;HALF_HOUR&lt;/code&gt; or &lt;code&gt;ONE_HOUR&lt;/code&gt;, you cannot set a &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; using &lt;strong&gt;createSchedule&lt;/strong&gt; or &lt;strong&gt;updateSchedule&lt;/strong&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:FrequencyEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFrequency() {
        return this.frequency;
    }
    /**
     * Gets the name property value. The template name provided by the template.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the scheduleTemplateId property value. The ID of the template. Use this ID to create a schedule based on the properties of this schedule template.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleTemplateId() {
        return this.scheduleTemplateId;
    }
    /**
     * Gets the status property value. The present status of the template. You cannot create or modify a schedule using a template with an &lt;code&gt;INACTIVE&lt;/code&gt; status.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the supportedConfigurations property value. An array of the configuration supported by this template.
     * @return a {@link java.util.List<SupportedConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SupportedConfiguration> getSupportedConfigurations() {
        return this.supportedConfigurations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("feedType", this.getFeedType());
        writer.writeStringValue("frequency", this.getFrequency());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("scheduleTemplateId", this.getScheduleTemplateId());
        writer.writeStringValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("supportedConfigurations", this.getSupportedConfigurations());
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
     * Sets the feedType property value. The feed type of the schedule template. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; When calling &lt;strong&gt;createSchedule&lt;/strong&gt; and &lt;strong&gt;updateSchedule&lt;/strong&gt; methods you must match the feed type specified by the schedule template (this feedType).&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the feedType property.
     */
    public void setFeedType(@jakarta.annotation.Nullable final String value) {
        this.feedType = value;
    }
    /**
     * Sets the frequency property value. This field specifies how often the schedule is generated. If set to &lt;code&gt;HALF_HOUR&lt;/code&gt; or &lt;code&gt;ONE_HOUR&lt;/code&gt;, you cannot set a &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; using &lt;strong&gt;createSchedule&lt;/strong&gt; or &lt;strong&gt;updateSchedule&lt;/strong&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:FrequencyEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the frequency property.
     */
    public void setFrequency(@jakarta.annotation.Nullable final String value) {
        this.frequency = value;
    }
    /**
     * Sets the name property value. The template name provided by the template.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the scheduleTemplateId property value. The ID of the template. Use this ID to create a schedule based on the properties of this schedule template.
     * @param value Value to set for the scheduleTemplateId property.
     */
    public void setScheduleTemplateId(@jakarta.annotation.Nullable final String value) {
        this.scheduleTemplateId = value;
    }
    /**
     * Sets the status property value. The present status of the template. You cannot create or modify a schedule using a template with an &lt;code&gt;INACTIVE&lt;/code&gt; status.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the supportedConfigurations property value. An array of the configuration supported by this template.
     * @param value Value to set for the supportedConfigurations property.
     */
    public void setSupportedConfigurations(@jakarta.annotation.Nullable final java.util.List<SupportedConfiguration> value) {
        this.supportedConfigurations = value;
    }
}
