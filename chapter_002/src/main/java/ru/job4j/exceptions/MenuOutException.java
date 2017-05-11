package ru.job4j.exceptions;

/**
 * Created by pro on 11.05.2017.
 */
public class MenuOutException extends RuntimeException {
    /**
     * Constructor to print message.
     * @param message - message
     */
    public MenuOutException(String message) {
        super(message);
    }
}
