package com.ebay.listingmanagement.graphql.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Input type for bulkUpdateInventory GraphQL mutation.
 * The inventory array contains raw Map objects with updateInventoryInput fields.
 */
public final class BulkUpdateInventoryInput {
    private List<Map<String, Object>> inventory = new ArrayList<>();

    public BulkUpdateInventoryInput() {}

    public BulkUpdateInventoryInput(List<Map<String, Object>> inventory) {
        this.inventory = inventory;
    }

    public List<Map<String, Object>> getInventory() {
        return inventory;
    }

    public void setInventory(List<Map<String, Object>> inventory) {
        this.inventory = inventory;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        if (inventory != null) {
            map.put("inventory", inventory);
        }
        return map;
    }
}
