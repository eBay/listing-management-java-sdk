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
 * This type provides information about the energy efficiency for certain durable goods.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When providing energy efficiency information on an appliance or smartphones and tablets listing, the energy efficiency &lt;b&gt;rating&lt;/b&gt; and &lt;b&gt;range&lt;/b&gt; of the item must be specified through the the &lt;a href= &quot;/api-docs/sell/inventory/resources/inventory_item/methods/bulkCreateOrReplaceInventoryItem#request.requests.product.aspects&quot; target=&quot;_blank&quot;&gt;aspects&lt;/a&gt; field when creating the inventory item record. Use the &lt;a href= &quot;/api-docs/commerce/taxonomy/resources/category_tree/methods/getItemAspectsForCategory&quot; target=&quot;_blank&quot;&gt;getItemAspectsForCategory&lt;/a&gt; method of the Taxonomy API to retrieve applicable rating and range values for a specified category.&lt;/p&gt;&lt;/div&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnergyEfficiencyLabel implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A brief verbal summary of the information included on the Energy Efficiency Label for an item.&lt;br&gt;&lt;br&gt;For example, &lt;i&gt;On a scale of A to G the rating is E.&lt;/i&gt;
     */
    private String imageDescription;
    /**
     * The URL to the Energy Efficiency Label image that is applicable to an item.
     */
    private String imageURL;
    /**
     * The URL to the Product Information Sheet that provides complete manufacturer-provided efficiency information about an item.
     */
    private String productInformationSheet;
    /**
     * Instantiates a new {@link EnergyEfficiencyLabel} and sets the default values.
     */
    public EnergyEfficiencyLabel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnergyEfficiencyLabel}
     */
    @jakarta.annotation.Nonnull
    public static EnergyEfficiencyLabel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnergyEfficiencyLabel();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("imageDescription", (n) -> { this.setImageDescription(n.getStringValue()); });
        deserializerMap.put("imageURL", (n) -> { this.setImageURL(n.getStringValue()); });
        deserializerMap.put("productInformationSheet", (n) -> { this.setProductInformationSheet(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the imageDescription property value. A brief verbal summary of the information included on the Energy Efficiency Label for an item.&lt;br&gt;&lt;br&gt;For example, &lt;i&gt;On a scale of A to G the rating is E.&lt;/i&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageDescription() {
        return this.imageDescription;
    }
    /**
     * Gets the imageURL property value. The URL to the Energy Efficiency Label image that is applicable to an item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageURL() {
        return this.imageURL;
    }
    /**
     * Gets the productInformationSheet property value. The URL to the Product Information Sheet that provides complete manufacturer-provided efficiency information about an item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductInformationSheet() {
        return this.productInformationSheet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("imageDescription", this.getImageDescription());
        writer.writeStringValue("imageURL", this.getImageURL());
        writer.writeStringValue("productInformationSheet", this.getProductInformationSheet());
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
     * Sets the imageDescription property value. A brief verbal summary of the information included on the Energy Efficiency Label for an item.&lt;br&gt;&lt;br&gt;For example, &lt;i&gt;On a scale of A to G the rating is E.&lt;/i&gt;
     * @param value Value to set for the imageDescription property.
     */
    public void setImageDescription(@jakarta.annotation.Nullable final String value) {
        this.imageDescription = value;
    }
    /**
     * Sets the imageURL property value. The URL to the Energy Efficiency Label image that is applicable to an item.
     * @param value Value to set for the imageURL property.
     */
    public void setImageURL(@jakarta.annotation.Nullable final String value) {
        this.imageURL = value;
    }
    /**
     * Sets the productInformationSheet property value. The URL to the Product Information Sheet that provides complete manufacturer-provided efficiency information about an item.
     * @param value Value to set for the productInformationSheet property.
     */
    public void setProductInformationSheet(@jakarta.annotation.Nullable final String value) {
        this.productInformationSheet = value;
    }
}
