package ru.job4j.shapes;

/**
 * Created by pro on 09.05.2017.
 */
public class Square implements Shape {
    /**
     * Method to form square.
     * @return formed square
     */
    @Override
    public String pic() {
        StringBuilder sb = new StringBuilder();
        sb.append(" _____ \n").append("|     |\n").append("|     |\n").append("|_____|");

        return sb.toString();

    }
}
