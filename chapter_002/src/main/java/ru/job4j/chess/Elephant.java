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
            Cell passedCell = new Cell(source.getxCoord(), source.getyCoord());
            for (int i = 0; i < Math.abs(source.getyCoord() - dist.getyCoord()); i++) {
                if (passedCell.getxCoord() > dist.getxCoord() && passedCell.getyCoord() > dist.getyCoord()) {
                    passedCells[i] = new Cell(passedCell.getxCoord() - 1 - i, passedCell.getyCoord() - 1 - i);
                } else if (passedCell.getxCoord() > dist.getxCoord() && passedCell.getyCoord() < dist.getyCoord()) {
                    passedCells[i] = new Cell(passedCell.getxCoord() - 1 - i, passedCell.getyCoord() + 1 + i);
                } else if (passedCell.getxCoord() < dist.getxCoord() && passedCell.getyCoord() > dist.getyCoord()) {
                    passedCells[i] = new Cell(passedCell.getxCoord() + 1 + i, passedCell.getyCoord() - 1 - i);
                } else if (passedCell.getxCoord() < dist.getxCoord() && passedCell.getyCoord() < dist.getyCoord()) {
                    passedCells[i] = new Cell(passedCell.getxCoord() + 1 + i, passedCell.getyCoord() + 1 + i);
                }
            }
        } else {
            throw new ImpossibleMoveException("Impossible move.");
        }
        return passedCells;
    }

}
