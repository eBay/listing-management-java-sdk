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
 * The reason the schedule is inactive.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StatusReasonEnum implements ValuedEnum {
    SCHEDULE_END_DATE_REACHED("SCHEDULE_END_DATE_REACHED"),
    DISABLED_TEMPLATE("DISABLED_TEMPLATE");
    public final String value;
    StatusReasonEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StatusReasonEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SCHEDULE_END_DATE_REACHED": return SCHEDULE_END_DATE_REACHED;
            case "DISABLED_TEMPLATE": return DISABLED_TEMPLATE;
            default: return null;
        }
    }
}
