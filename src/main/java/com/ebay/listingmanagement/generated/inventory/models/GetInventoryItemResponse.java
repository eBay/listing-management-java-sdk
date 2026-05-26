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

package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the response of the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method to give the status of each inventory item record that the user tried to retrieve.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetInventoryItemResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container will be returned if there were one or more errors associated with retrieving the inventory item record.
     */
    private java.util.List<Error> errors;
    /**
     * This type is used to provide details about each retrieved inventory item record.
     */
    private InventoryItemWithSkuLocaleGroupKeys inventoryItem;
    /**
     * The seller-defined Stock-Keeping Unit (SKU) of the inventory item. The seller should have a unique SKU value for every product that they sell.
     */
    private String sku;
    /**
     * The HTTP status code returned in this field indicates the success or failure of retrieving the inventory item record for the inventory item specified in the &lt;strong&gt;sku&lt;/strong&gt; field. See the &lt;strong&gt;HTTP status codes&lt;/strong&gt; table to see which each status code indicates.
     */
    private Integer statusCode;
    /**
     * This container will be returned if there were one or more warnings associated with retrieving the inventory item record.
     */
    private java.util.List<Error> warnings;
    /**
     * Instantiates a new {@link GetInventoryItemResponse} and sets the default values.
     */
    public GetInventoryItemResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetInventoryItemResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetInventoryItemResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetInventoryItemResponse();
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
     * Gets the errors property value. This container will be returned if there were one or more errors associated with retrieving the inventory item record.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        deserializerMap.put("inventoryItem", (n) -> { this.setInventoryItem(n.getObjectValue(InventoryItemWithSkuLocaleGroupKeys::createFromDiscriminatorValue)); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inventoryItem property value. This type is used to provide details about each retrieved inventory item record.
     * @return a {@link InventoryItemWithSkuLocaleGroupKeys}
     */
    @jakarta.annotation.Nullable
    public InventoryItemWithSkuLocaleGroupKeys getInventoryItem() {
        return this.inventoryItem;
    }
    /**
     * Gets the sku property value. The seller-defined Stock-Keeping Unit (SKU) of the inventory item. The seller should have a unique SKU value for every product that they sell.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSku() {
        return this.sku;
    }
    /**
     * Gets the statusCode property value. The HTTP status code returned in this field indicates the success or failure of retrieving the inventory item record for the inventory item specified in the &lt;strong&gt;sku&lt;/strong&gt; field. See the &lt;strong&gt;HTTP status codes&lt;/strong&gt; table to see which each status code indicates.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }
    /**
     * Gets the warnings property value. This container will be returned if there were one or more warnings associated with retrieving the inventory item record.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeObjectValue("inventoryItem", this.getInventoryItem());
        writer.writeStringValue("sku", this.getSku());
        writer.writeIntegerValue("statusCode", this.getStatusCode());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the errors property value. This container will be returned if there were one or more errors associated with retrieving the inventory item record.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.errors = value;
    }
    /**
     * Sets the inventoryItem property value. This type is used to provide details about each retrieved inventory item record.
     * @param value Value to set for the inventoryItem property.
     */
    public void setInventoryItem(@jakarta.annotation.Nullable final InventoryItemWithSkuLocaleGroupKeys value) {
        this.inventoryItem = value;
    }
    /**
     * Sets the sku property value. The seller-defined Stock-Keeping Unit (SKU) of the inventory item. The seller should have a unique SKU value for every product that they sell.
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final String value) {
        this.sku = value;
    }
    /**
     * Sets the statusCode property value. The HTTP status code returned in this field indicates the success or failure of retrieving the inventory item record for the inventory item specified in the &lt;strong&gt;sku&lt;/strong&gt; field. See the &lt;strong&gt;HTTP status codes&lt;/strong&gt; table to see which each status code indicates.
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
    /**
     * Sets the warnings property value. This container will be returned if there were one or more warnings associated with retrieving the inventory item record.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.warnings = value;
    }
}
