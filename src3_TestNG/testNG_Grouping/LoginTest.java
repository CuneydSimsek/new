package testNG_Grouping;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


	@Test(dataProvider="login", groups = {"sanity", "regression"}, priority=3) // loginTest bu iki grubun icinde
	
	
	public void loginTest(String username, String password) throws InterruptedException {

		System.out.println("Now in login TEST....");
		
		/*System.out.println("Now in Before Method....");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cuneyt\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://test1.itcareercenter.us");
		System.out.println("Home Page Title is :"+driver.getTitle());*/
		
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='My account']")).click();
		Thread.sleep(3000);
		System.out.println("My Account Page Title is :"+driver.getTitle());
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
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
		//Move DataProvider to TestBase
	
	}


