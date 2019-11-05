package myDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyShopTest extends TestBase {


	@Test(dataProvider = "myShop")
	
	public void dropdownBox(String alisveris) {
		
		System.out.println("Now in Now in Shop TEST....");
		driver.findElement(By.xpath("//a[@title='Shop']")).click();
		
		System.out.println("Shop Page Title is :"+driver.getTitle());
		
		Select sortOrder = new Select(driver.findElement(By.name("orderby")));
		
		System.out.println("Default Selected Option is : " + sortOrder.getFirstSelectedOption().getText());
		

		sortOrder.selectByVisibleText(alisveris);
		
		
		
	}
	
		
	/*
	 * @DataProvider public Object[][] myShop () { return new Object[][] {
	 * 
	 * new Object[] { "Sort by popularity"}, new Object[] {
	 * "Sort by average rating"}, new Object[] { "Sort by price: low to high"}, new
	 * Object[] { "Sort by price: high to low"},
	 * 
	 * }; }
	 */
	}
	

