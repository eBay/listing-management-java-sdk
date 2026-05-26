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
 * This type is used to express the Global Positioning System (GPS) latitude and longitude coordinates of an inventory location.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GeoCoordinates implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The latitude (North-South) component of the geographic coordinate. This field is required if a &lt;strong&gt;geoCoordinates&lt;/strong&gt; container is used.&lt;br&gt;&lt;br&gt;This field is returned if geographical coordinates are set for the location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;33.089805&lt;/code&gt;
     */
    private Double latitude;
    /**
     * The longitude (East-West) component of the geographic coordinate. This field is required if a &lt;strong&gt;geoCoordinates&lt;/strong&gt; container is used.&lt;br&gt;&lt;br&gt;This field is returned if geographical coordinates are set for the location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;-88.709822&lt;/code&gt;
     */
    private Double longitude;
    /**
     * Instantiates a new {@link GeoCoordinates} and sets the default values.
     */
    public GeoCoordinates() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GeoCoordinates}
     */
    @jakarta.annotation.Nonnull
    public static GeoCoordinates createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GeoCoordinates();
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
        deserializerMap.put("latitude", (n) -> { this.setLatitude(n.getDoubleValue()); });
        deserializerMap.put("longitude", (n) -> { this.setLongitude(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latitude property value. The latitude (North-South) component of the geographic coordinate. This field is required if a &lt;strong&gt;geoCoordinates&lt;/strong&gt; container is used.&lt;br&gt;&lt;br&gt;This field is returned if geographical coordinates are set for the location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;33.089805&lt;/code&gt;
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLatitude() {
        return this.latitude;
    }
    /**
     * Gets the longitude property value. The longitude (East-West) component of the geographic coordinate. This field is required if a &lt;strong&gt;geoCoordinates&lt;/strong&gt; container is used.&lt;br&gt;&lt;br&gt;This field is returned if geographical coordinates are set for the location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;-88.709822&lt;/code&gt;
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLongitude() {
        return this.longitude;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("latitude", this.getLatitude());
        writer.writeDoubleValue("longitude", this.getLongitude());
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
     * Sets the latitude property value. The latitude (North-South) component of the geographic coordinate. This field is required if a &lt;strong&gt;geoCoordinates&lt;/strong&gt; container is used.&lt;br&gt;&lt;br&gt;This field is returned if geographical coordinates are set for the location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;33.089805&lt;/code&gt;
     * @param value Value to set for the latitude property.
     */
    public void setLatitude(@jakarta.annotation.Nullable final Double value) {
        this.latitude = value;
    }
    /**
     * Sets the longitude property value. The longitude (East-West) component of the geographic coordinate. This field is required if a &lt;strong&gt;geoCoordinates&lt;/strong&gt; container is used.&lt;br&gt;&lt;br&gt;This field is returned if geographical coordinates are set for the location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;-88.709822&lt;/code&gt;
     * @param value Value to set for the longitude property.
     */
    public void setLongitude(@jakarta.annotation.Nullable final Double value) {
        this.longitude = value;
    }
}
