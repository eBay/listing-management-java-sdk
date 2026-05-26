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

package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to specify one to five eBay listings that will be migrated to the new Inventory model.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MigrateListing implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the eBay listing to migrate to the new Inventory model. In the Trading API, this field is known as the &lt;strong&gt;ItemID&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;Up to five unique eBay listings may be specified here in separate &lt;strong&gt;listingId&lt;/strong&gt; fields. The seller should make sure that each of these listings meet the requirements that are stated at the top of this Call Reference page.
     */
    private String listingId;
    /**
     * Instantiates a new {@link MigrateListing} and sets the default values.
     */
    public MigrateListing() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MigrateListing}
     */
    @jakarta.annotation.Nonnull
    public static MigrateListing createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MigrateListing();
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
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingId property value. The unique identifier of the eBay listing to migrate to the new Inventory model. In the Trading API, this field is known as the &lt;strong&gt;ItemID&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;Up to five unique eBay listings may be specified here in separate &lt;strong&gt;listingId&lt;/strong&gt; fields. The seller should make sure that each of these listings meet the requirements that are stated at the top of this Call Reference page.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("listingId", this.getListingId());
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
     * Sets the listingId property value. The unique identifier of the eBay listing to migrate to the new Inventory model. In the Trading API, this field is known as the &lt;strong&gt;ItemID&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;Up to five unique eBay listings may be specified here in separate &lt;strong&gt;listingId&lt;/strong&gt; fields. The seller should make sure that each of these listings meet the requirements that are stated at the top of this Call Reference page.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
}
