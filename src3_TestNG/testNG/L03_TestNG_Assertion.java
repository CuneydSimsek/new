package testNG;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class L03_TestNG_Assertion {
	
	
	@BeforeMethod
	
	public void testSetupPage()
	{
		System.out.println("@BeforeMethod-in testSetupPage() Method");
	}
	
	
	@Test
	public void testHomePage()
	{
		String expectedTitle = "My Site Title";
		String actualTitle ="My Site Title";
	
		//Assert.assertEquals(actual, expected, Error);
		//Assert.assertTrue(condition, Error);
		
		//Assert.fail(Error); //
		
		
		//Assert.assertEquals(actualTitle, expectedTitle, "Title is wrong"); 
		

		//Assert.assertTrue(expectedTitle.equals(expectedTitle), "Title is wrong");
		
		//Assert.assertTrue(actualTitle.contains("My Site"), "Title is wrong");
	
		
		  if(!(actualTitle.equals(expectedTitle))) {
		  
		  
		  Assert.fail("Title is wrong"); }
		
		}
	

	@AfterMethod
	public void testTearDownPage()
	{
		System.out.println("@AfterMethod-in testTearDownPage() Method");
	}
	
	}
