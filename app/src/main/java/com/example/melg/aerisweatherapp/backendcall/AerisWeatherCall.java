package com.example.melg.aerisweatherapp.backendcall;

import com.example.melg.aerisweatherapp.model.WeatherResponseObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AerisWeatherCall {

    @GET("11101?client_id=CLIENT_ID&client_secret=CLIENT_SECRET")
    Call<WeatherResponseObject> getWeatherBody(@Query("CLIENT_ID") String clientID , @Query("CLIENT_SECRET") String clientSecret);

}
