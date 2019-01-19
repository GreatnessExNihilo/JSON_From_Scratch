package com.declecture3.ohmstheresistance.json_app_from_scratch.service;


import com.declecture3.ohmstheresistance.json_app_from_scratch.model.AndroidList;


import retrofit2.Call;
import retrofit2.http.GET;

public interface AndroidService {


    @GET("android/jsonandroid/")
    Call<AndroidList> getAndroid();


}
