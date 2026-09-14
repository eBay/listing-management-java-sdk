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
 * This enumeration type is used to indicate the type of EU Responsible Person associated with a listing. | - **EU_RESPONSIBLE_PERSON**: This enum value indicates the Responsible person is an EU Responsible Person. An EU Responsible Person is crucial for ensuring that products comply with all relevant regulations and safety standards to protect human health.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResponsiblePersonTypeEnum implements ValuedEnum {
    EU_RESPONSIBLE_PERSON("EU_RESPONSIBLE_PERSON");
    public final String value;
    ResponsiblePersonTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResponsiblePersonTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EU_RESPONSIBLE_PERSON": return EU_RESPONSIBLE_PERSON;
            default: return null;
        }
    }
}
