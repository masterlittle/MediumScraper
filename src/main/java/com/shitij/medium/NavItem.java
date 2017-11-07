
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
    "type",
    "title",
    "tagSlug",
    "url",
    "source"
})
public class NavItem {

    @JsonProperty("type")
    private long type;
    @JsonProperty("title")
    private String title;
    @JsonProperty("tagSlug")
    private String tagSlug;
    @JsonProperty("url")
    private String url;
    @JsonProperty("source")
    private String source;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public long getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(long type) {
        this.type = type;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("tagSlug")
    public String getTagSlug() {
        return tagSlug;
    }

    @JsonProperty("tagSlug")
    public void setTagSlug(String tagSlug) {
        this.tagSlug = tagSlug;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
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
        return new ToStringBuilder(this).append("type", type).append("title", title).append("tagSlug", tagSlug).append("url", url).append("source", source).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(title).append(source).append(additionalProperties).append(type).append(url).append(tagSlug).toHashCode();
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
        return new EqualsBuilder().append(title, rhs.title).append(source, rhs.source).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(url, rhs.url).append(tagSlug, rhs.tagSlug).isEquals();
    }

}
