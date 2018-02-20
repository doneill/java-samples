package com.jdoneill.retrofit.fulcrum.controller;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jdoneill.retrofit.fulcrum.BuildConfig;
import com.jdoneill.retrofit.fulcrum.data.FulcrumApi;
import com.jdoneill.retrofit.fulcrum.model.Account;
import com.jdoneill.retrofit.fulcrum.model.Context;
import com.jdoneill.retrofit.fulcrum.model.Plan;
import com.jdoneill.retrofit.fulcrum.model.Role;
import com.jdoneill.retrofit.fulcrum.model.User;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller implements Callback<Account>{
    private String APIKEY = BuildConfig.APIKEY;
    static final String BASE_URL = "https://api.fulcrumapp.com";

    public void start(){

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);

        OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();

        FulcrumApi fulcrumApi = retrofit.create(FulcrumApi.class);
        Call<Account> call = fulcrumApi.getAccount(APIKEY);
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<Account> call, Response<Account> response){
        if(response.isSuccessful()){
            Account account = response.body();
            User user = account.getUser();

            System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
            System.out.println("Email: " + user.getEmail());
            
            List<Context> contexts = user.getContexts();
            for(Context context : contexts){
                Role role = context.getRole();
                System.out.println("Role: " + role.getName());
                Plan plan = context.getPlan();
                System.out.println("Plan:" + plan.getName());
                System.out.println("Since: " + role.getCreatedAt());
            }

        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<Account> call, Throwable t){
        t.printStackTrace();
    }

}