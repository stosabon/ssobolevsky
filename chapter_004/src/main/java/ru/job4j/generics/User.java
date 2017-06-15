package ru.job4j.generics;

/**
 * Created by pro on 15.06.2017.
 */
public class User extends Base {
    /**
     * User id.
     */
    private String id;

    /**
     * Getter for user id.
     * @return id
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * Setter for user id.
     * @param id - id
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }
}
