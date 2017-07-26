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
            this.currentParent = this.root;
        } else if (this.currentParent.value.equals(parent)) {
            this.currentParent.children.add(childNode);
            this.currentParent = this.root;
            result = true;
        } else if (this.currentParent.children.contains(parentNode)) {
            this.currentParent = currentParent.children.get(currentParent.children.indexOf(parentNode));
            Node<E> node = new Node<>();
            node.value = child;
            this.currentParent.children.add(node);
            this.currentParent = this.root;
            result = true;
        } else {
                int index = 0;
                this.currentChild = this.currentParent.children.get(index++);
                while ((index < this.currentParent.children.size() && !result)) {
                    result = add(parent, child);
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
