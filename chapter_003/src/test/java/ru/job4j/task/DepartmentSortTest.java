package ru.job4j.task;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 04.06.2017.
 */
public class DepartmentSortTest {
    /**
     * Test sorting in increasing order.
     */
    @Test
    public void whenAddDepartmentsThenItSorted(){
        List<String> result = new ArrayList<>();
        result.add("K2");
        //result.add("K3");
        result.add("K1");
        result.add("K3\\SK2");
        result.add("K4");
        result.add("K3\\SK1\\SSK1");
        result.add("K1\\SK1");
        result.add("K3\\SK1");
        DepartmentSort departmentSort = new DepartmentSort();
        departmentSort.upSort(result);
        List<String> expected = new ArrayList<>();
        expected.add("K1");
        expected.add("K1\\SK1");
        expected.add("K2");
        expected.add("K3");
        expected.add("K3\\SK1");
        expected.add("K3\\SK1\\SSK1");
        expected.add("K3\\SK2");
        expected.add("K4");
        assertThat(result, is(expected));
    }

    /**
     * Test sorting in decreasing order.
     */
    @Test
    public void whenAddDepartmentsThenItSortedDown(){
        List<String> result = new ArrayList<>();
        result.add("K2");
        //result.add("K3");
        result.add("K1");
        result.add("K3\\SK2");
        result.add("K4");
        result.add("K3\\SK1\\SSK1");
        result.add("K1\\SK1");
        result.add("K3\\SK1");
        DepartmentSort departmentSort = new DepartmentSort();
        departmentSort.downSort(result);
        List<String> expected = new ArrayList<>();
        expected.add("K4");
        expected.add("K3");
        expected.add("K3\\SK2");
        expected.add("K3\\SK1");
        expected.add("K3\\SK1\\SSK1");
        expected.add("K2");
        expected.add("K1");
        expected.add("K1\\SK1");
        assertThat(result, is(expected));
    }
}
