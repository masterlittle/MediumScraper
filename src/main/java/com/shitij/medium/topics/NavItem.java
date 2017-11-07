
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
    "title",
    "personalizedStream",
    "streamType",
    "layout",
    "sectionLength",
    "topicStream",
    "topicExploreStream"
})
public class NavItem {

    @JsonProperty("title")
    private String title;
    @JsonProperty("personalizedStream")
    private PersonalizedStream personalizedStream;
    @JsonProperty("streamType")
    private String streamType;
    @JsonProperty("layout")
    private String layout;
    @JsonProperty("sectionLength")
    private String sectionLength;
    @JsonProperty("topicStream")
    private TopicStream topicStream;
    @JsonProperty("topicExploreStream")
    private TopicExploreStream topicExploreStream;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("personalizedStream")
    public PersonalizedStream getPersonalizedStream() {
        return personalizedStream;
    }

    @JsonProperty("personalizedStream")
    public void setPersonalizedStream(PersonalizedStream personalizedStream) {
        this.personalizedStream = personalizedStream;
    }

    @JsonProperty("streamType")
    public String getStreamType() {
        return streamType;
    }

    @JsonProperty("streamType")
    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    @JsonProperty("layout")
    public String getLayout() {
        return layout;
    }

    @JsonProperty("layout")
    public void setLayout(String layout) {
        this.layout = layout;
    }

    @JsonProperty("sectionLength")
    public String getSectionLength() {
        return sectionLength;
    }

    @JsonProperty("sectionLength")
    public void setSectionLength(String sectionLength) {
        this.sectionLength = sectionLength;
    }

    @JsonProperty("topicStream")
    public TopicStream getTopicStream() {
        return topicStream;
    }

    @JsonProperty("topicStream")
    public void setTopicStream(TopicStream topicStream) {
        this.topicStream = topicStream;
    }

    @JsonProperty("topicExploreStream")
    public TopicExploreStream getTopicExploreStream() {
        return topicExploreStream;
    }

    @JsonProperty("topicExploreStream")
    public void setTopicExploreStream(TopicExploreStream topicExploreStream) {
        this.topicExploreStream = topicExploreStream;
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
        return new ToStringBuilder(this).append("title", title).append("personalizedStream", personalizedStream).append("streamType", streamType).append("layout", layout).append("sectionLength", sectionLength).append("topicStream", topicStream).append("topicExploreStream", topicExploreStream).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(personalizedStream).append(title).append(topicStream).append(additionalProperties).append(sectionLength).append(layout).append(streamType).append(topicExploreStream).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NavItem) == false) {
            return false;
        }
        NavItem rhs = ((NavItem) other);
        return new EqualsBuilder().append(personalizedStream, rhs.personalizedStream).append(title, rhs.title).append(topicStream, rhs.topicStream).append(additionalProperties, rhs.additionalProperties).append(sectionLength, rhs.sectionLength).append(layout, rhs.layout).append(streamType, rhs.streamType).append(topicExploreStream, rhs.topicExploreStream).isEquals();
    }

}
