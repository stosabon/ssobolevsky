package ru.job4j.start;

import ru.job4j.interfaces.Input;

import java.util.Scanner;

/**
 * Created by pro on 03.05.2017.
 */
public class ConsoleInput implements Input {
    /**
     * Variable to input data.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Overriden method to ask user.
     * @param question - question
     * @return answer of user
     */
    @Override
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
