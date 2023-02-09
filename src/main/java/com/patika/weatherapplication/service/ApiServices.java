package com.patika.weatherapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class ApiServices {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;

    private static final String BaseUrl = "http://api.weatherapi.com";
}
