package ru.job4j.iterators;

import java.util.Iterator;

/**
 * Created by pro on 06.06.2017.
 */
public class MatrixIterator implements Iterator {
    /**
     * Input matrix.
     */
    private final int[][] matrix;

    /**
     * Intialize of matrix.
      * @param matrix - matrix
     */
    public MatrixIterator(final int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * X coordinate.
     */
    private int xCoord = 0;
    /**
     * Y coordinate.
     */
    private int yCoord = 0;
    @Override
    public boolean hasNext() {
        return matrix.length == xCoord - 1 && yCoord == matrix[xCoord].length;
    }

    @Override
    public Object next() {
        if (yCoord == matrix[xCoord].length) {
            yCoord = 0;
            xCoord++;
        }
        return matrix[xCoord][yCoord++];
    }
}
