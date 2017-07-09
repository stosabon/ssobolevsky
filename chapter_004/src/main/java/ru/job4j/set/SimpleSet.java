package ru.job4j.set;

import java.util.Iterator;

/**
 * Created by pro on 09.07.2017.
 */
public class SimpleSet<T> implements Iterable<T> {
    /**
     * Container of objects.
     */
    private Object[] container;
    /**
     * Size of set.
     */
    private int size = 0;
    /**
     * Current position.
     */
    private int position = 0;

    /**
     * Constructor to initialize size.
     * @param size - size of container.
     */
    public SimpleSet(int size) {
        this.container = new Object[size];
    }

    /**
     * Method to add element to set.
     * @param value - element
     */

    public void add(T value) {
        boolean isDublicate = false;
        for (int index = 0; index < this.position; index++) {
            if (this.container[index].equals(value)){
                isDublicate = true;
            }
        }
        if (!isDublicate) {
            this.container[position++] = value;
        }
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
                return container.length > position;
            }

            @Override
            public T next() {
                return (T) container[this.index++];
            }
        };
    }
}
