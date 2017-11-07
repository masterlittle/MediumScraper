
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
    "defaultBackgroundSpectrum",
    "highlightSpectrum"
})
public class ColorPalette_ {

    @JsonProperty("defaultBackgroundSpectrum")
    private DefaultBackgroundSpectrum_ defaultBackgroundSpectrum;
    @JsonProperty("highlightSpectrum")
    private HighlightSpectrum_ highlightSpectrum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("defaultBackgroundSpectrum")
    public DefaultBackgroundSpectrum_ getDefaultBackgroundSpectrum() {
        return defaultBackgroundSpectrum;
    }

    @JsonProperty("defaultBackgroundSpectrum")
    public void setDefaultBackgroundSpectrum(DefaultBackgroundSpectrum_ defaultBackgroundSpectrum) {
        this.defaultBackgroundSpectrum = defaultBackgroundSpectrum;
    }

    @JsonProperty("highlightSpectrum")
    public HighlightSpectrum_ getHighlightSpectrum() {
        return highlightSpectrum;
    }

    @JsonProperty("highlightSpectrum")
    public void setHighlightSpectrum(HighlightSpectrum_ highlightSpectrum) {
        this.highlightSpectrum = highlightSpectrum;
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
        return new ToStringBuilder(this).append("defaultBackgroundSpectrum", defaultBackgroundSpectrum).append("highlightSpectrum", highlightSpectrum).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(highlightSpectrum).append(defaultBackgroundSpectrum).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ColorPalette_) == false) {
            return false;
        }
        ColorPalette_ rhs = ((ColorPalette_) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(highlightSpectrum, rhs.highlightSpectrum).append(defaultBackgroundSpectrum, rhs.defaultBackgroundSpectrum).isEquals();
    }

}
