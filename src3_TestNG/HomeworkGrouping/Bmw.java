package HomeworkGrouping;

import org.testng.annotations.Test;

public class Bmw {
	
	@Test (groups= {"jasmine","rose"})
	public void bmw() {
		
		System.out.println("The Price of Bmw $65.000");
	}


}
