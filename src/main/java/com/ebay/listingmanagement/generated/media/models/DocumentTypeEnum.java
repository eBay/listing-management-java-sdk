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
 * The type of the document uploaded. For example, &lt;code&gt;USER_GUIDE_OR_MANUAL&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DocumentTypeEnum implements ValuedEnum {
    CERTIFICATE_OF_ANALYSIS("CERTIFICATE_OF_ANALYSIS"),
    CERTIFICATE_OF_CONFORMITY("CERTIFICATE_OF_CONFORMITY"),
    DECLARATION_OF_CONFORMITY("DECLARATION_OF_CONFORMITY"),
    INSTRUCTIONS_FOR_USE("INSTRUCTIONS_FOR_USE"),
    OTHER_SAFETY_DOCUMENTS("OTHER_SAFETY_DOCUMENTS"),
    SAFETY_DATA_SHEET("SAFETY_DATA_SHEET"),
    TROUBLE_SHOOTING_GUIDE("TROUBLE_SHOOTING_GUIDE"),
    USER_GUIDE_OR_MANUAL("USER_GUIDE_OR_MANUAL"),
    INSTALLATION_INSTRUCTIONS("INSTALLATION_INSTRUCTIONS"),
    ACCESSIBILITY_INFORMATION("ACCESSIBILITY_INFORMATION"),
    SAFETY_TEST_LAB_REPORTS("SAFETY_TEST_LAB_REPORTS"),
    EEK_ENERGY_LABEL("EEK_ENERGY_LABEL"),
    EEK_PRODUCT_INFORMATION_SHEET("EEK_PRODUCT_INFORMATION_SHEET"),
    GENERAL_CERTIFICATE_OF_CONFORMITY("GENERAL_CERTIFICATE_OF_CONFORMITY"),
    CHILDRENS_PRODUCT_CERTIFICATE("CHILDRENS_PRODUCT_CERTIFICATE");
    public final String value;
    DocumentTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DocumentTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CERTIFICATE_OF_ANALYSIS": return CERTIFICATE_OF_ANALYSIS;
            case "CERTIFICATE_OF_CONFORMITY": return CERTIFICATE_OF_CONFORMITY;
            case "DECLARATION_OF_CONFORMITY": return DECLARATION_OF_CONFORMITY;
            case "INSTRUCTIONS_FOR_USE": return INSTRUCTIONS_FOR_USE;
            case "OTHER_SAFETY_DOCUMENTS": return OTHER_SAFETY_DOCUMENTS;
            case "SAFETY_DATA_SHEET": return SAFETY_DATA_SHEET;
            case "TROUBLE_SHOOTING_GUIDE": return TROUBLE_SHOOTING_GUIDE;
            case "USER_GUIDE_OR_MANUAL": return USER_GUIDE_OR_MANUAL;
            case "INSTALLATION_INSTRUCTIONS": return INSTALLATION_INSTRUCTIONS;
            case "ACCESSIBILITY_INFORMATION": return ACCESSIBILITY_INFORMATION;
            case "SAFETY_TEST_LAB_REPORTS": return SAFETY_TEST_LAB_REPORTS;
            case "EEK_ENERGY_LABEL": return EEK_ENERGY_LABEL;
            case "EEK_PRODUCT_INFORMATION_SHEET": return EEK_PRODUCT_INFORMATION_SHEET;
            case "GENERAL_CERTIFICATE_OF_CONFORMITY": return GENERAL_CERTIFICATE_OF_CONFORMITY;
            case "CHILDRENS_PRODUCT_CERTIFICATE": return CHILDRENS_PRODUCT_CERTIFICATE;
            default: return null;
        }
    }
}
