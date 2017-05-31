package ru.job4j.collections;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by pro on 29.05.2017.
 */
public class SortUser {
    /**
     * Method to sort users by age.
     * @param list - list of users.
     * @return TreeSet sorted by age
     */
    public Set<Users> sort(List<Users> list) {
        Set<Users> set = new TreeSet<Users>();
        set.addAll(list);
        return set;
    }

    /**
     * Method to sort users by hashcode.
     * @param list - input list
     * @return List sorted by Hashcode
     */
    List<Users> sortHash (List<Users> list) {
        list.sort(
                (o1, o2) -> Integer.compare(o1.hashCode(), o2.hashCode())
        );
        return list;
    }

    /**
     * Method to sort users by name length.
     * @param list - input list
     * @return sorted list by name length
     */
    List<Users> sortLength (List<Users> list) {
        list.sort(
                (o1, o2) -> Integer.compare(o1.getName().length(), o2.getName().length())
        );
        return list;
    }

}
