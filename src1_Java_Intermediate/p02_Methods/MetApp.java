package p02_Methods;

public class MetApp {

	public static void main(String[] args) {
		
		
		// First create an object to reach Methods
		
		MethodSamples ms = new MethodSamples();
		
		// call void methods without return type
		
		ms.eatMeal();
		ms.run();
		ms.typeHello();
		

		System.out.println(ms.word1()+" "+ms.word2());
		
		System.out.println((ms.number1()*ms.number2()));
		
		System.out.println(ms.word1("My Darling")+ms.word2("  I love you too much"));
		
		System.out.println("Rectangular Square is = "+(ms.number1(7)* ms.number2(9)));
		
		
		
		
		
	}

}
