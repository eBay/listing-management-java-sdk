package com.ebay.listingmanagement.generated.stores.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to provide details about the status of the Store Task.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StoreTaskType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of an eBay Store task.
     */
    private String id;
    /**
     * This field provides a textual description on the status of the task, and could help user troubleshoot any issues if there is an issue with eBay creating the task.
     */
    private String message;
    /**
     * The enumeration value here indicates the processing status of the task. See the &lt;b&gt;StoreTaskStatusEnum&lt;/b&gt; type for more information on supported status values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/stores/types/api:StoreTaskStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String status;
    /**
     * The enumeration value indicates the task type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/stores/types/api:StoreTaskTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String type;
    /**
     * Instantiates a new {@link StoreTaskType} and sets the default values.
     */
    public StoreTaskType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StoreTaskType}
     */
    @jakarta.annotation.Nonnull
    public static StoreTaskType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StoreTaskType();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier of an eBay Store task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the message property value. This field provides a textual description on the status of the task, and could help user troubleshoot any issues if there is an issue with eBay creating the task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the status property value. The enumeration value here indicates the processing status of the task. See the &lt;b&gt;StoreTaskStatusEnum&lt;/b&gt; type for more information on supported status values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/stores/types/api:StoreTaskStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the type property value. The enumeration value indicates the task type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/stores/types/api:StoreTaskTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("type", this.getType());
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
     * Sets the id property value. The unique identifier of an eBay Store task.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the message property value. This field provides a textual description on the status of the task, and could help user troubleshoot any issues if there is an issue with eBay creating the task.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the status property value. The enumeration value here indicates the processing status of the task. See the &lt;b&gt;StoreTaskStatusEnum&lt;/b&gt; type for more information on supported status values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/stores/types/api:StoreTaskStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the type property value. The enumeration value indicates the task type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/stores/types/api:StoreTaskTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
