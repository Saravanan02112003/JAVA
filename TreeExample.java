package classoct;
import java.util.*;
import java.util.Map.Entry;

	public class TreeExample {
		//TreeMap - is store key as a sorted Order
	// Red-Black tree-type of self banalcing binary search tree
		//common operation-adding removing, reterieving with average time complexity
		//n-number of element, O(n) -- storing elements in TreeMap
		
		
		//
		public static void main(String[] args)
		{

			Map<String, Integer> treeMap = new TreeMap<>();
			
			//adding elements to the tree map
			treeMap.put("One", 1);//O(log n), O(n)--storing elements in treeMap, n is number of Elements
			treeMap.put("Two", 2);//two-key, 2- value
			treeMap.put("Three", 3);
			treeMap.put("Four", 4);
			treeMap.put("Five", 5);
			treeMap.put("Six", 6);
			System.out.println(treeMap);
			
			//getting the elements from the tree map
			
			int value = treeMap.get("Three");
			System.out.println("Tree Map "+value);
			
			
			//get the firstKey and last key
			
			//checking the key present in the pair
			
			System.out.println("Is value 4 is present in the key ");
			System.out.println("The Value is Available: "+treeMap.containsKey("Four"));

			
			//usage of entrySet
			System.out.println("Entry Set: "+treeMap.entrySet());
			
			//usage of keySet
			System.out.println("keySet: "+treeMap.keySet());
			
			//printing the values
			System.out.println("Values: "+treeMap.values());
			
			//usig replace
			System.out.println("Replacing "+treeMap.replace("Four", 44));
			System.out.println("Replacing "+treeMap.replace("Three", 3, 33));//if old value is 3 change it to 33
			System.out.println(treeMap);
			
			//contains key
			
			System.out.println(treeMap.containsKey("Six"));
			System.out.println(treeMap.containsKey("seven"));
			
		}

	}


