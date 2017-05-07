package ru.job4j.start;

import org.junit.Test;
import ru.job4j.interfaces.Input;
import ru.job4j.items.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 07.05.2017.
 */
public class StubInputTest {
    /**
     * Test to emulate add item.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "1", "test name", "desc", "07052017", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }
    /**
     * Test to emulate edit item.
     */
    @Test
    public void whenUserEditItemThenTrackerHasThisItemWithNewData() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "1", "test name", "desc", "07052017", "2", "1", "Stas", "programmer", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("Stas"));
    }
    /**
     * Test to emulate delete item.
     */
    @Test
    public void whenUserDeleteItemThenTrackerHasNotThisItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "1", "test name", "desc", "07052017", "0", "1", "Stas", "programmer", "07052017", "3", "1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("Stas"));
    }
    /**
     * Test to emulate find item by id.
     */
    @Test
    public void whenUserFindItemByIdTrackerFindThisItems() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "1", "test name", "desc", "07052017", "0", "2", "Stas", "programmer", "07052017", "4", "1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById("2"), is(tracker.findAll()[1]));
    }
    /**
     * Test to emulate find item by name.
     */
    @Test
    public void whenUserFindItemByNameTrackerFindThisItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "1", "test name", "desc", "07052017", "0", "2", "Stas", "programmer", "07052017", "5", "Stas", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("Stas")[0], is(tracker.findAll()[1]));
    }
}
