package ru.job4j.chess;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 14.05.2017.
 */
public class ElephantTest {
    /**
     * Test where check passed cells.
     */
    @Test
    public void whenElephantMoveRightThenReturnArray() {
        Figure elephant = new Elephant(new Cell(0, 2));
        Cell dist = new Cell(2, 4);
        Cell[] result = elephant.way(dist);
        assertThat(result[0].getxCoord(), is(1));
        assertThat(result[0].getyCoord(), is(3));
        assertThat(result[1].getxCoord(), is(2));
        assertThat(result[1].getyCoord(), is(4));
    }
    /**
     * Test where figure can't move to chosen cell.
     * @throws ImpossibleMoveException - exception when move impossible
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenElephantMoveWrongThenException() throws ImpossibleMoveException {
        Figure elephant = new Elephant(new Cell(0, 2));
        Cell dist = new Cell(1, 4);
        Cell[] result = elephant.way(dist);
    }
}
