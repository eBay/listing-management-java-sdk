package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type that is used to provide the physical address of a location, and it geo-coordinates.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Location implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to define the physical address of an inventory location.
     */
    private Address address;
    /**
     * This type is used to express the Global Positioning System (GPS) latitude and longitude coordinates of an inventory location.
     */
    private GeoCoordinates geoCoordinates;
    /**
     * A unique eBay-assigned ID for the location. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This field should not be confused with the seller-defined &lt;b&gt;merchantLocationKey&lt;/b&gt; value. It is the &lt;b&gt;merchantLocationKey&lt;/b&gt; value which is used to identify an inventory location when working with inventory location API calls. The &lt;strong&gt;locationId&lt;/strong&gt; value is only used internally by eBay.&lt;/span&gt;
     */
    private String locationId;
    /**
     * Instantiates a new {@link Location} and sets the default values.
     */
    public Location() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Location}
     */
    @jakarta.annotation.Nonnull
    public static Location createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Location();
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
     * Gets the address property value. This type is used to define the physical address of an inventory location.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(Address::createFromDiscriminatorValue)); });
        deserializerMap.put("geoCoordinates", (n) -> { this.setGeoCoordinates(n.getObjectValue(GeoCoordinates::createFromDiscriminatorValue)); });
        deserializerMap.put("locationId", (n) -> { this.setLocationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the geoCoordinates property value. This type is used to express the Global Positioning System (GPS) latitude and longitude coordinates of an inventory location.
     * @return a {@link GeoCoordinates}
     */
    @jakarta.annotation.Nullable
    public GeoCoordinates getGeoCoordinates() {
        return this.geoCoordinates;
    }
    /**
     * Gets the locationId property value. A unique eBay-assigned ID for the location. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This field should not be confused with the seller-defined &lt;b&gt;merchantLocationKey&lt;/b&gt; value. It is the &lt;b&gt;merchantLocationKey&lt;/b&gt; value which is used to identify an inventory location when working with inventory location API calls. The &lt;strong&gt;locationId&lt;/strong&gt; value is only used internally by eBay.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationId() {
        return this.locationId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeObjectValue("geoCoordinates", this.getGeoCoordinates());
        writer.writeStringValue("locationId", this.getLocationId());
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
     * Sets the address property value. This type is used to define the physical address of an inventory location.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final Address value) {
        this.address = value;
    }
    /**
     * Sets the geoCoordinates property value. This type is used to express the Global Positioning System (GPS) latitude and longitude coordinates of an inventory location.
     * @param value Value to set for the geoCoordinates property.
     */
    public void setGeoCoordinates(@jakarta.annotation.Nullable final GeoCoordinates value) {
        this.geoCoordinates = value;
    }
    /**
     * Sets the locationId property value. A unique eBay-assigned ID for the location. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This field should not be confused with the seller-defined &lt;b&gt;merchantLocationKey&lt;/b&gt; value. It is the &lt;b&gt;merchantLocationKey&lt;/b&gt; value which is used to identify an inventory location when working with inventory location API calls. The &lt;strong&gt;locationId&lt;/strong&gt; value is only used internally by eBay.&lt;/span&gt;
     * @param value Value to set for the locationId property.
     */
    public void setLocationId(@jakarta.annotation.Nullable final String value) {
        this.locationId = value;
    }
}
