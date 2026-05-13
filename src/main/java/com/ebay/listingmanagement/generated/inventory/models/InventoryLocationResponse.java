package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the base response of the &lt;strong&gt;getInventoryLocation&lt;/strong&gt; and &lt;strong&gt;getInventoryLocations&lt;/strong&gt; calls. These responses provide details about inventory location(s) defined for the merchant&apos;s account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryLocationResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to provide shipping specification details, such as the weekly cut-off schedule for order handling and cut-off override(s), for a fulfillment center location. 
     */
    private FulfillmentCenterSpecifications fulfillmentCenterSpecifications;
    /**
     * A complex type that is used to provide the physical address of a location, and it geo-coordinates.
     */
    private Location location;
    /**
     * This text field provides additional information about an inventory location. This field is returned if it is set for the location.
     */
    private String locationAdditionalInformation;
    /**
     * This text field is used by the merchant to provide special pickup instructions for the store location. This field can help create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field was not set up through a &lt;strong&gt;createInventoryLocation&lt;/strong&gt; or a &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call, eBay will use the default pickup instructions contained in the merchant&apos;s profile.
     */
    private String locationInstructions;
    /**
     * This container defines the function of the inventory location. Typically, a location will serve as a store, warehouse, or fulfillment center, but in some cases, an inventory location may be more than one type.
     */
    private java.util.List<String> locationTypes;
    /**
     * This text field shows the  Website address (URL) associated with the inventory location. This field is returned if defined for the location.
     */
    private String locationWebUrl;
    /**
     * The unique identifier of the inventory location. This identifier is set up by the merchant when the location is first created with the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call.
     */
    private String merchantLocationKey;
    /**
     * This field indicates whether the inventory location is enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). The merchant can use the &lt;strong&gt;enableInventoryLocation&lt;/strong&gt; call to enable a location in disabled status, or the &lt;strong&gt;disableInventoryLocation&lt;/strong&gt; call to disable a location in enabled status. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String merchantLocationStatus;
    /**
     * The name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. For store inventory locations, this field is not required for the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, but a store inventory location must have a defined &lt;strong&gt;name&lt;/strong&gt; value before an In-Store Pickup and Click and Collect enabled offer is published. So, if the seller omits this field in the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, it will have to be added later through a &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call.
     */
    private String name;
    /**
     * This container shows the regular operating hours for a store location during the days of the week. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field and an &lt;strong&gt;intervals&lt;/strong&gt; container is shown for each day of the week that the location is open.
     */
    private java.util.List<OperatingHours> operatingHours;
    /**
     * The phone number for an inventory location. This field will typically only be returned for store locations.
     */
    private String phone;
    /**
     * This container shows the special operating hours for a store or fulfillment center location on a specific date or dates.
     */
    private java.util.List<SpecialHours> specialHours;
    /**
     * This field specifies the time zone of the inventory location being created. This value should be in Olson format (for example &lt;code&gt;America/Vancouver&lt;/code&gt;). For supported values, see &lt;a href=&quot;https://howtodoinjava.com/java/date-time/supported-zone-ids-offsets/#3-java-supported-zone-ids-and-offsets&quot; target=&quot;_blank&quot;&gt;Java Supported Zone Ids and Offsets&lt;/a&gt;.
     */
    private String timeZoneId;
    /**
     * Instantiates a new {@link InventoryLocationResponse} and sets the default values.
     */
    public InventoryLocationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryLocationResponse}
     */
    @jakarta.annotation.Nonnull
    public static InventoryLocationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryLocationResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("fulfillmentCenterSpecifications", (n) -> { this.setFulfillmentCenterSpecifications(n.getObjectValue(FulfillmentCenterSpecifications::createFromDiscriminatorValue)); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("locationAdditionalInformation", (n) -> { this.setLocationAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("locationInstructions", (n) -> { this.setLocationInstructions(n.getStringValue()); });
        deserializerMap.put("locationTypes", (n) -> { this.setLocationTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("locationWebUrl", (n) -> { this.setLocationWebUrl(n.getStringValue()); });
        deserializerMap.put("merchantLocationKey", (n) -> { this.setMerchantLocationKey(n.getStringValue()); });
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
     * Gets the location property value. A complex type that is used to provide the physical address of a location, and it geo-coordinates.
     * @return a {@link Location}
     */
    @jakarta.annotation.Nullable
    public Location getLocation() {
        return this.location;
    }
    /**
     * Gets the locationAdditionalInformation property value. This text field provides additional information about an inventory location. This field is returned if it is set for the location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationAdditionalInformation() {
        return this.locationAdditionalInformation;
    }
    /**
     * Gets the locationInstructions property value. This text field is used by the merchant to provide special pickup instructions for the store location. This field can help create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field was not set up through a &lt;strong&gt;createInventoryLocation&lt;/strong&gt; or a &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call, eBay will use the default pickup instructions contained in the merchant&apos;s profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationInstructions() {
        return this.locationInstructions;
    }
    /**
     * Gets the locationTypes property value. This container defines the function of the inventory location. Typically, a location will serve as a store, warehouse, or fulfillment center, but in some cases, an inventory location may be more than one type.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLocationTypes() {
        return this.locationTypes;
    }
    /**
     * Gets the locationWebUrl property value. This text field shows the  Website address (URL) associated with the inventory location. This field is returned if defined for the location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationWebUrl() {
        return this.locationWebUrl;
    }
    /**
     * Gets the merchantLocationKey property value. The unique identifier of the inventory location. This identifier is set up by the merchant when the location is first created with the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMerchantLocationKey() {
        return this.merchantLocationKey;
    }
    /**
     * Gets the merchantLocationStatus property value. This field indicates whether the inventory location is enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). The merchant can use the &lt;strong&gt;enableInventoryLocation&lt;/strong&gt; call to enable a location in disabled status, or the &lt;strong&gt;disableInventoryLocation&lt;/strong&gt; call to disable a location in enabled status. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMerchantLocationStatus() {
        return this.merchantLocationStatus;
    }
    /**
     * Gets the name property value. The name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. For store inventory locations, this field is not required for the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, but a store inventory location must have a defined &lt;strong&gt;name&lt;/strong&gt; value before an In-Store Pickup and Click and Collect enabled offer is published. So, if the seller omits this field in the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, it will have to be added later through a &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the operatingHours property value. This container shows the regular operating hours for a store location during the days of the week. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field and an &lt;strong&gt;intervals&lt;/strong&gt; container is shown for each day of the week that the location is open.
     * @return a {@link java.util.List<OperatingHours>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OperatingHours> getOperatingHours() {
        return this.operatingHours;
    }
    /**
     * Gets the phone property value. The phone number for an inventory location. This field will typically only be returned for store locations.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the specialHours property value. This container shows the special operating hours for a store or fulfillment center location on a specific date or dates.
     * @return a {@link java.util.List<SpecialHours>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SpecialHours> getSpecialHours() {
        return this.specialHours;
    }
    /**
     * Gets the timeZoneId property value. This field specifies the time zone of the inventory location being created. This value should be in Olson format (for example &lt;code&gt;America/Vancouver&lt;/code&gt;). For supported values, see &lt;a href=&quot;https://howtodoinjava.com/java/date-time/supported-zone-ids-offsets/#3-java-supported-zone-ids-and-offsets&quot; target=&quot;_blank&quot;&gt;Java Supported Zone Ids and Offsets&lt;/a&gt;.
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
        writer.writeStringValue("merchantLocationKey", this.getMerchantLocationKey());
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
     * Sets the location property value. A complex type that is used to provide the physical address of a location, and it geo-coordinates.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final Location value) {
        this.location = value;
    }
    /**
     * Sets the locationAdditionalInformation property value. This text field provides additional information about an inventory location. This field is returned if it is set for the location.
     * @param value Value to set for the locationAdditionalInformation property.
     */
    public void setLocationAdditionalInformation(@jakarta.annotation.Nullable final String value) {
        this.locationAdditionalInformation = value;
    }
    /**
     * Sets the locationInstructions property value. This text field is used by the merchant to provide special pickup instructions for the store location. This field can help create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field was not set up through a &lt;strong&gt;createInventoryLocation&lt;/strong&gt; or a &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call, eBay will use the default pickup instructions contained in the merchant&apos;s profile.
     * @param value Value to set for the locationInstructions property.
     */
    public void setLocationInstructions(@jakarta.annotation.Nullable final String value) {
        this.locationInstructions = value;
    }
    /**
     * Sets the locationTypes property value. This container defines the function of the inventory location. Typically, a location will serve as a store, warehouse, or fulfillment center, but in some cases, an inventory location may be more than one type.
     * @param value Value to set for the locationTypes property.
     */
    public void setLocationTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.locationTypes = value;
    }
    /**
     * Sets the locationWebUrl property value. This text field shows the  Website address (URL) associated with the inventory location. This field is returned if defined for the location.
     * @param value Value to set for the locationWebUrl property.
     */
    public void setLocationWebUrl(@jakarta.annotation.Nullable final String value) {
        this.locationWebUrl = value;
    }
    /**
     * Sets the merchantLocationKey property value. The unique identifier of the inventory location. This identifier is set up by the merchant when the location is first created with the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call.
     * @param value Value to set for the merchantLocationKey property.
     */
    public void setMerchantLocationKey(@jakarta.annotation.Nullable final String value) {
        this.merchantLocationKey = value;
    }
    /**
     * Sets the merchantLocationStatus property value. This field indicates whether the inventory location is enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). The merchant can use the &lt;strong&gt;enableInventoryLocation&lt;/strong&gt; call to enable a location in disabled status, or the &lt;strong&gt;disableInventoryLocation&lt;/strong&gt; call to disable a location in enabled status. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the merchantLocationStatus property.
     */
    public void setMerchantLocationStatus(@jakarta.annotation.Nullable final String value) {
        this.merchantLocationStatus = value;
    }
    /**
     * Sets the name property value. The name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. For store inventory locations, this field is not required for the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, but a store inventory location must have a defined &lt;strong&gt;name&lt;/strong&gt; value before an In-Store Pickup and Click and Collect enabled offer is published. So, if the seller omits this field in the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, it will have to be added later through a &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the operatingHours property value. This container shows the regular operating hours for a store location during the days of the week. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field and an &lt;strong&gt;intervals&lt;/strong&gt; container is shown for each day of the week that the location is open.
     * @param value Value to set for the operatingHours property.
     */
    public void setOperatingHours(@jakarta.annotation.Nullable final java.util.List<OperatingHours> value) {
        this.operatingHours = value;
    }
    /**
     * Sets the phone property value. The phone number for an inventory location. This field will typically only be returned for store locations.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the specialHours property value. This container shows the special operating hours for a store or fulfillment center location on a specific date or dates.
     * @param value Value to set for the specialHours property.
     */
    public void setSpecialHours(@jakarta.annotation.Nullable final java.util.List<SpecialHours> value) {
        this.specialHours = value;
    }
    /**
     * Sets the timeZoneId property value. This field specifies the time zone of the inventory location being created. This value should be in Olson format (for example &lt;code&gt;America/Vancouver&lt;/code&gt;). For supported values, see &lt;a href=&quot;https://howtodoinjava.com/java/date-time/supported-zone-ids-offsets/#3-java-supported-zone-ids-and-offsets&quot; target=&quot;_blank&quot;&gt;Java Supported Zone Ids and Offsets&lt;/a&gt;.
     * @param value Value to set for the timeZoneId property.
     */
    public void setTimeZoneId(@jakarta.annotation.Nullable final String value) {
        this.timeZoneId = value;
    }
}
