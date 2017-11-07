
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
    "collectionId",
    "userId",
    "role"
})
public class CollectionUserRelation {

    @JsonProperty("collectionId")
    private String collectionId;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("role")
    private String role;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("collectionId")
    public String getCollectionId() {
        return collectionId;
    }

    @JsonProperty("collectionId")
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
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
        return new ToStringBuilder(this).append("collectionId", collectionId).append("userId", userId).append("role", role).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(collectionId).append(additionalProperties).append(userId).append(role).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CollectionUserRelation) == false) {
            return false;
        }
        CollectionUserRelation rhs = ((CollectionUserRelation) other);
        return new EqualsBuilder().append(collectionId, rhs.collectionId).append(additionalProperties, rhs.additionalProperties).append(userId, rhs.userId).append(role, rhs.role).isEquals();
    }

}
