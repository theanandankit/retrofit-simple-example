package com.example.retrofitexample.model;

import java.util.ArrayList;

public class data {

    // Third step
    // main POJO class for the retrofit return JSON file
    // for reference see the response of GET METHOD in README.md file.
    // Step 4 go to the main activity

    coord coord;

    ArrayList<weather_info> weather;

    main_info main;

    String name;

    public data(com.example.retrofitexample.model.coord coord, ArrayList<weather_info> weather, main_info main, String name) {
        this.coord = coord;
        this.weather = weather;
        this.main = main;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.example.retrofitexample.model.coord getCoord() {
        return coord;
    }

    public void setCoord(com.example.retrofitexample.model.coord coord) {
        this.coord = coord;
    }

    public ArrayList<weather_info> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<weather_info> weather) {
        this.weather = weather;
    }

    public main_info getMain() {
        return main;
    }

    public void setMain(main_info main) {
        this.main = main;
    }
}
