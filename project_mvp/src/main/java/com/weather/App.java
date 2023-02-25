package com.weather;

import com.weather.presenter.Presenter;
import com.weather.ui.ConsoleUI;
import com.weather.ui.DesktopUI;
import com.weather.ui.View;
import com.weather.weatherApi.Service;
import com.weather.weatherApi.WeatherService;

public class App {
    public static void main(String[] args) {
        // View view = new ConsoleUI();
        View view = new DesktopUI();
        Service service = new WeatherService();
        new Presenter(view, service);
        view.start();
    }
}
