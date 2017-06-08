package ru.job4j.iterators;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 08.06.2017.
 */
public class SimpleIteratorTest {
    /**
     * Test next for enum numbers.
     */
    @Test
    public void whenGetNextThenPointerGoForward() {
        Iterator iterator = new SimpleIterator(new int[] {7, 1, 8, 983});

        iterator.next();
        iterator.next();
        int result = (Integer) iterator.next();

        assertThat(result, is(983));
    }

    /**
     * Test hasNext for enum numbers.
     */
    @Test
    public void whenCheckNextThenFalse() {
        Iterator iterator = new SimpleIterator(new int[] {7, 1, 5, 8});

        iterator.next();
        iterator.next();
        iterator.next();
        boolean result = iterator.hasNext();

        assertThat(result, is(false));
    }
}
