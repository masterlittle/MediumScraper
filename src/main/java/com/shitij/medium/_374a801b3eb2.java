
package com.shitij.medium;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "userId",
    "name",
    "username",
    "createdAt",
    "lastPostCreatedAt",
    "imageId",
    "backgroundImageId",
    "bio",
    "twitterScreenName",
    "facebookAccountId",
    "allowNotes",
    "mediumMemberAt",
    "isNsfw",
    "type"
})
public class _374a801b3eb2 {

    @JsonProperty("userId")
    private String userId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("username")
    private String username;
    @JsonProperty("createdAt")
    private long createdAt;
    @JsonProperty("lastPostCreatedAt")
    private long lastPostCreatedAt;
    @JsonProperty("imageId")
    private String imageId;
    @JsonProperty("backgroundImageId")
    private String backgroundImageId;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("twitterScreenName")
    private String twitterScreenName;
    @JsonProperty("facebookAccountId")
    private String facebookAccountId;
    @JsonProperty("allowNotes")
    private long allowNotes;
    @JsonProperty("mediumMemberAt")
    private long mediumMemberAt;
    @JsonProperty("isNsfw")
    private boolean isNsfw;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("createdAt")
    public long getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("lastPostCreatedAt")
    public long getLastPostCreatedAt() {
        return lastPostCreatedAt;
    }

    @JsonProperty("lastPostCreatedAt")
    public void setLastPostCreatedAt(long lastPostCreatedAt) {
        this.lastPostCreatedAt = lastPostCreatedAt;
    }

    @JsonProperty("imageId")
    public String getImageId() {
        return imageId;
    }

    @JsonProperty("imageId")
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @JsonProperty("backgroundImageId")
    public String getBackgroundImageId() {
        return backgroundImageId;
    }

    @JsonProperty("backgroundImageId")
    public void setBackgroundImageId(String backgroundImageId) {
        this.backgroundImageId = backgroundImageId;
    }

    @JsonProperty("bio")
    public String getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @JsonProperty("twitterScreenName")
    public String getTwitterScreenName() {
        return twitterScreenName;
    }

    @JsonProperty("twitterScreenName")
    public void setTwitterScreenName(String twitterScreenName) {
        this.twitterScreenName = twitterScreenName;
    }

    @JsonProperty("facebookAccountId")
    public String getFacebookAccountId() {
        return facebookAccountId;
    }

    @JsonProperty("facebookAccountId")
    public void setFacebookAccountId(String facebookAccountId) {
        this.facebookAccountId = facebookAccountId;
    }

    @JsonProperty("allowNotes")
    public long getAllowNotes() {
        return allowNotes;
    }

    @JsonProperty("allowNotes")
    public void setAllowNotes(long allowNotes) {
        this.allowNotes = allowNotes;
    }

    @JsonProperty("mediumMemberAt")
    public long getMediumMemberAt() {
        return mediumMemberAt;
    }

    @JsonProperty("mediumMemberAt")
    public void setMediumMemberAt(long mediumMemberAt) {
        this.mediumMemberAt = mediumMemberAt;
    }

    @JsonProperty("isNsfw")
    public boolean isIsNsfw() {
        return isNsfw;
    }

    @JsonProperty("isNsfw")
    public void setIsNsfw(boolean isNsfw) {
        this.isNsfw = isNsfw;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("userId", userId).append("name", name).append("username", username).append("createdAt", createdAt).append("lastPostCreatedAt", lastPostCreatedAt).append("imageId", imageId).append("backgroundImageId", backgroundImageId).append("bio", bio).append("twitterScreenName", twitterScreenName).append("facebookAccountId", facebookAccountId).append("allowNotes", allowNotes).append("mediumMemberAt", mediumMemberAt).append("isNsfw", isNsfw).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isNsfw).append(mediumMemberAt).append(type).append(lastPostCreatedAt).append(facebookAccountId).append(username).append(imageId).append(bio).append(backgroundImageId).append(twitterScreenName).append(additionalProperties).append(createdAt).append(name).append(userId).append(allowNotes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _374a801b3eb2) == false) {
            return false;
        }
        _374a801b3eb2 rhs = ((_374a801b3eb2) other);
        return new EqualsBuilder().append(isNsfw, rhs.isNsfw).append(mediumMemberAt, rhs.mediumMemberAt).append(type, rhs.type).append(lastPostCreatedAt, rhs.lastPostCreatedAt).append(facebookAccountId, rhs.facebookAccountId).append(username, rhs.username).append(imageId, rhs.imageId).append(bio, rhs.bio).append(backgroundImageId, rhs.backgroundImageId).append(twitterScreenName, rhs.twitterScreenName).append(additionalProperties, rhs.additionalProperties).append(createdAt, rhs.createdAt).append(name, rhs.name).append(userId, rhs.userId).append(allowNotes, rhs.allowNotes).isEquals();
    }

}
