package com.patika.weatherapplication.model.dailyweather;

import com.fasterxml.jackson.annotation.JsonView;
import com.patika.weatherapplication.shared.Views;
import lombok.Data;
import org.jetbrains.annotations.NotNull;


@Data
public class WeatherDailyTempInformation {


        @NotNull
        @JsonView(Views.Base.class)
        private Integer day;

        @NotNull
        @JsonView(Views.Base.class)
        private Integer min;

        @NotNull
        @JsonView(Views.Base.class)
        private Integer max;

        @NotNull
        @JsonView(Views.Base.class)
        private Integer night;

        @NotNull
        @JsonView(Views.Base.class)
        private Integer eve;

        @NotNull
        @JsonView(Views.Base.class)
        private Integer morn;


        public String getDay(){                                                                                         // Celcius cinsinde çıktıya eklenmesi
            Double celciusTemp = this.day - 272.15;
            return String.format("%4.2f", celciusTemp);
        }

}
