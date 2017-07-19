package ru.job4j.set;

import java.util.*;

/**
 * Created by pro on 13.07.2017.
 */
public class FastAddSet<T> implements Iterable<T> {
    /**
     * Container of objects.
     */
    private List<T> container = new ArrayList<>();
    /**
     * Map.
     */
    private Map<T, Object> map = new HashMap<>();
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
        if (map.put(value, new Object()) == null) {
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
                return container.size() > this.index;
            }

            @Override
            public T next() {
                return (T) container.get(index++);
            }
        };
    }
}
