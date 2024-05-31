package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomForDWS.DwsLoginPage;

public class TC_dwsLogin {

	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.navigate().to("https://demowebshop.tricentis.com/login");
		// normal way to write script
		DwsLoginPage dws = new DwsLoginPage(driver);
//		dws.username.sendKeys("Admin01@gmail.com");
//		Thread.sleep(2000);
//		dws.pass.sendKeys("admin01");
//		Thread.sleep(2000);
//		dws.loginButton.click();
//		
		// we can reassign the value for variable but its not good practice
//		dws.username= driver.findElement(By.id("Email"));
//		dws.username.sendKeys("Admin.01@gmail.com");

		// to overcome above problem after making variables private we are writing
		// script as follows
		dws.Username("Admin01@gmail.com");
		Thread.sleep(2000);
		dws.Pass("admin01");
		Thread.sleep(2000);
		dws.LoginButton();

		Thread.sleep(2000);
		driver.close();
	}
}
