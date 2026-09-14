#!/usr/bin/env bash

# Copyright 2026 eBay Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -euo pipefail

echo "Generating Listing Management Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/listingmanagement/generated

echo "Generating FeedApiClient..."
kiota generate -l java -d specs/openapi/feed.json \
  -c FeedApiClient -n com.ebay.listingmanagement.generated.feed \
  -o src/main/java/com/ebay/listingmanagement/generated/feed --ebc --co

echo "Generating InventoryApiClient..."
kiota generate -l java -d specs/openapi/inventory.json \
  -c InventoryApiClient -n com.ebay.listingmanagement.generated.inventory \
  -o src/main/java/com/ebay/listingmanagement/generated/inventory --ebc --co

echo "Generating MediaApiClient..."
kiota generate -l java -d specs/openapi/media.json \
  -c MediaApiClient -n com.ebay.listingmanagement.generated.media \
  -o src/main/java/com/ebay/listingmanagement/generated/media --ebc --co

echo "Generating StoresApiClient..."
kiota generate -l java -d specs/openapi/stores.json \
  -c StoresApiClient -n com.ebay.listingmanagement.generated.stores \
  -o src/main/java/com/ebay/listingmanagement/generated/stores --ebc --co

echo "Adding license headers to generated files..."
./add-license-headers.sh ./src
echo "Code generation complete!"
