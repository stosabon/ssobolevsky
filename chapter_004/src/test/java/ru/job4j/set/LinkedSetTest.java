package ru.job4j.set;

import org.junit.Test;
import ru.job4j.list.LinkedContainer;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by pro on 10.07.2017.
 */
public class LinkedSetTest {
    /**
     * Method to test add to linked set.
     */
    @Test
    public void WhenAddElementThenItAdded() {
        LinkedSet<String> set = new LinkedSet<>();
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