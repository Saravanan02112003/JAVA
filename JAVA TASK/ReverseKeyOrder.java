package task;

import java.util.TreeMap;
import java.util.NavigableSet;

public class ReverseKeyOrder {

    public static void main(String[] args) {
        // Create a TreeMap instance
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some key-value pairs to the TreeMap
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Cherry");
        treeMap.put(4, "Date");
        treeMap.put(5, "Elderberry");

        // Get a reverse order view of the keys
        NavigableSet<Integer> reverseKeys = treeMap.descendingKeySet();

        // Print the keys in reverse order
        System.out.println("Keys in reverse order:");
        for (Integer key : reverseKeys) {
            System.out.println(key);
        }
    }
}