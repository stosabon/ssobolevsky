package ru.job4j.collections;

/**
 * Created by pro on 26.05.2017.
 */
public class User {
    /**
     * id of user.
     */
    private int id;
    /**
     * name of user.
     */
    private String name;
    /**
     * city of user.
     */
    private String city;

    /**
     * Constructor of user.
     * @param id - id
     * @param name - name
     * @param city - city
     */
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    /**
     * Getter fo user id.
     * @return - id
     */
    public int getId() {
        return id;
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

        if (id != user.id) {
            return false;
        }
        if (name != null ? !name.equals(user.name) : user.name != null) {
            return false;
        }
        return city != null ? city.equals(user.city) : user.city == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
