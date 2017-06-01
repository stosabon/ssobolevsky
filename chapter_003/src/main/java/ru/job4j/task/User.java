package ru.job4j.task;

/**
 * Created by pro on 01.06.2017.
 */
public class User {
    /**
     * Name of user.
     */
    private String name;
    /**
     * Passport of user.
     */
    private int passport;

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for passport.
     * @return passport
     */
    public int getPassport() {
        return passport;
    }

    /**
     * Constructor of user.
     * @param name - name
     * @param passport - passport
     */
    public User(String name, int passport) {
        this.name = name;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (passport != user.passport) {
            return false;
        }
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + passport;
        return result;
    }
}
