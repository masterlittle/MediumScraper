
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
    "paragraphs",
    "sections"
})
public class BodyModel__ {

    @JsonProperty("paragraphs")
    private List<Paragraph__> paragraphs = null;
    @JsonProperty("sections")
    private List<Section_____> sections = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paragraphs")
    public List<Paragraph__> getParagraphs() {
        return paragraphs;
    }

    @JsonProperty("paragraphs")
    public void setParagraphs(List<Paragraph__> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @JsonProperty("sections")
    public List<Section_____> getSections() {
        return sections;
    }

    @JsonProperty("sections")
    public void setSections(List<Section_____> sections) {
        this.sections = sections;
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
        return new ToStringBuilder(this).append("paragraphs", paragraphs).append("sections", sections).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sections).append(additionalProperties).append(paragraphs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BodyModel__) == false) {
            return false;
        }
        BodyModel__ rhs = ((BodyModel__) other);
        return new EqualsBuilder().append(sections, rhs.sections).append(additionalProperties, rhs.additionalProperties).append(paragraphs, rhs.paragraphs).isEquals();
    }

}
