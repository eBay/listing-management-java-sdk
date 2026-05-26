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
 * This type is used to specify the listing price for the product and settings for the Minimum Advertised Price and Strikethrough Pricing features. The &lt;strong&gt;price&lt;/strong&gt; field must be supplied before an offer is published, but a seller may create an offer without supplying a price initially. The Minimum Advertised Price feature is only available on the US site. Strikethrough Pricing is available on the US, eBay Motors, UK, Germany, Canada (English and French), France, Italy, and Spain sites.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PricingSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to express a dollar value and the applicable currency.
     */
    private Amount auctionReservePrice;
    /**
     * This type is used to express a dollar value and the applicable currency.
     */
    private Amount auctionStartPrice;
    /**
     * This type is used to express a dollar value and the applicable currency.
     */
    private Amount minimumAdvertisedPrice;
    /**
     * This field is needed if the Strikethrough Pricing (STP) feature will be used in the offer. This field indicates that the product was sold for the price in the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; field on an eBay site, or sold for that price by a third-party retailer. When using the &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; calls, the seller will pass in a value of &lt;code&gt;ON_EBAY&lt;/code&gt; to indicate that the product was sold for the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; on an eBay site, or the seller will pass in a value of &lt;code&gt;OFF_EBAY&lt;/code&gt; to indicate that the product was sold for the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; through a third-party retailer. This field and the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; field are only applicable if the seller and listing are eligible to use the Strikethrough Pricing feature, a feature which is limited to the US (core site and Motors), UK, Germany, Canada (English and French versions), France, Italy, and Spain sites.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:SoldOnEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String originallySoldForRetailPriceOn;
    /**
     * This type is used to express a dollar value and the applicable currency.
     */
    private Amount originalRetailPrice;
    /**
     * This type is used to express a dollar value and the applicable currency.
     */
    private Amount price;
    /**
     * This field is needed if the Minimum Advertised Price (MAP) feature will be used in the offer. This field is only applicable if an eligible US seller is using the Minimum Advertised Price (MAP) feature and a &lt;strong&gt;minimumAdvertisedPrice&lt;/strong&gt; has been specified. The value set in this field will determine whether the MAP price is shown to a prospective buyer prior to checkout through a pop-up window accessed from the View Item page, or if the MAP price is not shown until the checkout flow after the buyer has already committed to buying the item. To show the MAP price prior to checkout, the seller will set this value to &lt;code&gt;PRE_CHECKOUT&lt;/code&gt;. To show the MAP price after the buyer already commits to buy the item, the seller will set this value to &lt;code&gt;DURING_CHECKOUT&lt;/code&gt;. This field will be ignored if the seller and/or the listing is not eligible for the MAP feature.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:MinimumAdvertisedPriceHandlingEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String pricingVisibility;
    /**
     * Instantiates a new {@link PricingSummary} and sets the default values.
     */
    public PricingSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PricingSummary}
     */
    @jakarta.annotation.Nonnull
    public static PricingSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PricingSummary();
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
     * Gets the auctionReservePrice property value. This type is used to express a dollar value and the applicable currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAuctionReservePrice() {
        return this.auctionReservePrice;
    }
    /**
     * Gets the auctionStartPrice property value. This type is used to express a dollar value and the applicable currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAuctionStartPrice() {
        return this.auctionStartPrice;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("auctionReservePrice", (n) -> { this.setAuctionReservePrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("auctionStartPrice", (n) -> { this.setAuctionStartPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("minimumAdvertisedPrice", (n) -> { this.setMinimumAdvertisedPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("originallySoldForRetailPriceOn", (n) -> { this.setOriginallySoldForRetailPriceOn(n.getStringValue()); });
        deserializerMap.put("originalRetailPrice", (n) -> { this.setOriginalRetailPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("pricingVisibility", (n) -> { this.setPricingVisibility(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the minimumAdvertisedPrice property value. This type is used to express a dollar value and the applicable currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getMinimumAdvertisedPrice() {
        return this.minimumAdvertisedPrice;
    }
    /**
     * Gets the originallySoldForRetailPriceOn property value. This field is needed if the Strikethrough Pricing (STP) feature will be used in the offer. This field indicates that the product was sold for the price in the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; field on an eBay site, or sold for that price by a third-party retailer. When using the &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; calls, the seller will pass in a value of &lt;code&gt;ON_EBAY&lt;/code&gt; to indicate that the product was sold for the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; on an eBay site, or the seller will pass in a value of &lt;code&gt;OFF_EBAY&lt;/code&gt; to indicate that the product was sold for the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; through a third-party retailer. This field and the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; field are only applicable if the seller and listing are eligible to use the Strikethrough Pricing feature, a feature which is limited to the US (core site and Motors), UK, Germany, Canada (English and French versions), France, Italy, and Spain sites.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:SoldOnEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginallySoldForRetailPriceOn() {
        return this.originallySoldForRetailPriceOn;
    }
    /**
     * Gets the originalRetailPrice property value. This type is used to express a dollar value and the applicable currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getOriginalRetailPrice() {
        return this.originalRetailPrice;
    }
    /**
     * Gets the price property value. This type is used to express a dollar value and the applicable currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPrice() {
        return this.price;
    }
    /**
     * Gets the pricingVisibility property value. This field is needed if the Minimum Advertised Price (MAP) feature will be used in the offer. This field is only applicable if an eligible US seller is using the Minimum Advertised Price (MAP) feature and a &lt;strong&gt;minimumAdvertisedPrice&lt;/strong&gt; has been specified. The value set in this field will determine whether the MAP price is shown to a prospective buyer prior to checkout through a pop-up window accessed from the View Item page, or if the MAP price is not shown until the checkout flow after the buyer has already committed to buying the item. To show the MAP price prior to checkout, the seller will set this value to &lt;code&gt;PRE_CHECKOUT&lt;/code&gt;. To show the MAP price after the buyer already commits to buy the item, the seller will set this value to &lt;code&gt;DURING_CHECKOUT&lt;/code&gt;. This field will be ignored if the seller and/or the listing is not eligible for the MAP feature.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:MinimumAdvertisedPriceHandlingEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPricingVisibility() {
        return this.pricingVisibility;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("auctionReservePrice", this.getAuctionReservePrice());
        writer.writeObjectValue("auctionStartPrice", this.getAuctionStartPrice());
        writer.writeObjectValue("minimumAdvertisedPrice", this.getMinimumAdvertisedPrice());
        writer.writeStringValue("originallySoldForRetailPriceOn", this.getOriginallySoldForRetailPriceOn());
        writer.writeObjectValue("originalRetailPrice", this.getOriginalRetailPrice());
        writer.writeObjectValue("price", this.getPrice());
        writer.writeStringValue("pricingVisibility", this.getPricingVisibility());
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
     * Sets the auctionReservePrice property value. This type is used to express a dollar value and the applicable currency.
     * @param value Value to set for the auctionReservePrice property.
     */
    public void setAuctionReservePrice(@jakarta.annotation.Nullable final Amount value) {
        this.auctionReservePrice = value;
    }
    /**
     * Sets the auctionStartPrice property value. This type is used to express a dollar value and the applicable currency.
     * @param value Value to set for the auctionStartPrice property.
     */
    public void setAuctionStartPrice(@jakarta.annotation.Nullable final Amount value) {
        this.auctionStartPrice = value;
    }
    /**
     * Sets the minimumAdvertisedPrice property value. This type is used to express a dollar value and the applicable currency.
     * @param value Value to set for the minimumAdvertisedPrice property.
     */
    public void setMinimumAdvertisedPrice(@jakarta.annotation.Nullable final Amount value) {
        this.minimumAdvertisedPrice = value;
    }
    /**
     * Sets the originallySoldForRetailPriceOn property value. This field is needed if the Strikethrough Pricing (STP) feature will be used in the offer. This field indicates that the product was sold for the price in the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; field on an eBay site, or sold for that price by a third-party retailer. When using the &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; calls, the seller will pass in a value of &lt;code&gt;ON_EBAY&lt;/code&gt; to indicate that the product was sold for the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; on an eBay site, or the seller will pass in a value of &lt;code&gt;OFF_EBAY&lt;/code&gt; to indicate that the product was sold for the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; through a third-party retailer. This field and the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; field are only applicable if the seller and listing are eligible to use the Strikethrough Pricing feature, a feature which is limited to the US (core site and Motors), UK, Germany, Canada (English and French versions), France, Italy, and Spain sites.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:SoldOnEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the originallySoldForRetailPriceOn property.
     */
    public void setOriginallySoldForRetailPriceOn(@jakarta.annotation.Nullable final String value) {
        this.originallySoldForRetailPriceOn = value;
    }
    /**
     * Sets the originalRetailPrice property value. This type is used to express a dollar value and the applicable currency.
     * @param value Value to set for the originalRetailPrice property.
     */
    public void setOriginalRetailPrice(@jakarta.annotation.Nullable final Amount value) {
        this.originalRetailPrice = value;
    }
    /**
     * Sets the price property value. This type is used to express a dollar value and the applicable currency.
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final Amount value) {
        this.price = value;
    }
    /**
     * Sets the pricingVisibility property value. This field is needed if the Minimum Advertised Price (MAP) feature will be used in the offer. This field is only applicable if an eligible US seller is using the Minimum Advertised Price (MAP) feature and a &lt;strong&gt;minimumAdvertisedPrice&lt;/strong&gt; has been specified. The value set in this field will determine whether the MAP price is shown to a prospective buyer prior to checkout through a pop-up window accessed from the View Item page, or if the MAP price is not shown until the checkout flow after the buyer has already committed to buying the item. To show the MAP price prior to checkout, the seller will set this value to &lt;code&gt;PRE_CHECKOUT&lt;/code&gt;. To show the MAP price after the buyer already commits to buy the item, the seller will set this value to &lt;code&gt;DURING_CHECKOUT&lt;/code&gt;. This field will be ignored if the seller and/or the listing is not eligible for the MAP feature.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:MinimumAdvertisedPriceHandlingEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the pricingVisibility property.
     */
    public void setPricingVisibility(@jakarta.annotation.Nullable final String value) {
        this.pricingVisibility = value;
    }
}
