
package com.jdoneill.retrofit.fulcrum.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Context {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("api_token")
    @Expose
    private String apiToken;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("role")
    @Expose
    private Role role;
    @SerializedName("plan")
    @Expose
    private Plan plan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

}
