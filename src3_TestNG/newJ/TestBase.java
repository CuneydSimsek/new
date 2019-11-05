package newJ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	WebDriver driver;
	
	@BeforeMethod
	public void akinciCodes() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cuneyt\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://test1.itcareercenter.us");

		
		
	}
	
	
	
	@AfterMethod
	public void cikArtik() {
		
		driver.quit();
		
		
	}
	
	
	
	
	
	
}
