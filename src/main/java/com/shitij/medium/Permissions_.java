
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
    "canPublish",
    "canPublishAll",
    "canRepublish",
    "canRemove",
    "canManageAll",
    "canSubmit",
    "canEditPosts",
    "canAddWriters",
    "canViewStats",
    "canSendNewsletter",
    "canViewLockedPosts",
    "canViewCloaked",
    "canEditOwnPosts",
    "canBeAssignedAuthor",
    "canEnrollInHightower",
    "canLockPostsForMediumMembers"
})
public class Permissions_ {

    @JsonProperty("canPublish")
    private boolean canPublish;
    @JsonProperty("canPublishAll")
    private boolean canPublishAll;
    @JsonProperty("canRepublish")
    private boolean canRepublish;
    @JsonProperty("canRemove")
    private boolean canRemove;
    @JsonProperty("canManageAll")
    private boolean canManageAll;
    @JsonProperty("canSubmit")
    private boolean canSubmit;
    @JsonProperty("canEditPosts")
    private boolean canEditPosts;
    @JsonProperty("canAddWriters")
    private boolean canAddWriters;
    @JsonProperty("canViewStats")
    private boolean canViewStats;
    @JsonProperty("canSendNewsletter")
    private boolean canSendNewsletter;
    @JsonProperty("canViewLockedPosts")
    private boolean canViewLockedPosts;
    @JsonProperty("canViewCloaked")
    private boolean canViewCloaked;
    @JsonProperty("canEditOwnPosts")
    private boolean canEditOwnPosts;
    @JsonProperty("canBeAssignedAuthor")
    private boolean canBeAssignedAuthor;
    @JsonProperty("canEnrollInHightower")
    private boolean canEnrollInHightower;
    @JsonProperty("canLockPostsForMediumMembers")
    private boolean canLockPostsForMediumMembers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("canPublish")
    public boolean isCanPublish() {
        return canPublish;
    }

    @JsonProperty("canPublish")
    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    @JsonProperty("canPublishAll")
    public boolean isCanPublishAll() {
        return canPublishAll;
    }

    @JsonProperty("canPublishAll")
    public void setCanPublishAll(boolean canPublishAll) {
        this.canPublishAll = canPublishAll;
    }

    @JsonProperty("canRepublish")
    public boolean isCanRepublish() {
        return canRepublish;
    }

    @JsonProperty("canRepublish")
    public void setCanRepublish(boolean canRepublish) {
        this.canRepublish = canRepublish;
    }

    @JsonProperty("canRemove")
    public boolean isCanRemove() {
        return canRemove;
    }

    @JsonProperty("canRemove")
    public void setCanRemove(boolean canRemove) {
        this.canRemove = canRemove;
    }

    @JsonProperty("canManageAll")
    public boolean isCanManageAll() {
        return canManageAll;
    }

    @JsonProperty("canManageAll")
    public void setCanManageAll(boolean canManageAll) {
        this.canManageAll = canManageAll;
    }

    @JsonProperty("canSubmit")
    public boolean isCanSubmit() {
        return canSubmit;
    }

    @JsonProperty("canSubmit")
    public void setCanSubmit(boolean canSubmit) {
        this.canSubmit = canSubmit;
    }

    @JsonProperty("canEditPosts")
    public boolean isCanEditPosts() {
        return canEditPosts;
    }

    @JsonProperty("canEditPosts")
    public void setCanEditPosts(boolean canEditPosts) {
        this.canEditPosts = canEditPosts;
    }

    @JsonProperty("canAddWriters")
    public boolean isCanAddWriters() {
        return canAddWriters;
    }

    @JsonProperty("canAddWriters")
    public void setCanAddWriters(boolean canAddWriters) {
        this.canAddWriters = canAddWriters;
    }

    @JsonProperty("canViewStats")
    public boolean isCanViewStats() {
        return canViewStats;
    }

    @JsonProperty("canViewStats")
    public void setCanViewStats(boolean canViewStats) {
        this.canViewStats = canViewStats;
    }

    @JsonProperty("canSendNewsletter")
    public boolean isCanSendNewsletter() {
        return canSendNewsletter;
    }

    @JsonProperty("canSendNewsletter")
    public void setCanSendNewsletter(boolean canSendNewsletter) {
        this.canSendNewsletter = canSendNewsletter;
    }

    @JsonProperty("canViewLockedPosts")
    public boolean isCanViewLockedPosts() {
        return canViewLockedPosts;
    }

    @JsonProperty("canViewLockedPosts")
    public void setCanViewLockedPosts(boolean canViewLockedPosts) {
        this.canViewLockedPosts = canViewLockedPosts;
    }

    @JsonProperty("canViewCloaked")
    public boolean isCanViewCloaked() {
        return canViewCloaked;
    }

    @JsonProperty("canViewCloaked")
    public void setCanViewCloaked(boolean canViewCloaked) {
        this.canViewCloaked = canViewCloaked;
    }

    @JsonProperty("canEditOwnPosts")
    public boolean isCanEditOwnPosts() {
        return canEditOwnPosts;
    }

    @JsonProperty("canEditOwnPosts")
    public void setCanEditOwnPosts(boolean canEditOwnPosts) {
        this.canEditOwnPosts = canEditOwnPosts;
    }

    @JsonProperty("canBeAssignedAuthor")
    public boolean isCanBeAssignedAuthor() {
        return canBeAssignedAuthor;
    }

    @JsonProperty("canBeAssignedAuthor")
    public void setCanBeAssignedAuthor(boolean canBeAssignedAuthor) {
        this.canBeAssignedAuthor = canBeAssignedAuthor;
    }

    @JsonProperty("canEnrollInHightower")
    public boolean isCanEnrollInHightower() {
        return canEnrollInHightower;
    }

    @JsonProperty("canEnrollInHightower")
    public void setCanEnrollInHightower(boolean canEnrollInHightower) {
        this.canEnrollInHightower = canEnrollInHightower;
    }

    @JsonProperty("canLockPostsForMediumMembers")
    public boolean isCanLockPostsForMediumMembers() {
        return canLockPostsForMediumMembers;
    }

    @JsonProperty("canLockPostsForMediumMembers")
    public void setCanLockPostsForMediumMembers(boolean canLockPostsForMediumMembers) {
        this.canLockPostsForMediumMembers = canLockPostsForMediumMembers;
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
        return new ToStringBuilder(this).append("canPublish", canPublish).append("canPublishAll", canPublishAll).append("canRepublish", canRepublish).append("canRemove", canRemove).append("canManageAll", canManageAll).append("canSubmit", canSubmit).append("canEditPosts", canEditPosts).append("canAddWriters", canAddWriters).append("canViewStats", canViewStats).append("canSendNewsletter", canSendNewsletter).append("canViewLockedPosts", canViewLockedPosts).append("canViewCloaked", canViewCloaked).append("canEditOwnPosts", canEditOwnPosts).append("canBeAssignedAuthor", canBeAssignedAuthor).append("canEnrollInHightower", canEnrollInHightower).append("canLockPostsForMediumMembers", canLockPostsForMediumMembers).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(canEnrollInHightower).append(canViewLockedPosts).append(canViewStats).append(canLockPostsForMediumMembers).append(canSubmit).append(canEditPosts).append(canPublish).append(canViewCloaked).append(canAddWriters).append(canRepublish).append(canSendNewsletter).append(canEditOwnPosts).append(additionalProperties).append(canManageAll).append(canRemove).append(canPublishAll).append(canBeAssignedAuthor).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Permissions_) == false) {
            return false;
        }
        Permissions_ rhs = ((Permissions_) other);
        return new EqualsBuilder().append(canEnrollInHightower, rhs.canEnrollInHightower).append(canViewLockedPosts, rhs.canViewLockedPosts).append(canViewStats, rhs.canViewStats).append(canLockPostsForMediumMembers, rhs.canLockPostsForMediumMembers).append(canSubmit, rhs.canSubmit).append(canEditPosts, rhs.canEditPosts).append(canPublish, rhs.canPublish).append(canViewCloaked, rhs.canViewCloaked).append(canAddWriters, rhs.canAddWriters).append(canRepublish, rhs.canRepublish).append(canSendNewsletter, rhs.canSendNewsletter).append(canEditOwnPosts, rhs.canEditOwnPosts).append(additionalProperties, rhs.additionalProperties).append(canManageAll, rhs.canManageAll).append(canRemove, rhs.canRemove).append(canPublishAll, rhs.canPublishAll).append(canBeAssignedAuthor, rhs.canBeAssignedAuthor).isEquals();
    }

}
