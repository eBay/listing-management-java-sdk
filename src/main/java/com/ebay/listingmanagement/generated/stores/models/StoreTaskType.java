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
     * The unique identifier of an eBay Store async task.
     */
    private String id;
    /**
     * The value indicates the status description of the async task, especially in case of failures (reason of failure).It follows the Asynchronous Request Pattern in eBay REST Documentation. More detail please see : https://pages.github.corp.ebay.com/vat/ebay-rest-standards/docs/UniformInterface/ResourceManipulation/AsyncRequestPattern
     */
    private String message;
    /**
     * The enumeration value indicates the status of processing for the eBay Store Async Task.It follows the Asynchronous Request Pattern in eBay REST Documentation. More detail please see : 
     */
    private StoreTaskStatusEnum status;
    /**
     * The enumeration value indicates the task type.
     */
    private StoreTaskTypeEnum type;
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
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(StoreTaskStatusEnum::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(StoreTaskTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier of an eBay Store async task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the message property value. The value indicates the status description of the async task, especially in case of failures (reason of failure).It follows the Asynchronous Request Pattern in eBay REST Documentation. More detail please see : https://pages.github.corp.ebay.com/vat/ebay-rest-standards/docs/UniformInterface/ResourceManipulation/AsyncRequestPattern
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the status property value. The enumeration value indicates the status of processing for the eBay Store Async Task.It follows the Asynchronous Request Pattern in eBay REST Documentation. More detail please see : 
     * @return a {@link StoreTaskStatusEnum}
     */
    @jakarta.annotation.Nullable
    public StoreTaskStatusEnum getStatus() {
        return this.status;
    }
    /**
     * Gets the type property value. The enumeration value indicates the task type.
     * @return a {@link StoreTaskTypeEnum}
     */
    @jakarta.annotation.Nullable
    public StoreTaskTypeEnum getType() {
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
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the id property value. The unique identifier of an eBay Store async task.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the message property value. The value indicates the status description of the async task, especially in case of failures (reason of failure).It follows the Asynchronous Request Pattern in eBay REST Documentation. More detail please see : https://pages.github.corp.ebay.com/vat/ebay-rest-standards/docs/UniformInterface/ResourceManipulation/AsyncRequestPattern
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the status property value. The enumeration value indicates the status of processing for the eBay Store Async Task.It follows the Asynchronous Request Pattern in eBay REST Documentation. More detail please see : 
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final StoreTaskStatusEnum value) {
        this.status = value;
    }
    /**
     * Sets the type property value. The enumeration value indicates the task type.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final StoreTaskTypeEnum value) {
        this.type = value;
    }
}
