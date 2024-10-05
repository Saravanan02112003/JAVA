package calsstest;
//1.Write a Java program to find the maximum minimum value of an array

import java.util.Scanner;
public class Q1MaxMin {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input array size and elements
	        System.out.println("Enter the size of the array:");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Initialize max and min
	        int max = arr[0];
	        int min = arr[0];

	        // Loop through the array
	        for (int i = 1; i < size; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	    }
	}

