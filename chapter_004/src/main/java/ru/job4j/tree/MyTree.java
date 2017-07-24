package ru.job4j.tree;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pro on 22.07.2017.
 */
public class MyTree <E extends Comparable<E>> implements SimpleTree<E> {

    /**
     * Root of tree.
     */
    private Node<E> root = new Node<>();
    /**
     * Current parent.
     */
    private Node<E> currentParent = root;
    /**
     * Node.
     * @param <E> type of value.
     */
    private class Node<E> {
        /**
         * Children.
         */
        List<Node<E>> children = new ArrayList<>();
        /**
         * Value.
         */
        E value;
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node<?> node = (Node<?>) o;

            return value != null ? value.equals(node.value) : node.value == null;
        }

        @Override
        public int hashCode() {
            return value != null ? value.hashCode() : 0;
        }
    }

    @Override
    public boolean add(E parent, E child) {
        boolean result = false;
        if (this.currentParent.value == null) {
            this.currentParent.value = parent;
            Node<E> node = new Node<>();
            node.value = child;
            this.currentParent.children.add(node);
            result = true;
        } else {
            if (currentParent.value.equals(parent)) {
                Node<E> node = new Node<>();
                node.value = child;
                this.currentParent.children.add(node);
                result = true;
            }
            else {
                int index = 0;
                if (this.currentParent.children.size() != 0) {
                    while (index < this.currentParent.children.size() || result == false) {
                        Node<E> currentChild = this.currentParent.children.get(index++);
                        result = add(currentChild.value, child);
                    }
                }
            }
        }

        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            /**
             * Current index.
             */
            private int index = 0;
            /**
             * Current node.
             */
            private Node<E> currentNode = root;
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                E result = currentNode.value;

                return result;
            }
        };
    }
}
