package testNG_Grouping;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ShopTest extends TestBase {

	@Test(dataProvider = "shop", groups = {"smoke", "regression"}, priority=4)
	
	
	public void dropdownBox(String selOpt) throws InterruptedException {
		
		System.out.println("Now in Shop TEST....");

		driver.findElement(By.xpath("//a[@title='Shop']")).click();
		Thread.sleep(3000);
		System.out.println("Shop Page Title is :" + driver.getTitle());

		Select sortOrder = new Select(driver.findElement(By.name("orderby")));
		System.out.println("Default Selected Option is : " + sortOrder.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		sortOrder.selectByVisibleText(selOpt);
		sortOrder = new Select(driver.findElement(By.name("orderby")));
		System.out.println("Current Selected Option is : " + sortOrder.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		
	}

	//Move DataProvider to TestBase

}
