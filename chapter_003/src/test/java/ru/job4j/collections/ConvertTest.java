package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 25.05.2017.
 */
public class ConvertTest {
    /**
     * Method to test convert to list.
     */
    @Test
    public void whenInputArrayThenOutputList() {
        int[][] array = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Convert convert = new Convert();
        List<Integer> result = convert.toList(array);
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            expected.add(i);
        }
        assertThat(result, is(expected));
    }
    /**
     * Method to test convert to array.
     */
    @Test
    public void whenInputListThenOutputArray() {
        int[][] expected = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 0, 0}};
        Convert convert = new Convert();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        int[][] result = convert.toArray(list, 4);
        assertThat(result, is(expected));
    }

    /**
     * Method to test convert list of arrays to list of integers..
     */
    @Test
    public void whenInputListOfArraysThenOutputNewListOfIntegers() {
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 1; i < 8; i++) {
            expected.add(i);
        }
        Convert convertList = new Convert();
        List<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {1, 2, 3});
        list.add(new int[] {4, 5, 6, 7});
        List<Integer> result = convertList.convert(list);
        assertThat(result, is(expected));
    }

}
