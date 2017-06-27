package ru.job4j.generics;

/**
 * Created by pro on 13.06.2017.
 */
public class SimpleArray<T extends Base> {
    /**
     * Container of objects.
     */
    private T[] array;
    /**
     * Index of object.
     */
    private int index = 0;

    /**
     * Constructor of array.
     * @param o - array
     */
    public SimpleArray(T[] o) {
        this.array = o;
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
     * @param id - new id
     * @param value - value
     */
    public void update(String id, T value) {
        for (T element : array) {
            if (element.getId().equals(value.getId())) {
                element.setId(id);
            }
        }
    }

    /**
     * Method to remove object
     * @param id - id
     */
    public void remove(String id) {
        int currentIndex = 0;
        for (T element : array) {
            currentIndex++;
            if (element.getId().equals(id)) {
                System.arraycopy(this.array, currentIndex, this.array,currentIndex + 1, this.array.length - currentIndex);
                break;
            }
        }
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
