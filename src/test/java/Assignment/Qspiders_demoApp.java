package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Qspiders_demoApp {

	@Test
	public void qspDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/formValidation");
		
		driver.findElement(By.xpath("//input[@class='requiredfield shadow-sm bg-gray-50 border border-gray-400 text-gray-900 text-sm rounded  block w-full p-2.5 focus:outline-blue-500']")).sendKeys("kayani");
		driver.findElement(By.xpath("//input[@placeholder='Min 6 chars.']")).sendKeys("6");
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Kalyani@123");
		driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("6");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Kalyani@123");
		driver.findElement(By.xpath("//input[@name='rangeLength']")).sendKeys("10");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("k@gmail.com");
		driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='url']")).sendKeys("www.qspiders.demoapp.com");
		
		driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@placeholder='Enter only digits']")).sendKeys("958246");
		driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("10");
		driver.findElement(By.xpath("//input[@placeholder='Enter only numbers']")).sendKeys("65468");
		driver.findElement(By.xpath("//input[@placeholder='Enter alphanumeric value']")).sendKeys("kalyabhs65456");
		
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).submit();
	
	}
}
