package ru.job4j.start;

import ru.job4j.exceptions.MenuOutException;

/**
 * Created by pro on 11.05.2017.
 */
public class ValidateInput extends ConsoleInput {
    /**
     * Method to input validate data.
     * @param question - question
     * @param range - range of allowed values
     * @return validate data.
     */
    @Override
    public int ask(String question, int[] range) {
        boolean invalidData = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalidData = false;
            } catch (MenuOutException exception) {
                System.out.println("Please, select key from menu!");
            } catch (NumberFormatException exception) {
                System.out.println("Please, enter validate data!");
            }
        } while (invalidData);
        return value;
    }
}

