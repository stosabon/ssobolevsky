package ru.job4j.tree;

import java.util.List;

/**
 * Created by pro on 26.07.2017.
 */
public class MyCompany implements ICompanyService {
    public final MyCompany parent;
    public final long employeeCount;

    public MyCompany(MyCompany parent, long employeeCount) {
        this.parent = parent;
        this.employeeCount = employeeCount;
    }

    @Override
    public MyCompany getTopLevelParent(MyCompany child) {
        MyCompany result = null;
        while (child.parent != null) {
            result = child.parent;
            child = child.parent;
        }
        return result;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(MyCompany company, List<MyCompany> companies) {
        long numOfChildren = company.employeeCount;
        for (MyCompany myCompany : companies) {
            if (myCompany.parent.equals(company)) {
                numOfChildren += myCompany.employeeCount;
            }
        }
        return numOfChildren;
    }
}
