package com.example.melg.aerisweatherapp.backendcall;

import com.example.melg.aerisweatherapp.model.WeatherResponseObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AerisWeatherCall {

    @GET("forecasts/11101?client_id=82Zay5xSMItNKQR23ztLt&client_secret=KRFIo7dd1Bs1R0tCNrqLgAO5XHcjthiKupZXErvo")
    Call<WeatherResponseObject> getWeatherBody();

}
