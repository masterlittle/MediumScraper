
package com.shitij.medium;

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
    "colorPoints",
    "backgroundColor"
})
public class TintBackgroundSpectrum {

    @JsonProperty("colorPoints")
    private List<ColorPoint_> colorPoints = null;
    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("colorPoints")
    public List<ColorPoint_> getColorPoints() {
        return colorPoints;
    }

    @JsonProperty("colorPoints")
    public void setColorPoints(List<ColorPoint_> colorPoints) {
        this.colorPoints = colorPoints;
    }

    @JsonProperty("backgroundColor")
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @JsonProperty("backgroundColor")
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
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
        return new ToStringBuilder(this).append("colorPoints", colorPoints).append("backgroundColor", backgroundColor).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(backgroundColor).append(colorPoints).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TintBackgroundSpectrum) == false) {
            return false;
        }
        TintBackgroundSpectrum rhs = ((TintBackgroundSpectrum) other);
        return new EqualsBuilder().append(backgroundColor, rhs.backgroundColor).append(colorPoints, rhs.colorPoints).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
