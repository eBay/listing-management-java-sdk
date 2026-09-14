# ChangeLog

## 0.2.0 (09/14/2026)

### Breaking changes

#### Changed signatures

`FeedClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `createCustomerServiceMetricTaskAsync` | `(CreateServiceMetricsTaskRequest, String, RequestOptions)` | `(CreateServiceMetricsTaskRequest, String, String, RequestOptions)` |
| `createTaskAsync` | `(CreateTaskRequest, String, RequestOptions)` | `(CreateTaskRequest, String, String, String, RequestOptions)` |
| `uploadFileAsync` | `(String, String, RequestOptions)` | `(String, byte[], String, RequestOptions)` |
| `getCustomerServiceMetricTasksAsync` | `(String, String, String, String, String, String, RequestOptions)` | `(String, String, Integer, Integer, Integer, String, RequestOptions)` |
| `getInventoryTasksAsync` | `(String, String, String, String, String, String, String, RequestOptions)` | `(String, String, Integer, String, Integer, Integer, String, RequestOptions)` |
| `getOrderTasksAsync` | `(String, String, String, String, String, String, String, RequestOptions)` | `(String, String, Integer, Integer, Integer, String, String, RequestOptions)` |
| `getSchedulesAsync` | `(String, String, String, String, RequestOptions)` | `(String, Integer, Integer, String, RequestOptions)` |
| `getScheduleTemplatesAsync` | `(String, String, String, String, RequestOptions)` | `(String, Integer, Integer, String, RequestOptions)` |
| `getTasksAsync` | `(String, String, String, String, String, String, String, RequestOptions)` | `(String, String, Integer, Integer, Integer, String, String, RequestOptions)` |

`ListingGraphQLClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `sellerListingSearchAsync` | `(String?)` | `(SellerActiveListingSearchInput?, SellerEndedListingSearchInput?, SellerScheduledListingSearchInput?, String?)` |

`MediaClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `createImageFromFileAsync` | `(String, RequestOptions)` | `(byte[], String, RequestOptions)` |
| `uploadDocumentAsync` | `(String, String, RequestOptions)` | `(String, byte[], String, RequestOptions)` |
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
