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
 * This type is used by the &lt;strong&gt;intervals&lt;/strong&gt; container to define the opening and closing times of a store location&apos;s working day. Local time (in Military format) is used, with the following format: &lt;code&gt;hh:mm:ss&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Interval implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The &lt;strong&gt;close&lt;/strong&gt; value is actually the time that the store location closes. Local time (in Military format) is used. So, if a store closed at 8 PM local time, the &lt;strong&gt;close&lt;/strong&gt; time would look like the following: &lt;code&gt;20:00:00&lt;/code&gt;. This field is conditionally required if the &lt;strong&gt;intervals&lt;/strong&gt; container is used to specify working hours or special hours for a store. &lt;br&gt;&lt;br&gt;This field is returned if set for the store location.
     */
    private String close;
    /**
     * The &lt;strong&gt;open&lt;/strong&gt; value is actually the time that the store opens. Local time (in Military format) is used. So, if a store opens at 9 AM local time, the &lt;strong&gt;open&lt;/strong&gt; time would look like the following: &lt;code&gt;09:00:00&lt;/code&gt;. This field is conditionally required if the &lt;strong&gt;intervals&lt;/strong&gt; container is used to specify working hours or special hours for a store. &lt;br&gt;&lt;br&gt;This field is returned if set for the store location.
     */
    private String open;
    /**
     * Instantiates a new {@link Interval} and sets the default values.
     */
    public Interval() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Interval}
     */
    @jakarta.annotation.Nonnull
    public static Interval createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Interval();
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
     * Gets the close property value. The &lt;strong&gt;close&lt;/strong&gt; value is actually the time that the store location closes. Local time (in Military format) is used. So, if a store closed at 8 PM local time, the &lt;strong&gt;close&lt;/strong&gt; time would look like the following: &lt;code&gt;20:00:00&lt;/code&gt;. This field is conditionally required if the &lt;strong&gt;intervals&lt;/strong&gt; container is used to specify working hours or special hours for a store. &lt;br&gt;&lt;br&gt;This field is returned if set for the store location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClose() {
        return this.close;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("close", (n) -> { this.setClose(n.getStringValue()); });
        deserializerMap.put("open", (n) -> { this.setOpen(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the open property value. The &lt;strong&gt;open&lt;/strong&gt; value is actually the time that the store opens. Local time (in Military format) is used. So, if a store opens at 9 AM local time, the &lt;strong&gt;open&lt;/strong&gt; time would look like the following: &lt;code&gt;09:00:00&lt;/code&gt;. This field is conditionally required if the &lt;strong&gt;intervals&lt;/strong&gt; container is used to specify working hours or special hours for a store. &lt;br&gt;&lt;br&gt;This field is returned if set for the store location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOpen() {
        return this.open;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("close", this.getClose());
        writer.writeStringValue("open", this.getOpen());
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
     * Sets the close property value. The &lt;strong&gt;close&lt;/strong&gt; value is actually the time that the store location closes. Local time (in Military format) is used. So, if a store closed at 8 PM local time, the &lt;strong&gt;close&lt;/strong&gt; time would look like the following: &lt;code&gt;20:00:00&lt;/code&gt;. This field is conditionally required if the &lt;strong&gt;intervals&lt;/strong&gt; container is used to specify working hours or special hours for a store. &lt;br&gt;&lt;br&gt;This field is returned if set for the store location.
     * @param value Value to set for the close property.
     */
    public void setClose(@jakarta.annotation.Nullable final String value) {
        this.close = value;
    }
    /**
     * Sets the open property value. The &lt;strong&gt;open&lt;/strong&gt; value is actually the time that the store opens. Local time (in Military format) is used. So, if a store opens at 9 AM local time, the &lt;strong&gt;open&lt;/strong&gt; time would look like the following: &lt;code&gt;09:00:00&lt;/code&gt;. This field is conditionally required if the &lt;strong&gt;intervals&lt;/strong&gt; container is used to specify working hours or special hours for a store. &lt;br&gt;&lt;br&gt;This field is returned if set for the store location.
     * @param value Value to set for the open property.
     */
    public void setOpen(@jakarta.annotation.Nullable final String value) {
        this.open = value;
    }
}
