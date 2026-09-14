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

package com.ebay.listingmanagement.generated.media.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides information about the &lt;strong&gt;documentId&lt;/strong&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DocumentMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the file including its extension (for example, &lt;code&gt;drone_user_warranty.pdf&lt;/code&gt;).
     */
    private String fileName;
    /**
     * The size, in bytes, of the document content.
     */
    private String fileSize;
    /**
     * The type of the file uploaded. Supported file types include the following: &lt;code&gt;pdf&lt;/code&gt;, &lt;code&gt;jpeg&lt;/code&gt;, &lt;code&gt;jpg&lt;/code&gt;, and &lt;code&gt;png&lt;/code&gt;.
     */
    private String fileType;
    /**
     * Instantiates a new {@link DocumentMetadata} and sets the default values.
     */
    public DocumentMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DocumentMetadata}
     */
    @jakarta.annotation.Nonnull
    public static DocumentMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentMetadata();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getStringValue()); });
        deserializerMap.put("fileType", (n) -> { this.setFileType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The name of the file including its extension (for example, &lt;code&gt;drone_user_warranty.pdf&lt;/code&gt;).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the fileSize property value. The size, in bytes, of the document content.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileSize() {
        return this.fileSize;
    }
    /**
     * Gets the fileType property value. The type of the file uploaded. Supported file types include the following: &lt;code&gt;pdf&lt;/code&gt;, &lt;code&gt;jpeg&lt;/code&gt;, &lt;code&gt;jpg&lt;/code&gt;, and &lt;code&gt;png&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileType() {
        return this.fileType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("fileSize", this.getFileSize());
        writer.writeStringValue("fileType", this.getFileType());
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
     * Sets the fileName property value. The name of the file including its extension (for example, &lt;code&gt;drone_user_warranty.pdf&lt;/code&gt;).
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the fileSize property value. The size, in bytes, of the document content.
     * @param value Value to set for the fileSize property.
     */
    public void setFileSize(@jakarta.annotation.Nullable final String value) {
        this.fileSize = value;
    }
    /**
     * Sets the fileType property value. The type of the file uploaded. Supported file types include the following: &lt;code&gt;pdf&lt;/code&gt;, &lt;code&gt;jpeg&lt;/code&gt;, &lt;code&gt;jpg&lt;/code&gt;, and &lt;code&gt;png&lt;/code&gt;.
     * @param value Value to set for the fileType property.
     */
    public void setFileType(@jakarta.annotation.Nullable final String value) {
        this.fileType = value;
    }
}
