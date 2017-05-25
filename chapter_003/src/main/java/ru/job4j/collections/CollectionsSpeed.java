package ru.job4j.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by pro on 23.05.2017.
 */
public class CollectionsSpeed {
    /**
     * Add elements to collection.
     * @param collection - collection
     * @param line - random string
     * @param amount - amount of string
     * @return time of working
     */
    public long add(Collection<String> collection, String line, int amount) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            collection.add(line + i);
        }
        return System.currentTimeMillis() - time;
    }
    /**
     * Remove elements from collection.
     * @param collection - collection
     * @param amount - amount of string
     * @return time of working
     */
    public long delete(Collection<String> collection, int amount) {
        Iterator iterator = collection.iterator();
        long time = System.currentTimeMillis();
        for (int i = 0; i < amount && iterator.hasNext(); i++) {
            iterator.next();
            iterator.remove();
        }
        return System.currentTimeMillis() - time;
    }

    /**
     * Main method.
     * @param args - args
     */
    public static void main(String[] args) {
        CollectionsSpeed speed = new CollectionsSpeed();
        Collection<String> arrayList = new ArrayList<String>();
        Collection<String> linkedList = new LinkedList<String>();
        Collection<String> treeSet = new TreeSet<String>();
        System.out.println(String.format("Add to ArrayList : %d", speed.add(arrayList, "Stas", 1000000)));
        System.out.println(String.format("Add to LinkedList : %d", speed.add(linkedList, "Stas", 1000000)));
        System.out.println(String.format("Add to TreeSet : %d", speed.add(treeSet, "Stas", 1000000)));
        System.out.println(String.format("Remove from ArrayList : %d", speed.delete(arrayList, 10000)));
        System.out.println(String.format("Remove from LinkedList : %d", speed.delete(linkedList, 10000)));
        System.out.println(String.format("Remove from TreeSet : %d", speed.delete(treeSet, 10000)));
    }
}
