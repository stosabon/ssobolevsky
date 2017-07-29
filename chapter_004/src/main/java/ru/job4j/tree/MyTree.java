package ru.job4j.tree;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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
                findParent(child.children, parent);
            }
        }
        return null;
    }
    @Override
    public Iterator iterator() {
        return new MyIterator();
    }
    private class MyIterator implements Iterator<E> {
        /**
         * Curreint index.
         */
        private int index = 0;
        /**
         * Current node.
         */
        private Node<E> currentNode = root;
        /**
         * List.
         */
        private List<Node<E>> list = new ArrayList<>();

        /**
         * Constructo to convert tree to list.
         */
        public MyIterator() {
            list.add(root);
            formQueue(root.children);
        }

        /**
         * Method to form queue from tree.
         */
        private void formQueue(List<Node<E>> children) {
            for (Node<E> child : children) {
                list.add(child);
                formQueue(child.children);
            }
        }
        @Override
        public boolean hasNext() {
            return this.index < list.size();
        }

        @Override
        public E next() {
            return list.get(this.index++).value;
        }
    }
}
