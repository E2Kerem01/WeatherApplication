package com.patika.weatherapplication.model.currentlyweather;



import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;



@Data
public class Weather {


   private Integer id;
   private String main;
   private String description;





}
