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
 * An enumerated type defining the inventory location types. | - **STORE**: This enumeration value indicates the inventory location is a merchant&apos;s store. - **WAREHOUSE**: This enumeration value indicates the inventory location is a merchant&apos;s warehouse. - **FULFILLMENT_CENTER**: This enumeration value indicates the inventory location is a merchant&apos;s fulfillment center. &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Note&lt;/strong&gt;: This location type must be used to take advantage of the Multi-warehouse program to get improved EDD on listing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StoreTypeEnum implements ValuedEnum {
    STORE("STORE"),
    WAREHOUSE("WAREHOUSE"),
    FULFILLMENT_CENTER("FULFILLMENT_CENTER");
    public final String value;
    StoreTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StoreTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "STORE": return STORE;
            case "WAREHOUSE": return WAREHOUSE;
            case "FULFILLMENT_CENTER": return FULFILLMENT_CENTER;
            default: return null;
        }
    }
}
