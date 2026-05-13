package com.ebay.listingmanagement.generated.media.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that provides the location of the image.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateImageFromUrlRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The image URL of the self-hosted picture to upload to eBay Picture Services (EPS). In addition to the picture requirements in &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot; target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;, the provided URL must be secured using HTTPS (HTTP is not permitted). For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.
     */
    private String imageUrl;
    /**
     * Instantiates a new {@link CreateImageFromUrlRequest} and sets the default values.
     */
    public CreateImageFromUrlRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateImageFromUrlRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateImageFromUrlRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateImageFromUrlRequest();
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
        deserializerMap.put("imageUrl", (n) -> { this.setImageUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the imageUrl property value. The image URL of the self-hosted picture to upload to eBay Picture Services (EPS). In addition to the picture requirements in &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot; target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;, the provided URL must be secured using HTTPS (HTTP is not permitted). For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("imageUrl", this.getImageUrl());
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
     * Sets the imageUrl property value. The image URL of the self-hosted picture to upload to eBay Picture Services (EPS). In addition to the picture requirements in &lt;a href=&quot;https://www.ebay.com/help/policies/listing-policies/picture-policy?id=4370&quot; target=&quot;_blank&quot;&gt;Picture policy&lt;/a&gt;, the provided URL must be secured using HTTPS (HTTP is not permitted). For more information, see &lt;a href=&quot;/api-docs/sell/static/inventory/managing-image-media.html#image-requirements&quot; target=&quot;_blank&quot;&gt;Image requirements&lt;/a&gt;.
     * @param value Value to set for the imageUrl property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.imageUrl = value;
    }
}
