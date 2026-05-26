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
 * This type is used by the &lt;strong&gt;getListingFees&lt;/strong&gt; call to indicate the unpublished offer(s) for which expected listing fees will be retrieved. The user passes in one or more &lt;strong&gt;offerId&lt;/strong&gt; values (a maximum of 250). See the &lt;a href=&quot;https://pages.ebay.com/help/sell/fees.html &quot; target=&quot;_blank&quot;&gt;Standard selling fees&lt;/a&gt; help page for more information on listing fees.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OfferKeyWithId implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of an unpublished offer for which expected listing fees will be retrieved. One to 250 &lt;strong&gt;offerId&lt;/strong&gt; values can be passed in to the &lt;strong&gt;offers&lt;/strong&gt; container for one &lt;strong&gt;getListingFees&lt;/strong&gt; call. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot;&gt;getOffers&lt;/a&gt; method to retrieve offer IDs.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Errors will occur if &lt;strong&gt;offerId&lt;/strong&gt; values representing published offers are passed in.&lt;/span&gt;
     */
    private String offerId;
    /**
     * Instantiates a new {@link OfferKeyWithId} and sets the default values.
     */
    public OfferKeyWithId() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OfferKeyWithId}
     */
    @jakarta.annotation.Nonnull
    public static OfferKeyWithId createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfferKeyWithId();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("offerId", (n) -> { this.setOfferId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the offerId property value. The unique identifier of an unpublished offer for which expected listing fees will be retrieved. One to 250 &lt;strong&gt;offerId&lt;/strong&gt; values can be passed in to the &lt;strong&gt;offers&lt;/strong&gt; container for one &lt;strong&gt;getListingFees&lt;/strong&gt; call. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot;&gt;getOffers&lt;/a&gt; method to retrieve offer IDs.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Errors will occur if &lt;strong&gt;offerId&lt;/strong&gt; values representing published offers are passed in.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferId() {
        return this.offerId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("offerId", this.getOfferId());
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
     * Sets the offerId property value. The unique identifier of an unpublished offer for which expected listing fees will be retrieved. One to 250 &lt;strong&gt;offerId&lt;/strong&gt; values can be passed in to the &lt;strong&gt;offers&lt;/strong&gt; container for one &lt;strong&gt;getListingFees&lt;/strong&gt; call. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot;&gt;getOffers&lt;/a&gt; method to retrieve offer IDs.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Errors will occur if &lt;strong&gt;offerId&lt;/strong&gt; values representing published offers are passed in.&lt;/span&gt;
     * @param value Value to set for the offerId property.
     */
    public void setOfferId(@jakarta.annotation.Nullable final String value) {
        this.offerId = value;
    }
}
