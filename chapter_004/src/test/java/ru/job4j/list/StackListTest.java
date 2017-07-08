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

        stackList.push(0);
        stackList.push(1);
        stackList.push(2);

        assertThat(stackIterator.next(), is(2));
        assertThat(stackIterator.hasNext(), is(true));
        stackIterator.next();
        assertThat(stackIterator.next(), is(0));
        assertThat(stackIterator.hasNext(), is(false));
    }
    /**
     * Test to remove element from stack.
     */
    @Test
    public void whenRemoveElementThenElementRemoved() {
        StackList<Integer> stackList = new StackList<>();
        Iterator<Integer> stackIterator = stackList.iterator();

        stackList.push(0);
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        stackList.pop();
        stackList.pop();

        assertThat(stackIterator.next(), is(2));
        assertThat(stackIterator.hasNext(), is(true));
        stackIterator.next();
        assertThat(stackIterator.next(), is(0));
        assertThat(stackIterator.hasNext(), is(false));
    }
}
