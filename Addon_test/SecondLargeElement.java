package Addon_test;

import java.util.Arrays;

public class SecondLargeElement {
	
	   
	    public static int findSecondLargest(int[] arr) {
	        if (arr.length < 2) {
	            throw new IllegalArgumentException("Array must contain at least two elements.");
	        }

	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        for (int number : arr) {
	            if (number > first) {
	                second = first;
	                first = number;
	            } else if (number > second && number != first) {
	                second = number;
	            }
	        }

	        if (second == Integer.MIN_VALUE) {
	            throw new IllegalArgumentException("No second largest element found.");
	        }

	        return second;
	    }

	    // Main method
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 50, 30, 40};
	        int secondLargest = findSecondLargest(arr);
	        System.out.println("Array: " + Arrays.toString(arr));
	        System.out.println("Second largest element = " + secondLargest);
	    }
	
}
