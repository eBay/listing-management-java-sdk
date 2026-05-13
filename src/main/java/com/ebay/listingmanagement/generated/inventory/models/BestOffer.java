package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the &lt;strong&gt;bestOfferTerms&lt;/strong&gt; container, which is used if the seller would like to support the Best Offer feature on their listing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BestOffer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to express a dollar value and the applicable currency.
     */
    private Amount autoAcceptPrice;
    /**
     * This type is used to express a dollar value and the applicable currency.
     */
    private Amount autoDeclinePrice;
    /**
     * This field indicates whether or not the Best Offer feature is enabled for the listing. A seller can enable the Best Offer feature for a listing as long as the category supports the Best Offer feature.&lt;br&gt;&lt;br&gt;The seller includes this field and sets its value to &lt;code&gt;true&lt;/code&gt; to enable Best Offer feature.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Best Offer is not available for multi-variation listings.&lt;/span&gt;
     */
    private Boolean bestOfferEnabled;
    /**
     * Instantiates a new {@link BestOffer} and sets the default values.
     */
    public BestOffer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BestOffer}
     */
    @jakarta.annotation.Nonnull
    public static BestOffer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BestOffer();
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
     * Gets the autoAcceptPrice property value. This type is used to express a dollar value and the applicable currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAutoAcceptPrice() {
        return this.autoAcceptPrice;
    }
    /**
     * Gets the autoDeclinePrice property value. This type is used to express a dollar value and the applicable currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAutoDeclinePrice() {
        return this.autoDeclinePrice;
    }
    /**
     * Gets the bestOfferEnabled property value. This field indicates whether or not the Best Offer feature is enabled for the listing. A seller can enable the Best Offer feature for a listing as long as the category supports the Best Offer feature.&lt;br&gt;&lt;br&gt;The seller includes this field and sets its value to &lt;code&gt;true&lt;/code&gt; to enable Best Offer feature.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Best Offer is not available for multi-variation listings.&lt;/span&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBestOfferEnabled() {
        return this.bestOfferEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("autoAcceptPrice", (n) -> { this.setAutoAcceptPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("autoDeclinePrice", (n) -> { this.setAutoDeclinePrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("bestOfferEnabled", (n) -> { this.setBestOfferEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("autoAcceptPrice", this.getAutoAcceptPrice());
        writer.writeObjectValue("autoDeclinePrice", this.getAutoDeclinePrice());
        writer.writeBooleanValue("bestOfferEnabled", this.getBestOfferEnabled());
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
     * Sets the autoAcceptPrice property value. This type is used to express a dollar value and the applicable currency.
     * @param value Value to set for the autoAcceptPrice property.
     */
    public void setAutoAcceptPrice(@jakarta.annotation.Nullable final Amount value) {
        this.autoAcceptPrice = value;
    }
    /**
     * Sets the autoDeclinePrice property value. This type is used to express a dollar value and the applicable currency.
     * @param value Value to set for the autoDeclinePrice property.
     */
    public void setAutoDeclinePrice(@jakarta.annotation.Nullable final Amount value) {
        this.autoDeclinePrice = value;
    }
    /**
     * Sets the bestOfferEnabled property value. This field indicates whether or not the Best Offer feature is enabled for the listing. A seller can enable the Best Offer feature for a listing as long as the category supports the Best Offer feature.&lt;br&gt;&lt;br&gt;The seller includes this field and sets its value to &lt;code&gt;true&lt;/code&gt; to enable Best Offer feature.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Best Offer is not available for multi-variation listings.&lt;/span&gt;
     * @param value Value to set for the bestOfferEnabled property.
     */
    public void setBestOfferEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.bestOfferEnabled = value;
    }
}
