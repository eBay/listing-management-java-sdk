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
 * Type defining regulatory information that the seller is required to disclose.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Regulatory implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container provides a collection of regulatory documents associated with the listing.&lt;br&gt;&lt;br&gt;For information on removing one or more files from a listing using the &lt;a href= &quot;/api-docs/sell/inventory/resources/offer/methods/updateOffer&quot; target=&quot;_blank&quot;&gt;updateOffer&lt;/a&gt;  method, see &lt;a href= &quot;/api-docs/sell/static/inventory/managing-document-media.html#revise&quot; target=&quot;_blank&quot;&gt;Remove documents from listings.&lt;/a&gt; .&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As a part of General Product Safety Regulation (GPSR) requirements effective on December 13th, 2024, sellers operating in, or shipping to, EU-based countries or Northern Ireland  are conditionally required to provide regulatory document information in their eBay listings. For more information on GPSR, see &lt;a href = &quot;https://www.ebay.com/sellercenter/resources/general-product-safety-regulation &quot; target=&quot;_blank&quot;&gt;General Product Safety Regulation (GPSR)&lt;/a&gt;.&lt;/span&gt;
     */
    private java.util.List<Document> documents;
    /**
     * This type provides information about the energy efficiency for certain durable goods.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When providing energy efficiency information on an appliance or smartphones and tablets listing, the energy efficiency &lt;b&gt;rating&lt;/b&gt; and &lt;b&gt;range&lt;/b&gt; of the item must be specified through the the &lt;a href= &quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkCreateOrReplaceInventoryItem#request.requests.product.aspects&quot; target=&quot;_blank&quot;&gt;aspects&lt;/a&gt; field when creating the inventory item record. Use the &lt;a href= &quot;/api-docs/commerce/taxonomy/resources/category_tree/methods/getItemAspectsForCategory&quot; target=&quot;_blank&quot;&gt;getItemAspectsForCategory&lt;/a&gt; method of the Taxonomy API to retrieve applicable rating and range values for a specified category.&lt;/p&gt;&lt;/div&gt;
     */
    private EnergyEfficiencyLabel energyEfficiencyLabel;
    /**
     * This container is used by the seller to provide hazardous material information for the listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;statements&lt;/b&gt; element is required to complete the hazmat section of a listing.&lt;br&gt;&lt;br&gt;The following elements are optional:&lt;ul&gt;&lt;li&gt;&lt;b&gt;pictograms&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;signalWord&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;component&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private Hazmat hazmat;
    /**
     * This type provides name and contact information about the manufacturer of the item.
     */
    private Manufacturer manufacturer;
    /**
     * This type is used to define the &lt;b&gt;pictograms&lt;/b&gt; and &lt;b&gt;statement&lt;/b&gt; containers, and the optional &lt;b&gt;component&lt;/b&gt; field, that provide product safety and compliance related information.
     */
    private ProductSafety productSafety;
    /**
     * This field represents the repair index for the listing.&lt;br&gt;&lt;br&gt;The repair index identifies the manufacturer&apos;s repair score for a product (i.e., how easy is it to repair the product.) This field is a floating point value between 0.0 (i.e., difficult to repair,) and 10.0 (i.e., easily repaired.)&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; should not be used as a default value, as it implies the product is not repairable.&lt;/span&gt;&lt;br&gt;The format for &lt;b&gt;repairScore&lt;/b&gt; is limited to one decimal place. For example:&lt;ul&gt;&lt;li&gt;&lt;code&gt;7.9&lt;/code&gt; and &lt;code&gt;0.0&lt;/code&gt; are both valid scores&lt;/li&gt;&lt;li&gt;&lt;code&gt;5.645&lt;/code&gt; and &lt;code&gt;2.10&lt;/code&gt; are both invalid scores&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Repair score is not applicable to all categories. Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getExtendedProducerResponsibilityPolicies&quot; target=&quot;_blank&quot;&gt;getExtendedProducerResponsibilityPolicies&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt; to see where repair score is applicable.&lt;/span&gt;
     */
    private Double repairScore;
    /**
     * This container provides information about the EU-based Responsible Persons or entities associated with the listing.&lt;br&gt;&lt;br&gt;A maximum of 5 EU Responsible Persons are supported.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As a part of General Product Safety Regulation (GPSR) requirements effective on December 13th, 2024, sellers operating in, or shipping to, EU-based countries or Northern Ireland  are conditionally required to provide regulatory Responsible Persons information in their eBay listings. For more information on GPSR, see &lt;a href = &quot;https://www.ebay.com/sellercenter/resources/general-product-safety-regulation &quot; target=&quot;_blank&quot;&gt;General Product Safety Regulation (GPSR)&lt;/a&gt;.&lt;/span&gt;
     */
    private java.util.List<ResponsiblePerson> responsiblePersons;
    /**
     * Instantiates a new {@link Regulatory} and sets the default values.
     */
    public Regulatory() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Regulatory}
     */
    @jakarta.annotation.Nonnull
    public static Regulatory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Regulatory();
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
     * Gets the documents property value. This container provides a collection of regulatory documents associated with the listing.&lt;br&gt;&lt;br&gt;For information on removing one or more files from a listing using the &lt;a href= &quot;/api-docs/sell/inventory/resources/offer/methods/updateOffer&quot; target=&quot;_blank&quot;&gt;updateOffer&lt;/a&gt;  method, see &lt;a href= &quot;/api-docs/sell/static/inventory/managing-document-media.html#revise&quot; target=&quot;_blank&quot;&gt;Remove documents from listings.&lt;/a&gt; .&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As a part of General Product Safety Regulation (GPSR) requirements effective on December 13th, 2024, sellers operating in, or shipping to, EU-based countries or Northern Ireland  are conditionally required to provide regulatory document information in their eBay listings. For more information on GPSR, see &lt;a href = &quot;https://www.ebay.com/sellercenter/resources/general-product-safety-regulation &quot; target=&quot;_blank&quot;&gt;General Product Safety Regulation (GPSR)&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link java.util.List<Document>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Document> getDocuments() {
        return this.documents;
    }
    /**
     * Gets the energyEfficiencyLabel property value. This type provides information about the energy efficiency for certain durable goods.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When providing energy efficiency information on an appliance or smartphones and tablets listing, the energy efficiency &lt;b&gt;rating&lt;/b&gt; and &lt;b&gt;range&lt;/b&gt; of the item must be specified through the the &lt;a href= &quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkCreateOrReplaceInventoryItem#request.requests.product.aspects&quot; target=&quot;_blank&quot;&gt;aspects&lt;/a&gt; field when creating the inventory item record. Use the &lt;a href= &quot;/api-docs/commerce/taxonomy/resources/category_tree/methods/getItemAspectsForCategory&quot; target=&quot;_blank&quot;&gt;getItemAspectsForCategory&lt;/a&gt; method of the Taxonomy API to retrieve applicable rating and range values for a specified category.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link EnergyEfficiencyLabel}
     */
    @jakarta.annotation.Nullable
    public EnergyEfficiencyLabel getEnergyEfficiencyLabel() {
        return this.energyEfficiencyLabel;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("documents", (n) -> { this.setDocuments(n.getCollectionOfObjectValues(Document::createFromDiscriminatorValue)); });
        deserializerMap.put("energyEfficiencyLabel", (n) -> { this.setEnergyEfficiencyLabel(n.getObjectValue(EnergyEfficiencyLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("hazmat", (n) -> { this.setHazmat(n.getObjectValue(Hazmat::createFromDiscriminatorValue)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getObjectValue(Manufacturer::createFromDiscriminatorValue)); });
        deserializerMap.put("productSafety", (n) -> { this.setProductSafety(n.getObjectValue(ProductSafety::createFromDiscriminatorValue)); });
        deserializerMap.put("repairScore", (n) -> { this.setRepairScore(n.getDoubleValue()); });
        deserializerMap.put("responsiblePersons", (n) -> { this.setResponsiblePersons(n.getCollectionOfObjectValues(ResponsiblePerson::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hazmat property value. This container is used by the seller to provide hazardous material information for the listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;statements&lt;/b&gt; element is required to complete the hazmat section of a listing.&lt;br&gt;&lt;br&gt;The following elements are optional:&lt;ul&gt;&lt;li&gt;&lt;b&gt;pictograms&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;signalWord&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;component&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link Hazmat}
     */
    @jakarta.annotation.Nullable
    public Hazmat getHazmat() {
        return this.hazmat;
    }
    /**
     * Gets the manufacturer property value. This type provides name and contact information about the manufacturer of the item.
     * @return a {@link Manufacturer}
     */
    @jakarta.annotation.Nullable
    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the productSafety property value. This type is used to define the &lt;b&gt;pictograms&lt;/b&gt; and &lt;b&gt;statement&lt;/b&gt; containers, and the optional &lt;b&gt;component&lt;/b&gt; field, that provide product safety and compliance related information.
     * @return a {@link ProductSafety}
     */
    @jakarta.annotation.Nullable
    public ProductSafety getProductSafety() {
        return this.productSafety;
    }
    /**
     * Gets the repairScore property value. This field represents the repair index for the listing.&lt;br&gt;&lt;br&gt;The repair index identifies the manufacturer&apos;s repair score for a product (i.e., how easy is it to repair the product.) This field is a floating point value between 0.0 (i.e., difficult to repair,) and 10.0 (i.e., easily repaired.)&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; should not be used as a default value, as it implies the product is not repairable.&lt;/span&gt;&lt;br&gt;The format for &lt;b&gt;repairScore&lt;/b&gt; is limited to one decimal place. For example:&lt;ul&gt;&lt;li&gt;&lt;code&gt;7.9&lt;/code&gt; and &lt;code&gt;0.0&lt;/code&gt; are both valid scores&lt;/li&gt;&lt;li&gt;&lt;code&gt;5.645&lt;/code&gt; and &lt;code&gt;2.10&lt;/code&gt; are both invalid scores&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Repair score is not applicable to all categories. Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getExtendedProducerResponsibilityPolicies&quot; target=&quot;_blank&quot;&gt;getExtendedProducerResponsibilityPolicies&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt; to see where repair score is applicable.&lt;/span&gt;
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getRepairScore() {
        return this.repairScore;
    }
    /**
     * Gets the responsiblePersons property value. This container provides information about the EU-based Responsible Persons or entities associated with the listing.&lt;br&gt;&lt;br&gt;A maximum of 5 EU Responsible Persons are supported.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As a part of General Product Safety Regulation (GPSR) requirements effective on December 13th, 2024, sellers operating in, or shipping to, EU-based countries or Northern Ireland  are conditionally required to provide regulatory Responsible Persons information in their eBay listings. For more information on GPSR, see &lt;a href = &quot;https://www.ebay.com/sellercenter/resources/general-product-safety-regulation &quot; target=&quot;_blank&quot;&gt;General Product Safety Regulation (GPSR)&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link java.util.List<ResponsiblePerson>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResponsiblePerson> getResponsiblePersons() {
        return this.responsiblePersons;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("documents", this.getDocuments());
        writer.writeObjectValue("energyEfficiencyLabel", this.getEnergyEfficiencyLabel());
        writer.writeObjectValue("hazmat", this.getHazmat());
        writer.writeObjectValue("manufacturer", this.getManufacturer());
        writer.writeObjectValue("productSafety", this.getProductSafety());
        writer.writeDoubleValue("repairScore", this.getRepairScore());
        writer.writeCollectionOfObjectValues("responsiblePersons", this.getResponsiblePersons());
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
     * Sets the documents property value. This container provides a collection of regulatory documents associated with the listing.&lt;br&gt;&lt;br&gt;For information on removing one or more files from a listing using the &lt;a href= &quot;/api-docs/sell/inventory/resources/offer/methods/updateOffer&quot; target=&quot;_blank&quot;&gt;updateOffer&lt;/a&gt;  method, see &lt;a href= &quot;/api-docs/sell/static/inventory/managing-document-media.html#revise&quot; target=&quot;_blank&quot;&gt;Remove documents from listings.&lt;/a&gt; .&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As a part of General Product Safety Regulation (GPSR) requirements effective on December 13th, 2024, sellers operating in, or shipping to, EU-based countries or Northern Ireland  are conditionally required to provide regulatory document information in their eBay listings. For more information on GPSR, see &lt;a href = &quot;https://www.ebay.com/sellercenter/resources/general-product-safety-regulation &quot; target=&quot;_blank&quot;&gt;General Product Safety Regulation (GPSR)&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the documents property.
     */
    public void setDocuments(@jakarta.annotation.Nullable final java.util.List<Document> value) {
        this.documents = value;
    }
    /**
     * Sets the energyEfficiencyLabel property value. This type provides information about the energy efficiency for certain durable goods.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When providing energy efficiency information on an appliance or smartphones and tablets listing, the energy efficiency &lt;b&gt;rating&lt;/b&gt; and &lt;b&gt;range&lt;/b&gt; of the item must be specified through the the &lt;a href= &quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkCreateOrReplaceInventoryItem#request.requests.product.aspects&quot; target=&quot;_blank&quot;&gt;aspects&lt;/a&gt; field when creating the inventory item record. Use the &lt;a href= &quot;/api-docs/commerce/taxonomy/resources/category_tree/methods/getItemAspectsForCategory&quot; target=&quot;_blank&quot;&gt;getItemAspectsForCategory&lt;/a&gt; method of the Taxonomy API to retrieve applicable rating and range values for a specified category.&lt;/p&gt;&lt;/div&gt;
     * @param value Value to set for the energyEfficiencyLabel property.
     */
    public void setEnergyEfficiencyLabel(@jakarta.annotation.Nullable final EnergyEfficiencyLabel value) {
        this.energyEfficiencyLabel = value;
    }
    /**
     * Sets the hazmat property value. This container is used by the seller to provide hazardous material information for the listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;statements&lt;/b&gt; element is required to complete the hazmat section of a listing.&lt;br&gt;&lt;br&gt;The following elements are optional:&lt;ul&gt;&lt;li&gt;&lt;b&gt;pictograms&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;signalWord&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;component&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the hazmat property.
     */
    public void setHazmat(@jakarta.annotation.Nullable final Hazmat value) {
        this.hazmat = value;
    }
    /**
     * Sets the manufacturer property value. This type provides name and contact information about the manufacturer of the item.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final Manufacturer value) {
        this.manufacturer = value;
    }
    /**
     * Sets the productSafety property value. This type is used to define the &lt;b&gt;pictograms&lt;/b&gt; and &lt;b&gt;statement&lt;/b&gt; containers, and the optional &lt;b&gt;component&lt;/b&gt; field, that provide product safety and compliance related information.
     * @param value Value to set for the productSafety property.
     */
    public void setProductSafety(@jakarta.annotation.Nullable final ProductSafety value) {
        this.productSafety = value;
    }
    /**
     * Sets the repairScore property value. This field represents the repair index for the listing.&lt;br&gt;&lt;br&gt;The repair index identifies the manufacturer&apos;s repair score for a product (i.e., how easy is it to repair the product.) This field is a floating point value between 0.0 (i.e., difficult to repair,) and 10.0 (i.e., easily repaired.)&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; should not be used as a default value, as it implies the product is not repairable.&lt;/span&gt;&lt;br&gt;The format for &lt;b&gt;repairScore&lt;/b&gt; is limited to one decimal place. For example:&lt;ul&gt;&lt;li&gt;&lt;code&gt;7.9&lt;/code&gt; and &lt;code&gt;0.0&lt;/code&gt; are both valid scores&lt;/li&gt;&lt;li&gt;&lt;code&gt;5.645&lt;/code&gt; and &lt;code&gt;2.10&lt;/code&gt; are both invalid scores&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Repair score is not applicable to all categories. Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getExtendedProducerResponsibilityPolicies&quot; target=&quot;_blank&quot;&gt;getExtendedProducerResponsibilityPolicies&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt; to see where repair score is applicable.&lt;/span&gt;
     * @param value Value to set for the repairScore property.
     */
    public void setRepairScore(@jakarta.annotation.Nullable final Double value) {
        this.repairScore = value;
    }
    /**
     * Sets the responsiblePersons property value. This container provides information about the EU-based Responsible Persons or entities associated with the listing.&lt;br&gt;&lt;br&gt;A maximum of 5 EU Responsible Persons are supported.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As a part of General Product Safety Regulation (GPSR) requirements effective on December 13th, 2024, sellers operating in, or shipping to, EU-based countries or Northern Ireland  are conditionally required to provide regulatory Responsible Persons information in their eBay listings. For more information on GPSR, see &lt;a href = &quot;https://www.ebay.com/sellercenter/resources/general-product-safety-regulation &quot; target=&quot;_blank&quot;&gt;General Product Safety Regulation (GPSR)&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the responsiblePersons property.
     */
    public void setResponsiblePersons(@jakarta.annotation.Nullable final java.util.List<ResponsiblePerson> value) {
        this.responsiblePersons = value;
    }
}
