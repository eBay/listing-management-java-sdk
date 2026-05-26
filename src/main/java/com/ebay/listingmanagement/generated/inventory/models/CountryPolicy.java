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
 * This type specifies custom product compliance and/or take-back policies that apply to a specified country.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CountryPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 3166-1&lt;/a&gt; country code identifying the country to which the policy or policies specified in the corresponding policyIds array will apply. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String country;
    /**
     * An array of custom policy identifiers that apply to the country specified by &lt;a href=&quot;#request.listingPolicies.regionalProductCompliancePolicies.countryPolicies.country&quot;&gt;listingPolicies.regionalTakeBackPolicies.countryPolicies.country&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Product compliance and take-back policy information may be returned using the following methods:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicies &quot; target=&quot;_blank&quot;&gt;getCustomPolicies&lt;/a&gt;&lt;br&gt;&lt;br&gt;Set &lt;code&gt;policy_types&lt;/code&gt; to:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PRODUCT_COMPLIANCE&lt;/code&gt; for product compliance policies&lt;/li&gt;&lt;li&gt;&lt;code&gt;TAKE_BACK&lt;/code&gt; for takeback policies&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;This returns the list of specified policies and corresponding &lt;b&gt;customPolicyId&lt;/b&gt; values a seller has created.&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy &quot; target=&quot;_blank&quot;&gt;getCustomPolicy&lt;/a&gt; with &lt;code&gt;custom_policy_id = customPolicyId&lt;/code&gt;&lt;br&gt;&lt;br&gt;Returns the details of the policy specified by &lt;b&gt;customPolicyId&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;For information about creating and managing custom policies, refer to the &lt;a href=&quot;/api-docs/sell/account/resources/methods#h2-custom_policy &quot; target=&quot;_blank&quot;&gt;custom_policy&lt;/a&gt; resource in the &lt;b&gt;Sell Account&lt;/b&gt; API.
     */
    private java.util.List<String> policyIds;
    /**
     * Instantiates a new {@link CountryPolicy} and sets the default values.
     */
    public CountryPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CountryPolicy}
     */
    @jakarta.annotation.Nonnull
    public static CountryPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CountryPolicy();
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
     * Gets the country property value. The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 3166-1&lt;/a&gt; country code identifying the country to which the policy or policies specified in the corresponding policyIds array will apply. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("policyIds", (n) -> { this.setPolicyIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the policyIds property value. An array of custom policy identifiers that apply to the country specified by &lt;a href=&quot;#request.listingPolicies.regionalProductCompliancePolicies.countryPolicies.country&quot;&gt;listingPolicies.regionalTakeBackPolicies.countryPolicies.country&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Product compliance and take-back policy information may be returned using the following methods:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicies &quot; target=&quot;_blank&quot;&gt;getCustomPolicies&lt;/a&gt;&lt;br&gt;&lt;br&gt;Set &lt;code&gt;policy_types&lt;/code&gt; to:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PRODUCT_COMPLIANCE&lt;/code&gt; for product compliance policies&lt;/li&gt;&lt;li&gt;&lt;code&gt;TAKE_BACK&lt;/code&gt; for takeback policies&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;This returns the list of specified policies and corresponding &lt;b&gt;customPolicyId&lt;/b&gt; values a seller has created.&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy &quot; target=&quot;_blank&quot;&gt;getCustomPolicy&lt;/a&gt; with &lt;code&gt;custom_policy_id = customPolicyId&lt;/code&gt;&lt;br&gt;&lt;br&gt;Returns the details of the policy specified by &lt;b&gt;customPolicyId&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;For information about creating and managing custom policies, refer to the &lt;a href=&quot;/api-docs/sell/account/resources/methods#h2-custom_policy &quot; target=&quot;_blank&quot;&gt;custom_policy&lt;/a&gt; resource in the &lt;b&gt;Sell Account&lt;/b&gt; API.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("country", this.getCountry());
        writer.writeCollectionOfPrimitiveValues("policyIds", this.getPolicyIds());
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
     * Sets the country property value. The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 3166-1&lt;/a&gt; country code identifying the country to which the policy or policies specified in the corresponding policyIds array will apply. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the policyIds property value. An array of custom policy identifiers that apply to the country specified by &lt;a href=&quot;#request.listingPolicies.regionalProductCompliancePolicies.countryPolicies.country&quot;&gt;listingPolicies.regionalTakeBackPolicies.countryPolicies.country&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Product compliance and take-back policy information may be returned using the following methods:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicies &quot; target=&quot;_blank&quot;&gt;getCustomPolicies&lt;/a&gt;&lt;br&gt;&lt;br&gt;Set &lt;code&gt;policy_types&lt;/code&gt; to:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PRODUCT_COMPLIANCE&lt;/code&gt; for product compliance policies&lt;/li&gt;&lt;li&gt;&lt;code&gt;TAKE_BACK&lt;/code&gt; for takeback policies&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;This returns the list of specified policies and corresponding &lt;b&gt;customPolicyId&lt;/b&gt; values a seller has created.&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy &quot; target=&quot;_blank&quot;&gt;getCustomPolicy&lt;/a&gt; with &lt;code&gt;custom_policy_id = customPolicyId&lt;/code&gt;&lt;br&gt;&lt;br&gt;Returns the details of the policy specified by &lt;b&gt;customPolicyId&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;For information about creating and managing custom policies, refer to the &lt;a href=&quot;/api-docs/sell/account/resources/methods#h2-custom_policy &quot; target=&quot;_blank&quot;&gt;custom_policy&lt;/a&gt; resource in the &lt;b&gt;Sell Account&lt;/b&gt; API.
     * @param value Value to set for the policyIds property.
     */
    public void setPolicyIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.policyIds = value;
    }
}
