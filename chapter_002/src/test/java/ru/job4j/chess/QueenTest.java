package ru.job4j.chess;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 18.05.2017.
 */
public class QueenTest {
    /**
     * Test where check passed cells.
     */
    @Test
    public void whenQueentMoveRightThenReturnArray() {
        Figure queen = new Queen(new Cell(0, 2));
        Cell dist = new Cell(1, 2);
        Cell[] result = queen.way(dist);
        assertThat(result[0].getxCoord(), is(1));
        assertThat(result[0].getyCoord(), is(2));
        assertThat(result[1].getxCoord(), is(2));
        assertThat(result[1].getyCoord(), is(2));
    }

    /**
     * Test where figure can't move to chosen cell.
     * @throws ImpossibleMoveException - exception when move impossible
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenQueenMoveWrongThenException() throws ImpossibleMoveException {
        Figure queen = new Queen(new Cell(0, 2));
        Cell dist = new Cell(1, 4);
        Cell[] result = queen.way(dist);
    }
}
