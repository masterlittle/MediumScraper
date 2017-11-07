
package com.shitij.medium;

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
    "source",
    "layout",
    "number",
    "postIds"
})
public class PostListMetadata_ {

    @JsonProperty("source")
    private long source;
    @JsonProperty("layout")
    private long layout;
    @JsonProperty("number")
    private long number;
    @JsonProperty("postIds")
    private List<Object> postIds = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("source")
    public long getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(long source) {
        this.source = source;
    }

    @JsonProperty("layout")
    public long getLayout() {
        return layout;
    }

    @JsonProperty("layout")
    public void setLayout(long layout) {
        this.layout = layout;
    }

    @JsonProperty("number")
    public long getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(long number) {
        this.number = number;
    }

    @JsonProperty("postIds")
    public List<Object> getPostIds() {
        return postIds;
    }

    @JsonProperty("postIds")
    public void setPostIds(List<Object> postIds) {
        this.postIds = postIds;
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
        return new ToStringBuilder(this).append("source", source).append("layout", layout).append("number", number).append("postIds", postIds).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(postIds).append(source).append(additionalProperties).append(layout).append(number).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PostListMetadata_) == false) {
            return false;
        }
        PostListMetadata_ rhs = ((PostListMetadata_) other);
        return new EqualsBuilder().append(postIds, rhs.postIds).append(source, rhs.source).append(additionalProperties, rhs.additionalProperties).append(layout, rhs.layout).append(number, rhs.number).isEquals();
    }

}
