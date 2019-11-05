package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L01C_PriorityTest {      

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

	@Test(priority=1)
	public void loginTest() throws InterruptedException {

		System.out.println("Now in login TEST....");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='My account']")).click();
		Thread.sleep(3000);
		System.out.println("My Account Page Title is :"+driver.getTitle());
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

	@Test(priority=2)
	public void dropdownBox() throws InterruptedException {
		System.out.println("Now in Now in Shop TEST....");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Shop']")).click();
		Thread.sleep(3000);
		System.out.println("Shop Page Title is :"+driver.getTitle());
		Select sortOrder = new Select(driver.findElement(By.name("orderby")));
		System.out.println("Default Selected Option is : " + sortOrder.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		sortOrder.selectByVisibleText("Sort by popularity");
		sortOrder = new Select(driver.findElement(By.name("orderby")));
		System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		sortOrder.selectByVisibleText("Sort by average rating");
		sortOrder = new Select(driver.findElement(By.name("orderby")));
		Thread.sleep(3000);
		System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());

		sortOrder.selectByValue("date");
		// sortOrder.selectByVisibleText("Sort by newness");
		sortOrder = new Select(driver.findElement(By.name("orderby")));
		System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		sortOrder.selectByVisibleText("Sort by price: low to high");
		sortOrder = new Select(driver.findElement(By.name("orderby")));
		System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		sortOrder.selectByVisibleText("Sort by price: high to low");
		sortOrder = new Select(driver.findElement(By.name("orderby")));
		System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		List<WebElement> options = sortOrder.getOptions();

		// options.size();

		System.out.println("Total Option Count : " + options.size());
		System.out.println("Options List Total : " + options.size() + "..:");
		int i = 1;
		for (WebElement option : options) {
			System.out.println(" Option " + i + " of " + options.size() + " : " + option.getText());
			i++;
		}

		
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Now in After Method....");
		driver.quit();
	}

}
