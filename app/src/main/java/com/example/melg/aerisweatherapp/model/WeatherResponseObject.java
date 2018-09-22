package com.example.melg.aerisweatherapp.model;

import java.util.List;

public class WeatherResponseObject {

    private List<Response> response;
    private boolean success;

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
