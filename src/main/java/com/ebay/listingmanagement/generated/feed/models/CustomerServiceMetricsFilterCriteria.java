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
 * A complex data type that filters data for report creation. See &lt;strong&gt;CustomerServiceMetricsFilterCriteria&lt;/strong&gt; for fields and descriptions.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerServiceMetricsFilterCriteria implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An enumeration value that specifies the customer service metric that eBay tracks to measure seller performance.
     */
    private CustomerServiceMetricTypeEnum customerServiceMetricType;
    /**
     * An enumeration value that specifies the eBay marketplace where the evaluation occurs.
     */
    private MarketplaceIdEnum evaluationMarketplaceId;
    /**
     * A list of listing category IDs on which the service metric is measured. A seller can use one or more L1 (top-level) eBay categories to get metrics specific to those L1 categories. The Category IDs for each L1 category are required. Category ID values for L1 categories can be retrieved using the Taxonomy API.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Pass this attribute to narrow down your filter results for the &lt;code&gt;ITEM_NOT_AS_DESCRIBED&lt;/code&gt; &lt;strong&gt;customerServiceMetricType&lt;/strong&gt;.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;Supported categories include:&lt;/p&gt;&lt;p&gt;&lt;code&gt;primary(L1) category Id&lt;/code&gt;&lt;/p&gt;
     */
    private java.util.List<String> listingCategories;
    /**
     * A list of shipping region enumeration values on which the service metric is measured. This comma delimited array allows the seller to customize the report to focus on domestic or international shipping. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Pass this attribute to narrow down your filter results for the &lt;code&gt;ITEM_NOT_RECEIVED&lt;/code&gt; customerServiceMetricType.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;Supported categories include:&lt;/p&gt;&lt;p&gt;&lt;code&gt;primary(L1) category Id&lt;/code&gt;&lt;/p&gt;
     */
    private java.util.List<ShippingRegionTypeEnum> shippingRegions;
    /**
     * Instantiates a new {@link CustomerServiceMetricsFilterCriteria} and sets the default values.
     */
    public CustomerServiceMetricsFilterCriteria() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerServiceMetricsFilterCriteria}
     */
    @jakarta.annotation.Nonnull
    public static CustomerServiceMetricsFilterCriteria createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerServiceMetricsFilterCriteria();
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
     * Gets the customerServiceMetricType property value. An enumeration value that specifies the customer service metric that eBay tracks to measure seller performance.
     * @return a {@link CustomerServiceMetricTypeEnum}
     */
    @jakarta.annotation.Nullable
    public CustomerServiceMetricTypeEnum getCustomerServiceMetricType() {
        return this.customerServiceMetricType;
    }
    /**
     * Gets the evaluationMarketplaceId property value. An enumeration value that specifies the eBay marketplace where the evaluation occurs.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getEvaluationMarketplaceId() {
        return this.evaluationMarketplaceId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("customerServiceMetricType", (n) -> { this.setCustomerServiceMetricType(n.getEnumValue(CustomerServiceMetricTypeEnum::forValue)); });
        deserializerMap.put("evaluationMarketplaceId", (n) -> { this.setEvaluationMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("listingCategories", (n) -> { this.setListingCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("shippingRegions", (n) -> { this.setShippingRegions(n.getCollectionOfEnumValues(ShippingRegionTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listingCategories property value. A list of listing category IDs on which the service metric is measured. A seller can use one or more L1 (top-level) eBay categories to get metrics specific to those L1 categories. The Category IDs for each L1 category are required. Category ID values for L1 categories can be retrieved using the Taxonomy API.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Pass this attribute to narrow down your filter results for the &lt;code&gt;ITEM_NOT_AS_DESCRIBED&lt;/code&gt; &lt;strong&gt;customerServiceMetricType&lt;/strong&gt;.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;Supported categories include:&lt;/p&gt;&lt;p&gt;&lt;code&gt;primary(L1) category Id&lt;/code&gt;&lt;/p&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getListingCategories() {
        return this.listingCategories;
    }
    /**
     * Gets the shippingRegions property value. A list of shipping region enumeration values on which the service metric is measured. This comma delimited array allows the seller to customize the report to focus on domestic or international shipping. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Pass this attribute to narrow down your filter results for the &lt;code&gt;ITEM_NOT_RECEIVED&lt;/code&gt; customerServiceMetricType.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;Supported categories include:&lt;/p&gt;&lt;p&gt;&lt;code&gt;primary(L1) category Id&lt;/code&gt;&lt;/p&gt;
     * @return a {@link java.util.List<ShippingRegionTypeEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShippingRegionTypeEnum> getShippingRegions() {
        return this.shippingRegions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("customerServiceMetricType", this.getCustomerServiceMetricType());
        writer.writeEnumValue("evaluationMarketplaceId", this.getEvaluationMarketplaceId());
        writer.writeCollectionOfPrimitiveValues("listingCategories", this.getListingCategories());
        writer.writeCollectionOfEnumValues("shippingRegions", this.getShippingRegions());
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
     * Sets the customerServiceMetricType property value. An enumeration value that specifies the customer service metric that eBay tracks to measure seller performance.
     * @param value Value to set for the customerServiceMetricType property.
     */
    public void setCustomerServiceMetricType(@jakarta.annotation.Nullable final CustomerServiceMetricTypeEnum value) {
        this.customerServiceMetricType = value;
    }
    /**
     * Sets the evaluationMarketplaceId property value. An enumeration value that specifies the eBay marketplace where the evaluation occurs.
     * @param value Value to set for the evaluationMarketplaceId property.
     */
    public void setEvaluationMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.evaluationMarketplaceId = value;
    }
    /**
     * Sets the listingCategories property value. A list of listing category IDs on which the service metric is measured. A seller can use one or more L1 (top-level) eBay categories to get metrics specific to those L1 categories. The Category IDs for each L1 category are required. Category ID values for L1 categories can be retrieved using the Taxonomy API.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Pass this attribute to narrow down your filter results for the &lt;code&gt;ITEM_NOT_AS_DESCRIBED&lt;/code&gt; &lt;strong&gt;customerServiceMetricType&lt;/strong&gt;.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;Supported categories include:&lt;/p&gt;&lt;p&gt;&lt;code&gt;primary(L1) category Id&lt;/code&gt;&lt;/p&gt;
     * @param value Value to set for the listingCategories property.
     */
    public void setListingCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.listingCategories = value;
    }
    /**
     * Sets the shippingRegions property value. A list of shipping region enumeration values on which the service metric is measured. This comma delimited array allows the seller to customize the report to focus on domestic or international shipping. &lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Pass this attribute to narrow down your filter results for the &lt;code&gt;ITEM_NOT_RECEIVED&lt;/code&gt; customerServiceMetricType.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;Supported categories include:&lt;/p&gt;&lt;p&gt;&lt;code&gt;primary(L1) category Id&lt;/code&gt;&lt;/p&gt;
     * @param value Value to set for the shippingRegions property.
     */
    public void setShippingRegions(@jakarta.annotation.Nullable final java.util.List<ShippingRegionTypeEnum> value) {
        this.shippingRegions = value;
    }
}
