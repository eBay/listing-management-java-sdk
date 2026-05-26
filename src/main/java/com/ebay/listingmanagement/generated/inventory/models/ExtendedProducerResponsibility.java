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
 * This type provides IDs for the producer or importer related to the new item, packaging, added documentation, or an eco-participation fee. In some markets, such as in France, this may be the importer of the item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExtendedProducerResponsibility implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to express a dollar value and the applicable currency.
     */
    private Amount ecoParticipationFee;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     */
    private String producerProductId;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     */
    private String productDocumentationId;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     */
    private String productPackageId;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     */
    private String shipmentPackageId;
    /**
     * Instantiates a new {@link ExtendedProducerResponsibility} and sets the default values.
     */
    public ExtendedProducerResponsibility() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExtendedProducerResponsibility}
     */
    @jakarta.annotation.Nonnull
    public static ExtendedProducerResponsibility createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtendedProducerResponsibility();
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
     * Gets the ecoParticipationFee property value. This type is used to express a dollar value and the applicable currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getEcoParticipationFee() {
        return this.ecoParticipationFee;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("ecoParticipationFee", (n) -> { this.setEcoParticipationFee(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("producerProductId", (n) -> { this.setProducerProductId(n.getStringValue()); });
        deserializerMap.put("productDocumentationId", (n) -> { this.setProductDocumentationId(n.getStringValue()); });
        deserializerMap.put("productPackageId", (n) -> { this.setProductPackageId(n.getStringValue()); });
        deserializerMap.put("shipmentPackageId", (n) -> { this.setShipmentPackageId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the producerProductId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProducerProductId() {
        return this.producerProductId;
    }
    /**
     * Gets the productDocumentationId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductDocumentationId() {
        return this.productDocumentationId;
    }
    /**
     * Gets the productPackageId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductPackageId() {
        return this.productPackageId;
    }
    /**
     * Gets the shipmentPackageId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShipmentPackageId() {
        return this.shipmentPackageId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("ecoParticipationFee", this.getEcoParticipationFee());
        writer.writeStringValue("producerProductId", this.getProducerProductId());
        writer.writeStringValue("productDocumentationId", this.getProductDocumentationId());
        writer.writeStringValue("productPackageId", this.getProductPackageId());
        writer.writeStringValue("shipmentPackageId", this.getShipmentPackageId());
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
     * Sets the ecoParticipationFee property value. This type is used to express a dollar value and the applicable currency.
     * @param value Value to set for the ecoParticipationFee property.
     */
    public void setEcoParticipationFee(@jakarta.annotation.Nullable final Amount value) {
        this.ecoParticipationFee = value;
    }
    /**
     * Sets the producerProductId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     * @param value Value to set for the producerProductId property.
     */
    public void setProducerProductId(@jakarta.annotation.Nullable final String value) {
        this.producerProductId = value;
    }
    /**
     * Sets the productDocumentationId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     * @param value Value to set for the productDocumentationId property.
     */
    public void setProductDocumentationId(@jakarta.annotation.Nullable final String value) {
        this.productDocumentationId = value;
    }
    /**
     * Sets the productPackageId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     * @param value Value to set for the productPackageId property.
     */
    public void setProductPackageId(@jakarta.annotation.Nullable final String value) {
        this.productPackageId = value;
    }
    /**
     * Sets the shipmentPackageId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;THIS FIELD IS DEPRECATED AND NO LONGER SUPPORTED.&lt;/b&gt; For sellers selling on the eBay France Marketplace, Extended Producer Responsibility ID fields are no longer set at the listing level. Instead, sellers must provide these IDs for each applicable category in their My eBay accounts. The URL will be based on the seller&apos;s home/registration site, and will use this pattern: https://accountsettings./epr-fr. Sellers based in the US will use &lt;a href=&quot;https://accountsettings.ebay.com/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.com/epr-fr&lt;/a&gt;, sellers based in France will use &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr&quot; target=&quot;_blank&quot;&gt;https://accountsettings.ebay.fr/epr-fr&lt;/a&gt;, and so on.&lt;/span&gt;
     * @param value Value to set for the shipmentPackageId property.
     */
    public void setShipmentPackageId(@jakarta.annotation.Nullable final String value) {
        this.shipmentPackageId = value;
    }
}
