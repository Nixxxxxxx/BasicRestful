package com.example.zero.httpconnectionbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvWeatherJson;
    Button btnGet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvWeatherJson = (TextView) findViewById(R.id.tv_weather_json);
        btnGet = (Button) findViewById(R.id.btn_fetch_weather);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // new GetAsync(tvWeatherJson).execute();
                new PostAsync(tvWeatherJson).execute();
            }
        });
    }





}


