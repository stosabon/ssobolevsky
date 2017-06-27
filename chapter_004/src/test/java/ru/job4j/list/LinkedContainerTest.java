package ru.job4j.list;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 23.06.2017.
 */
public class LinkedContainerTest {
    /**
     * Test to add and to get elements.
     */
    @Test
    public void whenAddElementToListThenItAdded() {
        LinkedContainer<Integer> container = new LinkedContainer<>();

        container.add(2);
        container.add(3);
        container.add(1);

        assertThat(container.get(2), is(1));
    }

    /**
     * Iterator test.
     */
    @Test
    public void whenElementIsLastThenHasNextIsFalse() {
        LinkedContainer<Integer> container = new LinkedContainer<>();
        Iterator iterator = container.iterator();

        container.add(2);
        container.add(3);
        container.add(1);
        iterator.next();
        iterator.next();
        iterator.next();

        assertThat(iterator.hasNext(), is(false));

    }
    /**
     * Test wrong index.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexIsWrongThenIndexOutBounds() {
        LinkedContainer<Integer> container = new LinkedContainer<>();

        container.get(-1);
    }
}
