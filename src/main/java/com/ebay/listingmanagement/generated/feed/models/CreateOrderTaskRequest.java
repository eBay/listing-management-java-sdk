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
 * The type that defines the fields for the &lt;b&gt; createOrderTask&lt;/b&gt; request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateOrderTaskRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The feed type associated with the task. The only presently supported value is &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#merchant-data-reports-download-feed-types&quot; target=&quot;_blank&quot;&gt;Report download feed types&lt;/a&gt; for more information.
     */
    private String feedType;
    /**
     * The type that defines the fields for the order filters.
     */
    private OrderFilterCriteria filterCriteria;
    /**
     * The schema version of the LMS OrderReport. For the &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt; feed type, see the &lt;a href=&quot;/devzone/merchant-data/CallRef/OrderReport.html#OrderReport&quot;&gt;OrderReport&lt;/a&gt; reference page to see the present schema version. The &lt;b&gt; schemaVersion&lt;/b&gt; value is the version number shown at the top of the &lt;b&gt; OrderReport&lt;/b&gt; page. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Restriction: &lt;/b&gt; This value must be 1113 or higher. The OrderReport schema version is updated about every two weeks. All version numbers are odd numbers (even numbers are skipped). For example, the next release version after &apos;1113&apos; is &apos;1115&apos;.
     */
    private String schemaVersion;
    /**
     * Instantiates a new {@link CreateOrderTaskRequest} and sets the default values.
     */
    public CreateOrderTaskRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateOrderTaskRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateOrderTaskRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateOrderTaskRequest();
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
     * Gets the feedType property value. The feed type associated with the task. The only presently supported value is &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#merchant-data-reports-download-feed-types&quot; target=&quot;_blank&quot;&gt;Report download feed types&lt;/a&gt; for more information.
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
        deserializerMap.put("filterCriteria", (n) -> { this.setFilterCriteria(n.getObjectValue(OrderFilterCriteria::createFromDiscriminatorValue)); });
        deserializerMap.put("schemaVersion", (n) -> { this.setSchemaVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filterCriteria property value. The type that defines the fields for the order filters.
     * @return a {@link OrderFilterCriteria}
     */
    @jakarta.annotation.Nullable
    public OrderFilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }
    /**
     * Gets the schemaVersion property value. The schema version of the LMS OrderReport. For the &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt; feed type, see the &lt;a href=&quot;/devzone/merchant-data/CallRef/OrderReport.html#OrderReport&quot;&gt;OrderReport&lt;/a&gt; reference page to see the present schema version. The &lt;b&gt; schemaVersion&lt;/b&gt; value is the version number shown at the top of the &lt;b&gt; OrderReport&lt;/b&gt; page. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Restriction: &lt;/b&gt; This value must be 1113 or higher. The OrderReport schema version is updated about every two weeks. All version numbers are odd numbers (even numbers are skipped). For example, the next release version after &apos;1113&apos; is &apos;1115&apos;.
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
     * Sets the feedType property value. The feed type associated with the task. The only presently supported value is &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt;.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#merchant-data-reports-download-feed-types&quot; target=&quot;_blank&quot;&gt;Report download feed types&lt;/a&gt; for more information.
     * @param value Value to set for the feedType property.
     */
    public void setFeedType(@jakarta.annotation.Nullable final String value) {
        this.feedType = value;
    }
    /**
     * Sets the filterCriteria property value. The type that defines the fields for the order filters.
     * @param value Value to set for the filterCriteria property.
     */
    public void setFilterCriteria(@jakarta.annotation.Nullable final OrderFilterCriteria value) {
        this.filterCriteria = value;
    }
    /**
     * Sets the schemaVersion property value. The schema version of the LMS OrderReport. For the &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt; feed type, see the &lt;a href=&quot;/devzone/merchant-data/CallRef/OrderReport.html#OrderReport&quot;&gt;OrderReport&lt;/a&gt; reference page to see the present schema version. The &lt;b&gt; schemaVersion&lt;/b&gt; value is the version number shown at the top of the &lt;b&gt; OrderReport&lt;/b&gt; page. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Restriction: &lt;/b&gt; This value must be 1113 or higher. The OrderReport schema version is updated about every two weeks. All version numbers are odd numbers (even numbers are skipped). For example, the next release version after &apos;1113&apos; is &apos;1115&apos;.
     * @param value Value to set for the schemaVersion property.
     */
    public void setSchemaVersion(@jakarta.annotation.Nullable final String value) {
        this.schemaVersion = value;
    }
}
