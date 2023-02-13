package com.patika.weatherapplication.model.currentlyweather;



import com.fasterxml.jackson.annotation.JsonView;
import com.patika.weatherapplication.shared.Views;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;


@Data
public class Weather implements Serializable {

   @NotNull
   @JsonView(Views.Base.class)
   private Integer id;

   @NotNull
   @JsonView(Views.Base.class)
   private String main;

   @NotNull
   @JsonView(Views.Base.class)
   private String description;





}
