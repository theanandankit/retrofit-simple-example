package com.example.retrofitexample.retrofit;

import com.example.retrofitexample.model.data;

import java.util.Date;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Retrofit_interface {

    // first step ....
    // create the interface for the Retrofit
    // then go to the step second .... create the class name Apiclint where we define the base url and other info.
    @GET("weather")
    Call<data> get_data(@Query("lat") String lat, @Query("lon") String lon, @Query("appid") String appid);
}
