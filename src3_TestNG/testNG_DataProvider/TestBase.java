package testNG_DataProvider;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class TestBase {

	WebDriver driver;
	
	@BeforeMethod
	public void setupMethod() {
		System.out.println("Now in Before Method....");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cuneyt\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://test1.itcareercenter.us");
		System.out.println("Home Page Title is :"+driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		System.out.println("Now in After Method....");
		Thread.sleep(3000);
		driver.quit();
	}
	

	
	  @DataProvider public Object[][] login() { 
		  return new Object[][] { 
			  new Object[] { "testuser1", "SeleniumTestAccount1" }, 
			  new Object[] { "testuser2",  "SeleniumTestAccount1" }, 
			  new Object[] { "testuser3", "SeleniumTestAccount1"}, 
			  }; 
			  }
	  
	  @DataProvider public Object[][] shop() { 
		  return new Object[][] { 
			  new Object[] { "Sort by price: high to low" }, 
			  new Object[] { "Sort by price: low to high"}, 
			  new Object[] { "Sort by popularity" }, 
			  new Object[] { "Sort by average rating" }, 
			  }; 
			  }
	 
}
