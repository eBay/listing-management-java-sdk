package com.ebay.listingmanagement.graphql.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Input type for sellerListings GraphQL query.
 */
public final class SellerListingsInput {
    private List<SellerListingInput> listings = new ArrayList<>();

    public SellerListingsInput() {}

    public SellerListingsInput(List<SellerListingInput> listings) {
        this.listings = listings;
    }

    public List<SellerListingInput> getListings() {
        return listings;
    }

    public void setListings(List<SellerListingInput> listings) {
        this.listings = listings;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        if (listings != null && !listings.isEmpty()) {
            map.put("listings", listings.stream()
                .map(SellerListingInput::toMap)
                .collect(Collectors.toList()));
        }
        return map;
    }
}
