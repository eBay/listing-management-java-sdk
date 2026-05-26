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

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the &lt;strong&gt;listing&lt;/strong&gt; container in the &lt;strong&gt;getOffer&lt;/strong&gt; and &lt;strong&gt;getOffers&lt;/strong&gt; calls to provide the eBay listing ID, the listing status, and quantity sold for the offer. The &lt;strong&gt;listing&lt;/strong&gt; container is only returned for published offers, and is not returned for unpublished offers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListingDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the eBay listing that is associated with the published offer. 
     */
    private String listingId;
    /**
     * Indicates if a listing is on hold due to an eBay policy violation.&lt;br&gt;&lt;p&gt;If a listing is put on hold, users are unable to view the listing details, the listing is hidden from search, and all attempted purchases, offers, and bids for the listing are blocked. eBay, however, gives sellers the opportunity to address violations and get listings fully reinstated. A listing will be ended if a seller does not address a violation, or if the violation can not be rectified.&lt;/p&gt;&lt;br&gt;&lt;p&gt;If a listing is fixable, the seller should be able to view the listing details and this boolean will be returned as true.&lt;/p&gt;&lt;br&gt;&lt;p&gt;Once a listing is fixed, this boolean will no longer be returned.&lt;/p&gt;
     */
    private Boolean listingOnHold;
    /**
     * The enumeration value returned in this field indicates the status of the listing that is associated with the published offer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ListingStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String listingStatus;
    /**
     * This integer value indicates the quantity of the product that has been sold for the published offer.
     */
    private Integer soldQuantity;
    /**
     * Instantiates a new {@link ListingDetails} and sets the default values.
     */
    public ListingDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListingDetails}
     */
    @jakarta.annotation.Nonnull
    public static ListingDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListingDetails();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        deserializerMap.put("listingOnHold", (n) -> { this.setListingOnHold(n.getBooleanValue()); });
        deserializerMap.put("listingStatus", (n) -> { this.setListingStatus(n.getStringValue()); });
        deserializerMap.put("soldQuantity", (n) -> { this.setSoldQuantity(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingId property value. The unique identifier of the eBay listing that is associated with the published offer. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the listingOnHold property value. Indicates if a listing is on hold due to an eBay policy violation.&lt;br&gt;&lt;p&gt;If a listing is put on hold, users are unable to view the listing details, the listing is hidden from search, and all attempted purchases, offers, and bids for the listing are blocked. eBay, however, gives sellers the opportunity to address violations and get listings fully reinstated. A listing will be ended if a seller does not address a violation, or if the violation can not be rectified.&lt;/p&gt;&lt;br&gt;&lt;p&gt;If a listing is fixable, the seller should be able to view the listing details and this boolean will be returned as true.&lt;/p&gt;&lt;br&gt;&lt;p&gt;Once a listing is fixed, this boolean will no longer be returned.&lt;/p&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getListingOnHold() {
        return this.listingOnHold;
    }
    /**
     * Gets the listingStatus property value. The enumeration value returned in this field indicates the status of the listing that is associated with the published offer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ListingStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingStatus() {
        return this.listingStatus;
    }
    /**
     * Gets the soldQuantity property value. This integer value indicates the quantity of the product that has been sold for the published offer.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSoldQuantity() {
        return this.soldQuantity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("listingId", this.getListingId());
        writer.writeBooleanValue("listingOnHold", this.getListingOnHold());
        writer.writeStringValue("listingStatus", this.getListingStatus());
        writer.writeIntegerValue("soldQuantity", this.getSoldQuantity());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the listingId property value. The unique identifier of the eBay listing that is associated with the published offer. 
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the listingOnHold property value. Indicates if a listing is on hold due to an eBay policy violation.&lt;br&gt;&lt;p&gt;If a listing is put on hold, users are unable to view the listing details, the listing is hidden from search, and all attempted purchases, offers, and bids for the listing are blocked. eBay, however, gives sellers the opportunity to address violations and get listings fully reinstated. A listing will be ended if a seller does not address a violation, or if the violation can not be rectified.&lt;/p&gt;&lt;br&gt;&lt;p&gt;If a listing is fixable, the seller should be able to view the listing details and this boolean will be returned as true.&lt;/p&gt;&lt;br&gt;&lt;p&gt;Once a listing is fixed, this boolean will no longer be returned.&lt;/p&gt;
     * @param value Value to set for the listingOnHold property.
     */
    public void setListingOnHold(@jakarta.annotation.Nullable final Boolean value) {
        this.listingOnHold = value;
    }
    /**
     * Sets the listingStatus property value. The enumeration value returned in this field indicates the status of the listing that is associated with the published offer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ListingStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the listingStatus property.
     */
    public void setListingStatus(@jakarta.annotation.Nullable final String value) {
        this.listingStatus = value;
    }
    /**
     * Sets the soldQuantity property value. This integer value indicates the quantity of the product that has been sold for the published offer.
     * @param value Value to set for the soldQuantity property.
     */
    public void setSoldQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.soldQuantity = value;
    }
}
