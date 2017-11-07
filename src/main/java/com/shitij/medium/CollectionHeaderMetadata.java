
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
    "title",
    "description",
    "backgroundImage",
    "logoImage",
    "alignment",
    "layout"
})
public class CollectionHeaderMetadata {

    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("backgroundImage")
    private BackgroundImage backgroundImage;
    @JsonProperty("logoImage")
    private LogoImage logoImage;
    @JsonProperty("alignment")
    private long alignment;
    @JsonProperty("layout")
    private long layout;
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("backgroundImage")
    public BackgroundImage getBackgroundImage() {
        return backgroundImage;
    }

    @JsonProperty("backgroundImage")
    public void setBackgroundImage(BackgroundImage backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @JsonProperty("logoImage")
    public LogoImage getLogoImage() {
        return logoImage;
    }

    @JsonProperty("logoImage")
    public void setLogoImage(LogoImage logoImage) {
        this.logoImage = logoImage;
    }

    @JsonProperty("alignment")
    public long getAlignment() {
        return alignment;
    }

    @JsonProperty("alignment")
    public void setAlignment(long alignment) {
        this.alignment = alignment;
    }

    @JsonProperty("layout")
    public long getLayout() {
        return layout;
    }

    @JsonProperty("layout")
    public void setLayout(long layout) {
        this.layout = layout;
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
        return new ToStringBuilder(this).append("title", title).append("description", description).append("backgroundImage", backgroundImage).append("logoImage", logoImage).append("alignment", alignment).append("layout", layout).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(alignment).append(logoImage).append(title).append(additionalProperties).append(description).append(layout).append(backgroundImage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CollectionHeaderMetadata) == false) {
            return false;
        }
        CollectionHeaderMetadata rhs = ((CollectionHeaderMetadata) other);
        return new EqualsBuilder().append(alignment, rhs.alignment).append(logoImage, rhs.logoImage).append(title, rhs.title).append(additionalProperties, rhs.additionalProperties).append(description, rhs.description).append(layout, rhs.layout).append(backgroundImage, rhs.backgroundImage).isEquals();
    }

}
