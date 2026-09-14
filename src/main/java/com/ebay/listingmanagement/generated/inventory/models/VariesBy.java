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
 * This type is used to specify the product aspect(s) where individual items of the group vary, as well as a list of the available variations of those aspects.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VariesBy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Use this container when the seller wants to include multiple images to demonstrate how variations within a multiple-variation listing differ. In this array, specify the product aspect used to drive the image variation, such as &lt;code&gt;Color&lt;/code&gt;. If &lt;code&gt;Color&lt;/code&gt; is specified in this field, &lt;code&gt;Color&lt;/code&gt; must also be one of the &lt;strong&gt;specifications.name&lt;/strong&gt; values, and all available colors must appear in the corresponding &lt;strong&gt;specifications.values&lt;/strong&gt; array.&lt;br&gt;&lt;br&gt;If this container is used, provide links to images of each variation through the &lt;strong&gt;imageUrls&lt;/strong&gt; container of the inventory item group, or the seller can choose to include those links to images in each inventory item record for the inventory items in the group.&lt;br&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only the first aspect in the array is used to determine image variation. Additional aspects in the array are ignored; effectively, this field supports only one aspect. &lt;/span&gt;&lt;/p&gt;&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This array is required and at least one aspect (such as &lt;code&gt;Color&lt;/code&gt;) must be specified before an offer can be published to create an active listing.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     */
    private java.util.List<String> aspectsImageVariesBy;
    /**
     * This container consists of an array of one or more product aspects where each variation differs, and values for each of those product aspects. This container is not immediately required, but will be required before the first offer of the inventory item group is published. &lt;br&gt;&lt;br&gt;If a product aspect is specified in the &lt;strong&gt;aspectsImageVariesBy&lt;/strong&gt; container, this product aspect (along with all variations of that product aspect) must be included in the &lt;strong&gt;specifications&lt;/strong&gt; container. Before offers related to the inventory item group are published, the product aspects and values specified through the &lt;strong&gt;specifications&lt;/strong&gt; container should be in synch with the name-value pairs specified through the &lt;strong&gt;product.aspects&lt;/strong&gt; containers of the inventory items contained in the group. For example, if &lt;code&gt;Color&lt;/code&gt; and &lt;code&gt;Size&lt;/code&gt; are in this &lt;strong&gt;specifications&lt;/strong&gt; container, each inventory item of the group should also have &lt;code&gt;Color&lt;/code&gt; and &lt;code&gt;Size&lt;/code&gt; as aspect names in their inventory item records.&lt;br&gt;&lt;br&gt;This container is always returned if one or more offers associated with the inventory item group have been published. For inventory item groups that have yet to have any published offers, this container is only returned if set.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This array is required and at least one aspect with the available variations must be specified.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     */
    private java.util.List<Specification> specifications;
    /**
     * Instantiates a new {@link VariesBy} and sets the default values.
     */
    public VariesBy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VariesBy}
     */
    @jakarta.annotation.Nonnull
    public static VariesBy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VariesBy();
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
     * Gets the aspectsImageVariesBy property value. Use this container when the seller wants to include multiple images to demonstrate how variations within a multiple-variation listing differ. In this array, specify the product aspect used to drive the image variation, such as &lt;code&gt;Color&lt;/code&gt;. If &lt;code&gt;Color&lt;/code&gt; is specified in this field, &lt;code&gt;Color&lt;/code&gt; must also be one of the &lt;strong&gt;specifications.name&lt;/strong&gt; values, and all available colors must appear in the corresponding &lt;strong&gt;specifications.values&lt;/strong&gt; array.&lt;br&gt;&lt;br&gt;If this container is used, provide links to images of each variation through the &lt;strong&gt;imageUrls&lt;/strong&gt; container of the inventory item group, or the seller can choose to include those links to images in each inventory item record for the inventory items in the group.&lt;br&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only the first aspect in the array is used to determine image variation. Additional aspects in the array are ignored; effectively, this field supports only one aspect. &lt;/span&gt;&lt;/p&gt;&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This array is required and at least one aspect (such as &lt;code&gt;Color&lt;/code&gt;) must be specified before an offer can be published to create an active listing.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAspectsImageVariesBy() {
        return this.aspectsImageVariesBy;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("aspectsImageVariesBy", (n) -> { this.setAspectsImageVariesBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("specifications", (n) -> { this.setSpecifications(n.getCollectionOfObjectValues(Specification::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the specifications property value. This container consists of an array of one or more product aspects where each variation differs, and values for each of those product aspects. This container is not immediately required, but will be required before the first offer of the inventory item group is published. &lt;br&gt;&lt;br&gt;If a product aspect is specified in the &lt;strong&gt;aspectsImageVariesBy&lt;/strong&gt; container, this product aspect (along with all variations of that product aspect) must be included in the &lt;strong&gt;specifications&lt;/strong&gt; container. Before offers related to the inventory item group are published, the product aspects and values specified through the &lt;strong&gt;specifications&lt;/strong&gt; container should be in synch with the name-value pairs specified through the &lt;strong&gt;product.aspects&lt;/strong&gt; containers of the inventory items contained in the group. For example, if &lt;code&gt;Color&lt;/code&gt; and &lt;code&gt;Size&lt;/code&gt; are in this &lt;strong&gt;specifications&lt;/strong&gt; container, each inventory item of the group should also have &lt;code&gt;Color&lt;/code&gt; and &lt;code&gt;Size&lt;/code&gt; as aspect names in their inventory item records.&lt;br&gt;&lt;br&gt;This container is always returned if one or more offers associated with the inventory item group have been published. For inventory item groups that have yet to have any published offers, this container is only returned if set.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This array is required and at least one aspect with the available variations must be specified.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @return a {@link java.util.List<Specification>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Specification> getSpecifications() {
        return this.specifications;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("aspectsImageVariesBy", this.getAspectsImageVariesBy());
        writer.writeCollectionOfObjectValues("specifications", this.getSpecifications());
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
     * Sets the aspectsImageVariesBy property value. Use this container when the seller wants to include multiple images to demonstrate how variations within a multiple-variation listing differ. In this array, specify the product aspect used to drive the image variation, such as &lt;code&gt;Color&lt;/code&gt;. If &lt;code&gt;Color&lt;/code&gt; is specified in this field, &lt;code&gt;Color&lt;/code&gt; must also be one of the &lt;strong&gt;specifications.name&lt;/strong&gt; values, and all available colors must appear in the corresponding &lt;strong&gt;specifications.values&lt;/strong&gt; array.&lt;br&gt;&lt;br&gt;If this container is used, provide links to images of each variation through the &lt;strong&gt;imageUrls&lt;/strong&gt; container of the inventory item group, or the seller can choose to include those links to images in each inventory item record for the inventory items in the group.&lt;br&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only the first aspect in the array is used to determine image variation. Additional aspects in the array are ignored; effectively, this field supports only one aspect. &lt;/span&gt;&lt;/p&gt;&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This array is required and at least one aspect (such as &lt;code&gt;Color&lt;/code&gt;) must be specified before an offer can be published to create an active listing.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @param value Value to set for the aspectsImageVariesBy property.
     */
    public void setAspectsImageVariesBy(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.aspectsImageVariesBy = value;
    }
    /**
     * Sets the specifications property value. This container consists of an array of one or more product aspects where each variation differs, and values for each of those product aspects. This container is not immediately required, but will be required before the first offer of the inventory item group is published. &lt;br&gt;&lt;br&gt;If a product aspect is specified in the &lt;strong&gt;aspectsImageVariesBy&lt;/strong&gt; container, this product aspect (along with all variations of that product aspect) must be included in the &lt;strong&gt;specifications&lt;/strong&gt; container. Before offers related to the inventory item group are published, the product aspects and values specified through the &lt;strong&gt;specifications&lt;/strong&gt; container should be in synch with the name-value pairs specified through the &lt;strong&gt;product.aspects&lt;/strong&gt; containers of the inventory items contained in the group. For example, if &lt;code&gt;Color&lt;/code&gt; and &lt;code&gt;Size&lt;/code&gt; are in this &lt;strong&gt;specifications&lt;/strong&gt; container, each inventory item of the group should also have &lt;code&gt;Color&lt;/code&gt; and &lt;code&gt;Size&lt;/code&gt; as aspect names in their inventory item records.&lt;br&gt;&lt;br&gt;This container is always returned if one or more offers associated with the inventory item group have been published. For inventory item groups that have yet to have any published offers, this container is only returned if set.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This array is required and at least one aspect with the available variations must be specified.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @param value Value to set for the specifications property.
     */
    public void setSpecifications(@jakarta.annotation.Nullable final java.util.List<Specification> value) {
        this.specifications = value;
    }
}
