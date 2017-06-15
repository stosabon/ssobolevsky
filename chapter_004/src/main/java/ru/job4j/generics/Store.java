package ru.job4j.generics;

/**
 * Created by pro on 15.06.2017.
 */
public interface Store<T extends Base> {
    /**
     * Method to add.
     */
    void add(T value);

    /**
     * Method to update.
     */
    void update(int index, T value);

    /**
     * Method to remove.
     */
    void remove(int index);
}
