package com.ebay.listingmanagement.graphql.types;

import java.util.HashMap;
import java.util.Map;

/**
 * Input type for createListing GraphQL mutation.
 * Accepts the full input payload as a raw Map due to the deeply nested structure
 * (listingItems, listingTerms, product, marketplace, etc.).
 */
public final class CreateListingInput {
    private Map<String, Object> data;

    public CreateListingInput() {
        this.data = new HashMap<>();
    }

    public CreateListingInput(Map<String, Object> data) {
        this.data = data;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public Map<String, Object> toMap() {
        return data != null ? data : new HashMap<>();
    }
}
