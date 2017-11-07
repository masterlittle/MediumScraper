
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
    "42753d992dfc"
})
public class Social_ {

    @JsonProperty("42753d992dfc")
    private _42753d992dfc_ _42753d992dfc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("42753d992dfc")
    public _42753d992dfc_ get42753d992dfc() {
        return _42753d992dfc;
    }

    @JsonProperty("42753d992dfc")
    public void set42753d992dfc(_42753d992dfc_ _42753d992dfc) {
        this._42753d992dfc = _42753d992dfc;
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
        return new ToStringBuilder(this).append("_42753d992dfc", _42753d992dfc).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(_42753d992dfc).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Social_) == false) {
            return false;
        }
        Social_ rhs = ((Social_) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(_42753d992dfc, rhs._42753d992dfc).isEquals();
    }

}
