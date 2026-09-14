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
 * This field specifies how often the schedule is generated. If set to &lt;code&gt;HALF_HOUR&lt;/code&gt; or &lt;code&gt;ONE_HOUR&lt;/code&gt;, you cannot set a &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; using &lt;strong&gt;createSchedule&lt;/strong&gt; or &lt;strong&gt;updateSchedule&lt;/strong&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FrequencyEnum implements ValuedEnum {
    HALF_HOUR("HALF_HOUR"),
    ONE_HOUR("ONE_HOUR"),
    FOUR_HOURS("FOUR_HOURS"),
    EIGHT_HOURS("EIGHT_HOURS"),
    DAILY("DAILY"),
    WEEKLY("WEEKLY"),
    MONTHLY("MONTHLY"),
    QUARTERLY("QUARTERLY");
    public final String value;
    FrequencyEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FrequencyEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "HALF_HOUR": return HALF_HOUR;
            case "ONE_HOUR": return ONE_HOUR;
            case "FOUR_HOURS": return FOUR_HOURS;
            case "EIGHT_HOURS": return EIGHT_HOURS;
            case "DAILY": return DAILY;
            case "WEEKLY": return WEEKLY;
            case "MONTHLY": return MONTHLY;
            case "QUARTERLY": return QUARTERLY;
            default: return null;
        }
    }
}
