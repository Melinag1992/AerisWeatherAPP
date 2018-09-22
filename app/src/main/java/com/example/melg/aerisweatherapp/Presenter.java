package com.example.melg.aerisweatherapp;



public class Presenter implements MainActWeatherMVP.presenter{

private final MainActWeatherMVP.view view;


public Presenter(MainActWeatherMVP.view view){
    this.view = view;
}

    @Override
    public void changeToCelsuisToggle() {
        view.displayCelsiusAverageTemp();
        view.displayCelsiusTemp();

    }

    @Override
    public void getRetrofit() {
        view.displayAverageTemp();
        view.displayDate();
        view.displayHumidity();
        view.displayTime();
        view.displayTemp();
    }


}
