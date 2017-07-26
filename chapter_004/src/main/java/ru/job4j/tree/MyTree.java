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
    private Node<E> currentParent;
    /**
     * Current child.
     */
    private Node<E> currentChild;
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
        Node<E> childNode = new Node<>();
        childNode.value = child;
        Node<E> parentNode = new Node<>();
        parentNode.value = parent;

        if (this.root.value == null) {
            this.root.value = parent;
            this.root.children.add(childNode);
            result = true;
        } else if (this.root.value.equals(parent)) {
            this.root.children.add(childNode);
            result = true;
        } else if (findParent(root.children, parent) != null) {
            this.currentParent = findParent(root.children, parent);
            this.currentParent.children.add(childNode);
            result = true;
        }

        return result;
    }
    private Node<E> findParent(List<Node<E>> children, E parent) {

        Node<E> parentNode = new Node<>();
        parentNode.value = parent;
        for (Node<E> child : children) {
            if (child.value.equals(parent)) {
                return parentNode;
            } else {
                return findParent(child.children, parent);
            }
        }
        return null;
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
