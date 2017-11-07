
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
    "User",
    "Social",
    "SocialStats"
})
public class References {

    @JsonProperty("User")
    private User user;
    @JsonProperty("Social")
    private Social_ social;
    @JsonProperty("SocialStats")
    private SocialStats_ socialStats;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("User")
    public User getUser() {
        return user;
    }

    @JsonProperty("User")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("Social")
    public Social_ getSocial() {
        return social;
    }

    @JsonProperty("Social")
    public void setSocial(Social_ social) {
        this.social = social;
    }

    @JsonProperty("SocialStats")
    public SocialStats_ getSocialStats() {
        return socialStats;
    }

    @JsonProperty("SocialStats")
    public void setSocialStats(SocialStats_ socialStats) {
        this.socialStats = socialStats;
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
        return new ToStringBuilder(this).append("user", user).append("social", social).append("socialStats", socialStats).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(socialStats).append(additionalProperties).append(social).append(user).toHashCode();
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
        return new EqualsBuilder().append(socialStats, rhs.socialStats).append(additionalProperties, rhs.additionalProperties).append(social, rhs.social).append(user, rhs.user).isEquals();
    }

}
