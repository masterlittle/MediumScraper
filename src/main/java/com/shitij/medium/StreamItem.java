
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
    "createdAt",
    "randomId",
    "section",
    "itemType",
    "type"
})
public class StreamItem {

    @JsonProperty("createdAt")
    private long createdAt;
    @JsonProperty("randomId")
    private String randomId;
    @JsonProperty("section")
    private Section section;
    @JsonProperty("itemType")
    private String itemType;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("createdAt")
    public long getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("randomId")
    public String getRandomId() {
        return randomId;
    }

    @JsonProperty("randomId")
    public void setRandomId(String randomId) {
        this.randomId = randomId;
    }

    @JsonProperty("section")
    public Section getSection() {
        return section;
    }

    @JsonProperty("section")
    public void setSection(Section section) {
        this.section = section;
    }

    @JsonProperty("itemType")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("itemType")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
        return new ToStringBuilder(this).append("createdAt", createdAt).append("randomId", randomId).append("section", section).append("itemType", itemType).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(randomId).append(additionalProperties).append(createdAt).append(itemType).append(type).append(section).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StreamItem) == false) {
            return false;
        }
        StreamItem rhs = ((StreamItem) other);
        return new EqualsBuilder().append(randomId, rhs.randomId).append(additionalProperties, rhs.additionalProperties).append(createdAt, rhs.createdAt).append(itemType, rhs.itemType).append(type, rhs.type).append(section, rhs.section).isEquals();
    }

}
