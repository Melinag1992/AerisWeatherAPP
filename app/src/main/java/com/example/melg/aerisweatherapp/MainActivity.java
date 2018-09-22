package com.example.melg.aerisweatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String url = "https://api.aerisapi.com/forecasts/";
    private String clientID ="82Zay5xSMItNKQR23ztLt";
    private String clientSecret= "KRFIo7dd1Bs1R0tCNrqLgAO5XHcjthiKupZXErvo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
