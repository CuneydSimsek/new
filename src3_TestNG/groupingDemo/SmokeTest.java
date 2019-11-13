package groupingDemo;



import org.testng.annotations.Test;



public class SmokeTest {
	
	
	@Test(groups = {"smoke", "regression"}, priority=1)
	public void runSmoke(){
		System.out.println("Smoke Test");
		
		}
	
	
	
	
	
	
}
