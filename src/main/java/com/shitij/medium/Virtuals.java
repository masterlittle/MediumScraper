
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
    "permissions",
    "isSubscribed",
    "isNewsletterSubscribed",
    "memberOfMembershipPlanId",
    "isEnrolledInHightower",
    "isEligibleForHightower"
})
public class Virtuals {

    @JsonProperty("permissions")
    private Permissions permissions;
    @JsonProperty("isSubscribed")
    private boolean isSubscribed;
    @JsonProperty("isNewsletterSubscribed")
    private boolean isNewsletterSubscribed;
    @JsonProperty("memberOfMembershipPlanId")
    private String memberOfMembershipPlanId;
    @JsonProperty("isEnrolledInHightower")
    private boolean isEnrolledInHightower;
    @JsonProperty("isEligibleForHightower")
    private boolean isEligibleForHightower;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("permissions")
    public Permissions getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonProperty("isSubscribed")
    public boolean isIsSubscribed() {
        return isSubscribed;
    }

    @JsonProperty("isSubscribed")
    public void setIsSubscribed(boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    @JsonProperty("isNewsletterSubscribed")
    public boolean isIsNewsletterSubscribed() {
        return isNewsletterSubscribed;
    }

    @JsonProperty("isNewsletterSubscribed")
    public void setIsNewsletterSubscribed(boolean isNewsletterSubscribed) {
        this.isNewsletterSubscribed = isNewsletterSubscribed;
    }

    @JsonProperty("memberOfMembershipPlanId")
    public String getMemberOfMembershipPlanId() {
        return memberOfMembershipPlanId;
    }

    @JsonProperty("memberOfMembershipPlanId")
    public void setMemberOfMembershipPlanId(String memberOfMembershipPlanId) {
        this.memberOfMembershipPlanId = memberOfMembershipPlanId;
    }

    @JsonProperty("isEnrolledInHightower")
    public boolean isIsEnrolledInHightower() {
        return isEnrolledInHightower;
    }

    @JsonProperty("isEnrolledInHightower")
    public void setIsEnrolledInHightower(boolean isEnrolledInHightower) {
        this.isEnrolledInHightower = isEnrolledInHightower;
    }

    @JsonProperty("isEligibleForHightower")
    public boolean isIsEligibleForHightower() {
        return isEligibleForHightower;
    }

    @JsonProperty("isEligibleForHightower")
    public void setIsEligibleForHightower(boolean isEligibleForHightower) {
        this.isEligibleForHightower = isEligibleForHightower;
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
        return new ToStringBuilder(this).append("permissions", permissions).append("isSubscribed", isSubscribed).append("isNewsletterSubscribed", isNewsletterSubscribed).append("memberOfMembershipPlanId", memberOfMembershipPlanId).append("isEnrolledInHightower", isEnrolledInHightower).append("isEligibleForHightower", isEligibleForHightower).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isEligibleForHightower).append(additionalProperties).append(memberOfMembershipPlanId).append(permissions).append(isNewsletterSubscribed).append(isEnrolledInHightower).append(isSubscribed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Virtuals) == false) {
            return false;
        }
        Virtuals rhs = ((Virtuals) other);
        return new EqualsBuilder().append(isEligibleForHightower, rhs.isEligibleForHightower).append(additionalProperties, rhs.additionalProperties).append(memberOfMembershipPlanId, rhs.memberOfMembershipPlanId).append(permissions, rhs.permissions).append(isNewsletterSubscribed, rhs.isNewsletterSubscribed).append(isEnrolledInHightower, rhs.isEnrolledInHightower).append(isSubscribed, rhs.isSubscribed).isEquals();
    }

}
