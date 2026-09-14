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

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The listing format for the ActiveInventoryReport being created. Supported types are:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;AUCTION&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FIXED_PRICE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ListingFormatEnum implements ValuedEnum {
    AUCTION("AUCTION"),
    FIXED_PRICE("FIXED_PRICE");
    public final String value;
    ListingFormatEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ListingFormatEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AUCTION": return AUCTION;
            case "FIXED_PRICE": return FIXED_PRICE;
            default: return null;
        }
    }
}
