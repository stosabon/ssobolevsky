package ru.job4j.interfaces;

/**
 * Created by pro on 03.05.2017.
 */
public interface Input {
    /**
     * Method to ask user.
     * @param question - question
     * @return answer
     */
    String ask(String question);

    /**
     * Method to ask user.
     * @param question - question
     * @param range - range of allowed values
     * @return answer
     */
    int ask(String question, int[] range);
}
