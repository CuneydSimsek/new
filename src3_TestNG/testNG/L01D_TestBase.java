package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class L01D_TestBase {

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
	
	
}
