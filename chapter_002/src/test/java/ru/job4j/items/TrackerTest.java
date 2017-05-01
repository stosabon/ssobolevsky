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
        Item item = new Item("1", "firstItem", "desc", 2124323, new String[] {"no comments"});
        Item item2 = new Item("2", "firstItem2", "desc2", 21243232, new String[] {"no comments 2"});
        tracker.add(item);
        tracker.add(item2);
        assertThat(tracker.findAll()[1], is(item2));
    }
    /**
    * Test method to update item.
    */
    @Test
    public void whenUpdateItemThenOldItemChanged() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "firstItem", "desc", 2124323, new String[] {"no comments"});
        Item newItem = new Item("1", "firstItem2", "desc2", 21243232, new String[] {"no comments 2"});
        tracker.add(item);
        tracker.updateItem(newItem);
        assertThat(tracker.findAll()[0], is(newItem));
    }
    /**
    * Test method to delete item.
    */
    @Test
    public void whenDeleteItemThenThisItemDeletedInTracker() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "firstItem", "desc", 2124323, new String[] {"no comments"});
        Item item2 = new Item("2", "firstItem2", "desc2", 21243232, new String[] {"no comments 2"});
        tracker.add(item);
        tracker.add(item2);
        tracker.deleteItem(item);
        assertThat(tracker.findAll()[0], is(item2));
    }
    /**
    * Test method find item by id.
    */
    @Test
    public void whenIdEqualsThenReturnedNotNull() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "firstItem", "desc", 2124323, new String[] {"no comments"});
        Item item2 = new Item("2", "firstItem", "desc", 2124323, new String[] {"no comments"});
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
        Item item = new Item("1", "firstItem", "desc", 2124323, new String[] {"no comments"});
        Item item2 = new Item("2", "firstItem", "desc2", 21243232, new String[] {"no comments 2"});
        tracker.add(item);
        tracker.add(item2);
        assertThat(tracker.findByName("firstItem")[0], is(item));
    }
}