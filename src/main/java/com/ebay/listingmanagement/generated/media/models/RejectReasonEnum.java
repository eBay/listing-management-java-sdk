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
 * An enumerated type that indicates the reason why a video may be blocked by moderators.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section2 &quot; target=&quot;_blank&quot;&gt;Video moderation and restrictions&lt;/a&gt; and &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section4 &quot; target=&quot;_blank&quot;&gt;Video Format Requirements&lt;/a&gt; in the eBay Seller Center for details about video moderation and formatting requirements.&lt;/span&gt; | - **MAX_LENGTH_EXCEEDED**: This enum value indicates that the video is blocked because the max length has been exceeded. - **PIXELATED**: This enum value indicates that the video is blocked because some parts are pixelated and cannot be seen clearly. - **BLURRED**: This enum value indicates that the video is blocked because some parts are blurry and cannot be seen clearly. - **DISTORTED_AUDIO**: This enum value indicates that the video is blocked because the audio playback is distorted. - **FREEZES**: This enum value indicates that the video is blocked because some parts appear frozen and do not play correctly. - **INAPPROPRIATE_DEPICTION**: This enum value indicates that the video is blocked due to an inappropriate depiction of minors. Refer to eBay&apos;s &lt;a href=&quot;https://www.ebay.com/help/policies/prohibited-restricted-items/protecting-minors-policy?id=5057&quot; target=&quot;_blank&quot;&gt;Protecting Minors Policy&lt;/a&gt; for details. - **OFFENSIVE_CONTENT**: This enum value indicates that the video is blocked because it contains offensive content. Refer to eBay&apos;s &lt;a href=&quot;https://www.ebay.com/help/policies/prohibited-restricted-items/offensive-materials-policy?id=4324&quot; target=&quot;_blank&quot;&gt;Offensive Materials Policy&lt;/a&gt; for details. - **DIRECTS_OFF_EBAY**: This enum value indicates that the video is blocked because it leads buyers away from the eBay site. See &lt;a href=&quot;https://www.ebay.com/help/policies/payment-policies/offering-buy-sell-outside-ebay-policy?id=4272&quot; target=&quot;_blank&quot;&gt;Offering to buy or sell outside eBay&lt;/a&gt; for details. - **NUDITY**: This enum value indicates that the video is blocked because the it contains nudity. Refer to eBay&apos;s &lt;a href=&quot;https://www.ebay.com/help/policies/prohibited-restricted-items/adult-items-policy?id=4278&quot; target=&quot;_blank&quot;&gt;Adult Items Policy&lt;/a&gt; for details. - **OTHER_POLICY_VIOLATION**: This enum value indicates that the video is blocked due to some other specific or atypical policy violation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RejectReasonEnum implements ValuedEnum {
    MAX_LENGTH_EXCEEDED("MAX_LENGTH_EXCEEDED"),
    PIXELATED("PIXELATED"),
    BLURRED("BLURRED"),
    DISTORTED_AUDIO("DISTORTED_AUDIO"),
    FREEZES("FREEZES"),
    INAPPROPRIATE_DEPICTION("INAPPROPRIATE_DEPICTION"),
    OFFENSIVE_CONTENT("OFFENSIVE_CONTENT"),
    DIRECTS_OFF_EBAY("DIRECTS_OFF_EBAY"),
    NUDITY("NUDITY"),
    OTHER_POLICY_VIOLATION("OTHER_POLICY_VIOLATION");
    public final String value;
    RejectReasonEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RejectReasonEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MAX_LENGTH_EXCEEDED": return MAX_LENGTH_EXCEEDED;
            case "PIXELATED": return PIXELATED;
            case "BLURRED": return BLURRED;
            case "DISTORTED_AUDIO": return DISTORTED_AUDIO;
            case "FREEZES": return FREEZES;
            case "INAPPROPRIATE_DEPICTION": return INAPPROPRIATE_DEPICTION;
            case "OFFENSIVE_CONTENT": return OFFENSIVE_CONTENT;
            case "DIRECTS_OFF_EBAY": return DIRECTS_OFF_EBAY;
            case "NUDITY": return NUDITY;
            case "OTHER_POLICY_VIOLATION": return OTHER_POLICY_VIOLATION;
            default: return null;
        }
    }
}
