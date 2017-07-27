package ru.job4j.tree;

import java.util.List;

/**
 * Created by pro on 26.07.2017.
 */
public class MyCompany implements ICompanyService {
    /**
     * Parent of company.
     */
    public final MyCompany parent;
    /**
     * Num of employeers in company.
     */
    public final long employeeCount;

    /**
     * Constructor of company.
     * @param parent - parent
     * @param employeeCount - num of employeers
     */
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
        long count = company.employeeCount;
        for (MyCompany myCompany : companies) {
            if (myCompany.parent != null && myCompany.parent.equals(company)) {
                count += getEmployeeCountForCompanyAndChildren(myCompany, companies);
            }
        }
        return count;
    }
}
