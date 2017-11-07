
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
    "imageId",
    "filter",
    "backgroundSize",
    "originalWidth",
    "originalHeight",
    "strategy",
    "height",
    "width"
})
public class Favicon_ {

    @JsonProperty("imageId")
    private String imageId;
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("backgroundSize")
    private String backgroundSize;
    @JsonProperty("originalWidth")
    private long originalWidth;
    @JsonProperty("originalHeight")
    private long originalHeight;
    @JsonProperty("strategy")
    private String strategy;
    @JsonProperty("height")
    private long height;
    @JsonProperty("width")
    private long width;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("imageId")
    public String getImageId() {
        return imageId;
    }

    @JsonProperty("imageId")
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @JsonProperty("filter")
    public String getFilter() {
        return filter;
    }

    @JsonProperty("filter")
    public void setFilter(String filter) {
        this.filter = filter;
    }

    @JsonProperty("backgroundSize")
    public String getBackgroundSize() {
        return backgroundSize;
    }

    @JsonProperty("backgroundSize")
    public void setBackgroundSize(String backgroundSize) {
        this.backgroundSize = backgroundSize;
    }

    @JsonProperty("originalWidth")
    public long getOriginalWidth() {
        return originalWidth;
    }

    @JsonProperty("originalWidth")
    public void setOriginalWidth(long originalWidth) {
        this.originalWidth = originalWidth;
    }

    @JsonProperty("originalHeight")
    public long getOriginalHeight() {
        return originalHeight;
    }

    @JsonProperty("originalHeight")
    public void setOriginalHeight(long originalHeight) {
        this.originalHeight = originalHeight;
    }

    @JsonProperty("strategy")
    public String getStrategy() {
        return strategy;
    }

    @JsonProperty("strategy")
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    @JsonProperty("height")
    public long getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(long height) {
        this.height = height;
    }

    @JsonProperty("width")
    public long getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(long width) {
        this.width = width;
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
        return new ToStringBuilder(this).append("imageId", imageId).append("filter", filter).append("backgroundSize", backgroundSize).append("originalWidth", originalWidth).append("originalHeight", originalHeight).append("strategy", strategy).append("height", height).append("width", width).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(backgroundSize).append(height).append(originalHeight).append(imageId).append(additionalProperties).append(width).append(strategy).append(originalWidth).append(filter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Favicon_) == false) {
            return false;
        }
        Favicon_ rhs = ((Favicon_) other);
        return new EqualsBuilder().append(backgroundSize, rhs.backgroundSize).append(height, rhs.height).append(originalHeight, rhs.originalHeight).append(imageId, rhs.imageId).append(additionalProperties, rhs.additionalProperties).append(width, rhs.width).append(strategy, rhs.strategy).append(originalWidth, rhs.originalWidth).append(filter, rhs.filter).isEquals();
    }

}
