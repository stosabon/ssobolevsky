package ru.job4j.profession;

/**
 * Created by pro on 30.04.2017.
 */
public class Doctor extends  Profession {
    /**
     * Specialization of doctor.
     */
        private String specialization;
    /**
     * Constructor of doctor.
     * @param age - age
     * @param education - education
     * @param name - name
     * @param salary - salary
     * @param specialization - specialization
     */
    public Doctor(int age, String education, int salary, String name, String specialization) {
        super(age, education, salary, name);
        this.specialization = specialization;
    }
    /**
     * Method to cure patient.
     * @param patient - patient
     * @return healthy patient
     */
    public String curePatient(Patient patient) {
        return patient.getName() + "is healthy now";
    }
    /**
     * Method to look at patient.
     * @param patient - patient
     * @return founded disease
     */
    public String lookAtPatient(Patient patient) {
            Doctor doctor = new Doctor(32, "high", 23000, "Ivan", "Surgeon");
            return doctor.getName() + "found disease";
        }
}
