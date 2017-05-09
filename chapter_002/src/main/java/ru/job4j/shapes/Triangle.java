package ru.job4j.shapes;

/**
 * Created by pro on 09.05.2017.
 */
public class Triangle implements Shape {
    /**
     * Method to form triangle.
     * @return formed triangle
     */
    @Override
    public String pic() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ^  \n").append(" / \\\n").append("/   \\\n").append("-----");

        return sb.toString();
    }
}
