package com.ebay.listingmanagement.graphql.types;

import java.util.HashMap;
import java.util.Map;

/**
 * Input type for itemBiddingActivity GraphQL query.
 */
public final class ItemBiddingActivityInput {
    private String itemId;

    public ItemBiddingActivityInput() {}

    public ItemBiddingActivityInput(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        if (itemId != null) {
            map.put("itemId", itemId);
        }
        return map;
    }
}
