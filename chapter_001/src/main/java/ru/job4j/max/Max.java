package ru.job4j.max;
/**
* Class Max to find max number.
* @author ssobolevsky
* @since 16.04.2017
* @version 1
*/
public class Max {
	/**
	* Compared variables.
	*/
	private int first, second;
	/**
	* Method to find max from two nubmers.
	* @param first - first argument
	* @param second - second argument
	* @return max number
	*/
	public int max(int first, int second) {
		int max;
		max = first > second ? first : second;
		return max;
	}
}