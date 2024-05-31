package testNgBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_GiftCard_form extends BaseClass {

	@Test(retryAnalyzer = com.crm.listenersImplimentation.ListenersRetryINTerface.class)
	public void fillForm() {
		
		driver.findElement(By.xpath("//a[@href='/gift-card']")).click();
		
		List<WebElement> cards = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		for (WebElement giftCatds : cards) {
			giftCatds.click();
		}
	}
}
