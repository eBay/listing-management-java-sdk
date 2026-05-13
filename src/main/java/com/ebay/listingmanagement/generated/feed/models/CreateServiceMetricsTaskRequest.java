package com.ebay.listingmanagement.generated.feed.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The type that defines the fields for the Customer Service Metric reports generated with the Feed API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateServiceMetricsTaskRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The &lt;strong&gt;feedType&lt;/strong&gt; specified for the customer service metric task being created. The report lists the transaction details that contribute to the service metrics evaluation. Supported types include:&lt;p&gt;&lt;code&gt;CUSTOMER_SERVICE_METRICS_REPORT&lt;/code&gt;&lt;/p&gt;
     */
    private String feedType;
    /**
     * A complex data type that filters data for report creation. See &lt;strong&gt;CustomerServiceMetricsFilterCriteria&lt;/strong&gt; for fields and descriptions.
     */
    private CustomerServiceMetricsFilterCriteria filterCriteria;
    /**
     * The version number of the customer service metric.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field &lt;b&gt;must&lt;/b&gt; have a value of &lt;code&gt;1.0&lt;/code&gt;.&lt;/span&gt;
     */
    private String schemaVersion;
    /**
     * Instantiates a new {@link CreateServiceMetricsTaskRequest} and sets the default values.
     */
    public CreateServiceMetricsTaskRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateServiceMetricsTaskRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateServiceMetricsTaskRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateServiceMetricsTaskRequest();
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
     * Gets the feedType property value. The &lt;strong&gt;feedType&lt;/strong&gt; specified for the customer service metric task being created. The report lists the transaction details that contribute to the service metrics evaluation. Supported types include:&lt;p&gt;&lt;code&gt;CUSTOMER_SERVICE_METRICS_REPORT&lt;/code&gt;&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeedType() {
        return this.feedType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("feedType", (n) -> { this.setFeedType(n.getStringValue()); });
        deserializerMap.put("filterCriteria", (n) -> { this.setFilterCriteria(n.getObjectValue(CustomerServiceMetricsFilterCriteria::createFromDiscriminatorValue)); });
        deserializerMap.put("schemaVersion", (n) -> { this.setSchemaVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filterCriteria property value. A complex data type that filters data for report creation. See &lt;strong&gt;CustomerServiceMetricsFilterCriteria&lt;/strong&gt; for fields and descriptions.
     * @return a {@link CustomerServiceMetricsFilterCriteria}
     */
    @jakarta.annotation.Nullable
    public CustomerServiceMetricsFilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }
    /**
     * Gets the schemaVersion property value. The version number of the customer service metric.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field &lt;b&gt;must&lt;/b&gt; have a value of &lt;code&gt;1.0&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchemaVersion() {
        return this.schemaVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("feedType", this.getFeedType());
        writer.writeObjectValue("filterCriteria", this.getFilterCriteria());
        writer.writeStringValue("schemaVersion", this.getSchemaVersion());
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
     * Sets the feedType property value. The &lt;strong&gt;feedType&lt;/strong&gt; specified for the customer service metric task being created. The report lists the transaction details that contribute to the service metrics evaluation. Supported types include:&lt;p&gt;&lt;code&gt;CUSTOMER_SERVICE_METRICS_REPORT&lt;/code&gt;&lt;/p&gt;
     * @param value Value to set for the feedType property.
     */
    public void setFeedType(@jakarta.annotation.Nullable final String value) {
        this.feedType = value;
    }
    /**
     * Sets the filterCriteria property value. A complex data type that filters data for report creation. See &lt;strong&gt;CustomerServiceMetricsFilterCriteria&lt;/strong&gt; for fields and descriptions.
     * @param value Value to set for the filterCriteria property.
     */
    public void setFilterCriteria(@jakarta.annotation.Nullable final CustomerServiceMetricsFilterCriteria value) {
        this.filterCriteria = value;
    }
    /**
     * Sets the schemaVersion property value. The version number of the customer service metric.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field &lt;b&gt;must&lt;/b&gt; have a value of &lt;code&gt;1.0&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the schemaVersion property.
     */
    public void setSchemaVersion(@jakarta.annotation.Nullable final String value) {
        this.schemaVersion = value;
    }
}
