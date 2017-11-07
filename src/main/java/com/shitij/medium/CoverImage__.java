
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
    "id",
    "originalWidth",
    "originalHeight",
    "isFeatured"
})
public class CoverImage__ {

    @JsonProperty("id")
    private String id;
    @JsonProperty("originalWidth")
    private long originalWidth;
    @JsonProperty("originalHeight")
    private long originalHeight;
    @JsonProperty("isFeatured")
    private boolean isFeatured;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("originalWidth")
    public long getOriginalWidth() {
        return originalWidth;
    }

    @JsonProperty("originalWidth")
    public void setOriginalWidth(long originalWidth) {
        this.originalWidth = originalWidth;
    }

    @JsonProperty("originalHeight")
    public long getOriginalHeight() {
        return originalHeight;
    }

    @JsonProperty("originalHeight")
    public void setOriginalHeight(long originalHeight) {
        this.originalHeight = originalHeight;
    }

    @JsonProperty("isFeatured")
    public boolean isIsFeatured() {
        return isFeatured;
    }

    @JsonProperty("isFeatured")
    public void setIsFeatured(boolean isFeatured) {
        this.isFeatured = isFeatured;
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
        return new ToStringBuilder(this).append("id", id).append("originalWidth", originalWidth).append("originalHeight", originalHeight).append("isFeatured", isFeatured).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(originalHeight).append(additionalProperties).append(isFeatured).append(originalWidth).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoverImage__) == false) {
            return false;
        }
        CoverImage__ rhs = ((CoverImage__) other);
        return new EqualsBuilder().append(id, rhs.id).append(originalHeight, rhs.originalHeight).append(additionalProperties, rhs.additionalProperties).append(isFeatured, rhs.isFeatured).append(originalWidth, rhs.originalWidth).isEquals();
    }

}
