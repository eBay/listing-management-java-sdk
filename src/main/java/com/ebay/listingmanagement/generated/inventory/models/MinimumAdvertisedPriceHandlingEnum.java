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
 * This field is needed if the Minimum Advertised Price (MAP) feature will be used in the offer. This field is only applicable if an eligible US seller is using the Minimum Advertised Price (MAP) feature and a &lt;strong&gt;minimumAdvertisedPrice&lt;/strong&gt; has been specified. The value set in this field will determine whether the MAP price is shown to a prospective buyer prior to checkout through a pop-up window accessed from the View Item page, or if the MAP price is not shown until the checkout flow after the buyer has already committed to buying the item. To show the MAP price prior to checkout, the seller will set this value to &lt;code&gt;PRE_CHECKOUT&lt;/code&gt;. To show the MAP price after the buyer already commits to buy the item, the seller will set this value to &lt;code&gt;DURING_CHECKOUT&lt;/code&gt;. This field will be ignored if the seller and/or the listing is not eligible for the MAP feature.&lt;br&gt;&lt;br&gt;This field will be returned by &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffer&quot;&gt;getOffer&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot;&gt;getOffers&lt;/a&gt; if set for the offer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MinimumAdvertisedPriceHandlingEnum implements ValuedEnum {
    NONE("NONE"),
    PRE_CHECKOUT("PRE_CHECKOUT"),
    DURING_CHECKOUT("DURING_CHECKOUT");
    public final String value;
    MinimumAdvertisedPriceHandlingEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MinimumAdvertisedPriceHandlingEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NONE": return NONE;
            case "PRE_CHECKOUT": return PRE_CHECKOUT;
            case "DURING_CHECKOUT": return DURING_CHECKOUT;
            default: return null;
        }
    }
}
