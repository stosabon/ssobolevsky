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
        return hasEnum() == -1 ? false : true;
    }

    @Override
    public Object next() {
        index = hasEnum();
        if (index == -1) {
            throw new NoSuchElementException();
        } else {
            return values[index++];
        }
    }

    private int hasEnum() {
        int result = -1;
        for (int i = index; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
