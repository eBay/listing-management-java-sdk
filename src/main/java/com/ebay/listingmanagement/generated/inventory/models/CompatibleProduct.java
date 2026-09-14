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
 * This type is used to specify/indicate the motor vehicles that are compatible with the corresponding inventory item. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CompatibleProduct implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container consists of an array of motor vehicles that are compatible with the motor vehicle part or accessory specified by the SKU value in the call URI. Each motor vehicle is defined through a separate set of name/value pairs. In the &lt;strong&gt;name&lt;/strong&gt; field, the vehicle aspect (such as &apos;make&apos;, &apos;model&apos;, &apos;year&apos;, &apos;trim&apos;, or &apos;engine&apos;) will be identified, and the &lt;strong&gt;value&lt;/strong&gt; field will be used to identify the value of each aspect.&lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getcompatibilityproperties&quot; target=&quot;_blank&quot;&gt;getCompatibilityProperties&lt;/a&gt; method of the Taxonomy API can be used to retrieve applicable vehicle aspect names for a specified category, and the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getcompatibilitypropertyvalues&quot; target=&quot;_blank&quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; method of the Taxonomy API can be used to retrieve possible values for these same vehicle aspect names.&lt;br&gt;&lt;br&gt;Below is an example of identifying one motor vehicle using the &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container:&lt;br&gt;&lt;br&gt;&lt;pre&gt;&amp;quot;compatibilityProperties&amp;quot; : &amp;#91;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;make&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;Subaru&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;model&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;GL&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;year&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;1983&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;trim&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;Base Wagon 4-Door&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;engine&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;1.8L Turbocharged&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;&lt;br&gt;&amp;#93;&lt;/pre&gt;&lt;br&gt;&lt;br&gt;Typically, the make, model, and year of the motor vehicle are always required, with the trim and engine being necessary sometimes, but it will be dependent on the part or accessory, and on the vehicle class.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;productFamilyProperties&lt;/strong&gt; container is deprecated and should no longer be used. The &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container should be used instead.&lt;/span&gt;
     */
    private java.util.List<NameValueList> compatibilityProperties;
    /**
     * This field is used by the seller to input any notes pertaining to the compatible vehicle list being defined. The seller might use this field to specify the placement of the part on a vehicle or other applicable information.&lt;br&gt;&lt;br&gt;This field will only be returned if specified by the seller.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Maximum length&lt;/strong&gt;: 500&lt;br&gt;
     */
    private String notes;
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The &lt;strong&gt;productFamilyProperties&lt;/strong&gt; container is deprecated and should no longer be used. The &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container should be used instead.&lt;/p&gt;&lt;/div&gt;
     */
    private ProductFamilyProperties productFamilyProperties;
    /**
     * This container is used in a &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; call to identify a motor vehicle that is compatible with the inventory item. The user specifies either an eBay Product ID (ePID) or K-Type value to identify a vehicle, and if the motor vehicle is found in the eBay product catalog, the motor vehicle properties (make, model, year, trim, engine) will automatically be populated for the vehicle. If the vehicle cannot be found using these identifiers, the vehicle will not be added to the compatible vehicle list. &lt;br&gt;&lt;br&gt;Note that this container will not be returned in the &lt;strong&gt;getProductCompatibility&lt;/strong&gt; call.
     */
    private ProductIdentifier productIdentifier;
    /**
     * Instantiates a new {@link CompatibleProduct} and sets the default values.
     */
    public CompatibleProduct() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CompatibleProduct}
     */
    @jakarta.annotation.Nonnull
    public static CompatibleProduct createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompatibleProduct();
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
     * Gets the compatibilityProperties property value. This container consists of an array of motor vehicles that are compatible with the motor vehicle part or accessory specified by the SKU value in the call URI. Each motor vehicle is defined through a separate set of name/value pairs. In the &lt;strong&gt;name&lt;/strong&gt; field, the vehicle aspect (such as &apos;make&apos;, &apos;model&apos;, &apos;year&apos;, &apos;trim&apos;, or &apos;engine&apos;) will be identified, and the &lt;strong&gt;value&lt;/strong&gt; field will be used to identify the value of each aspect.&lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getcompatibilityproperties&quot; target=&quot;_blank&quot;&gt;getCompatibilityProperties&lt;/a&gt; method of the Taxonomy API can be used to retrieve applicable vehicle aspect names for a specified category, and the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getcompatibilitypropertyvalues&quot; target=&quot;_blank&quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; method of the Taxonomy API can be used to retrieve possible values for these same vehicle aspect names.&lt;br&gt;&lt;br&gt;Below is an example of identifying one motor vehicle using the &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container:&lt;br&gt;&lt;br&gt;&lt;pre&gt;&amp;quot;compatibilityProperties&amp;quot; : &amp;#91;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;make&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;Subaru&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;model&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;GL&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;year&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;1983&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;trim&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;Base Wagon 4-Door&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;engine&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;1.8L Turbocharged&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;&lt;br&gt;&amp;#93;&lt;/pre&gt;&lt;br&gt;&lt;br&gt;Typically, the make, model, and year of the motor vehicle are always required, with the trim and engine being necessary sometimes, but it will be dependent on the part or accessory, and on the vehicle class.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;productFamilyProperties&lt;/strong&gt; container is deprecated and should no longer be used. The &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container should be used instead.&lt;/span&gt;
     * @return a {@link java.util.List<NameValueList>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NameValueList> getCompatibilityProperties() {
        return this.compatibilityProperties;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("compatibilityProperties", (n) -> { this.setCompatibilityProperties(n.getCollectionOfObjectValues(NameValueList::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("productFamilyProperties", (n) -> { this.setProductFamilyProperties(n.getObjectValue(ProductFamilyProperties::createFromDiscriminatorValue)); });
        deserializerMap.put("productIdentifier", (n) -> { this.setProductIdentifier(n.getObjectValue(ProductIdentifier::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the notes property value. This field is used by the seller to input any notes pertaining to the compatible vehicle list being defined. The seller might use this field to specify the placement of the part on a vehicle or other applicable information.&lt;br&gt;&lt;br&gt;This field will only be returned if specified by the seller.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Maximum length&lt;/strong&gt;: 500&lt;br&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the productFamilyProperties property value. &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The &lt;strong&gt;productFamilyProperties&lt;/strong&gt; container is deprecated and should no longer be used. The &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container should be used instead.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link ProductFamilyProperties}
     */
    @jakarta.annotation.Nullable
    public ProductFamilyProperties getProductFamilyProperties() {
        return this.productFamilyProperties;
    }
    /**
     * Gets the productIdentifier property value. This container is used in a &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; call to identify a motor vehicle that is compatible with the inventory item. The user specifies either an eBay Product ID (ePID) or K-Type value to identify a vehicle, and if the motor vehicle is found in the eBay product catalog, the motor vehicle properties (make, model, year, trim, engine) will automatically be populated for the vehicle. If the vehicle cannot be found using these identifiers, the vehicle will not be added to the compatible vehicle list. &lt;br&gt;&lt;br&gt;Note that this container will not be returned in the &lt;strong&gt;getProductCompatibility&lt;/strong&gt; call.
     * @return a {@link ProductIdentifier}
     */
    @jakarta.annotation.Nullable
    public ProductIdentifier getProductIdentifier() {
        return this.productIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("compatibilityProperties", this.getCompatibilityProperties());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeObjectValue("productFamilyProperties", this.getProductFamilyProperties());
        writer.writeObjectValue("productIdentifier", this.getProductIdentifier());
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
     * Sets the compatibilityProperties property value. This container consists of an array of motor vehicles that are compatible with the motor vehicle part or accessory specified by the SKU value in the call URI. Each motor vehicle is defined through a separate set of name/value pairs. In the &lt;strong&gt;name&lt;/strong&gt; field, the vehicle aspect (such as &apos;make&apos;, &apos;model&apos;, &apos;year&apos;, &apos;trim&apos;, or &apos;engine&apos;) will be identified, and the &lt;strong&gt;value&lt;/strong&gt; field will be used to identify the value of each aspect.&lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getcompatibilityproperties&quot; target=&quot;_blank&quot;&gt;getCompatibilityProperties&lt;/a&gt; method of the Taxonomy API can be used to retrieve applicable vehicle aspect names for a specified category, and the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getcompatibilitypropertyvalues&quot; target=&quot;_blank&quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; method of the Taxonomy API can be used to retrieve possible values for these same vehicle aspect names.&lt;br&gt;&lt;br&gt;Below is an example of identifying one motor vehicle using the &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container:&lt;br&gt;&lt;br&gt;&lt;pre&gt;&amp;quot;compatibilityProperties&amp;quot; : &amp;#91;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;make&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;Subaru&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;model&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;GL&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;year&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;1983&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;trim&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;Base Wagon 4-Door&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#123;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;name&amp;quot; : &amp;quot;engine&amp;quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;quot;value&amp;quot; : &amp;quot;1.8L Turbocharged&amp;quot;&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;#125;&lt;br&gt;&amp;#93;&lt;/pre&gt;&lt;br&gt;&lt;br&gt;Typically, the make, model, and year of the motor vehicle are always required, with the trim and engine being necessary sometimes, but it will be dependent on the part or accessory, and on the vehicle class.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;productFamilyProperties&lt;/strong&gt; container is deprecated and should no longer be used. The &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container should be used instead.&lt;/span&gt;
     * @param value Value to set for the compatibilityProperties property.
     */
    public void setCompatibilityProperties(@jakarta.annotation.Nullable final java.util.List<NameValueList> value) {
        this.compatibilityProperties = value;
    }
    /**
     * Sets the notes property value. This field is used by the seller to input any notes pertaining to the compatible vehicle list being defined. The seller might use this field to specify the placement of the part on a vehicle or other applicable information.&lt;br&gt;&lt;br&gt;This field will only be returned if specified by the seller.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Maximum length&lt;/strong&gt;: 500&lt;br&gt;
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the productFamilyProperties property value. &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The &lt;strong&gt;productFamilyProperties&lt;/strong&gt; container is deprecated and should no longer be used. The &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container should be used instead.&lt;/p&gt;&lt;/div&gt;
     * @param value Value to set for the productFamilyProperties property.
     */
    public void setProductFamilyProperties(@jakarta.annotation.Nullable final ProductFamilyProperties value) {
        this.productFamilyProperties = value;
    }
    /**
     * Sets the productIdentifier property value. This container is used in a &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; call to identify a motor vehicle that is compatible with the inventory item. The user specifies either an eBay Product ID (ePID) or K-Type value to identify a vehicle, and if the motor vehicle is found in the eBay product catalog, the motor vehicle properties (make, model, year, trim, engine) will automatically be populated for the vehicle. If the vehicle cannot be found using these identifiers, the vehicle will not be added to the compatible vehicle list. &lt;br&gt;&lt;br&gt;Note that this container will not be returned in the &lt;strong&gt;getProductCompatibility&lt;/strong&gt; call.
     * @param value Value to set for the productIdentifier property.
     */
    public void setProductIdentifier(@jakarta.annotation.Nullable final ProductIdentifier value) {
        this.productIdentifier = value;
    }
}
