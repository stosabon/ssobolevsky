package ru.job4j.loop;

/**
* Class for processing numbers.
* @author ssobolevsky
* @since 18.04.2017
* @version 1
*/

public class Counter {
	/**
	* Method to sum even numbers.
	* @param start - start number
	* @param finish - finish number
	* @return summ of even numbers
	*/
	public int add(int start, int finish) {
		int sum = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}