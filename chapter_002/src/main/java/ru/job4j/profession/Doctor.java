package ru.job4j.profession;

/**
 * Created by pro on 30.04.2017.
 */
    public class Doctor extends  Profession {
        private String specialization;

    public Doctor(int age, String education, int salary, String name, String specialization) {
        super(age, education, salary, name);
        this.specialization = specialization;
    }

    public String curePatient(Patient patient) {
            return patient.getName() + "is healthy now";
        }
        public String lookAtPatient(Patient patient) {
            Doctor doctor = new Doctor(32, "high", 23000, "Ivan", "Surgeon");
            return doctor.getName() + "found disease";
        }
    }
