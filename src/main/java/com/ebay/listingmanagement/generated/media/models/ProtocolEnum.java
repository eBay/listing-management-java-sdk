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
 * The protocol for the video playlist. Supported protocols are DASH (Dynamic Adaptive Streaming over HTTP) and HLS (HTTP Live Streaming).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProtocolEnum implements ValuedEnum {
    DASH("DASH"),
    HLS("HLS");
    public final String value;
    ProtocolEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProtocolEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DASH": return DASH;
            case "HLS": return HLS;
            default: return null;
        }
    }
}
