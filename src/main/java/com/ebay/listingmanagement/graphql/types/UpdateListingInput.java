package com.ebay.listingmanagement.graphql.types;

import java.util.HashMap;
import java.util.Map;

/**
 * Input type for updateListing GraphQL mutation.
 * Accepts the full input payload as a raw Map due to the deeply nested structure.
 */
public final class UpdateListingInput {
    private Map<String, Object> data;

    public UpdateListingInput() {
        this.data = new HashMap<>();
    }

    public UpdateListingInput(Map<String, Object> data) {
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
