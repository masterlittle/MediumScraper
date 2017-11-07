
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
    "url",
    "alts",
    "httpStatus"
})
public class Entry {

    @JsonProperty("url")
    private String url;
    @JsonProperty("alts")
    private List<Alt> alts = null;
    @JsonProperty("httpStatus")
    private long httpStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("alts")
    public List<Alt> getAlts() {
        return alts;
    }

    @JsonProperty("alts")
    public void setAlts(List<Alt> alts) {
        this.alts = alts;
    }

    @JsonProperty("httpStatus")
    public long getHttpStatus() {
        return httpStatus;
    }

    @JsonProperty("httpStatus")
    public void setHttpStatus(long httpStatus) {
        this.httpStatus = httpStatus;
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
        return new ToStringBuilder(this).append("url", url).append("alts", alts).append("httpStatus", httpStatus).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(alts).append(httpStatus).append(additionalProperties).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entry) == false) {
            return false;
        }
        Entry rhs = ((Entry) other);
        return new EqualsBuilder().append(alts, rhs.alts).append(httpStatus, rhs.httpStatus).append(additionalProperties, rhs.additionalProperties).append(url, rhs.url).isEquals();
    }

}
