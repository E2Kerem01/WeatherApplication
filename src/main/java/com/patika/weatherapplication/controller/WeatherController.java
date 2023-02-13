package com.patika.weatherapplication.controller;




import com.patika.weatherapplication.utils.WeatherCurrentlyInformation;
import com.patika.weatherapplication.service.WeatherService;
import com.patika.weatherapplication.utils.WeatherMonthlyInformation;
import com.patika.weatherapplication.utils.WeatherWeeklyInformation;
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
    public ResponseEntity<WeatherCurrentlyInformation> getWeatherCurrent(@Validated @PathVariable String city) {                        // Anlık Hava Durumu

            WeatherCurrentlyInformation informations = weatherService.getWeatherCurrent(city);
            return new ResponseEntity<>(informations, HttpStatus.OK);

    }

    @GetMapping("weekly/{city}/{day}")
    public ResponseEntity<WeatherWeeklyInformation> getWeatherWeekly(@PathVariable String city,
                                                                     @PathVariable Integer day){                                 // Haftalık Hava Durumu
        logger.info(city);
        logger.info(String.valueOf(day));
        WeatherWeeklyInformation information = weatherService.getWeatherWeekly(city,day);
        return new ResponseEntity<>(information, HttpStatus.OK);
    }

    @GetMapping("monthly/{city}/{countryCode}")
    public ResponseEntity<WeatherMonthlyInformation> getWeatherMonthly(@PathVariable String city,
                                                                       @PathVariable String countryCode){                       // Haftalık Hava Durumu

        WeatherMonthlyInformation information = weatherService.getWeatherMonthly(city,countryCode);
        return new ResponseEntity<>(information, HttpStatus.OK);
    }



}
