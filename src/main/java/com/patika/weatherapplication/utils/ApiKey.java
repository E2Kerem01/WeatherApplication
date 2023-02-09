package com.patika.weatherapplication.utils;



import org.jetbrains.annotations.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;



@ConfigurationProperties("app.weather")
public class ApiKey {


    private final Api api = new Api();

    public Api getApi() {
        return this.api;
    }
    public static class Api {

        /**
         * API key of the OpenWeatherMap service.
         */
        @NotNull
        private String key;

        public String getKey() {
            return this.key;
        }
    }
}
