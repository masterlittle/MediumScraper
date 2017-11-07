
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
    "topicSlug",
    "topicId"
})
public class TopicStream {

    @JsonProperty("topicSlug")
    private String topicSlug;
    @JsonProperty("topicId")
    private String topicId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("topicSlug")
    public String getTopicSlug() {
        return topicSlug;
    }

    @JsonProperty("topicSlug")
    public void setTopicSlug(String topicSlug) {
        this.topicSlug = topicSlug;
    }

    @JsonProperty("topicId")
    public String getTopicId() {
        return topicId;
    }

    @JsonProperty("topicId")
    public void setTopicId(String topicId) {
        this.topicId = topicId;
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
        return new ToStringBuilder(this).append("topicSlug", topicSlug).append("topicId", topicId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(topicId).append(topicSlug).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicStream) == false) {
            return false;
        }
        TopicStream rhs = ((TopicStream) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(topicId, rhs.topicId).append(topicSlug, rhs.topicSlug).isEquals();
    }

}
