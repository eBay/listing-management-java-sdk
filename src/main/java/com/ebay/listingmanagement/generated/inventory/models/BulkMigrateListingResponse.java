package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the response payload of the &lt;strong&gt;bulkMigrateListings&lt;/strong&gt; call.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkMigrateListingResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This is the base container of the response payload of the &lt;strong&gt;bulkMigrateListings&lt;/strong&gt; call. The results of each attempted listing migration is captured under this container.
     */
    private java.util.List<MigrateListingResponse> responses;
    /**
     * Instantiates a new {@link BulkMigrateListingResponse} and sets the default values.
     */
    public BulkMigrateListingResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkMigrateListingResponse}
     */
    @jakarta.annotation.Nonnull
    public static BulkMigrateListingResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkMigrateListingResponse();
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
        deserializerMap.put("responses", (n) -> { this.setResponses(n.getCollectionOfObjectValues(MigrateListingResponse::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the responses property value. This is the base container of the response payload of the &lt;strong&gt;bulkMigrateListings&lt;/strong&gt; call. The results of each attempted listing migration is captured under this container.
     * @return a {@link java.util.List<MigrateListingResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MigrateListingResponse> getResponses() {
        return this.responses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("responses", this.getResponses());
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
     * Sets the responses property value. This is the base container of the response payload of the &lt;strong&gt;bulkMigrateListings&lt;/strong&gt; call. The results of each attempted listing migration is captured under this container.
     * @param value Value to set for the responses property.
     */
    public void setResponses(@jakarta.annotation.Nullable final java.util.List<MigrateListingResponse> value) {
        this.responses = value;
    }
}
