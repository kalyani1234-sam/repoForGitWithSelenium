package shoes;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shoes1 {

	@Test(retryAnalyzer = com.crm.listenersImplimentation.ListenersRetryINTerface.class)
	public void adidas() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.adidas.co.in/");
		assertEquals("kalyani", "kaly");
		driver.close();
	}
}
