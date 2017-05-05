package ru.job4j.start;

import ru.job4j.items.Item;
import ru.job4j.items.Tracker;

/**
 * Created by pro on 03.05.2017.
 */
public class StartUI {
    public static final int ADD = 0;
    public static final int SHOW = 1;
    public static final int UPDATE = 2;
    public static final int DELETE = 3;
    public static final int FINDBYID = 4;
    public static final int FINDBYNAME = 5;
    public static final int EXIT = 6;

    Tracker tracker;
    ConsoleInput input;
    public static void main(String[] args) {
        new StartUI().init();
    }

    public StartUI() {
        this.tracker = new Tracker();
        this.input = new ConsoleInput();
    }

    /**
     * Methot to start app.
     */
    public void init() {

        showMenu();
        int result = Integer.valueOf(input.ask("Select: "));
        while (result != EXIT) {
            if (result == ADD) {
                        tracker.add(
                        new Item(input.ask("Enter id: "),
                        input.ask("Enter name: "),
                        input.ask("Enter description: "),
                        Long.parseLong(input.ask("Enter data of created: "))
                        ));
            }
            else if (result == SHOW) {
                Item[] allItems = tracker.findAll();
                for (Item item: allItems) {
                    System.out.println(item);
                }
            }
            else if (result == UPDATE) {
                Item item = tracker.findById(input.ask("Enter id: "));
                item.setName(input.ask("Enter name: "));
                item.setDesc(input.ask("Enter description: "));
                tracker.updateItem(item);
                System.out.println("Item updated");
            }
            else if (result == DELETE) {
                Item item = tracker.findById(input.ask("Enter id: "));
                tracker.deleteItem(item);
                System.out.println("Item deleted");
            }
            else if (result == FINDBYID) {
                Item item =tracker.findById(input.ask("Enter id: "));
                System.out.println(item.toString());
            }
            else if (result == FINDBYNAME) {
                Item[] items = tracker.findByName(input.ask("Enter name: "));
                for (Item item : items) {
                    System.out.println(item.toString());
                }
            }
            result = Integer.valueOf(input.ask("Select: "));
        }

    }

    /**
     * Method to show main menu.
     */
    public void showMenu(){
        System.out.println("0. Add new Item\n" +
                "1. Show all items\n" +
                "2. Edit item\n" +
                "3. Delete item\n" +
                "4. Find item by Id\n" +
                "5. Find items by name\n" +
                "6. Exit Program");
    }
}

