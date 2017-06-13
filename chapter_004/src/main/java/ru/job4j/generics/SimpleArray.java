package ru.job4j.generics;

/**
 * Created by pro on 13.06.2017.
 */
public class SimpleArray<T> {
    /**
     * Container of objects.
     */
    private Object[] array;
    /**
     * Index of object.
     */
    private int index = 0;

    /**
     * Constructor of array.
     * @param size - size of array
     */
    public SimpleArray(int size) {
        this.array = new Object[size];
    }

    /**
     * Method to add object to array.
     * @param value - object
     */
    public void add(T value) {
        this.array[this.index++] = value;
    }

    /**
     * Method to update object.
     * @param index - index of object
     * @param value - value
     */
    public void update(int index, T value) {
            this.array[index] = value;
    }

    /**
     * Method to remove object
     * @param index - index
     */
    public void remove(int index) {
        System.arraycopy(this.array, index, this.array,index + 1, this.array.length - index);
        this.index--;
    }

    /**
     * Method to get object.
     * @param index - index
     * @return object
     */
    public T get(int index) {
        return (T) this.array[index];
    }
}
