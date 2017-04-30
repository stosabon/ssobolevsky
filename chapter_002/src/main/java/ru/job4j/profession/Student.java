package ru.job4j.profession;

/**
 * Created by pro on 30.04.2017.
 */
public class Student {
    /**
     * Name of student.
     */
    private String name;
    /**
     * Constructor of student.
     * @param name - name
     */
    public Student(String name) {
        this.name = name;
    }
    /**
     * Method to get name of student.
     * @return name of student
     */
    public String getName() {
        return name;
    }
}
