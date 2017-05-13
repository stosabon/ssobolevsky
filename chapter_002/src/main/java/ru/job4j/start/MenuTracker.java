package ru.job4j.start;

import ru.job4j.interfaces.Input;
import ru.job4j.interfaces.UserAction;
import ru.job4j.items.Item;
import ru.job4j.items.Tracker;

/**
 * Outer class to edit item.
 * Created by pro on 10.05.2017.
 */
class EditItem extends BaseAction {
    /**
     * Contructor to initialize action.
     * @param key - key
     * @param name - name
     */
    EditItem(int key, String name) {
        super(key, name);
    }
    /**
     * Method to edit item.
     * @param input - way of input
     * @param tracker - tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        Item item = tracker.findById(input.ask("Enter id: "));
        item.setName(input.ask("Enter name: "));
        item.setDesc(input.ask("Enter description: "));
        tracker.updateItem(item);
        System.out.println("Item has been updated");
    }
}

/**
 * Outer class to find items by name.
 */
class FindItemsByName extends BaseAction {
    /**
     * Contructor to initialize action.
     * @param key - key
     * @param name - name
     */
    FindItemsByName(int key, String name) {
        super(key, name);
    }
    /**
     * Method to find items by name.
     * @param input - way of input
     * @param tracker - tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        for (Item item : tracker.findByName(input.ask("Enter name: "))) {
            if (item != null) {
                System.out.println(item.toString());
            }
        }
    }
}

/**
 * Main class.
 */
public class MenuTracker {
    /**
     * Console input object.
     */
    private Input input;
    /**
     * Tracker object.
     */
    private Tracker tracker;
    /**
     * Array of actions.
     */
    private UserAction[] actions = new UserAction[7];
    /**
     * Constructor of menu.
     * @param input - input
     * @param tracker - tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Method to fill actions.
     */
    public void fillActions() {
        this.actions[0] = this.new AddItem(0, "Add the new item.");
        this.actions[1] = new MenuTracker.ShowItems(1, "Show all items.");
        this.actions[2] = new EditItem(2, "Update item.");
        this.actions[3] = this.new DeleteItem(3, "Delete item.");
        this.actions[4] = new MenuTracker.FindItemById(4, "Find item by id.");
        this.actions[5] = new FindItemsByName(5, "Find item by name.");
        this.actions[6] = this.new ExitProgram(6, "Exit.");
    }
    /**
     * Method to show menu.
     */
    public void showMenu() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Method to select action.
     * @param key - key of action
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Class to add item.
     */
    private class AddItem extends BaseAction {
        /**
         * Contructor to initialize action.
         * @param key - key
         * @param name - name
         */
        AddItem(int key, String name) {
            super(key, name);
        }

        /**
         * Method to add item.
         * @param input - way of input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.add(
                    new Item(input.ask("Enter id: "),
                            input.ask("Enter name: "),
                            input.ask("Enter description: ")
                    ));
        }
    }
    /**
     * Class to delete item.
     */
    private class DeleteItem extends BaseAction {
        /**
         * Contructor to initialize action.
         * @param key - key
         * @param name - name
         */
        DeleteItem(int key, String name) {
            super(key, name);
        }
        /**
         * Method to delete item.
         * @param input - way of input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            Item item = tracker.findById(input.ask("Enter id: "));
            tracker.deleteItem(item);
            System.out.println("Item has been deleted");
        }
    }

    /**
     * Class to exit program.
     */
    private class ExitProgram extends BaseAction {
        /**
         * Contructor to initialize action.
         * @param key - key
         * @param name - name
         */
        ExitProgram(int key, String name) {
            super(key, name);
        }
        /**
         * Method to exit program.
         * @param input - way of input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {

        }
    }
    /**
     * Static class to dhow items.
     */
    private static class ShowItems extends BaseAction {
        /**
         * Contructor to initialize action.
         * @param key - key
         * @param name - name
         */
        ShowItems(int key, String name) {
            super(key, name);
        }
        /**
         * Method to show items.
         * @param input - way of input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item item: tracker.findAll()) {
                System.out.println(item);
            }
        }
    }
    /**
     * Static class to find item by id.
     */
    private static class FindItemById extends BaseAction {
        /**
         * Contructor to initialize action.
         *
         * @param key  - key
         * @param name - name
         */
        FindItemById(int key, String name) {
            super(key, name);
        }

        /**
         * Method to find item by id.
         *
         * @param input   - way of input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            Item item = tracker.findById(input.ask("Enter id: "));
            System.out.println(item.toString());
        }
    }
}
