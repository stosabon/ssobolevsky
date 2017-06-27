package ru.job4j.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by pro on 27.06.2017.
 */
public class StackList<E> implements Iterable<E> {
    /**
     * Previous node.
     */
    private Node<E> first = new Node<>(null, null, null);
    /**
     * Current node.
     */
    private Node<E> current = new Node<>(null, null, null);
    /**
     * Last node.
     */
    private Node<E> last = new Node<>(null, null, null);
    /**
     * First node.
     */

    /**
     * Method to add element
     * @param value - value
     */

    public void add(E value) {
        Node<E> currentNode = new Node<>(null, value, null);
        if (this.last.item == null) {
            this.last.item = value;
        } else {
            currentNode.next = this.first;
            this.first.prev = currentNode;
        }
        this.first = currentNode;
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
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

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
