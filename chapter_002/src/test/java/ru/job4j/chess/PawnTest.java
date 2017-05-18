package ru.job4j.chess;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 18.05.2017.
 */
public class PawnTest {
    /**
     * Test where check passed cells.
     */
    @Test
    public void whenPawnMoveRightThenReturnArray() {
        Figure pawn = new Pawn(new Cell(2, 0));
        Cell dist = new Cell(2, 1);
        Cell[] result = pawn.way(dist);
        assertThat(result[0].getxCoord(), is(2));
        assertThat(result[0].getyCoord(), is(1));
    }

    /**
     * Test where figure can't move to chosen cell.
     * @throws ImpossibleMoveException - exception when move impossible
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenPawnMoveWrongThenException() throws ImpossibleMoveException {
        Figure pawn = new Pawn(new Cell(0, 2));
        Cell dist = new Cell(1, 3);
        Cell[] result = pawn.way(dist);
    }
}
