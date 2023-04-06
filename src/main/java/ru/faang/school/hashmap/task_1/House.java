package ru.faang.school.hashmap.task_1;

public class House {
    private String name;
    private String sigil;

    public House(String name, String sigil) {
        this.name = name;
        this.sigil = sigil;
    }

    @Override
    public String toString() {
        return String.format("%s: %s.", name, sigil);
    }
}
