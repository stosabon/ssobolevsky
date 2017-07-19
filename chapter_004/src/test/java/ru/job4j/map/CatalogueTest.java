package ru.job4j.map;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 16.07.2017.
 */
public class CatalogueTest {
    /**
     * Test adding to map.
     */
    @Test
    public void whenAddElemntsToMapThenItAddedWithoutDublicates() {
        Catalogue<Integer, String> catalogue = new Catalogue<>(100);
        Iterator<Integer> iterator = catalogue.iterator();

        catalogue.insert(1, "first");
        catalogue.insert(2, "second");
        catalogue.insert(0, "zero");
        catalogue.insert(1, "hjcgmj");
        catalogue.insert(3, "third");
        catalogue.insert(2, "second");

        assertThat(iterator.next(), is(0));
        assertThat(iterator.next(), is(1));
        assertThat(iterator.next(), is(2));
        assertThat(iterator.next(), is(3));
        assertThat(catalogue.get(1), is("first"));
        assertThat(catalogue.delete(2), is(true));
    }
}
