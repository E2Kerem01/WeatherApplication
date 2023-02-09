package com.patika.weatherapplication.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class WeatherInformations {


    List<Weather> weather;

}
