package p02_Methods;



public class MethodSamples {

	public void typeHello() {
		System.out.println("Hello World");
	}
	
	// public is access modifier which is can reach from everywhere 
	// void means no return type 
	// typeHello is method name, every method has to be () end of Method name
	// {-------} is method body
	// to use this class's methods go to new class which has main method then start to use
	
	public void eatMeal() {
		System.out.println("I had dinner");
	}
	
	public void run() {
		System.out.println("I am running now");
	}
	
	//===== Return Type String Methods====
	
	public String word1() {
	String a="I love you to much";
		return a;
	}
	
	public String word2() {
		String b="My Darling";
			return b;
		}
	
	//===== Return Type int Methods====
	
	public int number1() {
		int a=25;
		return a;
	}
	
	
	public int number2() {
		int b=2;
		return b;
	}
	
	//===== Return Type String and with parameter Methods====
	
	public String word1(String word) {
		String a=word;
			return a;
		}
		
		public String word2(String word) {
			String b=word;
				return b;
			}
		
		public int number1(int shortSide) {
			int a=shortSide;
			return a;
		}
		
		
		public int number2(int longSide) {
			int b=longSide;
			return b;
		}
	
		/*
		There are 4 types of java access modifiers:
        Access Levels
Modifier	Class	Package	Subclass	World
public	      Y	       Y	  Y	          Y
protected	  Y	       Y	  Y	          N
no modifier	  Y	       Y	  N	          N     Also calls as Default
private	      Y	       N	  N	          N

		
	*/
	
	
}
