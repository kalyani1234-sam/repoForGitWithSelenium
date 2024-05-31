package listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.listenersImplimentation.ForDWsLogin.class)
public class TcDwsLogin1 {

	@Test
	public void login() {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();

		driver.findElement(By.id("Email")).sendKeys("Admin01@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("admin01");

		driver.findElement(By.xpath("//input[@value='Lognn in']")).click();

	}
	
	@Test
	public void redbus() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.redbus.in/");
		
	}
	
	@Test(dependsOnMethods = "login")
	public void kalki() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.kalki.in/");
		
	}
	
	
}