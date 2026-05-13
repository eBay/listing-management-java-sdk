package com.ebay.listingmanagement.generated.inventory.listing.item.sku;

import com.ebay.listingmanagement.generated.inventory.listing.item.sku.item.WithSkuItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /listing/{listingId}/sku
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SkuRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmanagement.generated.inventory.listing.item.sku.item collection
     * @param sku This path parameter specifies the seller-defined SKU value of the item/variation for which location mappings will be retrieved. This SKU value must be defined in the listing specified in &lt;b&gt;listingId&lt;/b&gt; parameter&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/inventory/resources/offer/methods/getOffers&quot; target=&quot;_blank &quot;&gt;getOffers&lt;/a&gt; method of the &lt;b&gt;Inventory API&lt;/b&gt; or the &lt;a href=&quot;/devzone/xml/docs/reference/ebay/getmyebayselling.html&quot; target=&quot;_blank &quot;&gt;GetMyEbaySelling&lt;/a&gt; method of the &lt;b&gt;Trading API&lt;/b&gt; to retrieve all SKUs for all active listings.
     * @return a {@link WithSkuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSkuItemRequestBuilder bySku(@jakarta.annotation.Nonnull final String sku) {
        Objects.requireNonNull(sku);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sku", sku);
        return new WithSkuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SkuRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SkuRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/listing/{listingId}/sku", pathParameters);
    }
    /**
     * Instantiates a new {@link SkuRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SkuRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/listing/{listingId}/sku", rawUrl);
    }
}
