
package com.jdoneill.retrofit.fulcrum.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Role {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("is_system")
    @Expose
    private Boolean isSystem;
    @SerializedName("is_default")
    @Expose
    private Boolean isDefault;
    @SerializedName("can_manage_subscription")
    @Expose
    private Boolean canManageSubscription;
    @SerializedName("can_update_organization")
    @Expose
    private Boolean canUpdateOrganization;
    @SerializedName("can_manage_members")
    @Expose
    private Boolean canManageMembers;
    @SerializedName("can_manage_roles")
    @Expose
    private Boolean canManageRoles;
    @SerializedName("can_manage_layers")
    @Expose
    private Boolean canManageLayers;
    @SerializedName("can_manage_apps")
    @Expose
    private Boolean canManageApps;
    @SerializedName("can_create_records")
    @Expose
    private Boolean canCreateRecords;
    @SerializedName("can_update_records")
    @Expose
    private Boolean canUpdateRecords;
    @SerializedName("can_delete_records")
    @Expose
    private Boolean canDeleteRecords;
    @SerializedName("can_manage_projects")
    @Expose
    private Boolean canManageProjects;
    @SerializedName("can_manage_choice_lists")
    @Expose
    private Boolean canManageChoiceLists;
    @SerializedName("can_manage_classification_sets")
    @Expose
    private Boolean canManageClassificationSets;
    @SerializedName("can_change_status")
    @Expose
    private Boolean canChangeStatus;
    @SerializedName("can_change_project")
    @Expose
    private Boolean canChangeProject;
    @SerializedName("can_assign_records")
    @Expose
    private Boolean canAssignRecords;
    @SerializedName("can_import_records")
    @Expose
    private Boolean canImportRecords;
    @SerializedName("can_export_records")
    @Expose
    private Boolean canExportRecords;
    @SerializedName("can_run_reports")
    @Expose
    private Boolean canRunReports;
    @SerializedName("can_manage_authorizations")
    @Expose
    private Boolean canManageAuthorizations;
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

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getCanManageSubscription() {
        return canManageSubscription;
    }

    public void setCanManageSubscription(Boolean canManageSubscription) {
        this.canManageSubscription = canManageSubscription;
    }

    public Boolean getCanUpdateOrganization() {
        return canUpdateOrganization;
    }

    public void setCanUpdateOrganization(Boolean canUpdateOrganization) {
        this.canUpdateOrganization = canUpdateOrganization;
    }

    public Boolean getCanManageMembers() {
        return canManageMembers;
    }

    public void setCanManageMembers(Boolean canManageMembers) {
        this.canManageMembers = canManageMembers;
    }

    public Boolean getCanManageRoles() {
        return canManageRoles;
    }

    public void setCanManageRoles(Boolean canManageRoles) {
        this.canManageRoles = canManageRoles;
    }

    public Boolean getCanManageLayers() {
        return canManageLayers;
    }

    public void setCanManageLayers(Boolean canManageLayers) {
        this.canManageLayers = canManageLayers;
    }

    public Boolean getCanManageApps() {
        return canManageApps;
    }

    public void setCanManageApps(Boolean canManageApps) {
        this.canManageApps = canManageApps;
    }

    public Boolean getCanCreateRecords() {
        return canCreateRecords;
    }

    public void setCanCreateRecords(Boolean canCreateRecords) {
        this.canCreateRecords = canCreateRecords;
    }

    public Boolean getCanUpdateRecords() {
        return canUpdateRecords;
    }

    public void setCanUpdateRecords(Boolean canUpdateRecords) {
        this.canUpdateRecords = canUpdateRecords;
    }

    public Boolean getCanDeleteRecords() {
        return canDeleteRecords;
    }

    public void setCanDeleteRecords(Boolean canDeleteRecords) {
        this.canDeleteRecords = canDeleteRecords;
    }

    public Boolean getCanManageProjects() {
        return canManageProjects;
    }

    public void setCanManageProjects(Boolean canManageProjects) {
        this.canManageProjects = canManageProjects;
    }

    public Boolean getCanManageChoiceLists() {
        return canManageChoiceLists;
    }

    public void setCanManageChoiceLists(Boolean canManageChoiceLists) {
        this.canManageChoiceLists = canManageChoiceLists;
    }

    public Boolean getCanManageClassificationSets() {
        return canManageClassificationSets;
    }

    public void setCanManageClassificationSets(Boolean canManageClassificationSets) {
        this.canManageClassificationSets = canManageClassificationSets;
    }

    public Boolean getCanChangeStatus() {
        return canChangeStatus;
    }

    public void setCanChangeStatus(Boolean canChangeStatus) {
        this.canChangeStatus = canChangeStatus;
    }

    public Boolean getCanChangeProject() {
        return canChangeProject;
    }

    public void setCanChangeProject(Boolean canChangeProject) {
        this.canChangeProject = canChangeProject;
    }

    public Boolean getCanAssignRecords() {
        return canAssignRecords;
    }

    public void setCanAssignRecords(Boolean canAssignRecords) {
        this.canAssignRecords = canAssignRecords;
    }

    public Boolean getCanImportRecords() {
        return canImportRecords;
    }

    public void setCanImportRecords(Boolean canImportRecords) {
        this.canImportRecords = canImportRecords;
    }

    public Boolean getCanExportRecords() {
        return canExportRecords;
    }

    public void setCanExportRecords(Boolean canExportRecords) {
        this.canExportRecords = canExportRecords;
    }

    public Boolean getCanRunReports() {
        return canRunReports;
    }

    public void setCanRunReports(Boolean canRunReports) {
        this.canRunReports = canRunReports;
    }

    public Boolean getCanManageAuthorizations() {
        return canManageAuthorizations;
    }

    public void setCanManageAuthorizations(Boolean canManageAuthorizations) {
        this.canManageAuthorizations = canManageAuthorizations;
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
