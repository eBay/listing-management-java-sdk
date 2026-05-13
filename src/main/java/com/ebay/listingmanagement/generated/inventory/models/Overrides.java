package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the override dates for cut-off times. This allows sellers to set special hours for their inventory location and specify different cut-off times on these days.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Overrides implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is used to override the cut-off time(s) specified in the &lt;b&gt;weeklySchedule&lt;/b&gt; container. If an order is placed after this time in the specified date or date range, it will be handled by the seller on the following day.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;00:00&lt;/code&gt;
     */
    private String cutOffTime;
    /**
     * The end date of the cut-off time override in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; format, which is based on the 24-hour Coordinated Universal Time (UTC) clock.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If the cut-off time override is only for a single day, input the same date in the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; fields.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2024-08-06&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The time zone for this date is specified from the &lt;b&gt;timeZoneId&lt;/b&gt; field. If this field is not used, the time zone will be derived from the provided address.&lt;/span&gt;
     */
    private String endDate;
    /**
     * The start date of the cut-off time override in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; format, which is based on the 24-hour Coordinated Universal Time (UTC) clock.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If the cut-off time override is only for a single day, input the same date in the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; fields.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2024-08-04&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The time zone for this date is specified from the &lt;b&gt;timeZoneId&lt;/b&gt; field. If this field is not used, the time zone will be derived from the provided address.&lt;/span&gt;
     */
    private String startDate;
    /**
     * Instantiates a new {@link Overrides} and sets the default values.
     */
    public Overrides() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Overrides}
     */
    @jakarta.annotation.Nonnull
    public static Overrides createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Overrides();
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
     * Gets the cutOffTime property value. This field is used to override the cut-off time(s) specified in the &lt;b&gt;weeklySchedule&lt;/b&gt; container. If an order is placed after this time in the specified date or date range, it will be handled by the seller on the following day.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;00:00&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCutOffTime() {
        return this.cutOffTime;
    }
    /**
     * Gets the endDate property value. The end date of the cut-off time override in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; format, which is based on the 24-hour Coordinated Universal Time (UTC) clock.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If the cut-off time override is only for a single day, input the same date in the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; fields.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2024-08-06&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The time zone for this date is specified from the &lt;b&gt;timeZoneId&lt;/b&gt; field. If this field is not used, the time zone will be derived from the provided address.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cutOffTime", (n) -> { this.setCutOffTime(n.getStringValue()); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getStringValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the startDate property value. The start date of the cut-off time override in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; format, which is based on the 24-hour Coordinated Universal Time (UTC) clock.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If the cut-off time override is only for a single day, input the same date in the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; fields.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2024-08-04&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The time zone for this date is specified from the &lt;b&gt;timeZoneId&lt;/b&gt; field. If this field is not used, the time zone will be derived from the provided address.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStartDate() {
        return this.startDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cutOffTime", this.getCutOffTime());
        writer.writeStringValue("endDate", this.getEndDate());
        writer.writeStringValue("startDate", this.getStartDate());
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
     * Sets the cutOffTime property value. This field is used to override the cut-off time(s) specified in the &lt;b&gt;weeklySchedule&lt;/b&gt; container. If an order is placed after this time in the specified date or date range, it will be handled by the seller on the following day.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;00:00&lt;/code&gt;
     * @param value Value to set for the cutOffTime property.
     */
    public void setCutOffTime(@jakarta.annotation.Nullable final String value) {
        this.cutOffTime = value;
    }
    /**
     * Sets the endDate property value. The end date of the cut-off time override in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; format, which is based on the 24-hour Coordinated Universal Time (UTC) clock.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If the cut-off time override is only for a single day, input the same date in the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; fields.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2024-08-06&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The time zone for this date is specified from the &lt;b&gt;timeZoneId&lt;/b&gt; field. If this field is not used, the time zone will be derived from the provided address.&lt;/span&gt;
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final String value) {
        this.endDate = value;
    }
    /**
     * Sets the startDate property value. The start date of the cut-off time override in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; format, which is based on the 24-hour Coordinated Universal Time (UTC) clock.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If the cut-off time override is only for a single day, input the same date in the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; fields.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2024-08-04&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The time zone for this date is specified from the &lt;b&gt;timeZoneId&lt;/b&gt; field. If this field is not used, the time zone will be derived from the provided address.&lt;/span&gt;
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final String value) {
        this.startDate = value;
    }
}
