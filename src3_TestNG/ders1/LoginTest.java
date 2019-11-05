package ders1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

	@Test
	@Parameters("browserName")
	public void loginTest(String browser) throws InterruptedException {
		
		 driver=null;

		if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\cuneyt\\Downloads\\geckodriver.exe"); 
		    driver = new FirefoxDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\cuneyt\\Downloads\\chromedriver.exe");
		     driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://test1.itcareercenter.us");
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='My account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("testuser1");
		driver.findElement(By.id("password")).sendKeys("SeleniumTestAccount1");
		driver.findElement(By.cssSelector("input[value=forever]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();

		String usernameText = driver.findElement(By.xpath("//*[@id='post-17']/div/div/div/p[1]/strong[1]")).getText();
		System.out.println(usernameText);

		if (usernameText.equalsIgnoreCase("testuser1")) {
			System.out.println("Test is Succeessful");
		} else {
			System.out.println("Test is Not Succeessful");
		}

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
