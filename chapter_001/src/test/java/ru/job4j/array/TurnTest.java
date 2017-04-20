package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test class to operations on an array.
* @author ssobolevsky
* @since 20.04.2017
* @version 1
*/
public class TurnTest {
	/**
	* Test with an even number of elements of array.
	*/
	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] result = turn.back(new int[] {2, 6, 1, 4});
		int[] expected = new int[] {4, 1, 6, 2};
		assertThat(result, is(expected));
	}
	/**
	* Test with an odd number of elements of array.
	*/
	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] result = turn.back(new int[] {1, 2, 3, 4, 5});
		int[] expected = new int[] {5, 4, 3, 2, 1};
		assertThat(result, is(expected));
	}
}