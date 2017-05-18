package ru.job4j.chess;

/**
 * Created by pro on 18.05.2017.
 */
public class Queen extends Figure{
    /**
     * initialize of position.
     *
     * @param position - position of cells.
     */
    public Queen(Cell position) {
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
        Cell[] passedCells = new Cell[8];

        if ((source.getxCoord() != dist.getxCoord() || source.getyCoord() != dist.getyCoord())
                && (Math.abs(source.getyCoord() - dist.getyCoord()) == Math.abs(source.getxCoord() - dist.getxCoord())
                || source.getyCoord() == dist.getyCoord()  || source.getxCoord() == dist.getxCoord() )) {
            formArray(passedCells, dist, source);
        } else {
            throw new ImpossibleMoveException("Impossible move.");
        }
        return passedCells;
    }
}
