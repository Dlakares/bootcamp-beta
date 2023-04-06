package ru.faang.school.hashmap.task_4;

public class WeatherData {
    private String city;
    private double temperature;
    private double humidity;

    public WeatherData(String city, double temperature, double humidity) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherData that = (WeatherData) o;

        return city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Погода в %s: %fC, влажность %f%%", city, temperature, humidity);
    }
}
