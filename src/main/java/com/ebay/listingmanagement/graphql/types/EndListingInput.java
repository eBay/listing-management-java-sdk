package com.ebay.listingmanagement.graphql.types;

import java.util.HashMap;
import java.util.Map;

/**
 * Input type for endListing GraphQL mutation.
 */
public final class EndListingInput {
    private String endListingReason;
    private ListingIdentifierInput listingIdentifier;

    public EndListingInput() {}

    public EndListingInput(String endListingReason, ListingIdentifierInput listingIdentifier) {
        this.endListingReason = endListingReason;
        this.listingIdentifier = listingIdentifier;
    }

    public String getEndListingReason() {
        return endListingReason;
    }

    public void setEndListingReason(String endListingReason) {
        this.endListingReason = endListingReason;
    }

    public ListingIdentifierInput getListingIdentifier() {
        return listingIdentifier;
    }

    public void setListingIdentifier(ListingIdentifierInput listingIdentifier) {
        this.listingIdentifier = listingIdentifier;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        if (endListingReason != null) {
            map.put("endListingReason", endListingReason);
        }
        if (listingIdentifier != null) {
            map.put("listingIdentifier", listingIdentifier.toMap());
        }
        return map;
    }
}
