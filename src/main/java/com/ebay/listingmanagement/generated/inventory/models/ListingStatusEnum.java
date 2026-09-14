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
 * The enumeration value returned in this field indicates the status of the listing that is associated with the published offer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ListingStatusEnum implements ValuedEnum {
    ACTIVE("ACTIVE"),
    OUT_OF_STOCK("OUT_OF_STOCK"),
    INACTIVE("INACTIVE"),
    ENDED("ENDED"),
    EBAY_ENDED("EBAY_ENDED"),
    NOT_LISTED("NOT_LISTED");
    public final String value;
    ListingStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ListingStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ACTIVE": return ACTIVE;
            case "OUT_OF_STOCK": return OUT_OF_STOCK;
            case "INACTIVE": return INACTIVE;
            case "ENDED": return ENDED;
            case "EBAY_ENDED": return EBAY_ENDED;
            case "NOT_LISTED": return NOT_LISTED;
            default: return null;
        }
    }
}
