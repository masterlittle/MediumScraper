
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
    "subtitle",
    "bodyModel",
    "postDisplay"
})
public class Content {

    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("bodyModel")
    private BodyModel bodyModel;
    @JsonProperty("postDisplay")
    private PostDisplay postDisplay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("bodyModel")
    public BodyModel getBodyModel() {
        return bodyModel;
    }

    @JsonProperty("bodyModel")
    public void setBodyModel(BodyModel bodyModel) {
        this.bodyModel = bodyModel;
    }

    @JsonProperty("postDisplay")
    public PostDisplay getPostDisplay() {
        return postDisplay;
    }

    @JsonProperty("postDisplay")
    public void setPostDisplay(PostDisplay postDisplay) {
        this.postDisplay = postDisplay;
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
        return new ToStringBuilder(this).append("subtitle", subtitle).append("bodyModel", bodyModel).append("postDisplay", postDisplay).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(postDisplay).append(bodyModel).append(subtitle).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Content) == false) {
            return false;
        }
        Content rhs = ((Content) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(postDisplay, rhs.postDisplay).append(bodyModel, rhs.bodyModel).append(subtitle, rhs.subtitle).isEquals();
    }

}
