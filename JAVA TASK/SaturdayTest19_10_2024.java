package calsstest;
import java.util.*;
public class SaturdayTest19_10_2024 {
public static void main(String[] args) {
			//Q1. That swaps two element in an arraylist
			
			
			List<Integer> nums = new ArrayList<>();
			
			nums.add(2);
			nums.add(6);
			nums.add(5);
			nums.add(3);
			nums.add(10);
			nums.add(11);
			
			System.out.println(nums);
			
			int e1 = 10;
			int e2 = 2;
			
			nums.set(nums.indexOf(e1), e2);
			nums.set(nums.indexOf(e2), e1);
			System.out.println(nums);
			
			
			//Q2. remove and return the first element of a linkedlist
			
			LinkedList<String> fruits = new LinkedList<>();
			
			fruits.add("Mango");
			fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("Orange");
			
			System.out.println(fruits);
			
			System.out.println(fruits.removeFirst());
			System.out.println(fruits);

			
			//Q3. check whether a map contains key-value mappings (empty) or not
			
			Map<Integer, String> student = new TreeMap<>();
			
			student.put(12, "Sakthi");
			student.put(20, "Muthu");
			student.put(13, "Thiru");
			
			System.out.println(student);
			//contains
			System.out.println(student.containsKey(12));
			System.out.println(student.containsValue("Muthu"));
			
			//check empty or not
			
			System.out.println(student.isEmpty());
			
			
			//Q4. find the maximum and minium of the list
			
			List<Integer> marks = new ArrayList<>();
			
			marks.add(12);
			marks.add(20);
			marks.add(19);
			marks.add(16);
			marks.add(100);
			marks.add(299);
			
			System.out.println(marks);
			
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(Integer n : marks) {
				
				if(n > max) {
					max = n;
				}
				if(n < min) {
					min = n;
				}
				
			}
			
			System.out.println(max);
			System.out.println(min);
			
			//Q5. convert an array into collections
			
			Integer[] arr = {2,5,19,10,3};
			
			List<Integer> arraylist = Arrays.asList(arr);
			
			System.out.println(arraylist);
//			arraylist.add(12);
		
			List<Integer> modifiableList = new ArrayList<>(arraylist);
			
			modifiableList.add(89);
			modifiableList.add(20);
			modifiableList.add(30);
			
			System.out.println(modifiableList);
			
			
			
		}

}
