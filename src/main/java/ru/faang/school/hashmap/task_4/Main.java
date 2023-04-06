package ru.faang.school.hashmap.task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<String, WeatherData> weatherDataMap = new HashMap<>();
    public static void main(String[] args) {
        List<WeatherData> weatherDataList = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++){
            getWeatherData("City " + i);
            weatherDataList.add(weatherDataMap.get("City " + i));
        }
        long list = System.currentTimeMillis();
        for (WeatherData weatherData : weatherDataList){
            System.out.println(weatherData);
        }
        long resultList = System.currentTimeMillis() - list;

        long map = System.currentTimeMillis();
        showAllCities();
        long resultMap = System.currentTimeMillis() - map;

        System.out.println("List: " + resultList + " Map: " + resultMap);
    }

    public static WeatherData getWeatherData(String cityName){
        if (!weatherDataMap.containsKey(cityName)) {
            JDBC.getData();
            updateWeatherData(cityName, new WeatherData(cityName, Math.random() * 50, Math.random() * 85));
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
