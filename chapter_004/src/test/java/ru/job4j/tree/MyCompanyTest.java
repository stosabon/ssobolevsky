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
        MyCompany myCompany2 = new MyCompany(null, 5);
        MyCompany myCompany = new MyCompany(myCompany2 , 20);
        List<MyCompany> list = new ArrayList<>();
        list.add(new MyCompany(myCompany, 10));
        list.add(new MyCompany(myCompany, 10));
        list.add(new MyCompany(myCompany, 10));
        list.add(myCompany);
        list.add(myCompany2);

        assertThat(myCompany.getEmployeeCountForCompanyAndChildren(myCompany, list), is(50L));
        assertThat(myCompany.getEmployeeCountForCompanyAndChildren(myCompany2, list), is(55L));
    }
}
