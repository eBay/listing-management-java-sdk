package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to define/modify each inventory item record that is being created and/or updated with the &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; method. Up to 25 inventory item records can be created and/or updated with one call.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryItemWithSkuLocale implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to specify the quantity of the inventory item that is available for purchase if the item will be shipped to the buyer, and the quantity of the inventory item that is available for In-Store Pickup at one or more of the merchant&apos;s physical stores. In-Store Pickup is only available to large merchants selling on the US, UK, Germany, and Australia sites.
     */
    private Availability availability;
    /**
     * This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. To see which item condition values that a particular eBay category supports, use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the &lt;strong&gt;Metadata API&lt;/strong&gt;. This method returns condition ID values that map to the enumeration values defined in the &lt;a href=&quot;/api-docs/sell/inventory/types/slr:ConditionEnum&quot; target=&quot;_blank&quot;&gt;ConditionEnum&lt;/a&gt; type. The &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot; target=&quot;_blank&quot;&gt;Item condition ID and name values&lt;/a&gt; topic in the &lt;strong&gt;Selling Integration Guide&lt;/strong&gt; has a table that maps condition ID values to &lt;strong&gt;ConditionEnum&lt;/strong&gt; values. The &lt;strong&gt;getItemConditionPolicies&lt;/strong&gt; call reference page has more information.&lt;br&gt;&lt;br&gt;A &lt;strong&gt;condition&lt;/strong&gt; value is optional up until the seller is ready to publish an offer with the SKU, at which time it becomes required for most eBay categories.&lt;br&gt;&lt;/div&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ConditionEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String condition;
    /**
     * This string field is used by the seller to more clearly describe the condition of a used inventory item, or an inventory item whose &lt;strong&gt;condition&lt;/strong&gt; value is not &lt;code&gt;NEW&lt;/code&gt;, &lt;code&gt;LIKE_NEW&lt;/code&gt;, &lt;code&gt;NEW_OTHER&lt;/code&gt;, or &lt;code&gt;NEW_WITH_DEFECTS&lt;/code&gt;.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conditionDescription&lt;/strong&gt; field is available for all eBay categories. If the &lt;strong&gt;conditionDescription&lt;/strong&gt; field is used with an item in one of the new conditions (mentioned in previous paragraph), eBay will simply ignore this field if included, and eBay will return a warning message to the user. &lt;br&gt;&lt;br&gt;This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the used item. Make sure that the &lt;strong&gt;condition&lt;/strong&gt; value, condition description, listing description, and the item&apos;s pictures do not contradict one another. &lt;br&gt;&lt;br&gt;This field is not always required, but is required if an inventory item is being updated and a condition description already exists for that inventory item. &lt;br&gt;&lt;br&gt;This field is returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt;, and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls if a condition description was provided for a used inventory item.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max Length&lt;/b&gt;: 1000
     */
    private String conditionDescription;
    /**
     * This container is used by the seller to provide additional information about the condition of an item in a structured format. Condition descriptors are name-value attributes that can be either closed set or open text inputs.&lt;br&gt;&lt;br&gt;For trading card listings in &lt;b&gt;Non-Sport Trading Card Singles&lt;/b&gt; (183050), &lt;b&gt;CCG Individual Cards&lt;/b&gt; (183454), and &lt;b&gt;Sports Trading Card Singles&lt;/b&gt; (261328) categories, sellers must use either &lt;code&gt;LIKE_NEW&lt;/code&gt; (2750) or &lt;code&gt;USED_VERY_GOOD&lt;/code&gt; (4000) item condition to specify the card as &lt;b&gt;Graded&lt;/b&gt; or &lt;b&gt;Ungraded&lt;/b&gt;, respectively. Use of either of these conditions requires the seller to use this array to provide one or more applicable Condition Descriptor name-value pairs.&lt;br&gt;&lt;br&gt;To retrieve all condition descriptor numeric IDs for a category, use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the Metadata API.
     */
    private java.util.List<ConditionDescriptor> conditionDescriptors;
    /**
     * This request parameter sets the natural language that was provided in the field values of the request payload (i.e., en_AU, en_GB or de_DE). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:LocaleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
     * This is the seller-defined SKU value of the product that will be listed on the eBay site (specified in the &lt;strong&gt;marketplaceId&lt;/strong&gt; field). Only one offer (in unpublished or published state) may exist for each &lt;strong&gt;sku&lt;/strong&gt;/&lt;strong&gt;marketplaceId&lt;/strong&gt;/&lt;strong&gt;format&lt;/strong&gt; combination. This field is required.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br&gt;
     */
    private String sku;
    /**
     * Instantiates a new {@link InventoryItemWithSkuLocale} and sets the default values.
     */
    public InventoryItemWithSkuLocale() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryItemWithSkuLocale}
     */
    @jakarta.annotation.Nonnull
    public static InventoryItemWithSkuLocale createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryItemWithSkuLocale();
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
     * Gets the availability property value. This type is used to specify the quantity of the inventory item that is available for purchase if the item will be shipped to the buyer, and the quantity of the inventory item that is available for In-Store Pickup at one or more of the merchant&apos;s physical stores. In-Store Pickup is only available to large merchants selling on the US, UK, Germany, and Australia sites.
     * @return a {@link Availability}
     */
    @jakarta.annotation.Nullable
    public Availability getAvailability() {
        return this.availability;
    }
    /**
     * Gets the condition property value. This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. To see which item condition values that a particular eBay category supports, use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the &lt;strong&gt;Metadata API&lt;/strong&gt;. This method returns condition ID values that map to the enumeration values defined in the &lt;a href=&quot;/api-docs/sell/inventory/types/slr:ConditionEnum&quot; target=&quot;_blank&quot;&gt;ConditionEnum&lt;/a&gt; type. The &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot; target=&quot;_blank&quot;&gt;Item condition ID and name values&lt;/a&gt; topic in the &lt;strong&gt;Selling Integration Guide&lt;/strong&gt; has a table that maps condition ID values to &lt;strong&gt;ConditionEnum&lt;/strong&gt; values. The &lt;strong&gt;getItemConditionPolicies&lt;/strong&gt; call reference page has more information.&lt;br&gt;&lt;br&gt;A &lt;strong&gt;condition&lt;/strong&gt; value is optional up until the seller is ready to publish an offer with the SKU, at which time it becomes required for most eBay categories.&lt;br&gt;&lt;/div&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ConditionEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCondition() {
        return this.condition;
    }
    /**
     * Gets the conditionDescription property value. This string field is used by the seller to more clearly describe the condition of a used inventory item, or an inventory item whose &lt;strong&gt;condition&lt;/strong&gt; value is not &lt;code&gt;NEW&lt;/code&gt;, &lt;code&gt;LIKE_NEW&lt;/code&gt;, &lt;code&gt;NEW_OTHER&lt;/code&gt;, or &lt;code&gt;NEW_WITH_DEFECTS&lt;/code&gt;.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conditionDescription&lt;/strong&gt; field is available for all eBay categories. If the &lt;strong&gt;conditionDescription&lt;/strong&gt; field is used with an item in one of the new conditions (mentioned in previous paragraph), eBay will simply ignore this field if included, and eBay will return a warning message to the user. &lt;br&gt;&lt;br&gt;This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the used item. Make sure that the &lt;strong&gt;condition&lt;/strong&gt; value, condition description, listing description, and the item&apos;s pictures do not contradict one another. &lt;br&gt;&lt;br&gt;This field is not always required, but is required if an inventory item is being updated and a condition description already exists for that inventory item. &lt;br&gt;&lt;br&gt;This field is returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt;, and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls if a condition description was provided for a used inventory item.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max Length&lt;/b&gt;: 1000
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionDescription() {
        return this.conditionDescription;
    }
    /**
     * Gets the conditionDescriptors property value. This container is used by the seller to provide additional information about the condition of an item in a structured format. Condition descriptors are name-value attributes that can be either closed set or open text inputs.&lt;br&gt;&lt;br&gt;For trading card listings in &lt;b&gt;Non-Sport Trading Card Singles&lt;/b&gt; (183050), &lt;b&gt;CCG Individual Cards&lt;/b&gt; (183454), and &lt;b&gt;Sports Trading Card Singles&lt;/b&gt; (261328) categories, sellers must use either &lt;code&gt;LIKE_NEW&lt;/code&gt; (2750) or &lt;code&gt;USED_VERY_GOOD&lt;/code&gt; (4000) item condition to specify the card as &lt;b&gt;Graded&lt;/b&gt; or &lt;b&gt;Ungraded&lt;/b&gt;, respectively. Use of either of these conditions requires the seller to use this array to provide one or more applicable Condition Descriptor name-value pairs.&lt;br&gt;&lt;br&gt;To retrieve all condition descriptor numeric IDs for a category, use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the Metadata API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("availability", (n) -> { this.setAvailability(n.getObjectValue(Availability::createFromDiscriminatorValue)); });
        deserializerMap.put("condition", (n) -> { this.setCondition(n.getStringValue()); });
        deserializerMap.put("conditionDescription", (n) -> { this.setConditionDescription(n.getStringValue()); });
        deserializerMap.put("conditionDescriptors", (n) -> { this.setConditionDescriptors(n.getCollectionOfObjectValues(ConditionDescriptor::createFromDiscriminatorValue)); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("packageWeightAndSize", (n) -> { this.setPackageWeightAndSize(n.getObjectValue(PackageWeightAndSize::createFromDiscriminatorValue)); });
        deserializerMap.put("product", (n) -> { this.setProduct(n.getObjectValue(Product::createFromDiscriminatorValue)); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the locale property value. This request parameter sets the natural language that was provided in the field values of the request payload (i.e., en_AU, en_GB or de_DE). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:LocaleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
     * Gets the sku property value. This is the seller-defined SKU value of the product that will be listed on the eBay site (specified in the &lt;strong&gt;marketplaceId&lt;/strong&gt; field). Only one offer (in unpublished or published state) may exist for each &lt;strong&gt;sku&lt;/strong&gt;/&lt;strong&gt;marketplaceId&lt;/strong&gt;/&lt;strong&gt;format&lt;/strong&gt; combination. This field is required.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br&gt;
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
     * Sets the availability property value. This type is used to specify the quantity of the inventory item that is available for purchase if the item will be shipped to the buyer, and the quantity of the inventory item that is available for In-Store Pickup at one or more of the merchant&apos;s physical stores. In-Store Pickup is only available to large merchants selling on the US, UK, Germany, and Australia sites.
     * @param value Value to set for the availability property.
     */
    public void setAvailability(@jakarta.annotation.Nullable final Availability value) {
        this.availability = value;
    }
    /**
     * Sets the condition property value. This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. To see which item condition values that a particular eBay category supports, use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the &lt;strong&gt;Metadata API&lt;/strong&gt;. This method returns condition ID values that map to the enumeration values defined in the &lt;a href=&quot;/api-docs/sell/inventory/types/slr:ConditionEnum&quot; target=&quot;_blank&quot;&gt;ConditionEnum&lt;/a&gt; type. The &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot; target=&quot;_blank&quot;&gt;Item condition ID and name values&lt;/a&gt; topic in the &lt;strong&gt;Selling Integration Guide&lt;/strong&gt; has a table that maps condition ID values to &lt;strong&gt;ConditionEnum&lt;/strong&gt; values. The &lt;strong&gt;getItemConditionPolicies&lt;/strong&gt; call reference page has more information.&lt;br&gt;&lt;br&gt;A &lt;strong&gt;condition&lt;/strong&gt; value is optional up until the seller is ready to publish an offer with the SKU, at which time it becomes required for most eBay categories.&lt;br&gt;&lt;/div&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ConditionEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the condition property.
     */
    public void setCondition(@jakarta.annotation.Nullable final String value) {
        this.condition = value;
    }
    /**
     * Sets the conditionDescription property value. This string field is used by the seller to more clearly describe the condition of a used inventory item, or an inventory item whose &lt;strong&gt;condition&lt;/strong&gt; value is not &lt;code&gt;NEW&lt;/code&gt;, &lt;code&gt;LIKE_NEW&lt;/code&gt;, &lt;code&gt;NEW_OTHER&lt;/code&gt;, or &lt;code&gt;NEW_WITH_DEFECTS&lt;/code&gt;.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conditionDescription&lt;/strong&gt; field is available for all eBay categories. If the &lt;strong&gt;conditionDescription&lt;/strong&gt; field is used with an item in one of the new conditions (mentioned in previous paragraph), eBay will simply ignore this field if included, and eBay will return a warning message to the user. &lt;br&gt;&lt;br&gt;This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the used item. Make sure that the &lt;strong&gt;condition&lt;/strong&gt; value, condition description, listing description, and the item&apos;s pictures do not contradict one another. &lt;br&gt;&lt;br&gt;This field is not always required, but is required if an inventory item is being updated and a condition description already exists for that inventory item. &lt;br&gt;&lt;br&gt;This field is returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt;, and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls if a condition description was provided for a used inventory item.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max Length&lt;/b&gt;: 1000
     * @param value Value to set for the conditionDescription property.
     */
    public void setConditionDescription(@jakarta.annotation.Nullable final String value) {
        this.conditionDescription = value;
    }
    /**
     * Sets the conditionDescriptors property value. This container is used by the seller to provide additional information about the condition of an item in a structured format. Condition descriptors are name-value attributes that can be either closed set or open text inputs.&lt;br&gt;&lt;br&gt;For trading card listings in &lt;b&gt;Non-Sport Trading Card Singles&lt;/b&gt; (183050), &lt;b&gt;CCG Individual Cards&lt;/b&gt; (183454), and &lt;b&gt;Sports Trading Card Singles&lt;/b&gt; (261328) categories, sellers must use either &lt;code&gt;LIKE_NEW&lt;/code&gt; (2750) or &lt;code&gt;USED_VERY_GOOD&lt;/code&gt; (4000) item condition to specify the card as &lt;b&gt;Graded&lt;/b&gt; or &lt;b&gt;Ungraded&lt;/b&gt;, respectively. Use of either of these conditions requires the seller to use this array to provide one or more applicable Condition Descriptor name-value pairs.&lt;br&gt;&lt;br&gt;To retrieve all condition descriptor numeric IDs for a category, use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies&quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the Metadata API.
     * @param value Value to set for the conditionDescriptors property.
     */
    public void setConditionDescriptors(@jakarta.annotation.Nullable final java.util.List<ConditionDescriptor> value) {
        this.conditionDescriptors = value;
    }
    /**
     * Sets the locale property value. This request parameter sets the natural language that was provided in the field values of the request payload (i.e., en_AU, en_GB or de_DE). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:LocaleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
     * Sets the sku property value. This is the seller-defined SKU value of the product that will be listed on the eBay site (specified in the &lt;strong&gt;marketplaceId&lt;/strong&gt; field). Only one offer (in unpublished or published state) may exist for each &lt;strong&gt;sku&lt;/strong&gt;/&lt;strong&gt;marketplaceId&lt;/strong&gt;/&lt;strong&gt;format&lt;/strong&gt; combination. This field is required.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br&gt;
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final String value) {
        this.sku = value;
    }
}
