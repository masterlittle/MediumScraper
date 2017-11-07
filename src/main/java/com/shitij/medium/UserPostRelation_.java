
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
    "userId",
    "postId",
    "readAt",
    "readLaterAddedAt",
    "votedAt",
    "collaboratorAddedAt",
    "notesAddedAt",
    "subscribedAt",
    "lastReadSectionName",
    "lastReadVersionId",
    "lastReadAt",
    "lastReadParagraphName",
    "lastReadPercentage",
    "viewedAt",
    "presentedCountInResponseManagement",
    "clapCount",
    "seriesUpdateNotifsOptedInAt",
    "queuedAt",
    "seriesFirstViewedAt",
    "presentedCountInStream",
    "seriesLastViewedAt",
    "audioProgressSec"
})
public class UserPostRelation_ {

    @JsonProperty("userId")
    private String userId;
    @JsonProperty("postId")
    private String postId;
    @JsonProperty("readAt")
    private long readAt;
    @JsonProperty("readLaterAddedAt")
    private long readLaterAddedAt;
    @JsonProperty("votedAt")
    private long votedAt;
    @JsonProperty("collaboratorAddedAt")
    private long collaboratorAddedAt;
    @JsonProperty("notesAddedAt")
    private long notesAddedAt;
    @JsonProperty("subscribedAt")
    private long subscribedAt;
    @JsonProperty("lastReadSectionName")
    private String lastReadSectionName;
    @JsonProperty("lastReadVersionId")
    private String lastReadVersionId;
    @JsonProperty("lastReadAt")
    private long lastReadAt;
    @JsonProperty("lastReadParagraphName")
    private String lastReadParagraphName;
    @JsonProperty("lastReadPercentage")
    private long lastReadPercentage;
    @JsonProperty("viewedAt")
    private long viewedAt;
    @JsonProperty("presentedCountInResponseManagement")
    private long presentedCountInResponseManagement;
    @JsonProperty("clapCount")
    private long clapCount;
    @JsonProperty("seriesUpdateNotifsOptedInAt")
    private long seriesUpdateNotifsOptedInAt;
    @JsonProperty("queuedAt")
    private long queuedAt;
    @JsonProperty("seriesFirstViewedAt")
    private long seriesFirstViewedAt;
    @JsonProperty("presentedCountInStream")
    private long presentedCountInStream;
    @JsonProperty("seriesLastViewedAt")
    private long seriesLastViewedAt;
    @JsonProperty("audioProgressSec")
    private long audioProgressSec;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("postId")
    public String getPostId() {
        return postId;
    }

    @JsonProperty("postId")
    public void setPostId(String postId) {
        this.postId = postId;
    }

    @JsonProperty("readAt")
    public long getReadAt() {
        return readAt;
    }

    @JsonProperty("readAt")
    public void setReadAt(long readAt) {
        this.readAt = readAt;
    }

    @JsonProperty("readLaterAddedAt")
    public long getReadLaterAddedAt() {
        return readLaterAddedAt;
    }

    @JsonProperty("readLaterAddedAt")
    public void setReadLaterAddedAt(long readLaterAddedAt) {
        this.readLaterAddedAt = readLaterAddedAt;
    }

    @JsonProperty("votedAt")
    public long getVotedAt() {
        return votedAt;
    }

    @JsonProperty("votedAt")
    public void setVotedAt(long votedAt) {
        this.votedAt = votedAt;
    }

    @JsonProperty("collaboratorAddedAt")
    public long getCollaboratorAddedAt() {
        return collaboratorAddedAt;
    }

    @JsonProperty("collaboratorAddedAt")
    public void setCollaboratorAddedAt(long collaboratorAddedAt) {
        this.collaboratorAddedAt = collaboratorAddedAt;
    }

    @JsonProperty("notesAddedAt")
    public long getNotesAddedAt() {
        return notesAddedAt;
    }

    @JsonProperty("notesAddedAt")
    public void setNotesAddedAt(long notesAddedAt) {
        this.notesAddedAt = notesAddedAt;
    }

    @JsonProperty("subscribedAt")
    public long getSubscribedAt() {
        return subscribedAt;
    }

    @JsonProperty("subscribedAt")
    public void setSubscribedAt(long subscribedAt) {
        this.subscribedAt = subscribedAt;
    }

    @JsonProperty("lastReadSectionName")
    public String getLastReadSectionName() {
        return lastReadSectionName;
    }

    @JsonProperty("lastReadSectionName")
    public void setLastReadSectionName(String lastReadSectionName) {
        this.lastReadSectionName = lastReadSectionName;
    }

    @JsonProperty("lastReadVersionId")
    public String getLastReadVersionId() {
        return lastReadVersionId;
    }

    @JsonProperty("lastReadVersionId")
    public void setLastReadVersionId(String lastReadVersionId) {
        this.lastReadVersionId = lastReadVersionId;
    }

    @JsonProperty("lastReadAt")
    public long getLastReadAt() {
        return lastReadAt;
    }

    @JsonProperty("lastReadAt")
    public void setLastReadAt(long lastReadAt) {
        this.lastReadAt = lastReadAt;
    }

    @JsonProperty("lastReadParagraphName")
    public String getLastReadParagraphName() {
        return lastReadParagraphName;
    }

    @JsonProperty("lastReadParagraphName")
    public void setLastReadParagraphName(String lastReadParagraphName) {
        this.lastReadParagraphName = lastReadParagraphName;
    }

    @JsonProperty("lastReadPercentage")
    public long getLastReadPercentage() {
        return lastReadPercentage;
    }

    @JsonProperty("lastReadPercentage")
    public void setLastReadPercentage(long lastReadPercentage) {
        this.lastReadPercentage = lastReadPercentage;
    }

    @JsonProperty("viewedAt")
    public long getViewedAt() {
        return viewedAt;
    }

    @JsonProperty("viewedAt")
    public void setViewedAt(long viewedAt) {
        this.viewedAt = viewedAt;
    }

    @JsonProperty("presentedCountInResponseManagement")
    public long getPresentedCountInResponseManagement() {
        return presentedCountInResponseManagement;
    }

    @JsonProperty("presentedCountInResponseManagement")
    public void setPresentedCountInResponseManagement(long presentedCountInResponseManagement) {
        this.presentedCountInResponseManagement = presentedCountInResponseManagement;
    }

    @JsonProperty("clapCount")
    public long getClapCount() {
        return clapCount;
    }

    @JsonProperty("clapCount")
    public void setClapCount(long clapCount) {
        this.clapCount = clapCount;
    }

    @JsonProperty("seriesUpdateNotifsOptedInAt")
    public long getSeriesUpdateNotifsOptedInAt() {
        return seriesUpdateNotifsOptedInAt;
    }

    @JsonProperty("seriesUpdateNotifsOptedInAt")
    public void setSeriesUpdateNotifsOptedInAt(long seriesUpdateNotifsOptedInAt) {
        this.seriesUpdateNotifsOptedInAt = seriesUpdateNotifsOptedInAt;
    }

    @JsonProperty("queuedAt")
    public long getQueuedAt() {
        return queuedAt;
    }

    @JsonProperty("queuedAt")
    public void setQueuedAt(long queuedAt) {
        this.queuedAt = queuedAt;
    }

    @JsonProperty("seriesFirstViewedAt")
    public long getSeriesFirstViewedAt() {
        return seriesFirstViewedAt;
    }

    @JsonProperty("seriesFirstViewedAt")
    public void setSeriesFirstViewedAt(long seriesFirstViewedAt) {
        this.seriesFirstViewedAt = seriesFirstViewedAt;
    }

    @JsonProperty("presentedCountInStream")
    public long getPresentedCountInStream() {
        return presentedCountInStream;
    }

    @JsonProperty("presentedCountInStream")
    public void setPresentedCountInStream(long presentedCountInStream) {
        this.presentedCountInStream = presentedCountInStream;
    }

    @JsonProperty("seriesLastViewedAt")
    public long getSeriesLastViewedAt() {
        return seriesLastViewedAt;
    }

    @JsonProperty("seriesLastViewedAt")
    public void setSeriesLastViewedAt(long seriesLastViewedAt) {
        this.seriesLastViewedAt = seriesLastViewedAt;
    }

    @JsonProperty("audioProgressSec")
    public long getAudioProgressSec() {
        return audioProgressSec;
    }

    @JsonProperty("audioProgressSec")
    public void setAudioProgressSec(long audioProgressSec) {
        this.audioProgressSec = audioProgressSec;
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
        return new ToStringBuilder(this).append("userId", userId).append("postId", postId).append("readAt", readAt).append("readLaterAddedAt", readLaterAddedAt).append("votedAt", votedAt).append("collaboratorAddedAt", collaboratorAddedAt).append("notesAddedAt", notesAddedAt).append("subscribedAt", subscribedAt).append("lastReadSectionName", lastReadSectionName).append("lastReadVersionId", lastReadVersionId).append("lastReadAt", lastReadAt).append("lastReadParagraphName", lastReadParagraphName).append("lastReadPercentage", lastReadPercentage).append("viewedAt", viewedAt).append("presentedCountInResponseManagement", presentedCountInResponseManagement).append("clapCount", clapCount).append("seriesUpdateNotifsOptedInAt", seriesUpdateNotifsOptedInAt).append("queuedAt", queuedAt).append("seriesFirstViewedAt", seriesFirstViewedAt).append("presentedCountInStream", presentedCountInStream).append("seriesLastViewedAt", seriesLastViewedAt).append("audioProgressSec", audioProgressSec).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(viewedAt).append(readLaterAddedAt).append(clapCount).append(lastReadAt).append(presentedCountInStream).append(readAt).append(lastReadSectionName).append(queuedAt).append(seriesFirstViewedAt).append(postId).append(presentedCountInResponseManagement).append(audioProgressSec).append(seriesUpdateNotifsOptedInAt).append(subscribedAt).append(votedAt).append(lastReadPercentage).append(additionalProperties).append(userId).append(seriesLastViewedAt).append(lastReadVersionId).append(lastReadParagraphName).append(notesAddedAt).append(collaboratorAddedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPostRelation_) == false) {
            return false;
        }
        UserPostRelation_ rhs = ((UserPostRelation_) other);
        return new EqualsBuilder().append(viewedAt, rhs.viewedAt).append(readLaterAddedAt, rhs.readLaterAddedAt).append(clapCount, rhs.clapCount).append(lastReadAt, rhs.lastReadAt).append(presentedCountInStream, rhs.presentedCountInStream).append(readAt, rhs.readAt).append(lastReadSectionName, rhs.lastReadSectionName).append(queuedAt, rhs.queuedAt).append(seriesFirstViewedAt, rhs.seriesFirstViewedAt).append(postId, rhs.postId).append(presentedCountInResponseManagement, rhs.presentedCountInResponseManagement).append(audioProgressSec, rhs.audioProgressSec).append(seriesUpdateNotifsOptedInAt, rhs.seriesUpdateNotifsOptedInAt).append(subscribedAt, rhs.subscribedAt).append(votedAt, rhs.votedAt).append(lastReadPercentage, rhs.lastReadPercentage).append(additionalProperties, rhs.additionalProperties).append(userId, rhs.userId).append(seriesLastViewedAt, rhs.seriesLastViewedAt).append(lastReadVersionId, rhs.lastReadVersionId).append(lastReadParagraphName, rhs.lastReadParagraphName).append(notesAddedAt, rhs.notesAddedAt).append(collaboratorAddedAt, rhs.collaboratorAddedAt).isEquals();
    }

}
