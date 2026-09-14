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
 * The status of the current video resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VideoStatusEnum implements ValuedEnum {
    PENDING_UPLOAD("PENDING_UPLOAD"),
    PROCESSING("PROCESSING"),
    PROCESSING_FAILED("PROCESSING_FAILED"),
    BLOCKED("BLOCKED"),
    LIVE("LIVE");
    public final String value;
    VideoStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VideoStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PENDING_UPLOAD": return PENDING_UPLOAD;
            case "PROCESSING": return PROCESSING;
            case "PROCESSING_FAILED": return PROCESSING_FAILED;
            case "BLOCKED": return BLOCKED;
            case "LIVE": return LIVE;
            default: return null;
        }
    }
}
