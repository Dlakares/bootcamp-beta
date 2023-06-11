package ru.faang.school;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String s = "Строка для разделения по словами";
        System.out.println(Arrays
                .toString(s.split(" "))
                .replaceAll(" ", ""));
    }
}
