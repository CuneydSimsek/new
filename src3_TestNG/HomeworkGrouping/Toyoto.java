package HomeworkGrouping;

import org.testng.annotations.Test;

public class Toyoto {
	
	@Test (groups= {"daisy","rose","Orchid"})
	public void toyoto() {
		
		System.out.println("The Price of Toyoto $43.000");
	}
	
}
