package HomeworkGrouping;

import org.testng.annotations.Test;

public class Nissan {
	
	@Test (groups= {"violet","rose"})
	public void nissan() {
		
		System.out.println("The Price of Nissan $30.000");
	}

}
