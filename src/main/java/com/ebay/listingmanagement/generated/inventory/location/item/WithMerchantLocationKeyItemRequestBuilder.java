package com.ebay.listingmanagement.generated.inventory.location.item;

import com.ebay.listingmanagement.generated.inventory.location.item.disable.DisableRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.location.item.enable.EnableRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.location.item.update_location_details.UpdateLocationDetailsRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.models.InventoryLocationFull;
import com.ebay.listingmanagement.generated.inventory.models.InventoryLocationResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /location/{merchantLocationKey}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithMerchantLocationKeyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The disable property
     * @return a {@link DisableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DisableRequestBuilder disable() {
        return new DisableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The enable property
     * @return a {@link EnableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EnableRequestBuilder enable() {
        return new EnableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_location_details property
     * @return a {@link UpdateLocationDetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateLocationDetailsRequestBuilder updateLocationDetails() {
        return new UpdateLocationDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithMerchantLocationKeyItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMerchantLocationKeyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/location/{merchantLocationKey}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithMerchantLocationKeyItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMerchantLocationKeyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/location/{merchantLocationKey}", rawUrl);
    }
    /**
     * &lt;p&gt;This call deletes the inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Note that deleting a location will not affect any active eBay listings associated with the deleted location, but the seller will not be able modify the offers associated with the location once it is deleted.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Deletion is not currently supported for fulfillment center locations, as location mappings will still be retained despite the location being deleted. Instead, fulfillment center locations should be disabled using the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/disableInventoryLocation&quot; target=&quot;_blank&quot;&gt;disableInventoryLocation&lt;/a&gt; method.&lt;/span&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     */
    public void delete() {
        delete(null);
    }
    /**
     * &lt;p&gt;This call deletes the inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Note that deleting a location will not affect any active eBay listings associated with the deleted location, but the seller will not be able modify the offers associated with the location once it is deleted.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Deletion is not currently supported for fulfillment center locations, as location mappings will still be retained despite the location being deleted. Instead, fulfillment center locations should be disabled using the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/disableInventoryLocation&quot; target=&quot;_blank&quot;&gt;disableInventoryLocation&lt;/a&gt; method.&lt;/span&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This call retrieves all defined details of the inventory location that is specified by the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter.&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     * @return a {@link InventoryLocationResponse}
     */
    @jakarta.annotation.Nullable
    public InventoryLocationResponse get() {
        return get(null);
    }
    /**
     * This call retrieves all defined details of the inventory location that is specified by the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter.&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InventoryLocationResponse}
     */
    @jakarta.annotation.Nullable
    public InventoryLocationResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, InventoryLocationResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;p&gt;Use this call to create a new inventory location. In order to create and publish an offer (and create an eBay listing), a seller must have at least one location, as every offer must be associated with at least one location.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#location &quot; target=&quot;_blank&quot;&gt;Location fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;p&gt;Upon first creating an inventory location, only a seller-defined location identifier and a physical location is required, and once set, these values can not be changed. The unique identifier value (&lt;i&gt;merchantLocationKey&lt;/i&gt;) is passed in at the end of the call URI. This &lt;i&gt;merchantLocationKey&lt;/i&gt; value will be used in other Inventory Location calls to identify the location to perform an action against.&lt;/p&gt;&lt;p&gt;When creating an inventory location, the &lt;b&gt;locationTypes&lt;/b&gt; can be specified to define the function of a location. At this time, the following &lt;b&gt;locationTypes&lt;/b&gt; are supported:&lt;ul&gt;&lt;li&gt;&lt;b&gt;Fulfillment center&lt;/b&gt; locations are used by sellers selling products through the Multi-warehouse program to get improved estimated delivery dates on their listings. A full address is required when creating a fulfillment center location, as well as the &lt;b&gt;fulfillmentCenterSpecifications&lt;/b&gt; of the location. For more information on using the fulfillment center location type to get improved delivery dates, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html&quot; target=&quot;_blank &quot;&gt;Multi-warehouse program&lt;/a&gt;.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Warehouse&lt;/b&gt; locations are used for traditional shipping. A full street address is not needed, but the &lt;b&gt;postalCode&lt;/b&gt; and &lt;b&gt;country&lt;/b&gt; OR &lt;b&gt;city&lt;/b&gt;, &lt;b&gt;stateOrProvince&lt;/b&gt;, and &lt;b&gt;country&lt;/b&gt; of the location must be provided.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Store&lt;/b&gt; locations are generally used by merchants selling product through the In-Store Pickup program. A full address is required when creating a store location.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;Note that all inventory locations are &quot;enabled&quot; by default when they are created, and you must specifically disable them (by passing in a value of &lt;code&gt;DISABLED&lt;/code&gt; in the &lt;strong&gt;merchantLocationStatus&lt;/strong&gt; field) if you want them to be set to the disabled state. The seller&apos;s inventory cannot be loaded to inventory locations in the disabled state.&lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;204 No Content&lt;/i&gt;.&lt;/p&gt;
     * @param body This type is used by the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call to provide details on the inventory location, including the location&apos;s name, physical address, operating hours, special hours, phone number and other details of an inventory location.
     */
    public void post(@jakarta.annotation.Nonnull final InventoryLocationFull body) {
        post(body, null);
    }
    /**
     * &lt;p&gt;Use this call to create a new inventory location. In order to create and publish an offer (and create an eBay listing), a seller must have at least one location, as every offer must be associated with at least one location.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#location &quot; target=&quot;_blank&quot;&gt;Location fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;p&gt;Upon first creating an inventory location, only a seller-defined location identifier and a physical location is required, and once set, these values can not be changed. The unique identifier value (&lt;i&gt;merchantLocationKey&lt;/i&gt;) is passed in at the end of the call URI. This &lt;i&gt;merchantLocationKey&lt;/i&gt; value will be used in other Inventory Location calls to identify the location to perform an action against.&lt;/p&gt;&lt;p&gt;When creating an inventory location, the &lt;b&gt;locationTypes&lt;/b&gt; can be specified to define the function of a location. At this time, the following &lt;b&gt;locationTypes&lt;/b&gt; are supported:&lt;ul&gt;&lt;li&gt;&lt;b&gt;Fulfillment center&lt;/b&gt; locations are used by sellers selling products through the Multi-warehouse program to get improved estimated delivery dates on their listings. A full address is required when creating a fulfillment center location, as well as the &lt;b&gt;fulfillmentCenterSpecifications&lt;/b&gt; of the location. For more information on using the fulfillment center location type to get improved delivery dates, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html&quot; target=&quot;_blank &quot;&gt;Multi-warehouse program&lt;/a&gt;.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Warehouse&lt;/b&gt; locations are used for traditional shipping. A full street address is not needed, but the &lt;b&gt;postalCode&lt;/b&gt; and &lt;b&gt;country&lt;/b&gt; OR &lt;b&gt;city&lt;/b&gt;, &lt;b&gt;stateOrProvince&lt;/b&gt;, and &lt;b&gt;country&lt;/b&gt; of the location must be provided.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Store&lt;/b&gt; locations are generally used by merchants selling product through the In-Store Pickup program. A full address is required when creating a store location.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;Note that all inventory locations are &quot;enabled&quot; by default when they are created, and you must specifically disable them (by passing in a value of &lt;code&gt;DISABLED&lt;/code&gt; in the &lt;strong&gt;merchantLocationStatus&lt;/strong&gt; field) if you want them to be set to the disabled state. The seller&apos;s inventory cannot be loaded to inventory locations in the disabled state.&lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;204 No Content&lt;/i&gt;.&lt;/p&gt;
     * @param body This type is used by the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call to provide details on the inventory location, including the location&apos;s name, physical address, operating hours, special hours, phone number and other details of an inventory location.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final InventoryLocationFull body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * &lt;p&gt;This call deletes the inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Note that deleting a location will not affect any active eBay listings associated with the deleted location, but the seller will not be able modify the offers associated with the location once it is deleted.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Deletion is not currently supported for fulfillment center locations, as location mappings will still be retained despite the location being deleted. Instead, fulfillment center locations should be disabled using the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/disableInventoryLocation&quot; target=&quot;_blank&quot;&gt;disableInventoryLocation&lt;/a&gt; method.&lt;/span&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * &lt;p&gt;This call deletes the inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Note that deleting a location will not affect any active eBay listings associated with the deleted location, but the seller will not be able modify the offers associated with the location once it is deleted.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Deletion is not currently supported for fulfillment center locations, as location mappings will still be retained despite the location being deleted. Instead, fulfillment center locations should be disabled using the &lt;a href=&quot;/api-docs/sell/inventory/resources/location/methods/disableInventoryLocation&quot; target=&quot;_blank&quot;&gt;disableInventoryLocation&lt;/a&gt; method.&lt;/span&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * This call retrieves all defined details of the inventory location that is specified by the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter.&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves all defined details of the inventory location that is specified by the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter.&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * &lt;p&gt;Use this call to create a new inventory location. In order to create and publish an offer (and create an eBay listing), a seller must have at least one location, as every offer must be associated with at least one location.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#location &quot; target=&quot;_blank&quot;&gt;Location fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;p&gt;Upon first creating an inventory location, only a seller-defined location identifier and a physical location is required, and once set, these values can not be changed. The unique identifier value (&lt;i&gt;merchantLocationKey&lt;/i&gt;) is passed in at the end of the call URI. This &lt;i&gt;merchantLocationKey&lt;/i&gt; value will be used in other Inventory Location calls to identify the location to perform an action against.&lt;/p&gt;&lt;p&gt;When creating an inventory location, the &lt;b&gt;locationTypes&lt;/b&gt; can be specified to define the function of a location. At this time, the following &lt;b&gt;locationTypes&lt;/b&gt; are supported:&lt;ul&gt;&lt;li&gt;&lt;b&gt;Fulfillment center&lt;/b&gt; locations are used by sellers selling products through the Multi-warehouse program to get improved estimated delivery dates on their listings. A full address is required when creating a fulfillment center location, as well as the &lt;b&gt;fulfillmentCenterSpecifications&lt;/b&gt; of the location. For more information on using the fulfillment center location type to get improved delivery dates, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html&quot; target=&quot;_blank &quot;&gt;Multi-warehouse program&lt;/a&gt;.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Warehouse&lt;/b&gt; locations are used for traditional shipping. A full street address is not needed, but the &lt;b&gt;postalCode&lt;/b&gt; and &lt;b&gt;country&lt;/b&gt; OR &lt;b&gt;city&lt;/b&gt;, &lt;b&gt;stateOrProvince&lt;/b&gt;, and &lt;b&gt;country&lt;/b&gt; of the location must be provided.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Store&lt;/b&gt; locations are generally used by merchants selling product through the In-Store Pickup program. A full address is required when creating a store location.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;Note that all inventory locations are &quot;enabled&quot; by default when they are created, and you must specifically disable them (by passing in a value of &lt;code&gt;DISABLED&lt;/code&gt; in the &lt;strong&gt;merchantLocationStatus&lt;/strong&gt; field) if you want them to be set to the disabled state. The seller&apos;s inventory cannot be loaded to inventory locations in the disabled state.&lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;204 No Content&lt;/i&gt;.&lt;/p&gt;
     * @param body This type is used by the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call to provide details on the inventory location, including the location&apos;s name, physical address, operating hours, special hours, phone number and other details of an inventory location.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InventoryLocationFull body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;p&gt;Use this call to create a new inventory location. In order to create and publish an offer (and create an eBay listing), a seller must have at least one location, as every offer must be associated with at least one location.&lt;/p&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;Publish offer note: Fields may be optional or conditionally required when calling this method, but become required when publishing the offer to create an active listing. For this method, see &lt;a href=&quot;/api-docs/sell/static/inventory/publishing-offers.html#location &quot; target=&quot;_blank&quot;&gt;Location fields&lt;/a&gt; for a list of fields required to publish an offer.&lt;/p&gt;&lt;/span&gt;&lt;/div&gt;&lt;p&gt;Upon first creating an inventory location, only a seller-defined location identifier and a physical location is required, and once set, these values can not be changed. The unique identifier value (&lt;i&gt;merchantLocationKey&lt;/i&gt;) is passed in at the end of the call URI. This &lt;i&gt;merchantLocationKey&lt;/i&gt; value will be used in other Inventory Location calls to identify the location to perform an action against.&lt;/p&gt;&lt;p&gt;When creating an inventory location, the &lt;b&gt;locationTypes&lt;/b&gt; can be specified to define the function of a location. At this time, the following &lt;b&gt;locationTypes&lt;/b&gt; are supported:&lt;ul&gt;&lt;li&gt;&lt;b&gt;Fulfillment center&lt;/b&gt; locations are used by sellers selling products through the Multi-warehouse program to get improved estimated delivery dates on their listings. A full address is required when creating a fulfillment center location, as well as the &lt;b&gt;fulfillmentCenterSpecifications&lt;/b&gt; of the location. For more information on using the fulfillment center location type to get improved delivery dates, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html&quot; target=&quot;_blank &quot;&gt;Multi-warehouse program&lt;/a&gt;.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Warehouse&lt;/b&gt; locations are used for traditional shipping. A full street address is not needed, but the &lt;b&gt;postalCode&lt;/b&gt; and &lt;b&gt;country&lt;/b&gt; OR &lt;b&gt;city&lt;/b&gt;, &lt;b&gt;stateOrProvince&lt;/b&gt;, and &lt;b&gt;country&lt;/b&gt; of the location must be provided.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Store&lt;/b&gt; locations are generally used by merchants selling product through the In-Store Pickup program. A full address is required when creating a store location.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;Note that all inventory locations are &quot;enabled&quot; by default when they are created, and you must specifically disable them (by passing in a value of &lt;code&gt;DISABLED&lt;/code&gt; in the &lt;strong&gt;merchantLocationStatus&lt;/strong&gt; field) if you want them to be set to the disabled state. The seller&apos;s inventory cannot be loaded to inventory locations in the disabled state.&lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;204 No Content&lt;/i&gt;.&lt;/p&gt;
     * @param body This type is used by the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call to provide details on the inventory location, including the location&apos;s name, physical address, operating hours, special hours, phone number and other details of an inventory location.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InventoryLocationFull body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithMerchantLocationKeyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithMerchantLocationKeyItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithMerchantLocationKeyItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
