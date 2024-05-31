package extentReportTestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonUtils.BaseClass;

@Listeners(com.crm.listenersImplimentation.TakingScreenshotInExtentReport.class)
public class TakingScreenshotInExtentReport extends BaseClass {
	
	@Test(dependsOnMethods = "SearchProduct")
	public void AddtoCart() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@href='/digital-downloads'])[1]")).click();
		
		List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		for (WebElement web : products) {
			web.click();
		}
		Thread.sleep(3000);
		//driver.close();
	}
	
	@Test
	
	public void fillForm() {
		
		driver.findElement(By.xpath("//a[@href='/gift-cards']")).click();
		
		List<WebElement> cards = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		for (WebElement giftCatds : cards) {
			giftCatds.click();
		}
	}
	
	@Test
	public void SearchProduct() {
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("perfumes",Keys.ENTER);
		
	}
	

}
