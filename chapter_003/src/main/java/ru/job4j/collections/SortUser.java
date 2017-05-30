package ru.job4j.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by pro on 29.05.2017.
 */
public class SortUser {
    /**
     * Method to sort users by age.
     * @param users - list of users.
     * @return TreeSet sorted by age
     */
    public Set<Users> sort(List<Users> users) {
        Set<Users> set = new TreeSet<Users>();
            for (Users user : users) {
                set.add(user);
            }
        return set;
    }

}
