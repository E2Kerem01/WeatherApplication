package com.patika.weatherapplication.service;




import com.patika.weatherapplication.utils.WeatherCurrentlyInformation;
import com.patika.weatherapplication.utils.WeatherDailyInformation;


public interface ApiService {


    public WeatherCurrentlyInformation getWeatherCurrent(String city);
    public WeatherDailyInformation getWeatherWeekly(String city, Integer day);
    public WeatherDailyInformation getWeatherMonthly(String city, String countryCode);

}
