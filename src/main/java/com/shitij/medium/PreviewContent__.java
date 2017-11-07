
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
    "bodyModel",
    "isFullContent"
})
public class PreviewContent__ {

    @JsonProperty("bodyModel")
    private BodyModel__ bodyModel;
    @JsonProperty("isFullContent")
    private boolean isFullContent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bodyModel")
    public BodyModel__ getBodyModel() {
        return bodyModel;
    }

    @JsonProperty("bodyModel")
    public void setBodyModel(BodyModel__ bodyModel) {
        this.bodyModel = bodyModel;
    }

    @JsonProperty("isFullContent")
    public boolean isIsFullContent() {
        return isFullContent;
    }

    @JsonProperty("isFullContent")
    public void setIsFullContent(boolean isFullContent) {
        this.isFullContent = isFullContent;
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
        return new ToStringBuilder(this).append("bodyModel", bodyModel).append("isFullContent", isFullContent).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(isFullContent).append(bodyModel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PreviewContent__) == false) {
            return false;
        }
        PreviewContent__ rhs = ((PreviewContent__) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(isFullContent, rhs.isFullContent).append(bodyModel, rhs.bodyModel).isEquals();
    }

}
