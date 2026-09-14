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
 * The type that defines the fields for a paginated result set of user schedules. The response consists of 0 or more sequenced &lt;em&gt; pages&lt;/em&gt; where each page has 0 or more items.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserScheduleCollection implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The path to the call URI that produced the current page of results.
     */
    private String href;
    /**
     * The value of the &lt;strong&gt;limit&lt;/strong&gt; parameter submitted in the request, which is the maximum number of schedules to return per page, from the result set. A result set is the complete set of schedules returned by the method. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though this parameter is not required to be submitted in the request, the parameter defaults to 10 if omitted.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If this is the last or only page of the result set, the page may contain fewer tasks than the &lt;strong&gt;limit&lt;/strong&gt; value. To determine the number of pages in a result set, divide the total value (total number of tasks matching input criteria) by this limit value, and then round up to the next integer. For example, if the &lt;strong&gt;total&lt;/strong&gt; value was &lt;code&gt;120&lt;/code&gt; (120 total tasks) and the &lt;strong&gt;limit&lt;/strong&gt; value was &lt;code&gt;50&lt;/code&gt; (show 50 tasks per page), the total number of pages in the result set is three, so the seller would have to make three separate &lt;strong&gt;getSchedules&lt;/strong&gt; calls to view all tasks matching the input criteria.&lt;/span&gt;&lt;/p&gt;&lt;/span&gt;&lt;/p&gt;
     */
    private Integer limit;
    /**
     * The path to the call URI for the next page of results. This value is returned if there is an additional page of results to return from the result set.
     */
    private String next;
    /**
     * The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the &lt;strong&gt;offset&lt;/strong&gt; query parameter. &lt;p class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The items in a paginated result set use a zero-based list where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;
     */
    private Integer offset;
    /**
     * The path to the call URI for the previous page of results. This is returned if there is a previous page of results from the result set.
     */
    private String prev;
    /**
     * An array of the schedules on this page. An empty array is returned if the filter criteria excludes all tasks.
     */
    private java.util.List<UserScheduleResponse> schedules;
    /**
     * The total number of schedules that match the input criteria.
     */
    private Integer total;
    /**
     * Instantiates a new {@link UserScheduleCollection} and sets the default values.
     */
    public UserScheduleCollection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserScheduleCollection}
     */
    @jakarta.annotation.Nonnull
    public static UserScheduleCollection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserScheduleCollection();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("prev", (n) -> { this.setPrev(n.getStringValue()); });
        deserializerMap.put("schedules", (n) -> { this.setSchedules(n.getCollectionOfObjectValues(UserScheduleResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The path to the call URI that produced the current page of results.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the limit property value. The value of the &lt;strong&gt;limit&lt;/strong&gt; parameter submitted in the request, which is the maximum number of schedules to return per page, from the result set. A result set is the complete set of schedules returned by the method. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though this parameter is not required to be submitted in the request, the parameter defaults to 10 if omitted.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If this is the last or only page of the result set, the page may contain fewer tasks than the &lt;strong&gt;limit&lt;/strong&gt; value. To determine the number of pages in a result set, divide the total value (total number of tasks matching input criteria) by this limit value, and then round up to the next integer. For example, if the &lt;strong&gt;total&lt;/strong&gt; value was &lt;code&gt;120&lt;/code&gt; (120 total tasks) and the &lt;strong&gt;limit&lt;/strong&gt; value was &lt;code&gt;50&lt;/code&gt; (show 50 tasks per page), the total number of pages in the result set is three, so the seller would have to make three separate &lt;strong&gt;getSchedules&lt;/strong&gt; calls to view all tasks matching the input criteria.&lt;/span&gt;&lt;/p&gt;&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. The path to the call URI for the next page of results. This value is returned if there is an additional page of results to return from the result set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the offset property value. The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the &lt;strong&gt;offset&lt;/strong&gt; query parameter. &lt;p class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The items in a paginated result set use a zero-based list where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the prev property value. The path to the call URI for the previous page of results. This is returned if there is a previous page of results from the result set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrev() {
        return this.prev;
    }
    /**
     * Gets the schedules property value. An array of the schedules on this page. An empty array is returned if the filter criteria excludes all tasks.
     * @return a {@link java.util.List<UserScheduleResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserScheduleResponse> getSchedules() {
        return this.schedules;
    }
    /**
     * Gets the total property value. The total number of schedules that match the input criteria.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("href", this.getHref());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("next", this.getNext());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("prev", this.getPrev());
        writer.writeCollectionOfObjectValues("schedules", this.getSchedules());
        writer.writeIntegerValue("total", this.getTotal());
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
     * Sets the href property value. The path to the call URI that produced the current page of results.
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the limit property value. The value of the &lt;strong&gt;limit&lt;/strong&gt; parameter submitted in the request, which is the maximum number of schedules to return per page, from the result set. A result set is the complete set of schedules returned by the method. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though this parameter is not required to be submitted in the request, the parameter defaults to 10 if omitted.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If this is the last or only page of the result set, the page may contain fewer tasks than the &lt;strong&gt;limit&lt;/strong&gt; value. To determine the number of pages in a result set, divide the total value (total number of tasks matching input criteria) by this limit value, and then round up to the next integer. For example, if the &lt;strong&gt;total&lt;/strong&gt; value was &lt;code&gt;120&lt;/code&gt; (120 total tasks) and the &lt;strong&gt;limit&lt;/strong&gt; value was &lt;code&gt;50&lt;/code&gt; (show 50 tasks per page), the total number of pages in the result set is three, so the seller would have to make three separate &lt;strong&gt;getSchedules&lt;/strong&gt; calls to view all tasks matching the input criteria.&lt;/span&gt;&lt;/p&gt;&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. The path to the call URI for the next page of results. This value is returned if there is an additional page of results to return from the result set.
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the offset property value. The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the &lt;strong&gt;offset&lt;/strong&gt; query parameter. &lt;p class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The items in a paginated result set use a zero-based list where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the prev property value. The path to the call URI for the previous page of results. This is returned if there is a previous page of results from the result set.
     * @param value Value to set for the prev property.
     */
    public void setPrev(@jakarta.annotation.Nullable final String value) {
        this.prev = value;
    }
    /**
     * Sets the schedules property value. An array of the schedules on this page. An empty array is returned if the filter criteria excludes all tasks.
     * @param value Value to set for the schedules property.
     */
    public void setSchedules(@jakarta.annotation.Nullable final java.util.List<UserScheduleResponse> value) {
        this.schedules = value;
    }
    /**
     * Sets the total property value. The total number of schedules that match the input criteria.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
