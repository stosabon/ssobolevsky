package ru.job4j.start;

import ru.job4j.items.Item;
import ru.job4j.items.Tracker;

import java.util.Arrays;

/**
 * Created by pro on 03.05.2017.
 */
public class StartUI {

    public static void main(String[] args) {
        new StartUI().init();
    }

    /**
     * Methot to start app.
     */
    public void init() {
        Tracker tracker = new Tracker();
        ConsoleInput input = new ConsoleInput();
        showMenu();
        String result = input.ask("Select: ");
        while (!result.equals("6")) {
            if (result.equals("0")) {
                        tracker.add(
                        new Item(input.ask("Enter id: "),
                        input.ask("Enter name: "),
                        input.ask("Enter description: "),
                        Long.parseLong(input.ask("Enter data of created: ")),
                        input.ask("Enter comments: ")));
            }
            else if (result.equals("1")){
                Item[] allItems = tracker.findAll();
                for (Item item: allItems) {
                    System.out.println(item);
                }
            }
            else if (result.equals("2")){
                Item item = tracker.findById(input.ask("Enter id: "));
                tracker.updateItem(item);
                System.out.println("Item updated");
            }
            else if (result.equals("3")){
                Item item = tracker.findById(input.ask("Enter id: "));
                tracker.deleteItem(item);
                System.out.println("Item deleted");
            }
            else if (result.equals("4")){
                Item item =tracker.findById(input.ask("Enter id: "));
                System.out.println("id : " + item.getId() + " name: " + item.getName()
                        + " description: " + item.getDesc() + " data created: " +
                        item.getCreated() + " comments: " + item.getComments());
            }
            else if (result.equals("5")){
                Item[] items = tracker.findByName(input.ask("Enter name: "));
                for (Item item : items) {
                    System.out.println("id : " + item.getId() + " name: " + item.getName()
                            + " description: " + item.getDesc() + " data created: " +
                            item.getCreated() + " comments: " + item.getComments());
                }
            }
            result = input.ask("Select: ");
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

