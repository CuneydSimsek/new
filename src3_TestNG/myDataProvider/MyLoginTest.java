package myDataProvider;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class MyLoginTest extends TestBase {


	@Test(dataProvider = "myLogin")
	
	public void loginTest(String ali, String veli) {

		System.out.println("Now in login TEST....");
	    
		driver.findElement(By.xpath("//a[@title='My account']")).click();
		
		System.out.println("My Account Page Title is :"+driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys(ali);
		driver.findElement(By.id("password")).sendKeys(veli);
		
		
		
		
		
		driver.findElement(By.cssSelector("input[value=forever]")).click();
		
		driver.findElement(By.name("login")).click();

		String usernameText = driver.findElement(By.xpath("//*[@id='post-17']/div/div/div/p[1]/strong[1]")).getText();
		System.out.println(usernameText);

		if (usernameText.equalsIgnoreCase(ali)) {
			System.out.println("Test is Succeessful");
		} else {
			System.out.println("Test is Not Succeessful");
		}

		}

	
	/*
	 * @DataProvider public Object[][] myLogin() { return new Object[][] { new
	 * Object[] { "testuser1", "SeleniumTestAccount1" }, new Object[] { "testuser2",
	 * "SeleniumTestAccount1" }, new Object[] { "testuser3", "SeleniumTestAccount1"
	 * },
	 * 
	 * }; }
	 */
}
