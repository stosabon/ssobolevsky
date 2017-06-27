package ru.job4j.list;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 27.06.2017.
 */
public class StackListTest {

    /**
     * Test to add element to stack.
     */
    @Test
    public void whenAddElementThenItAdded() {
        StackList<Integer> stackList = new StackList<>();
        Iterator<Integer> stackIterator = stackList.iterator();

        stackList.add(0);
        stackList.add(1);
        stackList.add(2);

        assertThat(stackIterator.next(), is(2));
        assertThat(stackIterator.hasNext(), is(true));
        stackIterator.next();
        assertThat(stackIterator.next(), is(0));
        assertThat(stackIterator.hasNext(), is(false));
    }
}
