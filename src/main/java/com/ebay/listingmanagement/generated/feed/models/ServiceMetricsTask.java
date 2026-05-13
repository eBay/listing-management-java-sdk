package com.ebay.listingmanagement.generated.feed.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines customer service metric task response fields.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceMetricsTask implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The timestamp when the customer service metrics task went into the &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt; state. This field is only returned if the status is one of the two completed values. This state means that eBay has compiled the report for the seller based on the sellers filter criteria, and the seller can run a &lt;strong&gt;getResultFile&lt;/strong&gt; call to download the report.
     */
    private String completionDate;
    /**
     * The date the customer service metrics task was created.
     */
    private String creationDate;
    /**
     * The relative &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; call URI path to retrieve the corresponding task.
     */
    private String detailHref;
    /**
     * The feed type associated with the task.
     */
    private String feedType;
    /**
     * A complex data type that filters data for report creation. See &lt;strong&gt;CustomerServiceMetricsFilterCriteria&lt;/strong&gt; for fields and descriptions.
     */
    private CustomerServiceMetricsFilterCriteria filterCriteria;
    /**
     * The schema version number of the file format. If omitted, the default value is used. &lt;p&gt;&lt;b&gt;Default value: &lt;/b&gt;&lt;code&gt;1.0&lt;/code&gt;&lt;p&gt;
     */
    private String schemaVersion;
    /**
     * An enumeration value that indicates the state of the task. See &lt;strong&gt;FeedStatusEnum&lt;/strong&gt; for values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:FeedStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String status;
    /**
     * The unique eBay-assigned ID of the task.
     */
    private String taskId;
    /**
     * Instantiates a new {@link ServiceMetricsTask} and sets the default values.
     */
    public ServiceMetricsTask() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServiceMetricsTask}
     */
    @jakarta.annotation.Nonnull
    public static ServiceMetricsTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceMetricsTask();
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
     * Gets the completionDate property value. The timestamp when the customer service metrics task went into the &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt; state. This field is only returned if the status is one of the two completed values. This state means that eBay has compiled the report for the seller based on the sellers filter criteria, and the seller can run a &lt;strong&gt;getResultFile&lt;/strong&gt; call to download the report.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompletionDate() {
        return this.completionDate;
    }
    /**
     * Gets the creationDate property value. The date the customer service metrics task was created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Gets the detailHref property value. The relative &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; call URI path to retrieve the corresponding task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetailHref() {
        return this.detailHref;
    }
    /**
     * Gets the feedType property value. The feed type associated with the task.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("completionDate", (n) -> { this.setCompletionDate(n.getStringValue()); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("detailHref", (n) -> { this.setDetailHref(n.getStringValue()); });
        deserializerMap.put("feedType", (n) -> { this.setFeedType(n.getStringValue()); });
        deserializerMap.put("filterCriteria", (n) -> { this.setFilterCriteria(n.getObjectValue(CustomerServiceMetricsFilterCriteria::createFromDiscriminatorValue)); });
        deserializerMap.put("schemaVersion", (n) -> { this.setSchemaVersion(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("taskId", (n) -> { this.setTaskId(n.getStringValue()); });
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
     * Gets the schemaVersion property value. The schema version number of the file format. If omitted, the default value is used. &lt;p&gt;&lt;b&gt;Default value: &lt;/b&gt;&lt;code&gt;1.0&lt;/code&gt;&lt;p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchemaVersion() {
        return this.schemaVersion;
    }
    /**
     * Gets the status property value. An enumeration value that indicates the state of the task. See &lt;strong&gt;FeedStatusEnum&lt;/strong&gt; for values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:FeedStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the taskId property value. The unique eBay-assigned ID of the task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaskId() {
        return this.taskId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("completionDate", this.getCompletionDate());
        writer.writeStringValue("creationDate", this.getCreationDate());
        writer.writeStringValue("detailHref", this.getDetailHref());
        writer.writeStringValue("feedType", this.getFeedType());
        writer.writeObjectValue("filterCriteria", this.getFilterCriteria());
        writer.writeStringValue("schemaVersion", this.getSchemaVersion());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("taskId", this.getTaskId());
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
     * Sets the completionDate property value. The timestamp when the customer service metrics task went into the &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt; state. This field is only returned if the status is one of the two completed values. This state means that eBay has compiled the report for the seller based on the sellers filter criteria, and the seller can run a &lt;strong&gt;getResultFile&lt;/strong&gt; call to download the report.
     * @param value Value to set for the completionDate property.
     */
    public void setCompletionDate(@jakarta.annotation.Nullable final String value) {
        this.completionDate = value;
    }
    /**
     * Sets the creationDate property value. The date the customer service metrics task was created.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the detailHref property value. The relative &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; call URI path to retrieve the corresponding task.
     * @param value Value to set for the detailHref property.
     */
    public void setDetailHref(@jakarta.annotation.Nullable final String value) {
        this.detailHref = value;
    }
    /**
     * Sets the feedType property value. The feed type associated with the task.
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
     * Sets the schemaVersion property value. The schema version number of the file format. If omitted, the default value is used. &lt;p&gt;&lt;b&gt;Default value: &lt;/b&gt;&lt;code&gt;1.0&lt;/code&gt;&lt;p&gt;
     * @param value Value to set for the schemaVersion property.
     */
    public void setSchemaVersion(@jakarta.annotation.Nullable final String value) {
        this.schemaVersion = value;
    }
    /**
     * Sets the status property value. An enumeration value that indicates the state of the task. See &lt;strong&gt;FeedStatusEnum&lt;/strong&gt; for values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:FeedStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the taskId property value. The unique eBay-assigned ID of the task.
     * @param value Value to set for the taskId property.
     */
    public void setTaskId(@jakarta.annotation.Nullable final String value) {
        this.taskId = value;
    }
}
