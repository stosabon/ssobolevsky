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
     * @param id - id
     * @param value - value
     */
    @Override
    public void update(String id, T value) {
        this.objects.update(id, value);
    }

    /**
     * Method to remove object.
     * @param id - id
     */
    @Override
    public void remove(String id) {
        this.objects.remove(id);
    }
}
