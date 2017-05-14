package ru.job4j.chess;

/**
 * Created by pro on 14.05.2017.
 */
public class Cell {
    /**
     * X coordinate of cell.
     */
    private int xCoord;
    /**
     * Y coordinate of cell.
     */
    private int yCoord;
    /**
     * Getter for X coordinate.
     * @return X coordinate
     */
    public int getxCoord() {
        return xCoord;
    }

    /**
     * Setter to X coordinate.
     * @param xCoord - X coordinate
     */
    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }
    /**
     * Getter for Y coordinate.
     * @return Y coordinate
     */
    public int getyCoord() {
        return yCoord;
    }
    /**
     * Setter to Y coordinate.
     * @param yCoord - Y coordinate
     */
    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    /**
     * Constructor to initialize cell.
     * @param xCoord - X coordinate
     * @param yCoord - Y coordinate
     */
    public Cell(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;

    }


}
