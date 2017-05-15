package ru.job4j.chess;

/**
 * Created by pro on 14.05.2017.
 */
public abstract class Figure {
    /**
     * Position of figure.
     */
    private final Cell position;

    /**
     * initialize of position.
     * @param position - position of cells.
     */
    public Figure(Cell position) {
        this.position = position;
    }

    /**
     * Method to check can figure move to this cell.
     * @param dist - position of cell.
     * @return array of passed cells.
     * @throws ImpossibleMoveException - exception when move impossible
     */
    public abstract Cell[] way(Cell dist) throws ImpossibleMoveException;

    /**
     * New position of figure.
     * @param dist - final cell.
     * @return dist
     */
    public Cell clone(Cell dist) {
        return dist;
    }

    /**
     * Getter for position.
     * @return - position
     */
    public Cell getPosition() {
        return position;
    }
}
