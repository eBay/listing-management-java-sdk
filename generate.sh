#!/bin/bash
set -e
echo "Generating Listing Management Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/listingmanagement/generated

echo "Generating Feed API client..."
kiota generate -l java -d specs/sell_feed_v1_oas3.yaml \
  -c FeedApiClient -n com.ebay.listingmanagement.generated.feed \
  -o src/main/java/com/ebay/listingmanagement/generated/feed --ebc --co

echo "Generating Inventory API client..."
kiota generate -l java -d specs/sell_inventory_v1_oas3.yaml \
  -c InventoryApiClient -n com.ebay.listingmanagement.generated.inventory \
  -o src/main/java/com/ebay/listingmanagement/generated/inventory --ebc --co

echo "Generating Media API client..."
kiota generate -l java -d specs/commerce_media_v1_beta_oas3.yaml \
  -c MediaApiClient -n com.ebay.listingmanagement.generated.media \
  -o src/main/java/com/ebay/listingmanagement/generated/media --ebc --co

echo "Generating Stores API client..."
kiota generate -l java -d specs/sell_stores_v1_oas3.yaml \
  -c StoresApiClient -n com.ebay.listingmanagement.generated.stores \
  -o src/main/java/com/ebay/listingmanagement/generated/stores --ebc --co

echo "Code generation complete!"
