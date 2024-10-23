package classoct;
import java.util.*;
public class Duplicate_Number_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try {
		            List<Integer> numbers = readNumbersFromUser();
		            checkDuplicates(numbers);
		            System.out.println("No Duplicate Numbers!");
		        } catch (Duplicates_Number_Exception e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }

		    public static List<Integer> readNumbersFromUser() {
		        List<Integer> numbers = new ArrayList<>();
		        Scanner s = new Scanner(System.in);

		        System.out.print("How many numbers do you want to input? ");
		        int count = s.nextInt();
		        System.out.println("Input the Integers: ");
		        for (int i = 0; count > 0 && i < count; i++) {
		            int num = s.nextInt();
		            numbers.add(num);
		        }
		        s.close();
		        return numbers;
		    }

		    public static void checkDuplicates(List<Integer> numbers) throws Duplicates_Number_Exception {
		        Set<Integer> uniqueNumbers = new HashSet<>();

		        for (int num : numbers) {
		            if (uniqueNumbers.contains(num)) {
		                throw new Duplicates_Number_Exception("Duplicate number found: " + num);
		            }
		            uniqueNumbers.add(num);
		        }
		    }

		    // Make the custom exception static to avoid scoping issues
		    static class Duplicates_Number_Exception extends Exception {
		        public Duplicates_Number_Exception(String message) {
		            super(message);
		        }
		    }
}
