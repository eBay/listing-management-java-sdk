# ChangeLog

## 2.0.0 (09/14/2026)

**Breaking changes**
- The following operations changed signature on `FeedClient`:
  - `getCustomerServiceMetricTasksAsync`: `(String, String, String, String, String, String, RequestOptions)` → `(String, String, Integer, Integer, Integer, String, RequestOptions)`
  - `getInventoryTasksAsync`: `(String, String, String, String, String, String, String, RequestOptions)` → `(String, String, Integer, String, Integer, Integer, String, RequestOptions)`
  - `getOrderTasksAsync`: `(String, String, String, String, String, String, String, RequestOptions)` → `(String, String, Integer, Integer, Integer, String, String, RequestOptions)`
  - `getSchedulesAsync`: `(String, String, String, String, RequestOptions)` → `(String, Integer, Integer, String, RequestOptions)`
  - `getScheduleTemplatesAsync`: `(String, String, String, String, RequestOptions)` → `(String, Integer, Integer, String, RequestOptions)`
  - `getTasksAsync`: `(String, String, String, String, String, String, String, RequestOptions)` → `(String, String, Integer, Integer, Integer, String, String, RequestOptions)`
- The following operations changed signature on `MediaClient`:
  - `uploadVideoAsync`: `(String videoId, InputStream body, String contentLength, String contentRange, String accessToken, RequestOptions requestOptions)` → `(String videoId, String contentLength, String contentRange, String accessToken, RequestOptions requestOptions)`

- The following operations were added to `MediaClient`:
  - `downloadPostOrderDocumentAsync`
  - `removePostOrderDocumentAsync`
  - `uploadPostOrderDocumentAsync`

## 1.0.0 (09/14/2026)

**Breaking changes**
- The following operations changed signature on `FeedClient`:
  - `createCustomerServiceMetricTaskAsync`: `(CreateServiceMetricsTaskRequest, String, RequestOptions)` → `(CreateServiceMetricsTaskRequest, String, String, RequestOptions)`
  - `createTaskAsync`: `(CreateTaskRequest, String, RequestOptions)` → `(CreateTaskRequest, String, String, String, RequestOptions)`
  - `uploadFileAsync`: `(String, String, RequestOptions)` → `(String, byte[], String, RequestOptions)`
- The following operations changed signature on `ListingGraphQLClient`:
  - `sellerListingSearchAsync`: `(String?)` → `(SellerActiveListingSearchInput?, SellerEndedListingSearchInput?, SellerScheduledListingSearchInput?, String?)`
- The following operations changed signature on `MediaClient`:
  - `createImageFromFileAsync`: `(String, RequestOptions)` → `(byte[], String, RequestOptions)`
  - `uploadDocumentAsync`: `(String, String, RequestOptions)` → `(String, byte[], String, RequestOptions)`
  - `uploadVideoAsync`: `(String, InputStream, String, RequestOptions)` → `(String, InputStream, String, String, String, RequestOptions)`

- The following operations were added to `ListingGraphQLClient`:
  - `listingPreviewsCreationTaskByIdAsync`
  - `startListingPreviewsCreationAsync`
  - `userSavedSearchesAsync`
  - `videosByIdsAsync`
