package com.ebay.listingmanagement.generated.inventory.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container to identify a motor vehicle using name/value pairs.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NameValueList implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This string value identifies the motor vehicle aspect, such as &apos;make&apos;, &apos;model&apos;, &apos;year&apos;, &apos;trim&apos;, and &apos;engine&apos;. Typically, the make, model, and year of the motor vehicle are always required, with the trim and engine being necessary sometimes, but it will be dependent on the part or accessory, and on the vehicle class.&lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/api-docs/commerce/taxonomy/resources/category_tree/methods/getCompatibilityProperties&quot; target=&quot;_blank&quot;&gt;getCompatibilityProperties&lt;/a&gt; method of the Taxonomy API can be used to retrieve applicable vehicle aspect names for a specified category.
     */
    private String name;
    /**
     * This string value identifies the motor vehicle aspect specified in the corresponding &lt;strong&gt;name&lt;/strong&gt; field. For example, if the &lt;strong&gt;name&lt;/strong&gt; field is &apos;make&apos;, this field may be &apos;Toyota&apos;, or if the &lt;strong&gt;name&lt;/strong&gt; field is &apos;model&apos;, this field may be &apos;Camry&apos;.&lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/api-docs/commerce/taxonomy/resources/category_tree/methods/getCompatibilityPropertyValues&quot; target=&quot;_blank&quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; method of the Taxonomy API can be used to retrieve possible values for vehicle aspect names.
     */
    private String value;
    /**
     * Instantiates a new {@link NameValueList} and sets the default values.
     */
    public NameValueList() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NameValueList}
     */
    @jakarta.annotation.Nonnull
    public static NameValueList createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NameValueList();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. This string value identifies the motor vehicle aspect, such as &apos;make&apos;, &apos;model&apos;, &apos;year&apos;, &apos;trim&apos;, and &apos;engine&apos;. Typically, the make, model, and year of the motor vehicle are always required, with the trim and engine being necessary sometimes, but it will be dependent on the part or accessory, and on the vehicle class.&lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/api-docs/commerce/taxonomy/resources/category_tree/methods/getCompatibilityProperties&quot; target=&quot;_blank&quot;&gt;getCompatibilityProperties&lt;/a&gt; method of the Taxonomy API can be used to retrieve applicable vehicle aspect names for a specified category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the value property value. This string value identifies the motor vehicle aspect specified in the corresponding &lt;strong&gt;name&lt;/strong&gt; field. For example, if the &lt;strong&gt;name&lt;/strong&gt; field is &apos;make&apos;, this field may be &apos;Toyota&apos;, or if the &lt;strong&gt;name&lt;/strong&gt; field is &apos;model&apos;, this field may be &apos;Camry&apos;.&lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/api-docs/commerce/taxonomy/resources/category_tree/methods/getCompatibilityPropertyValues&quot; target=&quot;_blank&quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; method of the Taxonomy API can be used to retrieve possible values for vehicle aspect names.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the name property value. This string value identifies the motor vehicle aspect, such as &apos;make&apos;, &apos;model&apos;, &apos;year&apos;, &apos;trim&apos;, and &apos;engine&apos;. Typically, the make, model, and year of the motor vehicle are always required, with the trim and engine being necessary sometimes, but it will be dependent on the part or accessory, and on the vehicle class.&lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/api-docs/commerce/taxonomy/resources/category_tree/methods/getCompatibilityProperties&quot; target=&quot;_blank&quot;&gt;getCompatibilityProperties&lt;/a&gt; method of the Taxonomy API can be used to retrieve applicable vehicle aspect names for a specified category.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the value property value. This string value identifies the motor vehicle aspect specified in the corresponding &lt;strong&gt;name&lt;/strong&gt; field. For example, if the &lt;strong&gt;name&lt;/strong&gt; field is &apos;make&apos;, this field may be &apos;Toyota&apos;, or if the &lt;strong&gt;name&lt;/strong&gt; field is &apos;model&apos;, this field may be &apos;Camry&apos;.&lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/api-docs/commerce/taxonomy/resources/category_tree/methods/getCompatibilityPropertyValues&quot; target=&quot;_blank&quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; method of the Taxonomy API can be used to retrieve possible values for vehicle aspect names.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
