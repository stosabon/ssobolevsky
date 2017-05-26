package ru.job4j.collections;

import java.util.HashMap;
import java.util.List;

/**
 * Created by pro on 26.05.2017.
 */
public class UserConvert {
    /**
     * Method to convert List to HashMap.
     * @param list - input list
     * @return HashMap
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> hashMap = new HashMap<Integer, User>();
        for (User user : list) {
            hashMap.put(user.getId(), user);
        }
        return hashMap;
    }
}
