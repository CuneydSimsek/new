package myDers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JUnitDemo {

	@Test
	
	public void atarik() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cuneyt\\Downloads\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://test1.itcareercenter.us");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title='My account']")).click();

		driver.findElement(By.cssSelector("input[id=username]")).sendKeys("testuser1");

		driver.findElement(By.id("password")).sendKeys("SeleniumTestAccount1");

		driver.findElement(By.cssSelector("input[value=forever]")).click();

		driver.findElement(By.name("login")).click();

		String userText = driver.findElement(By.xpath("//*[@id='post-17']/div/div/div/p[1]/strong[1]")).getText();

		System.out.println(userText);

		if (userText.equalsIgnoreCase("testuser1")) {

			System.out.println("Test is Succeessful");
		}

		driver.close();

	}

	@Test
	public void bshop() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cuneyt\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://test1.itcareercenter.us/index.php/shop/");

		Select sortOrder = new Select(driver.findElement(By.name("orderby")));

		System.out.println("Default Selected Option is : " + sortOrder.getFirstSelectedOption().getText());

		sortOrder.selectByVisibleText("Sort by average rating");
		sortOrder = new Select(driver.findElement(By.name("orderby")));

		System.out.println("The visible text is : " + sortOrder.getFirstSelectedOption().getText());

		List<WebElement> options = sortOrder.getOptions();

		System.out.println("Total Option Count : " + options.size());
		System.out.println("Options List Total : " + options.size() + "..:");

		int i = 1;
		for (WebElement option : options) {
			System.out.println(" Option " + i + " of " + options.size() + " : " + option.getText()); // Option 1 of 6; 2
																										// of 6 diye
																										// gidecek

			i++;
		}

		System.out.println("Test completed");

		driver.close();
	}

	@Test
	public  void clink() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cuneyt\\Downloads\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://test1.itcareercenter.us/index.php/shop/"); 
	    
	    System.out.println("=======Iphone=======");
	    
	    System.out.println("Link Text: " + driver.findElement(By.partialLinkText("Iphone Phone")).getText() );
	   
	    
	    System.out.println("Link URL: " + driver.findElement(By.partialLinkText("Iphone Phone")).getAttribute("href") );
	   
	    
	    driver.findElement(By.partialLinkText("Iphone Phone")).click();
	    System.out.println("Clicked to Link");
	    
	    System.out.println("=======Samsung=======");
	    
	    
	    driver.navigate().back();
	   
	    System.out.println("Link Text: " + driver.findElement(By.partialLinkText("Samsung Phone")).getText() );
	    
	    System.out.println("Link URL: " + driver.findElement(By.partialLinkText("Samsung Phone")).getAttribute("href") );
	       
	    driver.findElement(By.partialLinkText("Samsung Phone")).click();
	    System.out.println("Clicked to Link");
	    
	    driver.close();

	}
	
}
