package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 26.05.2017.
 */
public class UserConvertTest {
    /**
     * Method to convert List to HashMap.
     */
    @Test
    public void whenInputListOfUsersThenReturnHashMapOfUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Stas1", "Moscow1"));
        users.add(new User(2, "Stas2", "Moscow2"));
        users.add(new User(3, "Stas3", "Moscow3"));
        users.add(new User(4, "Stas4", "Moscow4"));
        users.add(new User(5, "Stas5", "Moscow5"));
        UserConvert userConvert = new UserConvert();
        HashMap<Integer, User> result = userConvert.process(users);
        HashMap<Integer, User> expected = new HashMap<Integer, User>();
        expected.put(1, new User(1, "Stas1", "Moscow1"));
        expected.put(2, new User(2, "Stas2", "Moscow2"));
        expected.put(3, new User(3, "Stas3", "Moscow3"));
        expected.put(4, new User(4, "Stas4", "Moscow4"));
        expected.put(5, new User(5, "Stas5", "Moscow5"));

        assertThat(result, is(expected));
    }
}
