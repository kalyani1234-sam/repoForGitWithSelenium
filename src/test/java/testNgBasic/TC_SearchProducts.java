package testNgBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC_SearchProducts extends BaseClass {

	@Test
	public void SearchProduct() {
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("perfumes",Keys.ENTER);
		
	}
}
