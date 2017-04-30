package ru.job4j.profession;

/**
 * Created by pro on 30.04.2017.
 */
public class Patient {
    /**
     * Name of patient.
     */
    private String name;
    /**
     * Constructor of patient.
     * @param name - name
     */
    public Patient(String name) {
        this.name = name;
    }
    /**
     * Method to get name of patient.
     * @return name of patient
     */
    public String getName() {
        return name;
    }
}
