package com.example.dell.listview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Weather> weatherList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.hide();
        }
        initWeather();
        WeatherAdapter adapter = new WeatherAdapter(MainActivity.this, R.layout.weather_item, weatherList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initWeather() {
        Weather _1 = new Weather("Tomorrow", "Clear", "18°", "11°", R.drawable.sunny);
        weatherList.add(_1);
        Weather _2 = new Weather("Monday", "Clear", "16°", "11°", R.drawable.sunny);
        weatherList.add(_2);
        Weather _3 = new Weather("Tuesday", "Clouds", "14°", "14°", R.drawable.cloud);
        weatherList.add(_3);
        Weather _4 = new Weather("Wednesday", "Clear", "14°", "13°", R.drawable.sunny);
        weatherList.add(_4);
        Weather _5 = new Weather("Thursday", "Rain", "14°", "13°", R.drawable.rain);
        weatherList.add(_5);
        Weather _6 = new Weather("Friday", "Light_clouds", "13°", "12°", R.drawable.light_cloud);
        weatherList.add(_6);
        Weather _7 = new Weather("Saturday", "Light_rain", "11°", "10°", R.drawable.light_rain);
        weatherList.add(_7);
        Weather _8 = new Weather("Sunday", "clear", "13°", "12°", R.drawable.sunny);
        weatherList.add(_8);
    }
}

