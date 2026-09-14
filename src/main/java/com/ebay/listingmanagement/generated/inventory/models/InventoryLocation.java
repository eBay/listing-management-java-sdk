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
 * This type is used by the &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call to update operating hours, special hours, phone number, and other minor details of an inventory location.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryLocation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is used to update information about a fulfillment center&apos;s shipping specifications, such as the weekly cut-off time schedule for order handling and any cut-off overrides.
     */
    private FulfillmentCenterSpecifications fulfillmentCenterSpecifications;
    /**
     * This container is used to add any addition physical address and geographical coordinate information for a warehouse, store, or fulfillment center inventory location.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For warehouse and store inventory locations, address fields can be updated any number of times. For fulfilment center locations, address fields cannot be updated. However, if any address fields were omitted during the &lt;b&gt;createInventoryLocation&lt;/b&gt; call, they can be added through this method.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When updating a warehouse location to a fulfillment center, sellers can update any of the address fields a single time during the same call used to make this update. After this, they can no longer be updated.&lt;/span&gt; 
     */
    private LocationDetails location;
    /**
     * This text field is used by the merchant to provide/update additional information about an inventory location. Whatever text is passed in this field will replace the current text string defined for this field. If the text will not change, the same text should be passed in once again. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 256
     */
    private String locationAdditionalInformation;
    /**
     * This text field is generally used by the merchant to provide/update special pickup instructions for a store inventory location. Although this field is optional, it is recommended that merchants provide this field to create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field is not included in the call request payload, eBay will use the default pickup instructions contained in the merchant&apos;s profile (if available). Whatever text is passed in this field will replace the current text string defined for this field. If the text will not change, the same text should be passed in once again. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 1000
     */
    private String locationInstructions;
    /**
     * This container is used to update the location type(s) associated with an inventory location.
     */
    private java.util.List<StoreTypeEnum> locationTypes;
    /**
     * This text field is used by the merchant to provide/update the Website address (URL) associated with the inventory location. The URL that is passed in this field will replace any other URL that may be defined for this field. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 512
     */
    private String locationWebUrl;
    /**
     * This text field is used by the merchant to update the name of the inventory location. This name should be a human-friendly name as it will be in In-Store Pickup and Click and Collect listings. A name is not required for warehouse locations. For store locations, this field is not immediately required, but will be required before an offer enabled with the In-Store Pickup or Click and Collect capability can be published. So, if the seller omitted this field in the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, it is required for an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call. The name that is passed in this field will replace any other name that may be defined for this field.
     */
    private String name;
    /**
     * This container is used to provide/update the regular operating hours for a store location during the days of the week. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field and an &lt;strong&gt;intervals&lt;/strong&gt; container will be needed for each day of the week that the location is open. Note that if operating hours are already set for a location for a specific day of the week, whatever is set through an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will override those existing hours.
     */
    private java.util.List<OperatingHours> operatingHours;
    /**
     * This text field is used by the merchant to provide/update the phone number for the inventory location. The phone number that is passed in this field will replace any other phone number that may be defined for this field. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 36
     */
    private String phone;
    /**
     * This container is used to provide/update the special operating hours for a store location on a specific date, such as a holiday. The special hours specified for the specific date will override the normal operating hours for that particular day of the week. If special hours have already been set up for an inventory location, specifying special hours through an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will only add to the list, unless the date(s) used are the same special date(s) already set up, in which case, the special hours set up through the &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will override the existing special hours.
     */
    private java.util.List<SpecialHours> specialHours;
    /**
     * This field is used to provide/update the time zone of the inventory location being created. This value should be in Olson format (for example &lt;code&gt;America/Vancouver&lt;/code&gt;). For supported values, see &lt;a href=&quot;https://howtodoinjava.com/java/date-time/supported-zone-ids-offsets/#3-java-supported-zone-ids-and-offsets&quot; target=&quot;_blank&quot;&gt;Java Supported Zone Ids and Offsets&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If specified, this time zone will be used for all hour related fields. If this field is not specified, the time zone will be calculated from the provided address fields.&lt;/span&gt;
     */
    private String timeZoneId;
    /**
     * Instantiates a new {@link InventoryLocation} and sets the default values.
     */
    public InventoryLocation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryLocation}
     */
    @jakarta.annotation.Nonnull
    public static InventoryLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryLocation();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("fulfillmentCenterSpecifications", (n) -> { this.setFulfillmentCenterSpecifications(n.getObjectValue(FulfillmentCenterSpecifications::createFromDiscriminatorValue)); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(LocationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("locationAdditionalInformation", (n) -> { this.setLocationAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("locationInstructions", (n) -> { this.setLocationInstructions(n.getStringValue()); });
        deserializerMap.put("locationTypes", (n) -> { this.setLocationTypes(n.getCollectionOfEnumValues(StoreTypeEnum::forValue)); });
        deserializerMap.put("locationWebUrl", (n) -> { this.setLocationWebUrl(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("operatingHours", (n) -> { this.setOperatingHours(n.getCollectionOfObjectValues(OperatingHours::createFromDiscriminatorValue)); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("specialHours", (n) -> { this.setSpecialHours(n.getCollectionOfObjectValues(SpecialHours::createFromDiscriminatorValue)); });
        deserializerMap.put("timeZoneId", (n) -> { this.setTimeZoneId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fulfillmentCenterSpecifications property value. This container is used to update information about a fulfillment center&apos;s shipping specifications, such as the weekly cut-off time schedule for order handling and any cut-off overrides.
     * @return a {@link FulfillmentCenterSpecifications}
     */
    @jakarta.annotation.Nullable
    public FulfillmentCenterSpecifications getFulfillmentCenterSpecifications() {
        return this.fulfillmentCenterSpecifications;
    }
    /**
     * Gets the location property value. This container is used to add any addition physical address and geographical coordinate information for a warehouse, store, or fulfillment center inventory location.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For warehouse and store inventory locations, address fields can be updated any number of times. For fulfilment center locations, address fields cannot be updated. However, if any address fields were omitted during the &lt;b&gt;createInventoryLocation&lt;/b&gt; call, they can be added through this method.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When updating a warehouse location to a fulfillment center, sellers can update any of the address fields a single time during the same call used to make this update. After this, they can no longer be updated.&lt;/span&gt; 
     * @return a {@link LocationDetails}
     */
    @jakarta.annotation.Nullable
    public LocationDetails getLocation() {
        return this.location;
    }
    /**
     * Gets the locationAdditionalInformation property value. This text field is used by the merchant to provide/update additional information about an inventory location. Whatever text is passed in this field will replace the current text string defined for this field. If the text will not change, the same text should be passed in once again. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 256
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationAdditionalInformation() {
        return this.locationAdditionalInformation;
    }
    /**
     * Gets the locationInstructions property value. This text field is generally used by the merchant to provide/update special pickup instructions for a store inventory location. Although this field is optional, it is recommended that merchants provide this field to create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field is not included in the call request payload, eBay will use the default pickup instructions contained in the merchant&apos;s profile (if available). Whatever text is passed in this field will replace the current text string defined for this field. If the text will not change, the same text should be passed in once again. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 1000
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationInstructions() {
        return this.locationInstructions;
    }
    /**
     * Gets the locationTypes property value. This container is used to update the location type(s) associated with an inventory location.
     * @return a {@link java.util.List<StoreTypeEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StoreTypeEnum> getLocationTypes() {
        return this.locationTypes;
    }
    /**
     * Gets the locationWebUrl property value. This text field is used by the merchant to provide/update the Website address (URL) associated with the inventory location. The URL that is passed in this field will replace any other URL that may be defined for this field. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 512
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationWebUrl() {
        return this.locationWebUrl;
    }
    /**
     * Gets the name property value. This text field is used by the merchant to update the name of the inventory location. This name should be a human-friendly name as it will be in In-Store Pickup and Click and Collect listings. A name is not required for warehouse locations. For store locations, this field is not immediately required, but will be required before an offer enabled with the In-Store Pickup or Click and Collect capability can be published. So, if the seller omitted this field in the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, it is required for an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call. The name that is passed in this field will replace any other name that may be defined for this field.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the operatingHours property value. This container is used to provide/update the regular operating hours for a store location during the days of the week. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field and an &lt;strong&gt;intervals&lt;/strong&gt; container will be needed for each day of the week that the location is open. Note that if operating hours are already set for a location for a specific day of the week, whatever is set through an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will override those existing hours.
     * @return a {@link java.util.List<OperatingHours>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OperatingHours> getOperatingHours() {
        return this.operatingHours;
    }
    /**
     * Gets the phone property value. This text field is used by the merchant to provide/update the phone number for the inventory location. The phone number that is passed in this field will replace any other phone number that may be defined for this field. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 36
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the specialHours property value. This container is used to provide/update the special operating hours for a store location on a specific date, such as a holiday. The special hours specified for the specific date will override the normal operating hours for that particular day of the week. If special hours have already been set up for an inventory location, specifying special hours through an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will only add to the list, unless the date(s) used are the same special date(s) already set up, in which case, the special hours set up through the &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will override the existing special hours.
     * @return a {@link java.util.List<SpecialHours>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SpecialHours> getSpecialHours() {
        return this.specialHours;
    }
    /**
     * Gets the timeZoneId property value. This field is used to provide/update the time zone of the inventory location being created. This value should be in Olson format (for example &lt;code&gt;America/Vancouver&lt;/code&gt;). For supported values, see &lt;a href=&quot;https://howtodoinjava.com/java/date-time/supported-zone-ids-offsets/#3-java-supported-zone-ids-and-offsets&quot; target=&quot;_blank&quot;&gt;Java Supported Zone Ids and Offsets&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If specified, this time zone will be used for all hour related fields. If this field is not specified, the time zone will be calculated from the provided address fields.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeZoneId() {
        return this.timeZoneId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("fulfillmentCenterSpecifications", this.getFulfillmentCenterSpecifications());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("locationAdditionalInformation", this.getLocationAdditionalInformation());
        writer.writeStringValue("locationInstructions", this.getLocationInstructions());
        writer.writeCollectionOfEnumValues("locationTypes", this.getLocationTypes());
        writer.writeStringValue("locationWebUrl", this.getLocationWebUrl());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("operatingHours", this.getOperatingHours());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeCollectionOfObjectValues("specialHours", this.getSpecialHours());
        writer.writeStringValue("timeZoneId", this.getTimeZoneId());
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
     * Sets the fulfillmentCenterSpecifications property value. This container is used to update information about a fulfillment center&apos;s shipping specifications, such as the weekly cut-off time schedule for order handling and any cut-off overrides.
     * @param value Value to set for the fulfillmentCenterSpecifications property.
     */
    public void setFulfillmentCenterSpecifications(@jakarta.annotation.Nullable final FulfillmentCenterSpecifications value) {
        this.fulfillmentCenterSpecifications = value;
    }
    /**
     * Sets the location property value. This container is used to add any addition physical address and geographical coordinate information for a warehouse, store, or fulfillment center inventory location.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For warehouse and store inventory locations, address fields can be updated any number of times. For fulfilment center locations, address fields cannot be updated. However, if any address fields were omitted during the &lt;b&gt;createInventoryLocation&lt;/b&gt; call, they can be added through this method.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When updating a warehouse location to a fulfillment center, sellers can update any of the address fields a single time during the same call used to make this update. After this, they can no longer be updated.&lt;/span&gt; 
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final LocationDetails value) {
        this.location = value;
    }
    /**
     * Sets the locationAdditionalInformation property value. This text field is used by the merchant to provide/update additional information about an inventory location. Whatever text is passed in this field will replace the current text string defined for this field. If the text will not change, the same text should be passed in once again. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 256
     * @param value Value to set for the locationAdditionalInformation property.
     */
    public void setLocationAdditionalInformation(@jakarta.annotation.Nullable final String value) {
        this.locationAdditionalInformation = value;
    }
    /**
     * Sets the locationInstructions property value. This text field is generally used by the merchant to provide/update special pickup instructions for a store inventory location. Although this field is optional, it is recommended that merchants provide this field to create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field is not included in the call request payload, eBay will use the default pickup instructions contained in the merchant&apos;s profile (if available). Whatever text is passed in this field will replace the current text string defined for this field. If the text will not change, the same text should be passed in once again. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 1000
     * @param value Value to set for the locationInstructions property.
     */
    public void setLocationInstructions(@jakarta.annotation.Nullable final String value) {
        this.locationInstructions = value;
    }
    /**
     * Sets the locationTypes property value. This container is used to update the location type(s) associated with an inventory location.
     * @param value Value to set for the locationTypes property.
     */
    public void setLocationTypes(@jakarta.annotation.Nullable final java.util.List<StoreTypeEnum> value) {
        this.locationTypes = value;
    }
    /**
     * Sets the locationWebUrl property value. This text field is used by the merchant to provide/update the Website address (URL) associated with the inventory location. The URL that is passed in this field will replace any other URL that may be defined for this field. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 512
     * @param value Value to set for the locationWebUrl property.
     */
    public void setLocationWebUrl(@jakarta.annotation.Nullable final String value) {
        this.locationWebUrl = value;
    }
    /**
     * Sets the name property value. This text field is used by the merchant to update the name of the inventory location. This name should be a human-friendly name as it will be in In-Store Pickup and Click and Collect listings. A name is not required for warehouse locations. For store locations, this field is not immediately required, but will be required before an offer enabled with the In-Store Pickup or Click and Collect capability can be published. So, if the seller omitted this field in the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, it is required for an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call. The name that is passed in this field will replace any other name that may be defined for this field.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the operatingHours property value. This container is used to provide/update the regular operating hours for a store location during the days of the week. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field and an &lt;strong&gt;intervals&lt;/strong&gt; container will be needed for each day of the week that the location is open. Note that if operating hours are already set for a location for a specific day of the week, whatever is set through an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will override those existing hours.
     * @param value Value to set for the operatingHours property.
     */
    public void setOperatingHours(@jakarta.annotation.Nullable final java.util.List<OperatingHours> value) {
        this.operatingHours = value;
    }
    /**
     * Sets the phone property value. This text field is used by the merchant to provide/update the phone number for the inventory location. The phone number that is passed in this field will replace any other phone number that may be defined for this field. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 36
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the specialHours property value. This container is used to provide/update the special operating hours for a store location on a specific date, such as a holiday. The special hours specified for the specific date will override the normal operating hours for that particular day of the week. If special hours have already been set up for an inventory location, specifying special hours through an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will only add to the list, unless the date(s) used are the same special date(s) already set up, in which case, the special hours set up through the &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will override the existing special hours.
     * @param value Value to set for the specialHours property.
     */
    public void setSpecialHours(@jakarta.annotation.Nullable final java.util.List<SpecialHours> value) {
        this.specialHours = value;
    }
    /**
     * Sets the timeZoneId property value. This field is used to provide/update the time zone of the inventory location being created. This value should be in Olson format (for example &lt;code&gt;America/Vancouver&lt;/code&gt;). For supported values, see &lt;a href=&quot;https://howtodoinjava.com/java/date-time/supported-zone-ids-offsets/#3-java-supported-zone-ids-and-offsets&quot; target=&quot;_blank&quot;&gt;Java Supported Zone Ids and Offsets&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If specified, this time zone will be used for all hour related fields. If this field is not specified, the time zone will be calculated from the provided address fields.&lt;/span&gt;
     * @param value Value to set for the timeZoneId property.
     */
    public void setTimeZoneId(@jakarta.annotation.Nullable final String value) {
        this.timeZoneId = value;
    }
}
