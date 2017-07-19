package ru.job4j.map;

import java.util.Iterator;

/**
 * Created by pro on 15.07.2017.
 */
public class Catalogue<K, V> implements Iterable<K> {
    /**
     * Container of Node.
     */
    private Node<K, V>[] container;
    /**
     * Number of elements.
     */
    private int count = 0;
    /**
     * Constructor to initialize container.
     * @param length - length
     */
    public Catalogue(int length) {
        this.container = new Node[length];
    }

    /**
     * Class of node.
     * @param <K> - type of key
     * @param <V> - type of value
     */
    private class Node<K, V> {
        /**
         * Key.
         */
        K key;
        /**
         * Value.
         */
        V value;
        /**
         * Constructor of node.
         * @param key - key
         * @param value - value
         */
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    /**
     * Method to insert key-value to map.
     * @param key - key
     * @param value - value
     * @return inserted or not
     */
    public boolean insert(K key, V value) {
        boolean result = false;
        int index = key.hashCode() % container.length;
        if (container[index] == null) {
            result = true;
            container[index] = new Node<>(key, value);
            count++;
        }
        return result;
    }
    /**
     * Method to delete key-value by key from map.
     * @param key - key
     * @return deleted or not
     */
    public boolean delete(K key) {
        boolean result = false;
        int index = key.hashCode() % container.length;
        if (container[index] != null) {
            System.arraycopy(container, index, container, index + 1, container.length - index - 1);
            count--;
            result = true;
        }
        return result;
    }

    /**
     * Method to get value by key.
     * @param key - key
     * @return value or null.
     */
    public V get (K key) {
        return container[key.hashCode() % container.length].value;
    }

    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public K next() {
                return container[index++].key;
            }
        };
    }
}
