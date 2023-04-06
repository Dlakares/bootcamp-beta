package ru.faang.school.hashmap.task_3;

import java.util.Objects;

public class Student {
    private String name;
    private String faculty;
    private int year;

    public Student(String name, String faculty, int year) {
        this.name = name;
        this.faculty = faculty;
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (year != student.year) return false;
        return Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        int result = faculty != null ? faculty.hashCode() : 0;
        result = 31 * result + year;
        return result;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("Студент %s факультета \"%s\" находится на %d курсе.", name, faculty, year);
    }
}
