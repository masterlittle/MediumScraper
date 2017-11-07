
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
    "id",
    "versionId",
    "creatorId",
    "homeCollectionId",
    "title",
    "detectedLanguage",
    "latestVersion",
    "latestPublishedVersion",
    "hasUnpublishedEdits",
    "latestRev",
    "createdAt",
    "updatedAt",
    "acceptedAt",
    "firstPublishedAt",
    "latestPublishedAt",
    "vote",
    "experimentalCss",
    "displayAuthor",
    "content",
    "virtuals",
    "coverless",
    "slug",
    "translationSourcePostId",
    "translationSourceCreatorId",
    "isApprovedTranslation",
    "inResponseToPostId",
    "inResponseToRemovedAt",
    "isTitleSynthesized",
    "allowResponses",
    "importedUrl",
    "importedPublishedAt",
    "visibility",
    "uniqueSlug",
    "previewContent",
    "license",
    "inResponseToMediaResourceId",
    "canonicalUrl",
    "approvedHomeCollectionId",
    "newsletterId",
    "webCanonicalUrl",
    "mediumUrl",
    "migrationId",
    "notifyFollowers",
    "notifyTwitter",
    "isSponsored",
    "isRequestToPubDisabled",
    "notifyFacebook",
    "responseHiddenOnParentPostAt",
    "isSeries",
    "isSubscriptionLocked",
    "seriesLastAppendedAt",
    "audioVersionDurationSec",
    "sequenceId",
    "isNsfw",
    "isEligibleForRevenue",
    "isBlockedFromHightower",
    "deletedAt",
    "lockedPostSource",
    "type"
})
public class E312f6347cdc {

    @JsonProperty("id")
    private String id;
    @JsonProperty("versionId")
    private String versionId;
    @JsonProperty("creatorId")
    private String creatorId;
    @JsonProperty("homeCollectionId")
    private String homeCollectionId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("detectedLanguage")
    private String detectedLanguage;
    @JsonProperty("latestVersion")
    private String latestVersion;
    @JsonProperty("latestPublishedVersion")
    private String latestPublishedVersion;
    @JsonProperty("hasUnpublishedEdits")
    private boolean hasUnpublishedEdits;
    @JsonProperty("latestRev")
    private long latestRev;
    @JsonProperty("createdAt")
    private long createdAt;
    @JsonProperty("updatedAt")
    private long updatedAt;
    @JsonProperty("acceptedAt")
    private long acceptedAt;
    @JsonProperty("firstPublishedAt")
    private long firstPublishedAt;
    @JsonProperty("latestPublishedAt")
    private long latestPublishedAt;
    @JsonProperty("vote")
    private boolean vote;
    @JsonProperty("experimentalCss")
    private String experimentalCss;
    @JsonProperty("displayAuthor")
    private String displayAuthor;
    @JsonProperty("content")
    private Content content;
    @JsonProperty("virtuals")
    private Virtuals__ virtuals;
    @JsonProperty("coverless")
    private boolean coverless;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("translationSourcePostId")
    private String translationSourcePostId;
    @JsonProperty("translationSourceCreatorId")
    private String translationSourceCreatorId;
    @JsonProperty("isApprovedTranslation")
    private boolean isApprovedTranslation;
    @JsonProperty("inResponseToPostId")
    private String inResponseToPostId;
    @JsonProperty("inResponseToRemovedAt")
    private long inResponseToRemovedAt;
    @JsonProperty("isTitleSynthesized")
    private boolean isTitleSynthesized;
    @JsonProperty("allowResponses")
    private boolean allowResponses;
    @JsonProperty("importedUrl")
    private String importedUrl;
    @JsonProperty("importedPublishedAt")
    private long importedPublishedAt;
    @JsonProperty("visibility")
    private long visibility;
    @JsonProperty("uniqueSlug")
    private String uniqueSlug;
    @JsonProperty("previewContent")
    private PreviewContent previewContent;
    @JsonProperty("license")
    private long license;
    @JsonProperty("inResponseToMediaResourceId")
    private String inResponseToMediaResourceId;
    @JsonProperty("canonicalUrl")
    private String canonicalUrl;
    @JsonProperty("approvedHomeCollectionId")
    private String approvedHomeCollectionId;
    @JsonProperty("newsletterId")
    private String newsletterId;
    @JsonProperty("webCanonicalUrl")
    private String webCanonicalUrl;
    @JsonProperty("mediumUrl")
    private String mediumUrl;
    @JsonProperty("migrationId")
    private String migrationId;
    @JsonProperty("notifyFollowers")
    private boolean notifyFollowers;
    @JsonProperty("notifyTwitter")
    private boolean notifyTwitter;
    @JsonProperty("isSponsored")
    private boolean isSponsored;
    @JsonProperty("isRequestToPubDisabled")
    private boolean isRequestToPubDisabled;
    @JsonProperty("notifyFacebook")
    private boolean notifyFacebook;
    @JsonProperty("responseHiddenOnParentPostAt")
    private long responseHiddenOnParentPostAt;
    @JsonProperty("isSeries")
    private boolean isSeries;
    @JsonProperty("isSubscriptionLocked")
    private boolean isSubscriptionLocked;
    @JsonProperty("seriesLastAppendedAt")
    private long seriesLastAppendedAt;
    @JsonProperty("audioVersionDurationSec")
    private long audioVersionDurationSec;
    @JsonProperty("sequenceId")
    private String sequenceId;
    @JsonProperty("isNsfw")
    private boolean isNsfw;
    @JsonProperty("isEligibleForRevenue")
    private boolean isEligibleForRevenue;
    @JsonProperty("isBlockedFromHightower")
    private boolean isBlockedFromHightower;
    @JsonProperty("deletedAt")
    private long deletedAt;
    @JsonProperty("lockedPostSource")
    private long lockedPostSource;
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

    @JsonProperty("versionId")
    public String getVersionId() {
        return versionId;
    }

    @JsonProperty("versionId")
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @JsonProperty("creatorId")
    public String getCreatorId() {
        return creatorId;
    }

    @JsonProperty("creatorId")
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @JsonProperty("homeCollectionId")
    public String getHomeCollectionId() {
        return homeCollectionId;
    }

    @JsonProperty("homeCollectionId")
    public void setHomeCollectionId(String homeCollectionId) {
        this.homeCollectionId = homeCollectionId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("detectedLanguage")
    public String getDetectedLanguage() {
        return detectedLanguage;
    }

    @JsonProperty("detectedLanguage")
    public void setDetectedLanguage(String detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
    }

    @JsonProperty("latestVersion")
    public String getLatestVersion() {
        return latestVersion;
    }

    @JsonProperty("latestVersion")
    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    @JsonProperty("latestPublishedVersion")
    public String getLatestPublishedVersion() {
        return latestPublishedVersion;
    }

    @JsonProperty("latestPublishedVersion")
    public void setLatestPublishedVersion(String latestPublishedVersion) {
        this.latestPublishedVersion = latestPublishedVersion;
    }

    @JsonProperty("hasUnpublishedEdits")
    public boolean isHasUnpublishedEdits() {
        return hasUnpublishedEdits;
    }

    @JsonProperty("hasUnpublishedEdits")
    public void setHasUnpublishedEdits(boolean hasUnpublishedEdits) {
        this.hasUnpublishedEdits = hasUnpublishedEdits;
    }

    @JsonProperty("latestRev")
    public long getLatestRev() {
        return latestRev;
    }

    @JsonProperty("latestRev")
    public void setLatestRev(long latestRev) {
        this.latestRev = latestRev;
    }

    @JsonProperty("createdAt")
    public long getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updatedAt")
    public long getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("acceptedAt")
    public long getAcceptedAt() {
        return acceptedAt;
    }

    @JsonProperty("acceptedAt")
    public void setAcceptedAt(long acceptedAt) {
        this.acceptedAt = acceptedAt;
    }

    @JsonProperty("firstPublishedAt")
    public long getFirstPublishedAt() {
        return firstPublishedAt;
    }

    @JsonProperty("firstPublishedAt")
    public void setFirstPublishedAt(long firstPublishedAt) {
        this.firstPublishedAt = firstPublishedAt;
    }

    @JsonProperty("latestPublishedAt")
    public long getLatestPublishedAt() {
        return latestPublishedAt;
    }

    @JsonProperty("latestPublishedAt")
    public void setLatestPublishedAt(long latestPublishedAt) {
        this.latestPublishedAt = latestPublishedAt;
    }

    @JsonProperty("vote")
    public boolean isVote() {
        return vote;
    }

    @JsonProperty("vote")
    public void setVote(boolean vote) {
        this.vote = vote;
    }

    @JsonProperty("experimentalCss")
    public String getExperimentalCss() {
        return experimentalCss;
    }

    @JsonProperty("experimentalCss")
    public void setExperimentalCss(String experimentalCss) {
        this.experimentalCss = experimentalCss;
    }

    @JsonProperty("displayAuthor")
    public String getDisplayAuthor() {
        return displayAuthor;
    }

    @JsonProperty("displayAuthor")
    public void setDisplayAuthor(String displayAuthor) {
        this.displayAuthor = displayAuthor;
    }

    @JsonProperty("content")
    public Content getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(Content content) {
        this.content = content;
    }

    @JsonProperty("virtuals")
    public Virtuals__ getVirtuals() {
        return virtuals;
    }

    @JsonProperty("virtuals")
    public void setVirtuals(Virtuals__ virtuals) {
        this.virtuals = virtuals;
    }

    @JsonProperty("coverless")
    public boolean isCoverless() {
        return coverless;
    }

    @JsonProperty("coverless")
    public void setCoverless(boolean coverless) {
        this.coverless = coverless;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("translationSourcePostId")
    public String getTranslationSourcePostId() {
        return translationSourcePostId;
    }

    @JsonProperty("translationSourcePostId")
    public void setTranslationSourcePostId(String translationSourcePostId) {
        this.translationSourcePostId = translationSourcePostId;
    }

    @JsonProperty("translationSourceCreatorId")
    public String getTranslationSourceCreatorId() {
        return translationSourceCreatorId;
    }

    @JsonProperty("translationSourceCreatorId")
    public void setTranslationSourceCreatorId(String translationSourceCreatorId) {
        this.translationSourceCreatorId = translationSourceCreatorId;
    }

    @JsonProperty("isApprovedTranslation")
    public boolean isIsApprovedTranslation() {
        return isApprovedTranslation;
    }

    @JsonProperty("isApprovedTranslation")
    public void setIsApprovedTranslation(boolean isApprovedTranslation) {
        this.isApprovedTranslation = isApprovedTranslation;
    }

    @JsonProperty("inResponseToPostId")
    public String getInResponseToPostId() {
        return inResponseToPostId;
    }

    @JsonProperty("inResponseToPostId")
    public void setInResponseToPostId(String inResponseToPostId) {
        this.inResponseToPostId = inResponseToPostId;
    }

    @JsonProperty("inResponseToRemovedAt")
    public long getInResponseToRemovedAt() {
        return inResponseToRemovedAt;
    }

    @JsonProperty("inResponseToRemovedAt")
    public void setInResponseToRemovedAt(long inResponseToRemovedAt) {
        this.inResponseToRemovedAt = inResponseToRemovedAt;
    }

    @JsonProperty("isTitleSynthesized")
    public boolean isIsTitleSynthesized() {
        return isTitleSynthesized;
    }

    @JsonProperty("isTitleSynthesized")
    public void setIsTitleSynthesized(boolean isTitleSynthesized) {
        this.isTitleSynthesized = isTitleSynthesized;
    }

    @JsonProperty("allowResponses")
    public boolean isAllowResponses() {
        return allowResponses;
    }

    @JsonProperty("allowResponses")
    public void setAllowResponses(boolean allowResponses) {
        this.allowResponses = allowResponses;
    }

    @JsonProperty("importedUrl")
    public String getImportedUrl() {
        return importedUrl;
    }

    @JsonProperty("importedUrl")
    public void setImportedUrl(String importedUrl) {
        this.importedUrl = importedUrl;
    }

    @JsonProperty("importedPublishedAt")
    public long getImportedPublishedAt() {
        return importedPublishedAt;
    }

    @JsonProperty("importedPublishedAt")
    public void setImportedPublishedAt(long importedPublishedAt) {
        this.importedPublishedAt = importedPublishedAt;
    }

    @JsonProperty("visibility")
    public long getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("uniqueSlug")
    public String getUniqueSlug() {
        return uniqueSlug;
    }

    @JsonProperty("uniqueSlug")
    public void setUniqueSlug(String uniqueSlug) {
        this.uniqueSlug = uniqueSlug;
    }

    @JsonProperty("previewContent")
    public PreviewContent getPreviewContent() {
        return previewContent;
    }

    @JsonProperty("previewContent")
    public void setPreviewContent(PreviewContent previewContent) {
        this.previewContent = previewContent;
    }

    @JsonProperty("license")
    public long getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(long license) {
        this.license = license;
    }

    @JsonProperty("inResponseToMediaResourceId")
    public String getInResponseToMediaResourceId() {
        return inResponseToMediaResourceId;
    }

    @JsonProperty("inResponseToMediaResourceId")
    public void setInResponseToMediaResourceId(String inResponseToMediaResourceId) {
        this.inResponseToMediaResourceId = inResponseToMediaResourceId;
    }

    @JsonProperty("canonicalUrl")
    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    @JsonProperty("canonicalUrl")
    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    @JsonProperty("approvedHomeCollectionId")
    public String getApprovedHomeCollectionId() {
        return approvedHomeCollectionId;
    }

    @JsonProperty("approvedHomeCollectionId")
    public void setApprovedHomeCollectionId(String approvedHomeCollectionId) {
        this.approvedHomeCollectionId = approvedHomeCollectionId;
    }

    @JsonProperty("newsletterId")
    public String getNewsletterId() {
        return newsletterId;
    }

    @JsonProperty("newsletterId")
    public void setNewsletterId(String newsletterId) {
        this.newsletterId = newsletterId;
    }

    @JsonProperty("webCanonicalUrl")
    public String getWebCanonicalUrl() {
        return webCanonicalUrl;
    }

    @JsonProperty("webCanonicalUrl")
    public void setWebCanonicalUrl(String webCanonicalUrl) {
        this.webCanonicalUrl = webCanonicalUrl;
    }

    @JsonProperty("mediumUrl")
    public String getMediumUrl() {
        return mediumUrl;
    }

    @JsonProperty("mediumUrl")
    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }

    @JsonProperty("migrationId")
    public String getMigrationId() {
        return migrationId;
    }

    @JsonProperty("migrationId")
    public void setMigrationId(String migrationId) {
        this.migrationId = migrationId;
    }

    @JsonProperty("notifyFollowers")
    public boolean isNotifyFollowers() {
        return notifyFollowers;
    }

    @JsonProperty("notifyFollowers")
    public void setNotifyFollowers(boolean notifyFollowers) {
        this.notifyFollowers = notifyFollowers;
    }

    @JsonProperty("notifyTwitter")
    public boolean isNotifyTwitter() {
        return notifyTwitter;
    }

    @JsonProperty("notifyTwitter")
    public void setNotifyTwitter(boolean notifyTwitter) {
        this.notifyTwitter = notifyTwitter;
    }

    @JsonProperty("isSponsored")
    public boolean isIsSponsored() {
        return isSponsored;
    }

    @JsonProperty("isSponsored")
    public void setIsSponsored(boolean isSponsored) {
        this.isSponsored = isSponsored;
    }

    @JsonProperty("isRequestToPubDisabled")
    public boolean isIsRequestToPubDisabled() {
        return isRequestToPubDisabled;
    }

    @JsonProperty("isRequestToPubDisabled")
    public void setIsRequestToPubDisabled(boolean isRequestToPubDisabled) {
        this.isRequestToPubDisabled = isRequestToPubDisabled;
    }

    @JsonProperty("notifyFacebook")
    public boolean isNotifyFacebook() {
        return notifyFacebook;
    }

    @JsonProperty("notifyFacebook")
    public void setNotifyFacebook(boolean notifyFacebook) {
        this.notifyFacebook = notifyFacebook;
    }

    @JsonProperty("responseHiddenOnParentPostAt")
    public long getResponseHiddenOnParentPostAt() {
        return responseHiddenOnParentPostAt;
    }

    @JsonProperty("responseHiddenOnParentPostAt")
    public void setResponseHiddenOnParentPostAt(long responseHiddenOnParentPostAt) {
        this.responseHiddenOnParentPostAt = responseHiddenOnParentPostAt;
    }

    @JsonProperty("isSeries")
    public boolean isIsSeries() {
        return isSeries;
    }

    @JsonProperty("isSeries")
    public void setIsSeries(boolean isSeries) {
        this.isSeries = isSeries;
    }

    @JsonProperty("isSubscriptionLocked")
    public boolean isIsSubscriptionLocked() {
        return isSubscriptionLocked;
    }

    @JsonProperty("isSubscriptionLocked")
    public void setIsSubscriptionLocked(boolean isSubscriptionLocked) {
        this.isSubscriptionLocked = isSubscriptionLocked;
    }

    @JsonProperty("seriesLastAppendedAt")
    public long getSeriesLastAppendedAt() {
        return seriesLastAppendedAt;
    }

    @JsonProperty("seriesLastAppendedAt")
    public void setSeriesLastAppendedAt(long seriesLastAppendedAt) {
        this.seriesLastAppendedAt = seriesLastAppendedAt;
    }

    @JsonProperty("audioVersionDurationSec")
    public long getAudioVersionDurationSec() {
        return audioVersionDurationSec;
    }

    @JsonProperty("audioVersionDurationSec")
    public void setAudioVersionDurationSec(long audioVersionDurationSec) {
        this.audioVersionDurationSec = audioVersionDurationSec;
    }

    @JsonProperty("sequenceId")
    public String getSequenceId() {
        return sequenceId;
    }

    @JsonProperty("sequenceId")
    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    @JsonProperty("isNsfw")
    public boolean isIsNsfw() {
        return isNsfw;
    }

    @JsonProperty("isNsfw")
    public void setIsNsfw(boolean isNsfw) {
        this.isNsfw = isNsfw;
    }

    @JsonProperty("isEligibleForRevenue")
    public boolean isIsEligibleForRevenue() {
        return isEligibleForRevenue;
    }

    @JsonProperty("isEligibleForRevenue")
    public void setIsEligibleForRevenue(boolean isEligibleForRevenue) {
        this.isEligibleForRevenue = isEligibleForRevenue;
    }

    @JsonProperty("isBlockedFromHightower")
    public boolean isIsBlockedFromHightower() {
        return isBlockedFromHightower;
    }

    @JsonProperty("isBlockedFromHightower")
    public void setIsBlockedFromHightower(boolean isBlockedFromHightower) {
        this.isBlockedFromHightower = isBlockedFromHightower;
    }

    @JsonProperty("deletedAt")
    public long getDeletedAt() {
        return deletedAt;
    }

    @JsonProperty("deletedAt")
    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }

    @JsonProperty("lockedPostSource")
    public long getLockedPostSource() {
        return lockedPostSource;
    }

    @JsonProperty("lockedPostSource")
    public void setLockedPostSource(long lockedPostSource) {
        this.lockedPostSource = lockedPostSource;
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
        return new ToStringBuilder(this).append("id", id).append("versionId", versionId).append("creatorId", creatorId).append("homeCollectionId", homeCollectionId).append("title", title).append("detectedLanguage", detectedLanguage).append("latestVersion", latestVersion).append("latestPublishedVersion", latestPublishedVersion).append("hasUnpublishedEdits", hasUnpublishedEdits).append("latestRev", latestRev).append("createdAt", createdAt).append("updatedAt", updatedAt).append("acceptedAt", acceptedAt).append("firstPublishedAt", firstPublishedAt).append("latestPublishedAt", latestPublishedAt).append("vote", vote).append("experimentalCss", experimentalCss).append("displayAuthor", displayAuthor).append("content", content).append("virtuals", virtuals).append("coverless", coverless).append("slug", slug).append("translationSourcePostId", translationSourcePostId).append("translationSourceCreatorId", translationSourceCreatorId).append("isApprovedTranslation", isApprovedTranslation).append("inResponseToPostId", inResponseToPostId).append("inResponseToRemovedAt", inResponseToRemovedAt).append("isTitleSynthesized", isTitleSynthesized).append("allowResponses", allowResponses).append("importedUrl", importedUrl).append("importedPublishedAt", importedPublishedAt).append("visibility", visibility).append("uniqueSlug", uniqueSlug).append("previewContent", previewContent).append("license", license).append("inResponseToMediaResourceId", inResponseToMediaResourceId).append("canonicalUrl", canonicalUrl).append("approvedHomeCollectionId", approvedHomeCollectionId).append("newsletterId", newsletterId).append("webCanonicalUrl", webCanonicalUrl).append("mediumUrl", mediumUrl).append("migrationId", migrationId).append("notifyFollowers", notifyFollowers).append("notifyTwitter", notifyTwitter).append("isSponsored", isSponsored).append("isRequestToPubDisabled", isRequestToPubDisabled).append("notifyFacebook", notifyFacebook).append("responseHiddenOnParentPostAt", responseHiddenOnParentPostAt).append("isSeries", isSeries).append("isSubscriptionLocked", isSubscriptionLocked).append("seriesLastAppendedAt", seriesLastAppendedAt).append("audioVersionDurationSec", audioVersionDurationSec).append("sequenceId", sequenceId).append("isNsfw", isNsfw).append("isEligibleForRevenue", isEligibleForRevenue).append("isBlockedFromHightower", isBlockedFromHightower).append("deletedAt", deletedAt).append("lockedPostSource", lockedPostSource).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isApprovedTranslation).append(visibility).append(importedPublishedAt).append(isTitleSynthesized).append(type).append(webCanonicalUrl).append(acceptedAt).append(latestVersion).append(experimentalCss).append(latestPublishedVersion).append(canonicalUrl).append(importedUrl).append(deletedAt).append(inResponseToMediaResourceId).append(inResponseToPostId).append(uniqueSlug).append(vote).append(displayAuthor).append(coverless).append(allowResponses).append(notifyFacebook).append(notifyFollowers).append(content).append(additionalProperties).append(migrationId).append(slug).append(sequenceId).append(newsletterId).append(virtuals).append(approvedHomeCollectionId).append(isNsfw).append(seriesLastAppendedAt).append(previewContent).append(isSubscriptionLocked).append(responseHiddenOnParentPostAt).append(id).append(title).append(isEligibleForRevenue).append(createdAt).append(mediumUrl).append(license).append(isSponsored).append(translationSourcePostId).append(hasUnpublishedEdits).append(latestPublishedAt).append(homeCollectionId).append(audioVersionDurationSec).append(creatorId).append(firstPublishedAt).append(isRequestToPubDisabled).append(latestRev).append(inResponseToRemovedAt).append(isSeries).append(updatedAt).append(detectedLanguage).append(notifyTwitter).append(lockedPostSource).append(versionId).append(isBlockedFromHightower).append(translationSourceCreatorId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof E312f6347cdc) == false) {
            return false;
        }
        E312f6347cdc rhs = ((E312f6347cdc) other);
        return new EqualsBuilder().append(isApprovedTranslation, rhs.isApprovedTranslation).append(visibility, rhs.visibility).append(importedPublishedAt, rhs.importedPublishedAt).append(isTitleSynthesized, rhs.isTitleSynthesized).append(type, rhs.type).append(webCanonicalUrl, rhs.webCanonicalUrl).append(acceptedAt, rhs.acceptedAt).append(latestVersion, rhs.latestVersion).append(experimentalCss, rhs.experimentalCss).append(latestPublishedVersion, rhs.latestPublishedVersion).append(canonicalUrl, rhs.canonicalUrl).append(importedUrl, rhs.importedUrl).append(deletedAt, rhs.deletedAt).append(inResponseToMediaResourceId, rhs.inResponseToMediaResourceId).append(inResponseToPostId, rhs.inResponseToPostId).append(uniqueSlug, rhs.uniqueSlug).append(vote, rhs.vote).append(displayAuthor, rhs.displayAuthor).append(coverless, rhs.coverless).append(allowResponses, rhs.allowResponses).append(notifyFacebook, rhs.notifyFacebook).append(notifyFollowers, rhs.notifyFollowers).append(content, rhs.content).append(additionalProperties, rhs.additionalProperties).append(migrationId, rhs.migrationId).append(slug, rhs.slug).append(sequenceId, rhs.sequenceId).append(newsletterId, rhs.newsletterId).append(virtuals, rhs.virtuals).append(approvedHomeCollectionId, rhs.approvedHomeCollectionId).append(isNsfw, rhs.isNsfw).append(seriesLastAppendedAt, rhs.seriesLastAppendedAt).append(previewContent, rhs.previewContent).append(isSubscriptionLocked, rhs.isSubscriptionLocked).append(responseHiddenOnParentPostAt, rhs.responseHiddenOnParentPostAt).append(id, rhs.id).append(title, rhs.title).append(isEligibleForRevenue, rhs.isEligibleForRevenue).append(createdAt, rhs.createdAt).append(mediumUrl, rhs.mediumUrl).append(license, rhs.license).append(isSponsored, rhs.isSponsored).append(translationSourcePostId, rhs.translationSourcePostId).append(hasUnpublishedEdits, rhs.hasUnpublishedEdits).append(latestPublishedAt, rhs.latestPublishedAt).append(homeCollectionId, rhs.homeCollectionId).append(audioVersionDurationSec, rhs.audioVersionDurationSec).append(creatorId, rhs.creatorId).append(firstPublishedAt, rhs.firstPublishedAt).append(isRequestToPubDisabled, rhs.isRequestToPubDisabled).append(latestRev, rhs.latestRev).append(inResponseToRemovedAt, rhs.inResponseToRemovedAt).append(isSeries, rhs.isSeries).append(updatedAt, rhs.updatedAt).append(detectedLanguage, rhs.detectedLanguage).append(notifyTwitter, rhs.notifyTwitter).append(lockedPostSource, rhs.lockedPostSource).append(versionId, rhs.versionId).append(isBlockedFromHightower, rhs.isBlockedFromHightower).append(translationSourceCreatorId, rhs.translationSourceCreatorId).isEquals();
    }

}
