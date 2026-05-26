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
 * This type is used to specify product aspects for which variations within an inventory item group vary, and the order in which they appear in the listing. For example, t-shirts in an inventory item group may be available in multiple sizes and colors.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Specification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This is the name of product variation aspect. Typically, for clothing, typical aspect names are &lt;code&gt;&quot;Size&quot;&lt;/code&gt; and &lt;code&gt;&quot;Color&quot;&lt;/code&gt;. Product variation aspects are not required immediately upon creating an inventory item group, but these aspects will be required before a multiple-variation listing containing this inventory item group is published. For each product variation aspect that is specified through the &lt;strong&gt;specifications&lt;/strong&gt; container, one &lt;strong&gt;name&lt;/strong&gt; value is required and two or more variations of this aspect are required through the &lt;strong&gt;values&lt;/strong&gt; array.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Each member of the inventory item group should have these same aspect names specified through the &lt;strong&gt;product.aspects&lt;/strong&gt; container when the inventory item is created with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; or &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call. &lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 40
     */
    private String name;
    /**
     * This is an array of values pertaining to the corresponding product variation aspect (specified in the &lt;strong&gt;name&lt;/strong&gt; field). Below is a sample of how these values will appear under a &lt;strong&gt;specifications&lt;/strong&gt; container: &lt;br&gt; &lt;pre&gt;&lt;code&gt;&quot;specifications&quot;: [{&lt;br&gt; &quot;name&quot;: &quot;Size&quot;,&lt;br&gt; &quot;values&quot;: [&quot;Small&quot;,&lt;br&gt; &quot;Medium&quot;,&lt;br&gt; &quot;Large&quot;]&lt;br&gt; },&lt;br&gt; { &lt;br&gt; &quot;name&quot;: &quot;Color&quot;,&lt;br&gt; &quot;values&quot;: [&quot;Blue&quot;,&lt;br&gt; &quot;White&quot;,&lt;br&gt; &quot;Red&quot;] &lt;br&gt; }] &lt;/pre&gt;&lt;/code&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Each member of the inventory item group should have these same aspect names, and each individual inventory item should have each variation of the product aspect values specified through the &lt;strong&gt;product.aspects&lt;/strong&gt; container when the inventory item is created with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; or &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call. &lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This array is required and at least one value that matches the corresponding aspect name must be specified.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50
     */
    private java.util.List<String> values;
    /**
     * Instantiates a new {@link Specification} and sets the default values.
     */
    public Specification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Specification}
     */
    @jakarta.annotation.Nonnull
    public static Specification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Specification();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. This is the name of product variation aspect. Typically, for clothing, typical aspect names are &lt;code&gt;&quot;Size&quot;&lt;/code&gt; and &lt;code&gt;&quot;Color&quot;&lt;/code&gt;. Product variation aspects are not required immediately upon creating an inventory item group, but these aspects will be required before a multiple-variation listing containing this inventory item group is published. For each product variation aspect that is specified through the &lt;strong&gt;specifications&lt;/strong&gt; container, one &lt;strong&gt;name&lt;/strong&gt; value is required and two or more variations of this aspect are required through the &lt;strong&gt;values&lt;/strong&gt; array.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Each member of the inventory item group should have these same aspect names specified through the &lt;strong&gt;product.aspects&lt;/strong&gt; container when the inventory item is created with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; or &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call. &lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 40
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the values property value. This is an array of values pertaining to the corresponding product variation aspect (specified in the &lt;strong&gt;name&lt;/strong&gt; field). Below is a sample of how these values will appear under a &lt;strong&gt;specifications&lt;/strong&gt; container: &lt;br&gt; &lt;pre&gt;&lt;code&gt;&quot;specifications&quot;: [{&lt;br&gt; &quot;name&quot;: &quot;Size&quot;,&lt;br&gt; &quot;values&quot;: [&quot;Small&quot;,&lt;br&gt; &quot;Medium&quot;,&lt;br&gt; &quot;Large&quot;]&lt;br&gt; },&lt;br&gt; { &lt;br&gt; &quot;name&quot;: &quot;Color&quot;,&lt;br&gt; &quot;values&quot;: [&quot;Blue&quot;,&lt;br&gt; &quot;White&quot;,&lt;br&gt; &quot;Red&quot;] &lt;br&gt; }] &lt;/pre&gt;&lt;/code&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Each member of the inventory item group should have these same aspect names, and each individual inventory item should have each variation of the product aspect values specified through the &lt;strong&gt;product.aspects&lt;/strong&gt; container when the inventory item is created with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; or &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call. &lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This array is required and at least one value that matches the corresponding aspect name must be specified.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getValues() {
        return this.values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
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
     * Sets the name property value. This is the name of product variation aspect. Typically, for clothing, typical aspect names are &lt;code&gt;&quot;Size&quot;&lt;/code&gt; and &lt;code&gt;&quot;Color&quot;&lt;/code&gt;. Product variation aspects are not required immediately upon creating an inventory item group, but these aspects will be required before a multiple-variation listing containing this inventory item group is published. For each product variation aspect that is specified through the &lt;strong&gt;specifications&lt;/strong&gt; container, one &lt;strong&gt;name&lt;/strong&gt; value is required and two or more variations of this aspect are required through the &lt;strong&gt;values&lt;/strong&gt; array.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Each member of the inventory item group should have these same aspect names specified through the &lt;strong&gt;product.aspects&lt;/strong&gt; container when the inventory item is created with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; or &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call. &lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 40
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the values property value. This is an array of values pertaining to the corresponding product variation aspect (specified in the &lt;strong&gt;name&lt;/strong&gt; field). Below is a sample of how these values will appear under a &lt;strong&gt;specifications&lt;/strong&gt; container: &lt;br&gt; &lt;pre&gt;&lt;code&gt;&quot;specifications&quot;: [{&lt;br&gt; &quot;name&quot;: &quot;Size&quot;,&lt;br&gt; &quot;values&quot;: [&quot;Small&quot;,&lt;br&gt; &quot;Medium&quot;,&lt;br&gt; &quot;Large&quot;]&lt;br&gt; },&lt;br&gt; { &lt;br&gt; &quot;name&quot;: &quot;Color&quot;,&lt;br&gt; &quot;values&quot;: [&quot;Blue&quot;,&lt;br&gt; &quot;White&quot;,&lt;br&gt; &quot;Red&quot;] &lt;br&gt; }] &lt;/pre&gt;&lt;/code&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Each member of the inventory item group should have these same aspect names, and each individual inventory item should have each variation of the product aspect values specified through the &lt;strong&gt;product.aspects&lt;/strong&gt; container when the inventory item is created with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; or &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call. &lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This array is required and at least one value that matches the corresponding aspect name must be specified.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.values = value;
    }
}
