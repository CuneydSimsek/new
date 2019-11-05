package specialInterview;

import java.util.Arrays;

public class ReverseWord {

	public static void main(String[] args) {
		
String input ="My name is Ramazan Sivri";
		
		String reverse="";
		for(int i= input.length()-1; i>=0; i--) {
			reverse = reverse + input.charAt(i);					
		}
		
		System.out.println("====Letter by Letter");
		System.out.println("=================");
		System.out.println(reverse);
		
		System.out.println("=================");
		
		String input1 = "My name is Ramazan Sivri";
		String[] original = input1.split("\\s+");
		
		
	String revW="";	
    System.out.println(Arrays.toString(original));
    for(int i = original.length-1; i>=0; i-- )
    revW = revW + " "+ original[i];
    	System.out.print(revW);
    
    
	}
		
		
	}


