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
 * This type is used by the base response payload for the &lt;strong&gt;getListingFees&lt;/strong&gt; call. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeesSummaryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container consists of an array of one or more listing fees that the seller can expect to pay for unpublished offers specified in the call request. Many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;.
     */
    private java.util.List<FeeSummary> feeSummaries;
    /**
     * Instantiates a new {@link FeesSummaryResponse} and sets the default values.
     */
    public FeesSummaryResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeesSummaryResponse}
     */
    @jakarta.annotation.Nonnull
    public static FeesSummaryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeesSummaryResponse();
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
     * Gets the feeSummaries property value. This container consists of an array of one or more listing fees that the seller can expect to pay for unpublished offers specified in the call request. Many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;.
     * @return a {@link java.util.List<FeeSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeeSummary> getFeeSummaries() {
        return this.feeSummaries;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("feeSummaries", (n) -> { this.setFeeSummaries(n.getCollectionOfObjectValues(FeeSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("feeSummaries", this.getFeeSummaries());
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
     * Sets the feeSummaries property value. This container consists of an array of one or more listing fees that the seller can expect to pay for unpublished offers specified in the call request. Many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;.
     * @param value Value to set for the feeSummaries property.
     */
    public void setFeeSummaries(@jakarta.annotation.Nullable final java.util.List<FeeSummary> value) {
        this.feeSummaries = value;
    }
}
