package com.patika.weatherapplication.service;




import com.patika.weatherapplication.utils.WeatherCurrentlyInformation;
import com.patika.weatherapplication.utils.WeatherWeeklyInformation;

public interface ApiService {


    public WeatherCurrentlyInformation getWeatherCurrent(String city);
    public WeatherWeeklyInformation getWeatherWeekly(String city, Integer day);

}
