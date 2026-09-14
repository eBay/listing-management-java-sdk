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
 * The two streaming video URLs available for a successfully uploaded video with a status of &lt;code&gt;LIVE&lt;/code&gt;. The supported streaming video protocols are DASH (Dynamic Adaptive Streaming over HTTP) and HLS (HTTP Live Streaming).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Play implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The playable URL for this video.
     */
    private String playUrl;
    /**
     * The protocol for the video playlist. Supported protocols are DASH (Dynamic Adaptive Streaming over HTTP) and HLS (HTTP Live Streaming).
     */
    private ProtocolEnum protocol;
    /**
     * Instantiates a new {@link Play} and sets the default values.
     */
    public Play() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Play}
     */
    @jakarta.annotation.Nonnull
    public static Play createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Play();
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
        deserializerMap.put("playUrl", (n) -> { this.setPlayUrl(n.getStringValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(ProtocolEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the playUrl property value. The playable URL for this video.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlayUrl() {
        return this.playUrl;
    }
    /**
     * Gets the protocol property value. The protocol for the video playlist. Supported protocols are DASH (Dynamic Adaptive Streaming over HTTP) and HLS (HTTP Live Streaming).
     * @return a {@link ProtocolEnum}
     */
    @jakarta.annotation.Nullable
    public ProtocolEnum getProtocol() {
        return this.protocol;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("playUrl", this.getPlayUrl());
        writer.writeEnumValue("protocol", this.getProtocol());
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
     * Sets the playUrl property value. The playable URL for this video.
     * @param value Value to set for the playUrl property.
     */
    public void setPlayUrl(@jakarta.annotation.Nullable final String value) {
        this.playUrl = value;
    }
    /**
     * Sets the protocol property value. The protocol for the video playlist. Supported protocols are DASH (Dynamic Adaptive Streaming over HTTP) and HLS (HTTP Live Streaming).
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final ProtocolEnum value) {
        this.protocol = value;
    }
}
