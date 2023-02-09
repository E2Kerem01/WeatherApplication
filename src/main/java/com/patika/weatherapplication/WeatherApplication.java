package com.patika.weatherapplication;

import com.patika.weatherapplication.utils.ApiKey;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

@EnableConfigurationProperties(ApiKey.class)
@SpringBootApplication
public class WeatherApplication {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public HttpHeaders httpHeaders(){
        return new HttpHeaders();
    }

    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }

}
