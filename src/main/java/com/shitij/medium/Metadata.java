
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
    "activeAt"
})
public class Metadata {

    @JsonProperty("followerCount")
    private long followerCount;
    @JsonProperty("activeAt")
    private long activeAt;
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

    @JsonProperty("activeAt")
    public long getActiveAt() {
        return activeAt;
    }

    @JsonProperty("activeAt")
    public void setActiveAt(long activeAt) {
        this.activeAt = activeAt;
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
        return new ToStringBuilder(this).append("followerCount", followerCount).append("activeAt", activeAt).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(activeAt).append(followerCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata) == false) {
            return false;
        }
        Metadata rhs = ((Metadata) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(activeAt, rhs.activeAt).append(followerCount, rhs.followerCount).isEquals();
    }

}
