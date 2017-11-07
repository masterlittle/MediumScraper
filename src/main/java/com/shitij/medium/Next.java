
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
    "limit",
    "to"
})
public class Next {

    @JsonProperty("limit")
    private long limit;
    @JsonProperty("to")
    private String to;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("limit")
    public long getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(long limit) {
        this.limit = limit;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
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
        return new ToStringBuilder(this).append("limit", limit).append("to", to).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(to).append(limit).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Next) == false) {
            return false;
        }
        Next rhs = ((Next) other);
        return new EqualsBuilder().append(to, rhs.to).append(limit, rhs.limit).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
