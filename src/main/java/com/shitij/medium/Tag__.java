
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
    "slug",
    "name",
    "postCount",
    "virtuals",
    "metadata",
    "type"
})
public class Tag__ {

    @JsonProperty("slug")
    private String slug;
    @JsonProperty("name")
    private String name;
    @JsonProperty("postCount")
    private long postCount;
    @JsonProperty("virtuals")
    private Virtuals_______ virtuals;
    @JsonProperty("metadata")
    private Metadata______ metadata;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("postCount")
    public long getPostCount() {
        return postCount;
    }

    @JsonProperty("postCount")
    public void setPostCount(long postCount) {
        this.postCount = postCount;
    }

    @JsonProperty("virtuals")
    public Virtuals_______ getVirtuals() {
        return virtuals;
    }

    @JsonProperty("virtuals")
    public void setVirtuals(Virtuals_______ virtuals) {
        this.virtuals = virtuals;
    }

    @JsonProperty("metadata")
    public Metadata______ getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata______ metadata) {
        this.metadata = metadata;
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
        return new ToStringBuilder(this).append("slug", slug).append("name", name).append("postCount", postCount).append("virtuals", virtuals).append("metadata", metadata).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(name).append(slug).append(postCount).append(type).append(metadata).append(virtuals).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tag__) == false) {
            return false;
        }
        Tag__ rhs = ((Tag__) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(slug, rhs.slug).append(postCount, rhs.postCount).append(type, rhs.type).append(metadata, rhs.metadata).append(virtuals, rhs.virtuals).isEquals();
    }

}
