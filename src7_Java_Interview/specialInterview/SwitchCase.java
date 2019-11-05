package specialInterview;
/*
 * Given the code fragment:
// Line n1
switch (cardVal) {
 case 4: case 5: case 6:
 case 7: case 8:
 System.out.println("Hit");
 break;
 case 9: case 10: case 11:
 System.out.println("Double");
 break;
 case 15: case 16:
 System.out.println("Surrender");
 break;
 default:
 System.out.println("Stand");
}
Which two code fragments can be inserted at Line n1, independently, enable to print Stand?
A) int cardVal = 6;
B) int cardVal = 10;
C) int cardVal = 14;
D) int cardVal = 18;
 */
public class SwitchCase {
	
	public static void main(String[] args) {
		
	
	// Line n1
	//int cardVal = 14;
	int cardVal = 16;
			{
			
	switch (cardVal) {
	 case 4: case 5: case 6:
	 case 7: case 8:
	 System.out.println("Hit");
	 break;
	 case 9: case 10: case 11:
	 System.out.println("Double");
	 break;
	 case 15: case 16:
	 System.out.println("Surrender");
	 break;
	 default:
	 System.out.println("Stand");
	}
}
}}

