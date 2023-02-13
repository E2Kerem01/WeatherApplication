package com.patika.weatherapplication.model.currentlyweather;


import lombok.Data;

@Data
public class WeatherTempInformation {


        private Integer temp;
        private Integer feels_like;
        private Integer temp_min;
        private Integer temp_max;
        private Integer pressure;
        private Integer humidity;
        private Integer visibility;

}
