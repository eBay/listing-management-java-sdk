package com.ebay.listingmanagement.generated.inventory.listing.item.sku.item;

import com.ebay.listingmanagement.generated.inventory.listing.item.sku.item.locations.LocationsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /listing/{listingId}/sku/{sku}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSkuItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The locations property
     * @return a {@link LocationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LocationsRequestBuilder locations() {
        return new LocationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithSkuItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSkuItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/listing/{listingId}/sku/{sku}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithSkuItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSkuItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/listing/{listingId}/sku/{sku}", rawUrl);
    }
}
