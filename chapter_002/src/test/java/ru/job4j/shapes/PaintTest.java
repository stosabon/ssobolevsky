package ru.job4j.shapes;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 09.05.2017.
 */
public class PaintTest {
    /**
     * Test method to draw square.
     */
    @Test
    public void whenDrawSquareThenPrintSquare() {
        Square square = new Square();
        String result = square.pic();
        String expected = " _____ \n|     |\n|     |\n|_____|";
        assertThat(result, is(expected));
    }

    /**
     * Test method to draw triangle.
     */
    @Test
    public void whenDrawTriangleThenPrintTriangle() {
        Triangle triangle = new Triangle();
        String result = triangle.pic();
        String expected = "  ^  \n / \\\n/   \\\n-----";
        assertThat(result, is(expected));
    }
}
