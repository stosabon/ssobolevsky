package ru.job4j.profession;

/**
 * Created by pro on 30.04.2017.
 */
public class Profession {
    private int age;
    private String education;
    private int salary;
    private String name;


    public Profession(int age, String education, int salary, String name) {
        this.age = age;
        this.education = education;

        this.salary = salary;
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
