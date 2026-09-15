# ChangeLog

## 0.2.0 (09/14/2026)

### Breaking changes

#### Changed signatures

`FeedClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `createCustomerServiceMetricTaskAsync` | `(CreateServiceMetricsTaskRequest body, String accessToken, RequestOptions requestOptions)` | `(CreateServiceMetricsTaskRequest body, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `createTaskAsync` | `(CreateTaskRequest body, String accessToken, RequestOptions requestOptions)` | `(CreateTaskRequest body, String xEBAYCMARKETPLACEID, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `uploadFileAsync` | `(String taskId, String accessToken, RequestOptions requestOptions)` | `(String taskId, byte[] body, String accessToken, RequestOptions requestOptions)` |
| `getCustomerServiceMetricTasksAsync` | `(String dateRange, String feedType, String limit, String lookBackDays, String offset, String accessToken, RequestOptions requestOptions)` | `(String dateRange, String feedType, Integer limit, Integer lookBackDays, Integer offset, String accessToken, RequestOptions requestOptions)` |
| `getInventoryTasksAsync` | `(String feedType, String scheduleId, String lookBackDays, String dateRange, String limit, String offset, String accessToken, RequestOptions requestOptions)` | `(String feedType, String scheduleId, Integer lookBackDays, String dateRange, Integer limit, Integer offset, String accessToken, RequestOptions requestOptions)` |
| `getOrderTasksAsync` | `(String dateRange, String feedType, String limit, String lookBackDays, String offset, String scheduleId, String accessToken, RequestOptions requestOptions)` | `(String dateRange, String feedType, Integer limit, Integer lookBackDays, Integer offset, String scheduleId, String accessToken, RequestOptions requestOptions)` |
| `getSchedulesAsync` | `(String feedType, String limit, String offset, String accessToken, RequestOptions requestOptions)` | `(String feedType, Integer limit, Integer offset, String accessToken, RequestOptions requestOptions)` |
| `getScheduleTemplatesAsync` | `(String feedType, String limit, String offset, String accessToken, RequestOptions requestOptions)` | `(String feedType, Integer limit, Integer offset, String accessToken, RequestOptions requestOptions)` |
| `getTasksAsync` | `(String dateRange, String feedType, String limit, String lookBackDays, String offset, String scheduleId, String accessToken, RequestOptions requestOptions)` | `(String dateRange, String feedType, Integer limit, Integer lookBackDays, Integer offset, String scheduleId, String accessToken, RequestOptions requestOptions)` |

`ListingGraphQLClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `sellerListingSearchAsync` | `(String? accessToken)` | `(SellerActiveListingSearchInput? activeListings_searchInput, SellerEndedListingSearchInput? endedListings_searchInput, SellerScheduledListingSearchInput? scheduledListings_searchInput, String? accessToken)` |

`MediaClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `createImageFromFileAsync` | `(String accessToken, RequestOptions requestOptions)` | `(byte[] body, String accessToken, RequestOptions requestOptions)` |
| `uploadDocumentAsync` | `(String documentId, String accessToken, RequestOptions requestOptions)` | `(String documentId, byte[] body, String accessToken, RequestOptions requestOptions)` |
| `uploadVideoAsync` | `(String videoId, InputStream body, String accessToken, RequestOptions requestOptions)` | `(String videoId, String contentLength, String contentRange, String accessToken, RequestOptions requestOptions)` |

### Added

#### `ListingGraphQLClient`

- `listingPreviewsCreationTaskByIdAsync`
- `startListingPreviewsCreationAsync`
- `userSavedSearchesAsync`
- `videosByIdsAsync`
#### `MediaClient`

- `downloadPostOrderDocumentAsync`
- `removePostOrderDocumentAsync`
- `uploadPostOrderDocumentAsync`

### Fixed

- `FeedClient.uploadFileAsync` now sends its declared `byte[] body` as the multipart `file` part.
