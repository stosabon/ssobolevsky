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
        this.items[this.numOfItems++] = item;
        return item;
    }
    /**
    * Method to update Item.
    * @param item - input Item
    */
    public void updateItem(Item item) {
        for (int i = 0; i < this.numOfItems; i++) {
            if (this.items[i].getId().equals(item.getId())) {
                this.items[i] = item;
                break;
            }
        }
    }
    /**
    * Method to delete Item.
    * @param item - input Item
    */
    public void deleteItem(Item item) {
        for (int i = 0; i < this.numOfItems; i++) {
            if (this.items[i].getId().equals(item.getId())) {
                if (i == this.numOfItems - 1) {
                    System.arraycopy(this.items, i + 1, this.items, i, this.numOfItems - 1);
                } else {
                    this.items[i] = null;
                    this.numOfItems--;
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
        Item[] newItems = new Item[this.numOfItems];
        int newNumOfItems = 0;
        for (int i = 0; i < this.numOfItems; i++) {
            if (this.items[i].getName() != null && this.items[i].getName().equals(key)) {
                newItems[newNumOfItems++] = this.items[i];
            }
        }
        return newItems;
    }
    /**
    * Method to find Item by ID.
    * @param id - id of Item
    * @return founded item or null
    */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < this.numOfItems; i++) {
            if (items[i].getId() != null && items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }
        }
        return result;
    }
}
