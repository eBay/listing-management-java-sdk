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
 * A response field that retrieves all the metadata for the video, including its &lt;strong&gt;title&lt;/strong&gt;, &lt;strong&gt;classification&lt;/strong&gt;, &lt;strong&gt;size&lt;/strong&gt;, &lt;strong&gt;description&lt;/strong&gt;, &lt;strong&gt;status&lt;/strong&gt;, &lt;strong&gt;status message&lt;/strong&gt; (if any), and &lt;strong&gt;expiration date&lt;/strong&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Video implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The intended use for this video content. Currently, videos can only be added and associated with eBay listings, so the only supported value is &lt;code&gt;ITEM&lt;/code&gt;. This array is always returned.
     */
    private java.util.List<Classification> classification;
    /**
     * The description of the video. The video description is an optional field that can be set using the &lt;a href=&quot; /develop/api/sell/media_api#sell-media_api-video-createvideo&quot;&gt;createVideo&lt;/a&gt; method.
     */
    private String description;
    /**
     * The date and time when an unused video will expire and be removed from the eBay Video Services server, in Coordinated Universal Time (UTC).&lt;br&gt;&lt;br&gt;As long as a video is being used in an active listing, that video will remain on the server and be accessible. If a video is not being used on an active listing, its expiration date is automatically set to 30 days after the video&apos;s initial upload.
     */
    private String expirationDate;
    /**
     * The video moderation information that is returned if a video is blocked by moderators.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section2&quot; target=&quot;_blank&quot;&gt;Video moderation and restrictions&lt;/a&gt; in the eBay Seller Center for details about video moderation.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;If the video status is &lt;code&gt;BLOCKED&lt;/code&gt;, ensure that the video complies with eBay&apos;s video formatting and content guidelines. Afterwards, begin the video creation and upload procedure anew using the &lt;strong&gt;createVideo&lt;/strong&gt; and &lt;strong&gt;uploadVideo&lt;/strong&gt; methods.
     */
    private Moderation moderation;
    /**
     * The playlist created for the uploaded video, which provides the streaming video URLs to play the video. The supported streaming video protocols are DASH (Dynamic Adaptive Streaming over HTTP) and HLS (HTTP Live Streaming). The playlist will only be generated if a video is successfully uploaded with a status of &lt;code&gt;LIVE&lt;/code&gt;.
     */
    private java.util.List<Play> playLists;
    /**
     * The size, in bytes, of the video content. This field is always returned.
     */
    private Integer size;
    /**
     * The status of the current video resource.
     */
    private VideoStatusEnum status;
    /**
     * The &lt;strong&gt;statusMessage&lt;/strong&gt; field contains additional information on the status. For example, information on why processing might have failed or if the video was blocked.
     */
    private String statusMessage;
    /**
     * The URL of the thumbnail image of the video. The thumbnail image&apos;s URL must be an eBayPictureURL (EPS URL).
     */
    private Image thumbnail;
    /**
     * The title of the video. This field is always returned.
     */
    private String title;
    /**
     * The unique ID of the video.
     */
    private String videoId;
    /**
     * Instantiates a new {@link Video} and sets the default values.
     */
    public Video() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Video}
     */
    @jakarta.annotation.Nonnull
    public static Video createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Video();
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
     * Gets the classification property value. The intended use for this video content. Currently, videos can only be added and associated with eBay listings, so the only supported value is &lt;code&gt;ITEM&lt;/code&gt;. This array is always returned.
     * @return a {@link java.util.List<Classification>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Classification> getClassification() {
        return this.classification;
    }
    /**
     * Gets the description property value. The description of the video. The video description is an optional field that can be set using the &lt;a href=&quot; /develop/api/sell/media_api#sell-media_api-video-createvideo&quot;&gt;createVideo&lt;/a&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the expirationDate property value. The date and time when an unused video will expire and be removed from the eBay Video Services server, in Coordinated Universal Time (UTC).&lt;br&gt;&lt;br&gt;As long as a video is being used in an active listing, that video will remain on the server and be accessible. If a video is not being used on an active listing, its expiration date is automatically set to 30 days after the video&apos;s initial upload.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getCollectionOfEnumValues(Classification::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("expirationDate", (n) -> { this.setExpirationDate(n.getStringValue()); });
        deserializerMap.put("moderation", (n) -> { this.setModeration(n.getObjectValue(Moderation::createFromDiscriminatorValue)); });
        deserializerMap.put("playLists", (n) -> { this.setPlayLists(n.getCollectionOfObjectValues(Play::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(VideoStatusEnum::forValue)); });
        deserializerMap.put("statusMessage", (n) -> { this.setStatusMessage(n.getStringValue()); });
        deserializerMap.put("thumbnail", (n) -> { this.setThumbnail(n.getObjectValue(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("videoId", (n) -> { this.setVideoId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the moderation property value. The video moderation information that is returned if a video is blocked by moderators.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section2&quot; target=&quot;_blank&quot;&gt;Video moderation and restrictions&lt;/a&gt; in the eBay Seller Center for details about video moderation.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;If the video status is &lt;code&gt;BLOCKED&lt;/code&gt;, ensure that the video complies with eBay&apos;s video formatting and content guidelines. Afterwards, begin the video creation and upload procedure anew using the &lt;strong&gt;createVideo&lt;/strong&gt; and &lt;strong&gt;uploadVideo&lt;/strong&gt; methods.
     * @return a {@link Moderation}
     */
    @jakarta.annotation.Nullable
    public Moderation getModeration() {
        return this.moderation;
    }
    /**
     * Gets the playLists property value. The playlist created for the uploaded video, which provides the streaming video URLs to play the video. The supported streaming video protocols are DASH (Dynamic Adaptive Streaming over HTTP) and HLS (HTTP Live Streaming). The playlist will only be generated if a video is successfully uploaded with a status of &lt;code&gt;LIVE&lt;/code&gt;.
     * @return a {@link java.util.List<Play>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Play> getPlayLists() {
        return this.playLists;
    }
    /**
     * Gets the size property value. The size, in bytes, of the video content. This field is always returned.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSize() {
        return this.size;
    }
    /**
     * Gets the status property value. The status of the current video resource.
     * @return a {@link VideoStatusEnum}
     */
    @jakarta.annotation.Nullable
    public VideoStatusEnum getStatus() {
        return this.status;
    }
    /**
     * Gets the statusMessage property value. The &lt;strong&gt;statusMessage&lt;/strong&gt; field contains additional information on the status. For example, information on why processing might have failed or if the video was blocked.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Gets the thumbnail property value. The URL of the thumbnail image of the video. The thumbnail image&apos;s URL must be an eBayPictureURL (EPS URL).
     * @return a {@link Image}
     */
    @jakarta.annotation.Nullable
    public Image getThumbnail() {
        return this.thumbnail;
    }
    /**
     * Gets the title property value. The title of the video. This field is always returned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the videoId property value. The unique ID of the video.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoId() {
        return this.videoId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("classification", this.getClassification());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("expirationDate", this.getExpirationDate());
        writer.writeObjectValue("moderation", this.getModeration());
        writer.writeCollectionOfObjectValues("playLists", this.getPlayLists());
        writer.writeIntegerValue("size", this.getSize());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusMessage", this.getStatusMessage());
        writer.writeObjectValue("thumbnail", this.getThumbnail());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("videoId", this.getVideoId());
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
     * Sets the classification property value. The intended use for this video content. Currently, videos can only be added and associated with eBay listings, so the only supported value is &lt;code&gt;ITEM&lt;/code&gt;. This array is always returned.
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final java.util.List<Classification> value) {
        this.classification = value;
    }
    /**
     * Sets the description property value. The description of the video. The video description is an optional field that can be set using the &lt;a href=&quot; /develop/api/sell/media_api#sell-media_api-video-createvideo&quot;&gt;createVideo&lt;/a&gt; method.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the expirationDate property value. The date and time when an unused video will expire and be removed from the eBay Video Services server, in Coordinated Universal Time (UTC).&lt;br&gt;&lt;br&gt;As long as a video is being used in an active listing, that video will remain on the server and be accessible. If a video is not being used on an active listing, its expiration date is automatically set to 30 days after the video&apos;s initial upload.
     * @param value Value to set for the expirationDate property.
     */
    public void setExpirationDate(@jakarta.annotation.Nullable final String value) {
        this.expirationDate = value;
    }
    /**
     * Sets the moderation property value. The video moderation information that is returned if a video is blocked by moderators.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href=&quot;https://www.ebay.com/help/selling/listings/creating-managing-listings/add-video-to-listing?id=5272#section2&quot; target=&quot;_blank&quot;&gt;Video moderation and restrictions&lt;/a&gt; in the eBay Seller Center for details about video moderation.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;If the video status is &lt;code&gt;BLOCKED&lt;/code&gt;, ensure that the video complies with eBay&apos;s video formatting and content guidelines. Afterwards, begin the video creation and upload procedure anew using the &lt;strong&gt;createVideo&lt;/strong&gt; and &lt;strong&gt;uploadVideo&lt;/strong&gt; methods.
     * @param value Value to set for the moderation property.
     */
    public void setModeration(@jakarta.annotation.Nullable final Moderation value) {
        this.moderation = value;
    }
    /**
     * Sets the playLists property value. The playlist created for the uploaded video, which provides the streaming video URLs to play the video. The supported streaming video protocols are DASH (Dynamic Adaptive Streaming over HTTP) and HLS (HTTP Live Streaming). The playlist will only be generated if a video is successfully uploaded with a status of &lt;code&gt;LIVE&lt;/code&gt;.
     * @param value Value to set for the playLists property.
     */
    public void setPlayLists(@jakarta.annotation.Nullable final java.util.List<Play> value) {
        this.playLists = value;
    }
    /**
     * Sets the size property value. The size, in bytes, of the video content. This field is always returned.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Integer value) {
        this.size = value;
    }
    /**
     * Sets the status property value. The status of the current video resource.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final VideoStatusEnum value) {
        this.status = value;
    }
    /**
     * Sets the statusMessage property value. The &lt;strong&gt;statusMessage&lt;/strong&gt; field contains additional information on the status. For example, information on why processing might have failed or if the video was blocked.
     * @param value Value to set for the statusMessage property.
     */
    public void setStatusMessage(@jakarta.annotation.Nullable final String value) {
        this.statusMessage = value;
    }
    /**
     * Sets the thumbnail property value. The URL of the thumbnail image of the video. The thumbnail image&apos;s URL must be an eBayPictureURL (EPS URL).
     * @param value Value to set for the thumbnail property.
     */
    public void setThumbnail(@jakarta.annotation.Nullable final Image value) {
        this.thumbnail = value;
    }
    /**
     * Sets the title property value. The title of the video. This field is always returned.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the videoId property value. The unique ID of the video.
     * @param value Value to set for the videoId property.
     */
    public void setVideoId(@jakarta.annotation.Nullable final String value) {
        this.videoId = value;
    }
}
