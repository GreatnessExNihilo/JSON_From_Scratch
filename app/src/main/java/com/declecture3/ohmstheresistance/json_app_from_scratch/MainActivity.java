package com.declecture3.ohmstheresistance.json_app_from_scratch;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.declecture3.ohmstheresistance.json_app_from_scratch.controller.AndroidAdapter;
import com.declecture3.ohmstheresistance.json_app_from_scratch.model.AndroidList;
import com.declecture3.ohmstheresistance.json_app_from_scratch.model.MyAndroid;
import com.declecture3.ohmstheresistance.json_app_from_scratch.service.AndroidService;
import com.declecture3.ohmstheresistance.json_app_from_scratch.service.RetrofitSingleton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Android";
    RecyclerView androidRecyclerView;
    private final List<MyAndroid> androidList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the retrofit instance
        Retrofit retrofit = RetrofitSingleton.getInstance();

        retrofit.create(AndroidService.class)
                .getAndroid()
                .enqueue(new Callback<AndroidList>() {
                    @Override
                    public void onResponse(Call<AndroidList> call, Response<AndroidList> response) {
                        //you can log name or api or version. whichever you choose just be sure to know what you're
                        //looking for in the logcat
                        Log.d(TAG, "On Response: " + response.body().getAndroid().get(0).getVersion());
                        List<MyAndroid> myAndroidList = response.body().getAndroid();


                        androidRecyclerView = findViewById(R.id.my_android_recyclerview);

                        AndroidAdapter androidAdapter = new AndroidAdapter(myAndroidList);

                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                        //put the information on the recyclerview
                        androidRecyclerView.setAdapter(androidAdapter);
                        androidRecyclerView.setLayoutManager(linearLayoutManager);

                    }


                    @Override
                    public void onFailure(Call<AndroidList> call, Throwable t) {

                        Log.d(TAG, "On Failure: " + t.getMessage());
                    }
                });




    }
}
