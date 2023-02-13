package com.patika.weatherapplication.utils;



import com.patika.weatherapplication.model.currentlyweather.Weather;

import com.patika.weatherapplication.model.currentlyweather.WeatherTempInformation;
import lombok.Data;

import java.util.List;
@Data
public class WeatherInformations {


    List<Weather> weather;
    WeatherTempInformation main;





}
