package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class L02_TestNG_Annotations {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("@BeforeClass-in beforeClass() Method");
	}
	
	@AfterClass
	public void testClassStopSelenium()
	{
		System.out.println("@AfterClass-in testClassStopSelenium() Method");
	}
	
	@BeforeTest
	public void testClassGroupSetUpDB()
	{
		System.out.println("@BeforeTest-in testClassGroupSetUpDB() Method");
	}
	
	@AfterTest
	public void testClassGroupCleanDB()
	{
		System.out.println("@AfterTest-in testClassGroupCleanDB() Method");
	}
	
	@BeforeSuite
	public void testSuiteSetupSite()
	{
		System.out.println("@BeforeSuite-in testSuiteSetupSite() Method");
	}
	
	@AfterSuite
	public void testSuiteCleanSite()
	{
		System.out.println("@AfterSuite-in testSuiteCleanSite() Method");
	}
	
	@BeforeMethod
	public void testSetupPage()
	{
		System.out.println("@BeforeMethod-in testSetupPage() Method");
	}
	
	
	@Test
	public void testHomePage()
	{
		System.out.println("@Test-in testHomePage() Method");
	
		}
	
	@Test
	public void testLoginPage()
	{
		System.out.println("@Test-in testLoginPage() Method");
	}
	
	@Test
	public void testProductPage()
	{
		System.out.println("@Test-in testProductPage() Method");
	}
	
	@AfterMethod
	public void testTearDownPage()
	{
		System.out.println("@AfterMethod-in testTearDownPage() Method");
	}
	
	}
