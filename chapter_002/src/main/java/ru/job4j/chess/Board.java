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
     */
    public boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        boolean moveTo = true;
        for (Figure figure : figures) {
            if (figure.position.getxCoord() == source.getxCoord() && figure.position.getyCoord() == source.getyCoord()) {
                Cell[] passedCells = figure.way(dist);
                for (int i = 0; i < passedCells.length; i++) {
                    for (Figure isFigure : figures) {
                        if (isFigure != null && isFigure.position.getxCoord() == passedCells[i].getxCoord() && isFigure.position.getyCoord() == passedCells[i].getyCoord()) {
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
        return moveTo;
    }

    /**
     * Method to add figure on the board.
     * @param figure - figure
     */
    public void addFigure(Figure figure) {
        figures[numOfFigures++] = figure;
    }
}
