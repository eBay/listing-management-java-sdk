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

package com.ebay.listingmanagement.generated.media.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A container that provides video moderation information when calling the &lt;strong&gt;getVideo&lt;/strong&gt; method.&lt;br /&gt;&lt;br /&gt;This container is returned if the specified video has been blocked by moderators.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section2&quot; target=&quot;_blank&quot;&gt;Video moderation and restrictions&lt;/a&gt; in the eBay Seller Center for details about video moderation.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Moderation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The reason(s) why the specified video was blocked by moderators.
     */
    private java.util.List<RejectReasonEnum> rejectReasons;
    /**
     * Instantiates a new {@link Moderation} and sets the default values.
     */
    public Moderation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Moderation}
     */
    @jakarta.annotation.Nonnull
    public static Moderation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Moderation();
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
        deserializerMap.put("rejectReasons", (n) -> { this.setRejectReasons(n.getCollectionOfEnumValues(RejectReasonEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rejectReasons property value. The reason(s) why the specified video was blocked by moderators.
     * @return a {@link java.util.List<RejectReasonEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RejectReasonEnum> getRejectReasons() {
        return this.rejectReasons;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("rejectReasons", this.getRejectReasons());
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
     * Sets the rejectReasons property value. The reason(s) why the specified video was blocked by moderators.
     * @param value Value to set for the rejectReasons property.
     */
    public void setRejectReasons(@jakarta.annotation.Nullable final java.util.List<RejectReasonEnum> value) {
        this.rejectReasons = value;
    }
}
