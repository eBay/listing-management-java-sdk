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
     * The type that defines the fields for a date range.
     */
    private DateRange creationDateRange;
    /**
     * The type that defines the fields for a date range.
     */
    private DateRange modifiedDateRange;
    /**
     * The order status of the orders returned. If the filter is omitted from createOrderTask call, orders that are in both &lt;code&gt;ACTIVE &lt;/code&gt;and&lt;code&gt; COMPLETED&lt;/code&gt; states are returned. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:OrderStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String orderStatus;
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
     * Gets the creationDateRange property value. The type that defines the fields for a date range.
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
        deserializerMap.put("orderStatus", (n) -> { this.setOrderStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateRange property value. The type that defines the fields for a date range.
     * @return a {@link DateRange}
     */
    @jakarta.annotation.Nullable
    public DateRange getModifiedDateRange() {
        return this.modifiedDateRange;
    }
    /**
     * Gets the orderStatus property value. The order status of the orders returned. If the filter is omitted from createOrderTask call, orders that are in both &lt;code&gt;ACTIVE &lt;/code&gt;and&lt;code&gt; COMPLETED&lt;/code&gt; states are returned. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:OrderStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderStatus() {
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
        writer.writeStringValue("orderStatus", this.getOrderStatus());
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
     * Sets the creationDateRange property value. The type that defines the fields for a date range.
     * @param value Value to set for the creationDateRange property.
     */
    public void setCreationDateRange(@jakarta.annotation.Nullable final DateRange value) {
        this.creationDateRange = value;
    }
    /**
     * Sets the modifiedDateRange property value. The type that defines the fields for a date range.
     * @param value Value to set for the modifiedDateRange property.
     */
    public void setModifiedDateRange(@jakarta.annotation.Nullable final DateRange value) {
        this.modifiedDateRange = value;
    }
    /**
     * Sets the orderStatus property value. The order status of the orders returned. If the filter is omitted from createOrderTask call, orders that are in both &lt;code&gt;ACTIVE &lt;/code&gt;and&lt;code&gt; COMPLETED&lt;/code&gt; states are returned. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:OrderStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the orderStatus property.
     */
    public void setOrderStatus(@jakarta.annotation.Nullable final String value) {
        this.orderStatus = value;
    }
}
