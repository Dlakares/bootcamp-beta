package ru.faang.school.hashmap.task_4;

import java.util.HashMap;
import java.util.Map;

public class JDBC {
    public static WeatherData getData(String cityName){
        System.out.println("Данные обновлены");
        return new WeatherData(cityName, Math.random() * 50, Math.random() * 85);
    }
}
