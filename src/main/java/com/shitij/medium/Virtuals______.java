
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
    "statusForCollection",
    "allowNotes",
    "previewImage",
    "wordCount",
    "imageCount",
    "readingTime",
    "subtitle",
    "userPostRelation",
    "publishedInCount",
    "usersBySocialRecommends",
    "recommends",
    "isBookmarked",
    "tags",
    "socialRecommendsCount",
    "responsesCreatedCount",
    "links",
    "isLockedPreviewOnly",
    "takeoverId",
    "metaDescription",
    "totalClapCount",
    "sectionCount"
})
public class Virtuals______ {

    @JsonProperty("statusForCollection")
    private String statusForCollection;
    @JsonProperty("allowNotes")
    private boolean allowNotes;
    @JsonProperty("previewImage")
    private PreviewImage__ previewImage;
    @JsonProperty("wordCount")
    private long wordCount;
    @JsonProperty("imageCount")
    private long imageCount;
    @JsonProperty("readingTime")
    private double readingTime;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("userPostRelation")
    private UserPostRelation__ userPostRelation;
    @JsonProperty("publishedInCount")
    private long publishedInCount;
    @JsonProperty("usersBySocialRecommends")
    private List<Object> usersBySocialRecommends = null;
    @JsonProperty("recommends")
    private long recommends;
    @JsonProperty("isBookmarked")
    private boolean isBookmarked;
    @JsonProperty("tags")
    private List<Tag__> tags = null;
    @JsonProperty("socialRecommendsCount")
    private long socialRecommendsCount;
    @JsonProperty("responsesCreatedCount")
    private long responsesCreatedCount;
    @JsonProperty("links")
    private Links__ links;
    @JsonProperty("isLockedPreviewOnly")
    private boolean isLockedPreviewOnly;
    @JsonProperty("takeoverId")
    private String takeoverId;
    @JsonProperty("metaDescription")
    private String metaDescription;
    @JsonProperty("totalClapCount")
    private long totalClapCount;
    @JsonProperty("sectionCount")
    private long sectionCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("statusForCollection")
    public String getStatusForCollection() {
        return statusForCollection;
    }

    @JsonProperty("statusForCollection")
    public void setStatusForCollection(String statusForCollection) {
        this.statusForCollection = statusForCollection;
    }

    @JsonProperty("allowNotes")
    public boolean isAllowNotes() {
        return allowNotes;
    }

    @JsonProperty("allowNotes")
    public void setAllowNotes(boolean allowNotes) {
        this.allowNotes = allowNotes;
    }

    @JsonProperty("previewImage")
    public PreviewImage__ getPreviewImage() {
        return previewImage;
    }

    @JsonProperty("previewImage")
    public void setPreviewImage(PreviewImage__ previewImage) {
        this.previewImage = previewImage;
    }

    @JsonProperty("wordCount")
    public long getWordCount() {
        return wordCount;
    }

    @JsonProperty("wordCount")
    public void setWordCount(long wordCount) {
        this.wordCount = wordCount;
    }

    @JsonProperty("imageCount")
    public long getImageCount() {
        return imageCount;
    }

    @JsonProperty("imageCount")
    public void setImageCount(long imageCount) {
        this.imageCount = imageCount;
    }

    @JsonProperty("readingTime")
    public double getReadingTime() {
        return readingTime;
    }

    @JsonProperty("readingTime")
    public void setReadingTime(double readingTime) {
        this.readingTime = readingTime;
    }

    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("userPostRelation")
    public UserPostRelation__ getUserPostRelation() {
        return userPostRelation;
    }

    @JsonProperty("userPostRelation")
    public void setUserPostRelation(UserPostRelation__ userPostRelation) {
        this.userPostRelation = userPostRelation;
    }

    @JsonProperty("publishedInCount")
    public long getPublishedInCount() {
        return publishedInCount;
    }

    @JsonProperty("publishedInCount")
    public void setPublishedInCount(long publishedInCount) {
        this.publishedInCount = publishedInCount;
    }

    @JsonProperty("usersBySocialRecommends")
    public List<Object> getUsersBySocialRecommends() {
        return usersBySocialRecommends;
    }

    @JsonProperty("usersBySocialRecommends")
    public void setUsersBySocialRecommends(List<Object> usersBySocialRecommends) {
        this.usersBySocialRecommends = usersBySocialRecommends;
    }

    @JsonProperty("recommends")
    public long getRecommends() {
        return recommends;
    }

    @JsonProperty("recommends")
    public void setRecommends(long recommends) {
        this.recommends = recommends;
    }

    @JsonProperty("isBookmarked")
    public boolean isIsBookmarked() {
        return isBookmarked;
    }

    @JsonProperty("isBookmarked")
    public void setIsBookmarked(boolean isBookmarked) {
        this.isBookmarked = isBookmarked;
    }

    @JsonProperty("tags")
    public List<Tag__> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag__> tags) {
        this.tags = tags;
    }

    @JsonProperty("socialRecommendsCount")
    public long getSocialRecommendsCount() {
        return socialRecommendsCount;
    }

    @JsonProperty("socialRecommendsCount")
    public void setSocialRecommendsCount(long socialRecommendsCount) {
        this.socialRecommendsCount = socialRecommendsCount;
    }

    @JsonProperty("responsesCreatedCount")
    public long getResponsesCreatedCount() {
        return responsesCreatedCount;
    }

    @JsonProperty("responsesCreatedCount")
    public void setResponsesCreatedCount(long responsesCreatedCount) {
        this.responsesCreatedCount = responsesCreatedCount;
    }

    @JsonProperty("links")
    public Links__ getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links__ links) {
        this.links = links;
    }

    @JsonProperty("isLockedPreviewOnly")
    public boolean isIsLockedPreviewOnly() {
        return isLockedPreviewOnly;
    }

    @JsonProperty("isLockedPreviewOnly")
    public void setIsLockedPreviewOnly(boolean isLockedPreviewOnly) {
        this.isLockedPreviewOnly = isLockedPreviewOnly;
    }

    @JsonProperty("takeoverId")
    public String getTakeoverId() {
        return takeoverId;
    }

    @JsonProperty("takeoverId")
    public void setTakeoverId(String takeoverId) {
        this.takeoverId = takeoverId;
    }

    @JsonProperty("metaDescription")
    public String getMetaDescription() {
        return metaDescription;
    }

    @JsonProperty("metaDescription")
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    @JsonProperty("totalClapCount")
    public long getTotalClapCount() {
        return totalClapCount;
    }

    @JsonProperty("totalClapCount")
    public void setTotalClapCount(long totalClapCount) {
        this.totalClapCount = totalClapCount;
    }

    @JsonProperty("sectionCount")
    public long getSectionCount() {
        return sectionCount;
    }

    @JsonProperty("sectionCount")
    public void setSectionCount(long sectionCount) {
        this.sectionCount = sectionCount;
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
        return new ToStringBuilder(this).append("statusForCollection", statusForCollection).append("allowNotes", allowNotes).append("previewImage", previewImage).append("wordCount", wordCount).append("imageCount", imageCount).append("readingTime", readingTime).append("subtitle", subtitle).append("userPostRelation", userPostRelation).append("publishedInCount", publishedInCount).append("usersBySocialRecommends", usersBySocialRecommends).append("recommends", recommends).append("isBookmarked", isBookmarked).append("tags", tags).append("socialRecommendsCount", socialRecommendsCount).append("responsesCreatedCount", responsesCreatedCount).append("links", links).append("isLockedPreviewOnly", isLockedPreviewOnly).append("takeoverId", takeoverId).append("metaDescription", metaDescription).append("totalClapCount", totalClapCount).append("sectionCount", sectionCount).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tags).append(isLockedPreviewOnly).append(recommends).append(usersBySocialRecommends).append(responsesCreatedCount).append(socialRecommendsCount).append(imageCount).append(statusForCollection).append(metaDescription).append(totalClapCount).append(links).append(readingTime).append(wordCount).append(sectionCount).append(previewImage).append(publishedInCount).append(additionalProperties).append(isBookmarked).append(subtitle).append(takeoverId).append(allowNotes).append(userPostRelation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Virtuals______) == false) {
            return false;
        }
        Virtuals______ rhs = ((Virtuals______) other);
        return new EqualsBuilder().append(tags, rhs.tags).append(isLockedPreviewOnly, rhs.isLockedPreviewOnly).append(recommends, rhs.recommends).append(usersBySocialRecommends, rhs.usersBySocialRecommends).append(responsesCreatedCount, rhs.responsesCreatedCount).append(socialRecommendsCount, rhs.socialRecommendsCount).append(imageCount, rhs.imageCount).append(statusForCollection, rhs.statusForCollection).append(metaDescription, rhs.metaDescription).append(totalClapCount, rhs.totalClapCount).append(links, rhs.links).append(readingTime, rhs.readingTime).append(wordCount, rhs.wordCount).append(sectionCount, rhs.sectionCount).append(previewImage, rhs.previewImage).append(publishedInCount, rhs.publishedInCount).append(additionalProperties, rhs.additionalProperties).append(isBookmarked, rhs.isBookmarked).append(subtitle, rhs.subtitle).append(takeoverId, rhs.takeoverId).append(allowNotes, rhs.allowNotes).append(userPostRelation, rhs.userPostRelation).isEquals();
    }

}
