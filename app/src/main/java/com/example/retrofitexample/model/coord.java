package com.example.retrofitexample.model;

public class coord {

    Float lon;

    Float lat;

    public coord(Float lon, Float lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }
}
