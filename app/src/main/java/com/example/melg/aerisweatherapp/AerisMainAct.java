package com.example.melg.aerisweatherapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.melg.aerisweatherapp.backendcall.AerisWeatherCall;
import com.example.melg.aerisweatherapp.model.WeatherResponseObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AerisMainAct extends AppCompatActivity {

    private static final String URL = "https://api.aerisapi.com/";
    private String clientID = "82Zay5xSMItNKQR23ztLt";
    private String clientSecret = "KRFIo7dd1Bs1R0tCNrqLgAO5XHcjthiKupZXErvo";
    private String TAG = "ONRESPONSEBODY";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getRetrofit();

    }


    public void getRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AerisWeatherCall aerisWeatherCall = retrofit.create(AerisWeatherCall.class);

        Call<WeatherResponseObject> response = aerisWeatherCall.getWeatherBody();
        response.enqueue(new Callback<WeatherResponseObject>() {
            @Override
            public void onResponse(Call<WeatherResponseObject> call, Response<WeatherResponseObject> response) {
                Log.d(TAG, "onResponse: " +  response.body().getResponse().get(0).getPeriods().get(0).isDay()) ;
            }

            @Override
            public void onFailure(Call<WeatherResponseObject> call, Throwable t) {
                Log.d(TAG, "onFailure: "+ t.getMessage());

            }
        });

    }

}
