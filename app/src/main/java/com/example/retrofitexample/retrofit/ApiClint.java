package com.example.retrofitexample.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiClint {


    //Step second .......

    //Make the object of the Retrofit interface
    //Then define the

    Retrofit_interface apiinterface;
    public Retrofit_interface getApiinterface() {
        return apiinterface;
    }

    public ApiClint() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/data/2.5/")              // define the base url which is common in all urls
                .addConverterFactory(GsonConverterFactory.create())               // used for convert Json file into the object
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        apiinterface = retrofit.create(Retrofit_interface.class);                 // create the instance of Retrofit interface
    }

    // let create the class for return JSON file from the server.
    // for clear understanding go to the link (JSON to class):
}
