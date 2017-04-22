package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test class to remove dupicates of array.
* @author ssobolevsky
* @since 21.04.2017
* @version 1
*/
public class ArrayDuplicateTest {
    /**
    * Test to remove duplicates.
    */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] resultArray = arrayDuplicate.remove(new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"});
        String[] expectedArray = new String[] {"Привет", "Мир", "Супер"};
        assertThat(resultArray, is(expectedArray));
    }
}