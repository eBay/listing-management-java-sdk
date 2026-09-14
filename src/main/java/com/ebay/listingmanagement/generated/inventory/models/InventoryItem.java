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
 * This type is used to provide detailed information about an inventory item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is used to specify the quantity of the inventory item that are available for purchase. &lt;br&gt;&lt;br&gt; This container is optional up until the seller is ready to publish an offer with the SKU, at which time it becomes required. Availability data must also be passed if an inventory item is being updated and availability data already exists for that inventory item.&lt;br&gt;&lt;br&gt; Since an inventory item must have specified quantity before being published in an offer, this container is always returned in the &apos;Get&apos; calls for SKUs that are part of a published offer. If a SKU is not part of a published offer, this container will only be returned if set for the inventory item.
     */
    private Availability availability;
    /**
     * This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. To see which item condition values that a particular eBay category supports, use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getitemconditionpolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the &lt;strong&gt;Metadata API&lt;/strong&gt;. This method returns condition ID values that map to the enumeration values defined in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitems.conditionenum&quot; target=&quot;_blank&quot;&gt;ConditionEnum&lt;/a&gt; type. The &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot; target=&quot;_blank&quot;&gt;Item condition ID and name values&lt;/a&gt; topic in the &lt;strong&gt;Selling Integration Guide&lt;/strong&gt; has a table that maps condition ID values to &lt;strong&gt;ConditionEnum&lt;/strong&gt; values. The &lt;strong&gt;getItemConditionPolicies&lt;/strong&gt; call reference page has more information.&lt;br&gt;&lt;br&gt;A &lt;strong&gt;condition&lt;/strong&gt; value is optional up until the seller is ready to publish an offer with the SKU, at which time it becomes required for most eBay categories.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     */
    private ConditionEnum condition;
    /**
     * This string field is used by the seller to more clearly describe the condition of a used inventory item, or an inventory item whose &lt;strong&gt;condition&lt;/strong&gt; value is not &lt;code&gt;NEW&lt;/code&gt;, &lt;code&gt;LIKE_NEW&lt;/code&gt;, &lt;code&gt;NEW_OTHER&lt;/code&gt;, or &lt;code&gt;NEW_WITH_DEFECTS&lt;/code&gt;.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conditionDescription&lt;/strong&gt; field is available for all eBay categories. If the &lt;strong&gt;conditionDescription&lt;/strong&gt; field is used with an item in one of the new conditions (mentioned in previous paragraph), eBay will simply ignore this field if included, and eBay will return a warning message to the user. &lt;br&gt;&lt;br&gt;This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the used item. Make sure that the &lt;strong&gt;condition&lt;/strong&gt; value, condition description, listing description, and the item&apos;s pictures do not contradict one another. &lt;br&gt;&lt;br&gt;This field is not always required, but is required if an inventory item is being updated and a condition description already exists for that inventory item. &lt;br&gt;&lt;br&gt;This field is returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt; and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls if a condition description was provided for a used inventory item.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Maximum length&lt;/strong&gt;: 1000.
     */
    private String conditionDescription;
    /**
     * This container is used by the seller to provide additional information about the condition of an item in a structured format. Condition descriptors are name-value attributes that can be either closed set or open text inputs.&lt;br&gt;&lt;br&gt;For trading card and coin listings in applicable categories, categories, sellers must use either &lt;code&gt;LIKE_NEW&lt;/code&gt; (2750) or &lt;code&gt;USED_VERY_GOOD&lt;/code&gt; (4000) item condition to specify the item as &lt;b&gt;Graded&lt;/b&gt; or &lt;b&gt;Ungraded&lt;/b&gt;, respectively. Use of either of these conditions requires the seller to use this array to provide one or more applicable Condition Descriptor name-value pairs.&lt;br&gt;&lt;br&gt;To retrieve all condition descriptor numeric IDs for a category, use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getitemconditionpolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the Metadata API.
     */
    private java.util.List<ConditionDescriptor> conditionDescriptors;
    /**
     * This container is used if the seller is offering one or more calculated shipping options for the inventory item, or if the seller is offering flat-rate shipping but is including a shipping surcharge based on the item&apos;s weight. This container is used to specify the dimensions and weight of a shipping package.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Package weight and dimensions are only supported for the following marketplaces: AU, CA, DE, IT, UK, US, and Motors. If this information is provided on other marketplaces, it will be ignored.&lt;/span&gt;&lt;br&gt;This container is not always required, but is required if an inventory item is being updated and shipping package data already exists for that inventory item.&lt;br&gt;&lt;br&gt;This container is returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt; and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls if package type, package weight, and/or package dimensions are specified for an inventory item.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     */
    private PackageWeightAndSize packageWeightAndSize;
    /**
     * This container is used to define the product details, such as product title, product description, product identifiers (eBay Product ID, GTIN, or Brand/MPN pair), product aspects/item specifics, and product images. Note that an eBay Product ID (ePID) or a Global Trade Item Number (GTIN) value can be used in an attempt to find a matching product in the eBay Catalog. If a product match is found, the inventory item record will automatically pick up all product details associated with the eBay Catalog product.&lt;br&gt;&lt;br&gt;Many eBay categories will require at least one product identifier (a GTIN or a Brand/MPN pair). To discover which product identifier(s) that an eBay category might require or support, use the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getitemaspectsforcategory&quot; target=&quot;_blank&quot;&gt;getItemAspectsForCategory&lt;/a&gt; method in the Taxonomy API. In the &lt;strong&gt;getItemAspectsForCategory&lt;/strong&gt; response, look for product identifier names (&lt;code&gt;brand&lt;/code&gt;, &lt;code&gt;mpn&lt;/code&gt;, &lt;code&gt;upc&lt;/code&gt;, &lt;code&gt;ean&lt;/code&gt;, &lt;code&gt;isbn&lt;/code&gt;) in the &lt;strong&gt;localizedAspectName&lt;/strong&gt; fields, and then look for the corresponding &lt;strong&gt;aspectRequired&lt;/strong&gt; boolean fields as well as the corresponding &lt;strong&gt;aspectUsage&lt;/strong&gt; field, which will indicate if the aspect is required, recommended, or optional. In some cases, a product identifier type may be required, but not known/applicable for a product. If this is the case, the seller must still include the corresponding field in the inventory item record, but pass in a default text string. This text string can vary by site, so the seller should use the &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call of the Trading API to get this string value. In the &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call, the seller should include a &lt;strong&gt;DetailName&lt;/strong&gt; field with its value set to &lt;code&gt;ProductDetails&lt;/code&gt;. In the response of the call, the seller can see the default string value in the &lt;strong&gt;ProductDetails.ProductIdentifierUnavailableText&lt;/strong&gt; field. The seller will use this value in one or more of the product identifier fields (&lt;strong&gt;ean&lt;/strong&gt;, &lt;strong&gt;isbn&lt;/strong&gt;, &lt;strong&gt;upc&lt;/strong&gt;, or &lt;strong&gt;mpn&lt;/strong&gt;) if a product ID isn&apos;t known or applicable. &lt;br&gt;&lt;br&gt;This container is not initially required, but it is required before an inventory item can be published as an offer, and/or if an inventory item is being updated and product data already exists for that inventory item. &lt;br&gt;&lt;br&gt;This container is always returned for published offers in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt;, and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls since product data must be defined for published offers, but for unpublished inventory items, this container will only be returned if product details have been defined for the inventory item. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This container and a few of its child fields (as noted below) are required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     */
    private Product product;
    /**
     * Instantiates a new {@link InventoryItem} and sets the default values.
     */
    public InventoryItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryItem}
     */
    @jakarta.annotation.Nonnull
    public static InventoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryItem();
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
     * Gets the availability property value. This container is used to specify the quantity of the inventory item that are available for purchase. &lt;br&gt;&lt;br&gt; This container is optional up until the seller is ready to publish an offer with the SKU, at which time it becomes required. Availability data must also be passed if an inventory item is being updated and availability data already exists for that inventory item.&lt;br&gt;&lt;br&gt; Since an inventory item must have specified quantity before being published in an offer, this container is always returned in the &apos;Get&apos; calls for SKUs that are part of a published offer. If a SKU is not part of a published offer, this container will only be returned if set for the inventory item.
     * @return a {@link Availability}
     */
    @jakarta.annotation.Nullable
    public Availability getAvailability() {
        return this.availability;
    }
    /**
     * Gets the condition property value. This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. To see which item condition values that a particular eBay category supports, use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getitemconditionpolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the &lt;strong&gt;Metadata API&lt;/strong&gt;. This method returns condition ID values that map to the enumeration values defined in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitems.conditionenum&quot; target=&quot;_blank&quot;&gt;ConditionEnum&lt;/a&gt; type. The &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot; target=&quot;_blank&quot;&gt;Item condition ID and name values&lt;/a&gt; topic in the &lt;strong&gt;Selling Integration Guide&lt;/strong&gt; has a table that maps condition ID values to &lt;strong&gt;ConditionEnum&lt;/strong&gt; values. The &lt;strong&gt;getItemConditionPolicies&lt;/strong&gt; call reference page has more information.&lt;br&gt;&lt;br&gt;A &lt;strong&gt;condition&lt;/strong&gt; value is optional up until the seller is ready to publish an offer with the SKU, at which time it becomes required for most eBay categories.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @return a {@link ConditionEnum}
     */
    @jakarta.annotation.Nullable
    public ConditionEnum getCondition() {
        return this.condition;
    }
    /**
     * Gets the conditionDescription property value. This string field is used by the seller to more clearly describe the condition of a used inventory item, or an inventory item whose &lt;strong&gt;condition&lt;/strong&gt; value is not &lt;code&gt;NEW&lt;/code&gt;, &lt;code&gt;LIKE_NEW&lt;/code&gt;, &lt;code&gt;NEW_OTHER&lt;/code&gt;, or &lt;code&gt;NEW_WITH_DEFECTS&lt;/code&gt;.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conditionDescription&lt;/strong&gt; field is available for all eBay categories. If the &lt;strong&gt;conditionDescription&lt;/strong&gt; field is used with an item in one of the new conditions (mentioned in previous paragraph), eBay will simply ignore this field if included, and eBay will return a warning message to the user. &lt;br&gt;&lt;br&gt;This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the used item. Make sure that the &lt;strong&gt;condition&lt;/strong&gt; value, condition description, listing description, and the item&apos;s pictures do not contradict one another. &lt;br&gt;&lt;br&gt;This field is not always required, but is required if an inventory item is being updated and a condition description already exists for that inventory item. &lt;br&gt;&lt;br&gt;This field is returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt; and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls if a condition description was provided for a used inventory item.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Maximum length&lt;/strong&gt;: 1000.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionDescription() {
        return this.conditionDescription;
    }
    /**
     * Gets the conditionDescriptors property value. This container is used by the seller to provide additional information about the condition of an item in a structured format. Condition descriptors are name-value attributes that can be either closed set or open text inputs.&lt;br&gt;&lt;br&gt;For trading card and coin listings in applicable categories, categories, sellers must use either &lt;code&gt;LIKE_NEW&lt;/code&gt; (2750) or &lt;code&gt;USED_VERY_GOOD&lt;/code&gt; (4000) item condition to specify the item as &lt;b&gt;Graded&lt;/b&gt; or &lt;b&gt;Ungraded&lt;/b&gt;, respectively. Use of either of these conditions requires the seller to use this array to provide one or more applicable Condition Descriptor name-value pairs.&lt;br&gt;&lt;br&gt;To retrieve all condition descriptor numeric IDs for a category, use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getitemconditionpolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the Metadata API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("availability", (n) -> { this.setAvailability(n.getObjectValue(Availability::createFromDiscriminatorValue)); });
        deserializerMap.put("condition", (n) -> { this.setCondition(n.getEnumValue(ConditionEnum::forValue)); });
        deserializerMap.put("conditionDescription", (n) -> { this.setConditionDescription(n.getStringValue()); });
        deserializerMap.put("conditionDescriptors", (n) -> { this.setConditionDescriptors(n.getCollectionOfObjectValues(ConditionDescriptor::createFromDiscriminatorValue)); });
        deserializerMap.put("packageWeightAndSize", (n) -> { this.setPackageWeightAndSize(n.getObjectValue(PackageWeightAndSize::createFromDiscriminatorValue)); });
        deserializerMap.put("product", (n) -> { this.setProduct(n.getObjectValue(Product::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the packageWeightAndSize property value. This container is used if the seller is offering one or more calculated shipping options for the inventory item, or if the seller is offering flat-rate shipping but is including a shipping surcharge based on the item&apos;s weight. This container is used to specify the dimensions and weight of a shipping package.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Package weight and dimensions are only supported for the following marketplaces: AU, CA, DE, IT, UK, US, and Motors. If this information is provided on other marketplaces, it will be ignored.&lt;/span&gt;&lt;br&gt;This container is not always required, but is required if an inventory item is being updated and shipping package data already exists for that inventory item.&lt;br&gt;&lt;br&gt;This container is returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt; and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls if package type, package weight, and/or package dimensions are specified for an inventory item.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     * @return a {@link PackageWeightAndSize}
     */
    @jakarta.annotation.Nullable
    public PackageWeightAndSize getPackageWeightAndSize() {
        return this.packageWeightAndSize;
    }
    /**
     * Gets the product property value. This container is used to define the product details, such as product title, product description, product identifiers (eBay Product ID, GTIN, or Brand/MPN pair), product aspects/item specifics, and product images. Note that an eBay Product ID (ePID) or a Global Trade Item Number (GTIN) value can be used in an attempt to find a matching product in the eBay Catalog. If a product match is found, the inventory item record will automatically pick up all product details associated with the eBay Catalog product.&lt;br&gt;&lt;br&gt;Many eBay categories will require at least one product identifier (a GTIN or a Brand/MPN pair). To discover which product identifier(s) that an eBay category might require or support, use the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getitemaspectsforcategory&quot; target=&quot;_blank&quot;&gt;getItemAspectsForCategory&lt;/a&gt; method in the Taxonomy API. In the &lt;strong&gt;getItemAspectsForCategory&lt;/strong&gt; response, look for product identifier names (&lt;code&gt;brand&lt;/code&gt;, &lt;code&gt;mpn&lt;/code&gt;, &lt;code&gt;upc&lt;/code&gt;, &lt;code&gt;ean&lt;/code&gt;, &lt;code&gt;isbn&lt;/code&gt;) in the &lt;strong&gt;localizedAspectName&lt;/strong&gt; fields, and then look for the corresponding &lt;strong&gt;aspectRequired&lt;/strong&gt; boolean fields as well as the corresponding &lt;strong&gt;aspectUsage&lt;/strong&gt; field, which will indicate if the aspect is required, recommended, or optional. In some cases, a product identifier type may be required, but not known/applicable for a product. If this is the case, the seller must still include the corresponding field in the inventory item record, but pass in a default text string. This text string can vary by site, so the seller should use the &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call of the Trading API to get this string value. In the &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call, the seller should include a &lt;strong&gt;DetailName&lt;/strong&gt; field with its value set to &lt;code&gt;ProductDetails&lt;/code&gt;. In the response of the call, the seller can see the default string value in the &lt;strong&gt;ProductDetails.ProductIdentifierUnavailableText&lt;/strong&gt; field. The seller will use this value in one or more of the product identifier fields (&lt;strong&gt;ean&lt;/strong&gt;, &lt;strong&gt;isbn&lt;/strong&gt;, &lt;strong&gt;upc&lt;/strong&gt;, or &lt;strong&gt;mpn&lt;/strong&gt;) if a product ID isn&apos;t known or applicable. &lt;br&gt;&lt;br&gt;This container is not initially required, but it is required before an inventory item can be published as an offer, and/or if an inventory item is being updated and product data already exists for that inventory item. &lt;br&gt;&lt;br&gt;This container is always returned for published offers in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt;, and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls since product data must be defined for published offers, but for unpublished inventory items, this container will only be returned if product details have been defined for the inventory item. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This container and a few of its child fields (as noted below) are required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @return a {@link Product}
     */
    @jakarta.annotation.Nullable
    public Product getProduct() {
        return this.product;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("availability", this.getAvailability());
        writer.writeEnumValue("condition", this.getCondition());
        writer.writeStringValue("conditionDescription", this.getConditionDescription());
        writer.writeCollectionOfObjectValues("conditionDescriptors", this.getConditionDescriptors());
        writer.writeObjectValue("packageWeightAndSize", this.getPackageWeightAndSize());
        writer.writeObjectValue("product", this.getProduct());
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
     * Sets the availability property value. This container is used to specify the quantity of the inventory item that are available for purchase. &lt;br&gt;&lt;br&gt; This container is optional up until the seller is ready to publish an offer with the SKU, at which time it becomes required. Availability data must also be passed if an inventory item is being updated and availability data already exists for that inventory item.&lt;br&gt;&lt;br&gt; Since an inventory item must have specified quantity before being published in an offer, this container is always returned in the &apos;Get&apos; calls for SKUs that are part of a published offer. If a SKU is not part of a published offer, this container will only be returned if set for the inventory item.
     * @param value Value to set for the availability property.
     */
    public void setAvailability(@jakarta.annotation.Nullable final Availability value) {
        this.availability = value;
    }
    /**
     * Sets the condition property value. This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. To see which item condition values that a particular eBay category supports, use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getitemconditionpolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the &lt;strong&gt;Metadata API&lt;/strong&gt;. This method returns condition ID values that map to the enumeration values defined in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-getinventoryitems.conditionenum&quot; target=&quot;_blank&quot;&gt;ConditionEnum&lt;/a&gt; type. The &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot; target=&quot;_blank&quot;&gt;Item condition ID and name values&lt;/a&gt; topic in the &lt;strong&gt;Selling Integration Guide&lt;/strong&gt; has a table that maps condition ID values to &lt;strong&gt;ConditionEnum&lt;/strong&gt; values. The &lt;strong&gt;getItemConditionPolicies&lt;/strong&gt; call reference page has more information.&lt;br&gt;&lt;br&gt;A &lt;strong&gt;condition&lt;/strong&gt; value is optional up until the seller is ready to publish an offer with the SKU, at which time it becomes required for most eBay categories.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @param value Value to set for the condition property.
     */
    public void setCondition(@jakarta.annotation.Nullable final ConditionEnum value) {
        this.condition = value;
    }
    /**
     * Sets the conditionDescription property value. This string field is used by the seller to more clearly describe the condition of a used inventory item, or an inventory item whose &lt;strong&gt;condition&lt;/strong&gt; value is not &lt;code&gt;NEW&lt;/code&gt;, &lt;code&gt;LIKE_NEW&lt;/code&gt;, &lt;code&gt;NEW_OTHER&lt;/code&gt;, or &lt;code&gt;NEW_WITH_DEFECTS&lt;/code&gt;.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conditionDescription&lt;/strong&gt; field is available for all eBay categories. If the &lt;strong&gt;conditionDescription&lt;/strong&gt; field is used with an item in one of the new conditions (mentioned in previous paragraph), eBay will simply ignore this field if included, and eBay will return a warning message to the user. &lt;br&gt;&lt;br&gt;This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the used item. Make sure that the &lt;strong&gt;condition&lt;/strong&gt; value, condition description, listing description, and the item&apos;s pictures do not contradict one another. &lt;br&gt;&lt;br&gt;This field is not always required, but is required if an inventory item is being updated and a condition description already exists for that inventory item. &lt;br&gt;&lt;br&gt;This field is returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt; and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls if a condition description was provided for a used inventory item.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Maximum length&lt;/strong&gt;: 1000.
     * @param value Value to set for the conditionDescription property.
     */
    public void setConditionDescription(@jakarta.annotation.Nullable final String value) {
        this.conditionDescription = value;
    }
    /**
     * Sets the conditionDescriptors property value. This container is used by the seller to provide additional information about the condition of an item in a structured format. Condition descriptors are name-value attributes that can be either closed set or open text inputs.&lt;br&gt;&lt;br&gt;For trading card and coin listings in applicable categories, categories, sellers must use either &lt;code&gt;LIKE_NEW&lt;/code&gt; (2750) or &lt;code&gt;USED_VERY_GOOD&lt;/code&gt; (4000) item condition to specify the item as &lt;b&gt;Graded&lt;/b&gt; or &lt;b&gt;Ungraded&lt;/b&gt;, respectively. Use of either of these conditions requires the seller to use this array to provide one or more applicable Condition Descriptor name-value pairs.&lt;br&gt;&lt;br&gt;To retrieve all condition descriptor numeric IDs for a category, use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getitemconditionpolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the Metadata API.
     * @param value Value to set for the conditionDescriptors property.
     */
    public void setConditionDescriptors(@jakarta.annotation.Nullable final java.util.List<ConditionDescriptor> value) {
        this.conditionDescriptors = value;
    }
    /**
     * Sets the packageWeightAndSize property value. This container is used if the seller is offering one or more calculated shipping options for the inventory item, or if the seller is offering flat-rate shipping but is including a shipping surcharge based on the item&apos;s weight. This container is used to specify the dimensions and weight of a shipping package.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Package weight and dimensions are only supported for the following marketplaces: AU, CA, DE, IT, UK, US, and Motors. If this information is provided on other marketplaces, it will be ignored.&lt;/span&gt;&lt;br&gt;This container is not always required, but is required if an inventory item is being updated and shipping package data already exists for that inventory item.&lt;br&gt;&lt;br&gt;This container is returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt; and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls if package type, package weight, and/or package dimensions are specified for an inventory item.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;https://pages.ebay.com/help/pay/calculated-shipping.html &quot; target=&quot;_blank&quot;&gt;Calculated shipping&lt;/a&gt; help page for more information on calculated shipping.
     * @param value Value to set for the packageWeightAndSize property.
     */
    public void setPackageWeightAndSize(@jakarta.annotation.Nullable final PackageWeightAndSize value) {
        this.packageWeightAndSize = value;
    }
    /**
     * Sets the product property value. This container is used to define the product details, such as product title, product description, product identifiers (eBay Product ID, GTIN, or Brand/MPN pair), product aspects/item specifics, and product images. Note that an eBay Product ID (ePID) or a Global Trade Item Number (GTIN) value can be used in an attempt to find a matching product in the eBay Catalog. If a product match is found, the inventory item record will automatically pick up all product details associated with the eBay Catalog product.&lt;br&gt;&lt;br&gt;Many eBay categories will require at least one product identifier (a GTIN or a Brand/MPN pair). To discover which product identifier(s) that an eBay category might require or support, use the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getitemaspectsforcategory&quot; target=&quot;_blank&quot;&gt;getItemAspectsForCategory&lt;/a&gt; method in the Taxonomy API. In the &lt;strong&gt;getItemAspectsForCategory&lt;/strong&gt; response, look for product identifier names (&lt;code&gt;brand&lt;/code&gt;, &lt;code&gt;mpn&lt;/code&gt;, &lt;code&gt;upc&lt;/code&gt;, &lt;code&gt;ean&lt;/code&gt;, &lt;code&gt;isbn&lt;/code&gt;) in the &lt;strong&gt;localizedAspectName&lt;/strong&gt; fields, and then look for the corresponding &lt;strong&gt;aspectRequired&lt;/strong&gt; boolean fields as well as the corresponding &lt;strong&gt;aspectUsage&lt;/strong&gt; field, which will indicate if the aspect is required, recommended, or optional. In some cases, a product identifier type may be required, but not known/applicable for a product. If this is the case, the seller must still include the corresponding field in the inventory item record, but pass in a default text string. This text string can vary by site, so the seller should use the &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call of the Trading API to get this string value. In the &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call, the seller should include a &lt;strong&gt;DetailName&lt;/strong&gt; field with its value set to &lt;code&gt;ProductDetails&lt;/code&gt;. In the response of the call, the seller can see the default string value in the &lt;strong&gt;ProductDetails.ProductIdentifierUnavailableText&lt;/strong&gt; field. The seller will use this value in one or more of the product identifier fields (&lt;strong&gt;ean&lt;/strong&gt;, &lt;strong&gt;isbn&lt;/strong&gt;, &lt;strong&gt;upc&lt;/strong&gt;, or &lt;strong&gt;mpn&lt;/strong&gt;) if a product ID isn&apos;t known or applicable. &lt;br&gt;&lt;br&gt;This container is not initially required, but it is required before an inventory item can be published as an offer, and/or if an inventory item is being updated and product data already exists for that inventory item. &lt;br&gt;&lt;br&gt;This container is always returned for published offers in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt;, and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls since product data must be defined for published offers, but for unpublished inventory items, this container will only be returned if product details have been defined for the inventory item. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This container and a few of its child fields (as noted below) are required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @param value Value to set for the product property.
     */
    public void setProduct(@jakarta.annotation.Nullable final Product value) {
        this.product = value;
    }
}
