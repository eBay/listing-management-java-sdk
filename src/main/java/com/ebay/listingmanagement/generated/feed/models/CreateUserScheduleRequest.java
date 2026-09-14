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

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The type that defines the fields for the &lt;a href=&quot;/develop/api/sell/feed_api#sell-feed_api-schedule-createschedule&quot; target=&quot;_blank&quot;&gt;createSchedule&lt;/a&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateUserScheduleRequest extends UpdateUserScheduleRequest implements Parsable {
    /**
     * The name of the feed type for the created schedule.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/feed_api#sell-feed_api-schedule-getscheduletemplates&quot; target=&quot;_blank&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the feed type of a schedule template.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     */
    private String feedType;
    /**
     * The unique identifier of the template to be used for this schedule. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/feed_api#sell-feed_api-schedule-getscheduletemplates&quot; target=&quot;_blank&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the schedule template ID. This method requires a schedule template ID that is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     */
    private String scheduleTemplateId;
    /**
     * Instantiates a new {@link CreateUserScheduleRequest} and sets the default values.
     */
    public CreateUserScheduleRequest() {
        super();
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
     * Gets the feedType property value. The name of the feed type for the created schedule.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/feed_api#sell-feed_api-schedule-getscheduletemplates&quot; target=&quot;_blank&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the feed type of a schedule template.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("feedType", (n) -> { this.setFeedType(n.getStringValue()); });
        deserializerMap.put("scheduleTemplateId", (n) -> { this.setScheduleTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scheduleTemplateId property value. The unique identifier of the template to be used for this schedule. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/feed_api#sell-feed_api-schedule-getscheduletemplates&quot; target=&quot;_blank&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the schedule template ID. This method requires a schedule template ID that is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleTemplateId() {
        return this.scheduleTemplateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("feedType", this.getFeedType());
        writer.writeStringValue("scheduleTemplateId", this.getScheduleTemplateId());
    }
    /**
     * Sets the feedType property value. The name of the feed type for the created schedule.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/feed_api#sell-feed_api-schedule-getscheduletemplates&quot; target=&quot;_blank&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the feed type of a schedule template.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the feedType property.
     */
    public void setFeedType(@jakarta.annotation.Nullable final String value) {
        this.feedType = value;
    }
    /**
     * Sets the scheduleTemplateId property value. The unique identifier of the template to be used for this schedule. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/feed_api#sell-feed_api-schedule-getscheduletemplates&quot; target=&quot;_blank&quot;&gt;getScheduleTemplates&lt;/a&gt; method to retrieve the schedule template ID. This method requires a schedule template ID that is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Schedules are currently only available for &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the scheduleTemplateId property.
     */
    public void setScheduleTemplateId(@jakarta.annotation.Nullable final String value) {
        this.scheduleTemplateId = value;
    }
}
