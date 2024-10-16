package task;

import java.util.Map;
import java.util.TreeMap;

public class GreatestKeyLessThan {

    public static void main(String[] args) {
        // Create a TreeMap instance
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some key-value pairs to the TreeMap
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Cherry");
        treeMap.put(4, "Date");
        treeMap.put(5, "Elderberry");

        // Key to compare
        int givenKey = 4;

        // Get the greatest key strictly less than the given key
        Map.Entry<Integer, String> entry = treeMap.lowerEntry(givenKey);

        // Check and print the result
        if (entry != null) {
            System.out.println("Greatest key less than " + givenKey + ": " + entry.getKey() + " -> " + entry.getValue());
        } else {
            System.out.println("No key found less than " + givenKey);
        }
    }
}
