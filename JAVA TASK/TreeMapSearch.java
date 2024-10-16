package task;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSearch {

    public static void main(String[] args) {
        // Create a TreeMap instance
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some key-value pairs to the TreeMap
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Cherry");
        treeMap.put(4, "Date");
        treeMap.put(5, "Elderberry");

        // Value to search for
        String valueToFind = "Cherry";

        // Search for the value
        boolean valueExists = treeMap.containsValue(valueToFind);

        // Output the result
        if (valueExists) {
            System.out.println("Value '" + valueToFind + "' found in the TreeMap.");
        } else {
            System.out.println("Value '" + valueToFind + "' not found in the TreeMap.");
        }
    }
}