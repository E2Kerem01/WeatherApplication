package com.patika.weatherapplication.utils;


import com.patika.weatherapplication.model.dailyweather.WeatherDaily;
import com.patika.weatherapplication.model.dailyweather.WeatherDailyTempInformation;
import lombok.Data;

@Data
public class WeatherDailyInformation {

    WeatherDaily city;
    WeatherDailyTempInformation temp;
}
