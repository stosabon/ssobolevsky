package ru.job4j.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by pro on 16.06.2017.
 */
public class ArrayContainerTest {
    /**
     * Method to test extend of array.
     */
    @Test
    public void whenAddElementsThenSizeIncrease() {
        ArrayContainer<Integer> container = new ArrayContainer<>();
        for (int i = 0; i < 15; i++) {
            container.add(i);
        }

        assertThat(container.get(12), is(12));
    }
}