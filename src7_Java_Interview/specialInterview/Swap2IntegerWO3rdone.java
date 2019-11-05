package specialInterview;

public class Swap2IntegerWO3rdone {

	public static void main(String[] args) {
		
		
		int x=5;
		int y=10;
		
		// if we use 3rd  var it is easy
//		int t;
//		t=x;
//		x=y;
//		y=t;
//		
//				
		// if we don't use 3rd  var it is:
		//1st way
//		x=x+y; //15
//		y=x-y; //5
//		x=x-y; //10
		
		//2nd way
//		x=x*y; //50
//		y=x/y; //5
//		x=x/y; //10
		
		//3rd way XOR: ^
		x=x^y; // 15 --->1111
		y=x^y; // 10 --->1010
		x=x^y; // 5  --->0101
		
		
		
		
		System.out.println(" X value is : "+ x);
		System.out.println(" y value is : "+ y);
		
	}

}
