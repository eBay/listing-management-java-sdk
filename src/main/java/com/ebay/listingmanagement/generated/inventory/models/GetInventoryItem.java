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
 * The seller-defined Stock-Keeping Unit (SKU) of each inventory item that the user wants to retrieve is passed in the request of the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetInventoryItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of SKU values are passed in under the &lt;strong&gt;sku&lt;/strong&gt; container to retrieve up to 25 inventory item records.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitems&quot; target=&quot;_blank &quot;&gt;getInventoryItems&lt;/a&gt; method to retrieve SKU values.
     */
    private String sku;
    /**
     * Instantiates a new {@link GetInventoryItem} and sets the default values.
     */
    public GetInventoryItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetInventoryItem}
     */
    @jakarta.annotation.Nonnull
    public static GetInventoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetInventoryItem();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sku property value. An array of SKU values are passed in under the &lt;strong&gt;sku&lt;/strong&gt; container to retrieve up to 25 inventory item records.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitems&quot; target=&quot;_blank &quot;&gt;getInventoryItems&lt;/a&gt; method to retrieve SKU values.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSku() {
        return this.sku;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("sku", this.getSku());
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
     * Sets the sku property value. An array of SKU values are passed in under the &lt;strong&gt;sku&lt;/strong&gt; container to retrieve up to 25 inventory item records.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitems&quot; target=&quot;_blank &quot;&gt;getInventoryItems&lt;/a&gt; method to retrieve SKU values.
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final String value) {
        this.sku = value;
    }
}
