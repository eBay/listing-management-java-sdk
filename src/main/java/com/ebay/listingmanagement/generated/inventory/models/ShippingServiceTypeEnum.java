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
 * This enumerated value indicates whether the shipping service specified in the &lt;strong&gt;priority&lt;/strong&gt; field is a domestic or an international shipping service option. To override the shipping costs for a specific domestic shipping service in the fulfillment listing policy, this field should be set to &lt;code&gt;DOMESTIC&lt;/code&gt;, and to override the shipping costs for each international shipping service, this field should be set to &lt;code&gt;INTERNATIONAL&lt;/code&gt;. This value, along with &lt;strong&gt;priority&lt;/strong&gt; value, sets which domestic or international shipping service option in the fulfillment policy that will be modified with updated shipping costs. Specifically, the &lt;strong&gt;shippingCostOverrides.shippingServiceType&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.optionType&lt;/strong&gt; value in a fulfillment listing policy, and the &lt;strong&gt;shippingCostOverrides.priority&lt;/strong&gt; value in a &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; call must match the &lt;strong&gt;shippingOptions.shippingServices.sortOrderId&lt;/strong&gt; value in a fulfillment listing policy.&lt;br&gt;&lt;br&gt;This field is always required when overriding the shipping costs of a shipping service option, and will be always be returned for each shipping service option whose costs are being overridden.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ShippingServiceTypeEnum implements ValuedEnum {
    DOMESTIC("DOMESTIC"),
    INTERNATIONAL("INTERNATIONAL");
    public final String value;
    ShippingServiceTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ShippingServiceTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DOMESTIC": return DOMESTIC;
            case "INTERNATIONAL": return INTERNATIONAL;
            default: return null;
        }
    }
}
