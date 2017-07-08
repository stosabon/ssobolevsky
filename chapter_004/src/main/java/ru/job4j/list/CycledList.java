package ru.job4j.list;

import java.util.Iterator;

/**
 * Created by pro on 08.07.2017.
 */
public class CycledList<T> implements Iterable<T> {
    /**
     * First node.
     */
    private Node<T> first = null;
    /**
     * Last node.
     */
    private Node<T> last = null;

    @Override
    public Iterator<T> iterator() {
        return new CycledIterator<>();
    }

    /**
     * Node.
     * @param <T> - type of node
     */
    class Node<T> {
        T value;
        Node<T> next;
    }

    /**
     * Method to do cycled list
     */
    public void doCycled() {
        this.last.next = this.first;
    }

    /**
     * Method to add element to list.
     * @param value - value
     */
    public void add(T value) {
        if (this.first == null) {
            this.first = new Node<>();
            this.first.value = value;
            this.last = this.first;
        } else {
            this.last.next = new Node<>();
            this.last.next.value = value;
            this.last = this.last.next;
        }
    }

    /**
     * Method to return first node.
     * @return
     */
    public Node<T> getFirst() {
        return this.first;
    }

    /**
     * Method to determine cycle.
     * @param first - first node.
     * @return is cycle or not
     */
    public boolean hasCycle(Node<T> first) {
        boolean result = false;
        Node<T> current = first.next;
        while (current.next != null && result == false) {
            if (current == first) {
                result = true;
            } else {
                current = current.next;
            }
        }
        return result;
    }

    private class CycledIterator<T> implements Iterator<T> {
        /**
         * Current node.
         */
        private Node<T> currentNode = new Node<>();

        @Override
        public boolean hasNext() {
            return currentNode.next != null;
        }

        @Override
        public T next() {
            T result = currentNode.value;
            currentNode = currentNode.next;
            return result;
        }
    }

}
