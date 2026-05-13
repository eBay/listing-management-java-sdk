package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type lists regional product compliance policies to be used by an offer when it is published and converted to a listing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegionalProductCompliancePolicies implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The array of country-specific product compliance policies to be used by an offer when it is published and converted to a listing.
     */
    private java.util.List<CountryPolicy> countryPolicies;
    /**
     * Instantiates a new {@link RegionalProductCompliancePolicies} and sets the default values.
     */
    public RegionalProductCompliancePolicies() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RegionalProductCompliancePolicies}
     */
    @jakarta.annotation.Nonnull
    public static RegionalProductCompliancePolicies createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegionalProductCompliancePolicies();
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
     * Gets the countryPolicies property value. The array of country-specific product compliance policies to be used by an offer when it is published and converted to a listing.
     * @return a {@link java.util.List<CountryPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CountryPolicy> getCountryPolicies() {
        return this.countryPolicies;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("countryPolicies", (n) -> { this.setCountryPolicies(n.getCollectionOfObjectValues(CountryPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("countryPolicies", this.getCountryPolicies());
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
     * Sets the countryPolicies property value. The array of country-specific product compliance policies to be used by an offer when it is published and converted to a listing.
     * @param value Value to set for the countryPolicies property.
     */
    public void setCountryPolicies(@jakarta.annotation.Nullable final java.util.List<CountryPolicy> value) {
        this.countryPolicies = value;
    }
}
