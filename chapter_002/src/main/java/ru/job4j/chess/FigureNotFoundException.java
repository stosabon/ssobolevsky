package ru.job4j.chess;

/**
 * Created by pro on 14.05.2017.
 */
public class FigureNotFoundException extends RuntimeException {
    /**
     * Constructor to print message.
     * @param message - message
     */
    public FigureNotFoundException(String message) {
        super(message);
    }
}
