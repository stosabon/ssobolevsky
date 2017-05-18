package ru.job4j.chess;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 18.05.2017.
 */
public class RookTest {
    /**
     * Test where check passed cells.
     */
    @Test
    public void whenRookMoveRightThenReturnArray() {
        Figure rook = new Rook(new Cell(2, 0));
        Cell dist = new Cell(2, 2);
        Cell[] result = rook.way(dist);
        assertThat(result[0].getxCoord(), is(2));
        assertThat(result[0].getyCoord(), is(1));
        assertThat(result[1].getxCoord(), is(2));
        assertThat(result[1].getyCoord(), is(2));
    }

    /**
     * Test where figure can't move to chosen cell.
     * @throws ImpossibleMoveException - exception when move impossible
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenRookMoveWrongThenException() throws ImpossibleMoveException {
        Figure rook = new Rook(new Cell(0, 2));
        Cell dist = new Cell(1, 4);
        Cell[] result = rook.way(dist);
    }
}
