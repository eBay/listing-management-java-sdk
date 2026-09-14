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

package com.ebay.listingmanagement.generated.inventory.location.item.update_location_details;

import com.ebay.listingmanagement.generated.inventory.models.Error;
import com.ebay.listingmanagement.generated.inventory.models.InventoryLocation;
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
 * Builds and executes requests for operations under /location/{merchantLocationKey}/update_location_details
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateLocationDetailsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateLocationDetailsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateLocationDetailsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/location/{merchantLocationKey}/update_location_details", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateLocationDetailsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateLocationDetailsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/location/{merchantLocationKey}/update_location_details", rawUrl);
    }
    /**
     * Use this call to update location details for an existing inventory location. Specify the inventory location you want to update using the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter. &lt;p&gt;You can update the following text-based fields: &lt;strong&gt;name&lt;/strong&gt;, &lt;strong&gt;phone&lt;/strong&gt;, &lt;strong&gt;timeZoneId&lt;/strong&gt;, &lt;strong&gt;geoCoordinates&lt;/strong&gt;, &lt;strong&gt;fulfillmentCenterSpecifications&lt;/strong&gt;, &lt;strong&gt;locationTypes&lt;/strong&gt;, &lt;strong&gt;locationWebUrl&lt;/strong&gt;, &lt;strong&gt;locationInstructions&lt;/strong&gt; and &lt;strong&gt;locationAdditionalInformation&lt;/strong&gt; any number of times for any location type.&lt;/p&gt; &lt;p&gt;For warehouse and store inventory locations, address fields can be updated any number of times. Address fields &lt;b&gt;cannot&lt;/b&gt; be updated for fulfillment center locations. However, if any address fields were omitted during the &lt;b&gt;createInventoryLocation&lt;/b&gt; call, they can be added through this method.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When updating a warehouse location to a fulfillment center, sellers can update any of the address fields a single time during the same call used to make this update. After this, they can no longer be updated.&lt;/span&gt;&lt;p&gt;For store locations, the operating hours and/or the special hours can also be updated.&lt;/p&gt;&lt;p&gt;Whatever text is passed in for these fields in an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will replace the current text strings defined for these fields.&lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occurs with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;code&gt;204 No Content&lt;/code&gt;.
     * @param body The inventory location details to be updated.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final InventoryLocation body) {
        post(body, null);
    }
    /**
     * Use this call to update location details for an existing inventory location. Specify the inventory location you want to update using the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter. &lt;p&gt;You can update the following text-based fields: &lt;strong&gt;name&lt;/strong&gt;, &lt;strong&gt;phone&lt;/strong&gt;, &lt;strong&gt;timeZoneId&lt;/strong&gt;, &lt;strong&gt;geoCoordinates&lt;/strong&gt;, &lt;strong&gt;fulfillmentCenterSpecifications&lt;/strong&gt;, &lt;strong&gt;locationTypes&lt;/strong&gt;, &lt;strong&gt;locationWebUrl&lt;/strong&gt;, &lt;strong&gt;locationInstructions&lt;/strong&gt; and &lt;strong&gt;locationAdditionalInformation&lt;/strong&gt; any number of times for any location type.&lt;/p&gt; &lt;p&gt;For warehouse and store inventory locations, address fields can be updated any number of times. Address fields &lt;b&gt;cannot&lt;/b&gt; be updated for fulfillment center locations. However, if any address fields were omitted during the &lt;b&gt;createInventoryLocation&lt;/b&gt; call, they can be added through this method.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When updating a warehouse location to a fulfillment center, sellers can update any of the address fields a single time during the same call used to make this update. After this, they can no longer be updated.&lt;/span&gt;&lt;p&gt;For store locations, the operating hours and/or the special hours can also be updated.&lt;/p&gt;&lt;p&gt;Whatever text is passed in for these fields in an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will replace the current text strings defined for these fields.&lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occurs with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;code&gt;204 No Content&lt;/code&gt;.
     * @param body The inventory location details to be updated.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final InventoryLocation body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Use this call to update location details for an existing inventory location. Specify the inventory location you want to update using the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter. &lt;p&gt;You can update the following text-based fields: &lt;strong&gt;name&lt;/strong&gt;, &lt;strong&gt;phone&lt;/strong&gt;, &lt;strong&gt;timeZoneId&lt;/strong&gt;, &lt;strong&gt;geoCoordinates&lt;/strong&gt;, &lt;strong&gt;fulfillmentCenterSpecifications&lt;/strong&gt;, &lt;strong&gt;locationTypes&lt;/strong&gt;, &lt;strong&gt;locationWebUrl&lt;/strong&gt;, &lt;strong&gt;locationInstructions&lt;/strong&gt; and &lt;strong&gt;locationAdditionalInformation&lt;/strong&gt; any number of times for any location type.&lt;/p&gt; &lt;p&gt;For warehouse and store inventory locations, address fields can be updated any number of times. Address fields &lt;b&gt;cannot&lt;/b&gt; be updated for fulfillment center locations. However, if any address fields were omitted during the &lt;b&gt;createInventoryLocation&lt;/b&gt; call, they can be added through this method.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When updating a warehouse location to a fulfillment center, sellers can update any of the address fields a single time during the same call used to make this update. After this, they can no longer be updated.&lt;/span&gt;&lt;p&gt;For store locations, the operating hours and/or the special hours can also be updated.&lt;/p&gt;&lt;p&gt;Whatever text is passed in for these fields in an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will replace the current text strings defined for these fields.&lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occurs with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;code&gt;204 No Content&lt;/code&gt;.
     * @param body The inventory location details to be updated.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InventoryLocation body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Use this call to update location details for an existing inventory location. Specify the inventory location you want to update using the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter. &lt;p&gt;You can update the following text-based fields: &lt;strong&gt;name&lt;/strong&gt;, &lt;strong&gt;phone&lt;/strong&gt;, &lt;strong&gt;timeZoneId&lt;/strong&gt;, &lt;strong&gt;geoCoordinates&lt;/strong&gt;, &lt;strong&gt;fulfillmentCenterSpecifications&lt;/strong&gt;, &lt;strong&gt;locationTypes&lt;/strong&gt;, &lt;strong&gt;locationWebUrl&lt;/strong&gt;, &lt;strong&gt;locationInstructions&lt;/strong&gt; and &lt;strong&gt;locationAdditionalInformation&lt;/strong&gt; any number of times for any location type.&lt;/p&gt; &lt;p&gt;For warehouse and store inventory locations, address fields can be updated any number of times. Address fields &lt;b&gt;cannot&lt;/b&gt; be updated for fulfillment center locations. However, if any address fields were omitted during the &lt;b&gt;createInventoryLocation&lt;/b&gt; call, they can be added through this method.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When updating a warehouse location to a fulfillment center, sellers can update any of the address fields a single time during the same call used to make this update. After this, they can no longer be updated.&lt;/span&gt;&lt;p&gt;For store locations, the operating hours and/or the special hours can also be updated.&lt;/p&gt;&lt;p&gt;Whatever text is passed in for these fields in an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will replace the current text strings defined for these fields.&lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occurs with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;code&gt;204 No Content&lt;/code&gt;.
     * @param body The inventory location details to be updated.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InventoryLocation body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdateLocationDetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateLocationDetailsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateLocationDetailsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
