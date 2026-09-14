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
 * The base request type of the &lt;b&gt;moveStoreCategory&lt;/b&gt; method. It is used to provide the name of the category to be moved and its new location.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MoveStoreCategoryRequestType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unique identifier of an eBay Store&apos;s custom category. eBay auto-generates this identifier when a sellerestablishes a custom store category. This category ID should not be confused with an eBay category ID.
     */
    private String categoryId;
    /**
     * When moving store category, specifies the destination category destinationParentCategoryId under which the moved category categoryId will be located. To move to the top level, set the value to -999.
     */
    private String destinationParentCategoryId;
    /**
     * This field is only needed if the category to be moved is a leaf category with listings, but a category that becomes a non-leaf category after the move. The listings of the category to be moved are moved to the category specified in this field.
     */
    private String listingDestinationCategoryId;
    /**
     * Instantiates a new {@link MoveStoreCategoryRequestType} and sets the default values.
     */
    public MoveStoreCategoryRequestType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MoveStoreCategoryRequestType}
     */
    @jakarta.annotation.Nonnull
    public static MoveStoreCategoryRequestType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MoveStoreCategoryRequestType();
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
     * Gets the categoryId property value. Unique identifier of an eBay Store&apos;s custom category. eBay auto-generates this identifier when a sellerestablishes a custom store category. This category ID should not be confused with an eBay category ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the destinationParentCategoryId property value. When moving store category, specifies the destination category destinationParentCategoryId under which the moved category categoryId will be located. To move to the top level, set the value to -999.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationParentCategoryId() {
        return this.destinationParentCategoryId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("destinationParentCategoryId", (n) -> { this.setDestinationParentCategoryId(n.getStringValue()); });
        deserializerMap.put("listingDestinationCategoryId", (n) -> { this.setListingDestinationCategoryId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingDestinationCategoryId property value. This field is only needed if the category to be moved is a leaf category with listings, but a category that becomes a non-leaf category after the move. The listings of the category to be moved are moved to the category specified in this field.
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
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("destinationParentCategoryId", this.getDestinationParentCategoryId());
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
     * Sets the categoryId property value. Unique identifier of an eBay Store&apos;s custom category. eBay auto-generates this identifier when a sellerestablishes a custom store category. This category ID should not be confused with an eBay category ID.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the destinationParentCategoryId property value. When moving store category, specifies the destination category destinationParentCategoryId under which the moved category categoryId will be located. To move to the top level, set the value to -999.
     * @param value Value to set for the destinationParentCategoryId property.
     */
    public void setDestinationParentCategoryId(@jakarta.annotation.Nullable final String value) {
        this.destinationParentCategoryId = value;
    }
    /**
     * Sets the listingDestinationCategoryId property value. This field is only needed if the category to be moved is a leaf category with listings, but a category that becomes a non-leaf category after the move. The listings of the category to be moved are moved to the category specified in this field.
     * @param value Value to set for the listingDestinationCategoryId property.
     */
    public void setListingDestinationCategoryId(@jakarta.annotation.Nullable final String value) {
        this.listingDestinationCategoryId = value;
    }
}
