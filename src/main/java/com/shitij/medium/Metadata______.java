
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
    "followerCount",
    "postCount",
    "coverImage"
})
public class Metadata______ {

    @JsonProperty("followerCount")
    private long followerCount;
    @JsonProperty("postCount")
    private long postCount;
    @JsonProperty("coverImage")
    private CoverImage__ coverImage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("followerCount")
    public long getFollowerCount() {
        return followerCount;
    }

    @JsonProperty("followerCount")
    public void setFollowerCount(long followerCount) {
        this.followerCount = followerCount;
    }

    @JsonProperty("postCount")
    public long getPostCount() {
        return postCount;
    }

    @JsonProperty("postCount")
    public void setPostCount(long postCount) {
        this.postCount = postCount;
    }

    @JsonProperty("coverImage")
    public CoverImage__ getCoverImage() {
        return coverImage;
    }

    @JsonProperty("coverImage")
    public void setCoverImage(CoverImage__ coverImage) {
        this.coverImage = coverImage;
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
        return new ToStringBuilder(this).append("followerCount", followerCount).append("postCount", postCount).append("coverImage", coverImage).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(postCount).append(followerCount).append(coverImage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata______) == false) {
            return false;
        }
        Metadata______ rhs = ((Metadata______) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(postCount, rhs.postCount).append(followerCount, rhs.followerCount).append(coverImage, rhs.coverImage).isEquals();
    }

}
