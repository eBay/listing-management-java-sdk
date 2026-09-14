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
 * The enumeration value in this field indicates the availability status of the inventory item at the merchant&apos;s physical store specified by the &lt;strong&gt;pickupAtLocationAvailability.merchantLocationKey&lt;/strong&gt; field. This field is required if the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container is used, and is always returned with the &lt;strong&gt;pickupAtLocationAvailability&lt;/strong&gt; container.  &lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-bulkcreateorreplaceinventoryitem.availabilitytypeenum&quot; target=&quot;_blank&quot;&gt;AvailabilityTypeEnum&lt;/a&gt; for more information about how/when you use each enumeration value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AvailabilityTypeEnum implements ValuedEnum {
    IN_STOCK("IN_STOCK"),
    OUT_OF_STOCK("OUT_OF_STOCK"),
    SHIP_TO_STORE("SHIP_TO_STORE");
    public final String value;
    AvailabilityTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AvailabilityTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "IN_STOCK": return IN_STOCK;
            case "OUT_OF_STOCK": return OUT_OF_STOCK;
            case "SHIP_TO_STORE": return SHIP_TO_STORE;
            default: return null;
        }
    }
}
