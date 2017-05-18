package ru.job4j.chess;

/**
 * Created by pro on 18.05.2017.
 */
public class Pawn extends Figure {
    /**
     * initialize of position.
     *
     * @param position - position of cells.
     */
    public Pawn(Cell position) {
        super(position);
    }

    /**
     * Method to check passed cells.
     * @param dist - position of cell.
     * @return visited cells
     * @throws ImpossibleMoveException - can't move
     */
    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell source = new Cell(this.getPosition().getxCoord(), this.getPosition().getyCoord());
        Cell[] passedCells = new Cell[1];

        if (source.getxCoord() - dist.getxCoord() == 0 && Math.abs(source.getyCoord() - dist.getyCoord())  == 1) {
            formArray(passedCells, dist, source);
        } else {
            throw new ImpossibleMoveException("Impossible move.");
        }
        return passedCells;
    }
}
