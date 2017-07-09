package ru.job4j.set;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by pro on 09.07.2017.
 */
public class SimpleSetTest {
    /**
     * Method to test add element to set.
     */
    @Test
    public void whenAddElementThenItAdded() {
        SimpleSet<String> set = new SimpleSet<>(5);
        Iterator<String> iterator = set.iterator();

        set.add("first");
        set.add("second");
        set.add("first");
        set.add("third");
        set.add("first");
        iterator.next();
        iterator.next();

        assertThat(iterator.next(), is("third"));
    }

}