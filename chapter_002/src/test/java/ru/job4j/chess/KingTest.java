package ru.job4j.chess;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 18.05.2017.
 */
public class KingTest {
    /**
     * Test where check passed cells.
     */
    @Test
    public void whenKingMoveRightThenReturnArray() {
        Figure king = new King(new Cell(0, 2));
        Cell dist = new Cell(1, 2);
        Cell[] result = king.way(dist);
        assertThat(result[0].getxCoord(), is(1));
        assertThat(result[0].getyCoord(), is(2));
    }
    /**
     * Test where figure can't move to chosen cell.
     * @throws ImpossibleMoveException - exception when move impossible
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenKingMoveWrongThenException() throws ImpossibleMoveException {
        Figure king = new King(new Cell(0, 2));
        Cell dist = new Cell(2, 2);
        Cell[] result = king.way(dist);
    }
}
