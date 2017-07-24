package ru.job4j.tree;

/**
 * Created by pro on 22.07.2017.
 */

public interface SimpleTree<E extends Comparable<E>> extends Iterable<E> {
    /**
     * Add child to parent.
     * Parent can have list of children.
     * @param parent parent.
     * @param child child.
     * @return true or false.
     */
    boolean add(E parent, E child);
}
