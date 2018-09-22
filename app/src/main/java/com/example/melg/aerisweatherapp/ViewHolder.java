package com.example.melg.aerisweatherapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.melg.aerisweatherapp.model.Periods;
import com.example.melg.aerisweatherapp.model.Response;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView date,humidity,temp;
    private ImageView temp_image;

    public ViewHolder(View itemView) {
        super(itemView);


        date = itemView.findViewById(R.id.date);
        humidity = itemView.findViewById(R.id.humidity);
        temp = itemView.findViewById(R.id.temp);
        temp_image = itemView.findViewById(R.id.temp_img);





    }

    public void onBind(Periods response) {
        date.setText(setCorrectDate(response.getDateTimeISO()));
        temp.setText(response.getMinTempF());

    }

    public String setCorrectDate(String response_date){
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try {
            date = dt.parse(response_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        SimpleDateFormat targetFormat = new SimpleDateFormat("MM-dd");
        return targetFormat.format(date);

    }
}
