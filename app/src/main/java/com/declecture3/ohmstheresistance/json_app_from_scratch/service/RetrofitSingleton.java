package com.declecture3.ohmstheresistance.json_app_from_scratch.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//whenever a retrofit singleton is made, this is usually the code to use with only the base url changing.


    public class RetrofitSingleton {

        private static Retrofit ourInstance;

        private RetrofitSingleton() { }

        public static Retrofit getInstance() {
            if (ourInstance != null) {
                return ourInstance;
            }
            ourInstance = new Retrofit.Builder()
                    .baseUrl("https://api.learn2crack.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return ourInstance;
        }

    }
