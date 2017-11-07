
package com.shitij.medium.topics;

import java.util.HashMap;
import java.util.List;
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
    "topicId",
    "slug",
    "createdAt",
    "deletedAt",
    "image",
    "name",
    "description",
    "isFollowing",
    "briefCatalogId",
    "relatedTopics",
    "visibility",
    "relatedTags",
    "type"
})
public class F862bfc84e38 {

    @JsonProperty("topicId")
    private String topicId;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("createdAt")
    private long createdAt;
    @JsonProperty("deletedAt")
    private long deletedAt;
    @JsonProperty("image")
    private Image_____________________________ image;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("isFollowing")
    private boolean isFollowing;
    @JsonProperty("briefCatalogId")
    private String briefCatalogId;
    @JsonProperty("relatedTopics")
    private List<Object> relatedTopics = null;
    @JsonProperty("visibility")
    private long visibility;
    @JsonProperty("relatedTags")
    private List<Object> relatedTags = null;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("topicId")
    public String getTopicId() {
        return topicId;
    }

    @JsonProperty("topicId")
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("createdAt")
    public long getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("deletedAt")
    public long getDeletedAt() {
        return deletedAt;
    }

    @JsonProperty("deletedAt")
    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }

    @JsonProperty("image")
    public Image_____________________________ getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image_____________________________ image) {
        this.image = image;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("isFollowing")
    public boolean isIsFollowing() {
        return isFollowing;
    }

    @JsonProperty("isFollowing")
    public void setIsFollowing(boolean isFollowing) {
        this.isFollowing = isFollowing;
    }

    @JsonProperty("briefCatalogId")
    public String getBriefCatalogId() {
        return briefCatalogId;
    }

    @JsonProperty("briefCatalogId")
    public void setBriefCatalogId(String briefCatalogId) {
        this.briefCatalogId = briefCatalogId;
    }

    @JsonProperty("relatedTopics")
    public List<Object> getRelatedTopics() {
        return relatedTopics;
    }

    @JsonProperty("relatedTopics")
    public void setRelatedTopics(List<Object> relatedTopics) {
        this.relatedTopics = relatedTopics;
    }

    @JsonProperty("visibility")
    public long getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("relatedTags")
    public List<Object> getRelatedTags() {
        return relatedTags;
    }

    @JsonProperty("relatedTags")
    public void setRelatedTags(List<Object> relatedTags) {
        this.relatedTags = relatedTags;
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
        return new ToStringBuilder(this).append("topicId", topicId).append("slug", slug).append("createdAt", createdAt).append("deletedAt", deletedAt).append("image", image).append("name", name).append("description", description).append("isFollowing", isFollowing).append("briefCatalogId", briefCatalogId).append("relatedTopics", relatedTopics).append("visibility", visibility).append("relatedTags", relatedTags).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(visibility).append(relatedTags).append(image).append(briefCatalogId).append(type).append(relatedTopics).append(additionalProperties).append(description).append(createdAt).append(name).append(deletedAt).append(topicId).append(slug).append(isFollowing).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof F862bfc84e38) == false) {
            return false;
        }
        F862bfc84e38 rhs = ((F862bfc84e38) other);
        return new EqualsBuilder().append(visibility, rhs.visibility).append(relatedTags, rhs.relatedTags).append(image, rhs.image).append(briefCatalogId, rhs.briefCatalogId).append(type, rhs.type).append(relatedTopics, rhs.relatedTopics).append(additionalProperties, rhs.additionalProperties).append(description, rhs.description).append(createdAt, rhs.createdAt).append(name, rhs.name).append(deletedAt, rhs.deletedAt).append(topicId, rhs.topicId).append(slug, rhs.slug).append(isFollowing, rhs.isFollowing).isEquals();
    }

}
