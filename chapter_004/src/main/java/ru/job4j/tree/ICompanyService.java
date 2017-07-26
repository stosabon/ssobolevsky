package ru.job4j.tree;

import java.util.List;

/**
 * Created by pro on 26.07.2017.
 */
public interface ICompanyService {
    /**
     * @param child - company for whom we are searching the top
     * level parent (parent of parent of...)
     * @return top level parent
     */
    MyCompany getTopLevelParent(MyCompany child);
    /**
     * @param company - company for whom we are searching count of employees
     * (count of this company employees +
     * count of employees for all children companies and their children, etc.)
     * @param companies - all available companies
     * @return count of employees
     */
    long getEmployeeCountForCompanyAndChildren(MyCompany company, List<MyCompany> companies);
}
