package HomeworkGrouping;

import org.testng.annotations.Test;

public class Buick {
	
	@Test (groups= {"violet","orchid"})
	public void buick() {
		
		System.out.println("The Price of Buick $35.000");
	}

	

}
