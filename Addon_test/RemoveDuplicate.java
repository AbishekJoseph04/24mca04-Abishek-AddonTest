package Addon_test;
import java.util.LinkedHashSet;
public class RemoveDuplicate {
	
	   
	    public static String removeDuplicates(String s) {
	        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
	        for (char ch : s.toCharArray()) {
	            uniqueChars.add(ch);
	        }
	        
	        StringBuilder result = new StringBuilder();
	        for (char ch : uniqueChars) {
	            result.append(ch);
	        }
	        
	        return result.toString();
	    }

	    
	    public static void main(String[] args) {
	        String s = "programming";
	        String result = removeDuplicates(s);
	        System.out.println("string: " + s);
	        System.out.println("result: " + result);
	    }
	

}
