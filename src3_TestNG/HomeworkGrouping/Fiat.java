package HomeworkGrouping;

import org.testng.annotations.Test;

public class Fiat {
	
	@Test (groups= {"violet","daisy"})
	public void fiat() {
		
		System.out.println("The Price of Fiat $15.000");
	}


}
