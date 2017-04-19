package ru.job4j.loop;
/**
* Class for calculate factorial.
* @author ssobolevsky
* @since 19.04.2017
* @version 1
*/
public class Factorial {
	/**
	* Method to calculate factorial.
	* @param n - argument of factorial.
	* @return n factorial
	*/
	public int calc(int n) {
		int factorial = 1;
		if (n == 0) {
			factorial = 1;
		} else {
			for (int i = 2; i <= n; i++) {
				factorial *= i;
			}
		}
		return factorial;
	}
}