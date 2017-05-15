package ru.job4j.chess;

/**
 * Created by pro on 15.05.2017.
 */
public class CellNotExistException extends RuntimeException {
    /**
     * Constructor to print message.
     * @param message - message
     */
    public CellNotExistException(String message) {
        super(message);
    }
}
