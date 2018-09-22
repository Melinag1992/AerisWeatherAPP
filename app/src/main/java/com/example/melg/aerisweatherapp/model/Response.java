package com.example.melg.aerisweatherapp.model;

import java.util.List;

public class Response {
    private Profile profile;
    private List<Periods> periods;
    private String interval;
    private Loc loc;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Periods> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Periods> periods) {
        this.periods = periods;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public Loc getLoc() {
        return loc;
    }

    public void setLoc(Loc loc) {
        this.loc = loc;
    }
}
