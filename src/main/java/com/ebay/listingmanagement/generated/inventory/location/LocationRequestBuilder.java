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

package com.ebay.listingmanagement.generated.inventory.location;

import com.ebay.listingmanagement.generated.inventory.location.item.WithMerchantLocationKeyItemRequestBuilder;
import com.ebay.listingmanagement.generated.inventory.models.Error;
import com.ebay.listingmanagement.generated.inventory.models.LocationResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /location
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LocationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.inventory.location.item collection
     * @param merchantLocationKey This path parameter specifies the unique merchant-defined key (ID) for an inventory location that is being retrieved. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-location-getinventorylocations&quot;&gt;getInventoryLocations&lt;/a&gt; method to retrieve merchant location keys. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length&lt;/b&gt;: 36
     * @return a {@link WithMerchantLocationKeyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithMerchantLocationKeyItemRequestBuilder byMerchantLocationKey(@jakarta.annotation.Nonnull final String merchantLocationKey) {
        Objects.requireNonNull(merchantLocationKey);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("merchantLocationKey", merchantLocationKey);
        return new WithMerchantLocationKeyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link LocationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LocationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/location{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link LocationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LocationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/location{?limit*,offset*}", rawUrl);
    }
    /**
     * This call retrieves all defined details for every inventory location associated with the seller&apos;s account. There are no required parameters for this call and no request payload. However, there are two optional query parameters, &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt;. The &lt;strong&gt;limit&lt;/strong&gt; query parameter sets the maximum number of locations returned on one page of data, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter specifies the page of data to return. These query parameters are discussed more in the &lt;strong&gt;URI parameters&lt;/strong&gt; table below. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;br&gt;&lt;br&gt;A successful call will return an HTTP status value of &lt;code&gt;200 OK&lt;/code&gt;.
     * @return a {@link LocationResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public LocationResponse get() {
        return get(null);
    }
    /**
     * This call retrieves all defined details for every inventory location associated with the seller&apos;s account. There are no required parameters for this call and no request payload. However, there are two optional query parameters, &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt;. The &lt;strong&gt;limit&lt;/strong&gt; query parameter sets the maximum number of locations returned on one page of data, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter specifies the page of data to return. These query parameters are discussed more in the &lt;strong&gt;URI parameters&lt;/strong&gt; table below. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;br&gt;&lt;br&gt;A successful call will return an HTTP status value of &lt;code&gt;200 OK&lt;/code&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LocationResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public LocationResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LocationResponse::createFromDiscriminatorValue);
    }
    /**
     * This call retrieves all defined details for every inventory location associated with the seller&apos;s account. There are no required parameters for this call and no request payload. However, there are two optional query parameters, &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt;. The &lt;strong&gt;limit&lt;/strong&gt; query parameter sets the maximum number of locations returned on one page of data, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter specifies the page of data to return. These query parameters are discussed more in the &lt;strong&gt;URI parameters&lt;/strong&gt; table below. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;br&gt;&lt;br&gt;A successful call will return an HTTP status value of &lt;code&gt;200 OK&lt;/code&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves all defined details for every inventory location associated with the seller&apos;s account. There are no required parameters for this call and no request payload. However, there are two optional query parameters, &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt;. The &lt;strong&gt;limit&lt;/strong&gt; query parameter sets the maximum number of locations returned on one page of data, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter specifies the page of data to return. These query parameters are discussed more in the &lt;strong&gt;URI parameters&lt;/strong&gt; table below. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;br&gt;&lt;br&gt;A successful call will return an HTTP status value of &lt;code&gt;200 OK&lt;/code&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link LocationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LocationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LocationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This call retrieves all defined details for every inventory location associated with the seller&apos;s account. There are no required parameters for this call and no request payload. However, there are two optional query parameters, &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt;. The &lt;strong&gt;limit&lt;/strong&gt; query parameter sets the maximum number of locations returned on one page of data, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter specifies the page of data to return. These query parameters are discussed more in the &lt;strong&gt;URI parameters&lt;/strong&gt; table below. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;br&gt;&lt;br&gt;A successful call will return an HTTP status value of &lt;code&gt;200 OK&lt;/code&gt;.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The value passed in this query parameter sets the maximum number of records to return per page of data. Although this field is a string, the value passed in this field should be a positive integer value. If this query parameter is not set, up to 100 records will be returned on each page of results. &lt;br&gt;&lt;br&gt; &lt;strong&gt;Min&lt;/strong&gt;: 1
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * Specifies the number of locations to skip in the result set before returning the first location in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
