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
 * This field indicates the number of days that the listing will be active.&lt;br&gt;&lt;br&gt;This field is returned for both auction and fixed-price listings; however, the value returned for fixed-price listings will always be &lt;code&gt;GTC&lt;/code&gt;. The GTC (Good &apos;Til Cancelled) listings are automatically renewed each calendar month until the seller decides to end the listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; If the listing duration expires for an auction offer, the listing then becomes available as a fixed-price offer and will be GTC.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ListingDurationEnum implements ValuedEnum {
    DAYS_1("DAYS_1"),
    DAYS_3("DAYS_3"),
    DAYS_5("DAYS_5"),
    DAYS_7("DAYS_7"),
    DAYS_10("DAYS_10"),
    DAYS_21("DAYS_21"),
    DAYS_30("DAYS_30"),
    GTC("GTC");
    public final String value;
    ListingDurationEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ListingDurationEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DAYS_1": return DAYS_1;
            case "DAYS_3": return DAYS_3;
            case "DAYS_5": return DAYS_5;
            case "DAYS_7": return DAYS_7;
            case "DAYS_10": return DAYS_10;
            case "DAYS_21": return DAYS_21;
            case "DAYS_30": return DAYS_30;
            case "GTC": return GTC;
            default: return null;
        }
    }
}
