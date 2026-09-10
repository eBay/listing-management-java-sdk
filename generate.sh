#!/bin/bash
set -e
echo "Generating Listing Management Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/listingmanagement/generated

echo "Generating Feed API client..."
kiota generate -l java -d specs/openapi/feed.yaml \
  -c FeedApiClient -n com.ebay.listingmanagement.generated.feed \
  -o src/main/java/com/ebay/listingmanagement/generated/feed --ebc --co

echo "Generating Inventory API client..."
kiota generate -l java -d specs/openapi/inventory.yaml \
  -c InventoryApiClient -n com.ebay.listingmanagement.generated.inventory \
  -o src/main/java/com/ebay/listingmanagement/generated/inventory --ebc --co

echo "Generating Media API client..."
kiota generate -l java -d specs/openapi/media.yaml \
  -c MediaApiClient -n com.ebay.listingmanagement.generated.media \
  -o src/main/java/com/ebay/listingmanagement/generated/media --ebc --co

echo "Generating Stores API client..."
kiota generate -l java -d specs/openapi/stores.yaml \
  -c StoresApiClient -n com.ebay.listingmanagement.generated.stores \
  -o src/main/java/com/ebay/listingmanagement/generated/stores --ebc --co


echo "Adding license headers to generated files..."
./add-license-headers.sh ./src
echo "Code generation complete!"
