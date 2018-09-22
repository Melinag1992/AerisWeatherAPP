package com.example.melg.aerisweatherapp.model;

import java.util.List;

public class Periods {
    private String sunsetISO;
    private int sunset;
    private String sunriseISO;
    private int sunrise;
    private boolean isDay;
    private String icon;
    private String cloudsCoded;
    private String weatherPrimaryCoded;
    private String weatherPrimary;
    private String weather;
    private int windSpeedMPH;
    private String windDir;
    private int feelslikeF;
    private int feelslikeC;
    private double precipIN;
    private double precipMM;
    private int pop;
    private int minTempF;
    private int minTempC;
    private int maxTempF;
    private int maxTempC;
    private String dateTimeISO;
    private String validTime;
    private int timestamp;

    public String getSunsetISO() {
        return sunsetISO;
    }

    public void setSunsetISO(String sunsetISO) {
        this.sunsetISO = sunsetISO;
    }

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public String getSunriseISO() {
        return sunriseISO;
    }

    public void setSunriseISO(String sunriseISO) {
        this.sunriseISO = sunriseISO;
    }

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public boolean isDay() {
        return isDay;
    }

    public void setDay(boolean day) {
        isDay = day;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCloudsCoded() {
        return cloudsCoded;
    }

    public void setCloudsCoded(String cloudsCoded) {
        this.cloudsCoded = cloudsCoded;
    }

    public String getWeatherPrimaryCoded() {
        return weatherPrimaryCoded;
    }

    public void setWeatherPrimaryCoded(String weatherPrimaryCoded) {
        this.weatherPrimaryCoded = weatherPrimaryCoded;
    }

    public String getWeatherPrimary() {
        return weatherPrimary;
    }

    public void setWeatherPrimary(String weatherPrimary) {
        this.weatherPrimary = weatherPrimary;
    }


    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getWindSpeedMPH() {
        return windSpeedMPH;
    }

    public void setWindSpeedMPH(int windSpeedMPH) {
        this.windSpeedMPH = windSpeedMPH;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public int getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(int feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public int getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(int feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public double getPrecipIN() {
        return precipIN;
    }

    public void setPrecipIN(double precipIN) {
        this.precipIN = precipIN;
    }

    public double getPrecipMM() {
        return precipMM;
    }

    public void setPrecipMM(double precipMM) {
        this.precipMM = precipMM;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public int getMinTempF() {
        return minTempF;
    }

    public void setMinTempF(int minTempF) {
        this.minTempF = minTempF;
    }

    public int getMinTempC() {
        return minTempC;
    }

    public void setMinTempC(int minTempC) {
        this.minTempC = minTempC;
    }

    public int getMaxTempF() {
        return maxTempF;
    }

    public void setMaxTempF(int maxTempF) {
        this.maxTempF = maxTempF;
    }

    public int getMaxTempC() {
        return maxTempC;
    }

    public void setMaxTempC(int maxTempC) {
        this.maxTempC = maxTempC;
    }

    public String getDateTimeISO() {
        return dateTimeISO;
    }

    public void setDateTimeISO(String dateTimeISO) {
        this.dateTimeISO = dateTimeISO;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
}
