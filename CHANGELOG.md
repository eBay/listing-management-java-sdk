# ChangeLog

## 0.3.0 (11/26/2026)

### Breaking changes

- The following operations changed signature on `MediaClient`:
| Operation | Previous signature | New signature |
| --- | --- | --- |
| `uploadVideoAsync` | `uploadVideoAsync(String videoId, String contentLength, String contentRange, String accessToken, RequestOptions requestOptions)` | `uploadVideoAsync(String videoId, String contentLength, String contentRange, InputStream body, String accessToken, RequestOptions requestOptions)` |

### Added

- Local mock servers: a base URL may use plain `http` when its host is a loopback host (`127.0.0.1`, `::1` or `localhost`) that you also pass in `allowedHosts`, for example `List.of("127.0.0.1")`. Every other host still requires `https`. `ListingManagementConfiguration.LOOPBACK_HOSTS` lists the loopback hosts.

### Changed

- Updated the `inventory`, `media` OpenAPI documents to the latest definitions.
- Updated the GraphQL schema to the latest definitions.
- `ListingManagementConfiguration.isTrustedUrl` and the auth provider and GraphQL clients apply the same rule.
- Hosts are compared lowercased and without IPv6 brackets, so `[::1]` and `::1` match.
- A rejected base URL now says whether the scheme or the host is not trusted.
- Fixed multipart uploads so `createImageFromFileAsync`, `uploadDocumentAsync` and `uploadPostOrderDocumentAsync` send the file through Kiota.

## 0.2.3 (10/28/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.3 to 2.22.4 to fix CVE-2026-110879 (GHSA-m8xf-2cr7-77ph), a critical `PolymorphicTypeValidator` bypass via generic type arguments that allows arbitrary class instantiation.

## 0.2.2 (10/15/2026)

### Dependencies

- DCCOMICS-21031: Bumped transitive `com.google.guava:guava` from 33.4.0-jre to 33.7.2-jre for Error Prone and NullAway to fix CVE-2026-102554 (SNYK-JAVA-COMGOOGLEGUAVA-20825054), an allocation of resources without limits vulnerability during deserialization.

## 0.2.1 (09/25/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.2 to 2.22.3.


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