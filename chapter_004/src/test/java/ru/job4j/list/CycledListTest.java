package ru.job4j.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 08.07.2017.
 */
public class CycledListTest {

    /**
     * Method to test cycle of list.
     */
    @Test
    public void whenListIsCycledThenHasCycleReturnTrue() {
        CycledList<Integer> list = new CycledList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.doCycled();

        assertThat(list.hasCycle(list.getFirst()), is(true));
    }

    /**
     * Method to test not cycled list.
     */
    @Test
    public void whenListIsNotCycledThenHasCycleReturnFalse() {
        CycledList<Integer> list = new CycledList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertThat(list.hasCycle(list.getFirst()), is(false));
    }
}
