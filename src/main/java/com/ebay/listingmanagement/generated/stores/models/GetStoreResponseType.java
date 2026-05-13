package com.ebay.listingmanagement.generated.stores.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base response type of the &lt;b&gt;getStore&lt;/b&gt; method. It is used to describe a seller&apos;s eBay store, and includes the eBay Store name, the description of the store, the URL to the eBay Store.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetStoreResponseType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The seller-provided description of the eBay Store.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max length: &lt;/b&gt;300
     */
    private String description;
    /**
     * Indicates the time the store was last opened or reopened.
     */
    private String lastOpenedTime;
    /**
     * This type is used to provide url of the seller&apos;s store logo.
     */
    private StoreLogoType logo;
    /**
     * The name of the eBay Store. The name is shown at the top of the Store page.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max length: &lt;/b&gt;35
     */
    private String name;
    /**
     * The complete URL of the user&apos;s store.
     */
    private String url;
    /**
     * The relative URL path of the Store.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max length: &lt;/b&gt;58
     */
    private String urlPath;
    /**
     * Instantiates a new {@link GetStoreResponseType} and sets the default values.
     */
    public GetStoreResponseType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetStoreResponseType}
     */
    @jakarta.annotation.Nonnull
    public static GetStoreResponseType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetStoreResponseType();
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
     * Gets the description property value. The seller-provided description of the eBay Store.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max length: &lt;/b&gt;300
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("lastOpenedTime", (n) -> { this.setLastOpenedTime(n.getStringValue()); });
        deserializerMap.put("logo", (n) -> { this.setLogo(n.getObjectValue(StoreLogoType::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        deserializerMap.put("urlPath", (n) -> { this.setUrlPath(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastOpenedTime property value. Indicates the time the store was last opened or reopened.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastOpenedTime() {
        return this.lastOpenedTime;
    }
    /**
     * Gets the logo property value. This type is used to provide url of the seller&apos;s store logo.
     * @return a {@link StoreLogoType}
     */
    @jakarta.annotation.Nullable
    public StoreLogoType getLogo() {
        return this.logo;
    }
    /**
     * Gets the name property value. The name of the eBay Store. The name is shown at the top of the Store page.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max length: &lt;/b&gt;35
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the url property value. The complete URL of the user&apos;s store.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Gets the urlPath property value. The relative URL path of the Store.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max length: &lt;/b&gt;58
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrlPath() {
        return this.urlPath;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("lastOpenedTime", this.getLastOpenedTime());
        writer.writeObjectValue("logo", this.getLogo());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("url", this.getUrl());
        writer.writeStringValue("urlPath", this.getUrlPath());
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
     * Sets the description property value. The seller-provided description of the eBay Store.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max length: &lt;/b&gt;300
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the lastOpenedTime property value. Indicates the time the store was last opened or reopened.
     * @param value Value to set for the lastOpenedTime property.
     */
    public void setLastOpenedTime(@jakarta.annotation.Nullable final String value) {
        this.lastOpenedTime = value;
    }
    /**
     * Sets the logo property value. This type is used to provide url of the seller&apos;s store logo.
     * @param value Value to set for the logo property.
     */
    public void setLogo(@jakarta.annotation.Nullable final StoreLogoType value) {
        this.logo = value;
    }
    /**
     * Sets the name property value. The name of the eBay Store. The name is shown at the top of the Store page.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max length: &lt;/b&gt;35
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the url property value. The complete URL of the user&apos;s store.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
    /**
     * Sets the urlPath property value. The relative URL path of the Store.&lt;br&gt;&lt;br&gt; &lt;b&gt;Max length: &lt;/b&gt;58
     * @param value Value to set for the urlPath property.
     */
    public void setUrlPath(@jakarta.annotation.Nullable final String value) {
        this.urlPath = value;
    }
}
