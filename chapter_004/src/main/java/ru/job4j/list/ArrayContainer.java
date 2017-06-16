package ru.job4j.list;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by pro on 16.06.2017.
 */
public class ArrayContainer<E> implements SimpleList<E> {
    /**
     * Array of objects.
     */
    private Object[] container = new Object[10];
    /**
     * Counter.
     */
    private int index = 0;
    /**
     * Method to add element to list.
     * @param e - element
     */
    @Override
    public void add(E e) {
        if (index == container.length) {
            increaseSize();
        }
        container[index++] = e;
    }

    private void increaseSize() {
        container = Arrays.copyOf(container, container.length * 2);
    }

    /**
     * Method to get element by index.
     * @param index - index of element
     * @return element
     */
    @Override
    public E get(int index) {
        return (E) container[index];
    }

    /**
     * Method to return iterator of list.
     * @return iterator
     */
    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator<E> implements Iterator<E> {
        /**
         * Counter of iterator.
         */
        private int position = 0;

        @Override
        public boolean hasNext() {
            return container.length > index;
        }

        @Override
        public E next() {
            return (E) container[position++];
        }
    }
}
