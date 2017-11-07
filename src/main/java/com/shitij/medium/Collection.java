
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
    "9ae413a59f94",
    "d7bc9724d3bd"
})
public class Collection {

    @JsonProperty("9ae413a59f94")
    private com.shitij.medium._9ae413a59f94 _9ae413a59f94;
    @JsonProperty("d7bc9724d3bd")
    private D7bc9724d3bd d7bc9724d3bd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("9ae413a59f94")
    public com.shitij.medium._9ae413a59f94 get9ae413a59f94() {
        return _9ae413a59f94;
    }

    @JsonProperty("9ae413a59f94")
    public void set9ae413a59f94(com.shitij.medium._9ae413a59f94 _9ae413a59f94) {
        this._9ae413a59f94 = _9ae413a59f94;
    }

    @JsonProperty("d7bc9724d3bd")
    public D7bc9724d3bd getD7bc9724d3bd() {
        return d7bc9724d3bd;
    }

    @JsonProperty("d7bc9724d3bd")
    public void setD7bc9724d3bd(D7bc9724d3bd d7bc9724d3bd) {
        this.d7bc9724d3bd = d7bc9724d3bd;
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
        return new ToStringBuilder(this).append("_9ae413a59f94", _9ae413a59f94).append("d7bc9724d3bd", d7bc9724d3bd).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(_9ae413a59f94).append(d7bc9724d3bd).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Collection) == false) {
            return false;
        }
        Collection rhs = ((Collection) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(_9ae413a59f94, rhs._9ae413a59f94).append(d7bc9724d3bd, rhs.d7bc9724d3bd).isEquals();
    }

}
