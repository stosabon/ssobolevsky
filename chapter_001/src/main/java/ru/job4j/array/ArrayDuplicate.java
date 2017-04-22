package ru.job4j.array;
import java.util.Arrays;
/**
* Class to remove dupicates of array.
* @author ssobolevsky
* @since 21.04.2017
* @version 1
*/
public class ArrayDuplicate {
	/**
	* Method to remove duplicates of array.
	* @param array - input array
	* @return changed array
	*/
	 public String[] remove(String[] array) {
	 	int n = array.length;
	 	for (int i = 0; i < n; i++) {
	 		for (int j = 0; j < n; j++) {
	 			if (array[i].equals(array[j]) && i != j) {
	 				for (int k = j; k < n - 1; k++) {
	 					String temp = array[k];
	 					array[k] = array[k + 1];
	 					array[k + 1] = temp;
	 				}
	 				n--;
	 			}
	 		}
	 	}
	 	return Arrays.copyOf(array, n);

	 }
}