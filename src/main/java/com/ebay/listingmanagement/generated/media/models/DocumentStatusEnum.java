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
 * The status of the document resource.&lt;br&gt;&lt;br&gt;For example, the value &lt;code&gt;PENDING_UPLOAD&lt;/code&gt; is the initial state when the reference to the document has been created using the &lt;strong&gt;createDocument&lt;/strong&gt; method. When creating a document using the &lt;strong&gt;createDocumentFromUrl&lt;/strong&gt; method, the initial state will be &lt;code&gt;SUBMITTED&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DocumentStatusEnum implements ValuedEnum {
    SUBMITTED("SUBMITTED"),
    ACCEPTED("ACCEPTED"),
    REJECTED("REJECTED"),
    PENDING_UPLOAD("PENDING_UPLOAD"),
    EXPIRED("EXPIRED");
    public final String value;
    DocumentStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DocumentStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SUBMITTED": return SUBMITTED;
            case "ACCEPTED": return ACCEPTED;
            case "REJECTED": return REJECTED;
            case "PENDING_UPLOAD": return PENDING_UPLOAD;
            case "EXPIRED": return EXPIRED;
            default: return null;
        }
    }
}
