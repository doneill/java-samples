
package com.jdoneill.retrofit.fulcrum.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Plan {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("export_formats")
    @Expose
    private List<String> exportFormats = null;
    @SerializedName("export_photos")
    @Expose
    private Boolean exportPhotos;
    @SerializedName("maps_data_quota")
    @Expose
    private Object mapsDataQuota;
    @SerializedName("public_slug")
    @Expose
    private Object publicSlug;
    @SerializedName("public_color")
    @Expose
    private String publicColor;
    @SerializedName("base_price_in_cents")
    @Expose
    private Integer basePriceInCents;
    @SerializedName("price_in_cents")
    @Expose
    private Integer priceInCents;
    @SerializedName("included_users")
    @Expose
    private Integer includedUsers;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("versioning_enabled")
    @Expose
    private Boolean versioningEnabled;
    @SerializedName("webhooks_enabled")
    @Expose
    private Boolean webhooksEnabled;
    @SerializedName("view_history_enabled")
    @Expose
    private Boolean viewHistoryEnabled;
    @SerializedName("repeatables_enabled")
    @Expose
    private Boolean repeatablesEnabled;
    @SerializedName("export_reports_enabled")
    @Expose
    private Boolean exportReportsEnabled;
    @SerializedName("export_full_history_enabled")
    @Expose
    private Boolean exportFullHistoryEnabled;
    @SerializedName("record_merging_enabled")
    @Expose
    private Boolean recordMergingEnabled;
    @SerializedName("export_changesets_enabled")
    @Expose
    private Boolean exportChangesetsEnabled;
    @SerializedName("activity_feed_enabled")
    @Expose
    private Boolean activityFeedEnabled;
    @SerializedName("data_shares_enabled")
    @Expose
    private Boolean dataSharesEnabled;
    @SerializedName("data_shares_limit")
    @Expose
    private Object dataSharesLimit;
    @SerializedName("media_data_quota")
    @Expose
    private Object mediaDataQuota;
    @SerializedName("media_data_usage_includes_photos")
    @Expose
    private Boolean mediaDataUsageIncludesPhotos;
    @SerializedName("media_data_usage_includes_signatures")
    @Expose
    private Boolean mediaDataUsageIncludesSignatures;
    @SerializedName("media_data_usage_includes_videos")
    @Expose
    private Boolean mediaDataUsageIncludesVideos;
    @SerializedName("videos_enabled")
    @Expose
    private Boolean videosEnabled;
    @SerializedName("audio_enabled")
    @Expose
    private Boolean audioEnabled;
    @SerializedName("record_links_enabled")
    @Expose
    private Boolean recordLinksEnabled;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getExportFormats() {
        return exportFormats;
    }

    public void setExportFormats(List<String> exportFormats) {
        this.exportFormats = exportFormats;
    }

    public Boolean getExportPhotos() {
        return exportPhotos;
    }

    public void setExportPhotos(Boolean exportPhotos) {
        this.exportPhotos = exportPhotos;
    }

    public Object getMapsDataQuota() {
        return mapsDataQuota;
    }

    public void setMapsDataQuota(Object mapsDataQuota) {
        this.mapsDataQuota = mapsDataQuota;
    }

    public Object getPublicSlug() {
        return publicSlug;
    }

    public void setPublicSlug(Object publicSlug) {
        this.publicSlug = publicSlug;
    }

    public String getPublicColor() {
        return publicColor;
    }

    public void setPublicColor(String publicColor) {
        this.publicColor = publicColor;
    }

    public Integer getBasePriceInCents() {
        return basePriceInCents;
    }

    public void setBasePriceInCents(Integer basePriceInCents) {
        this.basePriceInCents = basePriceInCents;
    }

    public Integer getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(Integer priceInCents) {
        this.priceInCents = priceInCents;
    }

    public Integer getIncludedUsers() {
        return includedUsers;
    }

    public void setIncludedUsers(Integer includedUsers) {
        this.includedUsers = includedUsers;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getVersioningEnabled() {
        return versioningEnabled;
    }

    public void setVersioningEnabled(Boolean versioningEnabled) {
        this.versioningEnabled = versioningEnabled;
    }

    public Boolean getWebhooksEnabled() {
        return webhooksEnabled;
    }

    public void setWebhooksEnabled(Boolean webhooksEnabled) {
        this.webhooksEnabled = webhooksEnabled;
    }

    public Boolean getViewHistoryEnabled() {
        return viewHistoryEnabled;
    }

    public void setViewHistoryEnabled(Boolean viewHistoryEnabled) {
        this.viewHistoryEnabled = viewHistoryEnabled;
    }

    public Boolean getRepeatablesEnabled() {
        return repeatablesEnabled;
    }

    public void setRepeatablesEnabled(Boolean repeatablesEnabled) {
        this.repeatablesEnabled = repeatablesEnabled;
    }

    public Boolean getExportReportsEnabled() {
        return exportReportsEnabled;
    }

    public void setExportReportsEnabled(Boolean exportReportsEnabled) {
        this.exportReportsEnabled = exportReportsEnabled;
    }

    public Boolean getExportFullHistoryEnabled() {
        return exportFullHistoryEnabled;
    }

    public void setExportFullHistoryEnabled(Boolean exportFullHistoryEnabled) {
        this.exportFullHistoryEnabled = exportFullHistoryEnabled;
    }

    public Boolean getRecordMergingEnabled() {
        return recordMergingEnabled;
    }

    public void setRecordMergingEnabled(Boolean recordMergingEnabled) {
        this.recordMergingEnabled = recordMergingEnabled;
    }

    public Boolean getExportChangesetsEnabled() {
        return exportChangesetsEnabled;
    }

    public void setExportChangesetsEnabled(Boolean exportChangesetsEnabled) {
        this.exportChangesetsEnabled = exportChangesetsEnabled;
    }

    public Boolean getActivityFeedEnabled() {
        return activityFeedEnabled;
    }

    public void setActivityFeedEnabled(Boolean activityFeedEnabled) {
        this.activityFeedEnabled = activityFeedEnabled;
    }

    public Boolean getDataSharesEnabled() {
        return dataSharesEnabled;
    }

    public void setDataSharesEnabled(Boolean dataSharesEnabled) {
        this.dataSharesEnabled = dataSharesEnabled;
    }

    public Object getDataSharesLimit() {
        return dataSharesLimit;
    }

    public void setDataSharesLimit(Object dataSharesLimit) {
        this.dataSharesLimit = dataSharesLimit;
    }

    public Object getMediaDataQuota() {
        return mediaDataQuota;
    }

    public void setMediaDataQuota(Object mediaDataQuota) {
        this.mediaDataQuota = mediaDataQuota;
    }

    public Boolean getMediaDataUsageIncludesPhotos() {
        return mediaDataUsageIncludesPhotos;
    }

    public void setMediaDataUsageIncludesPhotos(Boolean mediaDataUsageIncludesPhotos) {
        this.mediaDataUsageIncludesPhotos = mediaDataUsageIncludesPhotos;
    }

    public Boolean getMediaDataUsageIncludesSignatures() {
        return mediaDataUsageIncludesSignatures;
    }

    public void setMediaDataUsageIncludesSignatures(Boolean mediaDataUsageIncludesSignatures) {
        this.mediaDataUsageIncludesSignatures = mediaDataUsageIncludesSignatures;
    }

    public Boolean getMediaDataUsageIncludesVideos() {
        return mediaDataUsageIncludesVideos;
    }

    public void setMediaDataUsageIncludesVideos(Boolean mediaDataUsageIncludesVideos) {
        this.mediaDataUsageIncludesVideos = mediaDataUsageIncludesVideos;
    }

    public Boolean getVideosEnabled() {
        return videosEnabled;
    }

    public void setVideosEnabled(Boolean videosEnabled) {
        this.videosEnabled = videosEnabled;
    }

    public Boolean getAudioEnabled() {
        return audioEnabled;
    }

    public void setAudioEnabled(Boolean audioEnabled) {
        this.audioEnabled = audioEnabled;
    }

    public Boolean getRecordLinksEnabled() {
        return recordLinksEnabled;
    }

    public void setRecordLinksEnabled(Boolean recordLinksEnabled) {
        this.recordLinksEnabled = recordLinksEnabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
