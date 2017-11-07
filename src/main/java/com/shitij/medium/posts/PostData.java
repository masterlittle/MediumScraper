
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
    "success",
    "payload",
    "v",
    "b"
})
public class PostData {

    @JsonProperty("success")
    private boolean success;
    @JsonProperty("payload")
    private Payload payload;
    @JsonProperty("v")
    private long v;
    @JsonProperty("b")
    private String b;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("success")
    public boolean isSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(boolean success) {
        this.success = success;
    }

    @JsonProperty("payload")
    public Payload getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @JsonProperty("v")
    public long getV() {
        return v;
    }

    @JsonProperty("v")
    public void setV(long v) {
        this.v = v;
    }

    @JsonProperty("b")
    public String getB() {
        return b;
    }

    @JsonProperty("b")
    public void setB(String b) {
        this.b = b;
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
        return new ToStringBuilder(this).append("success", success).append("payload", payload).append("v", v).append("b", b).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(v).append(b).append(additionalProperties).append(payload).append(success).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PostData) == false) {
            return false;
        }
        PostData rhs = ((PostData) other);
        return new EqualsBuilder().append(v, rhs.v).append(b, rhs.b).append(additionalProperties, rhs.additionalProperties).append(payload, rhs.payload).append(success, rhs.success).isEquals();
    }

}
