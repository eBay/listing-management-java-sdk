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

package com.ebay.listingmanagement.generated.feed.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container is used to set the filter criteria for the ActiveInventoryReport. A seller can create an ActiveInventoryReport for a single listing format.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryFilterCriteria implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The listing format for the ActiveInventoryReport being created. Supported types are:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;AUCTION&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FIXED_PRICE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:ListingFormatEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String listingFormat;
    /**
     * Instantiates a new {@link InventoryFilterCriteria} and sets the default values.
     */
    public InventoryFilterCriteria() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryFilterCriteria}
     */
    @jakarta.annotation.Nonnull
    public static InventoryFilterCriteria createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryFilterCriteria();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("listingFormat", (n) -> { this.setListingFormat(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingFormat property value. The listing format for the ActiveInventoryReport being created. Supported types are:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;AUCTION&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FIXED_PRICE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:ListingFormatEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingFormat() {
        return this.listingFormat;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("listingFormat", this.getListingFormat());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the listingFormat property value. The listing format for the ActiveInventoryReport being created. Supported types are:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;AUCTION&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FIXED_PRICE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/feed/types/api:ListingFormatEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the listingFormat property.
     */
    public void setListingFormat(@jakarta.annotation.Nullable final String value) {
        this.listingFormat = value;
    }
}
