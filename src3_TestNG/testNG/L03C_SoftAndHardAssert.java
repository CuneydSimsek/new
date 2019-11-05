package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class L03C_SoftAndHardAssert {
	
	@Test
	
	public void softAssertion()
	{
		
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("SoftAssert Method has started");
		
		softAssertion.assertTrue(false);
		//Assert.assertTrue(false);
		
		System.out.println("SoftAssert Method has failed but passed assertion now");
		
	}
	

	@Test
	public void hardAssertion()
	{
		
		System.out.println("HardAssert Method has started");
		Assert.assertTrue(true);
		System.out.println("HardAssert Method has failed");
		
	}
	
	@Test
	public void softAssertion2()
	{
		
		SoftAssert softAssertion2 = new SoftAssert();
		System.out.println("SoftAssert Method2 has started");
		
		softAssertion2.assertTrue(false);
		
		System.out.println("SoftAssert Method2 has failed but we passed Assertion Line");
		
		softAssertion2.assertAll();
		
	}
	
	
	/*
	 * There are two types of Assert:

Hard Assert
Soft Assert
When an assert fails the test script stops execution unless handled in some form. We call general assert as Hard Assert

  Hard Assert – Hard Assert throws an AssertException immediately when an assert statement fails and test suite continues 
  with next @Test

  The disadvantage of Hard Assert – It marks method as fail if assert condition gets failed and the remaining statements 
  inside the method will be aborted.

  To overcome this we need to use Soft Assert. Let’s see what is Soft Assert.

  Soft Assert – Soft Assert collects errors during @Test. Soft Assert does not throw an exception when an assert fails and would 
  continue with the next step after the assert statement.

  If there is any exception and you want to throw it then you need to use assertAll() method as a last statement in the @Test and
  test suite again continue with next @Test as it is.

  We need to create an object to use Soft Assert which is not needed in Hard Assert.
	 */
	
}
