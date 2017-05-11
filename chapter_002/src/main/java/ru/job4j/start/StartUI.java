package ru.job4j.start;

import ru.job4j.interfaces.Input;
import ru.job4j.items.Tracker;

/**
 * Created by pro on 03.05.2017.
 */
public class StartUI {
    private static final int[] RANGE = new int[] {0, 1, 2, 3, 4, 5, 6};
    /**
     * Answer to exit program.
     */
    public static final int EXIT = 6;
    /**
     * Tracker object.
     */
    private Tracker tracker;
    /**
     * Console input object.
     */
    private Input input;
    /**
     * Main method to run program.
     * @param args - args
     */
    public static void main(String[] args) {
       new StartUI(new ValidateInput(), new Tracker()).init();
    }

    /**
     * Constructor to run program.
     * @param input - input initialize
     * @param tracker - tracker initialize
     */
    public StartUI(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    /**
     * Method to start app.
     */
    public void init() {
        MenuTracker menuTracker = new MenuTracker(input, tracker);
        menuTracker.fillActions();
        menuTracker.showMenu();
        int result = Integer.valueOf(input.ask("Select: ", RANGE));
        while (result != EXIT) {
            menuTracker.select(result);
            result = Integer.valueOf(input.ask("Select: ", RANGE));
        }

    }

    /**
     * Method to show main menu.
     */
    public void showMenu() {
        System.out.println("0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program");
    }
}

