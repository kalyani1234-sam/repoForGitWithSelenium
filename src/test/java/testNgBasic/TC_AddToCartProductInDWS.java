package testNgBasic;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_AddToCartProductInDWS extends BaseClass {

	@Test
	public void AddtoCart() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@href='/digital-downloads'])[1]")).click();
		
		List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		for (WebElement web : products) {
			web.click();
		}
		Thread.sleep(3000);
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
