package com.jdoneill.retrofit.fulcrum.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("user")
    @Expose
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
