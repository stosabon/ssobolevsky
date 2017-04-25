package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test class to mergeSort.
* @author ssobolevsky
* @since 23.04.2017
* @version 1
*/
public class MergeSortTest {
	/**
	* Test where sorted arrays.
	*/
	@Test
	public void whenTwoSortedArraysPassedThenTheyMergeSorted() {
		MergeSort mergeSort = new MergeSort();
		int[] result = mergeSort.mergeSort(new int[] {1, 3, 5}, new int[] {2, 4, 5, 7});
		int[] expected = new int[] {1, 2, 3, 4, 5, 5, 7};
		assertThat(result, is(expected));
	}
}