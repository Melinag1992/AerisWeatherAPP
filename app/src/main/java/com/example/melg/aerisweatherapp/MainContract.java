package com.example.melg.aerisweatherapp;

public interface MainContract {

    interface presenter {
        void changeToCelsuisToggle();
        void getRetrofit();
    }

    interface view {
        void displayTemp();
        void displayDate();
        void displayTime();
        void displayHumidity();
        void displayAverageTemp();

        void displayCelsiusTemp();
        void displayCelsiusAverageTemp();


    }

    interface getAerisInteractor {

    }

}
