package ru.job4j.iterators;



import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 06.06.2017.
 */
public class MatrixIteratorTest {
    /**
     * Test next for matrix.
     */
    @Test
    public void whenGetNextThenPointerGoForward() {
        MatrixIterator iterator = new MatrixIterator(new int[][] {{1, 2}, {3, 4}});

        iterator.next();
        iterator.next();
        int result = (Integer) iterator.next();

        assertThat(result, is(3));
    }
    /**
     * Test hasNext for matrix.
     */
    @Test
    public void whenCheckNextThenFalse() {
        MatrixIterator iterator = new MatrixIterator(new int[][] {{1, 2}, {3, 4}});

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        boolean result = iterator.hasNext();

        assertThat(result, is(false));
    }

}
