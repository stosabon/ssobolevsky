package ru.job4j.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pro on 25.05.2017.
 */
public class Convert {
    /**
     * Method to convert array to lis.
     * @param array - array
     * @return list
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }
        return list;
    }

    /**
     * Method to convert list to array.
     * @param list - list
     * @param rows - num of rows
     * @return array
     */
    public int[][] toArray(List<Integer> list, int rows) {
        Iterator<Integer> iterator = list.iterator();
        int columns = ((int) Math.ceil((double) list.size() / rows));
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (iterator.hasNext()) {
                    array[i][j] = iterator.next();
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    /**
     * Method to convert list of arrays to list of integers.
     * @param list - list of arrays
     * @return list of integers
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> newList = new ArrayList<Integer>();

        for (int[] array : list) {
            for (Integer element : array) {
                newList.add(element);
            }
        }
        return newList;
    }

}
