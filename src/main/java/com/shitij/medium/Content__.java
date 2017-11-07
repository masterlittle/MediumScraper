
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
    "subtitle",
    "postDisplay"
})
public class Content__ {

    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("postDisplay")
    private PostDisplay__ postDisplay;
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

    @JsonProperty("postDisplay")
    public PostDisplay__ getPostDisplay() {
        return postDisplay;
    }

    @JsonProperty("postDisplay")
    public void setPostDisplay(PostDisplay__ postDisplay) {
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
        return new ToStringBuilder(this).append("subtitle", subtitle).append("postDisplay", postDisplay).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(postDisplay).append(subtitle).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Content__) == false) {
            return false;
        }
        Content__ rhs = ((Content__) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(postDisplay, rhs.postDisplay).append(subtitle, rhs.subtitle).isEquals();
    }

}
