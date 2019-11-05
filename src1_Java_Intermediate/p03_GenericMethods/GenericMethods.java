package p03_GenericMethods;

public class GenericMethods {
	
	
	
	
	

	public <T> void printMe(T[] x) {
		for(T b: x)
		System.out.printf("%s ", b);
		System.out.println();
	}
	
	
	
	
    public static <T> void printMeSt(T[] x) {
		
		for(T b: x)
			System.out.printf("%s ", b);
		System.out.println();
	}
	
	
	
}
