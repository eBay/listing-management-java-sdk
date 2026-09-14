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
 * This enumeration value indicates the type of shipping package used to ship the inventory item. The supported values for this field can be found in the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-inventory_item-bulkcreateorreplaceinventoryitem.packagetypeenum&quot; target=&quot;_blank&quot;&gt;PackageTypeEnum&lt;/a&gt; type.&lt;br&gt;&lt;br&gt;This field will be returned if the package type is set for the inventory item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; You can use the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/GeteBayDetails.html#Response.ShippingPackageDetails&quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; Trading API call to retrieve a list of supported package types for a specific marketplace.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PackageTypeEnum implements ValuedEnum {
    LETTER("LETTER"),
    BULKY_GOODS("BULKY_GOODS"),
    CARAVAN("CARAVAN"),
    CARS("CARS"),
    EUROPALLET("EUROPALLET"),
    EXPANDABLE_TOUGH_BAGS("EXPANDABLE_TOUGH_BAGS"),
    EXTRA_LARGE_PACK("EXTRA_LARGE_PACK"),
    FURNITURE("FURNITURE"),
    INDUSTRY_VEHICLES("INDUSTRY_VEHICLES"),
    LARGE_CANADA_POSTBOX("LARGE_CANADA_POSTBOX"),
    LARGE_CANADA_POST_BUBBLE_MAILER("LARGE_CANADA_POST_BUBBLE_MAILER"),
    LARGE_ENVELOPE("LARGE_ENVELOPE"),
    MAILING_BOX("MAILING_BOX"),
    MEDIUM_CANADA_POST_BOX("MEDIUM_CANADA_POST_BOX"),
    MEDIUM_CANADA_POST_BUBBLE_MAILER("MEDIUM_CANADA_POST_BUBBLE_MAILER"),
    MOTORBIKES("MOTORBIKES"),
    ONE_WAY_PALLET("ONE_WAY_PALLET"),
    PACKAGE_THICK_ENVELOPE("PACKAGE_THICK_ENVELOPE"),
    PADDED_BAGS("PADDED_BAGS"),
    PARCEL_OR_PADDED_ENVELOPE("PARCEL_OR_PADDED_ENVELOPE"),
    ROLL("ROLL"),
    SMALL_CANADA_POST_BOX("SMALL_CANADA_POST_BOX"),
    SMALL_CANADA_POST_BUBBLE_MAILER("SMALL_CANADA_POST_BUBBLE_MAILER"),
    TOUGH_BAGS("TOUGH_BAGS"),
    UPS_LETTER("UPS_LETTER"),
    USPS_FLAT_RATE_ENVELOPE("USPS_FLAT_RATE_ENVELOPE"),
    USPS_LARGE_PACK("USPS_LARGE_PACK"),
    VERY_LARGE_PACK("VERY_LARGE_PACK"),
    WINE_PAK("WINE_PAK");
    public final String value;
    PackageTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PackageTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "LETTER": return LETTER;
            case "BULKY_GOODS": return BULKY_GOODS;
            case "CARAVAN": return CARAVAN;
            case "CARS": return CARS;
            case "EUROPALLET": return EUROPALLET;
            case "EXPANDABLE_TOUGH_BAGS": return EXPANDABLE_TOUGH_BAGS;
            case "EXTRA_LARGE_PACK": return EXTRA_LARGE_PACK;
            case "FURNITURE": return FURNITURE;
            case "INDUSTRY_VEHICLES": return INDUSTRY_VEHICLES;
            case "LARGE_CANADA_POSTBOX": return LARGE_CANADA_POSTBOX;
            case "LARGE_CANADA_POST_BUBBLE_MAILER": return LARGE_CANADA_POST_BUBBLE_MAILER;
            case "LARGE_ENVELOPE": return LARGE_ENVELOPE;
            case "MAILING_BOX": return MAILING_BOX;
            case "MEDIUM_CANADA_POST_BOX": return MEDIUM_CANADA_POST_BOX;
            case "MEDIUM_CANADA_POST_BUBBLE_MAILER": return MEDIUM_CANADA_POST_BUBBLE_MAILER;
            case "MOTORBIKES": return MOTORBIKES;
            case "ONE_WAY_PALLET": return ONE_WAY_PALLET;
            case "PACKAGE_THICK_ENVELOPE": return PACKAGE_THICK_ENVELOPE;
            case "PADDED_BAGS": return PADDED_BAGS;
            case "PARCEL_OR_PADDED_ENVELOPE": return PARCEL_OR_PADDED_ENVELOPE;
            case "ROLL": return ROLL;
            case "SMALL_CANADA_POST_BOX": return SMALL_CANADA_POST_BOX;
            case "SMALL_CANADA_POST_BUBBLE_MAILER": return SMALL_CANADA_POST_BUBBLE_MAILER;
            case "TOUGH_BAGS": return TOUGH_BAGS;
            case "UPS_LETTER": return UPS_LETTER;
            case "USPS_FLAT_RATE_ENVELOPE": return USPS_FLAT_RATE_ENVELOPE;
            case "USPS_LARGE_PACK": return USPS_LARGE_PACK;
            case "VERY_LARGE_PACK": return VERY_LARGE_PACK;
            case "WINE_PAK": return WINE_PAK;
            default: return null;
        }
    }
}
