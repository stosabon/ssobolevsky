package ru.job4j.array;
/**
* Class to operations on an array.
* @author ssobolevsky
* @since 20.04.2017
* @version 1
*/
public class Turn {
	/**
	* Method to turn array.
	* @param array - array
	* @return turned array
	*/
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		return array;
	}
}