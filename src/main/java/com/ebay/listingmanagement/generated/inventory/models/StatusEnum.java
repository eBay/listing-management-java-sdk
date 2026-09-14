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
 * This field indicates whether the inventory location is enabled (inventory can be loaded to location) or disabled (inventory cannot be loaded to location). The merchant can use the &lt;strong&gt;enableInventoryLocation&lt;/strong&gt; call to enable a location in disabled status, or the &lt;strong&gt;disableInventoryLocation&lt;/strong&gt; call to disable a location in enabled status.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StatusEnum implements ValuedEnum {
    DISABLED("DISABLED"),
    ENABLED("ENABLED");
    public final String value;
    StatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DISABLED": return DISABLED;
            case "ENABLED": return ENABLED;
            default: return null;
        }
    }
}
