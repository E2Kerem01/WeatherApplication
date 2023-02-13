package com.patika.weatherapplication.service;




import com.patika.weatherapplication.utils.WeatherCurrentlyInformation;
import com.patika.weatherapplication.utils.WeatherDailyInformation;


public interface ApiService {


    public WeatherCurrentlyInformation getWeatherCurrent(String city);                                                      // Anlık
    public WeatherDailyInformation getWeatherWeekly(String city, Integer day);                                              // Haftalık
    public WeatherDailyInformation getWeatherMonthly(String city, String countryCode);                                      // Aylık

}
