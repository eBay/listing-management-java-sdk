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
 * Identifies the type of error.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ErrorCategory implements ValuedEnum {
    APPLICATION("APPLICATION"),
    BUSINESS("BUSINESS"),
    REQUEST("REQUEST");
    public final String value;
    ErrorCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ErrorCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "APPLICATION": return APPLICATION;
            case "BUSINESS": return BUSINESS;
            case "REQUEST": return REQUEST;
            default: return null;
        }
    }
}
