package ru.job4j.profession;

/**
 * Created by pro on 30.04.2017.
 */
public class Engineer extends Profession {
    /**
     * Constructor of engineer.
     * @param age - age
     * @param education - education
     * @param name - name
     * @param salary - salary
     */
    public Engineer(int age, String education, int salary, String name) {
        super(age, education, salary, name);
    }
    /**
     * Method to write report.
     * @param engineer - engineer
     * @return passed report
     */
    public String writeReport(Engineer engineer) {
        return engineer.getName() + "passed the report on time";
    }
    /**
     * Method to paint scheme.
     */
    public void paintScheme() {

    }
}