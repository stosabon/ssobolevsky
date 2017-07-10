package ru.job4j.set;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by pro on 10.07.2017.
 */
public class LinkedSet<T> implements Iterable<T> {
    /**
     * Container.
     */
    List<T> container = new LinkedList<>();
    /**
     * Method to add value to set.
     * @param value - value
     */
    public void add(T value) {
        if (!container.contains(value)) {
            container.add(value);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            /**
             * Index.
             */
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < container.size();
            }

            @Override
            public T next() {
                return container.get(index++);
            }
        };
    }
}
