package ru.job4j.generics;

/**
 * Created by pro on 17.06.2017.
 */
public abstract class AbstractStore<T extends Base> implements Store<T> {
    /**
     * Container.
     */
    private SimpleArray<T> objects;

    /**
     * Method to add to container.
     * @param value - value
     */
    @Override
    public void add(T value) {
        this.objects.add(value);
    }

    /**
     * Method to update object.
     * @param index - index
     * @param value - value
     */
    @Override
    public void update(int index, T value) {
        this.objects.update(index, value);
    }

    /**
     * Method to remove object.
     * @param index - index
     */
    @Override
    public void remove(int index) {
        this.objects.remove(index);
    }
}
