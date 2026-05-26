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
 * This type is used to define the &lt;b&gt;pictograms&lt;/b&gt; and &lt;b&gt;statement&lt;/b&gt; containers, and the optional &lt;b&gt;component&lt;/b&gt; field, that provide product safety and compliance related information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductSafety implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is used by the seller to provide product safety component information for the listing. For example, component information can include specific warnings related to product safety, such as &apos;Tipping hazard&apos;. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Component information can only be specified if used with the &lt;b&gt;pictograms&lt;/b&gt; and/or &lt;b&gt;statements&lt;/b&gt; field; if the component is provided without one or both of these fields, an error will occur.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 120 characters
     */
    private String component;
    /**
     * An array of comma-separated string values used to provide product safety pictogram(s) for the listing.&lt;br&gt;&lt;br&gt;If your product shows universal product safety or compliance symbols, please select the values corresponding to the product safety pictograms for display in the product safety section of the listing. The seller specifies the identifier of each pictogram in this field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For product safety pictograms, use the &lt;a href= &quot;/api-docs/sell/metadata/resources/marketplace/methods/getProductSafetyLabels&quot; target=&quot;_blank&quot;&gt;getProductSafetyLabels&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt; to find supported values for a specific marketplace/site.&lt;/span&gt;&lt;br&gt;A maximum of 2 pictograms are allowed for product safety.
     */
    private java.util.List<String> pictograms;
    /**
     * An array of comma-separated string values used to provide product safety statement(s) for the listing.&lt;br&gt;&lt;br&gt;If your product shows universal product safety or compliance warnings, please select the values corresponding to the product safety statements for display in the product safety section of the listing. The seller specifies the identifier of each statement in this field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For product safety statements, use the &lt;a href= &quot;/api-docs/sell/metadata/resources/marketplace/methods/getProductSafetyLabels&quot; target=&quot;_blank&quot;&gt;getProductSafetyLabels&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt; to find supported values for a specific marketplace/site.&lt;/span&gt;&lt;br&gt;A maximum of 8 statements are allowed for product safety.
     */
    private java.util.List<String> statements;
    /**
     * Instantiates a new {@link ProductSafety} and sets the default values.
     */
    public ProductSafety() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProductSafety}
     */
    @jakarta.annotation.Nonnull
    public static ProductSafety createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProductSafety();
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
     * Gets the component property value. This field is used by the seller to provide product safety component information for the listing. For example, component information can include specific warnings related to product safety, such as &apos;Tipping hazard&apos;. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Component information can only be specified if used with the &lt;b&gt;pictograms&lt;/b&gt; and/or &lt;b&gt;statements&lt;/b&gt; field; if the component is provided without one or both of these fields, an error will occur.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 120 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComponent() {
        return this.component;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("component", (n) -> { this.setComponent(n.getStringValue()); });
        deserializerMap.put("pictograms", (n) -> { this.setPictograms(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("statements", (n) -> { this.setStatements(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the pictograms property value. An array of comma-separated string values used to provide product safety pictogram(s) for the listing.&lt;br&gt;&lt;br&gt;If your product shows universal product safety or compliance symbols, please select the values corresponding to the product safety pictograms for display in the product safety section of the listing. The seller specifies the identifier of each pictogram in this field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For product safety pictograms, use the &lt;a href= &quot;/api-docs/sell/metadata/resources/marketplace/methods/getProductSafetyLabels&quot; target=&quot;_blank&quot;&gt;getProductSafetyLabels&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt; to find supported values for a specific marketplace/site.&lt;/span&gt;&lt;br&gt;A maximum of 2 pictograms are allowed for product safety.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPictograms() {
        return this.pictograms;
    }
    /**
     * Gets the statements property value. An array of comma-separated string values used to provide product safety statement(s) for the listing.&lt;br&gt;&lt;br&gt;If your product shows universal product safety or compliance warnings, please select the values corresponding to the product safety statements for display in the product safety section of the listing. The seller specifies the identifier of each statement in this field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For product safety statements, use the &lt;a href= &quot;/api-docs/sell/metadata/resources/marketplace/methods/getProductSafetyLabels&quot; target=&quot;_blank&quot;&gt;getProductSafetyLabels&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt; to find supported values for a specific marketplace/site.&lt;/span&gt;&lt;br&gt;A maximum of 8 statements are allowed for product safety.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStatements() {
        return this.statements;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("component", this.getComponent());
        writer.writeCollectionOfPrimitiveValues("pictograms", this.getPictograms());
        writer.writeCollectionOfPrimitiveValues("statements", this.getStatements());
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
     * Sets the component property value. This field is used by the seller to provide product safety component information for the listing. For example, component information can include specific warnings related to product safety, such as &apos;Tipping hazard&apos;. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Component information can only be specified if used with the &lt;b&gt;pictograms&lt;/b&gt; and/or &lt;b&gt;statements&lt;/b&gt; field; if the component is provided without one or both of these fields, an error will occur.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 120 characters
     * @param value Value to set for the component property.
     */
    public void setComponent(@jakarta.annotation.Nullable final String value) {
        this.component = value;
    }
    /**
     * Sets the pictograms property value. An array of comma-separated string values used to provide product safety pictogram(s) for the listing.&lt;br&gt;&lt;br&gt;If your product shows universal product safety or compliance symbols, please select the values corresponding to the product safety pictograms for display in the product safety section of the listing. The seller specifies the identifier of each pictogram in this field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For product safety pictograms, use the &lt;a href= &quot;/api-docs/sell/metadata/resources/marketplace/methods/getProductSafetyLabels&quot; target=&quot;_blank&quot;&gt;getProductSafetyLabels&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt; to find supported values for a specific marketplace/site.&lt;/span&gt;&lt;br&gt;A maximum of 2 pictograms are allowed for product safety.
     * @param value Value to set for the pictograms property.
     */
    public void setPictograms(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.pictograms = value;
    }
    /**
     * Sets the statements property value. An array of comma-separated string values used to provide product safety statement(s) for the listing.&lt;br&gt;&lt;br&gt;If your product shows universal product safety or compliance warnings, please select the values corresponding to the product safety statements for display in the product safety section of the listing. The seller specifies the identifier of each statement in this field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For product safety statements, use the &lt;a href= &quot;/api-docs/sell/metadata/resources/marketplace/methods/getProductSafetyLabels&quot; target=&quot;_blank&quot;&gt;getProductSafetyLabels&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt; to find supported values for a specific marketplace/site.&lt;/span&gt;&lt;br&gt;A maximum of 8 statements are allowed for product safety.
     * @param value Value to set for the statements property.
     */
    public void setStatements(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.statements = value;
    }
}
