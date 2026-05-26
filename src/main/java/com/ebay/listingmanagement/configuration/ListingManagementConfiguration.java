// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.listingmanagement.configuration;

import java.util.HashSet;
import java.util.Set;

public final class ListingManagementConfiguration {
    private String accessToken;
    private RequestOptions defaultRequestOptions = new RequestOptions();

    public String feedBaseUrl = "https://api.ebay.com/sell/feed/v1";
    public String inventoryBaseUrl = "https://api.ebay.com/sell/inventory/v1";
    public String mediaBaseUrl = "https://apim.ebay.com/commerce/media/v1_beta";
    public String storesBaseUrl = "https://api.ebay.com/sell/stores/v1";
    public String graphQLBaseUrl = "https://api.ebay.com/graphql";

    public void setAccessToken(String token) {
        this.accessToken = token;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public RequestOptions getDefaultRequestOptions() {
        return defaultRequestOptions;
    }

    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add("api.ebay.com");
        hosts.add("apim.ebay.com");
        return hosts;
    }

    public String getFeedBaseUrl() {
        return feedBaseUrl;
    }

    public String getInventoryBaseUrl() {
        return inventoryBaseUrl;
    }

    public String getMediaBaseUrl() {
        return mediaBaseUrl;
    }

    public String getStoresBaseUrl() {
        return storesBaseUrl;
    }

    public String getGraphQLBaseUrl() {
        return graphQLBaseUrl;
    }

    public void setGraphQLBaseUrl(String graphQLBaseUrl) {
        this.graphQLBaseUrl = graphQLBaseUrl;
    }
}
