
package com.shitij.medium.posts;

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
    "targetUserId",
    "type"
})
public class Social {

    @JsonProperty("userId")
    private String userId;
    @JsonProperty("targetUserId")
    private String targetUserId;
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

    @JsonProperty("targetUserId")
    public String getTargetUserId() {
        return targetUserId;
    }

    @JsonProperty("targetUserId")
    public void setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
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
        return new ToStringBuilder(this).append("userId", userId).append("targetUserId", targetUserId).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(targetUserId).append(userId).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Social) == false) {
            return false;
        }
        Social rhs = ((Social) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(targetUserId, rhs.targetUserId).append(userId, rhs.userId).append(type, rhs.type).isEquals();
    }

}
