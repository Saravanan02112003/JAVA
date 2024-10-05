package calsstest;
//2. Write a Java program to move all O's to the end of an array. Maintain the relative order of the other (non-zero) array elements.

import java.util.Arrays;
public class Q2MoveZeroToEnd {
	    public static void main(String[] args) {
	        int[] arr = {0, 1, 0, 3, 12, 0, 5};

	        int index = 0;
	        // Shift non-zero elements to the front
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                arr[index++] = arr[i];
	            }
	        }

	        // Fill the remaining positions with 0
	        while (index < arr.length) {
	            arr[index++] = 0;
	        }

	        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
	    }
	}
