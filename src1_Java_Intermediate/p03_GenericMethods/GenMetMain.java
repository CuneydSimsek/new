package p03_GenericMethods;

public class GenMetMain {

	public static void main(String[] args) {
		
		Integer[] iray = {1,2,3,4,5,6,7};
		Character[] cray = {'r','a','m','a','z','a','n'};

		GenericMethods.printMeSt(iray);
		GenericMethods.printMeSt(cray);
	}

	/*public static <T> void printMe(T[] x) {
		
		for(T b: x)
			System.out.printf("%s ", b);
		System.out.println();
	}*/
	
	
	/*public static void printMeSt(Character[] x) {
		for(Character b:x) {
			System.out.printf("%s ",b);
		}
	}
	
	public static void printMeSt(Integer[] x) {
		for(int b:x) {
			System.out.printf("%s ",b);
					}
		System.out.println();
	}*/
	public static <T> void printMeSt(T[] x) {
		for(T b:x) {
			System.out.printf("%s ",b);
					}
		System.out.println();
	}
	
}
