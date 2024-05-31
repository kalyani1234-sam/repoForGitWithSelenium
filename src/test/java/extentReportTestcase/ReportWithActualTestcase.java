package extentReportTestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.crm.listenersImplimentation.GenerateExtentReport.class)

//connection with listener implimentation 
public class ReportWithActualTestcase {
	
	@Test
	public void login() {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();

		driver.findElement(By.id("Email")).sendKeys("Admin01@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("admin01");

		driver.findElement(By.xpath("//input[@value='Log inn']")).click();
		
	 driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
		
		

	}
	
	@Test(dependsOnMethods = "login")
	public void redbus() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.redbus.in/");
		
		
	}
	
	@Test
	public void kalki() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.kalki.in/");
		
		
	}

}
