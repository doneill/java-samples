package com.jdoneill.retrofit.fulcrum.data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface FulcrumApi{
    @Headers({"Accept: application/json"})
    @GET("api/v2/users")
    Call<Account> getAccount(@Query("token") String apikey);
}