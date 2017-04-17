package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test class of point location.
*
* @author ssobolevsky
* @version 1
* @since 17.04.2017
*/

public class PointTest {
	/**
	* Test where point belongs to function.
	*/
	@Test
	public void whenPointBelongsThenTrue() {
		Point point = new Point(2, 6);
		boolean result = point.is(1, 4);
		assertThat(result, is(true));

	}
	/**
	* Test where point don't belongs to function.
	*/
	@Test
	public void whenPointNotBelongsThenTrue() {
		Point point = new Point(2, 3);
		boolean result = point.is(1, 4);
		assertThat(result, is(false));

	}
}