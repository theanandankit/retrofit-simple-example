package com.example.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.retrofitexample.model.data;
import com.example.retrofitexample.retrofit.ApiClint;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    // Forth step
    // call the url Interface through the Call Method of Retrofit

    TextView city,temp,weather;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city=findViewById(R.id.city);
        temp=findViewById(R.id.temp);
        weather=findViewById(R.id.weather);
        button=findViewById(R.id.get);

        // crete the object of APIclint class
        final ApiClint apiClint=new ApiClint();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // call the CALL method of Retrofit and pass the Query


                Call<data> call=apiClint.getApiinterface().get_data("24.780010","84.981827","38e8b3043b0eda5c4cae704a57a20e93");

                call.enqueue(new Callback<data>() {
                    @Override
                    public void onResponse(Call<data> call, Response<data> response) {

                        Log.e("ert",response.body().getName());        // get the Json file in the response.body

                        city.setText(response.body().getName());
                        temp.setText(String.valueOf(response.body().getMain().getTemp()));
                        weather.setText(response.body().getWeather().get(0).getDescription());

                    }

                    @Override
                    public void onFailure(Call<data> call, Throwable t) {

                        Log.e("error",t.getMessage());

                    }
                });
            }
        });


    }

}