package com.patika.weatherapplication.service;



import com.patika.weatherapplication.utils.WeatherCurrentlyInformation;
import com.patika.weatherapplication.utils.ApiKey;
import com.patika.weatherapplication.utils.WeatherDailyInformation;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.util.UriTemplate;

import java.net.URI;
import java.util.List;

@Service
public class WeatherService implements ApiService {

    private static final String WeatherUrl =
            "https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}";

    private static final String WeeklyForecastUrl =
            "https://api.openweathermap.org/data/2.5/forecast/daily?q={city name}&cnt={cnt}&appid={API key}";

    private static final String MonthlyForecastUrl =
            "https://pro.openweathermap.org/data/2.5/forecast/climate?q={city name},{country code}&appid={API key}";

    private final String apiKey;
    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);
    private final RestTemplate restTemplate;
    private final HttpHeaders httpHeaders;




    public WeatherService(RestTemplateBuilder restTemplateBuilder, HttpHeaders httpHeaders, ApiKey apiKey) {
        this.restTemplate = restTemplateBuilder.build();
        this.httpHeaders = httpHeaders;
        this.apiKey = apiKey.getApi().getKey();

    }



    public WeatherCurrentlyInformation getWeatherCurrent(String city)  {                                                        // Anlık Hava Durumu
        URI url = new UriTemplate(WeatherUrl).expand(city,this.apiKey);
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        ResponseEntity<WeatherCurrentlyInformation> response = restTemplate.exchange(url, HttpMethod.GET, entity,WeatherCurrentlyInformation.class);
        logger.info("Current weather for {} ", city);
        return response.getBody();
    }


    public WeatherDailyInformation getWeatherWeekly(String city, Integer day) {                                                // Haftalık Hava Durumu

        URI url = new UriTemplate(WeeklyForecastUrl).expand(city,day,this.apiKey);
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        ResponseEntity<WeatherDailyInformation> response = restTemplate.exchange(url,HttpMethod.GET,entity,WeatherDailyInformation.class);
        logger.info("Weekly weather for {} ", city);
        return response.getBody();
    }


    public WeatherDailyInformation getWeatherMonthly(String city, String countryCode){                                        // Aylık Hava Durumu
        URI url = new UriTemplate(MonthlyForecastUrl).expand(city,countryCode,this.apiKey);
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<String > entity = new HttpEntity<>(httpHeaders);
        ResponseEntity<WeatherDailyInformation> response = restTemplate.exchange(url,HttpMethod.GET,entity,WeatherDailyInformation.class);
        logger.info("Weekly weather for {} ", city);
        return response.getBody();
    }


}
