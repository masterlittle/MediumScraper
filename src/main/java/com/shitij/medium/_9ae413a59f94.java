
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
    "id",
    "name",
    "slug",
    "tags",
    "creatorId",
    "description",
    "shortDescription",
    "image",
    "metadata",
    "virtuals",
    "logo",
    "twitterUsername",
    "facebookPageName",
    "publicEmail",
    "collectionMastheadId",
    "sections",
    "tintColor",
    "lightText",
    "favicon",
    "colorPalette",
    "navItems",
    "colorBehavior",
    "instantArticlesState",
    "acceleratedMobilePagesState",
    "ampLogo",
    "header",
    "type"
})
public class _9ae413a59f94 {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("creatorId")
    private String creatorId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("virtuals")
    private Virtuals virtuals;
    @JsonProperty("logo")
    private Logo logo;
    @JsonProperty("twitterUsername")
    private String twitterUsername;
    @JsonProperty("facebookPageName")
    private String facebookPageName;
    @JsonProperty("publicEmail")
    private String publicEmail;
    @JsonProperty("collectionMastheadId")
    private String collectionMastheadId;
    @JsonProperty("sections")
    private List<Section_> sections = null;
    @JsonProperty("tintColor")
    private String tintColor;
    @JsonProperty("lightText")
    private boolean lightText;
    @JsonProperty("favicon")
    private Favicon favicon;
    @JsonProperty("colorPalette")
    private ColorPalette colorPalette;
    @JsonProperty("navItems")
    private List<NavItem> navItems = null;
    @JsonProperty("colorBehavior")
    private long colorBehavior;
    @JsonProperty("instantArticlesState")
    private long instantArticlesState;
    @JsonProperty("acceleratedMobilePagesState")
    private long acceleratedMobilePagesState;
    @JsonProperty("ampLogo")
    private AmpLogo ampLogo;
    @JsonProperty("header")
    private Header header;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("creatorId")
    public String getCreatorId() {
        return creatorId;
    }

    @JsonProperty("creatorId")
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("shortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("virtuals")
    public Virtuals getVirtuals() {
        return virtuals;
    }

    @JsonProperty("virtuals")
    public void setVirtuals(Virtuals virtuals) {
        this.virtuals = virtuals;
    }

    @JsonProperty("logo")
    public Logo getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    @JsonProperty("twitterUsername")
    public String getTwitterUsername() {
        return twitterUsername;
    }

    @JsonProperty("twitterUsername")
    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    @JsonProperty("facebookPageName")
    public String getFacebookPageName() {
        return facebookPageName;
    }

    @JsonProperty("facebookPageName")
    public void setFacebookPageName(String facebookPageName) {
        this.facebookPageName = facebookPageName;
    }

    @JsonProperty("publicEmail")
    public String getPublicEmail() {
        return publicEmail;
    }

    @JsonProperty("publicEmail")
    public void setPublicEmail(String publicEmail) {
        this.publicEmail = publicEmail;
    }

    @JsonProperty("collectionMastheadId")
    public String getCollectionMastheadId() {
        return collectionMastheadId;
    }

    @JsonProperty("collectionMastheadId")
    public void setCollectionMastheadId(String collectionMastheadId) {
        this.collectionMastheadId = collectionMastheadId;
    }

    @JsonProperty("sections")
    public List<Section_> getSections() {
        return sections;
    }

    @JsonProperty("sections")
    public void setSections(List<Section_> sections) {
        this.sections = sections;
    }

    @JsonProperty("tintColor")
    public String getTintColor() {
        return tintColor;
    }

    @JsonProperty("tintColor")
    public void setTintColor(String tintColor) {
        this.tintColor = tintColor;
    }

    @JsonProperty("lightText")
    public boolean isLightText() {
        return lightText;
    }

    @JsonProperty("lightText")
    public void setLightText(boolean lightText) {
        this.lightText = lightText;
    }

    @JsonProperty("favicon")
    public Favicon getFavicon() {
        return favicon;
    }

    @JsonProperty("favicon")
    public void setFavicon(Favicon favicon) {
        this.favicon = favicon;
    }

    @JsonProperty("colorPalette")
    public ColorPalette getColorPalette() {
        return colorPalette;
    }

    @JsonProperty("colorPalette")
    public void setColorPalette(ColorPalette colorPalette) {
        this.colorPalette = colorPalette;
    }

    @JsonProperty("navItems")
    public List<NavItem> getNavItems() {
        return navItems;
    }

    @JsonProperty("navItems")
    public void setNavItems(List<NavItem> navItems) {
        this.navItems = navItems;
    }

    @JsonProperty("colorBehavior")
    public long getColorBehavior() {
        return colorBehavior;
    }

    @JsonProperty("colorBehavior")
    public void setColorBehavior(long colorBehavior) {
        this.colorBehavior = colorBehavior;
    }

    @JsonProperty("instantArticlesState")
    public long getInstantArticlesState() {
        return instantArticlesState;
    }

    @JsonProperty("instantArticlesState")
    public void setInstantArticlesState(long instantArticlesState) {
        this.instantArticlesState = instantArticlesState;
    }

    @JsonProperty("acceleratedMobilePagesState")
    public long getAcceleratedMobilePagesState() {
        return acceleratedMobilePagesState;
    }

    @JsonProperty("acceleratedMobilePagesState")
    public void setAcceleratedMobilePagesState(long acceleratedMobilePagesState) {
        this.acceleratedMobilePagesState = acceleratedMobilePagesState;
    }

    @JsonProperty("ampLogo")
    public AmpLogo getAmpLogo() {
        return ampLogo;
    }

    @JsonProperty("ampLogo")
    public void setAmpLogo(AmpLogo ampLogo) {
        this.ampLogo = ampLogo;
    }

    @JsonProperty("header")
    public Header getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(Header header) {
        this.header = header;
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
        return new ToStringBuilder(this).append("id", id).append("name", name).append("slug", slug).append("tags", tags).append("creatorId", creatorId).append("description", description).append("shortDescription", shortDescription).append("image", image).append("metadata", metadata).append("virtuals", virtuals).append("logo", logo).append("twitterUsername", twitterUsername).append("facebookPageName", facebookPageName).append("publicEmail", publicEmail).append("collectionMastheadId", collectionMastheadId).append("sections", sections).append("tintColor", tintColor).append("lightText", lightText).append("favicon", favicon).append("colorPalette", colorPalette).append("navItems", navItems).append("colorBehavior", colorBehavior).append("instantArticlesState", instantArticlesState).append("acceleratedMobilePagesState", acceleratedMobilePagesState).append("ampLogo", ampLogo).append("header", header).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(acceleratedMobilePagesState).append(colorBehavior).append(type).append(id).append(sections).append(colorPalette).append(description).append(ampLogo).append(name).append(twitterUsername).append(metadata).append(tags).append(logo).append(instantArticlesState).append(publicEmail).append(navItems).append(creatorId).append(image).append(header).append(tintColor).append(lightText).append(collectionMastheadId).append(facebookPageName).append(favicon).append(shortDescription).append(additionalProperties).append(slug).append(virtuals).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _9ae413a59f94) == false) {
            return false;
        }
        _9ae413a59f94 rhs = ((_9ae413a59f94) other);
        return new EqualsBuilder().append(acceleratedMobilePagesState, rhs.acceleratedMobilePagesState).append(colorBehavior, rhs.colorBehavior).append(type, rhs.type).append(id, rhs.id).append(sections, rhs.sections).append(colorPalette, rhs.colorPalette).append(description, rhs.description).append(ampLogo, rhs.ampLogo).append(name, rhs.name).append(twitterUsername, rhs.twitterUsername).append(metadata, rhs.metadata).append(tags, rhs.tags).append(logo, rhs.logo).append(instantArticlesState, rhs.instantArticlesState).append(publicEmail, rhs.publicEmail).append(navItems, rhs.navItems).append(creatorId, rhs.creatorId).append(image, rhs.image).append(header, rhs.header).append(tintColor, rhs.tintColor).append(lightText, rhs.lightText).append(collectionMastheadId, rhs.collectionMastheadId).append(facebookPageName, rhs.facebookPageName).append(favicon, rhs.favicon).append(shortDescription, rhs.shortDescription).append(additionalProperties, rhs.additionalProperties).append(slug, rhs.slug).append(virtuals, rhs.virtuals).isEquals();
    }

}
