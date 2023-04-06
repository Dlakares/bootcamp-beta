package ru.faang.school.hashmap.task_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(
                "Михаил Михайлович",
                "Разработчик мультимедийных и -веб приложений",
                1));
        studentList.add(new Student(
                "Кирилл Сайленсов",
                "Электромонтажник",
                2));
        studentList.add(new Student(
                "Басимов Рустам",
                "FAANG",
                1));
        studentList.add(new Student(
                "Влад Мишустин",
                "FAANG",
                5));
        studentList.add(new Student(
                "Олег",
                "Разработчик мультимедийных и -веб приложений",
                1));
        studentList.add(new Student(
                "Даниил Лазарев",
                "Электромонтажник",
                2));
        studentList.add(new Student(
                "Даниил Мирошмиченко",
                "Разработчик мультимедийных и -веб приложений",
                4));
        studentList.add(new Student(
                "Челл Олрайт",
                "Разработчик мультимедийных и -веб приложений",
                4));
        studentList.add(new Student(
                "Моргенштерн",
                "FAANG",
                5));
        studentList.add(new Student(
                "Гриша Грогорович",
                "Разработчик мультимедийных и -веб приложений",
                1));
        studentList.add(new Student(
                "Руби Вернер",
                "FAANG",
                1));
    }
    private static Map<Student, List<Student>> map = new HashMap<>();

    public static void main(String[] args) {
        initMap(studentList);
        showAllStudentsGroup();
    }

    public static void initMap(List<Student> allStudent) {
        for (Student student : allStudent) {
            addStudent(student);
        }
    }

    public static void addStudent(Student student){
        if (!map.containsKey(student)){
            map.put(student, new ArrayList<>());
        }
        map.get(student).add(student);
    }

    public static void showAllStudentsGroup(){
        for (Map.Entry<Student, List<Student>> entry : map.entrySet()){
            System.out.println("Курс: " + entry.getKey().getYear());
            findStudents(entry.getKey());
        }
    }

    public static void findStudents(Student student){
        for (Student curStudent : map.get(student)){
            System.out.println(curStudent);
        }
    }
}
