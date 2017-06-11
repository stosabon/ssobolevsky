package ru.job4j.iterators;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 10.06.2017.
 */
public class ConvertIteratorTest {

    /**
     * Test next for iterator of iterators.
     */
    @Test
    public void whenGetNextThenPointerGoForward() {
        List<Integer> list1 = new ArrayList(Arrays.asList(0, 1, 2, 3));
        List<Integer> list2 = new ArrayList(Arrays.asList(4, 5, 6));
        List<Integer> list3 = new ArrayList(Arrays.asList(7, 8, 9, 10));
        Iterator<Iterator<Integer>> iterator = Arrays.asList(list1.iterator(), list2.iterator(), list3.iterator()).iterator();
        ConvertIterator convert = new ConvertIterator();
        Iterator<Integer> result = convert.convert(iterator);
        result.next();
        result.next();
        result.next();
        result.next();
        assertThat(result.next(), is(4));
    }

    /**
     * Test hasNext for iterator of iterators.
     */
    @Test
    public void whenCheckNextThenFalse() {
        List<Integer> list1 = new ArrayList(Arrays.asList(0, 1));
        List<Integer> list2 = new ArrayList(Arrays.asList(4));
        List<Integer> list3 = new ArrayList(Arrays.asList(7));
        Iterator<Iterator<Integer>> iterator = Arrays.asList(list1.iterator(), list2.iterator(), list3.iterator()).iterator();
        ConvertIterator convert = new ConvertIterator();
        Iterator<Integer> resultIter = convert.convert(iterator);
        resultIter.next();
        resultIter.next();
        resultIter.next();
        resultIter.next();
        boolean result = resultIter.hasNext();

        assertThat(result, is(false));
    }
}
