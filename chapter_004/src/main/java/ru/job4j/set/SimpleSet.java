package ru.job4j.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pro on 09.07.2017.
 */
public class SimpleSet<T> implements Iterable<T> {
    /**
     * Container of objects.
     */
    private List<T> container = new ArrayList<>();
    /**
     * Current position.
     */
    private int position = 0;
    /**
     * Method to add element to set.
     * @param value - element
     */
    public long add(T value) {
        long startTime = System.nanoTime();
        if (!container.contains(value)) {
            container.add(value);
        }
        return System.nanoTime() - startTime;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            /**
             * Current index.
             */
            private int index = 0;
            @Override
            public boolean hasNext() {
                return container.size() > position;
            }

            @Override
            public T next() {
                return (T) container.get(index++);
            }
        };
    }
}
