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
 * This type is used to enable the use of a sales-tax table, to pass in a tax exception category code, or to specify a VAT percentage.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are available only for the US and Canada marketplaces.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Tax implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * When set to &lt;code&gt;true&lt;/code&gt;, the seller&apos;s account-level sales-tax table will be used to calculate sales tax for an order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are available only for the US and Canada marketplaces.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;&lt;br&gt;For complete information about using sales-tax tables, refer to &lt;a href=&quot;/api-docs/sell/static/seller-accounts/tax-tables.html&quot; target=&quot;_blank&quot;&gt;Establishing sales-tax tables&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Note that a seller can enable the use of a sales-tax table, but if a sales-tax rate is not specified for the buyer&apos;s tax jurisdiction, sales tax will not be applied to the order.&lt;br&gt;&lt;br&gt;When a &lt;code&gt;thirdPartyTaxCategory&lt;/code&gt; value is used, &lt;code&gt;applyTax&lt;/code&gt; must also be set to &lt;code&gt;true&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.&lt;br&gt;&lt;br&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.
     */
    private Boolean applyTax;
    /**
     * The tax exception category code. If this field is used, sales tax will also apply to a service/fee, and not just the item price. This is to be used only by sellers who have opted into sales tax being calculated by a sales tax calculation vendor. If you are interested in becoming a tax calculation vendor partner with eBay, contact &lt;a href=&quot;mailto:developer-relations@ebay.com &quot;&gt;developer-relations@ebay.com&lt;/a&gt;. One supported value for this field is &lt;code&gt;WASTE_RECYCLING_FEE&lt;/code&gt;. If this field is used, the &lt;strong&gt;applyTax&lt;/strong&gt; field must also be used and set to &lt;code&gt;true&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.
     */
    private String thirdPartyTaxCategory;
    /**
     * This value is the Value Add Tax (VAT) rate for the item, if any. When a VAT percentage is specified, the item&apos;s VAT information appears on the listing&apos;s View Item page. In addition, the seller can choose to print an invoice that includes the item&apos;s net price, VAT percent, VAT amount, and total price. Since VAT rates vary depending on the item and on the user&apos;s country of residence, a seller is responsible for entering the correct VAT rate; it is not calculated by eBay. &lt;br&gt;&lt;br&gt;To use VAT, a seller must be a business seller with a VAT-ID registered with eBay, and must be listing the item on a VAT-enabled site. Max applicable length is 6 characters, including the decimal (e.g., 12.345). The scale is 3 decimal places. (If you pass in 12.3456, eBay may round up the value to 12.346).&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.
     */
    private Double vatPercentage;
    /**
     * Instantiates a new {@link Tax} and sets the default values.
     */
    public Tax() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Tax}
     */
    @jakarta.annotation.Nonnull
    public static Tax createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Tax();
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
     * Gets the applyTax property value. When set to &lt;code&gt;true&lt;/code&gt;, the seller&apos;s account-level sales-tax table will be used to calculate sales tax for an order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are available only for the US and Canada marketplaces.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;&lt;br&gt;For complete information about using sales-tax tables, refer to &lt;a href=&quot;/api-docs/sell/static/seller-accounts/tax-tables.html&quot; target=&quot;_blank&quot;&gt;Establishing sales-tax tables&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Note that a seller can enable the use of a sales-tax table, but if a sales-tax rate is not specified for the buyer&apos;s tax jurisdiction, sales tax will not be applied to the order.&lt;br&gt;&lt;br&gt;When a &lt;code&gt;thirdPartyTaxCategory&lt;/code&gt; value is used, &lt;code&gt;applyTax&lt;/code&gt; must also be set to &lt;code&gt;true&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.&lt;br&gt;&lt;br&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getApplyTax() {
        return this.applyTax;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("applyTax", (n) -> { this.setApplyTax(n.getBooleanValue()); });
        deserializerMap.put("thirdPartyTaxCategory", (n) -> { this.setThirdPartyTaxCategory(n.getStringValue()); });
        deserializerMap.put("vatPercentage", (n) -> { this.setVatPercentage(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the thirdPartyTaxCategory property value. The tax exception category code. If this field is used, sales tax will also apply to a service/fee, and not just the item price. This is to be used only by sellers who have opted into sales tax being calculated by a sales tax calculation vendor. If you are interested in becoming a tax calculation vendor partner with eBay, contact &lt;a href=&quot;mailto:developer-relations@ebay.com &quot;&gt;developer-relations@ebay.com&lt;/a&gt;. One supported value for this field is &lt;code&gt;WASTE_RECYCLING_FEE&lt;/code&gt;. If this field is used, the &lt;strong&gt;applyTax&lt;/strong&gt; field must also be used and set to &lt;code&gt;true&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThirdPartyTaxCategory() {
        return this.thirdPartyTaxCategory;
    }
    /**
     * Gets the vatPercentage property value. This value is the Value Add Tax (VAT) rate for the item, if any. When a VAT percentage is specified, the item&apos;s VAT information appears on the listing&apos;s View Item page. In addition, the seller can choose to print an invoice that includes the item&apos;s net price, VAT percent, VAT amount, and total price. Since VAT rates vary depending on the item and on the user&apos;s country of residence, a seller is responsible for entering the correct VAT rate; it is not calculated by eBay. &lt;br&gt;&lt;br&gt;To use VAT, a seller must be a business seller with a VAT-ID registered with eBay, and must be listing the item on a VAT-enabled site. Max applicable length is 6 characters, including the decimal (e.g., 12.345). The scale is 3 decimal places. (If you pass in 12.3456, eBay may round up the value to 12.346).&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getVatPercentage() {
        return this.vatPercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("applyTax", this.getApplyTax());
        writer.writeStringValue("thirdPartyTaxCategory", this.getThirdPartyTaxCategory());
        writer.writeDoubleValue("vatPercentage", this.getVatPercentage());
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
     * Sets the applyTax property value. When set to &lt;code&gt;true&lt;/code&gt;, the seller&apos;s account-level sales-tax table will be used to calculate sales tax for an order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are available only for the US and Canada marketplaces.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;&lt;br&gt;For complete information about using sales-tax tables, refer to &lt;a href=&quot;/api-docs/sell/static/seller-accounts/tax-tables.html&quot; target=&quot;_blank&quot;&gt;Establishing sales-tax tables&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Note that a seller can enable the use of a sales-tax table, but if a sales-tax rate is not specified for the buyer&apos;s tax jurisdiction, sales tax will not be applied to the order.&lt;br&gt;&lt;br&gt;When a &lt;code&gt;thirdPartyTaxCategory&lt;/code&gt; value is used, &lt;code&gt;applyTax&lt;/code&gt; must also be set to &lt;code&gt;true&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.&lt;br&gt;&lt;br&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.
     * @param value Value to set for the applyTax property.
     */
    public void setApplyTax(@jakarta.annotation.Nullable final Boolean value) {
        this.applyTax = value;
    }
    /**
     * Sets the thirdPartyTaxCategory property value. The tax exception category code. If this field is used, sales tax will also apply to a service/fee, and not just the item price. This is to be used only by sellers who have opted into sales tax being calculated by a sales tax calculation vendor. If you are interested in becoming a tax calculation vendor partner with eBay, contact &lt;a href=&quot;mailto:developer-relations@ebay.com &quot;&gt;developer-relations@ebay.com&lt;/a&gt;. One supported value for this field is &lt;code&gt;WASTE_RECYCLING_FEE&lt;/code&gt;. If this field is used, the &lt;strong&gt;applyTax&lt;/strong&gt; field must also be used and set to &lt;code&gt;true&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.
     * @param value Value to set for the thirdPartyTaxCategory property.
     */
    public void setThirdPartyTaxCategory(@jakarta.annotation.Nullable final String value) {
        this.thirdPartyTaxCategory = value;
    }
    /**
     * Sets the vatPercentage property value. This value is the Value Add Tax (VAT) rate for the item, if any. When a VAT percentage is specified, the item&apos;s VAT information appears on the listing&apos;s View Item page. In addition, the seller can choose to print an invoice that includes the item&apos;s net price, VAT percent, VAT amount, and total price. Since VAT rates vary depending on the item and on the user&apos;s country of residence, a seller is responsible for entering the correct VAT rate; it is not calculated by eBay. &lt;br&gt;&lt;br&gt;To use VAT, a seller must be a business seller with a VAT-ID registered with eBay, and must be listing the item on a VAT-enabled site. Max applicable length is 6 characters, including the decimal (e.g., 12.345). The scale is 3 decimal places. (If you pass in 12.3456, eBay may round up the value to 12.346).&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.
     * @param value Value to set for the vatPercentage property.
     */
    public void setVatPercentage(@jakarta.annotation.Nullable final Double value) {
        this.vatPercentage = value;
    }
}
