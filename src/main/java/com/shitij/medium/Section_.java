
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
    "type",
    "collectionHeaderMetadata",
    "postListMetadata"
})
public class Section_ {

    @JsonProperty("type")
    private long type;
    @JsonProperty("collectionHeaderMetadata")
    private CollectionHeaderMetadata collectionHeaderMetadata;
    @JsonProperty("postListMetadata")
    private PostListMetadata postListMetadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public long getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(long type) {
        this.type = type;
    }

    @JsonProperty("collectionHeaderMetadata")
    public CollectionHeaderMetadata getCollectionHeaderMetadata() {
        return collectionHeaderMetadata;
    }

    @JsonProperty("collectionHeaderMetadata")
    public void setCollectionHeaderMetadata(CollectionHeaderMetadata collectionHeaderMetadata) {
        this.collectionHeaderMetadata = collectionHeaderMetadata;
    }

    @JsonProperty("postListMetadata")
    public PostListMetadata getPostListMetadata() {
        return postListMetadata;
    }

    @JsonProperty("postListMetadata")
    public void setPostListMetadata(PostListMetadata postListMetadata) {
        this.postListMetadata = postListMetadata;
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
        return new ToStringBuilder(this).append("type", type).append("collectionHeaderMetadata", collectionHeaderMetadata).append("postListMetadata", postListMetadata).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(postListMetadata).append(additionalProperties).append(collectionHeaderMetadata).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Section_) == false) {
            return false;
        }
        Section_ rhs = ((Section_) other);
        return new EqualsBuilder().append(postListMetadata, rhs.postListMetadata).append(additionalProperties, rhs.additionalProperties).append(collectionHeaderMetadata, rhs.collectionHeaderMetadata).append(type, rhs.type).isEquals();
    }

}
