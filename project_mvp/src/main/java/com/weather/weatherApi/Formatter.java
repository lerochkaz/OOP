package com.weather.weatherApi;

import com.google.gson.Gson;
import com.weather.weatherApi.weather.Weather;

public class Formatter {
    public Weather parse(String json) {
        Gson gson = new Gson();
        Weather weather = gson.fromJson(json, Weather.class);
        return weather;
    }

}
