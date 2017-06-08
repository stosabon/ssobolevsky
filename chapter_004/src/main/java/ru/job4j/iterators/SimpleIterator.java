package ru.job4j.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by pro on 08.06.2017.
 */
public class SimpleIterator implements Iterator{
    /**
     * Input matrix.
     */
    private final int[] values;
    /**
     * Index of array.
     */
    private int index = 0;
    /**
     * Initialize of array.
     * @param values - array
     */
    public SimpleIterator(final int[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return hasSimple() == -1 ? false : true;
    }

    @Override
    public Object next() {
        index = hasSimple();
        if (index == -1) {
            throw new NoSuchElementException();
        } else {
            return values[index++];
        }
    }

    /**
     * Method to check remaining numbers for simplicity.
     * @return is there simple numbers or not
     */
    private int hasSimple() {
        int result = -1;
        int i = index;
        while (result == -1 && i < values.length){
            if (values[i] == 1 || values[i] == 2) {
                result = i;
            } else {
                int j = 2;
                while (values[i] % j != 0 && j < values.length) {
                    j++;
                }
                if (j == values.length) {
                    result = i;
                }
            }
            i++;
        }
        return result;
    }
}
