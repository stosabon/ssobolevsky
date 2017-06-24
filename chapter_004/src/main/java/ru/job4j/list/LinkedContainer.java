package ru.job4j.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by pro on 18.06.2017.
 */
public class LinkedContainer<E> implements SimpleList<E> {
    /**
     * Initialization of first element.
     */
    private Node<E> first = new Node<>(null, null, null);
    /**
     * Initialization of last element.
     */
    private Node<E> last;
    /**
     * Size of list.
     */
    private int size = 0;

    @Override
    public void add(E e) {
        if (this.first.current == null) {
            this.first = new Node<>(null, e, null);
            this.last = this.first;
        } else {
            this.last.next = new Node<>(this.last, e, null);
            this.last = this.last.next;
        }
        this.size++;
    }

    @Override
    public E get(int index) {
        int currentIndex = 0;
        Node<E> currentNode = this.first;
        if (index < this.size) {
            while (currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
        return currentNode.current;
    }

    @Override
    public Iterator iterator() {
        return new LinkedIterator<>();
    }

    /**
     * Nodes for list
     * @param <E> - type of parameter
     */
    private class Node<E> {
        /**
         * Current element.
         */
        E current;
        /**
         * Next element.
         */
        Node<E> next;
        /**
         * Previous element
         */
        Node<E> previous;
        /**
         * Constructor of node.
         * @param current - current element
         * @param next - next element
         * @param previous - previous element
         */
        public Node(Node<E> previous, E current, Node<E> next) {
            this.previous = previous;
            this.current = current;
            this.next = next;
        }
    }

    private class LinkedIterator<E> implements Iterator<E> {
        /**
         * Index of current element.
         */
        private int index = 0;
        /**
         * Current node.
         */
        private Node<E> currentNode = new Node<>(null, null, null);

        @Override
        public boolean hasNext() {
            return this.index < size;
        }

        @Override
        public E next() {
            E result = null;
            if (currentNode.current == null) {
                result = (E) first;
                currentNode = (Node<E>) first;
                currentNode = currentNode.next;
                this.index++;
            } else if (currentNode.current != null) {
                result = currentNode.current;
                currentNode = currentNode.next;
                this.index++;
            }
            if (result == null) {
                throw new NoSuchElementException();
            }
            return result;
        }
    }
}
