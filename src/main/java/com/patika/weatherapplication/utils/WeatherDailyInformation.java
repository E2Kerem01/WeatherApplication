package com.patika.weatherapplication.utils;


import com.fasterxml.jackson.annotation.JsonView;
import com.patika.weatherapplication.model.dailyweather.WeatherDaily;
import com.patika.weatherapplication.model.dailyweather.WeatherDailyTempInformation;
import com.patika.weatherapplication.shared.Views;
import lombok.Data;

@Data
public class WeatherDailyInformation {

    @JsonView(Views.Base.class)
    WeatherDaily city;
    @JsonView(Views.Base.class)
    WeatherDailyTempInformation temp;
}
