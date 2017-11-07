
package com.shitij.medium.topics;

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
    "items",
    "layout",
    "heading"
})
public class Section {

    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("layout")
    private long layout;
    @JsonProperty("heading")
    private Heading heading;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("layout")
    public long getLayout() {
        return layout;
    }

    @JsonProperty("layout")
    public void setLayout(long layout) {
        this.layout = layout;
    }

    @JsonProperty("heading")
    public Heading getHeading() {
        return heading;
    }

    @JsonProperty("heading")
    public void setHeading(Heading heading) {
        this.heading = heading;
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
        return new ToStringBuilder(this).append("items", items).append("layout", layout).append("heading", heading).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(items).append(additionalProperties).append(layout).append(heading).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Section) == false) {
            return false;
        }
        Section rhs = ((Section) other);
        return new EqualsBuilder().append(items, rhs.items).append(additionalProperties, rhs.additionalProperties).append(layout, rhs.layout).append(heading, rhs.heading).isEquals();
    }

}
