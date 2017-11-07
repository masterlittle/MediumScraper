
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
    "color",
    "point"
})
public class ColorPoint {

    @JsonProperty("color")
    private String color;
    @JsonProperty("point")
    private long point;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("point")
    public long getPoint() {
        return point;
    }

    @JsonProperty("point")
    public void setPoint(long point) {
        this.point = point;
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
        return new ToStringBuilder(this).append("color", color).append("point", point).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(point).append(color).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ColorPoint) == false) {
            return false;
        }
        ColorPoint rhs = ((ColorPoint) other);
        return new EqualsBuilder().append(point, rhs.point).append(color, rhs.color).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
