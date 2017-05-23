package ru.job4j.tests;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 20.05.2017.
 */
public class RobotTest {

    /**
     * Test to emulate add item.
    */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Robot robot = new Robot();
        int result = robot.moveToEnd(0, 0, new int[][] {{0, 0, 0},{1, 0, 0},{1, 0, 0}});
        int expected = 4;
        assertThat(result, is(expected));
    }

}
