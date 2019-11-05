package myDers;

	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;
	public class BeforeAfter extends MyTestBase {
		
		@Test
		public void loginTest() {

			driver.findElement(By.xpath("//a[@title='My account']")).click();
			driver.findElement(By.name("username")).sendKeys("testuser1");
			driver.findElement(By.id("password")).sendKeys("SeleniumTestAccount1");
			driver.findElement(By.cssSelector("input[value=forever]")).click();
			driver.findElement(By.name("login")).click();

			String usernameText = driver.findElement(By.xpath("//*[@id='post-17']/div/div/div/p[1]/strong[1]")).getText();
			System.out.println(usernameText);

			if (usernameText.equalsIgnoreCase("testuser1")) {
				System.out.println("Test is Succeessful");
			} else {
				System.out.println("Test is Not Succeessful");
			}

		}

		@Test
		public void dropdownBox() throws InterruptedException {

			driver.findElement(By.xpath("//a[@title='Shop']")).click();
			Select sortOrder = new Select(driver.findElement(By.name("orderby")));
			System.out.println("Default Selected Option is : " + sortOrder.getFirstSelectedOption().getText());

			sortOrder.selectByVisibleText("Sort by popularity");
			sortOrder = new Select(driver.findElement(By.name("orderby")));
			System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());

			sortOrder.selectByVisibleText("Sort by average rating");
			sortOrder = new Select(driver.findElement(By.name("orderby")));

			System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());

			sortOrder.selectByValue("date");
			sortOrder = new Select(driver.findElement(By.name("orderby")));
			System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());

			sortOrder.selectByVisibleText("Sort by price: low to high");
			sortOrder = new Select(driver.findElement(By.name("orderby")));
			System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());
			sortOrder.selectByVisibleText("Sort by price: high to low");
			sortOrder = new Select(driver.findElement(By.name("orderby")));
			System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());

			List<WebElement> options = sortOrder.getOptions();

			System.out.println("Total Option Count : " + options.size());
			System.out.println("Options List Total : " + options.size() + "..:");

			int i = 1;
			for (WebElement option : options) {
				System.out.println(" Option " + i + " of " + options.size() + " : " + option.getText());
				i++;
			}

		}
		
	}

	
	
	
	
	
	
	

