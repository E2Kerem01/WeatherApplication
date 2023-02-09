package com.patika.weatherapplication.controller;




import com.patika.weatherapplication.model.WeatherInformations;
import com.patika.weatherapplication.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {


    private final WeatherService weatherService;

    public WeatherController(RestTemplate restTemplate, WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("now/{city}")
    public ResponseEntity<WeatherInformations> getWeatherCurrent(@PathVariable String city) {
        WeatherInformations informations = weatherService.getWeatherCurrent(city);
        return new ResponseEntity<>(informations, HttpStatus.OK);
    }

}
