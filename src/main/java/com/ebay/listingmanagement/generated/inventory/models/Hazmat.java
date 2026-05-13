package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container is used by the seller to provide hazardous material information for the listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;statements&lt;/b&gt; element is required to complete the hazmat section of a listing.&lt;br&gt;&lt;br&gt;The following elements are optional:&lt;ul&gt;&lt;li&gt;&lt;b&gt;pictograms&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;signalWord&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;component&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Hazmat implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is used by the seller to provide component information for the listing. For example, component information can provide the specific material of Hazmat concern.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 120
     */
    private String component;
    /**
     * An array of comma-separated string values listing applicable pictogram code(s) for Hazard Pictogram(s).&lt;br&gt;&lt;br&gt;If your product contains hazardous substances or mixtures, please select the values corresponding to the hazard pictograms that are stated on your product&apos;s Safety Data Sheet. The selected hazard information will be displayed on your listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getHazardousMaterialsLabels &quot; target=&quot;_blank&quot;&gt;getHazardousMaterialsLabels&lt;/a&gt; method in the Metadata API to find supported values for a specific marketplace/site. Refer to &lt;a href=&quot;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Pictogra&quot; target=&quot;_blank&quot;&gt;Pictogram sample values&lt;/a&gt; for additional information.&lt;/span&gt;
     */
    private java.util.List<String> pictograms;
    /**
     * This field sets the signal word for hazardous materials in the listing.&lt;br&gt;&lt;br&gt;If your product contains hazardous substances or mixtures, please select a value corresponding to the signal word that is stated on your product&apos;s Safety Data Sheet. The selected hazard information will be displayed on your listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getHazardousMaterialsLabels &quot; target=&quot;_blank&quot;&gt;getHazardousMaterialsLabels&lt;/a&gt; method in the &lt;a href=&quot;/api-docs/sell/metadata/resources/methods &quot; target=&quot;_blank&quot;&gt;Metadata API&lt;/a&gt; to find supported values for a specific marketplace/site. Refer to &lt;a href=&quot;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Signal&quot; target=&quot;_blank&quot;&gt;Signal word information&lt;/a&gt; for additional information.&lt;/span&gt;
     */
    private String signalWord;
    /**
     * An array of comma-separated string values specifying applicable statement code(s) for hazard statement(s) for the listing.&lt;br&gt;&lt;br&gt;If your product contains hazardous substances or mixtures, please select the values corresponding to the hazard statements that are stated on your product&apos;s Safety Data Sheet. The selected hazard information will be displayed on your listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getHazardousMaterialsLabels &quot; target=&quot;_blank&quot;&gt;getHazardousMaterialsLabels&lt;/a&gt; method in the Metadata API to find supported values for a specific marketplace/site. Refer to &lt;a href=&quot;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Hazard&quot; target=&quot;_blank&quot;&gt;Hazard statement sample values&lt;/a&gt; for additional information.&lt;/span&gt;&lt;br&gt;This field is required if hazardous material information is provided for the listing.
     */
    private java.util.List<String> statements;
    /**
     * Instantiates a new {@link Hazmat} and sets the default values.
     */
    public Hazmat() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Hazmat}
     */
    @jakarta.annotation.Nonnull
    public static Hazmat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Hazmat();
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
     * Gets the component property value. This field is used by the seller to provide component information for the listing. For example, component information can provide the specific material of Hazmat concern.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 120
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComponent() {
        return this.component;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("component", (n) -> { this.setComponent(n.getStringValue()); });
        deserializerMap.put("pictograms", (n) -> { this.setPictograms(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("signalWord", (n) -> { this.setSignalWord(n.getStringValue()); });
        deserializerMap.put("statements", (n) -> { this.setStatements(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the pictograms property value. An array of comma-separated string values listing applicable pictogram code(s) for Hazard Pictogram(s).&lt;br&gt;&lt;br&gt;If your product contains hazardous substances or mixtures, please select the values corresponding to the hazard pictograms that are stated on your product&apos;s Safety Data Sheet. The selected hazard information will be displayed on your listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getHazardousMaterialsLabels &quot; target=&quot;_blank&quot;&gt;getHazardousMaterialsLabels&lt;/a&gt; method in the Metadata API to find supported values for a specific marketplace/site. Refer to &lt;a href=&quot;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Pictogra&quot; target=&quot;_blank&quot;&gt;Pictogram sample values&lt;/a&gt; for additional information.&lt;/span&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPictograms() {
        return this.pictograms;
    }
    /**
     * Gets the signalWord property value. This field sets the signal word for hazardous materials in the listing.&lt;br&gt;&lt;br&gt;If your product contains hazardous substances or mixtures, please select a value corresponding to the signal word that is stated on your product&apos;s Safety Data Sheet. The selected hazard information will be displayed on your listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getHazardousMaterialsLabels &quot; target=&quot;_blank&quot;&gt;getHazardousMaterialsLabels&lt;/a&gt; method in the &lt;a href=&quot;/api-docs/sell/metadata/resources/methods &quot; target=&quot;_blank&quot;&gt;Metadata API&lt;/a&gt; to find supported values for a specific marketplace/site. Refer to &lt;a href=&quot;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Signal&quot; target=&quot;_blank&quot;&gt;Signal word information&lt;/a&gt; for additional information.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignalWord() {
        return this.signalWord;
    }
    /**
     * Gets the statements property value. An array of comma-separated string values specifying applicable statement code(s) for hazard statement(s) for the listing.&lt;br&gt;&lt;br&gt;If your product contains hazardous substances or mixtures, please select the values corresponding to the hazard statements that are stated on your product&apos;s Safety Data Sheet. The selected hazard information will be displayed on your listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getHazardousMaterialsLabels &quot; target=&quot;_blank&quot;&gt;getHazardousMaterialsLabels&lt;/a&gt; method in the Metadata API to find supported values for a specific marketplace/site. Refer to &lt;a href=&quot;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Hazard&quot; target=&quot;_blank&quot;&gt;Hazard statement sample values&lt;/a&gt; for additional information.&lt;/span&gt;&lt;br&gt;This field is required if hazardous material information is provided for the listing.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStatements() {
        return this.statements;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("component", this.getComponent());
        writer.writeCollectionOfPrimitiveValues("pictograms", this.getPictograms());
        writer.writeStringValue("signalWord", this.getSignalWord());
        writer.writeCollectionOfPrimitiveValues("statements", this.getStatements());
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
     * Sets the component property value. This field is used by the seller to provide component information for the listing. For example, component information can provide the specific material of Hazmat concern.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 120
     * @param value Value to set for the component property.
     */
    public void setComponent(@jakarta.annotation.Nullable final String value) {
        this.component = value;
    }
    /**
     * Sets the pictograms property value. An array of comma-separated string values listing applicable pictogram code(s) for Hazard Pictogram(s).&lt;br&gt;&lt;br&gt;If your product contains hazardous substances or mixtures, please select the values corresponding to the hazard pictograms that are stated on your product&apos;s Safety Data Sheet. The selected hazard information will be displayed on your listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getHazardousMaterialsLabels &quot; target=&quot;_blank&quot;&gt;getHazardousMaterialsLabels&lt;/a&gt; method in the Metadata API to find supported values for a specific marketplace/site. Refer to &lt;a href=&quot;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Pictogra&quot; target=&quot;_blank&quot;&gt;Pictogram sample values&lt;/a&gt; for additional information.&lt;/span&gt;
     * @param value Value to set for the pictograms property.
     */
    public void setPictograms(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.pictograms = value;
    }
    /**
     * Sets the signalWord property value. This field sets the signal word for hazardous materials in the listing.&lt;br&gt;&lt;br&gt;If your product contains hazardous substances or mixtures, please select a value corresponding to the signal word that is stated on your product&apos;s Safety Data Sheet. The selected hazard information will be displayed on your listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getHazardousMaterialsLabels &quot; target=&quot;_blank&quot;&gt;getHazardousMaterialsLabels&lt;/a&gt; method in the &lt;a href=&quot;/api-docs/sell/metadata/resources/methods &quot; target=&quot;_blank&quot;&gt;Metadata API&lt;/a&gt; to find supported values for a specific marketplace/site. Refer to &lt;a href=&quot;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Signal&quot; target=&quot;_blank&quot;&gt;Signal word information&lt;/a&gt; for additional information.&lt;/span&gt;
     * @param value Value to set for the signalWord property.
     */
    public void setSignalWord(@jakarta.annotation.Nullable final String value) {
        this.signalWord = value;
    }
    /**
     * Sets the statements property value. An array of comma-separated string values specifying applicable statement code(s) for hazard statement(s) for the listing.&lt;br&gt;&lt;br&gt;If your product contains hazardous substances or mixtures, please select the values corresponding to the hazard statements that are stated on your product&apos;s Safety Data Sheet. The selected hazard information will be displayed on your listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getHazardousMaterialsLabels &quot; target=&quot;_blank&quot;&gt;getHazardousMaterialsLabels&lt;/a&gt; method in the Metadata API to find supported values for a specific marketplace/site. Refer to &lt;a href=&quot;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Hazard&quot; target=&quot;_blank&quot;&gt;Hazard statement sample values&lt;/a&gt; for additional information.&lt;/span&gt;&lt;br&gt;This field is required if hazardous material information is provided for the listing.
     * @param value Value to set for the statements property.
     */
    public void setStatements(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.statements = value;
    }
}
