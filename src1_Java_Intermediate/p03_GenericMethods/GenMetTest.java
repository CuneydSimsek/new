package p03_GenericMethods;

import org.testng.annotations.Test;

public class GenMetTest {

	GenericMethods gm = new GenericMethods();

	@Test
	public void genericCall() {

		Integer[] iray = { 1, 2, 3, 4, 5, 6, 7 };
		Character[] cray = { 'r', 'a', 'm', 'a', 'z', 'a', 'n' };

		gm.printMeSt(iray); //instead of this call printMe method
		gm.printMe(cray);
		GenericMethods.printMeSt(iray);
		
	}
}
