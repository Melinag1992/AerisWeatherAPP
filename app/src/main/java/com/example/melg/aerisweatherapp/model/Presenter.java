package com.example.melg.aerisweatherapp.model;

import com.example.melg.aerisweatherapp.MainActWeatherMVP;

public class Presenter implements MainActWeatherMVP.presenter{

private final MainActWeatherMVP.view view;


public Presenter(MainActWeatherMVP.view view){
    this.view = view;
}

    @Override
    public void changeToCelsuisToggle() {

    }
}
