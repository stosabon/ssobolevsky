package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test class for processing numbers.
* @author ssobolevsky
* @since 18.04.2017
* @version 1
*/

public class CounterTest {
	/**
	* Method to test sum of even numbers.
	*/
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }
}