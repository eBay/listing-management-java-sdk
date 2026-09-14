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

package com.ebay.listingmanagement.generated.media.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A required metadata field for the &lt;strong&gt;createVideo&lt;/strong&gt; method. The only classification option currently is &lt;code&gt;ITEM&lt;/code&gt;. | - **ITEM**: The ITEM classification is designated to videos created using the createVideo method. Classification helps associate videos with a sellers product or store.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Classification implements ValuedEnum {
    ITEM("ITEM");
    public final String value;
    Classification(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Classification forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ITEM": return ITEM;
            default: return null;
        }
    }
}
