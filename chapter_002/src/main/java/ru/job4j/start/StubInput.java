package ru.job4j.start;

import ru.job4j.interfaces.Input;

/**
 * Created by pro on 07.05.2017.
 */
public class StubInput implements Input {
    /**
     * Emulated answers.
     */
    private String[] answers;
    /**
     * Number of emulated answers.
     */
    private int position = 0;
    /**
     * Constructor to initialize answers.
     * @param answers - array of answers
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Overriden method to ask user.
     * @param question - question
     * @return current answer
     */
    @Override
    public String ask(String question) {
        return this.answers[position++];
    }

    @Override
    public int ask(String question, int[] range) {
        return Integer.valueOf(this.answers[position++]);
    }
}
