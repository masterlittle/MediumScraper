
package com.shitij.medium.topics;

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
    "fallbackTitle",
    "headingBasic",
    "headingType"
})
public class Heading {

    @JsonProperty("fallbackTitle")
    private String fallbackTitle;
    @JsonProperty("headingBasic")
    private HeadingBasic headingBasic;
    @JsonProperty("headingType")
    private String headingType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fallbackTitle")
    public String getFallbackTitle() {
        return fallbackTitle;
    }

    @JsonProperty("fallbackTitle")
    public void setFallbackTitle(String fallbackTitle) {
        this.fallbackTitle = fallbackTitle;
    }

    @JsonProperty("headingBasic")
    public HeadingBasic getHeadingBasic() {
        return headingBasic;
    }

    @JsonProperty("headingBasic")
    public void setHeadingBasic(HeadingBasic headingBasic) {
        this.headingBasic = headingBasic;
    }

    @JsonProperty("headingType")
    public String getHeadingType() {
        return headingType;
    }

    @JsonProperty("headingType")
    public void setHeadingType(String headingType) {
        this.headingType = headingType;
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
        return new ToStringBuilder(this).append("fallbackTitle", fallbackTitle).append("headingBasic", headingBasic).append("headingType", headingType).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(headingBasic).append(headingType).append(fallbackTitle).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Heading) == false) {
            return false;
        }
        Heading rhs = ((Heading) other);
        return new EqualsBuilder().append(headingBasic, rhs.headingBasic).append(headingType, rhs.headingType).append(fallbackTitle, rhs.fallbackTitle).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
