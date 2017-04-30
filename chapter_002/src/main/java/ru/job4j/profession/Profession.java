package ru.job4j.profession;

/**
 * Created by pro on 30.04.2017.
 */
public class Profession {
    /**
     * Age of worker.
     */
    private int age;
    /**
     * Education of worker.
     */
    private String education;
    /**
     * Salary of worker.
     */
    private int salary;
    /**
     * Name of worker.
     */
    private String name;

    /**
     * Constructor of profession.
     * @param age - age
     * @param education - education
     * @param name - name
     * @param salary - salary
     */
    public Profession(int age, String education, int salary, String name) {
        this.age = age;
        this.education = education;

        this.salary = salary;
        this.name = name;
    }
    /**
     * Method to get name of worker.
     * @return name of worker
     */
    public String getName() {
        return name;
    }
}
