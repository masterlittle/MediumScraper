
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
    "type",
    "start",
    "end"
})
public class Markup {

    @JsonProperty("type")
    private long type;
    @JsonProperty("start")
    private long start;
    @JsonProperty("end")
    private long end;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public long getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(long type) {
        this.type = type;
    }

    @JsonProperty("start")
    public long getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(long start) {
        this.start = start;
    }

    @JsonProperty("end")
    public long getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(long end) {
        this.end = end;
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
        return new ToStringBuilder(this).append("type", type).append("start", start).append("end", end).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(start).append(additionalProperties).append(type).append(end).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Markup) == false) {
            return false;
        }
        Markup rhs = ((Markup) other);
        return new EqualsBuilder().append(start, rhs.start).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(end, rhs.end).isEquals();
    }

}
