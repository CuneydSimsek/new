package testNG;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class L03B_LoginTest extends L01D_TestBase {


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

		//Verify Login 
		if (usernameText.equalsIgnoreCase("testuser1")) {
			System.out.println("Test is Succeessful");
		} else {
			System.out.println("Test is Not Succeessful");
		}
		//Assert Login 
		Assert.assertTrue(usernameText.equalsIgnoreCase("testuser1"));
	
	}

	

}
