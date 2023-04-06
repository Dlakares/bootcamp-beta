package ru.faang.school.hashmap.task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<String, WeatherData> weatherDataMap = new HashMap<>();
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.println(getWeatherData("City " + i));
        }

        deleteWeatherCash("City 5");
        deleteWeatherCash("City 1");
        deleteWeatherCash("City 2");
        deleteWeatherCash("City 3");
        showAllCities();
        for (int i = 0; i <= 10; i++){
            System.out.println(getWeatherData("City " + i));
        }
    }

    public static WeatherData getWeatherData(String cityName){
        if (!weatherDataMap.containsKey(cityName)) {
            updateWeatherData(cityName, JDBC.getData(cityName));
        }
        return weatherDataMap.get(cityName);
    }

    public static void updateWeatherData(String cityName, WeatherData weatherData){
        weatherDataMap.put(cityName, weatherData);
    }

    public static void deleteWeatherCash(String cityName){
        weatherDataMap.remove(cityName);
    }

    public static void showAllCities(){
        for (Map.Entry<String, WeatherData> entry : weatherDataMap.entrySet()){
            System.out.println(entry.getKey());
        }
        System.out.println("---------------------------");
    }
}
