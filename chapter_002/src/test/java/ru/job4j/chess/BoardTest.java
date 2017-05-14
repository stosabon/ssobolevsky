package ru.job4j.chess;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 14.05.2017.
 */
public class BoardTest {
    /**
     * Test where moving possible.
     */
    @Test
    public void whenElephantMoveRightThenMoveIsTrue() {
        Board board = new Board();
        Figure elephant = new Elephant(new Cell(0, 2));
        Figure elephant2 = new Elephant(new Cell(0, 1));
        board.addFigure(elephant);
        board.addFigure(elephant2);
        boolean result = board.move(elephant.position, new Cell(3, 5));
        assertThat(result, is(true));
        assertThat(elephant.position.getxCoord(), is(3));
        assertThat(elephant.position.getyCoord(), is(5));
    }

    /**
     * Test where figure not found.
     */
    @Test(expected = FigureNotFoundException.class)
    public void whenElephantNotFoundThenNotFoundException() {
        Board board = new Board();
        Figure elephant = new Elephant(new Cell(0, 2));
        Figure elephant2 = new Elephant(new Cell(0, 1));
        board.addFigure(elephant2);
        boolean result = board.move(elephant.position, new Cell(3, 5));
    }
    /**
     * Test where way occupied.
     */
    @Test(expected = OccupiedWayException.class)
    public void whenCellNotEmptyThenOccupiedWayException() {
        Board board = new Board();
        Figure elephant = new Elephant(new Cell(0, 2));
        Figure elephant2 = new Elephant(new Cell(2, 4));
        board.addFigure(elephant);
        board.addFigure(elephant2);
        boolean result = board.move(elephant.position, new Cell(3, 5));
    }
}
