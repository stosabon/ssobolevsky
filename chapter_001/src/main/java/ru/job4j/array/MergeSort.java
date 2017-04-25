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
		int j = 0;
		int[] newArray = new int[firstArray.length + secondArray.length];
		int newLength = 0;
		for (int i = 0; i < firstArray.length; i++) {
			while (j < secondArray.length && secondArray[j] <= firstArray[i]) {
				newArray[newLength++] = secondArray[j++];
			}
				newArray[newLength++] = firstArray[i];
		}
		while (j < secondArray.length) {
				newArray[newLength++] = secondArray[j++];
			}
		return newArray;
	}
}