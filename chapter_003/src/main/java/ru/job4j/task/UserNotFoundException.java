package ru.job4j.task;

/**
 * Created by pro on 02.06.2017.
 */
public class UserNotFoundException extends RuntimeException {
    /**
     * Exception when user not found
     * @param message - message
     */
    public UserNotFoundException(String message) {
        super(message);
    }
}
