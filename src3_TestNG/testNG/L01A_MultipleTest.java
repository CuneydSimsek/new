package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class L01A_MultipleTest {
	
	//https://www.youtube.com/watch?v=yyUyi8s42dE (TestNG SetUp Video)

	@Test
	public void loginTest() throws InterruptedException { // public: keyword is an access level modifier.

		System.setProperty("webdriver.chrome.driver","C:\\Users\\cuneyt\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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

		Thread.sleep(5000);
		driver.close(); 

	}

	@Test
	public void dropdownBox() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cuneyt\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://test1.itcareercenter.us");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Shop']")).click();
		Thread.sleep(3000);
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

		Thread.sleep(3000);
		driver.close();
	}

}
