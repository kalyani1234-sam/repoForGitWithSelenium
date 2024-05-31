package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import testNgBasic.BaseClass;

public class AssertEqualMethod  extends BaseClass{

	@Test
	public void hardAssert()
	{
		String expectedUrl = "https://demowebshop.tricentis.co";
		String actualUrl = driver.getCurrentUrl();
		//assertEquals(actualUrl, expectedUrl);
		//assertNotEquals(actualUrl, expectedUrl);
		boolean result = expectedUrl.equals(actualUrl);
		//assertTrue(result);
		
		assertFalse(result);
		
		String a = null;
		String b = "kalyani";
		
		assertNull(b);
		assertNotNull(b);
		
		
		
		driver.findElement(By.id("small-searchterms")).sendKeys("satya",Keys.ENTER);
	}
}
