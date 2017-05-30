package ru.job4j.collections;

/**
 * Created by pro on 30.05.2017.
 */
public class Users implements Comparable<Users> {
    /**
     * Age of user.
     */
    private int age;
    /**
     * Name of user.
     */
    private String name;

    @Override
    public int compareTo(Users o) {
        String thisString = String.valueOf(this.age);
        String anotherString = String.valueOf(o.age);
        return thisString.compareTo(anotherString);
    }

    /**
     * Constructor of users.
     * @param age - age
     * @param name - name
     */
    public Users(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Users users = (Users) o;

        if (age != users.age) {
            return false;
        }
        return name != null ? name.equals(users.name) : users.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Users{"
                + "age=" + age
                + ", name='" + name + '\''
                + '}';
    }
}
