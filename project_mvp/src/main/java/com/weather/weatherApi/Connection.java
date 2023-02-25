package com.weather.weatherApi;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {
    // Зарегистрировалась на сайте weatherstack.com
    private static final String apikey = "13623ebb3d7c35783f3fb33fddf3e8bc";

    public String getInfo(String city) throws Exception {
        URL url = new URL("http://api.weatherstack.com/current?access_key=" + apikey + "&query=" + city);
        URLConnection connection = url.openConnection();
        StringBuilder stringBuilder = new StringBuilder();

        // http://api.weatherstack.com/current?access_key=13623ebb3d7c35783f3fb33fddf3e8bc&query=moscow
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

}
