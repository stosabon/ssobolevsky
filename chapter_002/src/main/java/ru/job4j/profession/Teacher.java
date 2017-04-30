package ru.job4j.profession;

/**
 * Created by pro on 30.04.2017.
 */
public class Teacher extends Profession {
    /**
     * Subject of teacher.
     */
    private String lesson;
    /**
     * Constructor of teacher.
     * @param age - age
     * @param education - education
     * @param name - name
     * @param salary - salary
     * @param lesson - lesson
     */
    public Teacher(int age, String education, int salary, String name, String lesson) {
        super(age, education, salary, name);
        this.lesson = lesson;
    }
    /**
     * Method to mark student.
     * @param student - student receiving assesement
     * @return marked student
     */
    public String assessStudent(Student student) {
        Teacher teacher = new Teacher(34, "High", 20000, "Paul", "History");
        return teacher.getName() + "gave" + student.getName() + "5 mark";
    }
    /**
     * Method to test students.
     * @param students - students writing test
     */
    public void testStudents(Student[] students) {

    }
}
