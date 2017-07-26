package ru.job4j.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 26.07.2017.
 */
public class MyCompanyTest {

    /**
     * Method to test number of employyers children and parent.
     */
    @Test
    public void whenAddParentAndChildThenReturnCountOfEmployeers() {
        MyCompany myCompany = new MyCompany(null, 10);
        List<MyCompany> list = new ArrayList<>();
        list.add(new MyCompany(myCompany, 10));
        list.add(new MyCompany(myCompany, 10));
        list.add(new MyCompany(myCompany, 10));

        assertThat(myCompany.getEmployeeCountForCompanyAndChildren(myCompany, list), is(40L));
    }
}
