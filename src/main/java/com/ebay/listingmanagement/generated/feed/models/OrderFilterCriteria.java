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
 * The type that defines the fields for the order filters.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderFilterCriteria implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The creation date range of the orders you want returned. Set the date range so it contains less than 10 days (maximum). If you do not specify a &lt;strong&gt;DateRange&lt;/strong&gt;, results from the last 10 days will be returned by default.
     */
    private DateRange creationDateRange;
    /**
     * The modified date range of the orders you want returned. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This container is for future use. At this time, the &lt;strong&gt;createOrderTask&lt;/strong&gt; method only supports order creation date filters and not modified order date filters.&lt;/span&gt;&lt;/p&gt;
     */
    private DateRange modifiedDateRange;
    /**
     * The order status of the orders returned. If the filter is omitted from the &lt;strong&gt;createOrderTask&lt;/strong&gt; call, orders that are in both &lt;code&gt;ACTIVE&lt;/code&gt; and &lt;code&gt;COMPLETED&lt;/code&gt; states are returned.
     */
    private OrderStatusEnum orderStatus;
    /**
     * Instantiates a new {@link OrderFilterCriteria} and sets the default values.
     */
    public OrderFilterCriteria() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderFilterCriteria}
     */
    @jakarta.annotation.Nonnull
    public static OrderFilterCriteria createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderFilterCriteria();
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
     * Gets the creationDateRange property value. The creation date range of the orders you want returned. Set the date range so it contains less than 10 days (maximum). If you do not specify a &lt;strong&gt;DateRange&lt;/strong&gt;, results from the last 10 days will be returned by default.
     * @return a {@link DateRange}
     */
    @jakarta.annotation.Nullable
    public DateRange getCreationDateRange() {
        return this.creationDateRange;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("creationDateRange", (n) -> { this.setCreationDateRange(n.getObjectValue(DateRange::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedDateRange", (n) -> { this.setModifiedDateRange(n.getObjectValue(DateRange::createFromDiscriminatorValue)); });
        deserializerMap.put("orderStatus", (n) -> { this.setOrderStatus(n.getEnumValue(OrderStatusEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateRange property value. The modified date range of the orders you want returned. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This container is for future use. At this time, the &lt;strong&gt;createOrderTask&lt;/strong&gt; method only supports order creation date filters and not modified order date filters.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link DateRange}
     */
    @jakarta.annotation.Nullable
    public DateRange getModifiedDateRange() {
        return this.modifiedDateRange;
    }
    /**
     * Gets the orderStatus property value. The order status of the orders returned. If the filter is omitted from the &lt;strong&gt;createOrderTask&lt;/strong&gt; call, orders that are in both &lt;code&gt;ACTIVE&lt;/code&gt; and &lt;code&gt;COMPLETED&lt;/code&gt; states are returned.
     * @return a {@link OrderStatusEnum}
     */
    @jakarta.annotation.Nullable
    public OrderStatusEnum getOrderStatus() {
        return this.orderStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("creationDateRange", this.getCreationDateRange());
        writer.writeObjectValue("modifiedDateRange", this.getModifiedDateRange());
        writer.writeEnumValue("orderStatus", this.getOrderStatus());
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
     * Sets the creationDateRange property value. The creation date range of the orders you want returned. Set the date range so it contains less than 10 days (maximum). If you do not specify a &lt;strong&gt;DateRange&lt;/strong&gt;, results from the last 10 days will be returned by default.
     * @param value Value to set for the creationDateRange property.
     */
    public void setCreationDateRange(@jakarta.annotation.Nullable final DateRange value) {
        this.creationDateRange = value;
    }
    /**
     * Sets the modifiedDateRange property value. The modified date range of the orders you want returned. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This container is for future use. At this time, the &lt;strong&gt;createOrderTask&lt;/strong&gt; method only supports order creation date filters and not modified order date filters.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the modifiedDateRange property.
     */
    public void setModifiedDateRange(@jakarta.annotation.Nullable final DateRange value) {
        this.modifiedDateRange = value;
    }
    /**
     * Sets the orderStatus property value. The order status of the orders returned. If the filter is omitted from the &lt;strong&gt;createOrderTask&lt;/strong&gt; call, orders that are in both &lt;code&gt;ACTIVE&lt;/code&gt; and &lt;code&gt;COMPLETED&lt;/code&gt; states are returned.
     * @param value Value to set for the orderStatus property.
     */
    public void setOrderStatus(@jakarta.annotation.Nullable final OrderStatusEnum value) {
        this.orderStatus = value;
    }
}
