package com.example.melg.aerisweatherapp;

public interface MainActWeatherMVP {


    interface view {
        void displayTemp();
        void displayDate();
        void displayTime();
        void displayHumidity();
        void displayAverageTemp();

        void displayCelsiusTemp();
        void displayCelsiusAverageTemp();


    }

    interface presenter {
        void changeToCelsuisToggle();
        void getRetrofit();
    }
}
