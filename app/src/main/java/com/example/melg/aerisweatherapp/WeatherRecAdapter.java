package com.example.melg.aerisweatherapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.melg.aerisweatherapp.model.Periods;
import com.example.melg.aerisweatherapp.model.Response;

import java.util.List;


public class WeatherRecAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Periods> weekDaysWeatherList;
    private Context context;

   public  WeatherRecAdapter(Context context, List<Periods> weekdayWeather) {
       this.context = context;
       weekDaysWeatherList = weekdayWeather;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Periods response = weekDaysWeatherList.get(position);
        holder.onBind(response);
    }

    @Override
    public int getItemCount() {
        return weekDaysWeatherList.size();
    }

    void populatingResponses(List<Periods> weatherResponses){
       weekDaysWeatherList.clear();
       weekDaysWeatherList.add((Periods)weatherResponses);
       notifyDataSetChanged();

    }

}
