package com.example.dell.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    private int resourceId;
    public WeatherAdapter(Context context, int textViewResourceId, List<Weather> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Weather weather = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView weatherImage = (ImageView) view.findViewById(R.id.weather_image);
        TextView describe = (TextView) view.findViewById(R.id.describ);
        TextView day = (TextView) view.findViewById(R.id.day);
        TextView temp1 = (TextView) view.findViewById(R.id.temp1);
        TextView temp2 = (TextView) view.findViewById(R.id.temp2);
        weatherImage.setImageResource(weather.getImageId());
        describe.setText(weather.getDescrib());
        day.setText(weather.getDay());
        temp1.setText(weather.getTemp1());
        temp2.setText(weather.getTemp2());
        return view;
    }
}
