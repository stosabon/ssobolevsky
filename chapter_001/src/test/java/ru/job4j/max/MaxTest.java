package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author ssobolevsky
* @version 1
* @since 16.04.2017
*/
public class MaxTest {
	/**
	* Test where first > second.
	*/
	@Test
	public void whenTwoCompareWithOneThenTwo() {
		Max max = new Max();
		int result = max.max(2, 1);
		int expected = 2;
		assertThat(result, is(expected));
	}
	/**
	* Test where first < second.
	*/
	@Test
	public void when2CompareWithFiveThenFive() {
		Max max = new Max();
		int result = max.max(2, 5);
		int expected = 5;
		assertThat(result, is(expected));
	}
	/**
	* Test where second is max number.
	*/
	@Test
	public void whenTwoAndThreeCompareWithZeroThenThree() {
		Max max = new Max();
		int result = max.max(2, 3, 0);
		int expected = 3;
		assertThat(result, is(expected));
	}
}
