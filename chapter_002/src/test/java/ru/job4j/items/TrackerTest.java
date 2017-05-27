package ru.job4j.items;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 01.05.2017.
 */
public class TrackerTest {
    /**
    * Test method to add item.
    */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "firstItem", "desc");
        Item item2 = new Item("2", "firstItem2", "desc2");
        tracker.add(item);
        tracker.add(item2);
        assertThat(tracker.findAll().get(1), is(item2));
    }
    /**
    * Test method to update item.
    */
    @Test
    public void whenUpdateItemThenOldItemChanged() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "firstItem", "desc");
        Item newItem = new Item("1", "firstItem2", "desc2");
        tracker.add(item);
        tracker.updateItem(newItem);
        assertThat(tracker.findAll().get(0), is(newItem));
    }
    /**
    * Test method to delete item.
    */
    @Test
    public void whenDeleteItemThenThisItemDeletedInTracker() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "firstItem", "desc");
        Item item2 = new Item("2", "firstItem2", "desc2");
        Item item3 = new Item("3", "firstItem2", "desc2");
        Item item4 = new Item("4", "firstItem2", "desc2");
        Item item5 = new Item("5", "firstItem2", "desc2");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        tracker.deleteItem(item4);
        assertThat(tracker.findAll().get(3), is(item5));
    }
    /**
    * Test method find item by id.
    */
    @Test
    public void whenIdEqualsThenReturnedNotNull() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "firstItem", "desc");
        Item item2 = new Item("2", "firstItem", "desc");
        tracker.add(item);
        tracker.add(item2);
        assertThat(tracker.findById("2"), is(item2));
    }
    /**
    * Test method find item by name.
    */
    @Test
    public void whenNameEqualsThenReturnedNotNull() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "firstItem", "desc");
        Item item2 = new Item("2", "firstItem", "desc2");
        tracker.add(item);
        tracker.add(item2);
        assertThat(tracker.findByName("firstItem").get(0), is(item));
    }
}