package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author ssobolevsky
* @version 1
* @since 15.04.2017
*/

public class CalculatorTest {
	/**
	* Test add.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
	* Test substruct.
	*/
        @Test
    public void whenSubstructOneAndOneThenZero() {
        Calculator calc = new Calculator();
        calc.substruct(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }
    /**
	* Test div.
	*/
        @Test
    public void whenDivSixAndThreeThenTwo() {
        Calculator calc = new Calculator();
        calc.div(6D, 3D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
	* Test multiple.
	*/
        @Test
    public void whenMultipleTwoAndThreeThenSix() {
        Calculator calc = new Calculator();
        calc.multiple(2D, 3D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }
}