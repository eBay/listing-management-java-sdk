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
 * A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; value is required for each day of the week that the store location has regular operating hours. &lt;br&gt;&lt;br&gt;This field is returned if operating hours are defined for the store location.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DayOfWeekEnum implements ValuedEnum {
    MONDAY("MONDAY"),
    TUESDAY("TUESDAY"),
    WEDNESDAY("WEDNESDAY"),
    THURSDAY("THURSDAY"),
    FRIDAY("FRIDAY"),
    SATURDAY("SATURDAY"),
    SUNDAY("SUNDAY");
    public final String value;
    DayOfWeekEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DayOfWeekEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MONDAY": return MONDAY;
            case "TUESDAY": return TUESDAY;
            case "WEDNESDAY": return WEDNESDAY;
            case "THURSDAY": return THURSDAY;
            case "FRIDAY": return FRIDAY;
            case "SATURDAY": return SATURDAY;
            case "SUNDAY": return SUNDAY;
            default: return null;
        }
    }
}
