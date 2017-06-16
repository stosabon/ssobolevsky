package ru.job4j.list;

/**
 * Created by pro on 16.06.2017.
 */
public interface SimpleList<E> extends Iterable<E> {
    /**
     * Method to add element to list.
     * @param e - element
     */
    void add(E e);

    /**
     * Method to return element.
     * @param index - index of element
     * @return element
     */
    E get(int index);
}
