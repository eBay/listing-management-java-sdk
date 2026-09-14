// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.listingmanagement.generated.feed.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container is used to return information about a specific inventory task.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryTask implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The timestamp when the task &lt;strong&gt;status&lt;/strong&gt; went into the &lt;code&gt;COMPLETED&lt;/code&gt;, &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;, or &lt;code&gt;PARTIALLY_PROCESSED&lt;/code&gt; state. This field is only returned if the status is one of the three completed values.
     */
    private String completionDate;
    /**
     * The date the task was created.
     */
    private String creationDate;
    /**
     * The path to the call URI used to retrieve the task. This field points to the &lt;strong&gt;getInventoryTask&lt;/strong&gt; URI.
     */
    private String detailHref;
    /**
     * The feed type associated with the inventory task.
     */
    private String feedType;
    /**
     * This container is used to set the filter criteria for the ActiveInventoryReport. A seller can retrieve listings for a specified format.
     */
    private InventoryFilterCriteria filterCriteria;
    /**
     * The schema version number associated with the task.
     */
    private String schemaVersion;
    /**
     * The status of the task. Users must wait until status is complete before moving on to the next step (such as uploading/downloading a file).
     */
    private FeedStatusEnum status;
    /**
     * The ID of the task. This ID is generated when the task was created by the &lt;strong&gt;createInventoryTask&lt;/strong&gt; method.
     */
    private String taskId;
    /**
     * This container provides summary information on an upload feed (not applicable for download feed types).
     */
    private UploadSummary uploadSummary;
    /**
     * Instantiates a new {@link InventoryTask} and sets the default values.
     */
    public InventoryTask() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryTask}
     */
    @jakarta.annotation.Nonnull
    public static InventoryTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryTask();
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
     * Gets the completionDate property value. The timestamp when the task &lt;strong&gt;status&lt;/strong&gt; went into the &lt;code&gt;COMPLETED&lt;/code&gt;, &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;, or &lt;code&gt;PARTIALLY_PROCESSED&lt;/code&gt; state. This field is only returned if the status is one of the three completed values.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompletionDate() {
        return this.completionDate;
    }
    /**
     * Gets the creationDate property value. The date the task was created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Gets the detailHref property value. The path to the call URI used to retrieve the task. This field points to the &lt;strong&gt;getInventoryTask&lt;/strong&gt; URI.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetailHref() {
        return this.detailHref;
    }
    /**
     * Gets the feedType property value. The feed type associated with the inventory task.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("completionDate", (n) -> { this.setCompletionDate(n.getStringValue()); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("detailHref", (n) -> { this.setDetailHref(n.getStringValue()); });
        deserializerMap.put("feedType", (n) -> { this.setFeedType(n.getStringValue()); });
        deserializerMap.put("filterCriteria", (n) -> { this.setFilterCriteria(n.getObjectValue(InventoryFilterCriteria::createFromDiscriminatorValue)); });
        deserializerMap.put("schemaVersion", (n) -> { this.setSchemaVersion(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FeedStatusEnum::forValue)); });
        deserializerMap.put("taskId", (n) -> { this.setTaskId(n.getStringValue()); });
        deserializerMap.put("uploadSummary", (n) -> { this.setUploadSummary(n.getObjectValue(UploadSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filterCriteria property value. This container is used to set the filter criteria for the ActiveInventoryReport. A seller can retrieve listings for a specified format.
     * @return a {@link InventoryFilterCriteria}
     */
    @jakarta.annotation.Nullable
    public InventoryFilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }
    /**
     * Gets the schemaVersion property value. The schema version number associated with the task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchemaVersion() {
        return this.schemaVersion;
    }
    /**
     * Gets the status property value. The status of the task. Users must wait until status is complete before moving on to the next step (such as uploading/downloading a file).
     * @return a {@link FeedStatusEnum}
     */
    @jakarta.annotation.Nullable
    public FeedStatusEnum getStatus() {
        return this.status;
    }
    /**
     * Gets the taskId property value. The ID of the task. This ID is generated when the task was created by the &lt;strong&gt;createInventoryTask&lt;/strong&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaskId() {
        return this.taskId;
    }
    /**
     * Gets the uploadSummary property value. This container provides summary information on an upload feed (not applicable for download feed types).
     * @return a {@link UploadSummary}
     */
    @jakarta.annotation.Nullable
    public UploadSummary getUploadSummary() {
        return this.uploadSummary;
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
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("taskId", this.getTaskId());
        writer.writeObjectValue("uploadSummary", this.getUploadSummary());
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
     * Sets the completionDate property value. The timestamp when the task &lt;strong&gt;status&lt;/strong&gt; went into the &lt;code&gt;COMPLETED&lt;/code&gt;, &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;, or &lt;code&gt;PARTIALLY_PROCESSED&lt;/code&gt; state. This field is only returned if the status is one of the three completed values.
     * @param value Value to set for the completionDate property.
     */
    public void setCompletionDate(@jakarta.annotation.Nullable final String value) {
        this.completionDate = value;
    }
    /**
     * Sets the creationDate property value. The date the task was created.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the detailHref property value. The path to the call URI used to retrieve the task. This field points to the &lt;strong&gt;getInventoryTask&lt;/strong&gt; URI.
     * @param value Value to set for the detailHref property.
     */
    public void setDetailHref(@jakarta.annotation.Nullable final String value) {
        this.detailHref = value;
    }
    /**
     * Sets the feedType property value. The feed type associated with the inventory task.
     * @param value Value to set for the feedType property.
     */
    public void setFeedType(@jakarta.annotation.Nullable final String value) {
        this.feedType = value;
    }
    /**
     * Sets the filterCriteria property value. This container is used to set the filter criteria for the ActiveInventoryReport. A seller can retrieve listings for a specified format.
     * @param value Value to set for the filterCriteria property.
     */
    public void setFilterCriteria(@jakarta.annotation.Nullable final InventoryFilterCriteria value) {
        this.filterCriteria = value;
    }
    /**
     * Sets the schemaVersion property value. The schema version number associated with the task.
     * @param value Value to set for the schemaVersion property.
     */
    public void setSchemaVersion(@jakarta.annotation.Nullable final String value) {
        this.schemaVersion = value;
    }
    /**
     * Sets the status property value. The status of the task. Users must wait until status is complete before moving on to the next step (such as uploading/downloading a file).
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FeedStatusEnum value) {
        this.status = value;
    }
    /**
     * Sets the taskId property value. The ID of the task. This ID is generated when the task was created by the &lt;strong&gt;createInventoryTask&lt;/strong&gt; method.
     * @param value Value to set for the taskId property.
     */
    public void setTaskId(@jakarta.annotation.Nullable final String value) {
        this.taskId = value;
    }
    /**
     * Sets the uploadSummary property value. This container provides summary information on an upload feed (not applicable for download feed types).
     * @param value Value to set for the uploadSummary property.
     */
    public void setUploadSummary(@jakarta.annotation.Nullable final UploadSummary value) {
        this.uploadSummary = value;
    }
}
