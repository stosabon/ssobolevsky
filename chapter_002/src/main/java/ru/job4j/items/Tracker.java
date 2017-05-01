package ru.job4j.items;

/**
 * Created by pro on 01.05.2017.
 */
public class Tracker {
    /**
    * Array of Items.
    */
    private Item[] items = new Item[10];
    /**
    * Number of Items.
    */
    private int numOfItems = 0;
    /**
    * Method to add Item.
    * @param item - new Item
    * @return added Item
    */
    public Item add(Item item) {
        this.items[numOfItems++] = item;
        return item;
    }
    /**
    * Method to update Item.
    * @param item - input Item
    */
    public void updateItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(item.getId())) {
                items[i] = item;
                break;
            }
        }
    }
    /**
    * Method to delete Item.
    * @param item - input Item
    */
    public void deleteItem(Item item) {
        for (int i = 0; i < this.items.length; i++) {
            if (items[i].getId().equals(item.getId())) {
                if (i == this.items.length - 1) {
                    System.arraycopy(this.items, i + 1, this.items, i, this.items.length - 1);
                } else {
                    items[i] = null;
                    numOfItems--;
                }
                break;
            }
        }
    }
    /**
    * Method to find all not null Items.
    * @return array of items
    */
    public Item[] findAll() {
        Item[] items = new Item[this.numOfItems];
        int numOfItems = 0;
        for (Item currentItem : this.items) {
            if (currentItem != null) {
                items[numOfItems++] = currentItem;
            }
        }
        return items;
    }
    /**
    * Method to find Items by name.
    * @param key - name of Item
    * @return array of items
    */
    public Item[] findByName(String key) {
        Item[] items = new Item[this.numOfItems];
        int numOfItems = 0;
        for (Item currentItem : this.items) {
            if (currentItem.getName().equals(key)) {
                items[numOfItems++] = currentItem;
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
