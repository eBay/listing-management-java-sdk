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
 * This type is used to display the expected listing fees for each unpublished offer specified in the request of the &lt;strong&gt;getListingFees&lt;/strong&gt; call.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeeSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is an array of listing fees that can be expected to be applied to an offer on the specified eBay marketplace (&lt;strong&gt;marketplaceId&lt;/strong&gt; value). Many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;https://pages.ebay.com/help/sell/fees.html &quot; target=&quot;_blank&quot;&gt;Standard selling fees&lt;/a&gt; help page for more information on listing fees.
     */
    private java.util.List<Fee> fees;
    /**
     * This is the unique identifier of the eBay site for which  listing fees for the offer are applicable.
     */
    private MarketplaceEnum marketplaceId;
    /**
     * This container will contain an array of errors and/or warnings when a call is made, and errors and/or warnings occur.
     */
    private java.util.List<ErrorDetailV3> warnings;
    /**
     * Instantiates a new {@link FeeSummary} and sets the default values.
     */
    public FeeSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeeSummary}
     */
    @jakarta.annotation.Nonnull
    public static FeeSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeeSummary();
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
     * Gets the fees property value. This container is an array of listing fees that can be expected to be applied to an offer on the specified eBay marketplace (&lt;strong&gt;marketplaceId&lt;/strong&gt; value). Many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;https://pages.ebay.com/help/sell/fees.html &quot; target=&quot;_blank&quot;&gt;Standard selling fees&lt;/a&gt; help page for more information on listing fees.
     * @return a {@link java.util.List<Fee>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Fee> getFees() {
        return this.fees;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("fees", (n) -> { this.setFees(n.getCollectionOfObjectValues(Fee::createFromDiscriminatorValue)); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getEnumValue(MarketplaceEnum::forValue)); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(ErrorDetailV3::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the marketplaceId property value. This is the unique identifier of the eBay site for which  listing fees for the offer are applicable.
     * @return a {@link MarketplaceEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceEnum getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the warnings property value. This container will contain an array of errors and/or warnings when a call is made, and errors and/or warnings occur.
     * @return a {@link java.util.List<ErrorDetailV3>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorDetailV3> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("fees", this.getFees());
        writer.writeEnumValue("marketplaceId", this.getMarketplaceId());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the fees property value. This container is an array of listing fees that can be expected to be applied to an offer on the specified eBay marketplace (&lt;strong&gt;marketplaceId&lt;/strong&gt; value). Many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;https://pages.ebay.com/help/sell/fees.html &quot; target=&quot;_blank&quot;&gt;Standard selling fees&lt;/a&gt; help page for more information on listing fees.
     * @param value Value to set for the fees property.
     */
    public void setFees(@jakarta.annotation.Nullable final java.util.List<Fee> value) {
        this.fees = value;
    }
    /**
     * Sets the marketplaceId property value. This is the unique identifier of the eBay site for which  listing fees for the offer are applicable.
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final MarketplaceEnum value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the warnings property value. This container will contain an array of errors and/or warnings when a call is made, and errors and/or warnings occur.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<ErrorDetailV3> value) {
        this.warnings = value;
    }
}
