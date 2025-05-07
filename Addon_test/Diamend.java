package Addon_test;

public class Diamend {
 
	    public static void printDiamond(int n) {
	    	
	        if (n % 2 == 0 || n < 1) {
	            System.out.println(" odd positive number.");
	            return;
	        }
	        for (int i = 0; i <= n / 2; i++) {
	            System.out.print(" ".repeat((n / 2) - i));
	            System.out.println("* ".repeat(i + 1));
	        }

	        
	        for (int i = (n / 2) - 1; i >= 0; i--) {
	            System.out.print(" ".repeat((n / 2) - i));
	            System.out.println("* ".repeat(i + 1));
	        }
	    }

	    public static void main(String[] args) {
	        printDiamond(5);
	    }
	}
	
