package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the base request payload of the &lt;strong&gt;getListingFees&lt;/strong&gt; call.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OfferKeysWithId implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is used to identify one or more (up to 250) unpublished offers for which expected listing fees will be retrieved. The user passes one or more &lt;strong&gt;offerId&lt;/strong&gt; values (maximum of 250) in to this container to identify the unpublished offers in which to retrieve expected listing fees. This call is only applicable for offers in the unpublished state. &lt;br&gt;&lt;br&gt;The call response gives aggregate fee amounts per eBay marketplace, and does not give fee information at the individual offer level.
     */
    private java.util.List<OfferKeyWithId> offers;
    /**
     * Instantiates a new {@link OfferKeysWithId} and sets the default values.
     */
    public OfferKeysWithId() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OfferKeysWithId}
     */
    @jakarta.annotation.Nonnull
    public static OfferKeysWithId createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfferKeysWithId();
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
        deserializerMap.put("offers", (n) -> { this.setOffers(n.getCollectionOfObjectValues(OfferKeyWithId::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the offers property value. This container is used to identify one or more (up to 250) unpublished offers for which expected listing fees will be retrieved. The user passes one or more &lt;strong&gt;offerId&lt;/strong&gt; values (maximum of 250) in to this container to identify the unpublished offers in which to retrieve expected listing fees. This call is only applicable for offers in the unpublished state. &lt;br&gt;&lt;br&gt;The call response gives aggregate fee amounts per eBay marketplace, and does not give fee information at the individual offer level.
     * @return a {@link java.util.List<OfferKeyWithId>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OfferKeyWithId> getOffers() {
        return this.offers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("offers", this.getOffers());
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
     * Sets the offers property value. This container is used to identify one or more (up to 250) unpublished offers for which expected listing fees will be retrieved. The user passes one or more &lt;strong&gt;offerId&lt;/strong&gt; values (maximum of 250) in to this container to identify the unpublished offers in which to retrieve expected listing fees. This call is only applicable for offers in the unpublished state. &lt;br&gt;&lt;br&gt;The call response gives aggregate fee amounts per eBay marketplace, and does not give fee information at the individual offer level.
     * @param value Value to set for the offers property.
     */
    public void setOffers(@jakarta.annotation.Nullable final java.util.List<OfferKeyWithId> value) {
        this.offers = value;
    }
}
