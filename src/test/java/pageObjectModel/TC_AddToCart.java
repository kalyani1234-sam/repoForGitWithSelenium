package pageObjectModel;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pomForDWS.DwsAddToCartPage;

public class TC_AddToCart {

	@Test
	public void addcart() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions action = new Actions(driver);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		DwsAddToCartPage ac = new DwsAddToCartPage(driver);
		Thread.sleep(2000);
		WebElement digiDowload = ac.getDigitaldw();
		Thread.sleep(5000);
		action.moveToElement(digiDowload).click().perform();
		
		List<WebElement> listOfProducts = ac.getProducts();
		
		for (WebElement list : listOfProducts) {
			list.click();
		}
		Thread.sleep(2000);
	}
}
