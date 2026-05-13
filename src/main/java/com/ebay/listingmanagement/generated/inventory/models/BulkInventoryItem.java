package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base request of the &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkInventoryItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The details of each inventory item that is being created or updated is passed in under this container. Up to 25 inventory item records can be created and/or updated with one &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call.
     */
    private java.util.List<InventoryItemWithSkuLocale> requests;
    /**
     * Instantiates a new {@link BulkInventoryItem} and sets the default values.
     */
    public BulkInventoryItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkInventoryItem}
     */
    @jakarta.annotation.Nonnull
    public static BulkInventoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkInventoryItem();
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
        deserializerMap.put("requests", (n) -> { this.setRequests(n.getCollectionOfObjectValues(InventoryItemWithSkuLocale::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the requests property value. The details of each inventory item that is being created or updated is passed in under this container. Up to 25 inventory item records can be created and/or updated with one &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call.
     * @return a {@link java.util.List<InventoryItemWithSkuLocale>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InventoryItemWithSkuLocale> getRequests() {
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
     * Sets the requests property value. The details of each inventory item that is being created or updated is passed in under this container. Up to 25 inventory item records can be created and/or updated with one &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call.
     * @param value Value to set for the requests property.
     */
    public void setRequests(@jakarta.annotation.Nullable final java.util.List<InventoryItemWithSkuLocale> value) {
        this.requests = value;
    }
}
