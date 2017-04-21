package ru.job4j.array;
/**
* Class to bubblesort array.
* @author ssobolevsky
* @since 21.04.2017
* @version 1
*/
public class BubbleSort {
	/**
	* Method to bubblesort.
	* @param array - input array
	* @return sorted array
	*/
	public int[] sort(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}