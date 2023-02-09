package com.patika.weatherapplication.service;

import com.patika.weatherapplication.model.WeatherInformations;

public interface ApiService {


    public WeatherInformations getWeatherCurrent(String city);

}
