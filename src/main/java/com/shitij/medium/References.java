
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
    "Collection",
    "User",
    "Post"
})
public class References {

    @JsonProperty("Collection")
    private Collection collection;
    @JsonProperty("User")
    private User user;
    @JsonProperty("Post")
    private Post_ post;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Collection")
    public Collection getCollection() {
        return collection;
    }

    @JsonProperty("Collection")
    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    @JsonProperty("User")
    public User getUser() {
        return user;
    }

    @JsonProperty("User")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("Post")
    public Post_ getPost() {
        return post;
    }

    @JsonProperty("Post")
    public void setPost(Post_ post) {
        this.post = post;
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
        return new ToStringBuilder(this).append("collection", collection).append("user", user).append("post", post).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(post).append(additionalProperties).append(collection).append(user).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof References) == false) {
            return false;
        }
        References rhs = ((References) other);
        return new EqualsBuilder().append(post, rhs.post).append(additionalProperties, rhs.additionalProperties).append(collection, rhs.collection).append(user, rhs.user).isEquals();
    }

}
