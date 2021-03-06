package ru.job4j.chess;

/**
 * Created by pro on 14.05.2017.
 */
public class Elephant extends Figure {
    /**
     * initialize of position.
     * @param position - position of cell
     */
    public Elephant(Cell position) {
        super(position);
    }

    /**
     * Method to check passed cells.
     * @param dist - position of cell.
     * @return passed cells
     * @throws ImpossibleMoveException - can't move
     */
    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell source = new Cell(this.getPosition().getxCoord(), this.getPosition().getyCoord());
        Cell[] passedCells = new Cell[Math.abs(source.getyCoord() - dist.getyCoord())];
        if (source.getxCoord() != dist.getxCoord() && Math.abs(source.getyCoord() - dist.getyCoord()) == Math.abs(source.getxCoord() - dist.getxCoord())) {
            formArray(passedCells, dist, source);
        } else {
            throw new ImpossibleMoveException("Impossible move.");
        }
        return passedCells;
    }

}
