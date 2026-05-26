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

package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the seller to provide additional information about the condition of an item in a structured format.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionDescriptor implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This string provides additional information about a condition descriptor. Open text is passed in this field.&lt;br&gt;&lt;br&gt;In the case of trading cards, this field houses the optional &lt;b&gt;Certification Number&lt;/b&gt; condition descriptor for graded cards. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max Length:&lt;/b&gt; 30 characters
     */
    private String additionalInfo;
    /**
     * This string provides the name of a condition descriptor. A numeric ID is passed in this field. This numeric ID maps to the name of a condition descriptor. Condition descriptor name-value pairs provide more information about an item&apos;s condition in a structured way. &lt;br&gt;&lt;br&gt;To retrieve all condition descriptor name numeric IDs for a category, refer to the &lt;b&gt;conditionDescriptorId&lt;/b&gt; field returned in the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies &quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of Metadata API. &lt;br&gt;&lt;br&gt;In the case of trading cards, this field is used to provide condition descriptors for a card. For graded cards, the condition descriptors for &lt;b&gt;Grader&lt;/b&gt; and &lt;b&gt;Grade&lt;/b&gt; are required, while the condition descriptor for &lt;b&gt;Certification Number&lt;/b&gt; is optional. For ungraded cards, only the &lt;b&gt;Card Condition&lt;/b&gt; condition descriptor is required.
     */
    private String name;
    /**
     * This array provides the value(s) associated with a condition descriptor. One or more numeric IDs is passed in this field. Commas are used as delimiters between successive name/value pairs. These numeric IDs map to the values associated with a condition descriptor name. Condition descriptor name-value pairs provide more information about an item&apos;s condition in a structured way. &lt;br&gt;&lt;br&gt;To retrieve all condition descriptor value numeric IDs for a category, refer to the &lt;b&gt;ConditionDescriptorValueId&lt;/b&gt; array returned in the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies &quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of Metadata API. &lt;br&gt;&lt;br&gt;In the case of trading cards, this field houses the information on the &lt;b&gt;Grader&lt;/b&gt; and &lt;b&gt;Grade&lt;/b&gt; descriptors of graded cards and the &lt;b&gt;Card Condition&lt;/b&gt; descriptor for ungraded cards.
     */
    private java.util.List<String> values;
    /**
     * Instantiates a new {@link ConditionDescriptor} and sets the default values.
     */
    public ConditionDescriptor() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConditionDescriptor}
     */
    @jakarta.annotation.Nonnull
    public static ConditionDescriptor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionDescriptor();
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
     * Gets the additionalInfo property value. This string provides additional information about a condition descriptor. Open text is passed in this field.&lt;br&gt;&lt;br&gt;In the case of trading cards, this field houses the optional &lt;b&gt;Certification Number&lt;/b&gt; condition descriptor for graded cards. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max Length:&lt;/b&gt; 30 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("additionalInfo", (n) -> { this.setAdditionalInfo(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. This string provides the name of a condition descriptor. A numeric ID is passed in this field. This numeric ID maps to the name of a condition descriptor. Condition descriptor name-value pairs provide more information about an item&apos;s condition in a structured way. &lt;br&gt;&lt;br&gt;To retrieve all condition descriptor name numeric IDs for a category, refer to the &lt;b&gt;conditionDescriptorId&lt;/b&gt; field returned in the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies &quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of Metadata API. &lt;br&gt;&lt;br&gt;In the case of trading cards, this field is used to provide condition descriptors for a card. For graded cards, the condition descriptors for &lt;b&gt;Grader&lt;/b&gt; and &lt;b&gt;Grade&lt;/b&gt; are required, while the condition descriptor for &lt;b&gt;Certification Number&lt;/b&gt; is optional. For ungraded cards, only the &lt;b&gt;Card Condition&lt;/b&gt; condition descriptor is required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the values property value. This array provides the value(s) associated with a condition descriptor. One or more numeric IDs is passed in this field. Commas are used as delimiters between successive name/value pairs. These numeric IDs map to the values associated with a condition descriptor name. Condition descriptor name-value pairs provide more information about an item&apos;s condition in a structured way. &lt;br&gt;&lt;br&gt;To retrieve all condition descriptor value numeric IDs for a category, refer to the &lt;b&gt;ConditionDescriptorValueId&lt;/b&gt; array returned in the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies &quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of Metadata API. &lt;br&gt;&lt;br&gt;In the case of trading cards, this field houses the information on the &lt;b&gt;Grader&lt;/b&gt; and &lt;b&gt;Grade&lt;/b&gt; descriptors of graded cards and the &lt;b&gt;Card Condition&lt;/b&gt; descriptor for ungraded cards.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getValues() {
        return this.values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("additionalInfo", this.getAdditionalInfo());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
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
     * Sets the additionalInfo property value. This string provides additional information about a condition descriptor. Open text is passed in this field.&lt;br&gt;&lt;br&gt;In the case of trading cards, this field houses the optional &lt;b&gt;Certification Number&lt;/b&gt; condition descriptor for graded cards. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max Length:&lt;/b&gt; 30 characters
     * @param value Value to set for the additionalInfo property.
     */
    public void setAdditionalInfo(@jakarta.annotation.Nullable final String value) {
        this.additionalInfo = value;
    }
    /**
     * Sets the name property value. This string provides the name of a condition descriptor. A numeric ID is passed in this field. This numeric ID maps to the name of a condition descriptor. Condition descriptor name-value pairs provide more information about an item&apos;s condition in a structured way. &lt;br&gt;&lt;br&gt;To retrieve all condition descriptor name numeric IDs for a category, refer to the &lt;b&gt;conditionDescriptorId&lt;/b&gt; field returned in the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies &quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of Metadata API. &lt;br&gt;&lt;br&gt;In the case of trading cards, this field is used to provide condition descriptors for a card. For graded cards, the condition descriptors for &lt;b&gt;Grader&lt;/b&gt; and &lt;b&gt;Grade&lt;/b&gt; are required, while the condition descriptor for &lt;b&gt;Certification Number&lt;/b&gt; is optional. For ungraded cards, only the &lt;b&gt;Card Condition&lt;/b&gt; condition descriptor is required.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the values property value. This array provides the value(s) associated with a condition descriptor. One or more numeric IDs is passed in this field. Commas are used as delimiters between successive name/value pairs. These numeric IDs map to the values associated with a condition descriptor name. Condition descriptor name-value pairs provide more information about an item&apos;s condition in a structured way. &lt;br&gt;&lt;br&gt;To retrieve all condition descriptor value numeric IDs for a category, refer to the &lt;b&gt;ConditionDescriptorValueId&lt;/b&gt; array returned in the &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies &quot; target=&quot;_blank&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of Metadata API. &lt;br&gt;&lt;br&gt;In the case of trading cards, this field houses the information on the &lt;b&gt;Grader&lt;/b&gt; and &lt;b&gt;Grade&lt;/b&gt; descriptors of graded cards and the &lt;b&gt;Card Condition&lt;/b&gt; descriptor for ungraded cards.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.values = value;
    }
}
