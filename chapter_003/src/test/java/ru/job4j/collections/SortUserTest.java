package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 30.05.2017.
 */
public class SortUserTest {
    /**
     * Method to test sorting users by age.
     */
    @Test
    public void whenAddUsersThenSortThemByAge() {
        Set<Users> result = new TreeSet<Users>();
        List<Users> list = new ArrayList<>(
                Arrays.asList(
                new Users(10, "Stas"),
                new Users(20, "Roma"),
                new Users(15, "Maks")
                )
        );
        SortUser sortUser = new SortUser();
        result = sortUser.sort(list);
        Set<Users> expected = new TreeSet<>(
                Arrays.asList(
                        new Users(10, "Stas"),
                        new Users(15, "Maks"),
                        new Users(20, "Roma")
                )
        );
        assertThat(result, is(expected));
    }
    /**
     * Method to test sorting users by length of name.
     */
    @Test
    public void whenAddUsersThenSortThemByLengthName() {
        List<Users> result = new ArrayList<>(
                Arrays.asList(
                        new Users(10, "Stas322"),
                        new Users(20, "Roma1"),
                        new Users(15, "Maks23")
                )
        );
        SortUser sortUser = new SortUser();
        result = sortUser.sortLength(result);
        List<Users> expected = new ArrayList<>(
                Arrays.asList(
                        new Users(20, "Roma1"),
                        new Users(15, "Maks23"),
                        new Users(10, "Stas322")
                )
        );
    }
}
