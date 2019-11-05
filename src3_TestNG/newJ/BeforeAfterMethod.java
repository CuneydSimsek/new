package newJ;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class BeforeAfterMethod extends TestBase {

	
	@Test(priority = 2)
	public void mySearch() {

		driver.findElement(By.name("s")).sendKeys("webtable");
		driver.findElement(By.id("searchsubmit")).click();
		driver.findElement(By.linkText("READ MORE")).click();
		driver.findElement(By.name("s")).sendKeys("webtable");
		driver.findElement(By.className("header-search-icon")).click(); 
		driver.findElement(By.linkText("READ MORE")).click();
		System.out.println("Test Completed");

	}

	@Test(priority = 1)

	public void myLogin() {

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

	}

	
	

	
	
	
}
