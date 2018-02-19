package com.jdoneill.retrofit.fulcrum.controller;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.jdoneill.retrofit.fulcrum.BuildConfig;
import com.jdoneill.retrofit.fulcrum.data.FulcrumApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller implements Callback<HashMap<String, Object>>{
    private String APIKEY = BuildConfig.APIKEY;
    static final String BASE_URL = "https://api.fulcrumapp.com";

    public void start(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        FulcrumApi fulcrumApi = retrofit.create(FulcrumApi.class);
        Call<HashMap<String, Object>> call = fulcrumApi.getAccount(APIKEY);
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<HashMap<String, Object>> call, Response<HashMap<String, Object>> response){
        if(response.isSuccessful()){
            HashMap<String, Object> map = response.body();
            
            String json = response.body().toString();
            System.out.println("User: " + json);

            // JsonParser parser = new JsonParser();
            // JsonElement jsonTree = parser.parse(json);
            // if(jsonTree.isJsonObject()){
            //     JsonObject jsonObject = jsonTree.getAsJsonObject();
            //     JsonElement name = jsonObject.get("first_name");
            //     System.out.println("Name: " + name.toString());
            // }

            // String json = (String) map.get("user");
            // JsonElement jelement = new JsonParser().parse(json);
            // JsonObject  jobject = jelement.getAsJsonObject();
            // jobject = jobject.getAsJsonObject("email");
            // JsonArray jarray = jobject.getAsJsonArray("translations");
            // jobject = jarray.get(0).getAsJsonObject();
            // String result = jobject.get("translatedText").getAsString();

        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<HashMap<String, Object>> call, Throwable t){
        t.printStackTrace();
    }

}