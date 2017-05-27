package ru.job4j.items;

import java.util.ArrayList;

/**
 * Created by pro on 01.05.2017.
 */
public class Tracker {
    /**
    * Array of Items.
    */
    private ArrayList<Item> items = new ArrayList<Item>();
    /**
    * Method to add Item.
    * @param item - new Item
    * @return added Item
    */
    public Item add(Item item) {
        this.items.add(item);
        return item;
    }
    /**
    * Method to update Item.
    * @param item - input Item
    */
    public void updateItem(Item item) {
        for (Item currentItem : items) {
            if (currentItem.getId().equals(item.getId())) {
                items.set(items.indexOf(currentItem), item);
                break;
            }
        }
    }
    /**
    * Method to delete Item.
    * @param item - input Item
    */
    public void deleteItem(Item item) {
        for (Item currentItem : this.items) {
            if (currentItem.getId().equals(item.getId())) {
                items.remove(items.indexOf(currentItem));
                break;
            }
        }
    }
    /**
    * Method to find all not null Items.
    * @return array of items
    */
    public ArrayList<Item> findAll() {
        ArrayList<Item> items = new ArrayList<Item>();
        for (Item currentItem : this.items) {
            items.add(currentItem);
        }
        return items;
    }
    /**
    * Method to find Items by name.
    * @param key - name of Item
    * @return array of items
    */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> items = new ArrayList<Item>();
        for (Item currentItem : this.items) {
            if (currentItem.getName().equals(key)) {
                items.add(currentItem);
            }
        }
        return items;
    }
    /**
    * Method to find Item by ID.
    * @param id - id of Item
    * @return founded item or null
    */
    public Item findById(String id) {
        Item result = null;
        for (Item currentItem : this.items) {
            if (currentItem.getId().equals(id)) {
                result = currentItem;
                break;
            }
        }
        return result;
    }
}
