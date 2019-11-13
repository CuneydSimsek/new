package HomeworkGrouping;

import org.testng.annotations.Test;

public class Honda {
	
	@Test (groups= {"jasmine","rose"})
	public void honda() {
		
		System.out.println("The Price of Honda $38.000");
	}


}
