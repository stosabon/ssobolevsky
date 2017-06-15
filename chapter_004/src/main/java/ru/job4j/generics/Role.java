package ru.job4j.generics;

/**
 * Created by pro on 15.06.2017.
 */
public class Role extends Base {
    /**
     * Role id.
     */
    private String id;

    /**
     * Getter for role id.
     * @return id
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * Setter for role id.
     * @param id - id
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }
}
