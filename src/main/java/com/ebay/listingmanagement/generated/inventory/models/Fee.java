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
 * This type is used to express expected listing fees that the seller may incur for one or more unpublished offers, as well as any eBay-related promotional discounts being applied toward a specific fee. These fees are the expected cumulative fees per eBay marketplace (which is indicated in the &lt;strong&gt;marketplaceId&lt;/strong&gt; field).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Fee implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This dollar value in this container is the actual dollar value of the listing fee type specified in the &lt;strong&gt;feeType&lt;/strong&gt; field.
     */
    private Amount amount;
    /**
     * The value returned in this field indicates the type of listing fee that the seller may incur if one or more unpublished offers (offers are specified in the call request) are published on the marketplace specified in the &lt;strong&gt;marketplaceId&lt;/strong&gt; field. Applicable listing fees will often include things such as &lt;code&gt;InsertionFee&lt;/code&gt; or &lt;code&gt;SubtitleFee&lt;/code&gt;, but many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;https://pages.ebay.com/help/sell/fees.html &quot; target=&quot;_blank&quot;&gt;Standard selling fees&lt;/a&gt; help page for more information on listing fees.
     */
    private String feeType;
    /**
     * The dollar value in this container indicates any eBay promotional discount applied toward the listing fee type specified in the &lt;strong&gt;feeType&lt;/strong&gt; field. If there was no discount applied toward the fee, this container is still returned but its value is &lt;code&gt;0.0&lt;/code&gt;.
     */
    private Amount promotionalDiscount;
    /**
     * Instantiates a new {@link Fee} and sets the default values.
     */
    public Fee() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Fee}
     */
    @jakarta.annotation.Nonnull
    public static Fee createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fee();
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
     * Gets the amount property value. This dollar value in this container is the actual dollar value of the listing fee type specified in the &lt;strong&gt;feeType&lt;/strong&gt; field.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the feeType property value. The value returned in this field indicates the type of listing fee that the seller may incur if one or more unpublished offers (offers are specified in the call request) are published on the marketplace specified in the &lt;strong&gt;marketplaceId&lt;/strong&gt; field. Applicable listing fees will often include things such as &lt;code&gt;InsertionFee&lt;/code&gt; or &lt;code&gt;SubtitleFee&lt;/code&gt;, but many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;https://pages.ebay.com/help/sell/fees.html &quot; target=&quot;_blank&quot;&gt;Standard selling fees&lt;/a&gt; help page for more information on listing fees.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeeType() {
        return this.feeType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("feeType", (n) -> { this.setFeeType(n.getStringValue()); });
        deserializerMap.put("promotionalDiscount", (n) -> { this.setPromotionalDiscount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the promotionalDiscount property value. The dollar value in this container indicates any eBay promotional discount applied toward the listing fee type specified in the &lt;strong&gt;feeType&lt;/strong&gt; field. If there was no discount applied toward the fee, this container is still returned but its value is &lt;code&gt;0.0&lt;/code&gt;.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPromotionalDiscount() {
        return this.promotionalDiscount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeStringValue("feeType", this.getFeeType());
        writer.writeObjectValue("promotionalDiscount", this.getPromotionalDiscount());
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
     * Sets the amount property value. This dollar value in this container is the actual dollar value of the listing fee type specified in the &lt;strong&gt;feeType&lt;/strong&gt; field.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the feeType property value. The value returned in this field indicates the type of listing fee that the seller may incur if one or more unpublished offers (offers are specified in the call request) are published on the marketplace specified in the &lt;strong&gt;marketplaceId&lt;/strong&gt; field. Applicable listing fees will often include things such as &lt;code&gt;InsertionFee&lt;/code&gt; or &lt;code&gt;SubtitleFee&lt;/code&gt;, but many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;https://pages.ebay.com/help/sell/fees.html &quot; target=&quot;_blank&quot;&gt;Standard selling fees&lt;/a&gt; help page for more information on listing fees.
     * @param value Value to set for the feeType property.
     */
    public void setFeeType(@jakarta.annotation.Nullable final String value) {
        this.feeType = value;
    }
    /**
     * Sets the promotionalDiscount property value. The dollar value in this container indicates any eBay promotional discount applied toward the listing fee type specified in the &lt;strong&gt;feeType&lt;/strong&gt; field. If there was no discount applied toward the fee, this container is still returned but its value is &lt;code&gt;0.0&lt;/code&gt;.
     * @param value Value to set for the promotionalDiscount property.
     */
    public void setPromotionalDiscount(@jakarta.annotation.Nullable final Amount value) {
        this.promotionalDiscount = value;
    }
}
