package com.patika.weatherapplication.model.dailyweather;


import com.fasterxml.jackson.annotation.JsonView;
import com.patika.weatherapplication.shared.Views;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

@Data
public class WeatherDaily implements Serializable {                                                                                                 // Haflalık ve aylık değerlerin json parametresi

    @NotNull
    @JsonView(Views.Base.class)
    private Integer id;

    @NotNull
    @JsonView(Views.Base.class)
    private String  name;

    @NotNull
    @JsonView(Views.Base.class)
    private String coord;

}
