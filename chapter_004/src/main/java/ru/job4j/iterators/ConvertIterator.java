package ru.job4j.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by pro on 08.06.2017.
 */
public class ConvertIterator implements Iterator {
    /**
     * iterator of iterators.
     */
    private Iterator<Iterator<Integer>> iterator;
    /**
     * Iterator.
     */
    private Iterator<Integer> innerIter;


    /**
     * Method to move pointer.
     * @param it - input iterator of iterators
     * @return iterators
     */
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        this.iterator = it;
        this.innerIter = iterator.next();
        return this;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext() || innerIter.hasNext();
    }

    @Override
    public Object next() {
        Integer result = 0;
        if (innerIter.hasNext()) {
            result = innerIter.next();
        } else if (iterator.hasNext()) {
            innerIter = iterator.next();
            result = innerIter.next();
        } else {
            throw new NoSuchElementException();
        }
        return result;
    }


}
