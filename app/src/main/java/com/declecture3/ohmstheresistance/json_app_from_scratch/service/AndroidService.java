package com.declecture3.ohmstheresistance.json_app_from_scratch.service;


import com.declecture3.ohmstheresistance.json_app_from_scratch.model.AndroidList;


import retrofit2.Call;
import retrofit2.http.GET;

public interface AndroidService {
//using the last part of the website to get the json information
    //call from androidlist

    @GET("android/jsonandroid/")
    Call<AndroidList> getAndroid();


}
