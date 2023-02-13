package com.patika.weatherapplication.model.currentlyweather;


import com.fasterxml.jackson.annotation.JsonView;
import com.patika.weatherapplication.shared.Views;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class WeatherCurrentlyTempInformation {

        @NotNull
        @JsonView(Views.Base.class)
        private Double temp;
        @NotNull
        @JsonView(Views.Base.class)
        private Integer feels_like;
        @NotNull
        @JsonView(Views.Base.class)
        private Integer temp_min;
        @NotNull
        @JsonView(Views.Base.class)
        private Integer temp_max;

        @NotNull
        @JsonView(Views.Base.class)
        private Integer pressure;

        @NotNull
        @JsonView(Views.Base.class)
        private Integer humidity;


        public String getTemp(){                                                                                         // Celcius cinsinde çıktıya eklenmesi(Kelvin to celcius)
                Double celciusTemp = this.temp - 272.15;
                return String.format("%4.2f", celciusTemp);
        }

        public String getFeels_like(){                                                                                         // Celcius cinsinde çıktıya eklenmesi(Kelvin to celcius)
                Double celciusTemp = this.feels_like - 272.15;
                return String.format("%4.2f", celciusTemp);
        }

        public String getTemp_min(){                                                                                         // Celcius cinsinde çıktıya eklenmesi(Kelvin to celcius)
                Double celciusTemp = this.temp_min - 272.15;
                return String.format("%4.2f", celciusTemp);
        }

        public String getTemp_max(){                                                                                         // Celcius cinsinde çıktıya eklenmesi(Kelvin to celcius)
                Double celciusTemp = this.temp_max - 272.15;
                return String.format("%4.2f", celciusTemp);
        }


}
