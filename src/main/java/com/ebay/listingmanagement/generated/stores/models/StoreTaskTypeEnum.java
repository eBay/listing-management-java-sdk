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

package com.ebay.listingmanagement.generated.stores.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The enumeration value indicates the task type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StoreTaskTypeEnum implements ValuedEnum {
    ADD_STORE_CATEGORY("ADD_STORE_CATEGORY"),
    MOVE_STORE_CATEGORY("MOVE_STORE_CATEGORY"),
    DELETE_STORE_CATEGORY("DELETE_STORE_CATEGORY");
    public final String value;
    StoreTaskTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StoreTaskTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ADD_STORE_CATEGORY": return ADD_STORE_CATEGORY;
            case "MOVE_STORE_CATEGORY": return MOVE_STORE_CATEGORY;
            case "DELETE_STORE_CATEGORY": return DELETE_STORE_CATEGORY;
            default: return null;
        }
    }
}
