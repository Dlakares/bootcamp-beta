package ru.faang.school.hashmap.task_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, House> houses = new HashMap<>();

    public static void main(String[] args) {
        addHouse("Ланнистеры", new House("Ланнистеры",
                "Золотой лев, стоящий на задних лапах, на малиновом поле"));
        addHouse("Баратеоны", new House("Баратеоны",
                "Черный коронованный олень, стоящий на задних ногах, на золотом поле"));
        addHouse("Старки", new House("Старки",
                "Голова серого лютоволка на бело-зелёном фоне"));
        addHouse("Мартеллы", new House("Мартеллы",
                "Красное солнце, пронзённое золотым копьём, на оранжевом фоне"));
        addHouse("Дом Бронна", new House("Дом Бронна",
                "Пылающая стрела на сером фоне"));
        showAllHouses();
        showHouse("Старки");
        deleteHouse("Баратеоны");
        showAllHouses();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void addHouse(String name, House house){
        houses.put(name, house);
    }

    public static void deleteHouse(String name){
        houses.remove(name);
    }

    public static void showHouse(String name){
        System.out.println(houses.get(name) + "\n ------------------------");
    }

    public static void showAllHouses(){
        for (Map.Entry<String, House> entry : houses.entrySet()){
            System.out.println(entry.getValue());
        }
        System.out.println("\n ------------------------");
    }

}
