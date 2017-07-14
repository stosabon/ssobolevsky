package ru.job4j.set;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 13.07.2017.
 */
public class FastAddSetTest {

    /**
     * Method to test add element to set.
     */
    @Test
    public void whenAddElementThenItAdded() {
        FastAddSet<Integer> set = new FastAddSet<>();
        Iterator<Integer> iterator = set.iterator();

        set.add(4);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        assertThat(iterator.next(), is(4));
        assertThat(iterator.next(), is(3));;
        assertThat(iterator.next(), is(1));
        assertThat(iterator.next(), is(2));
    }
}