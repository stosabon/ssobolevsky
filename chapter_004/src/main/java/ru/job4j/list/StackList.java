package ru.job4j.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by pro on 27.06.2017.
 */
public class StackList<E> implements Iterable<E> {
    /**
     * First node of stack.
     */
    private Node<E> first = new Node<>(null, null, null);
    /**
     * Current node of stack.
     */
    private Node<E> current = new Node<>(null, null, null);
    /**
     * Last node of stack.
     */
    private Node<E> last = new Node<>(null, null, null);
    /**
     * Method to push element to the top of stack.
     * @param value - value
     */
    public void push(E value) {
        Node<E> currentNode = new Node<>(null, value, null);
        if (this.last.item == null) {
            this.last.item = value;
        } else {
            currentNode.next = this.first;
            this.first.prev = currentNode;
        }
        this.first = currentNode;
    }

    /**
     * Method to remove element from the top of stack.
     */
    public E pop() {
        E result = null;
        if (this.first != null) {
            result = this.first.item;
            if (this.first.next != null) {
                this.first = this.first.next;
            } else {
                this.first = null;
            }
        }
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }
    /**
     * Node of queue.
     * @param <E> - type
     */
    private class Node<E> {
        /**
         * Item of node.
         */
        E item;
        /**
         * Next node.
         */
        Node<E> next;
        /**
         * Previous node.
         */
        Node<E> prev;

        /**
         * Constructor of node.
         * @param prev - previous node
         * @param element - item of node
         * @param next - next node
         */
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * Iterator for stack.
     */
    private class StackIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public E next() {
            E result = null;
            if (current.item == null) {
                current = first;
                result = current.item;
            } else if (current.next != null){
                current = current.next;
                result = current.item;
            } else if (result == null) {
                throw new NoSuchElementException();
            }
            return result;
        }
    }
}
