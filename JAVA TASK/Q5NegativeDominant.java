package calsstest;
/*5. Write a Java program that checks whether an array la negative dominant or not. If the array is negative dominant return true otherwise false.

Example:

Orignal array of numbers: [1-2-5,4,3,6]

Check Negative Dominance in the said array true
*/

public class Q5NegativeDominant {
	    public static boolean isNegativeDominant(int[] arr) {
	        int negativeCount = 0;
	        int positiveCount = 0;

	        for (int num : arr) {
	            if (num < 0) {
	                negativeCount++;
	            } else if (num > 0) {
	                positiveCount++;
	            }
	        }

	        return negativeCount > positiveCount;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 5, 4, 3, -6};

	        boolean result = isNegativeDominant(arr);
	        System.out.println("Check Negative Dominance in the said array: " + result);
	    }
}
