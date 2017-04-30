package ru.job4j.profession;

/**
 * Created by pro on 30.04.2017.
 */
public class Engineer extends Profession {
    public Engineer(int age, String education, int salary, String name) {
        super(age, education, salary, name);
    }

    public String writeDocumentation(Engineer engineer) {
        return engineer.getName() + "passed the report on time";
    }

    public void paintScheme() {

    }
}