package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the base request of the &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; method, which is used to create up to 25 new offers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkEbayOfferDetailsWithKeys implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The details of each offer that is being created is passed in under this container. Up to 25 offers can be created with one &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; call.
     */
    private java.util.List<EbayOfferDetailsWithKeys> requests;
    /**
     * Instantiates a new {@link BulkEbayOfferDetailsWithKeys} and sets the default values.
     */
    public BulkEbayOfferDetailsWithKeys() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkEbayOfferDetailsWithKeys}
     */
    @jakarta.annotation.Nonnull
    public static BulkEbayOfferDetailsWithKeys createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkEbayOfferDetailsWithKeys();
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
        deserializerMap.put("requests", (n) -> { this.setRequests(n.getCollectionOfObjectValues(EbayOfferDetailsWithKeys::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the requests property value. The details of each offer that is being created is passed in under this container. Up to 25 offers can be created with one &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; call.
     * @return a {@link java.util.List<EbayOfferDetailsWithKeys>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EbayOfferDetailsWithKeys> getRequests() {
        return this.requests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("requests", this.getRequests());
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
     * Sets the requests property value. The details of each offer that is being created is passed in under this container. Up to 25 offers can be created with one &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; call.
     * @param value Value to set for the requests property.
     */
    public void setRequests(@jakarta.annotation.Nullable final java.util.List<EbayOfferDetailsWithKeys> value) {
        this.requests = value;
    }
}
