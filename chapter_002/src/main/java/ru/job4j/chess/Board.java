package ru.job4j.chess;

/**
 * Created by pro on 14.05.2017.
 */
public class Board {
    /**
     * All figures.
     */
    private Figure[] figures = new Figure[32];
    /**
     * number of figures.
     */
    private int numOfFigures = 0;

    /**
     * Method to move figure.
     * @param source - start figure position
     * @param dist - finish figure position
     * @return move
     * @throws ImpossibleMoveException - exception when move impossible
     * @throws OccupiedWayException - exception when way occupied
     * @throws FigureNotFoundException - exception when figure not found
     * @throws CellNotExistException - exception when cell doesn't exist
     */
    public boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException, CellNotExistException {
        boolean moveTo = true;
        if (isOnBoard(source, dist)) {
            for (Figure figure : figures) {
                if (figure.getPosition().getxCoord() == source.getxCoord() && figure.getPosition().getyCoord() == source.getyCoord()) {
                    Cell[] passedCells = figure.way(dist);
                    for (int i = 0; i < passedCells.length; i++) {
                        for (Figure isFigure : figures) {
                            if (isFigure != null && isFigure.getPosition().getxCoord() == passedCells[i].getxCoord() && isFigure.getPosition().getyCoord() == passedCells[i].getyCoord()) {
                                throw new OccupiedWayException("Occupied way.");
                            }
                        }
                    }
                } else {
                    throw new FigureNotFoundException("Figure not found.");
                }
                source.setxCoord(figure.clone(dist).getxCoord());
                source.setyCoord(figure.clone(dist).getyCoord());
                break;
            }
        } else {
            throw new CellNotExistException("Cell doesn't exist.");
        }
        return moveTo;
    }

    /**
     * Method to add figure on the board.
     * @param figure - figure
     */
    public void addFigure(Figure figure) {
        figures[numOfFigures++] = figure;
    }

    /**
     * Method to check is cell on the board.
     * @param source - start cell
     * @param dist - finish cell
     * @return true or false
     */
    boolean isOnBoard(Cell source, Cell dist) {
        boolean isOnBoard = false;
        if (source.getxCoord() >= 0 && source.getxCoord() < 8 && source.getyCoord() >= 0 && source.getyCoord() < 8
                && dist.getxCoord() >= 0 && dist.getxCoord() < 8 && dist.getyCoord() >= 0 && dist.getyCoord() < 8) {
            isOnBoard = true;
        }
        return isOnBoard;
    }
}
