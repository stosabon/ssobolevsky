package ru.job4j.tree;

import org.junit.Test;
import ru.job4j.tree.MyTree;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 24.07.2017.
 */
public class MyTreeTest {

    @Test
    public void whenAddElementsToTreeThenItAdded() {
        MyTree<Integer> tree = new MyTree();
        assertThat(tree.add(1,2), is(true));
        assertThat(tree.add(1,3), is(true));
        assertThat(tree.add(1,4), is(true));
        assertThat(tree.add(0,4), is(false));
        assertThat(tree.add(20,4), is(false));
        Iterator iterator = tree.iterator();
        assertThat(iterator.next(), is(1));
        assertThat(iterator.next(), is(2));
        assertThat(iterator.next(), is(3));
        assertThat(iterator.next(), is(4));
    }
}
