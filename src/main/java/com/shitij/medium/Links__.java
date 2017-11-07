
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
    "entries",
    "version",
    "generatedAt"
})
public class Links__ {

    @JsonProperty("entries")
    private List<Entry_> entries = null;
    @JsonProperty("version")
    private String version;
    @JsonProperty("generatedAt")
    private long generatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("entries")
    public List<Entry_> getEntries() {
        return entries;
    }

    @JsonProperty("entries")
    public void setEntries(List<Entry_> entries) {
        this.entries = entries;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("generatedAt")
    public long getGeneratedAt() {
        return generatedAt;
    }

    @JsonProperty("generatedAt")
    public void setGeneratedAt(long generatedAt) {
        this.generatedAt = generatedAt;
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
        return new ToStringBuilder(this).append("entries", entries).append("version", version).append("generatedAt", generatedAt).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(entries).append(generatedAt).append(version).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links__) == false) {
            return false;
        }
        Links__ rhs = ((Links__) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(entries, rhs.entries).append(generatedAt, rhs.generatedAt).append(version, rhs.version).isEquals();
    }

}
