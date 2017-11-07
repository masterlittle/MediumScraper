
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
    "usersFollowedCount",
    "usersFollowedByCount",
    "type"
})
public class SocialStats {

    @JsonProperty("userId")
    private String userId;
    @JsonProperty("usersFollowedCount")
    private long usersFollowedCount;
    @JsonProperty("usersFollowedByCount")
    private long usersFollowedByCount;
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

    @JsonProperty("usersFollowedCount")
    public long getUsersFollowedCount() {
        return usersFollowedCount;
    }

    @JsonProperty("usersFollowedCount")
    public void setUsersFollowedCount(long usersFollowedCount) {
        this.usersFollowedCount = usersFollowedCount;
    }

    @JsonProperty("usersFollowedByCount")
    public long getUsersFollowedByCount() {
        return usersFollowedByCount;
    }

    @JsonProperty("usersFollowedByCount")
    public void setUsersFollowedByCount(long usersFollowedByCount) {
        this.usersFollowedByCount = usersFollowedByCount;
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
        return new ToStringBuilder(this).append("userId", userId).append("usersFollowedCount", usersFollowedCount).append("usersFollowedByCount", usersFollowedByCount).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(usersFollowedCount).append(userId).append(usersFollowedByCount).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SocialStats) == false) {
            return false;
        }
        SocialStats rhs = ((SocialStats) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(usersFollowedCount, rhs.usersFollowedCount).append(userId, rhs.userId).append(usersFollowedByCount, rhs.usersFollowedByCount).append(type, rhs.type).isEquals();
    }

}
