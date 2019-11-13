package HomeworkGrouping;

import org.testng.annotations.Test;

public class Benz {
	
	@Test (groups= {"daisy","rose"})
	public void benz() {
		
		System.out.println("The Price of Mercedes $50.000");
	}


}
