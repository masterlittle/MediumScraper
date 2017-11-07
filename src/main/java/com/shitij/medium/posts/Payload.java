
package com.shitij.medium.posts;

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
    "value",
    "mentionedUsers",
    "collaborators",
    "membershipPlans",
    "collectionUserRelations",
    "mode",
    "references"
})
public class Payload {

    @JsonProperty("value")
    private Value value;
    @JsonProperty("mentionedUsers")
    private List<Object> mentionedUsers = null;
    @JsonProperty("collaborators")
    private List<Object> collaborators = null;
    @JsonProperty("membershipPlans")
    private List<Object> membershipPlans = null;
    @JsonProperty("collectionUserRelations")
    private List<CollectionUserRelation> collectionUserRelations = null;
    @JsonProperty("mode")
    private Object mode;
    @JsonProperty("references")
    private References references;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("value")
    public Value getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("mentionedUsers")
    public List<Object> getMentionedUsers() {
        return mentionedUsers;
    }

    @JsonProperty("mentionedUsers")
    public void setMentionedUsers(List<Object> mentionedUsers) {
        this.mentionedUsers = mentionedUsers;
    }

    @JsonProperty("collaborators")
    public List<Object> getCollaborators() {
        return collaborators;
    }

    @JsonProperty("collaborators")
    public void setCollaborators(List<Object> collaborators) {
        this.collaborators = collaborators;
    }

    @JsonProperty("membershipPlans")
    public List<Object> getMembershipPlans() {
        return membershipPlans;
    }

    @JsonProperty("membershipPlans")
    public void setMembershipPlans(List<Object> membershipPlans) {
        this.membershipPlans = membershipPlans;
    }

    @JsonProperty("collectionUserRelations")
    public List<CollectionUserRelation> getCollectionUserRelations() {
        return collectionUserRelations;
    }

    @JsonProperty("collectionUserRelations")
    public void setCollectionUserRelations(List<CollectionUserRelation> collectionUserRelations) {
        this.collectionUserRelations = collectionUserRelations;
    }

    @JsonProperty("mode")
    public Object getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(Object mode) {
        this.mode = mode;
    }

    @JsonProperty("references")
    public References getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(References references) {
        this.references = references;
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
        return new ToStringBuilder(this).append("value", value).append("mentionedUsers", mentionedUsers).append("collaborators", collaborators).append("membershipPlans", membershipPlans).append("collectionUserRelations", collectionUserRelations).append("mode", mode).append("references", references).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(membershipPlans).append(references).append(collaborators).append(collectionUserRelations).append(additionalProperties).append(value).append(mode).append(mentionedUsers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payload) == false) {
            return false;
        }
        Payload rhs = ((Payload) other);
        return new EqualsBuilder().append(membershipPlans, rhs.membershipPlans).append(references, rhs.references).append(collaborators, rhs.collaborators).append(collectionUserRelations, rhs.collectionUserRelations).append(additionalProperties, rhs.additionalProperties).append(value, rhs.value).append(mode, rhs.mode).append(mentionedUsers, rhs.mentionedUsers).isEquals();
    }

}
