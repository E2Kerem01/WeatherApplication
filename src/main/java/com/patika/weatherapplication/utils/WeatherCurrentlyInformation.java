package com.patika.weatherapplication.utils;



import com.patika.weatherapplication.model.currentlyweather.Weather;

import com.patika.weatherapplication.model.currentlyweather.WeatherCurrentlyTempInformation;
import lombok.Data;

import java.util.List;
@Data
public class WeatherCurrentlyInformation {


    List<Weather> weather;
    WeatherCurrentlyTempInformation main;




}
