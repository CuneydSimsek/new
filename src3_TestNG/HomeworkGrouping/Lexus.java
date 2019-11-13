package HomeworkGrouping;

import org.testng.annotations.Test;

public class Lexus {
	
	@Test (groups= {"violet","jasmine"})
	public void lexus() {
		
		System.out.println("The Price of Lexus $75.000");
	}


}
