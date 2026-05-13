package com.ebay.listingmanagement.generated.inventory.listing.item.sku.item.locations;

import com.ebay.listingmanagement.generated.inventory.models.LocationMapping;
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
 * Builds and executes requests for operations under /listing/{listingId}/sku/{sku}/locations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LocationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link LocationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LocationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/listing/{listingId}/sku/{sku}/locations", pathParameters);
    }
    /**
     * Instantiates a new {@link LocationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LocationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/listing/{listingId}/sku/{sku}/locations", rawUrl);
    }
    /**
     * This method allows sellers to remove all location mappings associated with a specific SKU within a listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; of the listing are passed in as path parameters.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; To remove all location mappings from a multiple-variation listing, this method must be used for each individual SKU in the listing.&lt;/p&gt;&lt;/div&gt;
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method allows sellers to remove all location mappings associated with a specific SKU within a listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; of the listing are passed in as path parameters.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; To remove all location mappings from a multiple-variation listing, this method must be used for each individual SKU in the listing.&lt;/p&gt;&lt;/div&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method allows sellers to retrieve the locations mapped to a specific SKU within a listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; of the listing are passed in as path parameters. This method only retrieves location mappings for a single SKU value; if a seller wishes to retrieve the location mappings for all items in a multiple-variation listing, this method must be called for each variation in the listing.&lt;br&gt;&lt;br&gt;If there are fulfillment center locations mapped to the SKU, they will be returned in the &lt;b&gt;locations&lt;/b&gt; array. If no locations are mapped to the SKU, status code &lt;b&gt;404 Not Found&lt;/b&gt; will be returned.
     * @return a {@link LocationMapping}
     */
    @jakarta.annotation.Nullable
    public LocationMapping get() {
        return get(null);
    }
    /**
     * This method allows sellers to retrieve the locations mapped to a specific SKU within a listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; of the listing are passed in as path parameters. This method only retrieves location mappings for a single SKU value; if a seller wishes to retrieve the location mappings for all items in a multiple-variation listing, this method must be called for each variation in the listing.&lt;br&gt;&lt;br&gt;If there are fulfillment center locations mapped to the SKU, they will be returned in the &lt;b&gt;locations&lt;/b&gt; array. If no locations are mapped to the SKU, status code &lt;b&gt;404 Not Found&lt;/b&gt; will be returned.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LocationMapping}
     */
    @jakarta.annotation.Nullable
    public LocationMapping get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, LocationMapping::createFromDiscriminatorValue);
    }
    /**
     * This method allows sellers to map multiple fulfillment center locations to single-SKU listing, or to a single SKU within a multiple-variation listing. This allows eBay to leverage the location metadata associated with a sellers fulfillment centers to calculate more accurate estimated delivery dates on their listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; While location mappings can be created for listings on any eBay marketplace, the improved delivery date estimate feature is currently only supported for US-based fulfillment centers shipping domestically within the US.&lt;/span&gt;&lt;br&gt;The listing for which the locations will be mapped is specified through the &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; values associated with the item. Note that only a single SKU value can be identified; if the seller wishes to map locations to multiple/all SKU values in a multiple-variation listing, this method must be called for each of those SKUs within the listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of &lt;b&gt;listingId&lt;/b&gt;/&lt;b&gt;sku&lt;/b&gt; pairs that have been used for location mapping, as there is no programmatic way to retrieve or delete these pairs at this time.&lt;/span&gt;&lt;br&gt;In the case of replacing/updating existing location mappings, this method will do a complete replacement of the location mappings associated with a SKU. This means that each existing location mappings that the seller wants to continue to associate with the SKU are required in the update call, regardless of if they are affected by the update.&lt;br&gt;&lt;br&gt;This method is only supported for inventory locations that have &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt; as one of their &lt;b&gt;locationTypes&lt;/b&gt;. For more information on fulfillment center locations, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html#create-location&quot; target=&quot;_blank &quot;&gt;Create a fulfillment center location&lt;/a&gt;.&lt;br&gt;&lt;br&gt;For more information on location mapping features, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html&quot; target=&quot;_blank &quot;&gt;Multi-warehouse program&lt;/a&gt; in the Selling Integration Guide.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only listings with SKU values are supported. Sellers using listings creating through the Trading API can add a SKU value to their single variation listing through the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/AddFixedPriceItem.html#Request.Item.SKU&quot; target=&quot;_blank &quot;&gt;Item.SKU&lt;/a&gt; field during listing creation or by using the &lt;b&gt;ReviseItem&lt;/b&gt; family of calls.&lt;/span&gt;
     * @param body This type provides an array of locations that are associated with a SKU within a listing.
     */
    public void put(@jakarta.annotation.Nonnull final LocationMapping body) {
        put(body, null);
    }
    /**
     * This method allows sellers to map multiple fulfillment center locations to single-SKU listing, or to a single SKU within a multiple-variation listing. This allows eBay to leverage the location metadata associated with a sellers fulfillment centers to calculate more accurate estimated delivery dates on their listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; While location mappings can be created for listings on any eBay marketplace, the improved delivery date estimate feature is currently only supported for US-based fulfillment centers shipping domestically within the US.&lt;/span&gt;&lt;br&gt;The listing for which the locations will be mapped is specified through the &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; values associated with the item. Note that only a single SKU value can be identified; if the seller wishes to map locations to multiple/all SKU values in a multiple-variation listing, this method must be called for each of those SKUs within the listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of &lt;b&gt;listingId&lt;/b&gt;/&lt;b&gt;sku&lt;/b&gt; pairs that have been used for location mapping, as there is no programmatic way to retrieve or delete these pairs at this time.&lt;/span&gt;&lt;br&gt;In the case of replacing/updating existing location mappings, this method will do a complete replacement of the location mappings associated with a SKU. This means that each existing location mappings that the seller wants to continue to associate with the SKU are required in the update call, regardless of if they are affected by the update.&lt;br&gt;&lt;br&gt;This method is only supported for inventory locations that have &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt; as one of their &lt;b&gt;locationTypes&lt;/b&gt;. For more information on fulfillment center locations, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html#create-location&quot; target=&quot;_blank &quot;&gt;Create a fulfillment center location&lt;/a&gt;.&lt;br&gt;&lt;br&gt;For more information on location mapping features, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html&quot; target=&quot;_blank &quot;&gt;Multi-warehouse program&lt;/a&gt; in the Selling Integration Guide.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only listings with SKU values are supported. Sellers using listings creating through the Trading API can add a SKU value to their single variation listing through the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/AddFixedPriceItem.html#Request.Item.SKU&quot; target=&quot;_blank &quot;&gt;Item.SKU&lt;/a&gt; field during listing creation or by using the &lt;b&gt;ReviseItem&lt;/b&gt; family of calls.&lt;/span&gt;
     * @param body This type provides an array of locations that are associated with a SKU within a listing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void put(@jakarta.annotation.Nonnull final LocationMapping body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method allows sellers to remove all location mappings associated with a specific SKU within a listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; of the listing are passed in as path parameters.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; To remove all location mappings from a multiple-variation listing, this method must be used for each individual SKU in the listing.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method allows sellers to remove all location mappings associated with a specific SKU within a listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; of the listing are passed in as path parameters.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; To remove all location mappings from a multiple-variation listing, this method must be used for each individual SKU in the listing.&lt;/p&gt;&lt;/div&gt;
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
     * This method allows sellers to retrieve the locations mapped to a specific SKU within a listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; of the listing are passed in as path parameters. This method only retrieves location mappings for a single SKU value; if a seller wishes to retrieve the location mappings for all items in a multiple-variation listing, this method must be called for each variation in the listing.&lt;br&gt;&lt;br&gt;If there are fulfillment center locations mapped to the SKU, they will be returned in the &lt;b&gt;locations&lt;/b&gt; array. If no locations are mapped to the SKU, status code &lt;b&gt;404 Not Found&lt;/b&gt; will be returned.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method allows sellers to retrieve the locations mapped to a specific SKU within a listing.&lt;br&gt;&lt;br&gt;The &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; of the listing are passed in as path parameters. This method only retrieves location mappings for a single SKU value; if a seller wishes to retrieve the location mappings for all items in a multiple-variation listing, this method must be called for each variation in the listing.&lt;br&gt;&lt;br&gt;If there are fulfillment center locations mapped to the SKU, they will be returned in the &lt;b&gt;locations&lt;/b&gt; array. If no locations are mapped to the SKU, status code &lt;b&gt;404 Not Found&lt;/b&gt; will be returned.
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
     * This method allows sellers to map multiple fulfillment center locations to single-SKU listing, or to a single SKU within a multiple-variation listing. This allows eBay to leverage the location metadata associated with a sellers fulfillment centers to calculate more accurate estimated delivery dates on their listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; While location mappings can be created for listings on any eBay marketplace, the improved delivery date estimate feature is currently only supported for US-based fulfillment centers shipping domestically within the US.&lt;/span&gt;&lt;br&gt;The listing for which the locations will be mapped is specified through the &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; values associated with the item. Note that only a single SKU value can be identified; if the seller wishes to map locations to multiple/all SKU values in a multiple-variation listing, this method must be called for each of those SKUs within the listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of &lt;b&gt;listingId&lt;/b&gt;/&lt;b&gt;sku&lt;/b&gt; pairs that have been used for location mapping, as there is no programmatic way to retrieve or delete these pairs at this time.&lt;/span&gt;&lt;br&gt;In the case of replacing/updating existing location mappings, this method will do a complete replacement of the location mappings associated with a SKU. This means that each existing location mappings that the seller wants to continue to associate with the SKU are required in the update call, regardless of if they are affected by the update.&lt;br&gt;&lt;br&gt;This method is only supported for inventory locations that have &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt; as one of their &lt;b&gt;locationTypes&lt;/b&gt;. For more information on fulfillment center locations, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html#create-location&quot; target=&quot;_blank &quot;&gt;Create a fulfillment center location&lt;/a&gt;.&lt;br&gt;&lt;br&gt;For more information on location mapping features, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html&quot; target=&quot;_blank &quot;&gt;Multi-warehouse program&lt;/a&gt; in the Selling Integration Guide.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only listings with SKU values are supported. Sellers using listings creating through the Trading API can add a SKU value to their single variation listing through the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/AddFixedPriceItem.html#Request.Item.SKU&quot; target=&quot;_blank &quot;&gt;Item.SKU&lt;/a&gt; field during listing creation or by using the &lt;b&gt;ReviseItem&lt;/b&gt; family of calls.&lt;/span&gt;
     * @param body This type provides an array of locations that are associated with a SKU within a listing.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final LocationMapping body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method allows sellers to map multiple fulfillment center locations to single-SKU listing, or to a single SKU within a multiple-variation listing. This allows eBay to leverage the location metadata associated with a sellers fulfillment centers to calculate more accurate estimated delivery dates on their listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; While location mappings can be created for listings on any eBay marketplace, the improved delivery date estimate feature is currently only supported for US-based fulfillment centers shipping domestically within the US.&lt;/span&gt;&lt;br&gt;The listing for which the locations will be mapped is specified through the &lt;b&gt;listingId&lt;/b&gt; and &lt;b&gt;sku&lt;/b&gt; values associated with the item. Note that only a single SKU value can be identified; if the seller wishes to map locations to multiple/all SKU values in a multiple-variation listing, this method must be called for each of those SKUs within the listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of &lt;b&gt;listingId&lt;/b&gt;/&lt;b&gt;sku&lt;/b&gt; pairs that have been used for location mapping, as there is no programmatic way to retrieve or delete these pairs at this time.&lt;/span&gt;&lt;br&gt;In the case of replacing/updating existing location mappings, this method will do a complete replacement of the location mappings associated with a SKU. This means that each existing location mappings that the seller wants to continue to associate with the SKU are required in the update call, regardless of if they are affected by the update.&lt;br&gt;&lt;br&gt;This method is only supported for inventory locations that have &lt;code&gt;FULFILLMENT_CENTER&lt;/code&gt; as one of their &lt;b&gt;locationTypes&lt;/b&gt;. For more information on fulfillment center locations, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html#create-location&quot; target=&quot;_blank &quot;&gt;Create a fulfillment center location&lt;/a&gt;.&lt;br&gt;&lt;br&gt;For more information on location mapping features, see &lt;a href=&quot;/api-docs/sell/static/inventory/multi-warehouse-program.html&quot; target=&quot;_blank &quot;&gt;Multi-warehouse program&lt;/a&gt; in the Selling Integration Guide.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only listings with SKU values are supported. Sellers using listings creating through the Trading API can add a SKU value to their single variation listing through the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/AddFixedPriceItem.html#Request.Item.SKU&quot; target=&quot;_blank &quot;&gt;Item.SKU&lt;/a&gt; field during listing creation or by using the &lt;b&gt;ReviseItem&lt;/b&gt; family of calls.&lt;/span&gt;
     * @param body This type provides an array of locations that are associated with a SKU within a listing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final LocationMapping body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link LocationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LocationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LocationsRequestBuilder(rawUrl, requestAdapter);
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
