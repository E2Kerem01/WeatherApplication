package com.patika.weatherapplication.utils;



import com.fasterxml.jackson.annotation.JsonView;
import com.patika.weatherapplication.model.currentlyweather.Weather;

import com.patika.weatherapplication.model.currentlyweather.WeatherCurrentlyTempInformation;
import com.patika.weatherapplication.shared.Views;
import lombok.Data;

import java.util.List;
@Data
public class WeatherCurrentlyInformation {

    @JsonView(Views.Base.class)
    List<Weather> weather;

    @JsonView(Views.Base.class)
    WeatherCurrentlyTempInformation main;




}
