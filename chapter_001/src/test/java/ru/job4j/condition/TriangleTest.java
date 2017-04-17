package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
* Test of area of triangle.
*
* @author ssobolevsky
* @version 1
* @since 17.04.2017
*/
public class TriangleTest {
	/**
	* Test where area exist.
	*/
	@Test
	public void whenTriangleExistThenAreaAboveZero() {
		Point a = new Point(2, 3);
		Point b = new Point(3, 1);
		Point c = new Point(4, 3);
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		double expected = 2.0;
		assertThat(result, closeTo(expected, 0.01));
	}

	/**
	* Test where triangle doesn't exist.
	*/
	@Test
	public void whenTriangleNotExistThenAreaNotExist() {
		Point a = new Point(0, 1);
		Point b = new Point(0, 2);
		Point c = new Point(0, 3);
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		double expected = 0.0;
		assertThat(result, closeTo(expected, 0.01));
	}
}