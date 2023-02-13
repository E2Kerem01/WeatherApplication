package com.patika.weatherapplication.model.currentlyweather;


import lombok.Data;

@Data
public class WeatherCurrentlyTempInformation {


        private Double temp;
        private Integer feels_like;
        private Integer temp_min;
        private Integer temp_max;
        private Integer pressure;
        private Integer humidity;
        private Integer visibility;

        public String getCelciusTemperature(){                                                                                         // Celcius cinsinde çıktıya eklenmesi
                Double celciusTemp = this.temp - 272.15;
                return String.format("%4.2f", celciusTemp);
        }


}
