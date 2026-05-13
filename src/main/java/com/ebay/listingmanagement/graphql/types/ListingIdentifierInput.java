package com.ebay.listingmanagement.graphql.types;

import java.util.HashMap;
import java.util.Map;

/**
 * Input type for identifying a listing by listingId or sku.
 */
public final class ListingIdentifierInput {
    private String listingId;
    private String sku;

    public ListingIdentifierInput() {}

    public ListingIdentifierInput(String listingId, String sku) {
        this.listingId = listingId;
        this.sku = sku;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        if (listingId != null) {
            map.put("listingId", listingId);
        }
        if (sku != null) {
            map.put("sku", sku);
        }
        return map;
    }
}
