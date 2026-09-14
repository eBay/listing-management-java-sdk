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

package com.ebay.listingmanagement.generated.stores.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base request type of the &lt;b&gt;deleteStoreCategory&lt;/b&gt; method. It is used to provide a new category home for the listings that are currently in the store category to be deleted.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeleteStoreCategoryRequestType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * When deleting store category, if the deleted category category_id is a leaf category and it has active items, you must specify listingDestinationCategoryId. The system will move the items from category_id to listingDestinationCategoryId. The listingDestinationCategoryId should be a leaf category which has no child categories. Default value: OTHER category ID (1) if it&apos;s null.
     */
    private String listingDestinationCategoryId;
    /**
     * Instantiates a new {@link DeleteStoreCategoryRequestType} and sets the default values.
     */
    public DeleteStoreCategoryRequestType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeleteStoreCategoryRequestType}
     */
    @jakarta.annotation.Nonnull
    public static DeleteStoreCategoryRequestType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeleteStoreCategoryRequestType();
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
        deserializerMap.put("listingDestinationCategoryId", (n) -> { this.setListingDestinationCategoryId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingDestinationCategoryId property value. When deleting store category, if the deleted category category_id is a leaf category and it has active items, you must specify listingDestinationCategoryId. The system will move the items from category_id to listingDestinationCategoryId. The listingDestinationCategoryId should be a leaf category which has no child categories. Default value: OTHER category ID (1) if it&apos;s null.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingDestinationCategoryId() {
        return this.listingDestinationCategoryId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("listingDestinationCategoryId", this.getListingDestinationCategoryId());
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
     * Sets the listingDestinationCategoryId property value. When deleting store category, if the deleted category category_id is a leaf category and it has active items, you must specify listingDestinationCategoryId. The system will move the items from category_id to listingDestinationCategoryId. The listingDestinationCategoryId should be a leaf category which has no child categories. Default value: OTHER category ID (1) if it&apos;s null.
     * @param value Value to set for the listingDestinationCategoryId property.
     */
    public void setListingDestinationCategoryId(@jakarta.annotation.Nullable final String value) {
        this.listingDestinationCategoryId = value;
    }
}
