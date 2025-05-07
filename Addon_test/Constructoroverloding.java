package Addon_test;

public class Constructoroverloding {

	
	    private int length;
	    private int breadth;
	    public Constructoroverloding() {
	        this.length = 1;
	        this.breadth = 1;
	    }

	   
	    public Constructoroverloding(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }
	   
	    public int calculateArea() {
	        return length * breadth;
	    }

	    
	    public static void main(String[] args) {
	    	
	    	Constructoroverloding rectangle1 = new Constructoroverloding();
	        Constructoroverloding rectangle2 = new Constructoroverloding(5, 10);

	        // Displaying the area of both rectangles
	        System.out.println("Area (default): " + rectangle1.calculateArea());
	        System.out.println("Area (5,10): " + rectangle2.calculateArea());
	    }
	}
	