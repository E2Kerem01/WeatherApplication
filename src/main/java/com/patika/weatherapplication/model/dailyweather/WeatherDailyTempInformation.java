package com.patika.weatherapplication.model.dailyweather;

import lombok.Data;

@Data
public class WeatherDailyTempInformation {


        private Integer day;
        private Integer min;
        private Integer max;
        private Integer night;
        private Integer eve;
        private Integer morn;

        public String getCelciusTemperature(){                                                                                         // Celcius cinsinde çıktıya eklenmesi
            Double celciusTemp = this.day - 272.15;
            return String.format("%4.2f", celciusTemp);
        }

}
