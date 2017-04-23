package ru.job4j.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test class to search substring in string.
* @author ssobolevsky
* @since 23.04.2017
* @version 1
*/
public class StringSearchTest {
	/**
    * Test where there is substring in string.
    */
    @Test
    public void whenSubstringIsInStringThenTrue() {
    	StringSearch stringSearch = new StringSearch();
    	boolean result = stringSearch.contains(new String("Hello World. I write it to learn Java."), new String("write it"));
    	boolean expected = true;
    	assertThat(result, is(expected));
    }
    /**
    * Test Test where there isn't substring in string.
    */
    @Test
    public void whenSubstringIsNotInStringThenFalse() {
    	StringSearch stringSearch = new StringSearch();
    	boolean result = stringSearch.contains(new String("Hello World. I write it to learn Java."), new String("Test Failed"));
    	boolean expected = false;
    	assertThat(result, is(expected));
    }

}