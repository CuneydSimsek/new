package testNG_Grouping;



import org.testng.annotations.Test;



public class SmokeTest {
	
	
	@Test(groups = {"smoke", "regression", "sanity"}, priority=1)
	
	
	public void runSmoke(){
		
		System.out.println("Smoke Test");
		
		}
	
	
	
	
	
	
}
