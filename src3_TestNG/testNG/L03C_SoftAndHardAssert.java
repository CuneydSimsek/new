package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class L03C_SoftAndHardAssert {

		@Test

		public void softAssertion() {

		SoftAssert softAssertion = new SoftAssert();
		
			
		System.out.println("SoftAssert Method has started");

		// 1) SoftAssert: Soft Assert collects errors during @Test. Soft Assert does not throw an exception 
		
		softAssertion.assertTrue(true);
		
		
		//Assert.assertTrue(false);

				
		System.out.println("SoftAssert Method has failed but passed assertion now"); 
		
		}
	
	

		// 2) Hard Assert: Hard Assert throws an AssertException immediately when an assert statement fails
	
		@Test
		public void hardAssertion() {

		System.out.println("HardAssert Method has started");
		
		Assert.assertTrue(false);
		
		System.out.println("HardAssert Method has failed");

	}

		// 3) Soft Assert 
		
		@Test
		public void softAssertion2() {

		SoftAssert softAssertion2 = new SoftAssert();
		
		System.out.println("SoftAssert Method2 has started");

		softAssertion2.assertTrue(false);

		System.out.println("SoftAssert Method2 has failed but we passed Assertion Line");

		softAssertion2.assertAll();
		
		System.out.println("Bu bir Hard Assert Ornegidir");
		
		//System.out.println("SoftAssert Method2 has failed");

	}

}
