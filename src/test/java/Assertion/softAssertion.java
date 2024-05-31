package Assertion;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testNgBasic.BaseClass;

public class softAssertion extends BaseClass {

	@Test
	public void sf() {
		String expectedUrl = "https://demowebshop.tricentis.co";
		String actualUrl = driver.getCurrentUrl();
		
		SoftAssert ass = new SoftAssert();
		ass.assertEquals(actualUrl, expectedUrl);
		ass.assertNotEquals(actualUrl, expectedUrl);
		boolean result = expectedUrl.equals(actualUrl);
		ass.assertTrue(result);
		
		assertFalse(result);
		
		String a = null;
		String b = "kalyani";
		
		ass.assertNull(b);
		ass.assertNotNull(b);
		
		
		
		driver.findElement(By.id("small-searchterms")).sendKeys("satya",Keys.ENTER);
		ass.assertAll();
	}
}
