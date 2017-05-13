package ru.job4j.start;

import ru.job4j.interfaces.Input;
import ru.job4j.interfaces.UserAction;
import ru.job4j.items.Tracker;

/**
 * Created by pro on 13.05.2017.
 */
public abstract class BaseAction implements UserAction {
    /**
     * Key of menu.
     */
    private int key;
    /**
     * Line of menu.
     */
    private String name;

    /**
     * Constructor to initialize user actions.
     * @param key - key
     * @param name - name
     */
    public BaseAction(int key, String name) {
        this.key = key;
        this.name = name;
    }

    /**
     * Method to return key.
     * @return key
     */
    @Override
    public int key() {
        return this.key;
    }

    /**
     * Method to execute action.
     * @param input - way of input
     * @param tracker - tracker
     */
    @Override
    public abstract void execute(Input input, Tracker tracker);

    /**
     * Method to print info of action.
     * @return info
     */
    @Override
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }
}
