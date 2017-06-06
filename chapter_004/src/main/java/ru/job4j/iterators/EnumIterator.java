package ru.job4j.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by pro on 06.06.2017.
 */
public class EnumIterator implements Iterator {
    private final int[] values;
    private int index = 0;

    public EnumIterator(final int[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int i = index; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public Object next() {
        while (values[index] % 2 != 0 && index < values.length) {
            index++;
        }
        if (index == values.length) {
            throw new NoSuchElementException();
        } else {
            return values[index++];
        }
    }
}
