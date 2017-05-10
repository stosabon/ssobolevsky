package ru.job4j.interfaces;

import ru.job4j.items.Tracker;

/**
 * Created by pro on 10.05.2017.
 */
public interface UserAction {
    /**
     * Method to return key of menu.
     * @return menu key
     */
    int key();

    /**
     * Method to do operations with items.
     * @param input - way of input
     * @param tracker - tracker
     */
    void execute(Input input, Tracker tracker);

    /**
     * Method to show menu.
     * @return line of menu
     */
    String info();
}
