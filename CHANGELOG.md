# ChangeLog

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
