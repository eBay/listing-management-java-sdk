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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryItemWithSkuLocaleGroupid implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to specify the quantity of the inventory items that are available for purchase if the items will be shipped to the buyer, and the quantity of the inventory items that are available for In-Store Pickup at one or more of the merchant&apos;s physical stores.&lt;br&gt;&lt;br&gt;In-Store Pickup is only available to large merchants selling on the US, UK, Germany, and Australia sites.
     */
    private AvailabilityWithAll availability;
    /**
     * This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. &lt;br&gt;&lt;br&gt;Since the condition of an inventory item must be specified before being published in an offer, this field is always returned in the &apos;Get&apos; calls for SKUs that are part of a published offer. If a SKU is not part of a published offer, this field will only be returned if set for the inventory item. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ConditionEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String condition;
    /**
     * This string field is used by the seller to more clearly describe the condition of used items, or items that are not &apos;Brand New&apos;, &apos;New with tags&apos;, or &apos;New in box&apos;. The ConditionDescription field is available for all categories. If the ConditionDescription field is used with an item in a new condition (Condition IDs 1000-1499), eBay will simply ignore this field if included, and eBay will return a warning message to the user. This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the item. Make sure that the condition value, condition description, listing description, and the item&apos;s pictures do not contradict one another.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max length&lt;/strong&gt;: 1000
     */
    private String conditionDescription;
    /**
     * This container is used by the seller to provide additional information about the condition of an item in a structured format. Descriptors are name-value attributes that can be either closed set or open text.&lt;br&gt;&lt;br&gt;For trading card listings in &lt;b&gt;Non-Sport Trading Card Singles&lt;/b&gt; (183050), &lt;b&gt;CCG Individual Cards&lt;/b&gt; (183454), and &lt;b&gt;Sports Trading Card Singles&lt;/b&gt; (261328) categories, sellers must use either &lt;code&gt;LIKE_NEW&lt;/code&gt; (2750) or &lt;code&gt;USED_VERY_GOOD&lt;/code&gt; (4000) item condition to specify the card as &lt;b&gt;Graded&lt;/b&gt; or &lt;b&gt;Ungraded&lt;/b&gt;, respectively. Use of either of these conditions requires the seller to use this array to provide one or more applicable Condition Descriptor name-value pairs.&lt;br&gt;&lt;br&gt;For more information on the numeric IDs and their text equivalents, use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the Metadata API.
     */
    private java.util.List<ConditionDescriptor> conditionDescriptors;
    /**
     * This array is returned if the inventory item is associated with any inventory item group(s). The value(s) returned in this array are the unique identifier(s) of the inventory item group(s). This array is not returned if the inventory item is not associated with any inventory item groups.
     */
    private java.util.List<String> groupIds;
    /**
     * This array is returned if the inventory item is associated with any inventory item group(s). The value(s) returned in this array are the unique identifier(s) of the inventory item&apos;s variation in a multiple-variation listing. This array is not returned if the inventory item is not associated with any inventory item groups.
     */
    private java.util.List<String> inventoryItemGroupKeys;
    /**
     * This field returns the natural language that was provided in the field values of the request payload (i.e., en_AU, en_GB or de_DE). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:LocaleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String locale;
    /**
     * This type is used to indicate the package type, weight, and dimensions of the shipping package. Package weight and dimensions are required when calculated shipping rates are used, and weight alone is required when flat-rate shipping is used, but with a weight surcharge. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     */
    private PackageWeightAndSize packageWeightAndSize;
    /**
     * This type is used to define the product details, such as a title, a product description, product aspects/item specifics, and links to images for the product. Optionally, in a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, a seller can pass in an eBay Product Identifier (ePID) or a Global Trade Item Number (GTIN) value, such as an EAN, an ISBN, a UPC, to identify a product to be matched with a product in the eBay Catalog. The information in this type is also returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;getInventoryItems&lt;/strong&gt;, and &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; calls if defined.
     */
    private Product product;
    /**
     * The seller-defined Stock-Keeping Unit (SKU) of the inventory item. The seller should have a unique SKU value for every product that they sell.
     */
    private String sku;
    /**
     * Instantiates a new {@link InventoryItemWithSkuLocaleGroupid} and sets the default values.
     */
    public InventoryItemWithSkuLocaleGroupid() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryItemWithSkuLocaleGroupid}
     */
    @jakarta.annotation.Nonnull
    public static InventoryItemWithSkuLocaleGroupid createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryItemWithSkuLocaleGroupid();
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
     * Gets the availability property value. This type is used to specify the quantity of the inventory items that are available for purchase if the items will be shipped to the buyer, and the quantity of the inventory items that are available for In-Store Pickup at one or more of the merchant&apos;s physical stores.&lt;br&gt;&lt;br&gt;In-Store Pickup is only available to large merchants selling on the US, UK, Germany, and Australia sites.
     * @return a {@link AvailabilityWithAll}
     */
    @jakarta.annotation.Nullable
    public AvailabilityWithAll getAvailability() {
        return this.availability;
    }
    /**
     * Gets the condition property value. This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. &lt;br&gt;&lt;br&gt;Since the condition of an inventory item must be specified before being published in an offer, this field is always returned in the &apos;Get&apos; calls for SKUs that are part of a published offer. If a SKU is not part of a published offer, this field will only be returned if set for the inventory item. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ConditionEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCondition() {
        return this.condition;
    }
    /**
     * Gets the conditionDescription property value. This string field is used by the seller to more clearly describe the condition of used items, or items that are not &apos;Brand New&apos;, &apos;New with tags&apos;, or &apos;New in box&apos;. The ConditionDescription field is available for all categories. If the ConditionDescription field is used with an item in a new condition (Condition IDs 1000-1499), eBay will simply ignore this field if included, and eBay will return a warning message to the user. This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the item. Make sure that the condition value, condition description, listing description, and the item&apos;s pictures do not contradict one another.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max length&lt;/strong&gt;: 1000
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionDescription() {
        return this.conditionDescription;
    }
    /**
     * Gets the conditionDescriptors property value. This container is used by the seller to provide additional information about the condition of an item in a structured format. Descriptors are name-value attributes that can be either closed set or open text.&lt;br&gt;&lt;br&gt;For trading card listings in &lt;b&gt;Non-Sport Trading Card Singles&lt;/b&gt; (183050), &lt;b&gt;CCG Individual Cards&lt;/b&gt; (183454), and &lt;b&gt;Sports Trading Card Singles&lt;/b&gt; (261328) categories, sellers must use either &lt;code&gt;LIKE_NEW&lt;/code&gt; (2750) or &lt;code&gt;USED_VERY_GOOD&lt;/code&gt; (4000) item condition to specify the card as &lt;b&gt;Graded&lt;/b&gt; or &lt;b&gt;Ungraded&lt;/b&gt;, respectively. Use of either of these conditions requires the seller to use this array to provide one or more applicable Condition Descriptor name-value pairs.&lt;br&gt;&lt;br&gt;For more information on the numeric IDs and their text equivalents, use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the Metadata API.
     * @return a {@link java.util.List<ConditionDescriptor>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionDescriptor> getConditionDescriptors() {
        return this.conditionDescriptors;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("availability", (n) -> { this.setAvailability(n.getObjectValue(AvailabilityWithAll::createFromDiscriminatorValue)); });
        deserializerMap.put("condition", (n) -> { this.setCondition(n.getStringValue()); });
        deserializerMap.put("conditionDescription", (n) -> { this.setConditionDescription(n.getStringValue()); });
        deserializerMap.put("conditionDescriptors", (n) -> { this.setConditionDescriptors(n.getCollectionOfObjectValues(ConditionDescriptor::createFromDiscriminatorValue)); });
        deserializerMap.put("groupIds", (n) -> { this.setGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("inventoryItemGroupKeys", (n) -> { this.setInventoryItemGroupKeys(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("packageWeightAndSize", (n) -> { this.setPackageWeightAndSize(n.getObjectValue(PackageWeightAndSize::createFromDiscriminatorValue)); });
        deserializerMap.put("product", (n) -> { this.setProduct(n.getObjectValue(Product::createFromDiscriminatorValue)); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupIds property value. This array is returned if the inventory item is associated with any inventory item group(s). The value(s) returned in this array are the unique identifier(s) of the inventory item group(s). This array is not returned if the inventory item is not associated with any inventory item groups.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }
    /**
     * Gets the inventoryItemGroupKeys property value. This array is returned if the inventory item is associated with any inventory item group(s). The value(s) returned in this array are the unique identifier(s) of the inventory item&apos;s variation in a multiple-variation listing. This array is not returned if the inventory item is not associated with any inventory item groups.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInventoryItemGroupKeys() {
        return this.inventoryItemGroupKeys;
    }
    /**
     * Gets the locale property value. This field returns the natural language that was provided in the field values of the request payload (i.e., en_AU, en_GB or de_DE). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:LocaleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocale() {
        return this.locale;
    }
    /**
     * Gets the packageWeightAndSize property value. This type is used to indicate the package type, weight, and dimensions of the shipping package. Package weight and dimensions are required when calculated shipping rates are used, and weight alone is required when flat-rate shipping is used, but with a weight surcharge. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     * @return a {@link PackageWeightAndSize}
     */
    @jakarta.annotation.Nullable
    public PackageWeightAndSize getPackageWeightAndSize() {
        return this.packageWeightAndSize;
    }
    /**
     * Gets the product property value. This type is used to define the product details, such as a title, a product description, product aspects/item specifics, and links to images for the product. Optionally, in a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, a seller can pass in an eBay Product Identifier (ePID) or a Global Trade Item Number (GTIN) value, such as an EAN, an ISBN, a UPC, to identify a product to be matched with a product in the eBay Catalog. The information in this type is also returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;getInventoryItems&lt;/strong&gt;, and &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; calls if defined.
     * @return a {@link Product}
     */
    @jakarta.annotation.Nullable
    public Product getProduct() {
        return this.product;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("availability", this.getAvailability());
        writer.writeStringValue("condition", this.getCondition());
        writer.writeStringValue("conditionDescription", this.getConditionDescription());
        writer.writeCollectionOfObjectValues("conditionDescriptors", this.getConditionDescriptors());
        writer.writeCollectionOfPrimitiveValues("groupIds", this.getGroupIds());
        writer.writeCollectionOfPrimitiveValues("inventoryItemGroupKeys", this.getInventoryItemGroupKeys());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeObjectValue("packageWeightAndSize", this.getPackageWeightAndSize());
        writer.writeObjectValue("product", this.getProduct());
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
     * Sets the availability property value. This type is used to specify the quantity of the inventory items that are available for purchase if the items will be shipped to the buyer, and the quantity of the inventory items that are available for In-Store Pickup at one or more of the merchant&apos;s physical stores.&lt;br&gt;&lt;br&gt;In-Store Pickup is only available to large merchants selling on the US, UK, Germany, and Australia sites.
     * @param value Value to set for the availability property.
     */
    public void setAvailability(@jakarta.annotation.Nullable final AvailabilityWithAll value) {
        this.availability = value;
    }
    /**
     * Sets the condition property value. This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. &lt;br&gt;&lt;br&gt;Since the condition of an inventory item must be specified before being published in an offer, this field is always returned in the &apos;Get&apos; calls for SKUs that are part of a published offer. If a SKU is not part of a published offer, this field will only be returned if set for the inventory item. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ConditionEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the condition property.
     */
    public void setCondition(@jakarta.annotation.Nullable final String value) {
        this.condition = value;
    }
    /**
     * Sets the conditionDescription property value. This string field is used by the seller to more clearly describe the condition of used items, or items that are not &apos;Brand New&apos;, &apos;New with tags&apos;, or &apos;New in box&apos;. The ConditionDescription field is available for all categories. If the ConditionDescription field is used with an item in a new condition (Condition IDs 1000-1499), eBay will simply ignore this field if included, and eBay will return a warning message to the user. This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the item. Make sure that the condition value, condition description, listing description, and the item&apos;s pictures do not contradict one another.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max length&lt;/strong&gt;: 1000
     * @param value Value to set for the conditionDescription property.
     */
    public void setConditionDescription(@jakarta.annotation.Nullable final String value) {
        this.conditionDescription = value;
    }
    /**
     * Sets the conditionDescriptors property value. This container is used by the seller to provide additional information about the condition of an item in a structured format. Descriptors are name-value attributes that can be either closed set or open text.&lt;br&gt;&lt;br&gt;For trading card listings in &lt;b&gt;Non-Sport Trading Card Singles&lt;/b&gt; (183050), &lt;b&gt;CCG Individual Cards&lt;/b&gt; (183454), and &lt;b&gt;Sports Trading Card Singles&lt;/b&gt; (261328) categories, sellers must use either &lt;code&gt;LIKE_NEW&lt;/code&gt; (2750) or &lt;code&gt;USED_VERY_GOOD&lt;/code&gt; (4000) item condition to specify the card as &lt;b&gt;Graded&lt;/b&gt; or &lt;b&gt;Ungraded&lt;/b&gt;, respectively. Use of either of these conditions requires the seller to use this array to provide one or more applicable Condition Descriptor name-value pairs.&lt;br&gt;&lt;br&gt;For more information on the numeric IDs and their text equivalents, use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the Metadata API.
     * @param value Value to set for the conditionDescriptors property.
     */
    public void setConditionDescriptors(@jakarta.annotation.Nullable final java.util.List<ConditionDescriptor> value) {
        this.conditionDescriptors = value;
    }
    /**
     * Sets the groupIds property value. This array is returned if the inventory item is associated with any inventory item group(s). The value(s) returned in this array are the unique identifier(s) of the inventory item group(s). This array is not returned if the inventory item is not associated with any inventory item groups.
     * @param value Value to set for the groupIds property.
     */
    public void setGroupIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.groupIds = value;
    }
    /**
     * Sets the inventoryItemGroupKeys property value. This array is returned if the inventory item is associated with any inventory item group(s). The value(s) returned in this array are the unique identifier(s) of the inventory item&apos;s variation in a multiple-variation listing. This array is not returned if the inventory item is not associated with any inventory item groups.
     * @param value Value to set for the inventoryItemGroupKeys property.
     */
    public void setInventoryItemGroupKeys(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.inventoryItemGroupKeys = value;
    }
    /**
     * Sets the locale property value. This field returns the natural language that was provided in the field values of the request payload (i.e., en_AU, en_GB or de_DE). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:LocaleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the locale property.
     */
    public void setLocale(@jakarta.annotation.Nullable final String value) {
        this.locale = value;
    }
    /**
     * Sets the packageWeightAndSize property value. This type is used to indicate the package type, weight, and dimensions of the shipping package. Package weight and dimensions are required when calculated shipping rates are used, and weight alone is required when flat-rate shipping is used, but with a weight surcharge. See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     * @param value Value to set for the packageWeightAndSize property.
     */
    public void setPackageWeightAndSize(@jakarta.annotation.Nullable final PackageWeightAndSize value) {
        this.packageWeightAndSize = value;
    }
    /**
     * Sets the product property value. This type is used to define the product details, such as a title, a product description, product aspects/item specifics, and links to images for the product. Optionally, in a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, a seller can pass in an eBay Product Identifier (ePID) or a Global Trade Item Number (GTIN) value, such as an EAN, an ISBN, a UPC, to identify a product to be matched with a product in the eBay Catalog. The information in this type is also returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;getInventoryItems&lt;/strong&gt;, and &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; calls if defined.
     * @param value Value to set for the product property.
     */
    public void setProduct(@jakarta.annotation.Nullable final Product value) {
        this.product = value;
    }
    /**
     * Sets the sku property value. The seller-defined Stock-Keeping Unit (SKU) of the inventory item. The seller should have a unique SKU value for every product that they sell.
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final String value) {
        this.sku = value;
    }
}
