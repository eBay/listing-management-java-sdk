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

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This field is needed if the Strikethrough Pricing (STP) feature will be used in the offer. This field indicates that the product was sold for the price in the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; field on an eBay site, or sold for that price by a third-party retailer. When using the &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; calls, the seller will pass in a value of &lt;code&gt;ON_EBAY&lt;/code&gt; to indicate that the product was sold for the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; on an eBay site, or the seller will pass in a value of &lt;code&gt;OFF_EBAY&lt;/code&gt; to indicate that the product was sold for the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; through a third-party retailer. This field and the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; field are only applicable if the seller and listing are eligible to use the Strikethrough Pricing feature, a feature which is limited to the US (core site and Motors), UK, Germany, Canada (English and French versions), France, Italy, and Spain sites.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SoldOnEnum implements ValuedEnum {
    ON_EBAY("ON_EBAY"),
    OFF_EBAY("OFF_EBAY"),
    ON_AND_OFF_EBAY("ON_AND_OFF_EBAY");
    public final String value;
    SoldOnEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SoldOnEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ON_EBAY": return ON_EBAY;
            case "OFF_EBAY": return OFF_EBAY;
            case "ON_AND_OFF_EBAY": return ON_AND_OFF_EBAY;
            default: return null;
        }
    }
}
