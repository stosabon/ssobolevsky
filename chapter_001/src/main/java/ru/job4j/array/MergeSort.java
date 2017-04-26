package ru.job4j.loop;
/**
* Class to merge sort.
* @author ssobolevsky
* @since 25.04.2017
* @version 1
*/
public class MergeSort {
	/**
	* Method to sort and copy array.
	* @param firstArray - first sorted array
	* @param secondArray - second sortedArray
	* @return sorted array
	*/
	public int[] mergeSort(int[] firstArray, int[] secondArray) {
		int j = 0, i = 0;
		int[] newArray = new int[firstArray.length + secondArray.length];
		while (j < secondArray.length && i < firstArray.length) {
    		newArray[i + j] = firstArray[i] < secondArray[j] ? firstArray[i++] : secondArray[j++];
		}
		while (j < secondArray.length) {
			newArray[i + j] = secondArray[j++];
		}
		while (i < firstArray.length) {
			newArray[i + j] = secondArray[i++];
		}

		return newArray;
	}
}