package Addon_test;

public class Perfectnumber {

		   
	    public static boolean isPerfectNumber(int number) {
	        int sum = 0;
	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }
	        return sum == number;
	    }
	    public static void findPerfectNumbersinRange(int start, int end) {
	        System.out.print("Perfect Numbers : ");
	        boolean first = true;
	        for (int number = start; number <= end; number++) {
	            if (isPerfectNumber(number)) {
	                if (!first) {
	                    System.out.print(" ");
	                }
	                System.out.print(number);
	            }
	        }
	        System.out.println();
	    }

	    // Main method
	    public static void main(String[] args) {
	        int startRange = 1;
	        int endRange = 1000;
	        findPerfectNumbersinRange(startRange, endRange);
	    }
	}
	
