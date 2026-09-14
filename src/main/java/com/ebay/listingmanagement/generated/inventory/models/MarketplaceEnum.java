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
 * This is the unique identifier of the eBay Marketplace where the listing resides. The value fo the eBay US site will be &lt;code&gt;EBAY_US&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MarketplaceEnum implements ValuedEnum {
    EBAY_US("EBAY_US"),
    EBAY_MOTORS("EBAY_MOTORS"),
    EBAY_CA("EBAY_CA"),
    EBAY_GB("EBAY_GB"),
    EBAY_AU("EBAY_AU"),
    EBAY_AT("EBAY_AT"),
    EBAY_BE("EBAY_BE"),
    EBAY_FR("EBAY_FR"),
    EBAY_DE("EBAY_DE"),
    EBAY_IT("EBAY_IT"),
    EBAY_NL("EBAY_NL"),
    EBAY_ES("EBAY_ES"),
    EBAY_CH("EBAY_CH"),
    EBAY_TW("EBAY_TW"),
    EBAY_CZ("EBAY_CZ"),
    EBAY_DK("EBAY_DK"),
    EBAY_FI("EBAY_FI"),
    EBAY_GR("EBAY_GR"),
    EBAY_HK("EBAY_HK"),
    EBAY_HU("EBAY_HU"),
    EBAY_IN("EBAY_IN"),
    EBAY_ID("EBAY_ID"),
    EBAY_IE("EBAY_IE"),
    EBAY_IL("EBAY_IL"),
    EBAY_MY("EBAY_MY"),
    EBAY_NZ("EBAY_NZ"),
    EBAY_NO("EBAY_NO"),
    EBAY_PH("EBAY_PH"),
    EBAY_PL("EBAY_PL"),
    EBAY_PT("EBAY_PT"),
    EBAY_PR("EBAY_PR"),
    EBAY_RU("EBAY_RU"),
    EBAY_SG("EBAY_SG"),
    EBAY_ZA("EBAY_ZA"),
    EBAY_SE("EBAY_SE"),
    EBAY_TH("EBAY_TH"),
    EBAY_VN("EBAY_VN"),
    EBAY_CN("EBAY_CN"),
    EBAY_PE("EBAY_PE"),
    EBAY_JP("EBAY_JP");
    public final String value;
    MarketplaceEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MarketplaceEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EBAY_US": return EBAY_US;
            case "EBAY_MOTORS": return EBAY_MOTORS;
            case "EBAY_CA": return EBAY_CA;
            case "EBAY_GB": return EBAY_GB;
            case "EBAY_AU": return EBAY_AU;
            case "EBAY_AT": return EBAY_AT;
            case "EBAY_BE": return EBAY_BE;
            case "EBAY_FR": return EBAY_FR;
            case "EBAY_DE": return EBAY_DE;
            case "EBAY_IT": return EBAY_IT;
            case "EBAY_NL": return EBAY_NL;
            case "EBAY_ES": return EBAY_ES;
            case "EBAY_CH": return EBAY_CH;
            case "EBAY_TW": return EBAY_TW;
            case "EBAY_CZ": return EBAY_CZ;
            case "EBAY_DK": return EBAY_DK;
            case "EBAY_FI": return EBAY_FI;
            case "EBAY_GR": return EBAY_GR;
            case "EBAY_HK": return EBAY_HK;
            case "EBAY_HU": return EBAY_HU;
            case "EBAY_IN": return EBAY_IN;
            case "EBAY_ID": return EBAY_ID;
            case "EBAY_IE": return EBAY_IE;
            case "EBAY_IL": return EBAY_IL;
            case "EBAY_MY": return EBAY_MY;
            case "EBAY_NZ": return EBAY_NZ;
            case "EBAY_NO": return EBAY_NO;
            case "EBAY_PH": return EBAY_PH;
            case "EBAY_PL": return EBAY_PL;
            case "EBAY_PT": return EBAY_PT;
            case "EBAY_PR": return EBAY_PR;
            case "EBAY_RU": return EBAY_RU;
            case "EBAY_SG": return EBAY_SG;
            case "EBAY_ZA": return EBAY_ZA;
            case "EBAY_SE": return EBAY_SE;
            case "EBAY_TH": return EBAY_TH;
            case "EBAY_VN": return EBAY_VN;
            case "EBAY_CN": return EBAY_CN;
            case "EBAY_PE": return EBAY_PE;
            case "EBAY_JP": return EBAY_JP;
            default: return null;
        }
    }
}
