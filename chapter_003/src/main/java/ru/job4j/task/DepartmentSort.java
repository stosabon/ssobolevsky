package ru.job4j.task;

import java.util.*;

/**
 * Created by pro on 04.06.2017.
 */
public class DepartmentSort {
    /**
     * sorting in increasing order.
     * @param list - list
     */
    public void upSort(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            int i = 0;
            String department = "";
            while (i < element.length() && element.charAt(i) != '\\') {
                department += element.charAt(i);
                i++;
            }
            if (i != element.length() && list.contains(department) == false) {
                iterator.add(department);
            }
        }
        list.sort(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        int result = 0;

                        int i = 0;
                        while (i < o1.length() && i < o2.length() && o1.charAt(i) == o2.charAt(i)) {
                            i++;
                        }

                        if (i == o1.length()) {
                            result = -1;
                        } else if (i == o2.length()) {
                            result = 1;
                        } else if (o1.charAt(i) > o2.charAt(i)) {
                            result = 1;
                        } else if (o1.charAt(i) < o2.charAt(i)) {
                            result = -1;
                        }

                        return result;
                    }
                }
        );

    }
    /**
     * sorting in decreasing order.
     * @param list - list
     */
    public void downSort(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            int i = 0;
            String department = "";
            while (i < element.length() && element.charAt(i) != '\\') {
                department += element.charAt(i);
                i++;
            }
            if (i != element.length() && list.contains(department) == false) {
                iterator.add(department);
            }
        }
        list.sort(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        int result = 0;

                        int i = 0;
                        while (i < o1.length() && i < o2.length() && o1.charAt(i) == o2.charAt(i)) {
                            i++;
                        }

                        if (i == o1.length()) {
                            result = -1;
                        } else if (i == o2.length()) {
                            result = 1;
                        } else if (o1.charAt(i) < o2.charAt(i)) {
                            result = 1;
                        } else if (o1.charAt(i) > o2.charAt(i)) {
                            result = -1;
                        }

                        return result;
                    }
                }
        );

    }
}
