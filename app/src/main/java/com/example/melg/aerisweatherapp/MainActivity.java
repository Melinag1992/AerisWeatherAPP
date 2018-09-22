package com.example.melg.aerisweatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainActWeatherMVP.view {

    private String url = "https://api.aerisapi.com/forecasts/";
    private String clientID ="82Zay5xSMItNKQR23ztLt";
    private String clientSecret= "KRFIo7dd1Bs1R0tCNrqLgAO5XHcjthiKupZXErvo";

    Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);


    }


    @Override
    public void displayTemp() {

    }

    @Override
    public void displayDate() {

    }

    @Override
    public void displayTime() {

    }

    @Override
    public void displayHumidity() {

    }

    @Override
    public void displayAverageTemp() {

    }

    @Override
    public void displayCelsiusTemp() {

    }

    @Override
    public void displayCelsiusAverageTemp() {

    }
}
