
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
    "e312f6347cdc",
    "34c89729ab07",
    "1dbec37c99c4"
})
public class Post_ {

    @JsonProperty("e312f6347cdc")
    private E312f6347cdc e312f6347cdc;
    @JsonProperty("34c89729ab07")
    private com.shitij.medium._34c89729ab07 _34c89729ab07;
    @JsonProperty("1dbec37c99c4")
    private com.shitij.medium._1dbec37c99c4 _1dbec37c99c4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("e312f6347cdc")
    public E312f6347cdc getE312f6347cdc() {
        return e312f6347cdc;
    }

    @JsonProperty("e312f6347cdc")
    public void setE312f6347cdc(E312f6347cdc e312f6347cdc) {
        this.e312f6347cdc = e312f6347cdc;
    }

    @JsonProperty("34c89729ab07")
    public com.shitij.medium._34c89729ab07 get34c89729ab07() {
        return _34c89729ab07;
    }

    @JsonProperty("34c89729ab07")
    public void set34c89729ab07(com.shitij.medium._34c89729ab07 _34c89729ab07) {
        this._34c89729ab07 = _34c89729ab07;
    }

    @JsonProperty("1dbec37c99c4")
    public com.shitij.medium._1dbec37c99c4 get1dbec37c99c4() {
        return _1dbec37c99c4;
    }

    @JsonProperty("1dbec37c99c4")
    public void set1dbec37c99c4(com.shitij.medium._1dbec37c99c4 _1dbec37c99c4) {
        this._1dbec37c99c4 = _1dbec37c99c4;
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
        return new ToStringBuilder(this).append("e312f6347cdc", e312f6347cdc).append("_34c89729ab07", _34c89729ab07).append("_1dbec37c99c4", _1dbec37c99c4).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_1dbec37c99c4).append(additionalProperties).append(e312f6347cdc).append(_34c89729ab07).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Post_) == false) {
            return false;
        }
        Post_ rhs = ((Post_) other);
        return new EqualsBuilder().append(_1dbec37c99c4, rhs._1dbec37c99c4).append(additionalProperties, rhs.additionalProperties).append(e312f6347cdc, rhs.e312f6347cdc).append(_34c89729ab07, rhs._34c89729ab07).isEquals();
    }

}
