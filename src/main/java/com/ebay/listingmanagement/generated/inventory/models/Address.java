package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to define the physical address of an inventory location.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Address implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The first line of a street address. This field is required for store and fulfillment center locations. A street address is not required for warehouse locations.&lt;br&gt;&lt;br&gt;This field will be returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     */
    private String addressLine1;
    /**
     * The second line of a street address. This field can be used for additional address information, such as a suite or apartment number. &lt;br&gt;&lt;br&gt;This field will be returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     */
    private String addressLine2;
    /**
     * The city in which the inventory location resides. This field is required for store and fulfillment center locations. For warehouse locations, this field is conditionally required as part of a &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair if a &lt;strong&gt;postalCode&lt;/strong&gt; is not provided. If a &lt;strong&gt;postalCode&lt;/strong&gt; is provided, the city is derived from the provided postal code and this field is technically optional.&lt;br&gt;&lt;br&gt;This field is returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     */
    private String city;
    /**
     * The country in which the address resides, represented as two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; country code. For example, &lt;code&gt;US&lt;/code&gt; represents the United States, and &lt;code&gt;DE&lt;/code&gt; represents Germany. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String country;
    /**
     * The county in which the address resides.&lt;br&gt;&lt;br&gt;This field is returned if defined for an inventory location.
     */
    private String county;
    /**
     * The postal/zip code of the address. eBay uses postal codes to surface In-Store Pickup items within the vicinity of a buyer&apos;s location, and it also uses postal codes (origin and destination) to estimate shipping costs when the seller uses calculated shipping. This field is required for store and fulfillment center locations. &lt;br&gt;&lt;br&gt;For warehouse locations, this field is conditionally required if a &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair is not provided.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; For warehouse locations, &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair can be used instead of a &lt;strong&gt;postalCode&lt;/strong&gt; value, and then the postal code is just derived from the city and state/province.&lt;/span&gt;&lt;br&gt;&lt;br&gt;This field is returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 16
     */
    private String postalCode;
    /**
     * The state/province in which the inventory location resides. This field is required for store and fulfillment center locations. For warehouse locations, this field is conditionally required as part of a &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair if a &lt;strong&gt;postalCode&lt;/strong&gt; is not provided. If a &lt;strong&gt;postalCode&lt;/strong&gt; is provided, the state or province is derived from the provided zip code and this field is technically optional.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     */
    private String stateOrProvince;
    /**
     * Instantiates a new {@link Address} and sets the default values.
     */
    public Address() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Address}
     */
    @jakarta.annotation.Nonnull
    public static Address createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Address();
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
     * Gets the addressLine1 property value. The first line of a street address. This field is required for store and fulfillment center locations. A street address is not required for warehouse locations.&lt;br&gt;&lt;br&gt;This field will be returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressLine1() {
        return this.addressLine1;
    }
    /**
     * Gets the addressLine2 property value. The second line of a street address. This field can be used for additional address information, such as a suite or apartment number. &lt;br&gt;&lt;br&gt;This field will be returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressLine2() {
        return this.addressLine2;
    }
    /**
     * Gets the city property value. The city in which the inventory location resides. This field is required for store and fulfillment center locations. For warehouse locations, this field is conditionally required as part of a &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair if a &lt;strong&gt;postalCode&lt;/strong&gt; is not provided. If a &lt;strong&gt;postalCode&lt;/strong&gt; is provided, the city is derived from the provided postal code and this field is technically optional.&lt;br&gt;&lt;br&gt;This field is returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. The country in which the address resides, represented as two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; country code. For example, &lt;code&gt;US&lt;/code&gt; represents the United States, and &lt;code&gt;DE&lt;/code&gt; represents Germany. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the county property value. The county in which the address resides.&lt;br&gt;&lt;br&gt;This field is returned if defined for an inventory location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCounty() {
        return this.county;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("addressLine1", (n) -> { this.setAddressLine1(n.getStringValue()); });
        deserializerMap.put("addressLine2", (n) -> { this.setAddressLine2(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("county", (n) -> { this.setCounty(n.getStringValue()); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("stateOrProvince", (n) -> { this.setStateOrProvince(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the postalCode property value. The postal/zip code of the address. eBay uses postal codes to surface In-Store Pickup items within the vicinity of a buyer&apos;s location, and it also uses postal codes (origin and destination) to estimate shipping costs when the seller uses calculated shipping. This field is required for store and fulfillment center locations. &lt;br&gt;&lt;br&gt;For warehouse locations, this field is conditionally required if a &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair is not provided.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; For warehouse locations, &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair can be used instead of a &lt;strong&gt;postalCode&lt;/strong&gt; value, and then the postal code is just derived from the city and state/province.&lt;/span&gt;&lt;br&gt;&lt;br&gt;This field is returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 16
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the stateOrProvince property value. The state/province in which the inventory location resides. This field is required for store and fulfillment center locations. For warehouse locations, this field is conditionally required as part of a &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair if a &lt;strong&gt;postalCode&lt;/strong&gt; is not provided. If a &lt;strong&gt;postalCode&lt;/strong&gt; is provided, the state or province is derived from the provided zip code and this field is technically optional.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStateOrProvince() {
        return this.stateOrProvince;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("addressLine1", this.getAddressLine1());
        writer.writeStringValue("addressLine2", this.getAddressLine2());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("county", this.getCounty());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("stateOrProvince", this.getStateOrProvince());
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
     * Sets the addressLine1 property value. The first line of a street address. This field is required for store and fulfillment center locations. A street address is not required for warehouse locations.&lt;br&gt;&lt;br&gt;This field will be returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     * @param value Value to set for the addressLine1 property.
     */
    public void setAddressLine1(@jakarta.annotation.Nullable final String value) {
        this.addressLine1 = value;
    }
    /**
     * Sets the addressLine2 property value. The second line of a street address. This field can be used for additional address information, such as a suite or apartment number. &lt;br&gt;&lt;br&gt;This field will be returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     * @param value Value to set for the addressLine2 property.
     */
    public void setAddressLine2(@jakarta.annotation.Nullable final String value) {
        this.addressLine2 = value;
    }
    /**
     * Sets the city property value. The city in which the inventory location resides. This field is required for store and fulfillment center locations. For warehouse locations, this field is conditionally required as part of a &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair if a &lt;strong&gt;postalCode&lt;/strong&gt; is not provided. If a &lt;strong&gt;postalCode&lt;/strong&gt; is provided, the city is derived from the provided postal code and this field is technically optional.&lt;br&gt;&lt;br&gt;This field is returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. The country in which the address resides, represented as two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; country code. For example, &lt;code&gt;US&lt;/code&gt; represents the United States, and &lt;code&gt;DE&lt;/code&gt; represents Germany. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the county property value. The county in which the address resides.&lt;br&gt;&lt;br&gt;This field is returned if defined for an inventory location.
     * @param value Value to set for the county property.
     */
    public void setCounty(@jakarta.annotation.Nullable final String value) {
        this.county = value;
    }
    /**
     * Sets the postalCode property value. The postal/zip code of the address. eBay uses postal codes to surface In-Store Pickup items within the vicinity of a buyer&apos;s location, and it also uses postal codes (origin and destination) to estimate shipping costs when the seller uses calculated shipping. This field is required for store and fulfillment center locations. &lt;br&gt;&lt;br&gt;For warehouse locations, this field is conditionally required if a &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair is not provided.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; For warehouse locations, &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair can be used instead of a &lt;strong&gt;postalCode&lt;/strong&gt; value, and then the postal code is just derived from the city and state/province.&lt;/span&gt;&lt;br&gt;&lt;br&gt;This field is returned if defined for an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 16
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the stateOrProvince property value. The state/province in which the inventory location resides. This field is required for store and fulfillment center locations. For warehouse locations, this field is conditionally required as part of a &lt;strong&gt;city&lt;/strong&gt; and &lt;strong&gt;stateOrProvince&lt;/strong&gt; pair if a &lt;strong&gt;postalCode&lt;/strong&gt; is not provided. If a &lt;strong&gt;postalCode&lt;/strong&gt; is provided, the state or province is derived from the provided zip code and this field is technically optional.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 128
     * @param value Value to set for the stateOrProvince property.
     */
    public void setStateOrProvince(@jakarta.annotation.Nullable final String value) {
        this.stateOrProvince = value;
    }
}
