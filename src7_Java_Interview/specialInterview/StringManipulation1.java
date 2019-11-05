package specialInterview;
/*
 * Given the code fragment:
 StringBuilder s1 = new StringBuilder("Java");
 String s2 = "Love";
 s1.append(s2);
 s1.substring(4);
 int foundAt = s1.indexOf(s2);
System.out.println(foundAt);
What is the result?
A) -1
B) 3
C) 4
D) A StringIndexOutOfBoundsException is thrown at runtime.
 */


public class StringManipulation1 {

	public static void main(String[] args) {
		
		
		StringBuilder s1 = new StringBuilder("Java");
		 System.out.println(s1);
		 String s2 = "Love";
		 System.out.println(s2);
		 System.out.println( "s1.substring(4) before append: "+s1.substring(4));
		 s1.append(s2);
		 System.out.println(s1.append(s2));
		 s1.substring(4);
		 System.out.println( "s1.substring(4) after append: "+s1.substring(4));
		 System.out.println( "s1.substring(4,6) after append: "+s1.substring(4,6));
		 int foundAt = s1.indexOf(s2);
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(foundAt);
		 System.out.println("lenght of s2 : "+s2.length());


	}

}
