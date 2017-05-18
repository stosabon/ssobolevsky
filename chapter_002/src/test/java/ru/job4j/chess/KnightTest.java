package ru.job4j.chess;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 18.05.2017.
 */
public class KnightTest {
    /**
     * Test where check passed cells.
     */
    @Test
    public void whenKnightMoveRightThenReturnArray() {
        Figure knight = new Knight(new Cell(0, 2));
        Cell dist = new Cell(2, 3);
        Cell[] result = knight.way(dist);
        assertThat(result[0].getxCoord(), is(2));
        assertThat(result[0].getyCoord(), is(3));
    }
    /**
     * Test where figure can't move to chosen cell.
     * @throws ImpossibleMoveException - exception when move impossible
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenKnightMoveWrongThenException() throws ImpossibleMoveException {
        Figure knight = new Knight(new Cell(0, 2));
        Cell dist = new Cell(2, 2);
        Cell[] result = knight.way(dist);
    }
}
