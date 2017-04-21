package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test class to rotate matrix.
* @author ssobolevsky
* @since 21.04.2017
* @version 1
*/
public class RotateArrayTest {
	/**
	* Test to rotate array with two column.
	*/
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
        int[][] resultArray = rotateArray.rotate(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        int[][] expectedArray = new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertThat(resultArray, is(expectedArray));
    }
    /**
    * Test to rotate array with three column.
    */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
        int[][] resultArray = rotateArray.rotate(new int[][] {{1, 2}, {3, 4}});
        int[][] expectedArray = new int[][] {{3, 1}, {4, 2}};
        assertThat(resultArray, is(expectedArray));
    }
}