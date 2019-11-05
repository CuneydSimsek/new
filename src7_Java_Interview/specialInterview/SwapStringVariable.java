package specialInterview;

public class SwapStringVariable {

	public static void main(String[] args) {
		
		String a="Hello ";
		String b=" World";
		
		System.out.println("before swap: ");
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
		
		//1.append a and b:
		a=a+b; // HelloWorld
		
		//2. Store initial string in string b:
		b=a.substring(0, a.length()-b.length());
		
		//3.Store initial string b in a:
		a=a.substring(b.length());
		
		System.out.println("-------------------------");
		System.out.println("after swap: ");
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
		

	}

}
