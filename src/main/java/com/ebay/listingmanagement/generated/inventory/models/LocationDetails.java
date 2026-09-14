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
 * This type is used by the &lt;b&gt;createInventoryLocation&lt;/b&gt; call to provide an full or partial address of an inventory location.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LocationDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This required container sets the physical address of an inventory location. Except in the case store or fulfillment center location, a full address is not a requirement when setting up a location. For warehouse locations, the fields required in this container are either of the following sets:&lt;ul&gt;&lt;li&gt;&lt;b&gt;city&lt;/b&gt;, &lt;b&gt;stateOrProvince&lt;/b&gt;, and &lt;b&gt;country&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;postalCode&lt;/b&gt; and &lt;b&gt;country&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private Address address;
    /**
     * This container is used to set the Global Positioning System (GPS) latitude and longitude coordinates for the inventory location.&lt;br&gt;&lt;br&gt;Geographical coordinates are required for the location of In-Store Pickup inventory. 
     */
    private GeoCoordinates geoCoordinates;
    /**
     * Instantiates a new {@link LocationDetails} and sets the default values.
     */
    public LocationDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LocationDetails}
     */
    @jakarta.annotation.Nonnull
    public static LocationDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LocationDetails();
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
     * Gets the address property value. This required container sets the physical address of an inventory location. Except in the case store or fulfillment center location, a full address is not a requirement when setting up a location. For warehouse locations, the fields required in this container are either of the following sets:&lt;ul&gt;&lt;li&gt;&lt;b&gt;city&lt;/b&gt;, &lt;b&gt;stateOrProvince&lt;/b&gt;, and &lt;b&gt;country&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;postalCode&lt;/b&gt; and &lt;b&gt;country&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link Address}
     */
    @jakarta.annotation.Nullable
    public Address getAddress() {
        return this.address;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(Address::createFromDiscriminatorValue)); });
        deserializerMap.put("geoCoordinates", (n) -> { this.setGeoCoordinates(n.getObjectValue(GeoCoordinates::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the geoCoordinates property value. This container is used to set the Global Positioning System (GPS) latitude and longitude coordinates for the inventory location.&lt;br&gt;&lt;br&gt;Geographical coordinates are required for the location of In-Store Pickup inventory. 
     * @return a {@link GeoCoordinates}
     */
    @jakarta.annotation.Nullable
    public GeoCoordinates getGeoCoordinates() {
        return this.geoCoordinates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeObjectValue("geoCoordinates", this.getGeoCoordinates());
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
     * Sets the address property value. This required container sets the physical address of an inventory location. Except in the case store or fulfillment center location, a full address is not a requirement when setting up a location. For warehouse locations, the fields required in this container are either of the following sets:&lt;ul&gt;&lt;li&gt;&lt;b&gt;city&lt;/b&gt;, &lt;b&gt;stateOrProvince&lt;/b&gt;, and &lt;b&gt;country&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;postalCode&lt;/b&gt; and &lt;b&gt;country&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final Address value) {
        this.address = value;
    }
    /**
     * Sets the geoCoordinates property value. This container is used to set the Global Positioning System (GPS) latitude and longitude coordinates for the inventory location.&lt;br&gt;&lt;br&gt;Geographical coordinates are required for the location of In-Store Pickup inventory. 
     * @param value Value to set for the geoCoordinates property.
     */
    public void setGeoCoordinates(@jakarta.annotation.Nullable final GeoCoordinates value) {
        this.geoCoordinates = value;
    }
}
