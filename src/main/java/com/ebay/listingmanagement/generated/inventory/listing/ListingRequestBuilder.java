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

package com.ebay.listingmanagement.generated.inventory.listing;

import com.ebay.listingmanagement.generated.inventory.listing.item.WithListingItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /listing
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListingRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.inventory.listing.item collection
     * @param listingId This path parameter specifies the unique identifier of the listing that the SKU belongs to for which all mapped locations will be retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/inventory_api#sell-inventory_api-offer-getoffers&quot; target=&quot;_blank &quot;&gt;getOffers&lt;/a&gt; method of the &lt;b&gt;Inventory API&lt;/b&gt; or the &lt;a href=&quot;/devzone/xml/docs/reference/ebay/getmyebayselling.html&quot; target=&quot;_blank &quot;&gt;GetMyEbaySelling&lt;/a&gt; method of the &lt;b&gt;Trading API&lt;/b&gt; to retrieve all listing IDs for all active listings.
     * @return a {@link WithListingItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithListingItemRequestBuilder byListingId(@jakarta.annotation.Nonnull final String listingId) {
        Objects.requireNonNull(listingId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("listingId", listingId);
        return new WithListingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ListingRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ListingRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/listing", pathParameters);
    }
    /**
     * Instantiates a new {@link ListingRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ListingRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/listing", rawUrl);
    }
}
