# eBay Listing Management Java SDK

A production-ready Java SDK for eBay Listing Management APIs, providing unified access to Inventory, Feed, Media, and Stores REST APIs plus GraphQL support.

## Features

- **Inventory API**: Inventory items, locations, offers, item groups, and bulk operations (36 operations)
- **Feed API**: Tasks, schedules, schedule templates, and bulk data feeds (23 operations)
- **Media API**: Documents, images, and videos (10 operations)
- **Stores API**: Store details, categories, and tasks (8 operations)
- **GraphQL Support**: Dynamic client for arbitrary GraphQL queries against the eBay Graph
- **Strong Typing**: Internal Kiota-generated types with public client wrappers
- **Per-call Overrides**: Pass per-request headers and access tokens alongside SDK-wide defaults

## Architecture

```
src/main/java/com/ebay/listingmanagement/
├── generated/                         # Kiota-generated REST clients (internal)
│   ├── inventory/
│   ├── feed/
│   ├── media/
│   └── stores/
├── clients/
│   ├── rest/
│   │   ├── InventoryClient.java       # REST client wrappers (public API)
│   │   ├── FeedClient.java
│   │   ├── MediaClient.java
│   │   └── StoresClient.java
│   └── graphql/
│       └── DynamicGraphQLClient.java  # GraphQL escape hatch
├── configuration/                     # SDK configuration and auth
├── exceptions/                        # SDK exceptions
└── ListingManagementClient.java       # Main SDK facade
```

## Requirements

- Java 17+
- Gradle

## Installation

```kotlin
dependencies {
    implementation("com.ebay:listing-management-java-sdk:0.2.0")
}
```

## Quick Start

```java
var config = new ListingManagementConfiguration();
config.setAccessToken("your-oauth-token");

try (var sdk = new ListingManagementClient(config)) {
    // Inventory
    var items = sdk.inventory.getInventoryItemsAsync("10", "0", null, null).join();

    // Feed
    var tasks = sdk.feed.getTasksAsync(null, null, "10", null, "0", null, null, null).join();

    // Media
    var image = sdk.media.getImageAsync("image-id", null, null).join();

    // Stores
    var store = sdk.stores.getStoreAsync(null, null).join();

    // GraphQL
    String query = "query { listing(id: $id) { title status } }";
    JsonNode data = sdk.graphQL.dynamic().executeRawUnsafe(query, Map.of("id", "123"), null, null);
}
```

Per-request headers and tokens can be passed to any method:

```java
var options = new RequestOptions();
options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

sdk.inventory.getInventoryItemsAsync("10", "0", "per-call-token", options).join();
```

## API Operations

### Inventory API

| Method | Description |
|---|---|
| `getInventoryItemAsync` | Get a specific inventory item by SKU |
| `createOrReplaceInventoryItemAsync` | Create or replace an inventory item |
| `deleteInventoryItemAsync` | Delete an inventory item |
| `getInventoryItemsAsync` | Get inventory items with pagination |
| `bulkGetInventoryItemAsync` | Bulk get inventory items |
| `bulkCreateOrReplaceInventoryItemAsync` | Bulk create or replace inventory items |
| `getInventoryItemGroupAsync` | Get an inventory item group |
| `createOrReplaceInventoryItemGroupAsync` | Create or replace an inventory item group |
| `deleteInventoryItemGroupAsync` | Delete an inventory item group |
| `getProductCompatibilityAsync` | Get product compatibility for an inventory item |
| `createOrReplaceProductCompatibilityAsync` | Create or replace product compatibility |
| `deleteProductCompatibilityAsync` | Delete product compatibility |
| `getSkuLocationMappingAsync` | Get SKU-to-location mapping |
| `createOrReplaceSkuLocationMappingAsync` | Create or replace SKU-to-location mapping |
| `deleteSkuLocationMappingAsync` | Delete SKU-to-location mapping |
| `getInventoryLocationAsync` | Get a specific inventory location |
| `getInventoryLocationsAsync` | Get inventory locations with pagination |
| `createInventoryLocationAsync` | Create an inventory location |
| `deleteInventoryLocationAsync` | Delete an inventory location |
| `updateInventoryLocationAsync` | Update inventory location details |
| `disableInventoryLocationAsync` | Disable an inventory location |
| `enableInventoryLocationAsync` | Enable an inventory location |
| `getOfferAsync` | Get a specific offer by ID |
| `getOffersAsync` | Get offers with filtering and pagination |
| `createOfferAsync` | Create an offer |
| `updateOfferAsync` | Update an offer |
| `deleteOfferAsync` | Delete an offer |
| `publishOfferAsync` | Publish an offer |
| `withdrawOfferAsync` | Withdraw an offer |
| `getListingFeesAsync` | Get listing fees for offers |
| `bulkCreateOfferAsync` | Bulk create offers |
| `bulkPublishOfferAsync` | Bulk publish offers |
| `publishOfferByInventoryItemGroupAsync` | Publish offer by inventory item group |
| `withdrawOfferByInventoryItemGroupAsync` | Withdraw offer by inventory item group |
| `bulkMigrateListingAsync` | Bulk migrate listings |
| `bulkUpdatePriceQuantityAsync` | Bulk update price and quantity |

### Feed API

| Method | Description |
|---|---|
| `getTasksAsync` | Get tasks by feed type or schedule ID |
| `getTaskAsync` | Get a specific task by ID |
| `createTaskAsync` | Create a new task |
| `getInputFileAsync` | Download the input file for a task |
| `getResultFileAsync` | Download the result file for a task |
| `uploadFileAsync` | Upload a file for a task |
| `getCustomerServiceMetricTasksAsync` | Get customer service metric tasks |
| `getCustomerServiceMetricTaskAsync` | Get a specific customer service metric task |
| `createCustomerServiceMetricTaskAsync` | Create a customer service metric task |
| `getInventoryTasksAsync` | Get inventory tasks |
| `getInventoryTaskAsync` | Get a specific inventory task |
| `createInventoryTaskAsync` | Create an inventory task |
| `getOrderTasksAsync` | Get order tasks |
| `getOrderTaskAsync` | Get a specific order task |
| `createOrderTaskAsync` | Create an order task |
| `getSchedulesAsync` | Get schedules with filtering and pagination |
| `getScheduleAsync` | Get a specific schedule |
| `createScheduleAsync` | Create a schedule |
| `updateScheduleAsync` | Update a schedule |
| `deleteScheduleAsync` | Delete a schedule |
| `getLatestResultFileAsync` | Download the latest result file for a schedule |
| `getScheduleTemplatesAsync` | Get schedule templates |
| `getScheduleTemplateAsync` | Get a specific schedule template |

### Media API

| Method | Description |
|---|---|
| `getDocumentAsync` | Get a document by ID |
| `createDocumentAsync` | Create a document |
| `createDocumentFromUrlAsync` | Create a document from a URL |
| `uploadDocumentAsync` | Upload a document |
| `getImageAsync` | Get an image by ID |
| `createImageFromFileAsync` | Create an image from a file |
| `createImageFromUrlAsync` | Create an image from a URL |
| `getVideoAsync` | Get a video by ID |
| `createVideoAsync` | Create a video |
| `uploadVideoAsync` | Upload a video |

### Stores API

| Method | Description |
|---|---|
| `getStoreAsync` | Get store details |
| `getStoreCategoriesAsync` | Get all store categories |
| `addStoreCategoryAsync` | Add a store category |
| `deleteStoreCategoryAsync` | Delete a store category |
| `renameStoreCategoryAsync` | Rename a store category |
| `moveStoreCategoryAsync` | Move a store category |
| `getStoreTasksAsync` | Get all store tasks |
| `getStoreTaskAsync` | Get a specific store task |

### GraphQL API

```java
String query = """
    query GetListing($id: ID!) {
      listing(id: $id) {
        title
        status
        price { value currency }
      }
    }
    """;

JsonNode data = sdk.graphQL.dynamic().executeRawUnsafe(query, Map.of("id", "listing-id"), null, null);
```

> **Warning:** Never interpolate user input directly into the query string — always pass dynamic values through `variables` to avoid GraphQL injection.

## Rate Limiting and Retry

The SDK does not include built-in retry logic or rate-limit handling. eBay's APIs return HTTP `429 Too Many Requests` when rate limits are exceeded.

If you call bulk endpoints (e.g., `bulkCreateOrReplaceInventoryItemAsync`, `bulkPublishOfferAsync`) in tight loops, you may hit these limits. Implement exponential back-off in your application layer:

```java
int attempt = 0;
while (attempt < 5) {
    try {
        return sdk.inventory.bulkCreateOrReplaceInventoryItemAsync(body, token, null).join();
    } catch (CompletionException ex) {
        if (isRateLimitError(ex) && ++attempt < 5) {
            Thread.sleep((long) Math.pow(2, attempt) * 1000);
        } else {
            throw ex;
        }
    }
}
```

Refer to [eBay's API call limits documentation](https://developer.ebay.com/support/api-call-limits) for per-endpoint rate limit details.

---

## Apollo GraphQL HTTP Cache

The `apollo-http-cache` dependency is included in this SDK. If you enable Apollo's HTTP cache in your application, GraphQL responses — which may include inventory details, pricing, and seller data — **will be written to the local filesystem**.

To prevent sensitive listing data from being persisted to disk, either:

1. **Do not enable the Apollo HTTP cache** (the default — no action needed if you have not explicitly configured it).
2. **If you do enable it**, restrict file permissions on the cache directory and exclude it from backups, log aggregation, and crash reporting pipelines.

---

## Error Handling

```java
try {
    var items = sdk.inventory.getInventoryItemsAsync("10", "0", null, null).join();
} catch (GraphQLException ex) {
    System.err.println("GraphQL errors: " + ex.getErrors());
} catch (ListingManagementException ex) {
    System.err.println("SDK error: " + ex.getMessage());
}
```

## Configuration Options

| Property | Default | Description |
|---|---|---|
| `inventoryBaseUrl` | `https://api.ebay.com/sell/inventory/v1` | Inventory API base URL |
| `feedBaseUrl` | `https://api.ebay.com/sell/feed/v1` | Feed API base URL |
| `mediaBaseUrl` | `https://apim.ebay.com/commerce/media/v1_beta` | Media API base URL |
| `storesBaseUrl` | `https://api.ebay.com/sell/stores/v1` | Stores API base URL |
| `graphQLBaseUrl` | `https://api.ebay.com/graphql` | GraphQL API endpoint |
| `accessToken` | `null` | Static fallback token; per-call token takes precedence |
| `defaultRequestOptions` | `RequestOptions()` | Default headers applied to all SDK calls |

## Regenerating the SDK

```bash
./generate.sh
./gradlew build
```

## Development

```bash
./gradlew build    # Build
./gradlew test     # Run tests
./gradlew publish  # Publish
```

## Specs

- `sell_inventory_v1_oas3.yaml` — Inventory V1
- `sell_feed_v1_oas3.yaml` — Feed V1
- `commerce_media_v1_beta_oas3.yaml` — Media V1 Beta
- `sell_stores_v1_oas3.yaml` — Stores V1
- `eBay_Graph.graphqls` — eBay Graph schema

## Dependencies

- **microsoft-kiota-bundle**: REST client generation and runtime
- **apollo-runtime**: Apollo Kotlin GraphQL client
- **okhttp3**: Shared HTTP client
- **jackson-databind**: JSON handling for the dynamic GraphQL client
- **kotlinx-coroutines-jdk8**: Kotlin coroutines / `CompletableFuture` integration
- **slf4j-api**: Logging facade

## License

Apache 2.0 © 2026 eBay Inc. See [LICENSE](LICENSE) for details.
