package com.ebay.listingmanagement.graphql.types;

import java.util.HashMap;
import java.util.Map;

/**
 * Input type for a single seller listing in SellerListingsInput.
 */
public final class SellerListingInput {
    private String listingId;

    public SellerListingInput() {}

    public SellerListingInput(String listingId) {
        this.listingId = listingId;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        if (listingId != null) {
            map.put("listingId", listingId);
        }
        return map;
    }
}
