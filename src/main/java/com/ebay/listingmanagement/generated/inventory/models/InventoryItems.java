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
 * This type is used by the base response payload of &lt;strong&gt;getInventoryItems&lt;/strong&gt; call. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryItems implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This is the URL to the current page of inventory items.
     */
    private String href;
    /**
     * This container is an array of one or more inventory items, with detailed information on each inventory item.
     */
    private java.util.List<InventoryItemWithSkuLocaleGroupid> inventoryItems;
    /**
     * This integer value is the number of inventory items that will be displayed on each results page.
     */
    private Integer limit;
    /**
     * This is the URL to the next page of inventory items. This field will only be returned if there are additional inventory items to view.
     */
    private String next;
    /**
     * This is the URL to the previous page of inventory items. This field will only be returned if there are previous inventory items to view.
     */
    private String prev;
    /**
     * This integer value indicates the total number of pages of results that are available. This number will depend on the total number of inventory items available for viewing, and on the &lt;strong&gt;limit&lt;/strong&gt; value.
     */
    private Integer size;
    /**
     * This integer value is the total number of inventory items that exist for the seller&apos;s account. Based on this number and on the &lt;strong&gt;limit&lt;/strong&gt; value, the seller may have to toggle through multiple pages to view all inventory items.
     */
    private Integer total;
    /**
     * Instantiates a new {@link InventoryItems} and sets the default values.
     */
    public InventoryItems() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryItems}
     */
    @jakarta.annotation.Nonnull
    public static InventoryItems createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryItems();
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
        deserializerMap.put("inventoryItems", (n) -> { this.setInventoryItems(n.getCollectionOfObjectValues(InventoryItemWithSkuLocaleGroupid::createFromDiscriminatorValue)); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("prev", (n) -> { this.setPrev(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getIntegerValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. This is the URL to the current page of inventory items.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the inventoryItems property value. This container is an array of one or more inventory items, with detailed information on each inventory item.
     * @return a {@link java.util.List<InventoryItemWithSkuLocaleGroupid>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InventoryItemWithSkuLocaleGroupid> getInventoryItems() {
        return this.inventoryItems;
    }
    /**
     * Gets the limit property value. This integer value is the number of inventory items that will be displayed on each results page.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. This is the URL to the next page of inventory items. This field will only be returned if there are additional inventory items to view.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the prev property value. This is the URL to the previous page of inventory items. This field will only be returned if there are previous inventory items to view.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrev() {
        return this.prev;
    }
    /**
     * Gets the size property value. This integer value indicates the total number of pages of results that are available. This number will depend on the total number of inventory items available for viewing, and on the &lt;strong&gt;limit&lt;/strong&gt; value.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSize() {
        return this.size;
    }
    /**
     * Gets the total property value. This integer value is the total number of inventory items that exist for the seller&apos;s account. Based on this number and on the &lt;strong&gt;limit&lt;/strong&gt; value, the seller may have to toggle through multiple pages to view all inventory items.
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
        writer.writeCollectionOfObjectValues("inventoryItems", this.getInventoryItems());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("next", this.getNext());
        writer.writeStringValue("prev", this.getPrev());
        writer.writeIntegerValue("size", this.getSize());
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
     * Sets the href property value. This is the URL to the current page of inventory items.
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the inventoryItems property value. This container is an array of one or more inventory items, with detailed information on each inventory item.
     * @param value Value to set for the inventoryItems property.
     */
    public void setInventoryItems(@jakarta.annotation.Nullable final java.util.List<InventoryItemWithSkuLocaleGroupid> value) {
        this.inventoryItems = value;
    }
    /**
     * Sets the limit property value. This integer value is the number of inventory items that will be displayed on each results page.
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. This is the URL to the next page of inventory items. This field will only be returned if there are additional inventory items to view.
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the prev property value. This is the URL to the previous page of inventory items. This field will only be returned if there are previous inventory items to view.
     * @param value Value to set for the prev property.
     */
    public void setPrev(@jakarta.annotation.Nullable final String value) {
        this.prev = value;
    }
    /**
     * Sets the size property value. This integer value indicates the total number of pages of results that are available. This number will depend on the total number of inventory items available for viewing, and on the &lt;strong&gt;limit&lt;/strong&gt; value.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Integer value) {
        this.size = value;
    }
    /**
     * Sets the total property value. This integer value is the total number of inventory items that exist for the seller&apos;s account. Based on this number and on the &lt;strong&gt;limit&lt;/strong&gt; value, the seller may have to toggle through multiple pages to view all inventory items.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
