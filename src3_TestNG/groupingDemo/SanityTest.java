package groupingDemo;


import org.testng.annotations.Test;




public class SanityTest {
	
	
	@Test(groups = {"sanity", "regression"}, priority=2)
	public void runSanity() {
		System.out.println("Sanity Test");
		
		}
	
	
	
}
