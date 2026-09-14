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
 * This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. &lt;br&gt;&lt;br&gt;Since the condition of an inventory item must be specified before being published in an offer, this field is always returned in the &apos;Get&apos; calls for SKUs that are part of a published offer. If a SKU is not part of a published offer, this field will only be returned if set for the inventory item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConditionEnum implements ValuedEnum {
    NEW("NEW"),
    LIKE_NEW("LIKE_NEW"),
    NEW_OTHER("NEW_OTHER"),
    NEW_WITH_DEFECTS("NEW_WITH_DEFECTS"),
    MANUFACTURER_REFURBISHED("MANUFACTURER_REFURBISHED"),
    CERTIFIED_REFURBISHED("CERTIFIED_REFURBISHED"),
    EXCELLENT_REFURBISHED("EXCELLENT_REFURBISHED"),
    VERY_GOOD_REFURBISHED("VERY_GOOD_REFURBISHED"),
    GOOD_REFURBISHED("GOOD_REFURBISHED"),
    SELLER_REFURBISHED("SELLER_REFURBISHED"),
    USED_EXCELLENT("USED_EXCELLENT"),
    USED_VERY_GOOD("USED_VERY_GOOD"),
    USED_GOOD("USED_GOOD"),
    USED_ACCEPTABLE("USED_ACCEPTABLE"),
    FOR_PARTS_OR_NOT_WORKING("FOR_PARTS_OR_NOT_WORKING"),
    PRE_OWNED_EXCELLENT("PRE_OWNED_EXCELLENT"),
    PRE_OWNED_FAIR("PRE_OWNED_FAIR");
    public final String value;
    ConditionEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NEW": return NEW;
            case "LIKE_NEW": return LIKE_NEW;
            case "NEW_OTHER": return NEW_OTHER;
            case "NEW_WITH_DEFECTS": return NEW_WITH_DEFECTS;
            case "MANUFACTURER_REFURBISHED": return MANUFACTURER_REFURBISHED;
            case "CERTIFIED_REFURBISHED": return CERTIFIED_REFURBISHED;
            case "EXCELLENT_REFURBISHED": return EXCELLENT_REFURBISHED;
            case "VERY_GOOD_REFURBISHED": return VERY_GOOD_REFURBISHED;
            case "GOOD_REFURBISHED": return GOOD_REFURBISHED;
            case "SELLER_REFURBISHED": return SELLER_REFURBISHED;
            case "USED_EXCELLENT": return USED_EXCELLENT;
            case "USED_VERY_GOOD": return USED_VERY_GOOD;
            case "USED_GOOD": return USED_GOOD;
            case "USED_ACCEPTABLE": return USED_ACCEPTABLE;
            case "FOR_PARTS_OR_NOT_WORKING": return FOR_PARTS_OR_NOT_WORKING;
            case "PRE_OWNED_EXCELLENT": return PRE_OWNED_EXCELLENT;
            case "PRE_OWNED_FAIR": return PRE_OWNED_FAIR;
            default: return null;
        }
    }
}
