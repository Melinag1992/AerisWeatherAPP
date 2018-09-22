package com.example.melg.aerisweatherapp;



public class Presenter implements MainContract.presenter{

private final MainContract.view view;


public Presenter(MainContract.view view){
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
