package com.ebay.listingmanagement.generated.media.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that provides an image&apos;s details including its URL and expiration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImageResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time when an unused EPS image will expire and be removed from the EPS server, in Coordinated Universal Time (UTC). As long as an EPS image is being used in an active listing, that image will remain on the EPS server and be accessible.
     */
    private String expirationDate;
    /**
     * The EPS URL to access the uploaded image. This URL will be used in listing calls to add the image to a listing.
     */
    private String imageUrl;
    /**
     * The EPS URL to access the maximum dimension version of the uploaded image.
     */
    private String maxDimensionImageUrl;
    /**
     * Instantiates a new {@link ImageResponse} and sets the default values.
     */
    public ImageResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImageResponse}
     */
    @jakarta.annotation.Nonnull
    public static ImageResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImageResponse();
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
     * Gets the expirationDate property value. The date and time when an unused EPS image will expire and be removed from the EPS server, in Coordinated Universal Time (UTC). As long as an EPS image is being used in an active listing, that image will remain on the EPS server and be accessible.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("expirationDate", (n) -> { this.setExpirationDate(n.getStringValue()); });
        deserializerMap.put("imageUrl", (n) -> { this.setImageUrl(n.getStringValue()); });
        deserializerMap.put("maxDimensionImageUrl", (n) -> { this.setMaxDimensionImageUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the imageUrl property value. The EPS URL to access the uploaded image. This URL will be used in listing calls to add the image to a listing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }
    /**
     * Gets the maxDimensionImageUrl property value. The EPS URL to access the maximum dimension version of the uploaded image.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMaxDimensionImageUrl() {
        return this.maxDimensionImageUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expirationDate", this.getExpirationDate());
        writer.writeStringValue("imageUrl", this.getImageUrl());
        writer.writeStringValue("maxDimensionImageUrl", this.getMaxDimensionImageUrl());
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
     * Sets the expirationDate property value. The date and time when an unused EPS image will expire and be removed from the EPS server, in Coordinated Universal Time (UTC). As long as an EPS image is being used in an active listing, that image will remain on the EPS server and be accessible.
     * @param value Value to set for the expirationDate property.
     */
    public void setExpirationDate(@jakarta.annotation.Nullable final String value) {
        this.expirationDate = value;
    }
    /**
     * Sets the imageUrl property value. The EPS URL to access the uploaded image. This URL will be used in listing calls to add the image to a listing.
     * @param value Value to set for the imageUrl property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.imageUrl = value;
    }
    /**
     * Sets the maxDimensionImageUrl property value. The EPS URL to access the maximum dimension version of the uploaded image.
     * @param value Value to set for the maxDimensionImageUrl property.
     */
    public void setMaxDimensionImageUrl(@jakarta.annotation.Nullable final String value) {
        this.maxDimensionImageUrl = value;
    }
}
