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
 * This enumerated type lists the types that are available for Shipping Regions. | - **DOMESTIC**: Listing and Item Shipped market places are the same. - **INTERNATIONAL_MATURED_REGION**: Items are shipped outside of the listing marketplace and shipped to one of the countries described in the policy page. https://www.ebay.com/help/selling/selling/monitor-service-metrics?id=4785#section4 - **INTERNATIONAL_EMERGING_REGION**: Items are shipped outside of the listing marketplace and shipped to countries which are not part of the International Mature region. https://www.ebay.com/help/selling/selling/monitor-service-metrics?id=4785#section4
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ShippingRegionTypeEnum implements ValuedEnum {
    DOMESTIC("DOMESTIC"),
    INTERNATIONAL_MATURED_REGION("INTERNATIONAL_MATURED_REGION"),
    INTERNATIONAL_EMERGING_REGION("INTERNATIONAL_EMERGING_REGION");
    public final String value;
    ShippingRegionTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ShippingRegionTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DOMESTIC": return DOMESTIC;
            case "INTERNATIONAL_MATURED_REGION": return INTERNATIONAL_MATURED_REGION;
            case "INTERNATIONAL_EMERGING_REGION": return INTERNATIONAL_EMERGING_REGION;
            default: return null;
        }
    }
}
