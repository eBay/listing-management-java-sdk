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
 * This type provides the unique identifier of an inventory location that is associated with a SKU within a listing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LocationAvailabilityDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of a sellers fulfillment center location where inventory is available for the item or item variation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When creating a location mapping using the &lt;b&gt;createOrReplaceSkuLocationMapping&lt;/b&gt; method, the value entered in this field &lt;b&gt;must&lt;/b&gt; be associated with a location with the &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt; location type, or an error will occur. Sellers can check the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations#response.locations.locationTypes&quot; target=&quot;_blank&quot;&gt;locationTypes&lt;/a&gt; array in the response of the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to see if their location has a value of &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt;.&lt;/span&gt;
     */
    private String merchantLocationKey;
    /**
     * Instantiates a new {@link LocationAvailabilityDetails} and sets the default values.
     */
    public LocationAvailabilityDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LocationAvailabilityDetails}
     */
    @jakarta.annotation.Nonnull
    public static LocationAvailabilityDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LocationAvailabilityDetails();
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
        deserializerMap.put("merchantLocationKey", (n) -> { this.setMerchantLocationKey(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the merchantLocationKey property value. The unique identifier of a sellers fulfillment center location where inventory is available for the item or item variation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When creating a location mapping using the &lt;b&gt;createOrReplaceSkuLocationMapping&lt;/b&gt; method, the value entered in this field &lt;b&gt;must&lt;/b&gt; be associated with a location with the &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt; location type, or an error will occur. Sellers can check the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations#response.locations.locationTypes&quot; target=&quot;_blank&quot;&gt;locationTypes&lt;/a&gt; array in the response of the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to see if their location has a value of &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMerchantLocationKey() {
        return this.merchantLocationKey;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("merchantLocationKey", this.getMerchantLocationKey());
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
     * Sets the merchantLocationKey property value. The unique identifier of a sellers fulfillment center location where inventory is available for the item or item variation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When creating a location mapping using the &lt;b&gt;createOrReplaceSkuLocationMapping&lt;/b&gt; method, the value entered in this field &lt;b&gt;must&lt;/b&gt; be associated with a location with the &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt; location type, or an error will occur. Sellers can check the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations#response.locations.locationTypes&quot; target=&quot;_blank&quot;&gt;locationTypes&lt;/a&gt; array in the response of the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/getInventoryLocations&quot; target=&quot;_blank&quot;&gt;getInventoryLocations&lt;/a&gt; method to see if their location has a value of &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the merchantLocationKey property.
     */
    public void setMerchantLocationKey(@jakarta.annotation.Nullable final String value) {
        this.merchantLocationKey = value;
    }
}
