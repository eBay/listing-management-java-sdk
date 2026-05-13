package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides name and contact information about the manufacturer of the item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Manufacturer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The first line of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 180 characters
     */
    private String addressLine1;
    /**
     * The second line of the product manufacturer&apos;s street address. This field is not always used, but can be used for secondary address information such as &apos;Suite Number&apos; or &apos;Apt Number&apos;.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 180 characters
     */
    private String addressLine2;
    /**
     * The city of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64 characters
     */
    private String city;
    /**
     * The company name of the product manufacturer.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 100 characters
     */
    private String companyName;
    /**
     * The contact URL of the product manufacturer.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250 characters
     */
    private String contactUrl;
    /**
     * This defines the list of valid country codes, adapted from http://www.iso.org/iso/country_codes, ISO 3166-1 country code. List elements take the following form to identify a two-letter code with a short name in English, a three-digit code, and a three-letter code: For example, the entry for Japan includes Japan, 392, JPN. Short codes provide uniform recognition, avoiding language-dependent country names. The number code is helpful where Latin script may be problematic. Not all listed codes are universally recognized as countries, for example: code AQ is Antarctica, 010, ATA For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String country;
    /**
     * The product manufacturer&apos;s business email address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 180 characters
     */
    private String email;
    /**
     * The product manufacturer&apos;s business phone number.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64 characters
     */
    private String phone;
    /**
     * The postal code of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 9 characters
     */
    private String postalCode;
    /**
     * The state or province of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64 characters
     */
    private String stateOrProvince;
    /**
     * Instantiates a new {@link Manufacturer} and sets the default values.
     */
    public Manufacturer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Manufacturer}
     */
    @jakarta.annotation.Nonnull
    public static Manufacturer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Manufacturer();
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
     * Gets the addressLine1 property value. The first line of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 180 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressLine1() {
        return this.addressLine1;
    }
    /**
     * Gets the addressLine2 property value. The second line of the product manufacturer&apos;s street address. This field is not always used, but can be used for secondary address information such as &apos;Suite Number&apos; or &apos;Apt Number&apos;.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 180 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressLine2() {
        return this.addressLine2;
    }
    /**
     * Gets the city property value. The city of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the companyName property value. The company name of the product manufacturer.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 100 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the contactUrl property value. The contact URL of the product manufacturer.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContactUrl() {
        return this.contactUrl;
    }
    /**
     * Gets the country property value. This defines the list of valid country codes, adapted from http://www.iso.org/iso/country_codes, ISO 3166-1 country code. List elements take the following form to identify a two-letter code with a short name in English, a three-digit code, and a three-letter code: For example, the entry for Japan includes Japan, 392, JPN. Short codes provide uniform recognition, avoiding language-dependent country names. The number code is helpful where Latin script may be problematic. Not all listed codes are universally recognized as countries, for example: code AQ is Antarctica, 010, ATA For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the email property value. The product manufacturer&apos;s business email address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 180 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("addressLine1", (n) -> { this.setAddressLine1(n.getStringValue()); });
        deserializerMap.put("addressLine2", (n) -> { this.setAddressLine2(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("contactUrl", (n) -> { this.setContactUrl(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("stateOrProvince", (n) -> { this.setStateOrProvince(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the phone property value. The product manufacturer&apos;s business phone number.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the postalCode property value. The postal code of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 9 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the stateOrProvince property value. The state or province of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64 characters
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
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("contactUrl", this.getContactUrl());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("phone", this.getPhone());
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
     * Sets the addressLine1 property value. The first line of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 180 characters
     * @param value Value to set for the addressLine1 property.
     */
    public void setAddressLine1(@jakarta.annotation.Nullable final String value) {
        this.addressLine1 = value;
    }
    /**
     * Sets the addressLine2 property value. The second line of the product manufacturer&apos;s street address. This field is not always used, but can be used for secondary address information such as &apos;Suite Number&apos; or &apos;Apt Number&apos;.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 180 characters
     * @param value Value to set for the addressLine2 property.
     */
    public void setAddressLine2(@jakarta.annotation.Nullable final String value) {
        this.addressLine2 = value;
    }
    /**
     * Sets the city property value. The city of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64 characters
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the companyName property value. The company name of the product manufacturer.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 100 characters
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the contactUrl property value. The contact URL of the product manufacturer.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250 characters
     * @param value Value to set for the contactUrl property.
     */
    public void setContactUrl(@jakarta.annotation.Nullable final String value) {
        this.contactUrl = value;
    }
    /**
     * Sets the country property value. This defines the list of valid country codes, adapted from http://www.iso.org/iso/country_codes, ISO 3166-1 country code. List elements take the following form to identify a two-letter code with a short name in English, a three-digit code, and a three-letter code: For example, the entry for Japan includes Japan, 392, JPN. Short codes provide uniform recognition, avoiding language-dependent country names. The number code is helpful where Latin script may be problematic. Not all listed codes are universally recognized as countries, for example: code AQ is Antarctica, 010, ATA For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the email property value. The product manufacturer&apos;s business email address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 180 characters
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the phone property value. The product manufacturer&apos;s business phone number.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64 characters
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the postalCode property value. The postal code of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 9 characters
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the stateOrProvince property value. The state or province of the product manufacturer&apos;s street address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64 characters
     * @param value Value to set for the stateOrProvince property.
     */
    public void setStateOrProvince(@jakarta.annotation.Nullable final String value) {
        this.stateOrProvince = value;
    }
}
