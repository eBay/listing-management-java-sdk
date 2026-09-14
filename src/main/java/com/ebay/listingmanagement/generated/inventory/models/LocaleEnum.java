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
 * This field returns the natural language that was provided in the field values of the request payload (i.e., en_AU, en_GB or de_DE).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LocaleEnum implements ValuedEnum {
    En_US("en_US"),
    En_CA("en_CA"),
    Fr_CA("fr_CA"),
    En_GB("en_GB"),
    En_AU("en_AU"),
    En_IN("en_IN"),
    De_AT("de_AT"),
    Fr_BE("fr_BE"),
    Fr_FR("fr_FR"),
    De_DE("de_DE"),
    It_IT("it_IT"),
    Nl_BE("nl_BE"),
    Nl_NL("nl_NL"),
    Es_ES("es_ES"),
    De_CH("de_CH"),
    Fi_FI("fi_FI"),
    Zh_HK("zh_HK"),
    Hu_HU("hu_HU"),
    En_PH("en_PH"),
    Pl_PL("pl_PL"),
    Pt_PT("pt_PT"),
    Ru_RU("ru_RU"),
    En_SG("en_SG"),
    En_IE("en_IE"),
    En_MY("en_MY");
    public final String value;
    LocaleEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LocaleEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "en_US": return En_US;
            case "en_CA": return En_CA;
            case "fr_CA": return Fr_CA;
            case "en_GB": return En_GB;
            case "en_AU": return En_AU;
            case "en_IN": return En_IN;
            case "de_AT": return De_AT;
            case "fr_BE": return Fr_BE;
            case "fr_FR": return Fr_FR;
            case "de_DE": return De_DE;
            case "it_IT": return It_IT;
            case "nl_BE": return Nl_BE;
            case "nl_NL": return Nl_NL;
            case "es_ES": return Es_ES;
            case "de_CH": return De_CH;
            case "fi_FI": return Fi_FI;
            case "zh_HK": return Zh_HK;
            case "hu_HU": return Hu_HU;
            case "en_PH": return En_PH;
            case "pl_PL": return Pl_PL;
            case "pt_PT": return Pt_PT;
            case "ru_RU": return Ru_RU;
            case "en_SG": return En_SG;
            case "en_IE": return En_IE;
            case "en_MY": return En_MY;
            default: return null;
        }
    }
}
