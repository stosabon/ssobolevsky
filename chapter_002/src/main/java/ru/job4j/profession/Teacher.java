package ru.job4j.profession;

/**
 * Created by pro on 30.04.2017.
 */
public class Teacher extends Profession {
    private String lesson;

    public Teacher(int age, String education, int salary, String name, String lesson) {
        super(age, education, salary, name);
        this.lesson = lesson;
    }

    public String assessStudent(Student student) {
        Teacher teacher = new Teacher(34, "High", 20000, "Paul", "History");
        return teacher.getName() + "gave" + student.getName() + "5 mark";
    }
    public void testStudents(Student[] student) {

    }
}
