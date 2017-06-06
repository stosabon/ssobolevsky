package ru.job4j.iterators;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 06.06.2017.
 */
public class EnumIteratorTest {

    /**
     * Test next for enum numbers.
     */
    @Test
    public void whenGetNextThenPointerGoForward() {
        Iterator iterator = new EnumIterator(new int[] {0, 1, 8, 4});

        iterator.next();
        iterator.next();
        int result = (Integer) iterator.next();

        assertThat(result, is(4));
    }

    /**
     * Test hasNext for enum numbers.
     */
    @Test
    public void whenCheckNextThenFalse() {
        Iterator iterator = new EnumIterator(new int[] {0, 1, 8, 2});
        iterator.next();
        iterator.next();
        iterator.next();
        boolean result = iterator.hasNext();

        assertThat(result, is(false));
    }
}
