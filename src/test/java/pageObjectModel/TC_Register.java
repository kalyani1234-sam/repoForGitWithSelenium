package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomForDWS.DwsRegisterPage;

public class TC_Register {

	@Test
	public void registerUser() {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		DwsRegisterPage rp = new DwsRegisterPage(driver);
		rp.register();
		rp.radioclick();
		rp.getFirstName("kalyani");
		rp.getLastName("D");
		rp.getEmail("kalyani01@gmail.com");
		rp.getpass("admin01");
		rp.getConPass("admin01");
		rp.clickRegiButton();
	}
}
