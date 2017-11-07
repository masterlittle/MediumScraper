
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
    "b86da61a66b4",
    "38f692f5ac9a",
    "374a801b3eb2"
})
public class User {

    @JsonProperty("b86da61a66b4")
    private B86da61a66b4 b86da61a66b4;
    @JsonProperty("38f692f5ac9a")
    private com.shitij.medium._38f692f5ac9a _38f692f5ac9a;
    @JsonProperty("374a801b3eb2")
    private com.shitij.medium._374a801b3eb2 _374a801b3eb2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("b86da61a66b4")
    public B86da61a66b4 getB86da61a66b4() {
        return b86da61a66b4;
    }

    @JsonProperty("b86da61a66b4")
    public void setB86da61a66b4(B86da61a66b4 b86da61a66b4) {
        this.b86da61a66b4 = b86da61a66b4;
    }

    @JsonProperty("38f692f5ac9a")
    public com.shitij.medium._38f692f5ac9a get38f692f5ac9a() {
        return _38f692f5ac9a;
    }

    @JsonProperty("38f692f5ac9a")
    public void set38f692f5ac9a(com.shitij.medium._38f692f5ac9a _38f692f5ac9a) {
        this._38f692f5ac9a = _38f692f5ac9a;
    }

    @JsonProperty("374a801b3eb2")
    public com.shitij.medium._374a801b3eb2 get374a801b3eb2() {
        return _374a801b3eb2;
    }

    @JsonProperty("374a801b3eb2")
    public void set374a801b3eb2(com.shitij.medium._374a801b3eb2 _374a801b3eb2) {
        this._374a801b3eb2 = _374a801b3eb2;
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
        return new ToStringBuilder(this).append("b86da61a66b4", b86da61a66b4).append("_38f692f5ac9a", _38f692f5ac9a).append("_374a801b3eb2", _374a801b3eb2).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_38f692f5ac9a).append(_374a801b3eb2).append(additionalProperties).append(b86da61a66b4).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(_38f692f5ac9a, rhs._38f692f5ac9a).append(_374a801b3eb2, rhs._374a801b3eb2).append(additionalProperties, rhs.additionalProperties).append(b86da61a66b4, rhs.b86da61a66b4).isEquals();
    }

}
