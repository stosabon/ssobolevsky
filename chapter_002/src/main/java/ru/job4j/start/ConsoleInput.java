package ru.job4j.start;

import ru.job4j.exceptions.MenuOutException;
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

    /**
     * Overriden method to ask user.
     * @param question - question
     * @param range - range of allowed values
     * @return key
     */
    @Override
    public int ask(String question, int[] range) {
            int key = Integer.valueOf(this.ask(question));
            boolean exist = false;
            for (int value : range) {
                if (value == key) {
                    exist = true;
                    break;
                }
            }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range");
        }

    }
}
