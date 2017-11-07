
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
    "name",
    "type",
    "text",
    "markups",
    "alignment"
})
public class Paragraph_ {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private long type;
    @JsonProperty("text")
    private String text;
    @JsonProperty("markups")
    private List<Markup_> markups = null;
    @JsonProperty("alignment")
    private long alignment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public long getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(long type) {
        this.type = type;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("markups")
    public List<Markup_> getMarkups() {
        return markups;
    }

    @JsonProperty("markups")
    public void setMarkups(List<Markup_> markups) {
        this.markups = markups;
    }

    @JsonProperty("alignment")
    public long getAlignment() {
        return alignment;
    }

    @JsonProperty("alignment")
    public void setAlignment(long alignment) {
        this.alignment = alignment;
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
        return new ToStringBuilder(this).append("name", name).append("type", type).append("text", text).append("markups", markups).append("alignment", alignment).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(alignment).append(markups).append(text).append(additionalProperties).append(name).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Paragraph_) == false) {
            return false;
        }
        Paragraph_ rhs = ((Paragraph_) other);
        return new EqualsBuilder().append(alignment, rhs.alignment).append(markups, rhs.markups).append(text, rhs.text).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(type, rhs.type).isEquals();
    }

}
