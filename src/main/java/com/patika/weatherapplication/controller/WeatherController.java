package com.patika.weatherapplication.controller;




import com.patika.weatherapplication.utils.WeatherInformations;
import com.patika.weatherapplication.service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private static final Logger logger = LoggerFactory.getLogger(WeatherController.class);
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("current/{city}")
    public ResponseEntity<WeatherInformations> getWeatherCurrent(@Validated @PathVariable String city) {                        // Şehir bilgisi alınıp istek yapılan yer

            WeatherInformations informations = weatherService.getWeatherCurrent(city);
            return new ResponseEntity<>(informations, HttpStatus.OK);

    }

    @GetMapping("weekly/{city}/{day}")
    public ResponseEntity<WeatherInformations> getWeatherWeekly(@PathVariable String city, @PathVariable Integer day){
        logger.info(city);
        logger.info(String.valueOf(day));
        WeatherInformations informations = weatherService.getWeatherWeekly(city,day);
        return new ResponseEntity<>(informations, HttpStatus.OK);
    }



}
