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
 * This type is used to display the result for each offer and/or inventory item that the seller attempted to update with a &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call. If any errors or warnings occur, the error/warning data is returned at the offer/inventory item level.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PriceQuantityResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array will be returned if there were one or more errors associated with the update to the offer or inventory item record.
     */
    private java.util.List<Error> errors;
    /**
     * The unique identifier of the offer that was updated. This field will not be returned in situations where the seller is only updating the total &apos;ship-to-home&apos; quantity of an inventory item record.
     */
    private String offerId;
    /**
     * This is the seller-defined SKU value of the product. This field is returned whether the seller attempted to update an offer with the SKU value or just attempted to update the total &apos;ship-to-home&apos; quantity of an inventory item record.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br&gt;
     */
    private String sku;
    /**
     * The value returned in this container will indicate the status of the attempt to update the price and/or quantity of the offer (specified in the corresponding &lt;strong&gt;offerId&lt;/strong&gt; field) or the attempt to update the total &apos;ship-to-home&apos; quantity of an inventory item (specified in the corresponding &lt;strong&gt;sku&lt;/strong&gt; field). For a completely successful update of an offer or inventory item record, a value of &lt;code&gt;200&lt;/code&gt; will appear in this field.  A user can view the &lt;strong&gt;HTTP status codes&lt;/strong&gt; section for information on other status codes that may be returned with the &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; method.
     */
    private Integer statusCode;
    /**
     * This array will be returned if there were one or more warnings associated with the update to the offer or inventory item record.
     */
    private java.util.List<Error> warnings;
    /**
     * Instantiates a new {@link PriceQuantityResponse} and sets the default values.
     */
    public PriceQuantityResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PriceQuantityResponse}
     */
    @jakarta.annotation.Nonnull
    public static PriceQuantityResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PriceQuantityResponse();
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
     * Gets the errors property value. This array will be returned if there were one or more errors associated with the update to the offer or inventory item record.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        deserializerMap.put("offerId", (n) -> { this.setOfferId(n.getStringValue()); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the offerId property value. The unique identifier of the offer that was updated. This field will not be returned in situations where the seller is only updating the total &apos;ship-to-home&apos; quantity of an inventory item record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferId() {
        return this.offerId;
    }
    /**
     * Gets the sku property value. This is the seller-defined SKU value of the product. This field is returned whether the seller attempted to update an offer with the SKU value or just attempted to update the total &apos;ship-to-home&apos; quantity of an inventory item record.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSku() {
        return this.sku;
    }
    /**
     * Gets the statusCode property value. The value returned in this container will indicate the status of the attempt to update the price and/or quantity of the offer (specified in the corresponding &lt;strong&gt;offerId&lt;/strong&gt; field) or the attempt to update the total &apos;ship-to-home&apos; quantity of an inventory item (specified in the corresponding &lt;strong&gt;sku&lt;/strong&gt; field). For a completely successful update of an offer or inventory item record, a value of &lt;code&gt;200&lt;/code&gt; will appear in this field.  A user can view the &lt;strong&gt;HTTP status codes&lt;/strong&gt; section for information on other status codes that may be returned with the &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; method.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }
    /**
     * Gets the warnings property value. This array will be returned if there were one or more warnings associated with the update to the offer or inventory item record.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("offerId", this.getOfferId());
        writer.writeStringValue("sku", this.getSku());
        writer.writeIntegerValue("statusCode", this.getStatusCode());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the errors property value. This array will be returned if there were one or more errors associated with the update to the offer or inventory item record.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.errors = value;
    }
    /**
     * Sets the offerId property value. The unique identifier of the offer that was updated. This field will not be returned in situations where the seller is only updating the total &apos;ship-to-home&apos; quantity of an inventory item record.
     * @param value Value to set for the offerId property.
     */
    public void setOfferId(@jakarta.annotation.Nullable final String value) {
        this.offerId = value;
    }
    /**
     * Sets the sku property value. This is the seller-defined SKU value of the product. This field is returned whether the seller attempted to update an offer with the SKU value or just attempted to update the total &apos;ship-to-home&apos; quantity of an inventory item record.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br&gt;
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final String value) {
        this.sku = value;
    }
    /**
     * Sets the statusCode property value. The value returned in this container will indicate the status of the attempt to update the price and/or quantity of the offer (specified in the corresponding &lt;strong&gt;offerId&lt;/strong&gt; field) or the attempt to update the total &apos;ship-to-home&apos; quantity of an inventory item (specified in the corresponding &lt;strong&gt;sku&lt;/strong&gt; field). For a completely successful update of an offer or inventory item record, a value of &lt;code&gt;200&lt;/code&gt; will appear in this field.  A user can view the &lt;strong&gt;HTTP status codes&lt;/strong&gt; section for information on other status codes that may be returned with the &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; method.
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
    /**
     * Sets the warnings property value. This array will be returned if there were one or more warnings associated with the update to the offer or inventory item record.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.warnings = value;
    }
}
