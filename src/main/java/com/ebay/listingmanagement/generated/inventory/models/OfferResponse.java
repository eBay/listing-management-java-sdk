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
 * This type is used by the response payload of the &lt;strong&gt;createOffer&lt;/strong&gt; and &lt;strong&gt;updateOffer&lt;/strong&gt; calls. The &lt;strong&gt;offerId&lt;/strong&gt; field contains the unique identifier for the offer if the offer is successfully created by the &lt;strong&gt;createOffer&lt;/strong&gt; call. The &lt;strong&gt;warnings&lt;/strong&gt; field contains any errors and/or warnings that may have been triggered by the call. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;offerId&lt;/strong&gt; value is only returned with a successful &lt;strong&gt;createOffer&lt;/strong&gt; call. This field will not be returned in the &lt;strong&gt;updateOffer &lt;/strong&gt; response.&lt;/span&gt;&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OfferResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the offer that was just created with a &lt;strong&gt;createOffer&lt;/strong&gt; call. It is not returned if the &lt;strong&gt;createOffer&lt;/strong&gt; call fails to create an offer. This identifier will be needed for many offer-related calls. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;offerId&lt;/strong&gt; value is only returned with a successful &lt;strong&gt;createOffer&lt;/strong&gt; call. This field will not be returned in the &lt;strong&gt;updateOffer &lt;/strong&gt; response.&lt;/span&gt;&lt;/p&gt;
     */
    private String offerId;
    /**
     * This container will contain an array of errors and/or warnings when a call is made, and errors and/or warnings occur.
     */
    private java.util.List<ErrorDetailV3> warnings;
    /**
     * Instantiates a new {@link OfferResponse} and sets the default values.
     */
    public OfferResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OfferResponse}
     */
    @jakarta.annotation.Nonnull
    public static OfferResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfferResponse();
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
        deserializerMap.put("offerId", (n) -> { this.setOfferId(n.getStringValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(ErrorDetailV3::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the offerId property value. The unique identifier of the offer that was just created with a &lt;strong&gt;createOffer&lt;/strong&gt; call. It is not returned if the &lt;strong&gt;createOffer&lt;/strong&gt; call fails to create an offer. This identifier will be needed for many offer-related calls. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;offerId&lt;/strong&gt; value is only returned with a successful &lt;strong&gt;createOffer&lt;/strong&gt; call. This field will not be returned in the &lt;strong&gt;updateOffer &lt;/strong&gt; response.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferId() {
        return this.offerId;
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
        writer.writeStringValue("offerId", this.getOfferId());
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
     * Sets the offerId property value. The unique identifier of the offer that was just created with a &lt;strong&gt;createOffer&lt;/strong&gt; call. It is not returned if the &lt;strong&gt;createOffer&lt;/strong&gt; call fails to create an offer. This identifier will be needed for many offer-related calls. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;offerId&lt;/strong&gt; value is only returned with a successful &lt;strong&gt;createOffer&lt;/strong&gt; call. This field will not be returned in the &lt;strong&gt;updateOffer &lt;/strong&gt; response.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the offerId property.
     */
    public void setOfferId(@jakarta.annotation.Nullable final String value) {
        this.offerId = value;
    }
    /**
     * Sets the warnings property value. This container will contain an array of errors and/or warnings when a call is made, and errors and/or warnings occur.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<ErrorDetailV3> value) {
        this.warnings = value;
    }
}
