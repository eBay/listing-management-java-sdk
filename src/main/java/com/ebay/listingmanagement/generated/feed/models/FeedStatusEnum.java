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
 * The enumeration value that indicates the state of the task that was submitted in the request. See &lt;strong&gt;FeedStatusEnum&lt;/strong&gt; for information. &lt;p&gt;The values &lt;code&gt;COMPLETED&lt;/code&gt; and &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt; indicate the Order Report file is ready to download.&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeedStatusEnum implements ValuedEnum {
    CREATED("CREATED"),
    QUEUED("QUEUED"),
    IN_PROCESS("IN_PROCESS"),
    COMPLETED("COMPLETED"),
    COMPLETED_WITH_ERROR("COMPLETED_WITH_ERROR"),
    FAILED("FAILED"),
    PARTIALLY_PROCESSED("PARTIALLY_PROCESSED");
    public final String value;
    FeedStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeedStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CREATED": return CREATED;
            case "QUEUED": return QUEUED;
            case "IN_PROCESS": return IN_PROCESS;
            case "COMPLETED": return COMPLETED;
            case "COMPLETED_WITH_ERROR": return COMPLETED_WITH_ERROR;
            case "FAILED": return FAILED;
            case "PARTIALLY_PROCESSED": return PARTIALLY_PROCESSED;
            default: return null;
        }
    }
}
