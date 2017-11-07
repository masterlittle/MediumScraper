
package com.shitij.medium.topics;

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
    "topic",
    "itemType"
})
public class Item {

    @JsonProperty("topic")
    private Topic topic;
    @JsonProperty("itemType")
    private String itemType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("topic")
    public Topic getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @JsonProperty("itemType")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("itemType")
    public void setItemType(String itemType) {
        this.itemType = itemType;
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
        return new ToStringBuilder(this).append("topic", topic).append("itemType", itemType).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(topic).append(additionalProperties).append(itemType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(topic, rhs.topic).append(additionalProperties, rhs.additionalProperties).append(itemType, rhs.itemType).isEquals();
    }

}
