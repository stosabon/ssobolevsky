package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test class to bubblesort array.
* @author ssobolevsky
* @since 21.04.2017
* @version 1
*/
public class BubbleSortTest {
	/**
	* Test to sort array..
	*/
    @Test
    public void whenSortArrayWithSevenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] resultArray = bubbleSort.sort(new int[] {2, 5, 0, 1, 4, 7, 6});
        int[] expectedArray = new int[] {0, 1, 2, 4, 5, 6, 7};
        assertThat(resultArray, is(expectedArray));
    }
}