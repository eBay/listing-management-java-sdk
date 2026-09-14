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
 * The enumeration value in this field specifies the status of the offer - either &lt;code&gt;PUBLISHED&lt;/code&gt; or &lt;code&gt;UNPUBLISHED&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OfferStatusEnum implements ValuedEnum {
    PUBLISHED("PUBLISHED"),
    UNPUBLISHED("UNPUBLISHED");
    public final String value;
    OfferStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OfferStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PUBLISHED": return PUBLISHED;
            case "UNPUBLISHED": return UNPUBLISHED;
            default: return null;
        }
    }
}
