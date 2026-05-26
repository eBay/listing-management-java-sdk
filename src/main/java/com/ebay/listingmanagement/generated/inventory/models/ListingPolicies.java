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
 * This type is used to identify business policies including payment, return, and fulfillment policies, as well as to identify custom policies. These policies are, or will be, associated with the listing. Every published offer must have a payment, return, and fulfillment business policy associated with it. Additionally, depending on the country/countries in which sellers are offering products and/or services to consumers (e.g., residents of the European Union,) specifying additional polices may be required.&lt;br&gt;&lt;br&gt;This type is also used to override the shipping costs of one or more shipping service options that are associated with the fulfillment policy, to enable eBay Plus eligibility for a listing, or to enable the Best Offer feature on the listing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListingPolicies implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used by the &lt;strong&gt;bestOfferTerms&lt;/strong&gt; container, which is used if the seller would like to support the Best Offer feature on their listing.
     */
    private BestOffer bestOfferTerms;
    /**
     * This field is included in an offer and set to &lt;code&gt;true&lt;/code&gt; if a Top-Rated seller is opted in to the eBay Plus program. With the eBay Plus program, qualified sellers must commit to next-day delivery of the item, and the buyers must have an eBay Plus subscription to be eligible to receive the benefits of this program, which are free, next-day delivery, as well as free returns.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, this program is only available on the Germany and Australian sites.&lt;/span&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer.
     */
    private Boolean eBayPlusIfEligible;
    /**
     * This unique identifier indicates the fulfillment business policy that will be used once an offer is published and converted to an eBay listing. This fulfillment business policy will set all fulfillment-related settings for the eBay listing.&lt;br&gt;&lt;br&gt;Business policies are not immediately required for offers, but are required before an offer can be published. The seller should review the fulfillment business policy before assigning it to the offer to make sure it is compatible with the inventory item and the offer settings. The seller may also want to review the shipping service costs in the fulfillment policy, and that seller might decide to override the shipping costs for one or more shipping service options by using the &lt;strong&gt;shippingCostOverrides&lt;/strong&gt; container.&lt;br&gt;&lt;br&gt;Business policies can be created and managed in My eBay or with the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank&quot;&gt;Account API&lt;/a&gt;. To get a list of all return policies associated with a seller&apos;s account on a specific eBay Marketplace, use the Account API&apos;s &lt;a href=&quot;/api-docs/sell/account/resources/fulfillment_policy/methods/getFulfillmentPolicies&quot; target=&quot;_blank&quot;&gt;getFulfillmentPolicies&lt;/a&gt; method. There are also calls in the &lt;strong&gt;Account API&lt;/strong&gt; to retrieve a fulfillment policy by policy ID or policy name.&lt;br&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     */
    private String fulfillmentPolicyId;
    /**
     * This unique identifier indicates the payment business policy that will be used once an offer is published and converted to an eBay listing. This payment business policy will set all payment-related settings for the eBay listing.&lt;br&gt;&lt;br&gt;Business policies are not immediately required for offers, but are required before an offer can be published. The seller should review the payment business policy to make sure that it is compatible with the marketplace and listing category before assigning it to the offer.&lt;br&gt;&lt;br&gt;Business policies can be created and managed in My eBay or with the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank&quot;&gt;Account API&lt;/a&gt;. To get a list of all payment policies associated with a seller&apos;s account on a specific eBay Marketplace, use the Account API&apos;s &lt;a href=&quot;/api-docs/sell/account/resources/payment_policy/methods/getPaymentPolicies&quot; target=&quot;_blank&quot;&gt;getPaymentPolicies&lt;/a&gt; method. There are also calls in the &lt;strong&gt;Account API&lt;/strong&gt; to retrieve a payment policy by policy ID or policy name.&lt;br&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     */
    private String paymentPolicyId;
    /**
     * This field contains the array of unique identifiers indicating the seller-created &lt;i&gt;global&lt;/i&gt; product compliance policies that will be used once an offer is published and converted to a listing.&lt;br&gt;&lt;br&gt;Product compliance policies provide buyers with important information and disclosures about products. For example, if you sell batteries and specific disclosures are required to be shared with all potential buyers, your global product compliance policy could contain the required disclosures.&lt;br&gt;&lt;br&gt;A maximum of six (6) global product compliance policies may apply to &lt;i&gt;each offer&lt;/i&gt;.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For countries that support country-specific policies, use &lt;a href=&quot;#request.listingPolicies.regionalProductCompliancePolicies&quot;&gt;regionalProductCompliancePolicies&lt;/a&gt; to apply them to an offer.&lt;/span&gt;
     */
    private java.util.List<String> productCompliancePolicyIds;
    /**
     * This type lists regional product compliance policies to be used by an offer when it is published and converted to a listing.
     */
    private RegionalProductCompliancePolicies regionalProductCompliancePolicies;
    /**
     * This type lists regional take-back policies to be used by an offer when it is published and converted to a listing.
     */
    private RegionalTakeBackPolicies regionalTakeBackPolicies;
    /**
     * This unique identifier indicates the return business policy that will be used once an offer is published and converted to an eBay listing. This return business policy will set all return policy settings for the eBay listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As a part of Digital Services Act (DSA) requirements, as of April 3, 2023, buyers in the EU must be allowed to return an item within 14 days or more, unless the item is exempt. Where applicable, sellers should update their return policies to reflect this requirement of accepting returns from EU buyers.&lt;/span&gt;&lt;br&gt;Business policies are not immediately required for offers, but are required before an offer can be published. The seller should review the return business policy before assigning it to the offer to make sure it is compatible with the inventory item and the offer settings.&lt;br&gt;&lt;br&gt;Business policies can be created and managed in My eBay or with the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank&quot;&gt;Account API&lt;/a&gt;. To get a list of all return policies associated with a seller&apos;s account on a specific eBay Marketplace, use the Account API&apos;s &lt;a href=&quot;/api-docs/sell/account/resources/return_policy/methods/getReturnPolicies&quot; target=&quot;_blank&quot;&gt;getReturnPolicies&lt;/a&gt; call. There are also calls in the &lt;strong&gt;Account API&lt;/strong&gt; to retrieve a return policy by policy ID or policy name.&lt;br&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     */
    private String returnPolicyId;
    /**
     * This container is used if the seller wishes to override the shipping costs or surcharge for one or more domestic or international shipping service options defined in the fulfillment listing policy. To override the costs of a specific domestic or international shipping service option, the seller must know the priority/order of that shipping service in the fulfillment listing policy. The name of a shipping service option can be found in the &lt;strong&gt;shippingOptions.shippingServices.shippingServiceCode&lt;/strong&gt; field of the fulfillment policy, and the priority/order of that shipping service option is found in the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; field. Both of these values can be retrieved by searching for that fulfillment policy with the &lt;strong&gt;getFulfillmentPolicies&lt;/strong&gt; or &lt;strong&gt;getFulfillmentPolicyByName&lt;/strong&gt; calls of the &lt;strong&gt;Account API&lt;/strong&gt;. The &lt;strong&gt;shippingCostOverrides.priority&lt;/strong&gt; value should match the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; in order to override the shipping costs for that shipping service option. The seller must also ensure that the &lt;strong&gt;shippingServiceType&lt;/strong&gt; value is set to &lt;code&gt;DOMESTIC&lt;/code&gt; to override a domestic shipping service option, or to &lt;code&gt;INTERNATIONAL&lt;/code&gt; to override an international shipping service option.&lt;br&gt;&lt;br&gt;A separate &lt;strong&gt;ShippingCostOverrides&lt;/strong&gt; node is needed for each shipping service option whose costs are being overridden. All defined fields of the &lt;strong&gt;shippingCostOverrides&lt;/strong&gt; container should be included, even if the shipping costs and surcharge values are not changing.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;shippingCostOverrides&lt;/strong&gt; container is returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if one or more shipping cost overrides are being applied to the fulfillment policy.
     */
    private java.util.List<ShippingCostOverride> shippingCostOverrides;
    /**
     * This unique identifier indicates the seller-created &lt;i&gt;global&lt;/i&gt; take-back policy that will be used once an offer is published and converted to a listing.&lt;br&gt;&lt;br&gt;One (1) global take-back policy may be specified &lt;i&gt;per offer&lt;/i&gt;.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For countries that support country-specific policies, use &lt;a href=&quot;#request.listingPolicies.regionalTakeBackPolicies&quot;&gt;regionalTakeBackPolicies&lt;/a&gt; to apply them to an offer.&lt;/span&gt;
     */
    private String takeBackPolicyId;
    /**
     * Instantiates a new {@link ListingPolicies} and sets the default values.
     */
    public ListingPolicies() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListingPolicies}
     */
    @jakarta.annotation.Nonnull
    public static ListingPolicies createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListingPolicies();
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
     * Gets the bestOfferTerms property value. This type is used by the &lt;strong&gt;bestOfferTerms&lt;/strong&gt; container, which is used if the seller would like to support the Best Offer feature on their listing.
     * @return a {@link BestOffer}
     */
    @jakarta.annotation.Nullable
    public BestOffer getBestOfferTerms() {
        return this.bestOfferTerms;
    }
    /**
     * Gets the eBayPlusIfEligible property value. This field is included in an offer and set to &lt;code&gt;true&lt;/code&gt; if a Top-Rated seller is opted in to the eBay Plus program. With the eBay Plus program, qualified sellers must commit to next-day delivery of the item, and the buyers must have an eBay Plus subscription to be eligible to receive the benefits of this program, which are free, next-day delivery, as well as free returns.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, this program is only available on the Germany and Australian sites.&lt;/span&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEBayPlusIfEligible() {
        return this.eBayPlusIfEligible;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("bestOfferTerms", (n) -> { this.setBestOfferTerms(n.getObjectValue(BestOffer::createFromDiscriminatorValue)); });
        deserializerMap.put("eBayPlusIfEligible", (n) -> { this.setEBayPlusIfEligible(n.getBooleanValue()); });
        deserializerMap.put("fulfillmentPolicyId", (n) -> { this.setFulfillmentPolicyId(n.getStringValue()); });
        deserializerMap.put("paymentPolicyId", (n) -> { this.setPaymentPolicyId(n.getStringValue()); });
        deserializerMap.put("productCompliancePolicyIds", (n) -> { this.setProductCompliancePolicyIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("regionalProductCompliancePolicies", (n) -> { this.setRegionalProductCompliancePolicies(n.getObjectValue(RegionalProductCompliancePolicies::createFromDiscriminatorValue)); });
        deserializerMap.put("regionalTakeBackPolicies", (n) -> { this.setRegionalTakeBackPolicies(n.getObjectValue(RegionalTakeBackPolicies::createFromDiscriminatorValue)); });
        deserializerMap.put("returnPolicyId", (n) -> { this.setReturnPolicyId(n.getStringValue()); });
        deserializerMap.put("shippingCostOverrides", (n) -> { this.setShippingCostOverrides(n.getCollectionOfObjectValues(ShippingCostOverride::createFromDiscriminatorValue)); });
        deserializerMap.put("takeBackPolicyId", (n) -> { this.setTakeBackPolicyId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fulfillmentPolicyId property value. This unique identifier indicates the fulfillment business policy that will be used once an offer is published and converted to an eBay listing. This fulfillment business policy will set all fulfillment-related settings for the eBay listing.&lt;br&gt;&lt;br&gt;Business policies are not immediately required for offers, but are required before an offer can be published. The seller should review the fulfillment business policy before assigning it to the offer to make sure it is compatible with the inventory item and the offer settings. The seller may also want to review the shipping service costs in the fulfillment policy, and that seller might decide to override the shipping costs for one or more shipping service options by using the &lt;strong&gt;shippingCostOverrides&lt;/strong&gt; container.&lt;br&gt;&lt;br&gt;Business policies can be created and managed in My eBay or with the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank&quot;&gt;Account API&lt;/a&gt;. To get a list of all return policies associated with a seller&apos;s account on a specific eBay Marketplace, use the Account API&apos;s &lt;a href=&quot;/api-docs/sell/account/resources/fulfillment_policy/methods/getFulfillmentPolicies&quot; target=&quot;_blank&quot;&gt;getFulfillmentPolicies&lt;/a&gt; method. There are also calls in the &lt;strong&gt;Account API&lt;/strong&gt; to retrieve a fulfillment policy by policy ID or policy name.&lt;br&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFulfillmentPolicyId() {
        return this.fulfillmentPolicyId;
    }
    /**
     * Gets the paymentPolicyId property value. This unique identifier indicates the payment business policy that will be used once an offer is published and converted to an eBay listing. This payment business policy will set all payment-related settings for the eBay listing.&lt;br&gt;&lt;br&gt;Business policies are not immediately required for offers, but are required before an offer can be published. The seller should review the payment business policy to make sure that it is compatible with the marketplace and listing category before assigning it to the offer.&lt;br&gt;&lt;br&gt;Business policies can be created and managed in My eBay or with the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank&quot;&gt;Account API&lt;/a&gt;. To get a list of all payment policies associated with a seller&apos;s account on a specific eBay Marketplace, use the Account API&apos;s &lt;a href=&quot;/api-docs/sell/account/resources/payment_policy/methods/getPaymentPolicies&quot; target=&quot;_blank&quot;&gt;getPaymentPolicies&lt;/a&gt; method. There are also calls in the &lt;strong&gt;Account API&lt;/strong&gt; to retrieve a payment policy by policy ID or policy name.&lt;br&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentPolicyId() {
        return this.paymentPolicyId;
    }
    /**
     * Gets the productCompliancePolicyIds property value. This field contains the array of unique identifiers indicating the seller-created &lt;i&gt;global&lt;/i&gt; product compliance policies that will be used once an offer is published and converted to a listing.&lt;br&gt;&lt;br&gt;Product compliance policies provide buyers with important information and disclosures about products. For example, if you sell batteries and specific disclosures are required to be shared with all potential buyers, your global product compliance policy could contain the required disclosures.&lt;br&gt;&lt;br&gt;A maximum of six (6) global product compliance policies may apply to &lt;i&gt;each offer&lt;/i&gt;.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For countries that support country-specific policies, use &lt;a href=&quot;#request.listingPolicies.regionalProductCompliancePolicies&quot;&gt;regionalProductCompliancePolicies&lt;/a&gt; to apply them to an offer.&lt;/span&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProductCompliancePolicyIds() {
        return this.productCompliancePolicyIds;
    }
    /**
     * Gets the regionalProductCompliancePolicies property value. This type lists regional product compliance policies to be used by an offer when it is published and converted to a listing.
     * @return a {@link RegionalProductCompliancePolicies}
     */
    @jakarta.annotation.Nullable
    public RegionalProductCompliancePolicies getRegionalProductCompliancePolicies() {
        return this.regionalProductCompliancePolicies;
    }
    /**
     * Gets the regionalTakeBackPolicies property value. This type lists regional take-back policies to be used by an offer when it is published and converted to a listing.
     * @return a {@link RegionalTakeBackPolicies}
     */
    @jakarta.annotation.Nullable
    public RegionalTakeBackPolicies getRegionalTakeBackPolicies() {
        return this.regionalTakeBackPolicies;
    }
    /**
     * Gets the returnPolicyId property value. This unique identifier indicates the return business policy that will be used once an offer is published and converted to an eBay listing. This return business policy will set all return policy settings for the eBay listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As a part of Digital Services Act (DSA) requirements, as of April 3, 2023, buyers in the EU must be allowed to return an item within 14 days or more, unless the item is exempt. Where applicable, sellers should update their return policies to reflect this requirement of accepting returns from EU buyers.&lt;/span&gt;&lt;br&gt;Business policies are not immediately required for offers, but are required before an offer can be published. The seller should review the return business policy before assigning it to the offer to make sure it is compatible with the inventory item and the offer settings.&lt;br&gt;&lt;br&gt;Business policies can be created and managed in My eBay or with the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank&quot;&gt;Account API&lt;/a&gt;. To get a list of all return policies associated with a seller&apos;s account on a specific eBay Marketplace, use the Account API&apos;s &lt;a href=&quot;/api-docs/sell/account/resources/return_policy/methods/getReturnPolicies&quot; target=&quot;_blank&quot;&gt;getReturnPolicies&lt;/a&gt; call. There are also calls in the &lt;strong&gt;Account API&lt;/strong&gt; to retrieve a return policy by policy ID or policy name.&lt;br&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReturnPolicyId() {
        return this.returnPolicyId;
    }
    /**
     * Gets the shippingCostOverrides property value. This container is used if the seller wishes to override the shipping costs or surcharge for one or more domestic or international shipping service options defined in the fulfillment listing policy. To override the costs of a specific domestic or international shipping service option, the seller must know the priority/order of that shipping service in the fulfillment listing policy. The name of a shipping service option can be found in the &lt;strong&gt;shippingOptions.shippingServices.shippingServiceCode&lt;/strong&gt; field of the fulfillment policy, and the priority/order of that shipping service option is found in the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; field. Both of these values can be retrieved by searching for that fulfillment policy with the &lt;strong&gt;getFulfillmentPolicies&lt;/strong&gt; or &lt;strong&gt;getFulfillmentPolicyByName&lt;/strong&gt; calls of the &lt;strong&gt;Account API&lt;/strong&gt;. The &lt;strong&gt;shippingCostOverrides.priority&lt;/strong&gt; value should match the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; in order to override the shipping costs for that shipping service option. The seller must also ensure that the &lt;strong&gt;shippingServiceType&lt;/strong&gt; value is set to &lt;code&gt;DOMESTIC&lt;/code&gt; to override a domestic shipping service option, or to &lt;code&gt;INTERNATIONAL&lt;/code&gt; to override an international shipping service option.&lt;br&gt;&lt;br&gt;A separate &lt;strong&gt;ShippingCostOverrides&lt;/strong&gt; node is needed for each shipping service option whose costs are being overridden. All defined fields of the &lt;strong&gt;shippingCostOverrides&lt;/strong&gt; container should be included, even if the shipping costs and surcharge values are not changing.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;shippingCostOverrides&lt;/strong&gt; container is returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if one or more shipping cost overrides are being applied to the fulfillment policy.
     * @return a {@link java.util.List<ShippingCostOverride>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShippingCostOverride> getShippingCostOverrides() {
        return this.shippingCostOverrides;
    }
    /**
     * Gets the takeBackPolicyId property value. This unique identifier indicates the seller-created &lt;i&gt;global&lt;/i&gt; take-back policy that will be used once an offer is published and converted to a listing.&lt;br&gt;&lt;br&gt;One (1) global take-back policy may be specified &lt;i&gt;per offer&lt;/i&gt;.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For countries that support country-specific policies, use &lt;a href=&quot;#request.listingPolicies.regionalTakeBackPolicies&quot;&gt;regionalTakeBackPolicies&lt;/a&gt; to apply them to an offer.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTakeBackPolicyId() {
        return this.takeBackPolicyId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("bestOfferTerms", this.getBestOfferTerms());
        writer.writeBooleanValue("eBayPlusIfEligible", this.getEBayPlusIfEligible());
        writer.writeStringValue("fulfillmentPolicyId", this.getFulfillmentPolicyId());
        writer.writeStringValue("paymentPolicyId", this.getPaymentPolicyId());
        writer.writeCollectionOfPrimitiveValues("productCompliancePolicyIds", this.getProductCompliancePolicyIds());
        writer.writeObjectValue("regionalProductCompliancePolicies", this.getRegionalProductCompliancePolicies());
        writer.writeObjectValue("regionalTakeBackPolicies", this.getRegionalTakeBackPolicies());
        writer.writeStringValue("returnPolicyId", this.getReturnPolicyId());
        writer.writeCollectionOfObjectValues("shippingCostOverrides", this.getShippingCostOverrides());
        writer.writeStringValue("takeBackPolicyId", this.getTakeBackPolicyId());
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
     * Sets the bestOfferTerms property value. This type is used by the &lt;strong&gt;bestOfferTerms&lt;/strong&gt; container, which is used if the seller would like to support the Best Offer feature on their listing.
     * @param value Value to set for the bestOfferTerms property.
     */
    public void setBestOfferTerms(@jakarta.annotation.Nullable final BestOffer value) {
        this.bestOfferTerms = value;
    }
    /**
     * Sets the eBayPlusIfEligible property value. This field is included in an offer and set to &lt;code&gt;true&lt;/code&gt; if a Top-Rated seller is opted in to the eBay Plus program. With the eBay Plus program, qualified sellers must commit to next-day delivery of the item, and the buyers must have an eBay Plus subscription to be eligible to receive the benefits of this program, which are free, next-day delivery, as well as free returns.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, this program is only available on the Germany and Australian sites.&lt;/span&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer.
     * @param value Value to set for the eBayPlusIfEligible property.
     */
    public void setEBayPlusIfEligible(@jakarta.annotation.Nullable final Boolean value) {
        this.eBayPlusIfEligible = value;
    }
    /**
     * Sets the fulfillmentPolicyId property value. This unique identifier indicates the fulfillment business policy that will be used once an offer is published and converted to an eBay listing. This fulfillment business policy will set all fulfillment-related settings for the eBay listing.&lt;br&gt;&lt;br&gt;Business policies are not immediately required for offers, but are required before an offer can be published. The seller should review the fulfillment business policy before assigning it to the offer to make sure it is compatible with the inventory item and the offer settings. The seller may also want to review the shipping service costs in the fulfillment policy, and that seller might decide to override the shipping costs for one or more shipping service options by using the &lt;strong&gt;shippingCostOverrides&lt;/strong&gt; container.&lt;br&gt;&lt;br&gt;Business policies can be created and managed in My eBay or with the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank&quot;&gt;Account API&lt;/a&gt;. To get a list of all return policies associated with a seller&apos;s account on a specific eBay Marketplace, use the Account API&apos;s &lt;a href=&quot;/api-docs/sell/account/resources/fulfillment_policy/methods/getFulfillmentPolicies&quot; target=&quot;_blank&quot;&gt;getFulfillmentPolicies&lt;/a&gt; method. There are also calls in the &lt;strong&gt;Account API&lt;/strong&gt; to retrieve a fulfillment policy by policy ID or policy name.&lt;br&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @param value Value to set for the fulfillmentPolicyId property.
     */
    public void setFulfillmentPolicyId(@jakarta.annotation.Nullable final String value) {
        this.fulfillmentPolicyId = value;
    }
    /**
     * Sets the paymentPolicyId property value. This unique identifier indicates the payment business policy that will be used once an offer is published and converted to an eBay listing. This payment business policy will set all payment-related settings for the eBay listing.&lt;br&gt;&lt;br&gt;Business policies are not immediately required for offers, but are required before an offer can be published. The seller should review the payment business policy to make sure that it is compatible with the marketplace and listing category before assigning it to the offer.&lt;br&gt;&lt;br&gt;Business policies can be created and managed in My eBay or with the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank&quot;&gt;Account API&lt;/a&gt;. To get a list of all payment policies associated with a seller&apos;s account on a specific eBay Marketplace, use the Account API&apos;s &lt;a href=&quot;/api-docs/sell/account/resources/payment_policy/methods/getPaymentPolicies&quot; target=&quot;_blank&quot;&gt;getPaymentPolicies&lt;/a&gt; method. There are also calls in the &lt;strong&gt;Account API&lt;/strong&gt; to retrieve a payment policy by policy ID or policy name.&lt;br&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @param value Value to set for the paymentPolicyId property.
     */
    public void setPaymentPolicyId(@jakarta.annotation.Nullable final String value) {
        this.paymentPolicyId = value;
    }
    /**
     * Sets the productCompliancePolicyIds property value. This field contains the array of unique identifiers indicating the seller-created &lt;i&gt;global&lt;/i&gt; product compliance policies that will be used once an offer is published and converted to a listing.&lt;br&gt;&lt;br&gt;Product compliance policies provide buyers with important information and disclosures about products. For example, if you sell batteries and specific disclosures are required to be shared with all potential buyers, your global product compliance policy could contain the required disclosures.&lt;br&gt;&lt;br&gt;A maximum of six (6) global product compliance policies may apply to &lt;i&gt;each offer&lt;/i&gt;.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For countries that support country-specific policies, use &lt;a href=&quot;#request.listingPolicies.regionalProductCompliancePolicies&quot;&gt;regionalProductCompliancePolicies&lt;/a&gt; to apply them to an offer.&lt;/span&gt;
     * @param value Value to set for the productCompliancePolicyIds property.
     */
    public void setProductCompliancePolicyIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.productCompliancePolicyIds = value;
    }
    /**
     * Sets the regionalProductCompliancePolicies property value. This type lists regional product compliance policies to be used by an offer when it is published and converted to a listing.
     * @param value Value to set for the regionalProductCompliancePolicies property.
     */
    public void setRegionalProductCompliancePolicies(@jakarta.annotation.Nullable final RegionalProductCompliancePolicies value) {
        this.regionalProductCompliancePolicies = value;
    }
    /**
     * Sets the regionalTakeBackPolicies property value. This type lists regional take-back policies to be used by an offer when it is published and converted to a listing.
     * @param value Value to set for the regionalTakeBackPolicies property.
     */
    public void setRegionalTakeBackPolicies(@jakarta.annotation.Nullable final RegionalTakeBackPolicies value) {
        this.regionalTakeBackPolicies = value;
    }
    /**
     * Sets the returnPolicyId property value. This unique identifier indicates the return business policy that will be used once an offer is published and converted to an eBay listing. This return business policy will set all return policy settings for the eBay listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As a part of Digital Services Act (DSA) requirements, as of April 3, 2023, buyers in the EU must be allowed to return an item within 14 days or more, unless the item is exempt. Where applicable, sellers should update their return policies to reflect this requirement of accepting returns from EU buyers.&lt;/span&gt;&lt;br&gt;Business policies are not immediately required for offers, but are required before an offer can be published. The seller should review the return business policy before assigning it to the offer to make sure it is compatible with the inventory item and the offer settings.&lt;br&gt;&lt;br&gt;Business policies can be created and managed in My eBay or with the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank&quot;&gt;Account API&lt;/a&gt;. To get a list of all return policies associated with a seller&apos;s account on a specific eBay Marketplace, use the Account API&apos;s &lt;a href=&quot;/api-docs/sell/account/resources/return_policy/methods/getReturnPolicies&quot; target=&quot;_blank&quot;&gt;getReturnPolicies&lt;/a&gt; call. There are also calls in the &lt;strong&gt;Account API&lt;/strong&gt; to retrieve a return policy by policy ID or policy name.&lt;br&gt;&lt;br&gt;This field will be returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; methods if set for the offer. &lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: This field is required before an offer can be published to create an active listing. &lt;/p&gt;&lt;/span&gt;&lt;/div&gt;
     * @param value Value to set for the returnPolicyId property.
     */
    public void setReturnPolicyId(@jakarta.annotation.Nullable final String value) {
        this.returnPolicyId = value;
    }
    /**
     * Sets the shippingCostOverrides property value. This container is used if the seller wishes to override the shipping costs or surcharge for one or more domestic or international shipping service options defined in the fulfillment listing policy. To override the costs of a specific domestic or international shipping service option, the seller must know the priority/order of that shipping service in the fulfillment listing policy. The name of a shipping service option can be found in the &lt;strong&gt;shippingOptions.shippingServices.shippingServiceCode&lt;/strong&gt; field of the fulfillment policy, and the priority/order of that shipping service option is found in the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; field. Both of these values can be retrieved by searching for that fulfillment policy with the &lt;strong&gt;getFulfillmentPolicies&lt;/strong&gt; or &lt;strong&gt;getFulfillmentPolicyByName&lt;/strong&gt; calls of the &lt;strong&gt;Account API&lt;/strong&gt;. The &lt;strong&gt;shippingCostOverrides.priority&lt;/strong&gt; value should match the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; in order to override the shipping costs for that shipping service option. The seller must also ensure that the &lt;strong&gt;shippingServiceType&lt;/strong&gt; value is set to &lt;code&gt;DOMESTIC&lt;/code&gt; to override a domestic shipping service option, or to &lt;code&gt;INTERNATIONAL&lt;/code&gt; to override an international shipping service option.&lt;br&gt;&lt;br&gt;A separate &lt;strong&gt;ShippingCostOverrides&lt;/strong&gt; node is needed for each shipping service option whose costs are being overridden. All defined fields of the &lt;strong&gt;shippingCostOverrides&lt;/strong&gt; container should be included, even if the shipping costs and surcharge values are not changing.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;shippingCostOverrides&lt;/strong&gt; container is returned in the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot; target=&quot;_blank&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank&quot;&gt;getOffers&lt;/a&gt; calls if one or more shipping cost overrides are being applied to the fulfillment policy.
     * @param value Value to set for the shippingCostOverrides property.
     */
    public void setShippingCostOverrides(@jakarta.annotation.Nullable final java.util.List<ShippingCostOverride> value) {
        this.shippingCostOverrides = value;
    }
    /**
     * Sets the takeBackPolicyId property value. This unique identifier indicates the seller-created &lt;i&gt;global&lt;/i&gt; take-back policy that will be used once an offer is published and converted to a listing.&lt;br&gt;&lt;br&gt;One (1) global take-back policy may be specified &lt;i&gt;per offer&lt;/i&gt;.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For countries that support country-specific policies, use &lt;a href=&quot;#request.listingPolicies.regionalTakeBackPolicies&quot;&gt;regionalTakeBackPolicies&lt;/a&gt; to apply them to an offer.&lt;/span&gt;
     * @param value Value to set for the takeBackPolicyId property.
     */
    public void setTakeBackPolicyId(@jakarta.annotation.Nullable final String value) {
        this.takeBackPolicyId = value;
    }
}
