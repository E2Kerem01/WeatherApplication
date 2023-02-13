package com.patika.weatherapplication.service;

import com.patika.weatherapplication.utils.WeatherInformations;

public interface ApiService {


    public WeatherInformations getWeatherCurrent(String city);
    public WeatherInformations getWeatherWeekly(String city, Integer day);

}
