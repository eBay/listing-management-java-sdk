package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call to provide details on the inventory location, including the location&apos;s name, physical address, operating hours, special hours, phone number and other details of an inventory location.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryLocationFull implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to provide shipping specification details, such as the weekly cut-off schedule for order handling and cut-off override(s), for a fulfillment center location. 
     */
    private FulfillmentCenterSpecifications fulfillmentCenterSpecifications;
    /**
     * This type is used by the &lt;b&gt;createInventoryLocation&lt;/b&gt; call to provide an full or partial address of an inventory location.
     */
    private LocationDetails location;
    /**
     * This text field is used by the merchant to provide additional information about an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 256
     */
    private String locationAdditionalInformation;
    /**
     * This text field is generally used by the merchant to provide special pickup instructions for a store inventory location. Although this field is optional, it is recommended that merchants provide this field to create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field is not included in the call request payload, eBay will use the default pickup instructions contained in the merchant&apos;s profile (if available).
     */
    private String locationInstructions;
    /**
     * This container is used to define the function of the inventory location. Typically, an inventory location will serve as a store, warehouse, or fulfillment center, but in some cases, an inventory location may be more than one type.&lt;br&gt;&lt;br&gt;For In-Store Pickup inventory, set &lt;b&gt;StoreTypeEnum&lt;/b&gt; to &lt;code&gt;STORE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;To utilize the Multi-warehouse program, set &lt;b&gt;StoreTypeEnum&lt;/b&gt; to &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt;.&lt;br&gt;&lt;br&gt;If this container is omitted, the location type of the inventory location will default to &lt;code&gt;WAREHOUSE&lt;/code&gt;. See &lt;a href=&quot;/api-docs/sell/inventory/types/api:StoreTypeEnum&quot;&gt;StoreTypeEnum&lt;/a&gt; for the supported values.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;WAREHOUSE&lt;/code&gt;
     */
    private java.util.List<String> locationTypes;
    /**
     * This text field is used by the merchant to provide the Website address (URL) associated with the inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 512
     */
    private String locationWebUrl;
    /**
     * This field is used to indicate whether the inventory location will be enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). If this field is omitted, a successful &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call will automatically enable the location. A merchant may want to create a new location but leave it as disabled if the location is not yet ready for active inventory. Once the location is ready, the merchant can use the &lt;strong&gt;enableInventoryLocation&lt;/strong&gt; call to enable a location that is in a disabled state.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/inventory/types/api:StatusEnum&quot;&gt;StatusEnum&lt;/a&gt; for the supported values.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: ENABLED For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String merchantLocationStatus;
    /**
     * The seller-defined name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. A name is not required for warehouse locations. For store locations, this field is not immediately required, but will be required before an offer enabled with the In-Store Pickup or Click and Collect capability can be published. So, if the seller omits this field in a &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, it becomes required for an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 1000
     */
    private String name;
    /**
     * This container is used to express the regular operating hours for a store location during each day of the week. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field and an &lt;strong&gt;intervals&lt;/strong&gt; container will be needed for each day of the week that the store location is open.&lt;br&gt;&lt;br&gt;Although not technically required, this container is highly recommended to be used to specify operating hours for a store location.
     */
    private java.util.List<OperatingHours> operatingHours;
    /**
     * This field is used to specify the phone number for an inventory location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36
     */
    private String phone;
    /**
     * This container is used to express the special operating hours for a store inventory location on a specific date, such as a holiday. The special hours specified for the specific date will override the normal operating hours for that particular day of the week.
     */
    private java.util.List<SpecialHours> specialHours;
    /**
     * This field specifies the time zone of the inventory location being created. This value should be in Olson format (for example &lt;code&gt;America/Vancouver&lt;/code&gt;). For supported values, see &lt;a href=&quot;https://howtodoinjava.com/java/date-time/supported-zone-ids-offsets/#3-java-supported-zone-ids-and-offsets&quot; target=&quot;_blank&quot;&gt;Java Supported Zone Ids and Offsets&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If specified, this time zone will be used for all hour related fields. If this field is not specified for a fulfillment center location, the time zone will be calculated from the provided address fields.&lt;/span&gt;
     */
    private String timeZoneId;
    /**
     * Instantiates a new {@link InventoryLocationFull} and sets the default values.
     */
    public InventoryLocationFull() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryLocationFull}
     */
    @jakarta.annotation.Nonnull
    public static InventoryLocationFull createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryLocationFull();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("fulfillmentCenterSpecifications", (n) -> { this.setFulfillmentCenterSpecifications(n.getObjectValue(FulfillmentCenterSpecifications::createFromDiscriminatorValue)); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(LocationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("locationAdditionalInformation", (n) -> { this.setLocationAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("locationInstructions", (n) -> { this.setLocationInstructions(n.getStringValue()); });
        deserializerMap.put("locationTypes", (n) -> { this.setLocationTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("locationWebUrl", (n) -> { this.setLocationWebUrl(n.getStringValue()); });
        deserializerMap.put("merchantLocationStatus", (n) -> { this.setMerchantLocationStatus(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("operatingHours", (n) -> { this.setOperatingHours(n.getCollectionOfObjectValues(OperatingHours::createFromDiscriminatorValue)); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("specialHours", (n) -> { this.setSpecialHours(n.getCollectionOfObjectValues(SpecialHours::createFromDiscriminatorValue)); });
        deserializerMap.put("timeZoneId", (n) -> { this.setTimeZoneId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fulfillmentCenterSpecifications property value. This type is used to provide shipping specification details, such as the weekly cut-off schedule for order handling and cut-off override(s), for a fulfillment center location. 
     * @return a {@link FulfillmentCenterSpecifications}
     */
    @jakarta.annotation.Nullable
    public FulfillmentCenterSpecifications getFulfillmentCenterSpecifications() {
        return this.fulfillmentCenterSpecifications;
    }
    /**
     * Gets the location property value. This type is used by the &lt;b&gt;createInventoryLocation&lt;/b&gt; call to provide an full or partial address of an inventory location.
     * @return a {@link LocationDetails}
     */
    @jakarta.annotation.Nullable
    public LocationDetails getLocation() {
        return this.location;
    }
    /**
     * Gets the locationAdditionalInformation property value. This text field is used by the merchant to provide additional information about an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 256
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationAdditionalInformation() {
        return this.locationAdditionalInformation;
    }
    /**
     * Gets the locationInstructions property value. This text field is generally used by the merchant to provide special pickup instructions for a store inventory location. Although this field is optional, it is recommended that merchants provide this field to create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field is not included in the call request payload, eBay will use the default pickup instructions contained in the merchant&apos;s profile (if available).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationInstructions() {
        return this.locationInstructions;
    }
    /**
     * Gets the locationTypes property value. This container is used to define the function of the inventory location. Typically, an inventory location will serve as a store, warehouse, or fulfillment center, but in some cases, an inventory location may be more than one type.&lt;br&gt;&lt;br&gt;For In-Store Pickup inventory, set &lt;b&gt;StoreTypeEnum&lt;/b&gt; to &lt;code&gt;STORE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;To utilize the Multi-warehouse program, set &lt;b&gt;StoreTypeEnum&lt;/b&gt; to &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt;.&lt;br&gt;&lt;br&gt;If this container is omitted, the location type of the inventory location will default to &lt;code&gt;WAREHOUSE&lt;/code&gt;. See &lt;a href=&quot;/api-docs/sell/inventory/types/api:StoreTypeEnum&quot;&gt;StoreTypeEnum&lt;/a&gt; for the supported values.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;WAREHOUSE&lt;/code&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLocationTypes() {
        return this.locationTypes;
    }
    /**
     * Gets the locationWebUrl property value. This text field is used by the merchant to provide the Website address (URL) associated with the inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 512
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationWebUrl() {
        return this.locationWebUrl;
    }
    /**
     * Gets the merchantLocationStatus property value. This field is used to indicate whether the inventory location will be enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). If this field is omitted, a successful &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call will automatically enable the location. A merchant may want to create a new location but leave it as disabled if the location is not yet ready for active inventory. Once the location is ready, the merchant can use the &lt;strong&gt;enableInventoryLocation&lt;/strong&gt; call to enable a location that is in a disabled state.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/inventory/types/api:StatusEnum&quot;&gt;StatusEnum&lt;/a&gt; for the supported values.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: ENABLED For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMerchantLocationStatus() {
        return this.merchantLocationStatus;
    }
    /**
     * Gets the name property value. The seller-defined name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. A name is not required for warehouse locations. For store locations, this field is not immediately required, but will be required before an offer enabled with the In-Store Pickup or Click and Collect capability can be published. So, if the seller omits this field in a &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, it becomes required for an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 1000
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the operatingHours property value. This container is used to express the regular operating hours for a store location during each day of the week. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field and an &lt;strong&gt;intervals&lt;/strong&gt; container will be needed for each day of the week that the store location is open.&lt;br&gt;&lt;br&gt;Although not technically required, this container is highly recommended to be used to specify operating hours for a store location.
     * @return a {@link java.util.List<OperatingHours>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OperatingHours> getOperatingHours() {
        return this.operatingHours;
    }
    /**
     * Gets the phone property value. This field is used to specify the phone number for an inventory location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the specialHours property value. This container is used to express the special operating hours for a store inventory location on a specific date, such as a holiday. The special hours specified for the specific date will override the normal operating hours for that particular day of the week.
     * @return a {@link java.util.List<SpecialHours>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SpecialHours> getSpecialHours() {
        return this.specialHours;
    }
    /**
     * Gets the timeZoneId property value. This field specifies the time zone of the inventory location being created. This value should be in Olson format (for example &lt;code&gt;America/Vancouver&lt;/code&gt;). For supported values, see &lt;a href=&quot;https://howtodoinjava.com/java/date-time/supported-zone-ids-offsets/#3-java-supported-zone-ids-and-offsets&quot; target=&quot;_blank&quot;&gt;Java Supported Zone Ids and Offsets&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If specified, this time zone will be used for all hour related fields. If this field is not specified for a fulfillment center location, the time zone will be calculated from the provided address fields.&lt;/span&gt;
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
        writer.writeCollectionOfPrimitiveValues("locationTypes", this.getLocationTypes());
        writer.writeStringValue("locationWebUrl", this.getLocationWebUrl());
        writer.writeStringValue("merchantLocationStatus", this.getMerchantLocationStatus());
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
     * Sets the fulfillmentCenterSpecifications property value. This type is used to provide shipping specification details, such as the weekly cut-off schedule for order handling and cut-off override(s), for a fulfillment center location. 
     * @param value Value to set for the fulfillmentCenterSpecifications property.
     */
    public void setFulfillmentCenterSpecifications(@jakarta.annotation.Nullable final FulfillmentCenterSpecifications value) {
        this.fulfillmentCenterSpecifications = value;
    }
    /**
     * Sets the location property value. This type is used by the &lt;b&gt;createInventoryLocation&lt;/b&gt; call to provide an full or partial address of an inventory location.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final LocationDetails value) {
        this.location = value;
    }
    /**
     * Sets the locationAdditionalInformation property value. This text field is used by the merchant to provide additional information about an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 256
     * @param value Value to set for the locationAdditionalInformation property.
     */
    public void setLocationAdditionalInformation(@jakarta.annotation.Nullable final String value) {
        this.locationAdditionalInformation = value;
    }
    /**
     * Sets the locationInstructions property value. This text field is generally used by the merchant to provide special pickup instructions for a store inventory location. Although this field is optional, it is recommended that merchants provide this field to create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field is not included in the call request payload, eBay will use the default pickup instructions contained in the merchant&apos;s profile (if available).
     * @param value Value to set for the locationInstructions property.
     */
    public void setLocationInstructions(@jakarta.annotation.Nullable final String value) {
        this.locationInstructions = value;
    }
    /**
     * Sets the locationTypes property value. This container is used to define the function of the inventory location. Typically, an inventory location will serve as a store, warehouse, or fulfillment center, but in some cases, an inventory location may be more than one type.&lt;br&gt;&lt;br&gt;For In-Store Pickup inventory, set &lt;b&gt;StoreTypeEnum&lt;/b&gt; to &lt;code&gt;STORE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;To utilize the Multi-warehouse program, set &lt;b&gt;StoreTypeEnum&lt;/b&gt; to &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt;.&lt;br&gt;&lt;br&gt;If this container is omitted, the location type of the inventory location will default to &lt;code&gt;WAREHOUSE&lt;/code&gt;. See &lt;a href=&quot;/api-docs/sell/inventory/types/api:StoreTypeEnum&quot;&gt;StoreTypeEnum&lt;/a&gt; for the supported values.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;WAREHOUSE&lt;/code&gt;
     * @param value Value to set for the locationTypes property.
     */
    public void setLocationTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.locationTypes = value;
    }
    /**
     * Sets the locationWebUrl property value. This text field is used by the merchant to provide the Website address (URL) associated with the inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 512
     * @param value Value to set for the locationWebUrl property.
     */
    public void setLocationWebUrl(@jakarta.annotation.Nullable final String value) {
        this.locationWebUrl = value;
    }
    /**
     * Sets the merchantLocationStatus property value. This field is used to indicate whether the inventory location will be enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). If this field is omitted, a successful &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call will automatically enable the location. A merchant may want to create a new location but leave it as disabled if the location is not yet ready for active inventory. Once the location is ready, the merchant can use the &lt;strong&gt;enableInventoryLocation&lt;/strong&gt; call to enable a location that is in a disabled state.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/inventory/types/api:StatusEnum&quot;&gt;StatusEnum&lt;/a&gt; for the supported values.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: ENABLED For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the merchantLocationStatus property.
     */
    public void setMerchantLocationStatus(@jakarta.annotation.Nullable final String value) {
        this.merchantLocationStatus = value;
    }
    /**
     * Sets the name property value. The seller-defined name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. A name is not required for warehouse locations. For store locations, this field is not immediately required, but will be required before an offer enabled with the In-Store Pickup or Click and Collect capability can be published. So, if the seller omits this field in a &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, it becomes required for an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 1000
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the operatingHours property value. This container is used to express the regular operating hours for a store location during each day of the week. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field and an &lt;strong&gt;intervals&lt;/strong&gt; container will be needed for each day of the week that the store location is open.&lt;br&gt;&lt;br&gt;Although not technically required, this container is highly recommended to be used to specify operating hours for a store location.
     * @param value Value to set for the operatingHours property.
     */
    public void setOperatingHours(@jakarta.annotation.Nullable final java.util.List<OperatingHours> value) {
        this.operatingHours = value;
    }
    /**
     * Sets the phone property value. This field is used to specify the phone number for an inventory location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the specialHours property value. This container is used to express the special operating hours for a store inventory location on a specific date, such as a holiday. The special hours specified for the specific date will override the normal operating hours for that particular day of the week.
     * @param value Value to set for the specialHours property.
     */
    public void setSpecialHours(@jakarta.annotation.Nullable final java.util.List<SpecialHours> value) {
        this.specialHours = value;
    }
    /**
     * Sets the timeZoneId property value. This field specifies the time zone of the inventory location being created. This value should be in Olson format (for example &lt;code&gt;America/Vancouver&lt;/code&gt;). For supported values, see &lt;a href=&quot;https://howtodoinjava.com/java/date-time/supported-zone-ids-offsets/#3-java-supported-zone-ids-and-offsets&quot; target=&quot;_blank&quot;&gt;Java Supported Zone Ids and Offsets&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If specified, this time zone will be used for all hour related fields. If this field is not specified for a fulfillment center location, the time zone will be calculated from the provided address fields.&lt;/span&gt;
     * @param value Value to set for the timeZoneId property.
     */
    public void setTimeZoneId(@jakarta.annotation.Nullable final String value) {
        this.timeZoneId = value;
    }
}
